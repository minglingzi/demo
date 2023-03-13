package controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.Collections;
import java.util.Map;

@Controller("/")
public class HelloController {

    @Get("/")
    @View("hello")
    public Map<String, String> index() {
        return Collections.singletonMap("message", "Hello, my ChatGPT.");
    }
}