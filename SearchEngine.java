import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;


class Handler implements URLHandler {
    public String handleRequest(URI url) {
        ArrayList<String> search = new ArrayList<String>();

        if (url.getPath().equals("/")) {
            return String.format("String list" + search);
        } else if (url.getPath().equals("/search")) {
            url.getQuery();
            return String.format(url.getQuery());
            /*for(int i = 0; i < search.size();){
                return String.format("The list is: ", search.get(i));
            }*/
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("count")) {
                    
                    return String.format("Number increased by %s! It's now %d", parameters[1], num);)
            }
            return "404 Not Found!";}
    }
}


   
