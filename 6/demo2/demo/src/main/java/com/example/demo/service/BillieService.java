package com.example.demo.service;

import com.example.demo.model.Billie;
import com.example.demo.repository.BillieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BillieService {
    private final BillieRepository billieRepository;

    public List<Billie> findAll() {
        return billieRepository.findAll();
    }
}
