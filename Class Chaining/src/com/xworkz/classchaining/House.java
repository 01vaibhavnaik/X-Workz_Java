package com.xworkz.classchaining;

    public class House {
        String houseName;
        Room[] rooms;
        Portfolio[] portfolio;
        HouseKeeping[] housekeeps;

        House(Portfolio[] portfolio,String houseName,HouseKeeping[] houseKeeps,Room[] rooms){
            this.portfolio=portfolio;
            this.houseName=houseName;

            this.housekeeps=houseKeeps;
            this.rooms=rooms;
        }

        void houseDisplay(){
            for(Portfolio ref:portfolio){
                if(ref!=null){
                    ref.portfolioDisplay();
                }else System.err.println("Pointing to null");
            }
            System.out.println("House Name"+this.houseName);
            for(HouseKeeping ref:housekeeps){
                if(ref!=null){
                    ref.housekeeperDisplay();
                }else System.err.println("Pointing to null");
            }
            for(Room ref:rooms){
                if(ref!=null){
                    ref.roomDisplay();
                }else System.err.println("pointing to null");
            }
        }

}
