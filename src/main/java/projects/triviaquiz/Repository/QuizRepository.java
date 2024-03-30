package projects.triviaquiz.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projects.triviaquiz.Models.Question;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Question, Long> {
//    @Query('SELECT q FROM Question q WHERE q.ID = ?1')
    List<Question> findAll();

}
