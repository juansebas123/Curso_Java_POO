import javax.print.Doc;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //objeto
        Doctor myDoctor = new Doctor("Juan Ricaurte", "jua@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 pm");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        System.out.println(myDoctor);
        /*
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.availableAppointments) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);
        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Sebastian Ricaurte";
        myDoctor.showName();
        myDoctor.showId();

        Doctor MyDoctorAnn = new Doctor();
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
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
        /*Patient patient2 = new Patient("Anni", "Annia@mail.com");
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
