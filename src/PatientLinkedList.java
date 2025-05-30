import java.util.Scanner;

public class PatientLinkedList {
    PNode head;
    Scanner scanner = new Scanner(System.in);

    public void addPatient(){
        System.out.print("Masukkan id pasien: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama pasien: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan umur pasien: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan alamat pasien: ");
        String address = scanner.nextLine();
        System.out.print("Masukkan nomor telepon pasien (tanpa 0 di awal): ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        Patient patient = new Patient(id, name, age, address, phoneNumber);
        PNode newNode = new PNode(patient);
        if(head == null){
            head = newNode;
            return;
        }

        PNode last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void removePatientById(int ID){
        PNode current = head;
        PNode prev = null;

        if(current != null){
            if(current.patient.getID() == ID){
                head = current.next;
                current = null;
                return;
            }
        }
        while(current != null){
            if(current.patient.getID() == ID){
                break;
            }
            prev = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        prev.next = current.next;
        current = null;
    }

    public void findPatientByName(String name){
        PNode current = head;
        while(current != null){
            if(current.patient.getName().equalsIgnoreCase(name)){
                System.out.println("Pasien ditemukan");
                System.out.println(current.patient); 
                return;
            }
            current = current.next;
        }
        System.out.println("Pasien dengan nama " + name + " tidak ditemukan");
    }

    public void displayAllPatients(){
        PNode current = head;
        if(current == null){
            System.out.println("List kosong");
            return;
        }

        while(current != null){
            System.out.println(current.patient);
            current = current.next;
        }
    }
}
