package pfa.utilisateurserver.dto.request;

import lombok.Getter;
import lombok.Setter;




public class UtilisateurRequest {
    private Long id;
    private String nom;
    private String prenom;


    @Getter
    @Setter
    private String email;
    private String role;


}
