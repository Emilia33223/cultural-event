
import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private final List<Event> events = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();



    public void addEvent(Event event){
        events.add(event);

    }
    public void addEvent(Event ev1, Event ev2){
        events.add(ev1);
        events.add(ev2);
    }

    public void addEvent(Event ev1, Event ev2, Event ev3){
        events.add(ev1);
        events.add(ev2);
        events.add(ev3);

    }


    public void addCustomer(Customer cu1){
        customers.add(cu1);

    }
    public void addCustomer(Customer cu1, Customer cu2){
        customers.add(cu1);
        customers.add(cu2);
    }
    public void addCustomer(Customer cu1, Customer cu2, Customer cu3){
        customers.add(cu1);
        customers.add(cu2);
        customers.add(cu3);
    }

    public void displayEvents(){
        System.out.println(events);
        System.out.println("Reservation  system");
        System.out.println();
        for (Event e : events) {
            System.out.println(e);
            System.out.println();
        }
        System.out.println();

    }
    public void changeEventPrice(String eventName, double newPrice){
        for (Event e : events) {

        }
    }
    public void makeReservation(Customer customer, Event event){
        if(event.getAvailableSeate() <= 0){
            throw new IllegalArgumentException("Reservation has no available seats");

        }
        customer.addToReservationList(event);
        event.reserveSeats();
    }

    public Customer getCustomer(String customerName){
        for (Customer c : customers) {
            if(c.getLastName().equals(customerName)){
                return c;

            }

        }
        return null;

    }

}
