package pfa.coursserver.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pfa.coursserver.Mapper.CoursMapper;
import pfa.coursserver.dto.reponse.CoursResponse;
import pfa.coursserver.entity.Cours;
import pfa.coursserver.repository.CoursRepository;

import java.util.List;


@RestController
@AllArgsConstructor
public class CoursController {

    @Autowired
    CoursRepository coursRepository;

    @GetMapping("/cours")
    public List<CoursResponse> findAll() {
        // Récupérer tous les cours et les mapper en CoursResponse
        return coursRepository.findAll().stream()
                .map(CoursMapper::toResponse)
                .toList();
    }
//    @GetMapping("/cours/{id}")
//    public Cours findById(@PathVariable long id_cours) throws Exception{
//        return this.coursRepository.findById(id_cours).orElseThrow(()->new
//                Exception("Cours inexistant"));
//    }
}
