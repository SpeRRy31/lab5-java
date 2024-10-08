import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public static void printMenu() {
        System.out.println("Menu choose operation");
        System.out.println("1 - Generate Customers");
        System.out.println("2 - Save Customers to .txt");
        System.out.println("3 - Save Customers to .dat");
        System.out.println("4 - Load Customers to .txt");
        System.out.println("5 - Load Customers to .dat");
        System.out.println("6 - Show Customers by name");
        System.out.println("7 - Show Customers by range balance");
        System.out.println("8 - Show Customers with null balance");
        System.out.println("9 - Show all Customers");
        System.out.println("10 - Change Customer by id");
        System.out.println("11 - Delete Customer by id");
        System.out.println("12 - Exit");
        System.out.printf("\n Input here --> ");
    }

    public static int menu() {
        printMenu();
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void pressEnterToContinue(){
        Scanner t = new Scanner(System.in);
        System.out.println("press Enter to continue");
        t.nextLine();
    }

    public void run() {

        CustomerManager app = new CustomerManager();
        boolean close = false;
        while (!close) {
            switch (menu()) {
                case 1:
                    app.createCustomers();
                    app.printCustomers();
                    pressEnterToContinue();
                    break;
                case 2:
                    app.saveToFile();
                    break;
                case 3:
                    app.writeToDat();
                    break;
                case 4:
                    app.loadFromFile();
                    break;
                case 5:
                    app.readFromDat();
                    break;
                case 6:
                    app.printCustomersByName();
                    pressEnterToContinue();
                    break;
                case 7:
                    app.printCustomersBetweenBalanceRange();
                    pressEnterToContinue();
                    break;
                case 8:
                    app.printCustomersNullBalance();
                    pressEnterToContinue();
                    break;
                case 9:
                    app.printCustomers();
                    pressEnterToContinue();
                    break;
                case 10:
                    app.changeCustomerByID();
                    break;
                case 11:
                    app.deleteCustomerByID();
                    break;
                case 12:
                    close=true;
                    break;
                default:
                    System.out.println("invalid number");
                    break;
            }
        }
    }
}