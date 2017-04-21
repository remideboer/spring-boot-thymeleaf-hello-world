package nl.remideboer.barespringthymeleaftest;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String helloWorld(Map<String, Object> model){
        model.put("message", "Hello World!");
        return "index";
    }
}
