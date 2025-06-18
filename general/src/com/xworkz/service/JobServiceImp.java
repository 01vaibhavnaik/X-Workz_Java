package com.xworkz.service;

import com.xworkz.dto.JobApplicationDTO;
import com.xworkz.repository.JobRepository;
import com.xworkz.repository.JobRepositoryImp;

public class JobServiceImp implements JobService{
    @Override
    public String validate(JobApplicationDTO jobApplicationDTO) {
        System.out.println("validate methon in job service:");
        if(jobApplicationDTO!=null){
            System.out.println("values are resent");
            JobRepository jobRepository=new JobRepositoryImp();
            jobRepository.save(jobApplicationDTO);
        }
        return "fail";
    }
}
