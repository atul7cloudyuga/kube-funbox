package io.github.erfangc.kubefunbox;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String root() {
        return "Hello World! Updated";
    }
}
