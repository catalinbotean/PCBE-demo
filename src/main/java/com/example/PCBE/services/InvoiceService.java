package com.example.PCBE.services;

import com.example.PCBE.model.Invoice;
import com.example.PCBE.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public int getSumByDate(LocalDate date) {
        return invoiceRepository.sumAllAmountsByDate(date);
    }

    public List<Invoice> getAllInvoices(){
        return invoiceRepository.findAll();
    }
}
