package com.oec.sdl.vehicle.Jsons;

import com.google.gson.Gson;
import com.oec.sdl.vehicle.Dto.EvaluationDto;
import com.oec.sdl.vehicle.Dto.VehicleEventDto;

public class JsonParser {
    public static String Parse(EvaluationDto evaluationDto){
        return new Gson().toJson(evaluationDto);
    }

    public static String Parse(VehicleEventDto vehicleEventDto){
        return new Gson().toJson(vehicleEventDto);
    }
}
