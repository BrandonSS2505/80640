package mx.uv.80640;

import java.util.Map;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static Gson gson = new Gson();
    //base de datos en memoria
    public static map<String, Usuario> usuarios = new HashMap<>();
    public static void main( String[] args ){
        port(80);
        System.out.println( "Hello World!" );
        get("/", (req, res)-> "hola mundo");
    }
}
