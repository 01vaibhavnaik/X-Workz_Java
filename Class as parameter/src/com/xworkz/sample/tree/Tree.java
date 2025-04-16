package com.xworkz.sample.tree;

public class Tree {
    public void  run(Mango mango){
        System.out.println("Running run in tree");
        if(mango!=null){
            mango.tree();
        }else {
            System.out.println("pointing to null");
        }
    }
}
