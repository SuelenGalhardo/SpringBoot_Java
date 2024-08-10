package gmail.com.suelenranuccicom.example.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller")

public class FirstController {
    @GetMapping("/firstmethod/{id}")
    public String firstMethod(@PathVariable String id) {
        return "el paramétro es " + id;
    }

    @GetMapping("/methodWithQueryParams")
    public String methodWithQueryParams(@RequestParam String id) {

        return "el paramétro es metodo QueryParamns es " + id;

    }

    @GetMapping("/methodWithQueryParams2")
    public String methodWithQueryParams2(@RequestParam Map<String, String> allParams) {

        return "el paramétro es metodo QueryParamns2 es " + allParams.entrySet();

    }

    @PostMapping("/methodWithBodyParams")
    public String methodWithBodyParams(@RequestBody User user) {
        return "methodWithBodyParams" + user.username();
    }

    record User(String username) {

    }

}
