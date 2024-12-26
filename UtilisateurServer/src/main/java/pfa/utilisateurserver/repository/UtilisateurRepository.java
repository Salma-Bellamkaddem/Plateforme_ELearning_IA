package pfa.utilisateurserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfa.utilisateurserver.entity.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByEmail(String email);

}
