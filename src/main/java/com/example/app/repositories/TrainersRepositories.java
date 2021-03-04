package com.example.app.repositories;

import com.example.app.users.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainersRepositories extends JpaRepository <Trainers, UUID> {

}
