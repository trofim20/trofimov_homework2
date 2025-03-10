package ru.trofimov.task4;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

/**
 * HTTP клиент и JSON
 * Вывести значение IP адреса с которого был сделан запрос
 * (запрос выполняется по адресу “https://httpbin.org/ip”).
 */
public class Task4 {
    public static void httpJson() {
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            String ip = json.getString("origin");
            System.out.println(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}