package com.ada.ada.api.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.ada.ada.api.dto.CompanyDTO;
import com.ada.ada.domain.entities.Company;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper
{
    CompanyDTO toDTOCompany(Company company);

    Company toEntity(CompanyDTO companyDTO);

    List<CompanyDTO> toDTOCompanyList(List<Company> companies);
}
