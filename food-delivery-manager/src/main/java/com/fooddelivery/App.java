package com.fooddelivery;

import java.util.Scanner;

import com.fooddelivery.DAO.CustomerDAO;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Food Delivery App:");

    

        System.out.println("1)Add customer");
        
        int ch;

        do{
            System.out.println("Select any choice :");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1 : {
                    System.out.print("Enter name :");
                    String name = sc.nextLine();
                    System.out.print("Enter id : ");
                    int id = sc.nextInt();
                    CustomerDAO.saveCustomer(name, id);
                }
            }
        }while(ch!=0);

        

        sc.close();

    }
}
