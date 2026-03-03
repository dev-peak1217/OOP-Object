package study.oop.object.chapter01.Section01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Chapter01 - Section01");

        Invitation invitation = new Invitation();

//        Bag bag = new Bag( 1000);
        Bag bag = new Bag(invitation, 1000);
        Audience audience = new Audience(bag);

        Ticket ticket = new Ticket(100L);

        TicketOffice ticketOffice = new TicketOffice(500L, ticket);

        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Theater theater = new Theater(ticketSeller);

        theater.enter(audience);

        System.out.println("amount : " + audience.getBag().getAmount());
    }
}