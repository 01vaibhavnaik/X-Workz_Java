package com.xworkz.Internal;

public interface WifeRule {

    void toRespectWife();

    void toSupportWife();

    void toLoveWife();

    default void noFakeWife() {
        System.out.println("No Fake Wife");
    }


}
