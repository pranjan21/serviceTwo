package serviceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")
public class LaunchController {

    @GetMapping
    public String getFirstView() {
        return "Oh hello, this is Service Two!";
    }
}
