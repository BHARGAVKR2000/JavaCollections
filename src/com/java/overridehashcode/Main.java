package com.java.overridehashcode;


import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<Customer> linked = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("sam","chennai",21);
        Customer customer1 = new Customer("john","delhi",25);
        Customer customer2 = new Customer("sam","chennai",21);
        linked.add(customer);
        linked.add(customer1);
        linked.add(customer2);
        int choice;
        do{
            System.out.println("1.AddCustomer\n2.DeleteCustomer\n3.ViewCustomers\n4.Exit");
            System.out.println("select operation to performed :");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addCustomer(linked, scanner);
                    break;
                case 2:
                    deleteCustomer(linked, scanner);
                    break;
                case 3:
                    ViewCustomers(linked);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("enter the right choice");
            }
        }while (choice != 4);

    }



    public static void addCustomer(@NotNull LinkedHashSet<Customer> linked, Scanner scanner){
        scanner.nextLine();
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        System.out.println("Enter city :");
        String city = scanner.nextLine();
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        linked.add(new Customer(name, city, age));
        System.out.println(name + " added Successfully");
    }
    private static void deleteCustomer(LinkedHashSet<Customer> linked, Scanner scanner) {
        scanner.nextLine();
        int flag = 0;
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        for(Customer c : linked){
            if(c.getName().equals(name)){
                flag = 1;
                linked.remove(c);
                System.out.println(name+" removed successfully");

            }
        }
        if(flag == 0){
            System.out.println(name+" not present in LinkedHashSet operation unsuccessful");
        }
    }

    private static void ViewCustomers(LinkedHashSet<Customer> linked) {
        for (Customer customer : linked) {
            System.out.println(customer);
        }

    }


}
