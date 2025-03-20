package com.ada.ada.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ada.ada.api.dto.CompanyDTO;
import com.ada.ada.infraestructure.abstract_services.ICompany;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@Tag(name = "Company")
public class CompanyController {

    @Autowired
    private final ICompany companyService;

    @Operation(summary = "Create a new company", description = "Send information to create a new company")
    @PostMapping
    public ResponseEntity<CompanyDTO> save(@Validated @RequestBody CompanyDTO company) {
        return ResponseEntity.ok(this.companyService.create(company));
    }

    @Operation(summary = "Delete a company by compnay_id", description = "Send the company company_id to delete it")
    @DeleteMapping(path = "/{company_id}")
    public ResponseEntity<Void> delete(@PathVariable Long company_id){
        this.companyService.delete(company_id);

        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Update a company", description = "Send information to update a company")
    @PutMapping(path = "/{company_id}")
    public ResponseEntity<CompanyDTO> update(@PathVariable Long company_id, @Validated @RequestBody CompanyDTO company) {
        return ResponseEntity.ok(this.companyService.update(company, company_id));
    }

    @Operation(summary = "Get all companies", description = "Get all companies")
    @GetMapping
    public ResponseEntity<List<CompanyDTO>> getAllCompanies()
    {
        return ResponseEntity.ok(this.companyService.getAll());
    }

    @Operation(summary = "Get a company by company_id", description = "Send the company company_id to get company details")
    @GetMapping("/{company_id}")
    public ResponseEntity<CompanyDTO> findById(@PathVariable Long company_id) {
        return ResponseEntity.ok(this.companyService.get(company_id));
    }
}
