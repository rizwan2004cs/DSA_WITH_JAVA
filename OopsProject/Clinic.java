package OopsProject;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Clinic {

    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int doctorIdCounter = 101;
    private static int patientIdCounter = 1001;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Clinic Appointment System ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("5. View Appointments by Doctor");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    addDoctor();
                case 2 ->
                    registerPatient();
                case 3 ->
                    bookAppointment();
                case 4 ->
                    viewAppointments();
                case 5 ->
                    viewAppointmentsByDoctor();
                case 6 ->
                    System.out.println("Thank you! Exiting...");
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    private static void addDoctor() {
        System.out.print("Enter doctor name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter specialization: ");
        String spec = sc.nextLine();

        Doctor doc = new Doctor(doctorIdCounter++, name, age, spec);
        doctors.add(doc);
        System.out.println("Doctor added successfully!");
    }

    private static void registerPatient() {
        System.out.print("Enter patient name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Patient p = new Patient(patientIdCounter++, name, age);
        patients.add(p);
        System.out.println("Patient registered successfully!");
    }

    private static int getAppointmentCount(int doctorId) {
        return (int) appointments.stream()
                .filter(ap -> ap.getDoctor().getDoctorId() == doctorId)
                .count();
    }

    private static void bookAppointment() {
        if (doctors.isEmpty() || patients.isEmpty()) {
            System.out.println("Doctors or Patients list is empty. Add them first.");
            return;
        }

        System.out.println("\nAvailable Doctors:");
        for (Doctor d : doctors) {
            d.displayInfo();
            int appointmentCount = getAppointmentCount(d.getDoctorId());
            System.out.println("   Current appointments: " + appointmentCount);
        }

        System.out.print("Enter Doctor ID: ");
        int did = sc.nextInt();
        Doctor selectedDoctor = doctors.stream()
                .filter(d -> d.getDoctorId() == did)
                .findFirst()
                .orElse(null);

        if (selectedDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.println("\nRegistered Patients:");
        for (Patient p : patients) {
            p.displayInfo();
        }

        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();
        Patient selectedPatient = patients.stream()
                .filter(p -> p.getPatientId() == pid)
                .findFirst()
                .orElse(null);

        if (selectedPatient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        sc.nextLine();
        String dateStr = sc.nextLine();
        LocalDate date;
        try {
            date = LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
            return;
        }

        boolean exists = appointments.stream().anyMatch(ap
                -> ap.getDoctor().getDoctorId() == did
                && ap.getPatient().getPatientId() == pid
                && ap.getDate().equals(date));

        if (exists) {
            System.out.println("Appointment already exists.");
            return;
        }

        Appointment ap = new Appointment(selectedDoctor, selectedPatient, date);
        appointments.add(ap);
        System.out.println("Appointment booked successfully!");
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }
        for (Appointment ap : appointments) {
            System.out.println("----------------------------");
            ap.displayAppointment();
        }
    }

    private static void viewAppointmentsByDoctor() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        System.out.println("\nSearch by:");
        System.out.println("1. Doctor ID");
        System.out.println("2. Doctor Name");
        System.out.print("Choose option: ");

        int searchChoice = sc.nextInt();
        Doctor selectedDoctor = null;

        switch (searchChoice) {
            case 1:
                System.out.print("Enter Doctor ID: ");
                int doctorId = sc.nextInt();
                selectedDoctor = doctors.stream()
                        .filter(d -> d.getDoctorId() == doctorId)
                        .findFirst()
                        .orElse(null);
                break;
            case 2:
                System.out.print("Enter Doctor Name: ");
                sc.nextLine(); // consume newline
                String doctorName = sc.nextLine();
                selectedDoctor = doctors.stream()
                        .filter(d -> d.getName().equalsIgnoreCase(doctorName))
                        .findFirst()
                        .orElse(null);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (selectedDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        final Doctor finalSelectedDoctor = selectedDoctor;
        List<Appointment> doctorAppointments = appointments.stream()
                .filter(ap -> ap.getDoctor().getDoctorId() == finalSelectedDoctor.getDoctorId())
                .collect(Collectors.toList());

        if (doctorAppointments.isEmpty()) {
            System.out.println("No appointments found for Dr. " + finalSelectedDoctor.getName());
            return;
        }

        System.out.println("\nAppointments for Dr. " + finalSelectedDoctor.getName() + ":");
        System.out.println("Total appointments: " + doctorAppointments.size());
        System.out.println("----------------------------");

        for (Appointment ap : doctorAppointments) {
            ap.displayAppointment();
            System.out.println("----------------------------");
        }
    }
}
