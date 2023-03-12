package hello.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {

    @GetMapping("/hello")
    public String request(@RequestParam("id") String id){
        System.out.println("MainController.request");
        System.out.println("id = " + id);
        log.info("id = {}", id);
        return "redirect:/";
    }
}
