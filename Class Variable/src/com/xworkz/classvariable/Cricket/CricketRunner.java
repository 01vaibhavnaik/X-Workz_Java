package com.xworkz.classvariable.Cricket;

public class CricketRunner {
    public static void main(String[] args) {

        Cricket cricket1=new Cricket();
        cricket1.watch();
        cricket1.profit();

        Ticket ticket1=new Ticket();
        ticket1.buy(8);
        ticket1.sell(TicketType.TICKET);

        Ticket ticket2=new Ticket();
        ticket2.buy(38);
        ticket1.sell(TicketType.SCAN);

    }
}
