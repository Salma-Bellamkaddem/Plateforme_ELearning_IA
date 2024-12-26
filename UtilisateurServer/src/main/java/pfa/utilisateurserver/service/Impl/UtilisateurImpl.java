package pfa.utilisateurserver.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.utilisateurserver.criteria.UtilisateurCriteria;
import pfa.utilisateurserver.dto.reponse.UtilisateurReponse;
import pfa.utilisateurserver.dto.request.UtilisateurRequest;
import pfa.utilisateurserver.entity.Utilisateur;
import pfa.utilisateurserver.mapper.UtilisateurMapper;
import pfa.utilisateurserver.repository.UtilisateurRepository;
import pfa.utilisateurserver.service.UtilisateurService;

import java.util.List;
@Service
public class UtilisateurImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;


    private UtilisateurMapper utilisateurMapper;
    @Override
    public UtilisateurReponse createUtilisateur(UtilisateurRequest request) {
        // Vérifiez si l'email existe déjà
        if(utilisateurRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        Utilisateur utilisateur = utilisateurMapper.toEntity(request);
        utilisateur=utilisateurRepository.save(utilisateur);
        return utilisateurMapper.toReponse(utilisateur);
    }

    @Override
    public UtilisateurReponse getUtilisateur(Long id) {
        return null;
    }

    @Override
    public List<UtilisateurReponse> getUtilisateurs(UtilisateurCriteria criteria) {
        return List.of();
    }

    @Override
    public UtilisateurReponse updateUtilisateur(Long id, UtilisateurRequest request) {
        return null;
    }

    @Override
    public void deleteUtilisateur(Long id) {

    }
}
