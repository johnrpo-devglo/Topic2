package com.example.challengeTopic2.web;

import com.example.challengeTopic2.domain.Printer;
import com.example.challengeTopic2.service.PrinterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ControllerInit {

    @Autowired
    private PrinterService printerService;

    @GetMapping("/")
    public  String inicio(Model model){

        var printers = printerService.listPrinters();

        log.info("Ejecucion Exitosa!");
        model.addAttribute("printers", printers);
        return "index";
    }

    @GetMapping("/add")
    public String add(Printer printer){
        return "add";
    }

    @PostMapping("/add")
    public String savePrinter(Printer printer){
        printerService.savePrinter(printer);
        return "redirect:/";
    }
}
