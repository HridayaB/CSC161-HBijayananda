package comCSC161J.GettingToPhilosophy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
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
    public static void testConjecture(String destination, String source, int limit) throws IOException {
        // TODO: FILL THIS IN!
    	String url = source;
    	for ( int i = 0; i < limit; i++)
    	{
    		if ( visited.contains ( url ) )
    		{
    			return;
    		} // end of if statement
    		else
    		{
    			visited.add ( url );
    		} // end of else statement
    		Element elt = null;
    		
			if ( elt == null ) 
			{
				System.out.println ( "Failure:( No valid links." );
				return;
			} // end if if statement
			
			System.out.println ( "//-" + elt.text ( ) + "-//" );
			url = elt.attr ( "abs:href" );
			
			if ( url.equals ( destination ) ) 
			{
				System.out.println( "Success!" );
				break;
			} // end of if statement
			if ( i > limit )
			{
				System.out.println ( "Exceeded the limit." );
				break;
			}
    	} // end of for loop
    } // end of testConjecture
    
}