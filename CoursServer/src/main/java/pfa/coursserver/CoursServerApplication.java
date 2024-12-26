package pfa.coursserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import pfa.coursserver.entity.Cours;
import pfa.coursserver.repository.CoursRepository;
import pfa.utilisateurserver.entity.Utilisateur;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class CoursServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursServerApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(CoursRepository coursRepository) {
//        return args -> {
////            Utilisateur u1 = coursRepository.findByIdUser();
//            coursRepository.save(new Cours());
////            coursRepository.save(new Cours(null,"ke","eje","dj",1L,u1));
//
//        };
//    }
}
