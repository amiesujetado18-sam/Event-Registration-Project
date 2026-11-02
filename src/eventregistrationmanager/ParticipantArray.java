package eventregistrationmanager;

public class ParticipantArray {

    private Participant[] participants;
    private int count;

    public ParticipantArray() {
        participants = new Participant[100];
        count = 0;
    }
    public boolean addParticipant(Participant participant) {

        if (participant == null || count >= participants.length) {
            return false;
        }

        if (searchById(participant.getParticipantId()) != null) {
            return false;
        }

        participants[count] = participant;
        count++;

        return true;
    }


}
    