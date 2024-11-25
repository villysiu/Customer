import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
     private String[] customers = new String[5];

    public Customer() {

    }

    public void inputCustomerData(){
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+");


        for(int i=0; i<5; i++){
            String firstName = "";
            String lastName = "";
            do{
                System.out.print("Enter first name for customer "+ (i+1) + ":");
                firstName = sc.nextLine().trim();
                if(firstName.isEmpty()){
                    System.out.println("First name cannot be empty. Please try again.");
                }
            } while(firstName.isEmpty());


            do{
                System.out.print("Enter last name for customer "+ (i+1) + ":");
                lastName = sc.nextLine().trim();

                if(lastName.isEmpty()){
                    System.out.println("Last name cannot be empty. Please try again.");
                }
            } while(lastName.isEmpty());

            customers[i] = firstName + " " + lastName; // James Smith
        }
        sc.close();

    }
    public void displayCustomerData(){
        System.out.println("Customer List:");
        for(String customer : customers){
            System.out.println(customer);
        }
    }


}
