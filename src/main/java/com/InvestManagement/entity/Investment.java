package com.InvestManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "investments")
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "investor_name", nullable = false)
    private String investorName;

    @Column(name = "investment_type", nullable = false)
    private String investmentType; // e.g., Stock, Mutual Fund, Bond

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String status; // e.g., Active, Closed

    // ---- Constructors ----
    public Investment() {
    }

    public Investment(Long id, String investorName, String investmentType, Double amount, String status) {
        this.id = id;
        this.investorName = investorName;
        this.investmentType = investmentType;
        this.amount = amount;
        this.status = status;
    }

    // ---- Getters and Setters ----
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // ---- toString() for debugging ----
    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", investorName='" + investorName + '\'' +
                ", investmentType='" + investmentType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
