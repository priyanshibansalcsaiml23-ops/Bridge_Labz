package q7_hospital;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient: " + name + " (ID: " + patientId + ") Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(String patientId, String name, int age) { super(patientId, name, age); }
    @Override public double calculateBill() { return 5000; }
    @Override public void addRecord(String record) { System.out.println("Added record: " + record); }
    @Override public void viewRecords() { System.out.println("Viewing records..."); }
}

class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) { super(patientId, name, age); }
    @Override public double calculateBill() { return 1000; }
}
