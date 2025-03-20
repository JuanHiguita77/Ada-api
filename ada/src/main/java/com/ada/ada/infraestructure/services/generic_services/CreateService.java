package com.ada.ada.infraestructure.services.generic_services;

public interface CreateService<RQ, RS>
{
    RS create(RQ request);
}

