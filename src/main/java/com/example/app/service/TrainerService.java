package com.example.app.service;

import com.example.app.model.Trainers;

import java.util.List;

public interface TrainerService {

    List<Trainers> getAllTrainers();

    void saveTrainer(Trainers trainers);
}
