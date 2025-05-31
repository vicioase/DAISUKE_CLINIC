package doctor;
public class Doctor {
    String ID;
    String name;
    String speciality;

    public Doctor(String ID, String name, String speciality){
        this.ID = ID;
        this.name = name;
        this.speciality = speciality;
    }

    public String getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getSpeciality(){
        return speciality;
    }

    @Override
    public String toString(){
        return "Nama Dokter: " + name +
                "\nID Dokter: " + ID +
                "\nSpesialis: " + speciality;
    }
}
