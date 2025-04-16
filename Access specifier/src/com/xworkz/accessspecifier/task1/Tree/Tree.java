package com.xworkz.accessspecifier.task1.Tree;

public class Tree {
    public String branch;
    private String UseInMedicine;
    String treeType;

    public Tree(String branch,String UseInMedicine,String treeType) {
       this.treeType=treeType;
       this.branch=branch;
       this.UseInMedicine=UseInMedicine;
    }

    public void show(){
        System.out.println(this.treeType);
        System.out.println(this.UseInMedicine);
        System.out.println(this.branch);
    }
    private void show1(){
        System.out.println("private");

    }
    void show2(){
        System.out.println("void method");
        show1();

    }



}
