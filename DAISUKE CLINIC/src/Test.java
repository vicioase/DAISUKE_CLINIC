import datastructures.BST;
import patient.Patient;

public class Test {
    public static void main(String[] args) {
        Patient patient0 = new Patient(0, "Zero", 20, "???", "Unknown");
        Patient patient1 = new Patient(1, "Steven", 17, "Klaten", "+62 858 75760006");
        Patient patient2 = new Patient(2, "Alice", 18, "Bandung", "+62 857 12345678");
        Patient patient3 = new Patient(3, "Jackson", 19, "Jakarta", "+62 857 9876543");
        
        BST patientTree = new BST();

        patientTree.insert(patient1);
        patientTree.insert(patient2);
        patientTree.insert(patient3);
        patientTree.insert(patient0);
        patientTree.inOrder();
    }
}
