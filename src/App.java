import controller.Controller;
import controller.SearthMethods;
import controller.SortingMethods;
import vista.vista;

public class App {
    public static void main(String[] args) throws Exception {
       // Instanciamos la vista
        vista vista = new vista();
        
        // Instanciamos los metodos 
        SearthMethods searthMethods = new SearthMethods();
        SortingMethods sortingMethods = new SortingMethods();
        
        // Instamciamos el controlador
        Controller controller = new Controller(vista, sortingMethods, searthMethods);
        controller.start();
    }
}
