package entity;

/**
 * An entity class to represent an appointment outcome that holds the appointment id, date of appointment, service, medicine, prescription status and consultation notes
 */
public class AppointmentOutcome{
    private int appointmentId; 
    private String dateOfAppointment;
    private String service;
    private String medicine;
    private boolean pstatus;
    private String consultationNotes;

    /**
     * constructor for new Appointment Outcome
     * @param appointmentId
     * @param dateOfAppointment
     * @param service
     * @param medicine
     * @param consultationNotes
     */
    public AppointmentOutcome(int appointmentId, String dateOfAppointment, String service, String medicine, String consultationNotes){
        this.appointmentId = appointmentId;
        this.dateOfAppointment = dateOfAppointment;
        this.service = service;
        this.medicine = medicine;
        this.pstatus = false;
        this.consultationNotes = consultationNotes;
    }

    /**
     * constructor for existing appointment outcome
     * @param appointmentId
     * @param dateOfAppointment
     * @param service
     * @param medicine
     * @param status
     * @param consultationNotes
     */
    public AppointmentOutcome(int appointmentId, String dateOfAppointment, String service, String medicine, boolean status, String consultationNotes){
        this.appointmentId = appointmentId;
        this.dateOfAppointment = dateOfAppointment;
        this.service = service;
        this.medicine = medicine;
        this.pstatus = status;
        this.consultationNotes = consultationNotes;
    }

    /**
     * getter for appointment ID
     * @return
     */
    public int getAppointmentId() {
        return appointmentId;
    }

    /**
     * getter for medicine prescription
     * @return
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * getter for prescription status
     * @return
     */
    public boolean isPStatus() {
        return pstatus;
    }

    /**
     * setter for prescription status
     * @param status
     */
    public void setPStatus(boolean status) {
        this.pstatus=status;
    }

    /**
     * getter for appointment outcome date
     * @return
     */
    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    /**
     * getter for appointment outcome service
     * @return
     */
    public String getService() {
        return service;
    }

    /**
     * getter for consultation notes
     * @return
     */
    public String getConsultationNotes() {
        return consultationNotes;
    }


    /**
     * Print the appointment outcome details
     */
    public void printAppointmentOutcome(){
        System.out.printf("%-14d | %-10s | %-12s | %-16s | %-9s | %s%n",
                                          appointmentId,
                                          dateOfAppointment,
                                          service,
                                          medicine,
                                          pstatus ? "Dispensed" : "Pending",
                                          consultationNotes);
    }

    

    
    
}   