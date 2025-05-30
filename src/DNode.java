public class DNode {
    Doctor doctor;
    DNode next, prev;

    public DNode(Doctor doctor){
        this.doctor = doctor;
        this.next = null;
        this.prev = null;
    }
}
