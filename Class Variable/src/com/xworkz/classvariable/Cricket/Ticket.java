package com.xworkz.classvariable.Cricket;

public class Ticket {
    int cost;
    TicketType type;

    void buy(int cost){

        System.out.println("Buy a Ticket:"+cost);
    }
    void sell(TicketType type){

        System.out.println("Sell a Ticket: "+type);
    }
}
