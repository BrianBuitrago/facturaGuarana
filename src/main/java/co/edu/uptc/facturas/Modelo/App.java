package co.edu.uptc.facturas.Modelo;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	get("/hello", (req, res) -> "Hola Mundo cruel ;)");

    }
}
