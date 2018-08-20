package cn.gezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "main";
    }

    @RequestMapping("/left")
    public String left() {
        return "left";
    }

    @RequestMapping("/right")
    public String right() {
        return "right";
    }

    @RequestMapping("/top")
    public String top() {
        return "top";
    }
}
