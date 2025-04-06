
public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Event ev1 = new Event("Symphony Concert", 120.0, "12th march 2005");
        Event ev2 = new Event("Hamlet", 85.0, "12th march 2005");
        Event ev3 = new Event("Hamlet", 90.0, "12th march 2005");
        Customer cu1 = new Customer("Emilia" , "Perlinska" , "s33223@pjwstk.edu.pl");
        Customer cu2 = new Customer("Julia", "Perlinska", "wowow@pjwstk.edu.pl");
        Customer cu3 = new Customer("Julek", "Mazurek", "lolo@pjwstk.edu.pl");
        reservationSystem.addCustomer(cu1);
        reservationSystem.addCustomer(cu2);
        reservationSystem.addCustomer(cu3);
        reservationSystem.addEvent(ev1);
        reservationSystem.addEvent(ev2);
        reservationSystem.addEvent(ev3);

        cu1.addToReservationList(ev1, ev2);
        cu2.addToReservationList(ev1, ev3);
        cu3.addToReservationList(ev2, ev1);
        reservationSystem.addEvent(ev1);
        reservationSystem.addEvent(ev2);
        reservationSystem.addEvent(ev3);


        System.out.println();
        reservationSystem.changeEventPrice("wow", 75.0);
        reservationSystem.displayEvents();






    }

}