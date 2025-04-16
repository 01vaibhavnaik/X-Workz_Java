package com.xworkz.external;

import com.xworkz.Internal.GirlFriendRule;

public class Girlfriend implements GirlFriendRule {

    @Override
    public void toUnderstandGirlFriend() {
        System.out.println("Understanding the girlfriend...");
    }

    @Override
    public void toLoyaltyGirlFriend() {
        System.out.println("Being loyal to the girlfriend...");
    }

    @Override
    public void toRespectGirlFriend() {
        System.out.println("Respecting the girlfriend...");
    }
}
