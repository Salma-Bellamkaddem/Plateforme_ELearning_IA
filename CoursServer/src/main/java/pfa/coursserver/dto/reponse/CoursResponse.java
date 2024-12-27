package pfa.coursserver.dto.reponse;

import lombok.Data;
import pfa.utilisateurserver.entity.Utilisateur;

@Data
public class CoursResponse {
    private Long id_cours;
    private String titre;
    private String description;
    private String photoCours;
    private Utilisateur utilisateur;


}
