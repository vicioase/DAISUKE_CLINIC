public class Node {
    Patient patient;
    Node next, prev;

    public Node(Patient patient){
        this.patient = patient;
        this.next = null;
    }
}
