package eventregistrationmanager;

public class ParticipantArray {

    private Participant[] participants;
    private int count;

    public ParticipantArray() {
        participants = new Participant[100];
        count = 0;
    }
    public boolean addParticipant(Participant participant) {

        if (participant == null || count >= participants.length
        || participant.getParticipantId() == null
        || participant.getParticipantId().trim().isEmpty()) {
    return false;
}

        if (searchById(participant.getParticipantId()) != null) {
            return false;
        }

        participants[count] = participant;
        count++;

        return true;
    }
        public Participant getParticipant(int index) {

        if (index < 0 || index >= count) {
            return null;
        }

        return participants[index];
    }

    public int getCount() {
        return count;
    }
        public Participant searchById(String id) {

        if (id == null) {
            return null;
        }

        for (int i = 0; i < count; i++) {

            if (participants[i].getParticipantId().equalsIgnoreCase(id)) {
                return participants[i];
            }
        }

        return null;
    }
        public boolean deleteParticipant(String id) {
    if (id == null || id.trim().isEmpty()) {
        return false;
    }

    for (int i = 0; i < count; i++) {
        if (participants[i].getParticipantId().equalsIgnoreCase(id)) {

            for (int j = i; j < count - 1; j++) {
                participants[j] = participants[j + 1];
            }

            participants[count - 1] = null;
            count--;

            return true;
        }
    }

    return false;
}
        public int countStudents() {
    int total = 0;

    for (int i = 0; i < count; i++) {
        if (participants[i] instanceof StudentParticipant) {
            total++;
        }
    }

    return total;
}
        public int countGuests() {
    int total = 0;

    for (int i = 0; i < count; i++) {
        if (participants[i] instanceof GuestParticipant) {
            total++;
        }
    }

    return total;
}
        
        public boolean updateStatus(String id, String newStatus) {

        Participant participant = searchById(id);

        if (participant == null || newStatus == null) {
            return false;
        }

        if (!newStatus.equalsIgnoreCase("Pending")
                && !newStatus.equalsIgnoreCase("Approved")
                && !newStatus.equalsIgnoreCase("Cancelled")) {
            return false;
        }

        participant.setRegistrationStatus(newStatus);
        return true;
    }
        public int countByStatus(String status) {
    int total = 0;

    for (int i = 0; i < count; i++) {
        if (participants[i].getRegistrationStatus().equalsIgnoreCase(status)) {
            total++;
        }
    }

    return total;
}
        public boolean isEmpty() {
    return count == 0;
}
        public boolean isFull() {
    return count == participants.length;
}
}
    