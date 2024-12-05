package vista;
import person.person;
import java.util.Scanner;

public class vista {
    private Scanner scanner;

    public vista() {
        scanner =new Scanner(System.in);
    }
    
    public int shotMenu(){
        System.out.println("*******Menu*******");
        System.out.println("1. Ingresar Persona");
        System.out.println("2. Ingresar personas Adicionales");
        System.out.println("3. Ordenar la lista de Personas");
        System.out.println("4. Buscar una Persona");
        System.out.println("100. Salir");
        System.out.print("Ingrese una opcion : ");
        return scanner.nextInt();
    }
    
    public int inputInt(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public person imputPerson(){
        String name = inputName();
        int ege = inputAge();
        return new person(name, ege);
    }
    
    public String inputName(){
        System.out.print("Ingrese el nombre:");
        return scanner.next();
    }
    
    public int inputAge(){
        return inputInt("Ingrese la edad: ");
    }
    public void inputMessage(String mensaje){
        System.out.println(mensaje);
    }
    
    public int selectSortingMethod(){
        System.out.println("****** Ingrese la condicion a ordenar *******");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.println("Ingrese una obcion: ");
        return scanner.nextInt();
    }
}
