package pfa.utilisateurserver.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String photoProfil;
    private String niveauEtudes;

    @Enumerated(EnumType.STRING)
    private Role role;





}
