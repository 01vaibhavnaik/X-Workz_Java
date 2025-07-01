package com.xworkz.service;

import com.xworkz.dto.JobApplicationDTO;

public interface JobService {

    public String validate(JobApplicationDTO jobApplicationDTO);

    default JobApplicationDTO getJobApplicationById(int id){
        return null;
    }


}
