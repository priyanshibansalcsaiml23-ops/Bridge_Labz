package q7_patient;

public class PatientMain {
    public static void main(String[] args) {
        Patient.setHospitalName("City Hospital");

        Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        PatientService service = new PatientService();
        service.showPatient(patient1);
        System.out.println();
        service.showPatient(patient2);
    }
}
