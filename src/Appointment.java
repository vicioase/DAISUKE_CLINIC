public class Appointment {
    int appointmentID;
    int patientID;
    int doctorID;


    public Appointment(int appointmentID, int patientID, int doctorID){
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
    }

    public int getAppointmentID(){
        return appointmentID;
    }

    public int getPatientID(){
        return patientID;
    }

    public int getDoctorID(){
        return doctorID;
    }

    @Override
    public String toString(){
        return "ID Pemeriksaan: " + appointmentID +
                "\nID Pasien: " + patientID +
                "\nID Dokter: " + doctorID;
    }
}
