package groupId;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FiltroAttivitaMapper {
    FiltroAttivitaMapper INSTANCE = Mappers.getMapper( FiltroAttivitaMapper.class );

    FiltroAttivita map(FiltroAttivitaDto filtroAttivita);
}
