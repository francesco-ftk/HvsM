package com.example.controller.mapper;

import com.example.controller.dto.UtenteDto;
import com.example.service.entity.Utente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UtenteMapper {
    UtenteMapper INSTANCE = Mappers.getMapper( UtenteMapper.class );

    Utente map(UtenteDto utente);

    UtenteDto mapReverse(Utente utente);
}
