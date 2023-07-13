public class Main {
    public static void main(String[] args) {
        //Create an object using the empty constructor
        Customer customer1 = new Customer();

        //Set attributes using the set methods
        customer1.setFirstName("Merisha");
        customer1.setLastName("Crowl");
        customer1.setEmail("email@hotmail.com");
        customer1.setPhoneNumber("(555) 555-5555");
        customer1.setUserName("merishac");
        customer1.setPassword("XyZaBc123");
        customer1.setIsSubscriber(true);

        boolean isCustomer1Subscriber = customer1.getIsSubscriber();


        //Create another object using the all attributes constructor
        Customer customer2 = new Customer("Marcus", "Anders", "marcusanders@gmail.com", "(222) 222-2222", "MAnders", "Blue22", false);


        boolean isCustomer2Subscriber = customer2.getIsSubscriber();

        //Create another object using the 2 attributes constructor
        Customer customer3 = new Customer("Nadine", "Calloway", "supercustomer@yahoo.com", "(339) 442-4242", "CallowayN", "XxYyZz123987", true);


        boolean isCustomer3Subscriber = customer3.getIsSubscriber();

        System.out.println("Customer 1: " + customer1.getFirstName() + " " + customer1.getLastName() + ", Email: " + customer1.getEmail() + " Phone Number: " + customer1.getPhoneNumber() + " User Name: " + customer1.getUserName() + " Password: " + customer1.getPassword() + " Do you wish to subscribe? " + isCustomer1Subscriber);
        System.out.println("Customer 2: " + customer2.getFirstName() + " " + customer2.getLastName() + ", Email: " + customer2.getEmail() + " Phone Number: " + customer2.getPhoneNumber() + " User Name: " + customer2.getUserName() + " Password: " + customer2.getPassword() + " Do you wish to subscribe? " + isCustomer2Subscriber);
        System.out.println("Customer 3: " + customer3.getFirstName() + " " + customer3.getLastName() + ", Email: " + customer3.getEmail() + " Phone Number: " + customer3.getPhoneNumber() + " User Name: " + customer3.getUserName() + " Password: " + customer3.getPassword() + " Do you wish to subscribe? " + isCustomer3Subscriber);
    }
}

