package com.xworkz.external;

import com.xworkz.Internal.ExamRule;

public class Exam implements ExamRule {

    @Override
    public void timeToStartExam() {
        System.out.println("Time to start exam is 10:00 AM");
    }

    @Override
    public void timeToStopExam() {
        System.out.println("Time to stop exam is 1:00 PM");
    }

    @Override
    public void timeToCheckAnswerSheet() {
        System.out.println("Time to check answer sheet is 2:00 PM");
    }
}
