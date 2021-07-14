/*
class Event {
    // Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName) {

        this.eventName = eventName;
        this.participantName = participantName;
    }

    public void registerEvent() {
        if (getEventName().equals("Singing")) {
            setRegistrationFee(8);
        } else if (getEventName().equals("Dancing")) {
            setRegistrationFee(10);
        } else if (getEventName().equals("DigitalArt")) {
            setRegistrationFee(12);
        } else if (getEventName().equals("Acting")) {
            setRegistrationFee(15);
        } else {
            setRegistrationFee(0);
        }
    }

    // Getter and Setter methods for EventName
    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    // Getter and Setter methods for ParticipantName
    public String getParticipantName() {
        return this.participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public double getRegistrationFee() {
        return this.registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
}

class SoloEvent extends Event {
    // Implement your code here
    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo = participantNo;
    }

    // Getter and Setter methods for ParticipantNo
    public int getParticipantNo() {
        return this.participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent() {
        super.registerEvent();
    }
}

class TeamEvent extends Event {
    // Implement your code here
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    // Getter and Setter methods for NoOfParticipants
    public int getNoOfParticipants() {
        return this.noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    // Getter and Setter methods for TeamNo
    public int getTeamNo() {
        return this.teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent() {

        int perAmount = 0;
        if (getEventName().equals("Singing")) {
            perAmount = 4;
        } else if (getEventName().equals("Dancing")) {
            perAmount = 6;
        } else if (getEventName().equals("DigitalArt")) {
            perAmount = 8;
        } else if (getEventName().equals("Acting")) {
            perAmount = 10;
        }

        double value = (getNoOfParticipants() > 1) ? getNoOfParticipants() * perAmount : 0;
        setRegistrationFee(value);
    }
}

class Tester {

    public static void main(String[] args) {

        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
        soloEvent.registerEvent();
        if (soloEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + soloEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
            System.out.println("Your participant number is " + soloEvent.getParticipantNo());

        } else {
            System.out.println("Please enter a valid event");
        }

        System.out.println();
        TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
        teamEvent.registerEvent();
        if (teamEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + teamEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
            System.out.println("Your team number is " + teamEvent.getTeamNo());
        } else {
            System.out.println("Please enter a valid event");
        }
    }
}

*/

