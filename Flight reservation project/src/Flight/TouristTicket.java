package Flight;

public class TouristTicket extends Ticket{

    //Attributes of TouristTicket
    private String touristHotelAddress;
    private String[] touristLocations= new String[4];


    // constructor for TouristTicket class
    public TouristTicket( String departureLocation, String destinationLocation,String dateAndTimeOfDestination,String dateAndTimeOfDeparture,
                         float ticketPrize, String touristHotelAddress,String touristLocations[],
                         Flight flight, Passenger passenger){

        // calling parent constructor
        super(destinationLocation,departureLocation,dateAndTimeOfDeparture, dateAndTimeOfDestination,ticketPrize,flight,passenger);



        this.touristHotelAddress=touristHotelAddress;
        this.touristLocations=touristLocations;




    }

    //method to book and print PNR number
    public String statusOfTicket(){
        if(this.flight.getSeatNumber()>this.flight.getCapacity()){
            this.isTicketConfirmed=false;

            return "Can't book Seat.";
        }
        else{
            this.isTicketConfirmed=true;
            this.flight.updateSeatsBooked();
            System.out.println(this.passenger.getContactDetails());
            System.out.println(this.passenger.getAddressDetails());
            System.out.println(this.flight.getFlightDetails());
            System.out.println(this.ticketDetails());
            return "PNR Number: "+ PNRNumber;
        }
    }

    //method to cancel ticket
    public String cancelTicket(){
        isTicketConfirmed=false;
        this.flight.setSeatNumber((this.flight.getSeatNumber())-1);
        return "Cancelled";
    }

    //method to return ticket details
    public String ticketDetails(){
        return "Ticket type: Tourist Ticket"+ ", Seat Number: "+this.flight.getSeatNumber();
    }



    //method to add tourist location
    public void addTouristLocation(String location){
        for(int i=0;i<5;i++){
            if(touristLocations[i]==null){
                touristLocations[i]=location;

                break;
            }
            else{
                System.out.print("Cant add location");
            }
        }
    }

    //method to remove tourist location
    public void removeLocation(String location){
        for(int i=0;i<5;i++){
            if(touristLocations[i].equals(location)){
                touristLocations[i]=null;
                break;
            }
        }
    }

    // method to get Tourist hotel address
    public String getTouristHotelAddress() {
        return touristHotelAddress;
    }


    //method to get tourist locations
    public String getTouristLocations() {
        String locations="";
        for(int i=0;i<5;i++){
            locations=locations+ touristLocations[i];
        }
        return locations;
    }

}
