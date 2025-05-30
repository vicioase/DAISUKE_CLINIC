public class Doctor {
    int doctorId;
    String name;
    String speciality;

    public Doctor(int doctorId, String name, String speciality){
        this.doctorId = doctorId;
        this.name = name;
        this.speciality = speciality;
    }

    public int getDoctorId(){
        return doctorId;
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
                "\nID Dokter: " + doctorId +
                "\nSpesialis: " + speciality;
    }
}
