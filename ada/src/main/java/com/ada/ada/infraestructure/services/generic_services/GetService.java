package com.ada.ada.infraestructure.services.generic_services;

public interface GetService<RS, ID>
{
    RS get(ID id);
}

