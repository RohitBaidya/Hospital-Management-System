import java.util.Scanner;

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String dname = sc.nextLine();

        System.out.print("Enter Treatment Description: ");
        String desc = sc.nextLine();

        Patient patient = new Patient("P001", pname);
        Doctor doctor = new Doctor("D001", dname);
        Treatment treatment = new Treatment(patient, doctor, desc);

        treatment.start();
    }
}

class Patient {
    String id, name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Doctor {
    String id, name;

    public Doctor(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Treatment {
    Patient patient;
    Doctor doctor;
    String description;

    public Treatment(Patient patient, Doctor doctor, String description) {
        this.patient = patient;
        this.doctor = doctor;
        this.description = description;
    }

    void start() {
        System.out.println("Treatment for " + patient.name + " by " + doctor.name + ": " + description);
    }
}
