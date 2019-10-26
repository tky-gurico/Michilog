package com.oec.sdl.sample.Jsons;

import com.google.gson.Gson;
import com.oec.sdl.sample.Dto.EvaluationDto;
import com.oec.sdl.sample.Dto.VehicleEventDto;

public class JsonParser {
    public static String Parse(EvaluationDto evaluationDto){
        return new Gson().toJson(evaluationDto);
    }

    public static String Parse(VehicleEventDto vehicleEventDto){
        return new Gson().toJson(vehicleEventDto);
    }
}
