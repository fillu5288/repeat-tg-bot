package com.example.telegram.telegram.config;

import lombok.*;
import org.glassfish.jersey.client.Initializable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
@Configuration
@Data
@AllArgsConstructor
@PropertySource("resources/application.properties")
public class BotConfig {
    @Getter
    public static String botName = "FilluBebraBot";

    @Getter
    public static String token = "7271921926:AAGcNqGOgCD4gQY-O0ZORXCo2ARq-Wm4YW8";
}
