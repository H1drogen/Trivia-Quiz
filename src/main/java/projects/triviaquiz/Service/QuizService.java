package projects.triviaquiz.Service;

import org.springframework.stereotype.Service;
import projects.triviaquiz.Models.Question;
import projects.triviaquiz.Repository.QuizRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuizService {
    private final QuizRepository repository;

    public QuizService(QuizRepository repository) {
        this.repository = repository;
    }

    public Question getRandomQuestion() {
        List<Question> questions = repository.findAll();
        int randomIndex = new Random().nextInt(questions.size());
        return questions.get(randomIndex);
    }

    public void addQuestion(Question question) {
        repository.save(question);
    }

}
