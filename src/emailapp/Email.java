package emailapp;

import java.util.Scanner;

public class Email{
    private final String firstName;
    private final String lastName;
    private final String department;

    private String password;
    private int defaultPasswordlength;
    private int mailboxCapacity = 1000;
    private String alternateEmail;
    private final String email;
    private String company = "java.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("DEPARTMENT SET TO: " + this.department + "\n");
        System.out.println("Enter Password length :");

        Scanner in = new Scanner(System.in);
        this.defaultPasswordlength = in.nextInt();

        this.password = randomPasswords(defaultPasswordlength);
        System.out.println("YOUR PASSWORD is :" + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        System.out.println(("YOUR EMAIL is : " + this.email));
    }



    // Ask for the department
    private  String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        return switch (depChoice) {
            case 1 -> "sales";
            case 2 -> "dev";
            case 3 -> "acct";
            default -> "";
        };
    }
    // Set the mailbox capacity
    public void SetMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set the alternate email
    public void SetAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void ChangePassword(String Password){
        this.password = Password;
    }
    // Change the passwords
    public String randomPasswords(int length){
        String passwordSet ="abcdefghijklmnopqwrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+=1234567890";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY Name: " + firstName + " " + lastName  + "\n" + "COMPANY EMAIL: " + email + "\n" + "MAILBOX CAPACITY : " + mailboxCapacity;
    }

}