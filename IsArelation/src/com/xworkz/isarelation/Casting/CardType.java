package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Card;
import com.xworkz.isarelation.Internal.CreditCard;

public class CardType {
    public void cards(Card card){
        card.expire();
        card.insert();
        card.swipe();
        card.validate();

        if(card instanceof CreditCard){
            CreditCard creditCard=(CreditCard) card;
            creditCard.debit();
        }
    }
}
