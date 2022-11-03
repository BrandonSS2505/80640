package mx.uv;

import static spark.Spark.*;
import com.google.gson.JsonObject;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/eduardo", (req, res) -> "Hello Eduardo");
        get("/alex", (req, res) -> "Hello Alex");
        get("/brandon", (req, res) -> "Hello Brandon");
        get("/", (req, res) -> "<h1>Bienvenidos</h1><img src='https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg'>");

        post("/", (req, res) ->{
            System.out.println(req.queryParams("email")+" "+ req.queryParams("password"));
            System.out.println(req.body());
            res.status(200);
            JsonObject oRespuesta= new JsonObject();
            oRespuesta.addProperty("msj","hola");
            oRespuesta.addProperty("email", req.queryParams("email"));
            return oRespuesta;
            
        });

        
    }
    
}
