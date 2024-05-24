package co.edu.uptc.facturas;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        
            // Configuración de Spark
            port(4567); // Puerto en el que se ejecutará la aplicación
            
            // Conexión con el controlador de facturas
            FacturaController facturaController = new FacturaController();
    
            // Rutas para manejar las operaciones de facturación electrónica
            post("/facturas", facturaController::crearFactura);
            get("/facturas/:id", facturaController::obtenerFacturaPorId);
            put("/facturas/:id", facturaController::actualizarFactura);
            delete("/facturas/:id", facturaController::eliminarFactura);
    
            // Espera hasta que la aplicación esté completamente inicializada
            awaitInitialization();
    
            // Tareas de limpieza al detener la aplicación
            Runtime.getRuntime().addShutdownHook(new Thread(Spark::stop));
        }
}





