package com.example.app.controller;

import com.example.app.model.Trainers;
import com.example.app.service.TrainersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class TrainerController {

    @Autowired
    private final TrainersService trainersService;

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "/contact";
    }

    // displays list of trainers
    @GetMapping("/allTrainers")
    public String showHomePage(Model model){
        model.addAttribute("listTrainers", trainersService.getAllTrainers());
        return "allTrainers";
    }

    @GetMapping("/addTrainerForm")
    public String addTrainerForm(Model model){
        Trainers trainers = new Trainers();
        model.addAttribute("trainers", trainers);
        return "addTrainer";
    }

    @PostMapping("/saveTrainer")
    public String saveTrainer(@ModelAttribute("trainers") Trainers trainers){
        trainersService.saveTrainer(trainers);
        return "redirect:/allTrainers";
    }

    @GetMapping("/updateForm/{id}")
    public String updateForm(@PathVariable(value = "id") UUID id, Model model){
        Trainers trainers = trainersService.getTrainersById(id);
        model.addAttribute("trainers", trainers);
        return "updateTrainer";

    }













  /*  @PostMapping("/trainers")
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
    public String main2(Model model){
        model.addAttribute("trainers", new Trainers());
        return "allTrainers";
    }

    @GetMapping("/zadanie07")
    public String main(Model model){
        model.addAttribute("student", new Student());
        return "zadanie07/index";
    }



    @PostMapping("addTrainer")
    public String save(@Valid Trainers trainers, BindingResult result){
        System.out.println(trainers);

        if (result.hasErrors()){
            return "addTrainer";
        }

        return "thanks";
    }







    @GetMapping("/contact")
    public String main3(){
        return "contact";
    }

    @GetMapping("/updateTrainer")
    public String main4(){
        return "updateTrainer";
    }


    @GetMapping("/addTrainer1")
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
    }

    @GetMapping("/edit/{id}")
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
    }
*/




}
