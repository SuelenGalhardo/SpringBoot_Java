package gmail.com.suelenranuccicom.example.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    @PostMapping("/methodWithHeaders")

    public String methodWithHeaders(@RequestHeader("name") String name) {
        return "methodWithHeaders" + name;
    }

    @PostMapping("/methodWithListHeaders")
    public String methodWithListHeaders(@RequestHeader Map<String, String> headers) {
        return "methodWithListHeaders" + headers.entrySet();
    }

    @GetMapping("/methodResponseEntity/{id}")
    public ResponseEntity<Object> methodResponseEntity(@PathVariable long id) {

    
        var user = new User ( "Suelen");

        if (id > 5 ) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Mensagen de error");

        }

        return ResponseEntity.badRequest().body("numero menor que 5");

   
    }

    record User(String username) {

    }

}
