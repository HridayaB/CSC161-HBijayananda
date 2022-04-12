package comCSC161J.GettingToPhilosophy;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiPhilosophy {

    final static List<String> visited = new ArrayList<String>();
    final static WikiFetcher wf = new WikiFetcher();

    /**
     * Tests a conjecture about Wikipedia and Philosophy.
     *
     * https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy
     *
     * 1. Clicking on the first non-parenthesized, non-italicized link
     * 2. Ignoring external links, links to the current page, or red links
     * 3. Stopping when reaching "Philosophy", a page with no links or a page
     *    that does not exist, or when a loop occurs
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String destination = "https://en.wikipedia.org/wiki/Philosophy";
        String source = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        testConjecture(destination, source, 10);
    }

    /**
     * Starts from given URL and follows first link until it finds the destination or exceeds the limit.
     *
     * @param destination
     * @param source
     * @throws IOException
     */
    public static void testConjecture ( String destination, String source, int limit ) throws IOException 
    {
        // TODO: FILL THIS IN!
    	String url = source;
    	Deque < String > parenStack = new ArrayDeque < String > (  );
    	for ( int i = 0; i < limit; i++ )
    	{
    		if ( visited.contains ( url ) )
    		{
    			return;
    		} // end of if statement
    		else
    		{
    			visited.add ( url );
    		} // end of else statement
    		int openParen = 0;
    		Elements paragraphs = wf.fetchWikipedia ( url );
    		 		
    		for ( Element para : paragraphs )
    		{
    			Iterable < Node > iter = new WikiNodeIterable ( para );
    			for (  Node node : iter )
    			{
    				if ( node instanceof TextNode)
	    			{
	    				StringTokenizer st = new StringTokenizer ( ( ( TextNode ) node ).text ( ), "( )" );
	    				while ( st.hasMoreTokens ( ) )
	    				{
	    					String tkn = st.nextToken ( );
	    					if ( tkn.equals ( "(" ) )
	    					{
	    						parenStack.push ( tkn );
	    					}
	    					else if ( tkn.equals ( ")" ) )
	    					{
	    						parenStack.pop ( );
	    					}
	    				}
	    			}
    				String link = node.attr( "href" );
    				if ( link != null && !link.isEmpty ( ) && ( link.charAt ( 0 ) == '#' && openParen == 0 ) )
	    			{
	    				testConjecture ( link, url, 10 );
	    			}
    			}
    				
    			
    		}
			
			if ( url.equals ( destination ) ) 
			{
				System.out.println ( );
				System.out.println ( "Success! ^◡^ " );
				break;
			} // end of if statement
			if ( i > limit )
			{
				System.out.println ( "Exceeded the limit." );
				break;
			}
			System.out.println ( url );
			System.out.println ( String.format ( url, null ) );
    	} // end of for loop
    } // end of testConjecture
    
}