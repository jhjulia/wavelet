import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;


class Handler implements URLHandler {
    public String handleRequest(URI url) {
        ArrayList<String> search = new ArrayList<String>();
        String result = null;
        if (url.getPath().equals("/")) {
            return String.format("String list : " + search);
        } else if (url.getPath().equals("/add")) {
            url.getQuery();
            return String.format(url.getQuery());
            /*for(int i = 0; i < search.size();){
                return String.format("The list is: ", search.get(i));
            }*/
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("search")) {
                String[] parameters = url.getQuery().split("=");
                for(int i = 0; i < parameters.length; i++){
                    if(parameters[i] == url.getQuery()){
                        result = parameters[i];
                    }
                }
                }
            }
            return result;
            //return "404 Not Found!";
        }
    }


class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

   
