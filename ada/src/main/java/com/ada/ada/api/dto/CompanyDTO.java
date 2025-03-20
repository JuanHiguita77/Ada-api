package com.ada.ada.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {

    private Long id_company; 

    private String codigo_company;
    private String name_company;
    private String description_company;
}
