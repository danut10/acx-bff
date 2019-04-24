package ro.cegeka.champ.acx.bff.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping("/test")
    public String greeting() {
        return "Hello world!!";
    }
    
}
