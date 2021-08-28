package Flight;

public class Main {
    public static void main(String[] args) {

        // creating object passenger1 of Passenger class
        Passenger passenger1= new Passenger("Hollycross", "Mumbai","Maharastra",
                "Abhinav", "9876543","Abhinav@gmail.com");

        //creating object flight1 of Flight class
        Flight flight1=new Flight(1432,"Indigo", 50);

        //creating object passenger2 of passenger calss
        Passenger passenger2= new Passenger("Hinjavadi","Pune","Maharashtra",
                "Rutu","76543","rutu@gmail.com");

        //creating object flight2 of passenger class
        Flight flight2=new Flight(234,"Indigo",150);

        //creating object of RegularTicket using polymorphism
        Ticket ticket1= new RegularTicket("Mumbai","Goa","10:11:2020 04:20:49",
                "10:11:2020 10:20:00",2000,true,false,true, flight1,passenger1);

        //creating object of TouristTicket class using polymorphism
        Ticket ticket2= new TouristTicket("Mumbai","Manali",
                "10:11:2020 04:20:49","10:11:2020 11:20:49",100000,
                "Manali Villa", new String[]{"a", "b", "c", "d", "e"},flight2,passenger2);

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);

    }
    //function to print Ticket details
    public  static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.statusOfTicket());
    }
}
