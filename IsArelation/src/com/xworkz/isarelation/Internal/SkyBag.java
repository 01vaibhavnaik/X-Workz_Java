package com.xworkz.isarelation.Internal;

public class SkyBag extends Bag{
    public SkyBag(){
        System.out.println("no arg cont Sky Bag");
    }
    @Override
    public void bagType(){
        System.out.println("Running bagType updated");
    }
    @Override
    public void bagBrand(){
        System.out.println("Running bagBrand updated");
    }
    @Override
    public void bagPrice(){
        System.out.println("Running bagPrice updated");
    }
    @Override
    public void bagQty(){
        System.out.println("Running bagQty updated");
    }
    public void bagStyle(){
        System.out.println("Running bagStyle");
    }
}
