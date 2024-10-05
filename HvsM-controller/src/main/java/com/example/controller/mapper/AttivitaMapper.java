package com.example.controller.mapper;

import com.example.controller.dto.AttivitaDto;
import com.example.service.entity.Attivita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AttivitaMapper {

    AttivitaMapper INSTANCE = Mappers.getMapper( AttivitaMapper.class );

    AttivitaDto mapReverse(Attivita attivita);

    Attivita map(AttivitaDto attivita);
}
