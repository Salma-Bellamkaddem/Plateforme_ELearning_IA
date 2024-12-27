package pfa.coursserver.dto.request;

import lombok.Data;
import pfa.utilisateurserver.entity.Utilisateur;

@Data
public class CoursRequest {
    private Long id_cours;
    private String titre;
    private String description;
    private String photoCours;
    private Long userId;
    private Utilisateur utilisateur;
}
