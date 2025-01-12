package com.oec.sdl.vehicle;

// サーバーへデータを送信するインターフェイス
public interface IDataSender {
    // 評価を送信
    void sendEvaluation(EvaluationType evaluationType);

    // SDL由来の車に関するイベントを送信
    void sendVehicleEvent(VehicleEventType vehicleEventType);

    void sendEvaluationsWithGps(EvaluationType evaluationType,String lon,String lat);

    void sendVehicleEventWithGps(VehicleEventType vehicleEventType,String lon,String lat);
}
