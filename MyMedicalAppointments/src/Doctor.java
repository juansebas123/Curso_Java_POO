public class Doctor {
    //atributos
    //int id; // autoincrementado
    static int id = 0;
    String name;
    String speciality;
    Doctor(){
        System.out.println("construyendo el objeto doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    //comportamientos
    //metodo
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }


}
