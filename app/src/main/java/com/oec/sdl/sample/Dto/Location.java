package com.oec.sdl.sample.Dto;

public class Location {
    // 緯度
    public String latitude;
    // 経度
    public String longnitude;

    public Location(double lat, double lon){
        latitude = String.valueOf(lat);
        longnitude = String.valueOf(lon);
    }

    public Location(String lat, String lon){
        latitude = lat;
        longnitude = lon;
    }
}
