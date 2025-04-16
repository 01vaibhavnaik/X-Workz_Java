package com.xwrokz.tostring.external;

public class School {

    private String studentName;
    private String subject;
    private int standard;

    public School(String studentName,String subject,int standard){
        this.studentName=studentName;
        this.subject=subject;
        this.standard=standard;
        System.out.println("String,String,Int arg cont Running");
    }
    @Override
    public String toString(){
        return "Student Name:"+this.studentName+" \nSubject:"+this.subject+"\nStandard:"+this.standard;
    }
    @Override
    public int hashCode(){
        return -7654569;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof School){
            School school1=this;
            School school2=(School) obj;
            if(school1.studentName== school2.studentName && school1.subject== school2.subject && school1.standard==school2.standard){
                return true;
            }
        }
        return false;
    }


}
