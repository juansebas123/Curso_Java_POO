import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //atributos
    //int id; // autoincrementado
    static int id = 0;
    private String name;
    private String email;
    private String speciality;
    //available appointment
    private int id avaiableAppointment;
    private Date date;
    private String time;
    //

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

    //colecciones
    ArrayList<AvailableAppointment>availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));

    }

    public static  class  AvailableAppointment{
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
    }

}
