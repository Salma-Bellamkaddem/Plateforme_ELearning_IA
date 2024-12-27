package pfa.coursserver.Mapper;

import pfa.coursserver.dto.reponse.CoursResponse;
import pfa.coursserver.entity.Cours;

public class CoursMapper {
    public static CoursResponse toResponse(Cours cours) {
        CoursResponse response = new CoursResponse();
        response.setId_cours(cours.getId_cours());
        response.setTitre(cours.getTitre());
        response.setDescription(cours.getDescription());
        response.setPhotoCours(cours.getPhotoCours());
        response.setUserId(cours.getUserId());
        response.setUtilisateur(cours.getUtilisateur());
        return response;
    }

}
