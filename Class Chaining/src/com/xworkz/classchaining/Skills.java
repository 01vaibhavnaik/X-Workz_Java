package com.xworkz.classchaining;

public class Skills {
    String skillName;

    Experience[] experience;

    Skills(String skillName,Experience[] experience) {
        this.skillName = skillName;
        this.experience=experience;
    }

    void skillDisplay() {
        System.out.println("Skill name " + skillName);
        for (Experience ref : experience) {
            if (ref != null) {
                ref.experienceDisplay();
            } else System.err.println("pointing to null");
        }
    }
}
