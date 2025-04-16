package com.xwrokz.tostring.external;

public class Tree {
    private String treeName;
    private int treeLifeSpan;
    private String  treeLocated;

    public Tree(String treeName,int treeLifeSpan,String treeLocated){
        this.treeName=treeName;
        this.treeLifeSpan=treeLifeSpan;
        this.treeLocated=treeLocated;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Tree Name:"+this.treeName+" \nYear:"+this.treeLifeSpan+"\nFound In:"+this.treeLocated;
    }
    @Override
    public int hashCode(){
        return -678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tree){
            Tree tree1=this;
            Tree tree2=(Tree) obj;
            if(tree1.treeName==tree2.treeName && tree1.treeLifeSpan== tree2.treeLifeSpan && tree1.treeLocated ==tree2.treeLocated){
                return true;
            }
        }
        return false;
    }
}
