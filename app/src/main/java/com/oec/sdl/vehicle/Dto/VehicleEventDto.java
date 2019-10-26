package com.oec.sdl.vehicle.Dto;

import com.oec.sdl.vehicle.VehicleEventType;

import java.util.Date;

public class VehicleEventDto {
    // 発生時刻
    public Date date;
    // GPSから得たロケーション情報
    public Location location;
    // 車種
    public String vehicleType;
    // イベントタイプ
    public VehicleEventType vehicleEventType;
}
