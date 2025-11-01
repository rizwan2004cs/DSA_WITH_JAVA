class Participants{
    private int uniqueIdentifier;
    private String ParticipantName;
    private double BaseregistrationFee;
    private int numberOfEventsParticipated;
    private double chargePerEvent;
    //Setters
    void setParticipantId(int uniqueIdentifier ){
        this.uniqueIdentifier = uniqueIdentifier;
    }
    void setName(String ParticipantName ){
        this.ParticipantName = ParticipantName;
    }
    void setBaseRegistrationFee(double BaseregistrationFee ){
        this.BaseregistrationFee = BaseregistrationFee;
    }
    void setNumberOfEvents(int numberOfEventsParticipated ){
        this.numberOfEventsParticipated = numberOfEventsParticipated;
    }
    void setEventChargePerEvent(double chargePerEvent ){
        this.chargePerEvent = chargePerEvent;
    }

    //Getters
    int getParticipantId(){
        return this.uniqueIdentifier;
    }
    String getName(){
        return this.ParticipantName;
    }
    double getBaseRegistrationFee(){
        return this.BaseregistrationFee;
    }
    int getNumberOfEvents(){
        return this.numberOfEventsParticipated;
    }
    double getEventChargePerEvent(){
        return this.chargePerEvent;
    }

    //Methods
    double calculateTotalFee(){
    return BaseregistrationFee + (numberOfEventsParticipated * chargePerEvent);       
}
    void displayDetails(){
        System.out.println("ID: "+this.uniqueIdentifier+"\nName: "+this.ParticipantName+"\nBase Registration Fee: "+this.BaseregistrationFee+"\nEvent Charges: "+this.numberOfEventsParticipated+" events @ "+this.chargePerEvent+"/event");
        System.out.println("Total Fee:"+this.calculateTotalFee());
    }

}



public class CollgeFestRegistration{
    public static void main(String[] args) {
        Participants part1 = new Participants();
        part1.setParticipantId(3007);
        part1.setBaseRegistrationFee(200);
        part1.setEventChargePerEvent(100);
        part1.setNumberOfEvents(3);
        part1.setName("Shafi");
        part1.displayDetails();
    }
}