package com.xworkz.isarelation.Internal;

public class IPL extends Tournament{
    public IPL(){
        System.out.println("no arg cont");
    }
    @Override
    public void organize(){
        System.out.println("Running organize updated");
    }
    @Override
    public void teamsParticipate(){
        System.out.println("Running teamsParticipate updated");
    }
    @Override
    public void scheduleMatches(){
        System.out.println("Running scheduleMatches updated");
    }
    @Override
    public void declareWinner(){
        System.out.println("Running declareWinner updated");
    }
    public void dream11(){
        System.out.println("Running dream11");
    }
}
