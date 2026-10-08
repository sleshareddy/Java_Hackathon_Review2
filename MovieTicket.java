import java.util.*;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5)
            return calculateTotal() * 0.10;
        else
            return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n--- Cinema Ticket Bill ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " +ticketPrice);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.printf("Discount: "+ calculateDiscount());
        System.out.printf("Final Amount: " +calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        MovieTicket m = new MovieTicket(name, price, tickets);

        m.displayBill();
    }
}