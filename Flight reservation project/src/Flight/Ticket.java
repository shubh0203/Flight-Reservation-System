
package Flight;

//importing necessary modules
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//creating abstarct Ticket class
public abstract class Ticket {

    //attributes of Ticket class
    public static int idCounterForPNR;
    public    int PNRNumber=101;
    private String  departureLocation;
    private String  destinationLocation;
    private float ticketPrize;
    public boolean isTicketConfirmed=false;
    public Flight flight;
    public Passenger  passenger;
    public  int seatNumber=0;
    private String dateAndTimeOfDeparture;
    private String getDateAndTimeOfDestination;
    private long duration;

    //initialising static variable
    static{
        idCounterForPNR=1232;

    }

    //constructor of Ticket class
    public Ticket( String destinationLocation, String departureLocation,String dateAndTimeOfDeparture,
                   String getDateAndTimeOfDestination, float ticketPrize, Flight flight, Passenger passenger){
        this.PNRNumber=++idCounterForPNR;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=ticketPrize;
        this.flight=flight;
        this.passenger=passenger;
        this.dateAndTimeOfDeparture=dateAndTimeOfDeparture;
        this.getDateAndTimeOfDestination=getDateAndTimeOfDestination;

    }



    //abstarct methods
    abstract String ticketDetails();

    abstract String statusOfTicket();

    abstract  String cancelTicket();


    //method to find duration of Journey
    public long durationOfJourney(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
       try {
           Date d1 = sdf.parse(dateAndTimeOfDeparture);
           Date d2 = sdf.parse(getDateAndTimeOfDestination);
           duration = d2.getTime() - d1.getTime();
       }
       catch (ParseException e){
           System.out.println("cant find Duration");
       }
       return duration;
    }


    // getter and setter methods for private atributes
    public int getPNRNumber() {
        return PNRNumber;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public float getTicketPrize() {
        return ticketPrize;
    }

    public String getDepartureLocation(){
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }
    public String getDateAndTimeOfDeparture(){
        return dateAndTimeOfDeparture;
    }
    public String getGetDateAndTimeOfDestination(){
        return getDateAndTimeOfDestination;
    }
}
