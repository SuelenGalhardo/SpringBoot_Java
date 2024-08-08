package gmail.com.suelenranuccicom.example.primerproyectospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Controller")

public class FirstController {
    @GetMapping("/firstmethod")
    public String firstMethod() {
        return "Hello World from FirstController!";
    }

    
}
