package com.ada.ada.api.mappers;

import com.ada.ada.api.dto.CompanyDTO;
import com.ada.ada.domain.entities.Company;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-20T16:52:20-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public CompanyDTO toDTOCompany(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDTO.CompanyDTOBuilder companyDTO = CompanyDTO.builder();

        companyDTO.codigo_company( company.getCodigo_company() );
        companyDTO.description_company( company.getDescription_company() );
        companyDTO.id_company( company.getId_company() );
        companyDTO.name_company( company.getName_company() );

        return companyDTO.build();
    }

    @Override
    public Company toEntity(CompanyDTO companyDTO) {
        if ( companyDTO == null ) {
            return null;
        }

        Company.CompanyBuilder company = Company.builder();

        company.codigo_company( companyDTO.getCodigo_company() );
        company.description_company( companyDTO.getDescription_company() );
        company.id_company( companyDTO.getId_company() );
        company.name_company( companyDTO.getName_company() );

        return company.build();
    }

    @Override
    public List<CompanyDTO> toDTOCompanyList(List<Company> companies) {
        if ( companies == null ) {
            return null;
        }

        List<CompanyDTO> list = new ArrayList<CompanyDTO>( companies.size() );
        for ( Company company : companies ) {
            list.add( toDTOCompany( company ) );
        }

        return list;
    }
}
