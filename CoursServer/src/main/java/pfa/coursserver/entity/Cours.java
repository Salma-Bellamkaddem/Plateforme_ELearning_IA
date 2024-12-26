package pfa.coursserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pfa.utilisateurserver.entity.Utilisateur;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cours;
    private String titre;
    private String description;
    private String photoCours;


    @Transient
    @ManyToOne
    @JoinColumn(name = "user_id")  // Clé étrangère vers User
    private Utilisateur utilisateur;

}
