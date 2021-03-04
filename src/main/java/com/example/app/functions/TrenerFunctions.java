/*package com.example.app.functions;

import com.example.app.dto.TrainersDto;
import com.example.app.users.Trainers;

import java.util.function.Function;

public class TrenerFunctions {

    public static class TrenerFunctions {

        private static final Function<Trainers, TrainersDto> trainersToTrainersDTO = trainers ->  new TrainersDto(

                trainers.getName(),
                trainers.getLastName(),
                trainers.getEmail(),
                trainers.getPhoneNumber()
        );

        public static final Function<TrainersDto, Trainers> TrainersDTOToTrainers  = trainersDto -> new Trainers(

                trainersDto.getName(),
                trainersDto.getLastName(),
                trainersDto.getEmail(),
                trainersDto.getPhoneNumber()

        );
    }

}*/
