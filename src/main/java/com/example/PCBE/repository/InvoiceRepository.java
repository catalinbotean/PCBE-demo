package com.example.PCBE.repository;

import com.example.PCBE.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    @Query("SELECT SUM(i.amount) FROM Invoice i WHERE  i.date = :date")
    Integer sumAllAmountsByDate(LocalDate date);
}
