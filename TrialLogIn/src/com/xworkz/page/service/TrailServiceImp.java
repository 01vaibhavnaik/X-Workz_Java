package com.xworkz.page.service;

import com.xworkz.page.dto.TrailDTO;
import com.xworkz.page.repository.TrailRepository;
import com.xworkz.page.repository.TrailRepositoryImp;

public class TrailServiceImp implements TrailService {

    @Override
    public void validate(TrailDTO trailDTO) {
        if (trailDTO != null) {
            System.out.println("Validated data...");

            TrailRepository trailRepository = new TrailRepositoryImp();
            trailRepository.save(trailDTO);
        }


    }
}
