package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todaysCustomers = { cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of customer objects
        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Bashir", 449));
        customersList.add(new Customer("Suleyman", 9763));

        //Print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customersList.get(0).toString());
        System.out.println("------------------------------------------------");

        System.out.println(customersList);

        System.out.println("------------------------------------------------");

        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));

        }

        System.out.println("-------------FOR EACH LOOP--------");
        for (Customer eachCustomer : customersList) {
            System.out.println(eachCustomer);
        }

        //print only names of Customers in the List
        System.out.println("--------------------------NAMES OF CUSTOMERS-------------------");
        //lambda expression
        customersList.forEach(each -> System.out.println(each.getName()));

        System.out.println("--------------------------NAMES OF CUSTOMERS-------------------");
        for (Customer eachCustomer : customersList) {
            System.out.println(eachCustomer.getName());
        }



    }
}
