package com.parker.sptformapi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class SpecialPaymentTermForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer formId;
    private String requestorName;
    private String location;
    private String department;
    private LocalDate requestDate;
    private  String supplierName;
    private String supplierNumber;
    private String occurrence;
    private String currentPaymentTerms;
    private String requestedPaymentTerms;
    private String paymentTermReason;
    private boolean isApproved;
    private LocalDate paymentTermApprovalDate;

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(String occurrence) {
        this.occurrence = occurrence;
    }

    public String getCurrentPaymentTerms() {
        return currentPaymentTerms;
    }

    public void setCurrentPaymentTerms(String currentPaymentTerms) {
        this.currentPaymentTerms = currentPaymentTerms;
    }

    public String getRequestedPaymentTerms() {
        return requestedPaymentTerms;
    }

    public void setRequestedPaymentTerms(String requestedPaymentTerms) {
        this.requestedPaymentTerms = requestedPaymentTerms;
    }

    public String getPaymentTermReason() {
        return paymentTermReason;
    }

    public void setPaymentTermReason(String paymentTermReason) {
        this.paymentTermReason = paymentTermReason;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public LocalDate getPaymentTermApprovalDate() {
        return paymentTermApprovalDate;
    }

    public void setPaymentTermApprovalDate(LocalDate paymentTermApprovalDate) {
        this.paymentTermApprovalDate = paymentTermApprovalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialPaymentTermForm that = (SpecialPaymentTermForm) o;
        return isApproved == that.isApproved && Objects.equals(formId, that.formId) && Objects.equals(requestorName, that.requestorName) && Objects.equals(location, that.location) && Objects.equals(department, that.department) && Objects.equals(requestDate, that.requestDate) && Objects.equals(supplierName, that.supplierName) && Objects.equals(supplierNumber, that.supplierNumber) && Objects.equals(occurrence, that.occurrence) && Objects.equals(currentPaymentTerms, that.currentPaymentTerms) && Objects.equals(requestedPaymentTerms, that.requestedPaymentTerms) && Objects.equals(paymentTermReason, that.paymentTermReason) && Objects.equals(paymentTermApprovalDate, that.paymentTermApprovalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, requestorName, location, department, requestDate, supplierName, supplierNumber, occurrence, currentPaymentTerms, requestedPaymentTerms, paymentTermReason, isApproved, paymentTermApprovalDate);
    }

    @Override
    public String toString() {
        return "SpecialPaymentTermForm{" +
                "formId=" + formId +
                ", requestorName='" + requestorName + '\'' +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                ", requestDate=" + requestDate +
                ", supplierName='" + supplierName + '\'' +
                ", supplierNumber='" + supplierNumber + '\'' +
                ", occurrence='" + occurrence + '\'' +
                ", currentPayemntTerms='" + currentPaymentTerms + '\'' +
                ", requestedPaymentTerms='" + requestedPaymentTerms + '\'' +
                ", paymentTermReason='" + paymentTermReason + '\'' +
                ", isApproved=" + isApproved +
                ", paymentTermApprovalDate=" + paymentTermApprovalDate +
                '}';
    }
}
