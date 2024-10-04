package groupId.entitymapper;

import groupId.UtenteDto;
import groupId.entity.Utente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UtenteMapper {
    UtenteMapper INSTANCE = Mappers.getMapper( UtenteMapper.class );

    Utente map(UtenteDto utente);
}
