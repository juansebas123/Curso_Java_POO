public class Patient {
    static int id;
    // dicen que es mala practica porque es necesario que cada variable que tenga su modificador y esto puede variar
    //String name, email, addres,phoneNumber, birthday, blood;
    //double weight, height;
    //encapsular para que no los edite nadie, fuera de esta clase nadie lo puede modificar
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;

    private double weight;
    private double height;
    String blood;
    //metodo constructor
    Patient(String name, String email) {
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + "kg.");
        //System.out.println("Nombre: " + name + "Email: " + email);
        //id++;
    }
}
