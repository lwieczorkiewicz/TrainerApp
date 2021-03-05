package com.example.app.service;

import com.example.app.dto.TrainersDto;
import com.example.app.repositories.TrainersRepositories;
import com.example.app.users.Trainers;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class TrainersService implements TrainerService {

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

    @Override
    public Trainers getTrainersById(UUID id) {
        Optional<Trainers> optional = trainersRepositories.findById(id);
        Trainers trainers = null;
        if(optional.isPresent()){
            trainers = optional.get();
        }else{
            throw new RuntimeException("Trainer not found by id  " + id);
        }
        return trainers;
    }


    /* @Transactional
     public TrainersDto saveTrainers(TrainersDto trainersDto){

         Trainers trainers = new Trainers(trainersDto.getName(), trainersDto.getLastName(),
                 trainersDto.getEmail(), trainersDto.getPhoneNumber());

         Trainers savedTrainers = trainersRepositories.save(trainers);

         return  new TrainersDto(savedTrainers.getId(), savedTrainers.getName(), savedTrainers.getLastName(),
                 savedTrainers.getEmail(), savedTrainers.getPhoneNumber());
     }*/
}
