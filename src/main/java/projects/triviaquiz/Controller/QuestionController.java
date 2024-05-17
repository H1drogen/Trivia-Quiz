package projects.triviaquiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.triviaquiz.Models.Question;
import projects.triviaquiz.Service.QuizService;

@RestController
public class QuestionController {

    private final QuizService quizservice;

    @Autowired
    public QuestionController(QuizService quizservice) {
        this.quizservice = quizservice;
    }

    @PostMapping("/question")
    public ResponseEntity<Question> getRandomQuestion() {
        Question question = quizservice.getRandomQuestion();
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).body(null);
        }
    }

    @PostMapping("/question/add")
    public ResponseEntity<Question> addQuestion(Question question) {
        quizservice.addQuestion(question);
        return ResponseEntity.status(HttpStatus.CREATED).body(question);
    }


}
