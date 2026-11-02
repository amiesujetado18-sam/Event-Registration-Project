package eventregistrationmanager;

public class DeleteParticipantTest {

    public static void main(String[] args) {

        ParticipantArray array = new ParticipantArray();

        Participant p1 = new StudentParticipant(
                "P001", "Anna", "anna@gmail.com", "Pending", "S001", "BSIT");

        Participant p2 = new GuestParticipant(
                "P002", "Mark", "mark@gmail.com", "Pending", "ABC Company");

        Participant p3 = new StudentParticipant(
                "P003", "John", "john@gmail.com", "Approved", "S003", "BSCS");

        array.addParticipant(p1);
        array.addParticipant(p2);
        array.addParticipant(p3);

        System.out.println("Before deletion: " + array.getCount());

        boolean deleted = array.deleteParticipant("P002");

        System.out.println("Deletion successful: " + deleted);
        System.out.println("After deletion: " + array.getCount());

        for (int i = 0; i < array.getCount(); i++) {
            System.out.println(array.getParticipant(i).getParticipantId());
        }
         boolean notFound = array.deleteParticipant("P999");

        System.out.println("Delete nonexistent ID: " + notFound);
        System.out.println("Count after unsuccessful deletion: " + array.getCount());

        System.out.println("Number of students: " + array.countStudents());
        System.out.println("Number of guests: " + array.countGuests());
        
        ParticipantArray fullArray = new ParticipantArray();

        for (int i = 1; i <= 100; i++) {
        Participant participant = new Participant(
            "P" + i, "Test Participant", "test@gmail.com", "Pending");

        fullArray.addParticipant(participant);
}

        System.out.println("Participants added: " + fullArray.getCount());

        boolean added101 = fullArray.addParticipant(
        new Participant("P101", "Extra Participant",
                "extra@gmail.com", "Pending"));

        System.out.println("Added 101st participant: " + added101);
        System.out.println("Final count: " + fullArray.getCount());
        
        ParticipantArray validationArray = new ParticipantArray();

        Participant blankId = new Participant(
        "", "Anna", "anna@gmail.com", "Pending");

        Participant blankEmail = new Participant(
        "P200", "Mark", "", "Pending");

        System.out.println("Added participant with blank ID: "
        + validationArray.addParticipant(blankId));

        System.out.println("Added participant with blank email: "
        + validationArray.addParticipant(blankEmail));

        System.out.println("Final validation count: "
        + validationArray.getCount());
        
        boolean updated = array.updateStatus("P001", "Approved");

        System.out.println("Status update successful: " + updated);
        System.out.println("New status: "
        + array.searchById("P001").getRegistrationStatus());
        
        boolean invalidUpdate = array.updateStatus("P001", "Waiting");

        System.out.println("Invalid status update: " + invalidUpdate);
        System.out.println("Current status: "
        + array.searchById("P001").getRegistrationStatus());
        
        Participant found = array.searchById("P001");
        Participant missingParticipant = array.searchById("P999");

        System.out.println("Existing ID found: " + (found != null));
        System.out.println("Nonexistent ID found: "
        + (missingParticipant != null));
        
        ParticipantArray duplicateArray = new ParticipantArray();

Participant first = new Participant(
        "P500", "Anna", "anna@gmail.com", "Pending");

Participant duplicate = new Participant(
        "P500", "Mark", "mark@gmail.com", "Pending");

System.out.println("First participant added: "
        + duplicateArray.addParticipant(first));

System.out.println("Duplicate ID added: "
        + duplicateArray.addParticipant(duplicate));

System.out.println("Final duplicate test count: "
        + duplicateArray.getCount());
    }
}