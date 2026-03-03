package study.oop.object;

import study.oop.object.chapter01.Section01.Audience;
import study.oop.object.chapter01.Section01.Bag;
import study.oop.object.chapter01.Section01.Invitation;
import study.oop.object.chapter01.Section01.Theater;
import study.oop.object.chapter01.Section01.Ticket;
import study.oop.object.chapter01.Section01.TicketOffice;
import study.oop.object.chapter01.Section01.TicketSeller;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

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