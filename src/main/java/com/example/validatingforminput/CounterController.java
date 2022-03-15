package com.example.validatingforminput;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CounterController {

    @GetMapping("/counter")
    public String showForm(CounterForm counterForm) {
        return "form";
    }

    public String queryReq(@RequestParam(value = "word", defaultValue = "") String word,
                           @RequestParam(value = "letter", defaultValue = "") Character letter) {
        return "form";
    }

    @PostMapping("/counter")
    public String countLetters(@Valid CounterForm counterForm, BindingResult bindingResult) {
        int c = 0;
        for (int i = 0; i < counterForm.getWord().length(); i++) {
            if (counterForm.getLetter() == counterForm.getWord().toCharArray()[i])
                c++;
                counterForm.setAmountOfChar(c);
        }
        return "form";
    }
}
