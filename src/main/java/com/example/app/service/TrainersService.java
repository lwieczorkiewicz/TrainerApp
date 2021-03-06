package com.example.app.service;

import com.example.app.model.Trainers;
import com.example.app.repositories.TrainersRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TrainersService implements TrainerService{

    @Autowired
    private TrainersRepositories trainersRepositories;

    @Override
    public List<Trainers> getAllTrainers() {
        return trainersRepositories.findAll();
    }

    @Override
    public void saveTrainer(Trainers trainers) {
        this.trainersRepositories.save(trainers);
    }


   /* @Transactional
    public TrainersDto saveTrainers(TrainersDto trainersDto){

        Trainers trainers = new Trainers(trainersDto.getName(), trainersDto.getLastName(),
                trainersDto.getEmail(), trainersDto.getPhoneNumber());

        Trainers savedTrainers = trainersRepositories.save(trainers);

        return  new TrainersDto(savedTrainers.getId(), savedTrainers.getFirstName(), savedTrainers.getLastName(),
                savedTrainers.getEmail(), savedTrainers.getPhoneNumber());
    }*/

}
