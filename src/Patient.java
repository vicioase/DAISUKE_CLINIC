public class Patient {
    int ID;
    String name;
    int age;
    String address;
    long phoneNumber;

    public Patient(int ID, String name, int age, String address, long phoneNumber){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "ID Pasien: " + ID +
                "\nNama Pasien: " + name +
                "\nUmur Pasien: " + age + " tahun" +
                "\nAlamat Pasien: " + address +
                "\nNomor Telepon: 0" + phoneNumber;
    }
}
