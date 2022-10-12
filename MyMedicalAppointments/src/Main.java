import model.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //objeto
        Doctor myDoctor = new Doctor("Juan Ricaurte", "jua@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 pm");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        System.out.println(myDoctor);

        //polimorfismo
        User user = new Doctor("juan", "sebas@gmail.com");
        user.showDataUser();

        User userPa = new Patient("juan", "sebas@gmail.com");
        userPa.showDataUser();

        User user1 = new User("caro", "caro@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("doctor\n");
                System.out.println("hospital:crus verde");
                System.out.println("departamento: geriatría");
            }
        };

        //llamalo

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schdule(Date date, String time) {

            }
        };


        /*
        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.availableAppointments) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);
        /*
        model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Sebastian Ricaurte";
        myDoctor.showName();
        myDoctor.showId();

        model.Doctor MyDoctorAnn = new model.Doctor();
        myDoctor.showId();
        //metodo
        */
        /*showMenu();
        variable vs objeto: un vistazo ala memoria
        int i = 0;
        int b = 2;
        b = i;
        b=0
        String name = "ann";*/
        /*
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
        */
        /*model.Patient patient2 = new model.Patient("Anni", "Annia@mail.com");
        System.out.println();
        System.out.println(patient); // imprime la localidades de memoria
        System.out.println(patient2);
        System.out.println(patient.getName()); //
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName()); //
        System.out.println(patient2.getName());
        //altere el valor ambos seran alterados
        System.out.println();
        patient2.setName("manuel");
        System.out.println(patient.getName()); //
        System.out.println(patient2.getName());*/

        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());*/

    }

}
