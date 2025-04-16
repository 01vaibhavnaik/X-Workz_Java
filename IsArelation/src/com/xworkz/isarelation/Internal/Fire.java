package com.xworkz.isarelation.Internal;

public class Fire extends Element{
    public Fire(){
        System.out.println("no arg cont");
    }
    @Override
    public void existInNature(){
        System.out.println("Running existInNature updated");
    }
    @Override
    public void combineWithOtherElements(){
        System.out.println("Running combineWithOtherElements updated");
    }
    @Override
    public void hasAtomicStructure(){
        System.out.println("Running hasAtomicStructure updated");
    }
    @Override
    public void classifiedByType(){
        System.out.println("Running classifiedByType updated");
    }
    @Override
    public void periodicTablePresence(){
        System.out.println("Running periodicTablePresence updated");
    }
    public void harmfull(){
        System.out.println("Running harm");
    }
}
