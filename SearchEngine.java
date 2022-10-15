import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;


class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
 

    ArrayList<String> search = new ArrayList<String>();

    public String handleRequest2(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("String list");
        } else if (url.getPath().equals("/search")) {
            url.getQuery();
            for(int i = 0; i < search.size();){
                return String.format("The list is: ", search.get(i));
            }
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    return String.format("Added to a list", search.add(parameters[1]));
                }
            }
            return "404 Not Found!";}
        return null;
    }



    @Override
    public String handleRequest(URI url) {
        // TODO Auto-generated method stub
        return null;
    }
    }
