package com.oec.sdl.sample;


import com.oec.sdl.sample.Dto.EvaluationDto;
import com.oec.sdl.sample.Dto.Location;
import com.oec.sdl.sample.Dto.VehicleEventDto;
import com.oec.sdl.sample.Jsons.JsonParser;

//HTTP通信
import java.util.Date;

// データ送信の実装
public class DataSender implements IDataSender {

    @Override
    public void sendEvaluation(EvaluationType evaluationType) {

        EvaluationDto evaluationDto = new EvaluationDto();

        evaluationDto.evaluationType = evaluationType;
        evaluationDto.date = new Date(System.currentTimeMillis());

        // TODO ここで GPS と 車種を取得する（車種は将来対応？）
        evaluationDto.location  = new Location(10, 10);


        // JSON に変換
        String json = JsonParser.Parse(evaluationDto);

        System.out.println("[JSON生成<EvaluationDto>]" + json);

        doPostJson(json);
    }

    @Override
    public void sendVehicleEvent(VehicleEventType vehicleEventType) {
        VehicleEventDto vehicleEventDto = new VehicleEventDto();

        vehicleEventDto.vehicleEventType = vehicleEventType;
        vehicleEventDto.date= new Date(System.currentTimeMillis());

        // TODO ここで GPS と 車種を取得する（車種は将来対応？）
        vehicleEventDto.location  = new Location("123", "123");

        // JSON に変換
        String json = JsonParser.Parse(vehicleEventDto);

        System.out.println("[JSON生成<VehicleEventDto>]" + json);

        doPostJson(json);
    }

    @Override
    public void sendEvaluationsWithGps(EvaluationType evaluationType, String Lon, String Lat){
        EvaluationDto evaluationDto = new EvaluationDto();

        evaluationDto.evaluationType = evaluationType;
        evaluationDto.date = new Date(System.currentTimeMillis());

        // TODO ここで GPS と 車種を取得する（車種は将来対応？）
        evaluationDto.location  = new Location(Lat, Lon);

        // JSON に変換
        String json = JsonParser.Parse(evaluationDto);

        System.out.println("[JSON生成<EvaluationDto>]" + json);

        doPostJson(json);

    }

    void doPostJson(String json){
        AsyncHttpSender task = new AsyncHttpSender();
        task.execute(json);
    }
}
