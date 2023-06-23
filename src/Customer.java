public class Customer { //Create a custom class with 3 private instance variables

    private String firstName; //firstName (Private)

    private String lastName; //lastName (Private)

    private String email; //email (Private)

    private String phoneNumber; //phoneNumber (Private)

    private String userName; //userName (Private)

    private String password; //password (Private)

    private boolean isSubscriber; //isSubscriber (Private)


    public Customer() { //Create an empty constructor

    }

    //Create constructor that uses 2 of 6 attributes
    public Customer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //Create constructor that uses all attributes
    public Customer(String firstName, String lastName, String email, String phoneNumber, String userName, String password, boolean isSubscriber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.isSubscriber = isSubscriber;
    }
    //Code Get method for firstName:
    public String getFirstName() { return firstName; }

    //Code Get method for lastName:
    public String getLastName() { return lastName; }

    //Code Get method for email:
    public String getEmail() { return email; }

    //Code Get method for phoneNumber:
    public String getPhoneNumber() { return phoneNumber; }

    //Code Get method for userName:
    public String getUserName() { return userName; }

    //Code Get method for password:
    public String getPassword() { return password; }

    //Code Get method for isSubscriber:
    public boolean getIsSubscriber() { return isSubscriber; }

    //Set method for firstName:
    public void setFirstName(String firstName) { this.firstName = firstName; }

    //Set method for lastName:
    public void setLastName(String lastName) { this.lastName = lastName; }

    //Set method for email:
    public void setEmail(String email) { this.email = email; }

    //Set method for phoneNumber:
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    //Set method for userName:
    public void setUserName(String userName) { this.userName = userName; }

    //Set method for password:
    public void setPassword(String password) { this.password = password; }

    //Set method for isSubscriber (Boolean value):
    public void setIsSubscriber(boolean isSubscriber) { this.isSubscriber = isSubscriber; }

    }


