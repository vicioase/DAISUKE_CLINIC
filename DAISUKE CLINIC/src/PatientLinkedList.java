public class PatientLinkedList {
    Node head;

    public void search(String name){
        Node current = head;
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

    public void addFirst(Patient patient){
        Node newNode = new Node(patient);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Patient patient){
        Node newNode = new Node(patient);
        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void delete(int ID){
        Node current = head;
        Node prev = null;

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

    public void printPatient(){
        Node current = head;
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
