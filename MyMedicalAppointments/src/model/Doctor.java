package model;

import java.util.ArrayList;
import java.util.Date;
//aplicamos henrencia extends
public class Doctor extends User {
    //atributos
    //int id; // autoincrementado
    /*static int id = 0;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;*/
    private String speciality;
    //available appointment
    /*private int id availableAppointment;
    private Date date;
    private String time;
    */
    /*
    model.Doctor(){
        System.out.println("construyendo el objeto doctor");
    }*/
    public Doctor(String name, String email){
        super(name, email);
        //id++;
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        //this se refiere a todos los elementos de esa clase
        //this.name = name;
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //comportamientos
    //metodo
    /*public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID model.Doctor: " + id);
    }*/

    //colecciones
    // añade citas
    ArrayList<AvailableAppointment>availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        //super.toString se peude reutilizar suepr clase padre definida en user
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println(" empleado del hospital: crus roja");
        System.out.println("departamento: Cancerologia");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }

}
