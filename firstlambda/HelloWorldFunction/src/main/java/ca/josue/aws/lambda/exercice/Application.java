package ca.josue.aws.lambda.exercice;

public class Application {

    public void truckTracker(Location location) {
        System.out.println("Truck Tracker");
        System.out.println("Latitude: " + location.getLatitude());
        System.out.println("Longitude: " + location.getLongitude());
    }

    public Ticket getTicket(Payment payment) {
        System.out.println("Get Ticket");
        Ticket ticket = new Ticket();
        ticket.setPayment(payment);
        ticket.setEventName("Trip to the mall");
        ticket.setSeat("A1");
        return ticket;
    }
}
