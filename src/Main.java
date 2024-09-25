import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    public void run(){
        CustomerManager customers = new CustomerManager();

        customers.readFromDat();

        //customers.createCustomers();
        //customers.writeToDat();

        customers.saveToFile();


        customers.printCustomers();
    }
}