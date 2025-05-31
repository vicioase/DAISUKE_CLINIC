package patient;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Patient(int id, String name, int age, String address, String phoneNumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getID(){ return id; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getAddress(){ return address; }
    public String getPhoneNumber(){ return phoneNumber; }

    @Override
    public String toString(){
        return "[" + id + "] " + name + "; " + age + "; " + address + "; " + phoneNumber;
    }
}
