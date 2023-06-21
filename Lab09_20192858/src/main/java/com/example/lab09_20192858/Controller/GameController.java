package com.example.lab09_20192858.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/game")
public class GameController {
    @GetMapping("")
    public String gamedsb(Model model)  {

        return "dashboard";
    }
}
