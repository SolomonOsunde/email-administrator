import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private Integer mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "nexus.com";

    //Constructor that receives the firstname and lastname

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call a method asking for the department
        this.department = setDepartment();
        this.password = generateRandomPassword();
        this.email = generatedEmail();

        System.out.println("Details below");
        System.out.println("Email created for " + this.firstName + " " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
    }

    //Ask for Department

    private String setDepartment() {
        System.out.println("Enter the department:\n 1 for Sales \n 2 for Accounting \n 3 for Engineering");
        System.out.print("Enter department code : ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if(value == 1){
            return "Sales";
        } else if (value ==2) {
            return "Accounting";
        } else if (value == 3) {
            return "Engineering";
        }else {
            return "Others";
        }
    }

    //Generate random password

    private String generateRandomPassword() {
        int length;
        do {
            System.out.print("Enter a value between 8 and 30: ");

            Scanner input = new Scanner(System.in);
            length = input.nextInt();
        }
       while(length <8 || length > 30);

       String passwordSet = "A12HGB890JSBHYDTEPIDNLMD@&J)'";
       char[] password = new char[length];
       for(int i =0 ; i<length ; i++){
           int random = (int)(Math.random() *passwordSet .length());
           password[i] = passwordSet.charAt(random);
       }

       return new String(password);
    }

    //Combine elements to generate  email
    private String generatedEmail(){
        String email;
        email = this.firstName.toLowerCase() + "."
                +this.lastName.toLowerCase() + "@"
                +department.toLowerCase()+ "." +companySuffix;
        return email;
    }

    //Set mailbox capacity

    public void setMailboxCapacity(Integer mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    //Change the password

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public Integer getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }
}
