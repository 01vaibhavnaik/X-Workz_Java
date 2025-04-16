package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Currency;
import com.xworkz.isarelation.Internal.Money;

public class StockMarket {
    public void bull(Money money){
        money.exchange();
        money.store();
        money.buyGoods();
        money.value();
        money.transfer();

        if(money instanceof Currency){
            Currency currency=(Currency) money;
            currency.stock();
        }
    }
}
