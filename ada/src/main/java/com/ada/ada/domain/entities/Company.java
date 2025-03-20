package com.ada.ada.domain.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity(name = "company")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_company;
    
    //codigo unico en la bd
    @Column(unique = true)
    String codigo_company;

    String name_company;
    String description_company;

    /* 
     * Relacion para la tabla de version y extraer los datos "app_name y version"
     * 
     *  @ToString.Exclude
        @EqualsAndHashCode.Exclude
        @OneToOne(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = false)
        private Version version;    
     * 
     * 
    */
}
