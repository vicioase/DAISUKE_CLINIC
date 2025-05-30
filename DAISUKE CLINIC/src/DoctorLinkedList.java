public class DoctorLinkedList {
    DNode head = null;
    DNode tail = null;

    public void addFirst(Doctor doctor){
        DNode newDnode = new DNode(doctor);
        if(head == null){
            head = newDnode;
            tail = newDnode;
        } else{
            newDnode.next = head;
            head.prev = newDnode;
            head = newDnode;
        }
    }

    public void addLast(Doctor doctor){
        DNode newDNode = new DNode(doctor);
        if(head == null){
            head = newDNode;
            tail = newDNode;
        } else{
            tail.next = newDNode;
            newDNode.prev = tail;
            tail = newDNode;
        }
    }

    public void delete(int ID){
        DNode current = head;
        while(current != null){
            if(current.doctor.getDoctorId() == ID){
                if(current == head && current == tail){
                    head = null;
                    tail = null;
                } else if(current == head){
                    head = current.next;
                    head.prev = null;
                } else if(current == tail){
                    tail = current.prev;
                    tail.next = null;
                } else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
        }

    }

    public void printDoctor(){
        DNode current = head;
        if(current == null){
            System.out.println("List kosong");
            return;
        }

        System.out.println("==== Daftar Doctor ====");
        while (current != null) { 
            System.out.println(current.doctor);
            current = current.next;
        }
    }
}
