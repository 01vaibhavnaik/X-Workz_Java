package com.xwrokz.tostring.external;

public class Games {
    private String gameName;
    private String location ;
    private String gameTime;

    public Games(String gameName,String location,String gameTime){
        this.gameName=gameName;
        this.location=location;
        this.gameTime=gameTime;
        System.out.println("String ,String, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Game Name:"+this.gameName+" \nLocation:"+this.location+"\nGame Time:"+this.gameTime;
    }
    @Override
    public int hashCode(){
        return 987;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Games){
            Games games1=this;
            Games games2=(Games) obj;
            if(games1.gameName==games2.gameName){
                return true;
            }
        }
        return false;
    }
}
