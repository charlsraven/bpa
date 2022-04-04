package com.example.demo.controller;

import com.example.demo.model.Billie;
import com.example.demo.service.BillieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BillieController {
    private final BillieService billieService;

    @GetMapping("/")
    public ModelAndView home() {
        List<Billie> billies = billieService.findAll();
        return new ModelAndView("index.html", Collections.singletonMap("billies", billies));
    }

}
