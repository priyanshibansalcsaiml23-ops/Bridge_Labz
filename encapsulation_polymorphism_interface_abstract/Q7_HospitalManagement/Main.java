package q7_hospital;

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P100", "Latha", 30);
        Patient p2 = new OutPatient("P200", "Karan", 25);

        PatientService svc = new PatientService();
        svc.printBill(p1);
        System.out.println();
        svc.printBill(p2);
    }
}
