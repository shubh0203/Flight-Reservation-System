package Flight;

public class Passenger {
    //attributes of passenger class
    private  static int idCounter;
    private int id;

    //declaring static variable
    static{
        idCounter=0;
    }

    // creating Address class inside Passenger class
    private static class Address {

        // Attributes of Address class
        String street, city, state;

        //constructor of Address class
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    //creating Contact class inside passenger class
    private static class Contact {

        //attributes of Contact class
        String name, phone, email;


        //constructor of Contact class
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    // constructor of Passenger class
    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.id=++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    //getter for id
     public int getId(){
        return this.id;
     }

     // method to get Address Details
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    //method to get Contact details
    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

    //getter to get passenger count
    public int getPassengerCount(){
        return idCounter;
    }
}



