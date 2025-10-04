package com.InvestManagement.service;

import com.InvestManagement.entity.Investment;
import com.InvestManagement.repository.InvestmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    private final InvestmentRepository repository;

    public InvestmentService(InvestmentRepository repository) {
        this.repository = repository;
    }

    public Investment createInvestment(Investment investment) {
        return repository.save(investment);
    }

    public List<Investment> getAllInvestments() {
        return repository.findAll();
    }

    public Investment getInvestmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Investment updateInvestment(Long id, Investment investmentDetails) {
        Investment existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setInvestorName(investmentDetails.getInvestorName());
            existing.setInvestmentType(investmentDetails.getInvestmentType());
            existing.setAmount(investmentDetails.getAmount());
            existing.setStatus(investmentDetails.getStatus());
            return repository.save(existing);
        }
        return null;
    }

    public void deleteInvestment(Long id) {
        repository.deleteById(id);
    }
}
