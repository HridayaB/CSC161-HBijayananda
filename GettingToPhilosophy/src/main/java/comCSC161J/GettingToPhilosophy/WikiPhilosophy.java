package comCSC161J.GettingToPhilosophy;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
    	boolean linkFound = false;
    	String link = null;
//    	Deque < String > parenStack = new ArrayDeque < String > ( );
    
		Connection conn = Jsoup.connect ( url ); // download and parse the document
		Document doc = conn.get ( );
		Element content = doc.getElementById("mw-content-text"); // select the content text and pull out the paragraphs.
		Elements paras = content.select ( "p" );
		
		//Elements paragraphs = wf.fetchWikipedia ( url );
		 		
		for ( Element para : paras )
		{
			int openParen = 0;
			
			WikiNodeIterable iter = new WikiNodeIterable ( para );
			for (  Node node : iter )
			{
				if ( node instanceof TextNode)
    			{
					String text = node.toString ( );
					int i = 0; // first index
					int j = 0; // second index
					while ( i != -1 )
					{
						i = text.indexOf ( "(", j );
						if ( i != -1 )
						{
							openParen++;
						}
						j = i + 1;
					}
					i = 0;
					j = 0;
					while ( i != -1 )
					{
						i = text.indexOf ( ")", j );
						if ( i != -1 )
						{
							openParen--;
						}
						j = i + 1;
					}
//    				StringTokenizer st = new StringTokenizer ( ( ( TextNode ) node ).text ( ), "( )" );
//    				while ( st.hasMoreTokens ( ) )
//    				{
//    					String tkn = st.nextToken ( );
//    					if ( tkn.equals ( "(" ) )
//    					{
//    						parenStack.push ( tkn );
//    					} // end of if statement
//    					else if ( tkn.equals ( ")" ) )
//    					{
//    						parenStack.pop ( );
//    					} // end of else if statement
//    				} // end of while loop
    			} // end of if statement
				
				link = node.attr ( "href" );
				if ( link != null && !link.isEmpty ( ) && ( link.charAt ( 0 ) != '#' && openParen == 0 ) )
    			{
    				System.out.println ( "https://en.wikipedia.org" + link );
    				link = "https://en.wikipedia.org" + link;
    				linkFound = true;
    				break;
    			} // end of if statement
			} // end of enhanced for loop
			if ( linkFound )
			{
				break;
			} // end of if statement
		} // end of enhanced for loop
		
		if ( url.equals ( destination ) ) 
		{
			System.out.println ( );
			System.out.println ( "Success! ^◡^" );
			return;
		} // end of if statement
		
		testConjecture ( destination, link, --limit );			
    } // end of testConjecture
    
}