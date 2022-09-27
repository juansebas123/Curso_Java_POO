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
        //System.out.println("Nombre: " + name + "Email: " + email);
        //id++;
    }
    //metodo gettters y setters
    public void setWeight(double weight){
        this.weight = weight;
    }
    //54.5 kg. siempre de vuelve este formato
    public String getWeigth(){
        return this.weight + " kg.";
    }
    //con FN+ALT+INS(IMP PNT)
    public String getHeight() {
        return height + "Mts";
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Patient.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("el numero telefonico debe ser de 8 digitos máximos");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }



    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
