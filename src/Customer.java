import java.util.Scanner;

public class Customer {
     private static String[] customers = new String[5];

    private static void inputCustomerData(){
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        for(int i=0; i<5; i++){
            System.out.print("Enter first name for customer "+ (i+1) + ":");
            firstName = sc.nextLine();
            while(firstName.equals("")){
                System.out.print("First name cannot be empty. Please try again.\n");
                System.out.print("Enter first name for customer "+ (i+1) + ":");
                firstName = sc.nextLine();
            }


            System.out.print("Enter last name for customer "+ (i+1) + ":");
            lastName = sc.nextLine();
            while(lastName.equals("")){
                System.out.print("Last name cannot be empty. Please try again.\n");
                System.out.print("Enter last name for customer "+ (i+1) + ":");
                lastName = sc.nextLine();
            }

            customers[i] = firstName + " " + lastName;
        }

        sc.close();

    }
    private static void displayCustomerData(){
        System.out.println("Customer List:");
        for(String customer : customers){
            System.out.println(customer);
        }
    }

    public static void main(String[] args){
        inputCustomerData();
        displayCustomerData();
    }
}
