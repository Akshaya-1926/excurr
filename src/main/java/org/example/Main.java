package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice =sc.nextInt();
        double res=0;
        if (choice==1)
        {
            double rupee=sc.nextDouble();
            res=rupee*98;
            System.out.println("Dollar="+res);
        }
        else if (choice==2)
        {
            double dollar=sc.nextDouble();
            res=dollar*98;
            System.out.println("Rupee="+res);
        }
        else if (choice==3)
        {
            double euro=sc.nextDouble();
            res=euro/125;
            System.out.println("Rupee="+res);
        }
        else if (choice==4)
        {
            double rupee=sc.nextDouble();
            res=rupee*125;
            System.out.println("Euro="+res);
        }
        else
        {
            System.out.println("Invalid choice");
        }


    }
}