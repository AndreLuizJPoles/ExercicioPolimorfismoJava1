package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        for(int i=0;i<numberOfEmployees;i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(answer == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }
            else{
                employees.add(new Employee(name,hours,valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee employee : employees){
            System.out.println(employee);
        }

        sc.close();
    }
}