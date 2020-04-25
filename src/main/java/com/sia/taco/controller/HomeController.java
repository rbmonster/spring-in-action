package com.sia.taco.controller;

import com.sia.taco.entity.Taco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * @Description:
 *
 * </pre>
 *
 * @version v1.0
 * @ClassName: OrderController
 * @Author: sanwu
 * @Date: 2020/4/25 15:38
 */
@RestController
@RequestMapping("/home")
@SessionAttributes("taco")
public class HomeController {

    @ModelAttribute("taco")
    public Taco order() {
        return new Taco();
    }
    @GetMapping(path = "/page")
    public String home() {
        return "home";
    }
}
