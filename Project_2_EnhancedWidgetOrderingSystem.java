//This program simulates a Widget ordering system
//The goals of this system are as follows:
//-Obtain order information from customer
//-Ensure that the number of Widgets ordered is between 1 and 100
//-Assign the customer an order number

import java.util.*;
import java.text.*;

public class Project_2_EnhancedWidgetOrderingSystem
{
  public static void main(String[] args)

  {
    Random randNumObj = new Random();
    int randNum = randNumObj.nextInt(999999999);

    String[] orderInfo=new String[7];
    Scanner user_input= new Scanner(System.in);

    System.out.println("Welcome to the Widgets Inc. ordering system.\n");
    
    System.out.println("Enter Company Name:");
    orderInfo[0]=user_input.nextLine();    
    
    System.out.println("Enter number of widgets needed ($6.50 per widget):");
    orderInfo[1]=user_input.nextLine();
    
    float totalNumWidgets = Float.parseFloat(orderInfo[1]); 
    float widTotalFloat = (float)(totalNumWidgets * 6.50);

    DecimalFormat priceFormat = new DecimalFormat("#.00");
    String priceUSDFormat = priceFormat.format(widTotalFloat);

    System.out.println("Enter Shipping Address:");
    orderInfo[2]=user_input.nextLine();

    System.out.println("Enter Shipping Zip Code:");
    orderInfo[3]=user_input.nextLine();

    System.out.println("Enter Shipping State:");
    orderInfo[4]=user_input.nextLine();

    System.out.println("Enter e-mail address for invoicing:");
    orderInfo[5]=user_input.nextLine();

    System.out.println("Enter contact phone number:");
    orderInfo[6]=user_input.nextLine();

    System.out.println("\n\nTotal Widget Cost: $"+ priceUSDFormat);

    //This code is an HTML formatted version of the user supplied data that would hypothetically be sent to a server at Widgets Inc.
    String html_Formatted_Order_Details = "<html><b>Submitted Order Information</b><br><b>Order Number: </b>"+randNum+"<br><b>Company Name: </b>"+orderInfo[0]+"<br><b>Ordered Widgets: </b>"+orderInfo[1]+"<br><b>Widget Cost: </b>$"+priceUSDFormat+"<br><b>Shipping Address: </b>"+orderInfo[2]+"<br><b>Shipping Zip Code: </b>"+orderInfo[3]+"<br><b>Shipping State: </b>"+orderInfo[4]+"<br><b>Invoicing E-mail: </b>"+orderInfo[5]+"<br><b>Contact Phone Number: </b>"+orderInfo[6]+"</html>";

    System.out.println("\n\nSending E-mail to procurement: "+html_Formatted_Order_Details);

    System.out.println("\nOrder Successfully Submitted.\n\nPlease save a copy of this information for your records:");

    System.out.println("Order Number: "+randNum);
    System.out.println("Company Name: "+orderInfo[0]);
    System.out.println("Number of Widgets: "+orderInfo[1]);
    System.out.println("Total Cost: $"+priceUSDFormat);
    System.out.println("Shipping Address: "+orderInfo[2]);
    System.out.println("Shipping Zip Code: "+orderInfo[3]);
    System.out.println("Shipping State: "+orderInfo[4]);
    System.out.println("Invoicing E-mail: "+orderInfo[5]);
    System.out.println("Contact Phone Number: "+orderInfo[6]);

    System.out.println("\n\nThank you for ordering with Widgets Inc.");
  }
}
