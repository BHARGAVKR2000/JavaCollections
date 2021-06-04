package com.java.overridehashcode;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Customer> linked = new LinkedHashSet<>();
        Customer customer = new Customer("sam","chennai",21);
        Customer customer1 = new Customer("john","delhi",25);
        Customer customer2 = new Customer("sam","chennai",21);
        linked.add(new Customer("samantha","hyderabad",34));
        linked.add(customer);
        linked.add(customer1);
        linked.add(customer2);

        Iterator<Customer> itr = linked.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
