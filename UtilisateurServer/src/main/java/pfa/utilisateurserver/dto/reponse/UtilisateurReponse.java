package pfa.utilisateurserver.dto.reponse;

import lombok.Data;

@Data
public class UtilisateurReponse {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String role;
}
