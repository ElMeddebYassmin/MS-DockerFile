package com.example.jobmser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired

    private final JobInterface jobRepo;

    @Autowired
    public JobService(JobInterface jobRepo) {
        this.jobRepo = jobRepo;
    }
    public List<Job> getAllJobs(){
        return jobRepo.findAll();
    }

    public Job getJobByIdOrName(String nom, int id){
        return jobRepo.getJobByIdOrName(id, nom);
    }
}
