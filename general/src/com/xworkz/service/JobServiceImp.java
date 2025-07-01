package com.xworkz.service;

import com.xworkz.dto.JobApplicationDTO;
import com.xworkz.repository.JobRepository;
import com.xworkz.repository.JobRepositoryImp;

public class JobServiceImp implements JobService{
    @Override
    public String validate(JobApplicationDTO jobApplicationDTO) {
        System.out.println("validate method in job service:");
        if(jobApplicationDTO!=null){
            String name = jobApplicationDTO.getName();
            if(name==null||  name.length()<3 || name.length()>20){
                return "Please enter a valid name";
            }
            System.out.println("values are resent");
            JobRepository jobRepository=new JobRepositoryImp();
            jobRepository.save(jobApplicationDTO);
        }
        return "data is saved successfully";
    }

    @Override
    public JobApplicationDTO getJobApplicationById(int id) {
        if (id <= 0) {
            System.out.println("Invalid ID provided: ");

        }
        return null;
    }
}
