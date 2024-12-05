package controller;

import person.person;
import vista.vista;
public class Controller {
    private vista view;
    private SortingMethods sortingMethods;
    private SearthMethods searthMethods;
    
    private person[] personas;
    
    public Controller(vista view, 
            SortingMethods sortingMethods, SearthMethods searthMethods){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searthMethods = searthMethods;
        System.out.println("Controller created");
    }
    
    public void start(){
        int option = 0;
        do{
            option = view.shotMenu();
            switch(option){
                case 1:
                    imputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    seartPersons();
                    break;
                case 100:
                    System.out.println("Adios");
                    break;
                    default:
                        System.out.println("Opcion no valida");
            }
        }while(option != 0);  
    }
    
    public void imputPersons(){
        int numeroPersonas = view.inputInt("Ingrese el numero de personas: ");
        personas = new person[numeroPersonas];
        for(int i=0; i < numeroPersonas; i++)
            personas[i] = view.imputPerson();
    }
    
    public void addPerson(){
        
        if(personas == null){
            view.inputMessage("No existe, ingrese las personas por primera ves");
            imputPersons();
        }else{
        int numeroPersonas = view.inputInt("Ingrese el numero de personas "
                + "a adicionar: ");
        
        person[] personasTotales = new person[personas.length+ numeroPersonas];
        
        for(int i=0; i< personas.length; i++){
            personasTotales[i] = personas[i];
        }
        for(int i = personas.length; i<personasTotales.length; i++){
            personasTotales[i] = view.imputPerson();
        }
        
        personas = personasTotales;
        }
    }

    private void sortPersons() {
        int sortingOption = view.selectSortingMethod();
        if(sortingOption == 1){
            sortingMethods.sortByNameWithBuble(personas);
        }else if(sortingOption == 2){
            sortingMethods.sortByAgeWithSelection(personas);
        }else{
            view.inputMessage("Opcion no valida");
        }
    }

    private void seartPersons() {
       
    }
}
