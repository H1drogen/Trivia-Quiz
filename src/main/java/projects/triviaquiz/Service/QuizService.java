package projects.triviaquiz.Service;

import org.springframework.stereotype.Service;
import projects.triviaquiz.Models.Question;
import projects.triviaquiz.Repository.QuizRepository;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository repository;

    public QuizService(QuizRepository repository) {
        this.repository = repository;
    }

    public List<Question> getAllQuestions() {
        return repository.findAll();
    }
}
