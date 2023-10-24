
package co.edu.escuelaing.sparkdockerdemolive;


import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;


    
public class Parcial2AREP {
    
    public static void main(String... args){
        staticFiles.location("/webapp");
        port(getPort());
        
        get("/collatzsequence","application/json", (req,res) -> {
            String data = req.queryParams("value");
            res.type("application/json");
            return Collatz1.connection(data);
        });
        
        get("/collatzsequence","application/json", (req,res) -> {
            String data = req.queryParams("value");
            res.type("application/json");
            return Parcial2AREP.Collatz1(data);
        });
        
    }
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}




