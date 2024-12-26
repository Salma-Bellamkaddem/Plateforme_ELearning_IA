package pfa.utilisateurserver.service;

import pfa.utilisateurserver.criteria.UtilisateurCriteria;
import pfa.utilisateurserver.dto.reponse.UtilisateurReponse;
import pfa.utilisateurserver.dto.request.UtilisateurRequest;
import pfa.utilisateurserver.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    UtilisateurReponse createUtilisateur(UtilisateurRequest request);
    UtilisateurReponse getUtilisateur(Long id);
    List<UtilisateurReponse> getUtilisateurs(UtilisateurCriteria criteria);
    UtilisateurReponse updateUtilisateur(Long id,UtilisateurRequest request);
    void deleteUtilisateur(Long id);
}
