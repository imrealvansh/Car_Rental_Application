import java.util.Scanner;

class Car {
    String name;
    String model;
    int speed;
    double price;

    public Car(String name, String model, int speed, double price) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Price: Rs " + price);
    }
}

class CarRentalApplication {

    public static void displayBankNames() {
        System.out.println("1. State Bank Of India");
        System.out.println("2. ICICI Bank of India");
        System.out.println("3. Punjab National Bank Of India");
        System.out.println("4. Central Bank Of India");
        System.out.println("5. YES Bank f India");
        System.out.println("6. UCO Bank of India");
    }

    public static void displayMobileWallets() {
        System.out.println("1. Paytm");
        System.out.println("2. PhonePe");
        System.out.println("3. Google Pay");
        System.out.println("4. Amazon Pay");
        System.out.println("5. Mobiwik");
    }

    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Fortuner", 180, 50000);
        Car car2 = new Car("Honda", "City", 110, 40000);
        Car car3 = new Car("Ford", "Mustang", 160, 80000);
        Car car4 = new Car("Audi", "RS-Q8", 160, 110000);
        Car car5 = new Car("Mahindra", "Thar", 160, 50000);
        Car car6 = new Car("Mercedes", "Benz", 160, 100000);
        Car car7 = new Car("Rolls Royce", "Ghost", 250, 500000);
        Car car8 = new Car("Volkswagon", "Vento", 160, 35000);
        Car car9 = new Car("Lamborghini", "Huracan", 300, 150000);
        Car car10 = new Car("Lexus", "LS", 220, 120000);

        // Define the predefined password
        String predefinedPassword = "MyProject";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the password
        System.out.println(
                "-----------------------------------------------\n\tPlease Enter Valid Login Details");
        System.out.println("-----------------------------------------------\n");
        System.out.print("\tEnter the Password: ");
        String userPassword = scanner.nextLine();
        System.out.println();

        // Check if the user input matches the predefined password
        if (userPassword.equals(predefinedPassword)) {
            // Access granted
            System.out.println("\t\tAccess granted!\n");
            System.out.println(
                    "-----------------------------------------------\n\tBANKING CAR RENTAL APPLICATION\n\t    WELCOME TO OUR COMPANY");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Enter Toyota");
            System.out.println("2. Enter Honda");
            System.out.println("3. Enter Ford");
            System.out.println("4. Enter Audi");
            System.out.println("5. Enter Mahindra");
            System.out.println("6. Enter Mercedes");
            System.out.println("7. Enter Rolls Royce");
            System.out.println("8. Enter Volkswagon");
            System.out.println("9. Enter Lamborghini");
            System.out.println("10.Enter Lexus\n");
            System.out.print("Please Enter Your Choice: ");
            String selectedCar = scanner.nextLine();
            System.out.println("\n");

            if (selectedCar.equalsIgnoreCase(car1.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car1.name);
                System.out.println("-------------------------------------------------");
                car1.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car2.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car2.name);
                System.out.println("-------------------------------------------------");
                car2.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car3.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car3.name);
                System.out.println("-------------------------------------------------");
                car3.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car4.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car4.name);
                System.out.println("-------------------------------------------------");
                car4.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car5.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car5.name);
                System.out.println("-------------------------------------------------");
                car5.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car6.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car6.name);
                System.out.println("-------------------------------------------------");
                car6.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car7.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car7.name);
                System.out.println("-------------------------------------------------");
                car7.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car8.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car8.name);
                System.out.println("-------------------------------------------------");
                car8.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car9.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car9.name);
                System.out.println("-------------------------------------------------");
                car9.displayDetails();
            } else if (selectedCar.equalsIgnoreCase(car10.name)) {
                System.out.println("-------------------------------------------------");
                System.out.print("\tYou Have Selected - ");
                System.out.println(car10.name);
                System.out.println("-------------------------------------------------");
                car10.displayDetails();
            } else {
                System.out.println("Car not found. Please choose a valid car.");
                scanner.close();
                return;
            }
            Scanner yes_or_no = new Scanner(System.in);
            System.out.println("\n");
            System.out.print("Are you sure, you wanna rent this car?  (yes / no): ");
            String say = yes_or_no.nextLine();

            if (say.equals("yes")) {

                System.out.println("\t--------------------------------------------------");
                System.out.println("\t\t\bPLEASE PROVIDE YOUR PERSONAL DETAILS");
                System.out.println("\t--------------------------------------------------\n\n");
                System.out.println(
                        "NOTE: PROVIDE FULL NAME\nPAYMENT WON'T PROCEED IF THE GIVIN AMOUNT IS LESS THAN THE RENT OF CAR\n\n\n");
                Scanner customer_name = new Scanner(System.in);
                System.out.print("\t\tEnter Your Name : ");
                String your_name = customer_name.nextLine();

                Scanner valid_id = new Scanner(System.in);
                System.out.print("\t\tEnter Your National ID : ");
                long national_id = valid_id.nextLong();
                System.out.println("--------------------------------------------------");
                System.out.println("\t\tPayment Method:");
                System.out.println("--------------------------------------------------\n");
                Scanner paymethod = new Scanner(System.in);
                System.out.println("1. Credit card/Debit card");
                System.out.println("2. Internet Banking");
                System.out.println("3. UPI");
                System.out.println("4. Mobile Wallets");
                System.out.println("5. PayPal");

                System.out.print("Choose any one of them: ");

                // Payment Methods
                String paymentMethod = scanner.nextLine();

                switch (paymentMethod) {
                    case "Credit card":
                        displayBankNames();
                        System.out.print("Bank Name: ");
                        String bankName = scanner.nextLine();
                        System.out.print("Card Holder Name: ");
                        String CardHolderName = scanner.nextLine();
                        System.out.print("Card Number: ");
                        long CardNumber = scanner.nextLong();
                        System.out.print("Expiry Date: ");
                        int expiryDate = scanner.nextInt();
                        System.out.print("CVV Number: ");
                        int cvv = scanner.nextInt();
                        break;

                    case "Internet Banking":
                        System.out.println("Please Select Your Bank: ");
                        displayBankNames();
                        System.out.println();
                        System.out.print("Bank Name: ");
                        String BankName = scanner.nextLine();
                        System.out.print("Account Number: ");
                        long AccNum = scanner.nextLong();

                        break;
                    case "UPI":
                        System.out.print("UPI ID: ");
                        String upi = scanner.nextLine();
                        break;
                    case "Mobile Wallets":
                        System.out.println("Choose Your Wallet: ");
                        displayMobileWallets();
                        System.out.println();
                        System.out.print("Wallet Name: ");
                        String mobileWallets = scanner.nextLine();
                        System.out.print("Mobile Number: ");
                        long mobilenum = scanner.nextLong();
                        break;
                    case "PayPal":
                        System.out.print("PayPal ID: ");
                        String paypalId = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Invalid payment method");
                }

                System.out.print("Payment Amount:");
                double amountPaid = scanner.nextDouble();
                System.out.println("\n");
                if (amountPaid == car1.price || amountPaid == car2.price || amountPaid == car3.price
                        || amountPaid == car4.price || amountPaid == car5.price || amountPaid == car6.price
                        || amountPaid == car7.price || amountPaid == car8.price || amountPaid == car9.price
                        || amountPaid == car10.price) {
                    if (amountPaid == car1.price || amountPaid == car2.price || amountPaid == car3.price
                            || amountPaid == car4.price || amountPaid == car5.price || amountPaid == car6.price
                            || amountPaid == car7.price || amountPaid == car8.price || amountPaid == car9.price
                            || amountPaid == car10.price) {
                        System.out.println("\t--------------------------------------------------");
                        System.out.println("\t\tPROCESS HAS BEEN DONE SUCCESSFULLY\n\n" + "\t\tThank You, "
                                + your_name + "\n\n" + "\t\t\tEnjoy The Drive !!!");
                        System.out.println("\t--------------------------------------------------");

                    } else {
                        System.out.println("Not Available At This Price !");
                    }
                }
            } else if (say.equals("no")) {
                System.out.println("Thanks For Visiting !");
            }
        } else {
            // Access denied
            System.out.println("Access denied!");
        }

        // Close the scanner
        scanner.close();
    }
}
