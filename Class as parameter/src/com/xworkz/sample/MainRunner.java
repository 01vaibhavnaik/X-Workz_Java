package com.xworkz.sample;

import com.xworkz.sample.RCB.Details;
import com.xworkz.sample.RCB.Final;
import com.xworkz.sample.barber.Barber;
import com.xworkz.sample.barber.Saloon;
import com.xworkz.sample.camera.Camera;
import com.xworkz.sample.camera.Lens;
import com.xworkz.sample.pillow.Pillow;
import com.xworkz.sample.pillow.Soft;
import com.xworkz.sample.rocket.Rocket;
import com.xworkz.sample.rocket.SpeedType;
import com.xworkz.sample.shop.Display;
import com.xworkz.sample.shop.Shop;
import com.xworkz.sample.space.Area;
import com.xworkz.sample.space.Volume;
import com.xworkz.sample.tablet.Dolo;
import com.xworkz.sample.tablet.Sick;
import com.xworkz.sample.theater.Poster;
import com.xworkz.sample.theater.Theater;
import com.xworkz.sample.tree.Mango;
import com.xworkz.sample.tree.Tree;

public class MainRunner {
    public static void main(String[] args) {

        Display display=new Display();
        Shop shop=new Shop();
        shop.run(display);

        System.out.println("========================================================================");

        Poster poster=new Poster();
        Theater theater=new Theater();
        theater.post(poster);

        System.out.println("========================================================================");

        Final team=new Final();
        Details details=new Details();
        details.profile(team);

        System.out.println("========================================================================");

        Volume volume=new Volume();
        Area area=new Area();
        area.run(volume);

        System.out.println("========================================================================");

        Rocket rocket=new Rocket();
        SpeedType speedType=new SpeedType();
        speedType.type(rocket);

        System.out.println("========================================================================");

        Dolo dolo=new Dolo();
        Sick sick=new Sick();
        sick.run(dolo);

        System.out.println("========================================================================");

        Barber barber=new Barber();
        Saloon saloon=new Saloon();
        saloon.run(barber);

        System.out.println("========================================================================");

        Camera camera=new Camera();
        Lens lens= new Lens();
        lens.run(camera);

        System.out.println("========================================================================");

        Mango mango=new Mango();
        Tree tree=new Tree();
        tree.run(mango);

        System.out.println("========================================================================");

        Pillow pillow=new Pillow();
        Soft soft=new Soft();
        soft.run(pillow);


    }
}
