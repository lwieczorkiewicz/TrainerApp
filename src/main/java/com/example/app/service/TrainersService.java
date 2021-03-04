package com.example.app.service;

import com.example.app.dao.TrainersDao;
import com.example.app.dto.TrainersDto;
import com.example.app.repositories.TrainersRepositories;
import com.example.app.users.Trainers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TrainersService {

    private final TrainersDao trainersDao;
    private final TrainersRepositories trainersRepositories;


    @Transactional
    public TrainersDto saveTrainers(TrainersDto trainersDto){

        Trainers trainers = new Trainers(trainersDto.getName(), trainersDto.getLastName(),
                trainersDto.getEmail(), trainersDto.getPhoneNumber());

        Trainers savedTrainers = trainersRepositories.save(trainers);

        return  new TrainersDto(savedTrainers.getId(), savedTrainers.getName(), savedTrainers.getLastName(),
                savedTrainers.getEmail(), savedTrainers.getPhoneNumber());
    }

}
