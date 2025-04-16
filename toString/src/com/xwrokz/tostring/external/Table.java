package com.xwrokz.tostring.external;

public class Table {
    private String tableType;
    private int tablePrice;
    private String  tableColor;

    public Table(String tableType,int tablePrice,String tableColor){
        this.tableType=tableType;
        this.tablePrice=tablePrice;
        this.tableColor=tableColor;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Table Company:"+this.tableType+" \nTable Price:"+this.tablePrice+"Rs"+"\nTable Color:"+this.tableColor;
    }
    @Override
    public int hashCode(){
        return 23465;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Table){
            Table table1=this;
            Table table2=(Table) obj;
            if(table1.tableType==table2.tableType && table1.tablePrice== table2.tablePrice && table1.tableColor ==table2.tableColor){
                return true;
            }
        }
        return false;
    }
}
