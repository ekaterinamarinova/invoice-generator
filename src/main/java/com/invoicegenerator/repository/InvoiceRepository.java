package com.invoicegenerator.repository;

import com.invoicegenerator.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {



}
