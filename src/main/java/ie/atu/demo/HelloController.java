package ie.atu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public  String hello(){
        return "Hello, World!";
    }
    @GetMapping("/greet/{name}")
    public  String greetByName(@PathVariable String name){
        return "Hello" +name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {

        return "Name" + name + "\tAge:" + age;
    }

}

