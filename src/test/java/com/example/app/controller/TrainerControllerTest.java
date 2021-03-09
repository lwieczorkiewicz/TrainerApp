package com.example.app.controller;

import com.example.app.model.Trainers;
import com.example.app.repositories.TrainersRepositories;
import com.example.app.service.TrainersService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class TrainerControllerTest {

    @Mock
    TrainersRepositories trainersRepositories;

    @Mock
    TrainersService trainersService;

    @InjectMocks
    TrainerController trainerController;

    @Before
    public void init(){
        given(trainersService.getAllTrainers()).willReturn(prepareMockData());
    }


    @Test
    void mainPage() {
        System.out.println();
    }

   /* @Test
    void showAllTrainers() {

        List<Trainers> trainers = trainerController.showAllTrainers();

        //then
        Assert.assertThat(trainers, Matchers.hasSize(2));


    }*/

    private List<Trainers> prepareMockData(){
        List<Trainers> trainers = new ArrayList<>();
            trainers.add(new Trainers("lukas", "wieczorkiewicz", "lwiecz@wp.pl", 22223));
            trainers.add(new Trainers("dorota", "lukas", "lwiecz@de.pl", 11111));
            return trainers;
    }
}