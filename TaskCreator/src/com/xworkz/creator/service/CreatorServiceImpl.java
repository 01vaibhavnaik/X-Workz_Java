package com.xworkz.creator.service;

import com.xworkz.creator.dto.CreatorDTO;
import com.xworkz.creator.repository.CreatorRepository;
import com.xworkz.creator.repository.CreatorRepositoryImp;

public class CreatorServiceImpl implements CreatorService{
    @Override
    public void validateAndSave(CreatorDTO creatorDTO) {
        if (creatorDTO!=null){
            System.out.println("Validated data...");
            CreatorRepository creatorRepository = new CreatorRepositoryImp();
            creatorRepository.Save(creatorDTO);
        }


    }

}
