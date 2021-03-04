package com.example.app.controller;

import com.example.app.dto.TrainersDto;
import com.example.app.repositories.TrainersRepositories;
import com.example.app.service.TrainersService;
import com.example.app.users.Trainers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class TrainerController {

    private final TrainersService trainersService;
    private final TrainersRepositories trainersRepositories;

    @PostMapping("/trainers")
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


  /*  @GetMapping("/addTrainer1")
    public String showTrainerForm(Trainers trainers) {
        return "add-user";
    }

    @PostMapping("/addTrainer2")
    public String addTrainer(Trainers trainers, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        trainersRepositories.save(trainers);
        return "redirect:/index";
    }

    @GetMapping("/allTrainers1")
    public String showTrainersList(Model model) {
        model.addAttribute("trainers", trainersRepositories.findAll());
        return "index";
    }*/

  /*  @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("user", user);
        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid User user,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }

        userRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userRepository.delete(user);
        return "redirect:/index";
    }*/





}
