public class Queue {
    ANode front, rear;

    public boolean isEmpty(){
        return front == null;
    }

    public void scheduleAppointment(Appointment a){
        ANode newNode = new ANode(a);
        if(rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
        
        rear.next = newNode;
        rear = newNode;
    }

    public Appointment processNextAppointment(){
        if(isEmpty()){
            System.out.println("Antrian kosong.");
        }

        Appointment value = front.appointment;
        front = front.next;

        if(front == null){
            rear = null;
        }

        return value;
    }

    public void viewUpcomingAppointments(){
        if(isEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Antrian: ");
        ANode current = front;
        while(current != null){
            System.out.println(current.appointment);
            current = current.next;
        }
    }
}
