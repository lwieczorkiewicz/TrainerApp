package com.example.app.controller;

import com.example.app.model.Trainers;
import com.example.app.service.TrainersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class TrainerController {

    @Autowired
    private final TrainersService trainersService;

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "/contact";
    }

    @GetMapping("/allTrainers")
    public String showAllTrainers(Model model) {
        model.addAttribute("listTrainers", trainersService.getAllTrainers());
        return "allTrainers";
    }

    @GetMapping("/addTrainerForm")
    public String addTrainerForm(Model model) {
        Trainers trainers = new Trainers();
        model.addAttribute("trainers", trainers);
        return "addTrainer";
    }

    @PostMapping("/saveTrainer")
    public String saveTrainer(@Valid @ModelAttribute("trainers") Trainers trainers, BindingResult result) {
        if (result.hasErrors()) {
            return "addTrainer";
        } else
            trainersService.saveTrainer(trainers);
            return "redirect:/allTrainers";
    }

    @GetMapping("/updateForm/{id}")
    public String updateForm(@PathVariable(value = "id") UUID id, Model model) {
        Trainers trainers = trainersService.getTrainersById(id);
        model.addAttribute("trainers", trainers);
        return "updateTrainer";
    }

    @GetMapping("/deleteTrainers/{id}")
    public String deleteTrainers(@PathVariable(value = "id") UUID id) {
        this.trainersService.deleteTrainerById(id);
        return "redirect:/allTrainers";
    }
}
