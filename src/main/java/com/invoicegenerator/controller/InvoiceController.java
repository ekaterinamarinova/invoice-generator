package com.invoicegenerator.controller;

import com.invoicegenerator.model.Invoice;
import com.invoicegenerator.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceRepository repository;

    @GetMapping(path = "/get")
    public @ResponseBody Invoice getInvoiceById(@RequestParam Long id) {
        return repository.findById(id).orElse(new Invoice());
    }

}
