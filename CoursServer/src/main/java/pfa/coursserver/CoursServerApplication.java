package pfa.coursserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import pfa.coursserver.Service.UtilisateurService;
import pfa.coursserver.entity.Cours;
import pfa.coursserver.repository.CoursRepository;
import pfa.utilisateurserver.entity.Utilisateur;



@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CoursServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursServerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CoursRepository coursRepository, UtilisateurService utilisateurService) {
        return args -> {
            Utilisateur u1 = utilisateurService.userById(1L);
            System.out.println("Id est : " + u1.getId());
            System.out.println("Nom est : " + u1.getNom());
            System.out.println("Prenom est : " + u1.getPrenom());
            System.out.println("Email est : " + u1.getEmail());

            coursRepository.save(new Cours());
            coursRepository.save(new Cours(Long.parseLong("1"),"ke","eje","dj",1L,u1));

        };
    }
}
