package com.xworkz.isarelation.Internal;

public class SingleBed extends Bed{
    public SingleBed(){
        System.out.println("no ag cont of single bed");
    }
    @Override
    public void bedType(){
        System.out.println("Running Bed Type updated");
    }
    @Override
    public void bedPrice(){
        System.out.println("Running Bed Price updated");

    }
    @Override
    public void bedQty(){
        System.out.println("Running Bed Qty updated");

    }
    @Override
    public void bedMfd(){
        System.out.println("Running Bed Mfd updated");
    }
    public void bedSize(){
        System.out.println("Running bedSize");
    }
}
