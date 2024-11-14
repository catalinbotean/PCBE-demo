package com.example.PCBE.controllers;

import com.example.PCBE.model.Invoice;
import com.example.PCBE.services.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/sum")
    public ResponseEntity<Integer> getSumByDate(@RequestParam("date")LocalDate date){
        Integer totalAmount = invoiceService.getSumByDate(date);
        return ResponseEntity.ok(totalAmount);
    }
}
