package com.xworkz.Internal;

public interface ExamRule {
    void timeToStartExam();

    void timeToStopExam();

    void timeToCheckAnswerSheet();

    default void noFakeExam() {
        System.out.println("No Fake Exam");
    }


}
