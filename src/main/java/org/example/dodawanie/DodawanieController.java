package org.example.dodawanie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DodawanieController {

    @GetMapping("/dodaj")
    public String dodaj(@RequestParam int a, @RequestParam int b) {
        int suma = a + b;
        return "Suma wynosi: " + suma;
    }
}