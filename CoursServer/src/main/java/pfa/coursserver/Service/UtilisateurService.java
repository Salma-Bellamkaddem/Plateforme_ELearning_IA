package pfa.coursserver.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pfa.utilisateurserver.entity.Utilisateur;


@FeignClient(name = "UtilisateurServer")

public interface UtilisateurService {
//    @GetMapping(path = "/clients/{userId}")
//    Utilisateur userById(@PathVariable("userId") Long userId);
}
