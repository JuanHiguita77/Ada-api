package com.ada.ada.infraestructure.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.ada.api.dto.CompanyDTO;
import com.ada.ada.api.mappers.CompanyMapper;
import com.ada.ada.domain.entities.Company;
import com.ada.ada.domain.repositories.CompanyRepository;
import com.ada.ada.infraestructure.abstract_services.ICompany;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class companyService implements ICompany {

    @Autowired
    private final CompanyRepository companyRepository;

    @Autowired
    private final CompanyMapper companyMapper;

    @Override
    public CompanyDTO create(CompanyDTO request) {
        Company company = companyMapper.toEntity(request);

        return companyMapper.toDTOCompany(companyRepository.save(company));
    }

    @Override
    public CompanyDTO get(Long id) {
        Company company = find(id);

        return companyMapper.toDTOCompany(company);
    }

    @Override
    public List<CompanyDTO> getAll() 
    {
        return companyMapper.toDTOCompanyList(companyRepository.findAll());
    }

    @Override
    public CompanyDTO update(CompanyDTO request, Long id) {
        Company existingEntity = find(id);

        Company updatedEntity = companyMapper.toEntity(request);
        updatedEntity.setId_company(existingEntity.getId_company());

        return companyMapper.toDTOCompany(companyRepository.save(updatedEntity));
    }

    @Override
    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

    private Company find(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Company found with the supplied ID"));
    }
}
