package com.example.entitymapper;

import com.example.dto.UtenteDto;
import com.example.entity.Utente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UtenteMapper {
    UtenteMapper INSTANCE = Mappers.getMapper( UtenteMapper.class );

    Utente map(UtenteDto utente);

    UtenteDto mapReverse(Utente utente);
}
