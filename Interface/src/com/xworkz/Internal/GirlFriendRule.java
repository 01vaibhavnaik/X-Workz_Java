package com.xworkz.Internal;

public interface GirlFriendRule {

    void toUnderstandGirlFriend();

    void toLoyaltyGirlFriend();

    void toRespectGirlFriend();

    default void noFakeGf(){
        System.out.println("no Fake Gf");
    }
}
