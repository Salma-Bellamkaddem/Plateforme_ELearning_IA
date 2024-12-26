package pfa.utilisateurserver.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfa.utilisateurserver.dto.reponse.UtilisateurReponse;
import pfa.utilisateurserver.dto.request.UtilisateurRequest;
import pfa.utilisateurserver.entity.Utilisateur;
import pfa.utilisateurserver.repository.UtilisateurRepository;
import pfa.utilisateurserver.service.UtilisateurService;

import javax.swing.text.html.parser.Entity;
import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/user")

public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping
    public ResponseEntity<UtilisateurReponse> createUtilisateur(@RequestBody UtilisateurRequest utilisateurRequest) {
        return ResponseEntity.ok(utilisateurService.createUtilisateur(utilisateurRequest));
    }



    @Autowired
    UtilisateurRepository utilisateurRepository;
    @GetMapping()
    public List findAll() {
        return utilisateurRepository.findAll();
    }
//    @GetMapping("/user/{id}")
//    public Utilisateur findById(@PathVariable int id) throws Exception{
//        return this.utilisateurRepository.findById((long) id).orElseThrow(()->new
//                Exception("User inexistant"));
//    }
}

