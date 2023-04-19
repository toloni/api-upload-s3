package br.com.toloni.uploadawss3.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController extends ResponseController {

    public HelloWorldController() {
        super();
    }

    public HelloWorldController(String status, Object data) {
        super(status, data);
    }

    @GetMapping
    public ResponseEntity<ResponseController> helloWorld() {

        return ResponseEntity.ok(new ResponseController("Success", "Hello World!"));
    }

}
