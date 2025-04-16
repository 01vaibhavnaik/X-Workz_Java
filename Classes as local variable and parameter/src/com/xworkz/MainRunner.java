package com.xworkz;

import com.xworkz.Alien.Alien;
import com.xworkz.Alien.ufo;
import com.xworkz.Jail.Jail;
import com.xworkz.Jail.Theif;
import com.xworkz.Camera.Camera;
import com.xworkz.Camera.Sony;
import com.xworkz.Camera.CameraType;


public class MainRunner {
    public static void main(String[] args) {
        Alien alien=new Alien();
        alien.setSeenBy("sank");

        Alien alien1=new Alien();
        alien1.setDescribe("sankalp");
        Alien alien2=new Alien();
        alien2.setDescribe("sonu");
        Alien[] aliens={alien1,alien2};
        ufo uf=new ufo();
        uf.fly(alien);
        uf.land(aliens);
        uf.spot();
        uf.caught();
        System.out.println("=========================================================");
        Jail jail=new Jail();
        jail.setName("BSG Jail");
        jail.setTotalCells(100);
        Jail jail1=new Jail();
        jail1.setJailerName("Ramesh");
        Jail jail2=new Jail();
        jail2.setJailerName("Umesh");
        Jail[] jails={jail1,jail2};
        Theif theif = new Theif(jail);
        if(theif!=null) {
            theif.theifJailLocation();
            theif.theifJailName();
            theif.noOfCells(jail);
            theif.jailer(jails);
        }else System.err.println("Pointing to null");

        System.out.println("=========================================================");

        Camera camera=new Camera();
        camera.setBrand("Sony");

        CameraType type1=CameraType.DSLR;
        CameraType type2=CameraType.SLR;

        Camera camera1=new Camera();
        camera1.setType(type1);
        Camera camera2=new Camera();
        camera2.setType(type2);
        Camera[] cameras={camera1,camera2};

        Sony sony=new Sony();
        sony.click(camera);
        sony.flash(cameras);
        sony.record();
        sony.snap();
    }

}
