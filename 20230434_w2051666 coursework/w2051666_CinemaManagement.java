import java.util.Scanner;

public class w2051666_CinemaManagement {


private static int[][] allseats = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    private static boolean founded = false;


    private static Ticket[] array = new Ticket[48];
    private static int ticketCount = 0;
    private static int price;



    public static void main(String[] args) {
        boolean exit = false;
        System.out.println();
        System.out.println("‘Welcome to The London Lumiere’");



        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("              Please select an Option               ");
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println("1) Buy a seat");
        System.out.println("2) Cancel a seat");
        System.out.println("3) See seating plan");
        System.out.println("4) Find first seat available");
        System.out.println("5) Print tickets information and total sales");
        System.out.println("6) Search tickets");
        System.out.println("7) Sort Ticket by price");
        System.out.println("8) Quit");
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("  ");

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please select an option: ");
            while (!sc.hasNextInt()) {
                System.out.println("Inger required.");
                sc.next();
            }
            int option = sc.nextInt();
            if (option <= 8 && option >= 1) {
                switch (option) {
                    case 1:
                        buy_seat ();
                        break;
                    case 2:
                        cancel_seat();
                        break;
                    case 3:
                        print_seating_area();
                        break;
                    case 4:
                        find_first_available();
                        break;
                    case 5:
                        print_tickets_info();
                        break;
                    case 6:
                        sort_ticket();
                        break;
                    case 7:
                        search_ticket();
                        break;
                    case 8:
                        exit = true;
                        break;

                }
            } else {
                System.out.println("Enter a Number Between 1-8: ");
            }

            if (!exit) {
                System.out.println("‘Welcome to The London Lumiere’");



                System.out.println();
                System.out.println("------------------------------------------------------");
                System.out.println("              Please select an Option               ");
                System.out.println("------------------------------------------------------");
                System.out.println();
                System.out.println("1) Buy a seat");
                System.out.println("2) Cancel a seat");
                System.out.println("3) See seating plan");
                System.out.println("4) Find first seat available");
                System.out.println("5) Print tickets information and total sales");
                System.out.println("6) Search tickets");
                System.out.println("7) Sort Ticket by price");
                System.out.println("8) Quit");
                System.out.println();
                System.out.println("------------------------------------------------------");
                System.out.println("  ");
            }
        } while (!exit);
    }


    private static void buy_seat() {
        boolean exit = true;
        Scanner sc1 = new Scanner(System.in);
        while (exit) {

            System.out.print("Enter Row Number: ");

            while (!sc1.hasNextInt()) {
                System.out.println("Select a row: ");
                sc1.next();
            }
            int row = sc1.nextInt();
            if (!(1 <= row && row <= 3)) {
                continue;
            }

            while (true) {
                System.out.print("Enter seat Number: ");
                while (!sc1.hasNextInt()) {
                    System.out.println("Integer Required: ");
                    sc1.next();
                }
                int seatNumber = sc1.nextInt();
                if (row == 1) {
                    price = 200;
                } else if (row == 2) {
                    price = 150;
                } else {
                    price = 180;
                }
                if (seatNumber <= 16 && seatNumber >= 1) {
                    if (row == 1 && allseats[0][seatNumber - 1] == 0) {
                        allseats[0][seatNumber - 1] = 1;
                        System.out.println("You booked Row " + row + " Seat " + seatNumber);
                        ;
                        System.out.print("Enter your Name: ");
                        String name = sc1.next();
                        System.out.print("Enter your Surname: ");
                        String surname = sc1.next();
                        System.out.print("Enter your Email: ");
                        String email = sc1.next();
                        Person p = new Person(name, surname, email);
                        Ticket t = new Ticket(1, seatNumber, price, p);
                        array[ticketCount] = t;
                        ticketCount++;
                        exit =false;
                        break;
                    } else if (row == 2 && allseats[1][seatNumber - 1] == 0) {
                        allseats[1][seatNumber - 1] = 1;
                        System.out.println("You booked Row " + row + " Seat " + seatNumber);
                        System.out.print("Enter your Name: ");
                        String name = sc1.next();
                        System.out.print("Enter your Surname: ");
                        String surname = sc1.next();
                        System.out.print("Enter your Email: ");
                        String email = sc1.next();
                        Person p = new Person(name, surname, email);
                        Ticket t = new Ticket(2, seatNumber, price, p);
                        array[ticketCount] = t;
                        ticketCount++;
                        exit =false;
                        break;
                    } else if (row == 3 && allseats[2][seatNumber - 1] == 0) {
                        allseats[2][seatNumber - 1] = 1;
                        System.out.println("You booked Row " + row + " Seat " + seatNumber);
                        System.out.print("Enter your Name: ");
                        String name = sc1.next();
                        System.out.print("Enter your Surname: ");
                        String surname = sc1.next();
                        System.out.print("Enter your Email: ");
                        String email = sc1.next();
                        Person p = new Person(name, surname, email);
                        Ticket t = new Ticket(3, seatNumber, price, p);
                        array[ticketCount] = t;
                        ticketCount++;
                        exit =false;
                        break;
                    } else {
                        System.out.println("Seat is not available");
                        exit =false;
                        break;
                    }

                } else {
                    System.out.println("Number should be in between 1-14");
                }

            }
    }
    }


    private static void cancel_seat() {
        boolean exit = true;
        Scanner sc1 = new Scanner(System.in);
        while (exit) {

            System.out.print("Enter Row Number: ");

            while (!sc1.hasNextInt()) {
                System.out.println("Select a row: ");
                sc1.next();
            }
            int row = sc1.nextInt();
            if (!(1 <= row && row <= 3)) {
                continue;
            }

            while (true) {
                System.out.print("Enter seat Number: ");
                while (!sc1.hasNextInt()) {
                    System.out.println("Integer Required: ");
                    sc1.next();
                }
                int seatNumber = sc1.nextInt();
                if (row == 1) {
                    price = 200;
                } else if (row == 2) {
                    price = 150;
                } else {
                    price = 180;
                }
                if (seatNumber <= 16 && seatNumber >= 1) {
                    if (row == 1 && allseats[0][seatNumber - 1] == 1) {
                        allseats[0][seatNumber - 1] = 0;
                        System.out.println("You cancelled Row " + row + " Seat " + seatNumber);
                        for (int i = 0; i < ticketCount; i++) {
                            Ticket ticket = array[i];
                            if (ticket.getRow()==row && ticket.getSeat() == seatNumber) {
                                for (int k = i; k < ticketCount; k++) {
                                    array[k] = array[k + 1];
                                }
                            }
                        }
                        ticketCount--;
                        exit = false;
                        break;
                    } else if (row == 2 && allseats[1][seatNumber - 1] == 1) {
                        allseats[1][seatNumber - 1] = 0;
                        System.out.println("You cancelled Row " + row + " Seat " + seatNumber);
                        for (int i = 0; i < ticketCount; i++) {
                            Ticket ticket = array[i];
                            if (ticket.getRow() == row && ticket.getSeat() == seatNumber) {
                                for (int k = i; k < ticketCount; k++) {
                                    array[k] = array[k + 1];
                                }
                            }
                        }
                        ticketCount--;
                        exit = false;
                        break;
                    } else if (row == 3 && allseats[2][seatNumber - 1] == 1) {
                        allseats[2][seatNumber - 1] = 0;
                        System.out.println("You cancelled Row " + row + " Seat " + seatNumber);
                        for (int i = 0; i < ticketCount; i++) {
                            Ticket ticket = array[i];
                            if (ticket.getRow() == row && ticket.getSeat() == seatNumber) {
                                for (int k = i; k < ticketCount; k++) {
                                    array[k] = array[k + 1];
                                }
                            }
                        }
                        ticketCount--;
                        exit = false;
                        break;
                    } else {
                        System.out.println("Seat is already available");
                        exit = false;
                        break;
                    }

                } else {
                    System.out.println("Number should be in between 1-14");
                }

            }
        }
    }





    private static void find_first_available() {
        for (int i = 0; i < allseats.length; i++) {
            for (int j = 0; j < allseats[i].length; j++) {
                if (allseats[i][j] == 0) {
                    founded = true;
                    if (i == 0) {
                        System.out.println("Row 1 Column " + (j + 1) + " seat is available");
                        break;
                    } else if (i == 1) {
                        System.out.println("Row 2 Column " + (j + 1) + " seat is available");
                        break;
                    } else {
                        System.out.println("Row 3 Column " + (j + 1) + " seat is available");
                        break;
                    }
                }
            }
            if (founded) {
                break;
            }
        }
    }
    private static void print_seating_area() {

        System.out.println("*********************************");
        System.out.println("*             Screen            *");
        System.out.println("*********************************");
        System.out.println(" ");

        for (int i =0; i< allseats.length; i++) {
            for (int j=0; j<allseats[i].length; j++) {
                if (j==8){
                    System.out.print(" ");
                    if (allseats[i][j] == 0) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                }else {
                    if (allseats[i][j] == 0) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                }

            }
            System.out.println();
        }


    }


    private static void print_tickets_info(){
        int total = 0;
        for (Ticket ticket : array) {
            if (ticket == null) {
                break;
            } else {
                ticket.printTicketsInfo();
                total += ticket.getPrice();
            }

        }
        System.out.println("Total Price: £"+total);
    }


    private static void search_ticket() {
        Scanner scanner3 = new Scanner(System.in);
        boolean exit = false;
        boolean quit = true;
        while (quit) {

            System.out.print("Enter Row Number: ");

            while (!scanner3.hasNextInt()) {
                System.out.println("Select a row: ");
                scanner3.next();
            }
            int row = scanner3.nextInt();
            if (!(1 <= row && row <= 3)) {
                continue;
            }
            while (true) {
                System.out.print("Enter Seat Number: ");
                while (!scanner3.hasNextInt()) {
                    System.out.println("Integer Required: ");
                    scanner3.next();
                }

                int seatNumber = scanner3.nextInt();
                if (seatNumber <= 16 && seatNumber >= 1) {
                    for (Ticket t : array) {
                        if (t == null) {
                            exit = true;
                            break;
                        } else {
                            if (t.getRow() == row && t.getSeat() == seatNumber) {
                                t.printTicketsInfo();
                                System.out.println("This seat is not available.");
                                exit = true;
                                break;
                            }
                        }
                    }
                    if (exit) {
                        quit = false;
                        break;
                    }
                    System.out.println("This seat is available.");
                    quit = false;
                    break;

                } else {
                    System.out.println("Number should be in between 1-" + 16 + ": ");
                }
            }
        }
    }

    public static void sort_ticket(){
        int number = array.length -2;
        Ticket temp;
        boolean exchange = true;

        while (exchange){
            exchange = false;
            for (int i = 0; i <= number; i++){
                if (array[i] == null || array[i+1]==null){
                    break;
                } else if (array[i].getPrice() < array[i+1].getPrice()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    exchange =true;
                }
            }
            number--;
        }
        for (Ticket ticket: array){
            if (ticket==null){
                break;
            }else{
                ticket.printTicketsInfo();
                System.out.println();
            }
        }
    }
}