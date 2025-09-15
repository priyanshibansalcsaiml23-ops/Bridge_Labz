package q7_hospital;

public class PatientService {
    public void printBill(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Bill amount: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }
    }
}
