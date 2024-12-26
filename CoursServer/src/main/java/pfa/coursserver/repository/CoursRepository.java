package pfa.coursserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfa.coursserver.entity.Cours;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
//    List<Cours> findByIdUser(Long userId);
}
