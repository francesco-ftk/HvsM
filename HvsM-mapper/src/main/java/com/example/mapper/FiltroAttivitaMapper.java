package com.example.mapper;

import com.example.model.FiltroAttivita;
import com.example.dto.FiltroAttivitaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FiltroAttivitaMapper {
    FiltroAttivitaMapper INSTANCE = Mappers.getMapper( FiltroAttivitaMapper.class );

    FiltroAttivita map(FiltroAttivitaDto filtroAttivita);
}
