package eventregistrationmanager;

public class StudentParticipant extends Participant {
    private String studentId;
    private String course;

    
    public StudentParticipant(String participantId, String fullName, String email, String registrationStatus, String studentId, String course) {
        super(participantId, fullName, email, registrationStatus);
            this.studentId = studentId;
            this.course = course;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getParticipantType() {
    return "Student";
}
    public boolean isValidStudent() {
    return studentId != null && !studentId.trim().isEmpty()
            && course != null && !course.trim().isEmpty();
}
    public String getParticipantDetails() {
    return super.getParticipantDetails() + "\nStudent ID: " + studentId + "\nCourse: " + course;
}
}
