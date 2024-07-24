package com.example.kdsb20240724.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraKDSBController {

    @GetMapping("/resta")
    public String showSumForm(Model model) {
        model.addAttribute("num1", 0);
        model.addAttribute("num2", 0);
        model.addAttribute("result", 0);
        return "calculadora/resta";
    }

    @PostMapping("/resta")
    public String performSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int resulta = num1 - num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", resulta);
        return "calculadora/resta";
    }

    
}
