import java.util.Scanner;

public class Customer {
     private String[] customers = new String[5];
    String firstName = "";
    String lastName = "";
    public Customer() {

    }

    public void inputCustomerData(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){

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
