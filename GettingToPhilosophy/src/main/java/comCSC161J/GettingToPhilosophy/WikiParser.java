package comCSC161J.GettingToPhilosophy;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
	
/**
 * @author Hridaya Bijayananda
 */
 public class WikiParser 
{
	private Elements paragraphs;
	private Deque < String > parenthesisStck;
	
	/**
	 * @param paragraphs
	 */
	public WikiParser ( Elements paragraphs ) 
	{
		this.paragraphs = paragraphs;
		this.parenthesisStck = new ArrayDeque < String > ( );
	}
	
	/**
	 * @param none
	 * @return null
	 */
	public Element firstLink ( ) 
	{
		for ( Element paragraph : paragraphs ) 
		{ 
			Element firstLink = firstLinkParagraph ( paragraph );
			if ( firstLink != null ) 
			{
				return firstLink;
			}
			if ( !parenthesisStck.isEmpty ( ) ) 
			{
				System.out.println ( "Parentheses." ); 
	   	 	}
		}
		return null;
	}

	/**
	 * @param root
	 * @return null
	 */
	private Element firstLinkParagraph ( Node root ) 
	{
		Iterable < Node > nt = new WikiNodeIterable ( root );
		for ( Node node : nt ) 
		{
			if ( node instanceof TextNode ) 
			{
				processingTextNode ( ( TextNode ) node );
			} // end of if statement
			if ( node instanceof Element ) 
			{
		        Element firstLink = processingElement ( ( Element ) node );
		        if ( firstLink != null ) 
		        {
					return firstLink;
				} // end of if statement
			} // end of if statement
		} // end of for loop
		return null;
	}

	/**
	 * @param elmt
	 * @return null
	 */
	private Element processingElement ( Element elmt ) 
	{
		if ( validLink ( elmt ) ) 
		{
			return elmt;
		}
		return null;
	}

	/**
	 * @param elmt
	 * @param s
	 * @return
	 */
	private boolean start ( Element elmt, String s ) 
	{
		return ( elmt.attr ( "href" ).startsWith ( s ) );
	}

	/**
	 * @param Element elmt
	 * @return
	 */
	private boolean parenthesis ( Element elmt ) 
	{
		return !parenthesisStck.isEmpty ( );
	}

	/**
	 * @param Element start
	 * @return false
	 */
	private boolean italic ( Element start ) 
	{
		for ( Element elmt = start; elmt != null; elmt = elmt.parent ( ) ) 
		{
			if ( elmt.tagName ( ).equals ( "i" ) || elmt.tagName ( ).equals ( "em" ) ) 
			{
				return true;
			} // end of if statement
		} // end of for loop
		return false;
	}
	
	/**
	 * @param elmt
	 * @return
	 */
	private boolean validLink ( Element elmt ) 
	{
		if ( !elmt.tagName ( ).equals ( "a" ) ) 
		{
			return false;
		}
		if ( italic ( elmt ) ) 
		{
			return false;
		}
		if ( parenthesis ( elmt ) ) 
		{
			return false;
		}
		if ( start ( elmt, "#" ) ) 
		{
			return false;
		}
		if ( start ( elmt, "/wiki/Help:" ) ) 
		{
			return false;
		}
		return true;
	}

	/**
	 * Processes a text node, splitting it up and checking parentheses.
	 * 
	 * @param node
	 */
	private void processingTextNode ( TextNode node ) 
	{
		StringTokenizer st = new StringTokenizer ( node.text ( ), " ()", true );
		while  ( st.hasMoreTokens ( ) ) 
		{
		     String token = st.nextToken ( );
		     if ( token.equals ( "(" ) ) 
		     {
		    	 parenthesisStck.push ( token );
		     } // end of if statement
		     if ( token.equals ( ")" ) ) 
		     {
		    	 if ( parenthesisStck.isEmpty ( ) ) 
		    	 {
		    		 System.out.println ( "parentheses." ); 
		    	 } // end of if statement
		    	 parenthesisStck.pop ( );
		     } // end of if statement
		} // end of while loop
	}

}
