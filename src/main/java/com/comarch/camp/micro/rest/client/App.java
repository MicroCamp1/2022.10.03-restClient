package com.comarch.camp.micro.rest.client;

import org.springframework.web.client.RestTemplate;

public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/user/mateusz345";

        User user = restTemplate.getForObject(url, User.class);
        System.out.println(user);
    }
}
