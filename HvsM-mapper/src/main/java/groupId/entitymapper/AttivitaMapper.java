package groupId.entitymapper;

import groupId.AttivitaDto;
import groupId.entity.Attivita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AttivitaMapper {

    AttivitaMapper INSTANCE = Mappers.getMapper( AttivitaMapper.class );

    AttivitaDto mapReverse(Attivita attivita);

    Attivita map(AttivitaDto attivita);
}
