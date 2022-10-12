package model;

public abstract class User{
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        }else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
    //puede automaticamente traerme id de ayuda para sobrecribir el metodo de neustras clases
    // que este metodo quiere decir no es de la clase user, meotod estradico de la superclase padre
    @Override // sobrescritura de metodo
    public String toString() {
        return " model.User: " + name + ", Email: " + email +
                "\nAddrees: " + address + ". Phone " + phoneNumber;
    }

    //metodo abstracto

    public  abstract void showDataUser();

}
