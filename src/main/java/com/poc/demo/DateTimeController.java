package com.poc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DateTimeController {

    @GetMapping("/datetime")
    public Map<String, String> getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Map.of(
            "fecha_hora", now.format(formatter),
            "fecha", now.toLocalDate().toString(),
            "hora", now.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        );
    }
}
