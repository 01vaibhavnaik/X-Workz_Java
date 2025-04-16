package com.xworkz.accessspecifier.task2.Runner;

public class demo {
    public String Tree;
    String branch;
    private String leaves="Green";

    private void leavesDisplay(String leaves){
        System.out.println("Private Display:"+leaves);
    }
    public void demoDisplay(String Tree){
        System.out.println("Display:"+Tree);
    }
    void branch(String branch){
        System.out.println("Branch:"+branch);
    }

//    public static void main(String[] args) {
//        demo dem=new demo();
//        dem.leavesDisplay("Green");
//    }

}
