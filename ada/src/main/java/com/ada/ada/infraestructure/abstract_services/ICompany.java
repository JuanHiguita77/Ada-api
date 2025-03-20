package com.ada.ada.infraestructure.abstract_services;


import com.ada.ada.api.dto.CompanyDTO;
import com.ada.ada.infraestructure.services.generic_services.CreateService;
import com.ada.ada.infraestructure.services.generic_services.DeleteService;
import com.ada.ada.infraestructure.services.generic_services.GetAllService;
import com.ada.ada.infraestructure.services.generic_services.GetService;
import com.ada.ada.infraestructure.services.generic_services.UpdateService;


public interface ICompany extends CreateService<CompanyDTO, CompanyDTO>, 
                                    UpdateService<CompanyDTO, CompanyDTO, Long>, 
                                    GetService<CompanyDTO, Long>, 
                                    GetAllService<CompanyDTO>,
                                    DeleteService<Long>
{    
}
