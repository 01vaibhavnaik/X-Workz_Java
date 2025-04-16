package com.xworkz.implimentation1;

import com.xworkz.Internal.BagRule;
import com.xworkz.Internal.BottelRule;

public class Shop implements BagRule, BottelRule {

    @Override
    public void timeToPackBag() {
        System.out.println("timeToPackBag");
    }

    @Override
    public void timeToUnpackBag() {
        System.out.println("timeToUnpackBag");
    }

    @Override
    public void timeToCarryBag() {
        System.out.println("timeToCarryBag");
    }
    @Override
    public void timeToEmptyBottel(){
        System.out.println("timeToEmptyBottel");
    }
    @Override
    public void timeToCleanBottel(){
        System.out.println("timeToCleanBottel");
    }
    @Override
    public void timeToCheckBottel(){
        System.out.println("timeToCheckBottel");
    }


}
