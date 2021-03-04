package com.example.app.controller;

import com.example.app.dto.TrainersDto;
import com.example.app.service.TrainersService;
import com.example.app.users.Trainers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class TrainerController {

    private final TrainersService trainersService;

    @PostMapping
    public TrainersDto saveTrainers(@RequestBody TrainersDto trainersDto) {

        return trainersService.saveTrainers(trainersDto);
    }

    @GetMapping("/trainer")
    public String main(){
        return "index";
    }

    @GetMapping("/addTrainer")
    public String main1(){
        return "addTrainer";
    }

    @GetMapping("/allTrainers")
    public String main2(){
        return "allTrainers";
    }

    @GetMapping("/contact")
    public String main3(){
        return "contact";
    }

    @GetMapping("/updateTrainer")
    public String main4(){
        return "updateTrainer";
    }
}
