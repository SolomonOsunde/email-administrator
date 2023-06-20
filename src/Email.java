import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private Integer mailboxCapacity;
    private String alternateEmail;

    //Constructor that receives the firstname and lastname

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call a method asking for the department
        this.department = setDepartment();
        this.password = generateRandomPassword();

        System.out.println("Details below");
        System.out.println("Email created for " + this.firstName + " " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Password: " + this.password);
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

    //Set the alternate email

    //Change the password
}
