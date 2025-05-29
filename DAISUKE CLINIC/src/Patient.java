public class Patient {
    int ID;
    String name;
    int age;
    String address;
    int phoneNumber;

    public Patient(int ID, String name, int age, String address, int phoneNumber){
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

    public int getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "Nama Pasien: " + name +
                "\nID Pasien: " + ID +
                "\nUmur Pasien: " + age +
                "\nAlamat Pasien: " + address +
                "\nNomor Telepon: 0" + phoneNumber;
    }
}
