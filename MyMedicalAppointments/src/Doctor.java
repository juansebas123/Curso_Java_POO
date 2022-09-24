public class Doctor {
    //atributos
    //int id; // autoincrementado
    static int id = 0;
    String name;
    String email;
    String speciality;
    Doctor(){
        System.out.println("construyendo el objeto doctor");

    }
    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del Doctor asignado es: " + name);
        //this se refiere a todos los elementos de esa clase
        this.name = name;
        this.speciality = speciality;
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
