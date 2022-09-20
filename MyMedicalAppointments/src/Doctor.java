public class Doctor {
    //atributos
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("construyendo el objeto doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    //comportamientos
    //metodo
    public void showName(){
        System.out.println(name);
    }
}
