package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.College;
import com.xworkz.isarelation.Internal.Standard;

public class Student {
    public void students(College college){
        college.studentStd();
        college.studentNSub();
        college.studentPercentage();

        if (college instanceof Standard){
            Standard standard=(Standard) college;
            standard.studentAdd();

        }

    }
}
