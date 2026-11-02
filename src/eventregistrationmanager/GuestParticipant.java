package eventregistrationmanager;

public class GuestParticipant extends Participant {
    private String organization;
    
    public GuestParticipant(String participantId, String fullName, String email, String registrationStatus, String organization) {
        super(participantId, fullName, email, registrationStatus);
            this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getParticipantType() {
    return "Guest";
}
    public boolean isValidGuest() {
    return organization != null && !organization.trim().isEmpty();
}
}
