import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    public void run(){
        CustomerManager customers = new CustomerManager();

        customers.loadFromFile();

        //customers.createCustomers();
        //customers.saveToFile();

        customers.printCustomers();
    }
}