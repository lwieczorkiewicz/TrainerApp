package com.example.app.service;

import com.example.app.model.Trainers;

import java.util.List;
import java.util.UUID;

public interface TrainerService {

    List<Trainers> getAllTrainers();

    void saveTrainer(Trainers trainers);

    Trainers getTrainersById(UUID id);

    void deleteTrainerById(UUID id);
}
