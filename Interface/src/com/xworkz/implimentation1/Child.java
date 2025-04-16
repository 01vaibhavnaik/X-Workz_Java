package com.xworkz.implimentation1;

import com.xworkz.Internal.ChildrenRule;
import com.xworkz.Internal.ExamRule;

public class Child implements ChildrenRule, ExamRule {
    @Override
    public void toLoveChildren() {
        System.out.println("Love children");
    }

    @Override
    public void toPlayWithChildren() {
        System.out.println("Play with children");
    }

    @Override
    public void toTeachChildren() {
        System.out.println("Teach children");
    }

    @Override
    public void timeToStartExam() {
        System.out.println("Time to start exam");
    }

    @Override
    public void timeToStopExam() {
        System.out.println("Time to stop exam");
    }

    @Override
    public void timeToCheckAnswerSheet() {
        System.out.println("Time to check answer sheet");
    }
}
