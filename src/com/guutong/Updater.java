/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guutong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

/**
 *
 * @author GuutonG
 */
public class Updater {

    private final static String lastVersionURL = "https://api.github.com/repos/Guutong/GT-WifiHotspot/releases/latest";
    private final static String currentVersionURL = "https://api.github.com/repos/Guutong/GT-WifiHotspot/releases/tags/v1.0.0-b.1";

    public static String getVersionUpdate() throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(getData(lastVersionURL));
        JSONObject jsonObject = (JSONObject) obj;
        String tag_name = (String) jsonObject.get("tag_name");
        System.out.println("tag_name: " + tag_name);
        return tag_name;
    }

    public static String getCurrentVersion() throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(getData(currentVersionURL));
        JSONObject jsonObject = (JSONObject) obj;
        String tag_name = (String) jsonObject.get("tag_name");
        System.out.println("tag_name: " + tag_name);
        return tag_name;
    }

    public static String getLinkDownload() throws Exception {
        String link = "https://github.com/Guutong/GT-WifiHotspot/releases/download/"
                + getVersionUpdate() + "/GT-WiFiHotspot.exe";
        return link;
    }

    private static String getData(String address) throws Exception {
        URL url = new URL(address);
        HttpURLConnection httpRequest = (HttpURLConnection) url.openConnection();
        httpRequest.setRequestMethod("GET");
        httpRequest.connect();
        InputStream is = httpRequest.getInputStream();
        BufferedReader bf_reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = bf_reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
        } finally {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
        return sb.toString();
    }
}
