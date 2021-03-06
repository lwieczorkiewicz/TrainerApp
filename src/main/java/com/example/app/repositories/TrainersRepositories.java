package com.example.app.repositories;

import com.example.app.model.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TrainersRepositories extends JpaRepository <Trainers, UUID> {


}
