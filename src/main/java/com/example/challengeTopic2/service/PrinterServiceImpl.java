package com.example.challengeTopic2.service;

import com.example.challengeTopic2.dao.IPersonaDao;
import com.example.challengeTopic2.domain.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {

    @Autowired
    private IPersonaDao iPersonaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Printer> listPrinters() {
        return (List<Printer>) iPersonaDao.findAll();
    }

    @Override
    @Transactional
    public void savePrinter(Printer printer) {
        iPersonaDao.save(printer);
    }

    @Override
    @Transactional
    public void deletePrinter(Printer printer) {
        iPersonaDao.delete(printer);
    }

    @Override
    @Transactional(readOnly = true)
    public Printer findPrinter(Printer printer) {
        return iPersonaDao.findById(printer.getIdPrinter()).orElse(null);
    }
}
