package com.InvestManagement.controller;

import com.InvestManagement.entity.Investment;
import com.InvestManagement.service.InvestmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investments")
public class InvestmentController {

    private final InvestmentService service;

    public InvestmentController(InvestmentService service) {
        this.service = service;
    }

    // Create
    @PostMapping
    public Investment createInvestment(@RequestBody Investment investment) {
        return service.createInvestment(investment);
    }

    // Read all
    @GetMapping
    public List<Investment> getAllInvestments() {
        return service.getAllInvestments();
    }

    // Read by ID
    @GetMapping("/{id}")
    public Investment getInvestmentById(@PathVariable Long id) {
        return service.getInvestmentById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Investment updateInvestment(@PathVariable Long id, @RequestBody Investment investment) {
        return service.updateInvestment(id, investment);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteInvestment(@PathVariable Long id) {
        service.deleteInvestment(id);
        return "Investment deleted successfully!";
    }
}
