package com.example.app.service;

import com.example.app.model.Trainers;
import com.example.app.repositories.TrainersRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor

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

        if (optional.isPresent()) {
            trainers = optional.get();
        } else {
            throw new RuntimeException("Trainer not found on this particular id :: " + id);
        }
        return trainers;
    }

    @Override
    public void deleteTrainerById(UUID id) {
        this.trainersRepositories.deleteById(id);
    }
}
