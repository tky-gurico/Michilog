package com.oec.sdl.vehicle.Dto;

import com.oec.sdl.vehicle.EvaluationType;
import java.util.Date;

public class EvaluationDto {
    // 発生時刻
    public Date date;
    // GPSから得たロケーション情報
    public Location location;
    // 車種
    public String vehicleType;
    // 評価
    public EvaluationType evaluationType;
}
