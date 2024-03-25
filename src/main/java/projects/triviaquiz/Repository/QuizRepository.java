package projects.triviaquiz.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.triviaquiz.Models.Question;

@Repository
public interface QuizRepository extends JpaRepository<Question, Long> {

}
