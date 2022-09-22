import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //objeto
        Doctor myDoctor = new Doctor("Jaun Ricaurte", "pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Sebastian Ricaurte";
        myDoctor.showName();
        myDoctor.showId();

        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();
        //metodo
        */
        //showMenu();
    }

}
