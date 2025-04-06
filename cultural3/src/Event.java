public class Event {
    private String name;
    private String location;
    private String date;
    private int maxNumberOfSeats = 100;
    private int availableSeats = 100;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public int getAvailableSeate() {
        return availableSeats;
    }

    public void setAvailableSeate(int availableSeate) {
        this.availableSeats = availableSeate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString(){
        String returning = "";
        if(name != null){
        returning += "Name: " + name + "\n";
    }
        if(location != null){
        returning += "Location: " + location + "\n";
        }
        if(date != null){
            returning += "Date: " + date + "\n";

        }
        if(maxNumberOfSeats > 0){
            returning += "Max number of seats: " + maxNumberOfSeats + "\n";

        }
        if(availableSeats > 0){
            returning += "Available seats: " + availableSeats + "\n";

        }
        if(price > 0){
            returning += "Price: " + price + "\n";

        }
        return returning;

    }
    Event (String name, double price){
        this.name = name;
        this.price = price;
    }

    Event (String name, double price, String date){
        this.name = name;
        this.price = price;
        this.date = date;
    }


   Event (String name, String location, String date, double price) {
       this.name = name;
       this.location = location;
       this.date = date;
       this.price = price;
   }

   public void reserveSeats(){
        availableSeats--;
   }

   public void cancelReservation(){
        availableSeats++;
   }



}
