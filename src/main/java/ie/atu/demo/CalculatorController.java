package ie.atu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CalculatorController {
 Types Values = new Types();

    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation){
        return "operation: " + "\tDivision" + "\ttotal: " + Values.getDivide();
    }

}
