package pfa.utilisateurserver.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import pfa.utilisateurserver.dto.reponse.UtilisateurReponse;
import pfa.utilisateurserver.dto.request.UtilisateurRequest;
import pfa.utilisateurserver.entity.Utilisateur;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    Utilisateur toEntity(UtilisateurRequest utilisateurRequest);
    UtilisateurReponse toReponse(Utilisateur utilisateur);
    void updateEntityFromRequest(UtilisateurRequest request, @MappingTarget Utilisateur utilisateur);
}
