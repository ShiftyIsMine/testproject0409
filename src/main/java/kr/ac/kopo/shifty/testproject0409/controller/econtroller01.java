package kr.ac.kopo.shifty.testproject0409.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Path;

@Controller
public class econtroller01 {
    @GetMapping("/exam01")
    public String requestMethod(@RequestParam("id") String userid,@RequestParam("passwd") String userpw, Model model) {
        model.addAttribute("data1", "@RequestParam sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid
                                                            +"<br> pwd : " + userpw);
        return "viewpage01";
    }
    @GetMapping("/exam02")
    public String requestMethod2(@RequestParam(value = "id",defaultValue = "anonymous name") String userid,@RequestParam("passwd") String userpw, Model model) {
        model.addAttribute("data1", "@RequestParam sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid
                +"<br> pwd : " + userpw);
        return "viewpage01";
    }

    @GetMapping("/exam03/{id}")
    public String requestMethod3(@PathVariable("id") String userid, Model model) {
        model.addAttribute("data1", "@Pathvariable sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid);
        return "viewpage01";
    }

    @GetMapping("/exam04/{id}/{passwd}")
    public String requestMethod4(@PathVariable("id") String userid,@PathVariable("passwd") String userpw, Model model) {
        model.addAttribute("data1", "@PathVariable sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid
                                                            +"<br> pwd : " + userpw);
        return "viewpage01";
    }

    @GetMapping("/exam05/{id}")
    public String requestMethod5(@PathVariable("id") String userid, @MatrixVariable("passwd") String userpw, Model model) {
        model.addAttribute("data1", "@MatrixVariable sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid
                                                            +"<br> pwd : " + userpw);
        return "viewpage01";
    }

    @GetMapping("/exam06/{id1}/user/{id2}")
    public String requestMethod6(@PathVariable("id1") String userid1, @MatrixVariable(value ="passwd",pathVar = "id1") String userpw1,
                                 @PathVariable("id2") String userid2, @MatrixVariable(value ="passwd",pathVar = "id2") String userpw2,
                                 Model model) {
        model.addAttribute("data1", "@MatrixVariable sample ");
        model.addAttribute("data2", "the value of id pathvariable : " + userid1
                +"<br> matrix pwd : " + userpw1 +
                "<br>the value of id pathvariable : : " + userid2
                +"<br> matrix pwd : " + userpw2);
        return "viewpage01";
    }

    @GetMapping("/exam07/{id}")
    public String requestMethod7(@PathVariable("id") String userid, @MatrixVariable(value = "passwd",defaultValue = "jhhihihi") String userpw, Model model) {
        model.addAttribute("data1", "@MatrixVariable sample ");
        model.addAttribute("data2", "the value of id conveyed request parameter : " + userid
                +"<br> pwd : " + userpw);
        return "viewpage01";
    }
}
