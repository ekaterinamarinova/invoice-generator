package com.invoicegenerator.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String invoiceName;

    private LocalDate creationDate;

    private String supplierName;

    private String supplierAddress;

    private Integer supplierVATNumber;

    private String receiverName;

    private String receiverAddress;

    private Integer receiverVATNumber;

    private String serviceType;

    private Integer serviceQuality;

    private LocalDate dateOfPayment;

    private Double singleValuePriceNoTax;

    @Column
    @ElementCollection(targetClass = Double.class)
    private List<Double> discounts;

    private Double taxRate;

    private Double taxSize;

    private Double paymentAmount;

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public Integer getSupplierVATNumber() {
        return supplierVATNumber;
    }

    public void setSupplierVATNumber(Integer supplierVATNumber) {
        this.supplierVATNumber = supplierVATNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public Integer getReceiverVATNumber() {
        return receiverVATNumber;
    }

    public void setReceiverVATNumber(Integer receiverVATNumber) {
        this.receiverVATNumber = receiverVATNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(Integer serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Double getSingleValuePriceNoTax() {
        return singleValuePriceNoTax;
    }

    public void setSingleValuePriceNoTax(Double singleValuePriceNoTax) {
        this.singleValuePriceNoTax = singleValuePriceNoTax;
    }

    public List<Double> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Double> discounts) {
        this.discounts = discounts;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxSize() {
        return taxSize;
    }

    public void setTaxSize(Double taxSize) {
        this.taxSize = taxSize;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
