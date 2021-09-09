package br.com.curitiba.fincar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FinCarController {

    @GetMapping()
    public String hello() {
        return "Hello Amábilie";
    }
}
