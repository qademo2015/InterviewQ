package Google;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/*
 * Created by abarabash on 4/26/16.

public class Solution {

/*
   <!-- page1.html -->

    <html>
    <a href="page2.html">Next Page</a>
    </html>

    <!-- page2.html -->
    <html>
    <a href="page3.html">Next Page</a>
    </html>

    <!-- page3.html -->
    <html>
    </html>



        plan:
        page1 -> page2
        assume that page is graph’s node
        traverse through the graph using BFS.
        check for loops



    public static List<URL> getPageLinks(URL url)  {

        URL url1 = null;

        try {
            url1 = new URL("https://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        List<URL> result = new ArrayList<>(url1);

        return result;

    }

//    getPageLinks(“page1.html”) == [“page2.html”];
//    getPageLinks(“page3.html”) == [];
//    getPageLinks(“page4.html”) // Exception

    getSitePageCount(“page1.html”) == 3
    getSitePageCount(“page3.html”) == 1

   public static int getSitePageCount(URL url) {

        Map<URL, Integer> result = new HashMap<>();
        result.put(url, 1);

        QueueOfLinks queueOfLinks = new QueueOfLinks();


        URL root = url;

        queueOfLinks.enqueue(root);


        while(queueOfLinks.first != null){
            URL c = (URL) queueOfLinks.dequeue();

            try{
                Collection<URL> links = getPageLink(c);

                for(URL each: getPageLink(c)){
                    if(!result.contains(each)){
                        result.add(each);
                        queueOfLinks.enqueue(each);
                    }
                }

            } catch(URLException e){
                e.printstack();
            }



        }
    }

    return result.size();
}

*/