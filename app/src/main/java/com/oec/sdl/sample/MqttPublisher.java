package com.oec.sdl.sample;

import com.amazonaws.mobileconnectors.iot.AWSIotMqttManager;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import java.security.KeyStore;

// HTTPで動作するので、現状使っていません（というか使えません）
public class MqttPublisher {
    private static final String CLIENT_ID = "1";    // 適当
    private static final String ACCOUNT_ENDPOINT_PREFIX = "aujptitwxadlc-ats";
    private static final String CERT_ID = "1";    // 適当
    private static final String KEY_STORE_NAME = "tekitou.jks";    // 適当
    private static final String KEY_STORE_PASSWORD = "1234";    // 適当
    private static final String CERT_FILE = "83654eb72b-certificate.pem.crt";
    private static final String PRIVATE_KEY_FILE = "83654eb72b-private.pem.key";
    private static final String KeyStorePath = "d:\\cert";

    public void Publish(String json){
        AWSIotMqttManager mqttManager = new AWSIotMqttManager(CLIENT_ID, Region.getRegion(Regions.AP_NORTHEAST_1), ACCOUNT_ENDPOINT_PREFIX);
        KeyStore keyStore;
    }
}
