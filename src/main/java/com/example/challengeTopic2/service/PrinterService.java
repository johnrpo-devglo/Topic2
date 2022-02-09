package com.example.challengeTopic2.service;

import com.example.challengeTopic2.domain.Printer;

import java.util.List;

public interface PrinterService {

    public List<Printer> listPrinters();

    public void savePrinter(Printer printer);

    public void deletePrinter(Printer printer);

    public Printer findPrinter(Printer printer);
}
