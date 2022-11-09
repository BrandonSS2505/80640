package mx.uv.c80640;
import static spark.spark.*;
import com.google.gson.Gson;
import java.util.Map;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 *
 */
public class App{
    public static Gson gson = new Gson();
    //base de datos en memoria
    public static Map <String, Ususario> usuario = new HashMap<>();

    public static void main( String[] args ){
        port(80);
        Usuario u1 = new Usuario("1", "pablo", "1234");
        Usuario u2 = new Usuario("2", "ana", "1234");
        usuarios.put(u1.getId(), u1);
        usuarios.put(u2.getId(), u2);

        System.out.println( "Hello World!" );
        before((req,res)-> res.type("aplication/json"));
        get("/usuario", (req, res)-> gson.toJson(u1));
        get("/usuario", (req, res)-> gson.toJson(usuarios));

        post("/", (req, res)-> {
            String datosFormulario = req.body();
            Usuario u = gson.fromJson(datosFormulario, classOfT: Usuario.class);
            usuario.put(u.getId, u);
            return null;
        });
    }
}
