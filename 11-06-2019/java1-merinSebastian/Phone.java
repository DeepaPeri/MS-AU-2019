import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class CallHistory{
    String userName;
    long contactNumber;
    Date startTime;
    Date endTime;
    long duration;

    public String toString(){
            return ("username: "+userName+",    contactNumber: "+contactNumber+",       startTime: "
            +startTime+",       endTime: "+endTime+",   duration: "+duration);
    }

}

class Customer extends Network{
    long  contactNumber;
    String userName;
    String phoneModel;
    
    ArrayList<CallHistory> callHistory = new ArrayList<CallHistory>();
    Network connection = new Network();
    Customer(long contactNumber, String userName, String phoneModel){
            this.contactNumber = contactNumber;
            this.userName = userName;
            this.phoneModel = phoneModel;
            // Storing the created customer and making it available for network
            connection.customerList.add(this);
           
    }

    void makeCall(Customer customer){
             connection.makeCall( customer, this);
    }
    void ring(Customer customerCaller){
             connection.ring( customerCaller, this);          
    }
    void recieveCalls(Customer customerCaller){
            connection.recieveCalls( customerCaller, this);
    }  
     void getCallHistory(){
        System.out.println(this.callHistory);
    } 
    String getUserName(){
            return this.userName;
    }
    long getContactNumber(){
            return this.contactNumber;
    }
    boolean isPhoneWorking(){
              if (connection.customerList.contains(this)) {
               return true;
        } 
        return false;
    }

}


class Network{
   
    ArrayList<Customer> customerList = new ArrayList<>();
 
    void makeCall(Customer customer, Customer reciever){
              if (customerList.contains(reciever)) {
                System.out.println("calling: " + customer.contactNumber);
                customer.ring(reciever);
        } else {
                System.out.println("Number doesnt exist in the network");
        }
    }
    void ring(Customer customerCaller, Customer reciever){
            System.out.println("Call from : " + customerCaller.contactNumber);
            System.out.println("Do you want to attend the call ? : ");
            Scanner sc = new Scanner(System.in);
            System.out.println("If yes 1 else 0");
            int choice = sc.nextInt();
            if(choice == 1 ) recieveCalls(customerCaller, reciever); 
            else  System.out.println("You have not been attended");
    }
    void recieveCalls(Customer customerCaller, Customer recieverData){
            System.out.println("Attended call from : " + customerCaller.contactNumber);
            Date startTime = new Date();
            long start = System.currentTimeMillis(); 
          /*   Thread.sleep(500); */

            System.out.println("Do you wish to disconnect?: if yes 1 else 0: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 1){
                long end = System.currentTimeMillis();
                Date endTime = new Date();
                long duration = end - start;
                CallHistory caller = new CallHistory();
                CallHistory reciever = new CallHistory();
                reciever.contactNumber = customerCaller.contactNumber;
                reciever.startTime = startTime;
                reciever.endTime = endTime;
                reciever.duration = duration;
                reciever.userName = customerCaller.userName;

                caller.contactNumber = recieverData.contactNumber;
                caller.startTime = startTime;
                caller.endTime = endTime;
                caller.duration = duration;
                caller.userName = recieverData.userName;

                recieverData.callHistory.add(reciever);
                customerCaller.callHistory.add(caller);

            }
            else {
                
            }

    }  
  
}

class Phone {

    public static void main(String[] args){
            Customer  customer1 = new Customer(9848132116L, "Merin", "Iphone");
            Customer customer2 = new Customer(996300016L,"Deepa", "Poco" );
            
            System.out.println("your user name : " + customer1.getUserName());
            System.out.println("your contact number: " + customer1.getContactNumber());
            System.out.println("phone working status : " + customer1.isPhoneWorking());

            customer1.makeCall(customer2);
            customer1.getCallHistory();

            

    }

}
