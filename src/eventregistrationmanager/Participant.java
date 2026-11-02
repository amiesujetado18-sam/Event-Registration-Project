package eventregistrationmanager;

public class Participant {

    private String participantId;
    private String fullName;
    private String email;
    private String registrationStatus;

    
    public Participant(String participantId, String fullName, String email, String registrationStatus) {
        this.participantId = participantId;
        this.fullName = fullName;
        this.email = email;
        this.registrationStatus = registrationStatus;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
}
