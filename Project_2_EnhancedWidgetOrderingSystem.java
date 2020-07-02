//This program simulates a Widget ordering system
//The goals of this system are as follows:
//-Obtain order information from customer
//-Ensure that the number of Widgets ordered is between 1 and 99
//-Assign the customer an order number

import java.util.*;
import java.text.*;

public class Project_2_EnhancedWidgetOrderingSystem
{
  public static void main(String[] args)

  {
    Random randNumObj = new Random();

    //Define Arrays
    String[] orderInfo=new String[9];
    String[] orderInfoMessages={"Order Number: ", "Company Name: ", "Number of Widgets: ", "Total Cost: $", "Shipping Address: ", "Shipping Zip Code: ", "Shipping State: ", "Invoicing E-mail: ", "Contact Phone Number: "};

    int orderNumber = randNumObj.nextInt(999999999);
    orderInfo[0] = Integer.toString(orderNumber);

    Scanner user_input= new Scanner(System.in);

    System.out.println("Welcome to the Widgets Inc. ordering system.\n");
    
    System.out.println("Enter Company Name:");
    orderInfo[1]=user_input.nextLine();    
    
    System.out.println("Enter 1 to 99 widgets ($6.50 per widget):");
    orderInfo[2]=user_input.nextLine();
    
    float totalNumWidgets = Float.parseFloat(orderInfo[2]);
    if (totalNumWidgets<=0 || totalNumWidgets>99)
    {
      System.out.println ("Invalid Number of widets selected");
      System.out.println ("Exiting ordering system");
      System.exit(0);
    }
    else
    {
      //Continue Program
    }
    
    float widTotalFloat = (float)(totalNumWidgets * 6.50);
    DecimalFormat priceFormat = new DecimalFormat("#.00");
    orderInfo[3] = priceFormat.format(widTotalFloat);


    System.out.println("Enter Shipping Address:");
    orderInfo[4]=user_input.nextLine();

    System.out.println("Enter Shipping Zip Code:");
    orderInfo[5]=user_input.nextLine();

    System.out.println("Enter Shipping State:");
    orderInfo[6]=user_input.nextLine();

    System.out.println("Enter e-mail address for invoicing:");
    orderInfo[7]=user_input.nextLine();

    System.out.println("Enter contact phone number:");
    orderInfo[8]=user_input.nextLine();

    System.out.println("\n\nTotal Widget Cost: $"+ orderInfo[3]);

    System.out.println("\nOrder Successfully Submitted.\n\nPlease save a copy of this information for your records:");

    for(int i=0; i<9; i++)
    {
      System.out.println(orderInfoMessages[i]+orderInfo[i]);
    }

    System.out.println("\n\nThank you for ordering with Widgets Inc.");
  }
}
