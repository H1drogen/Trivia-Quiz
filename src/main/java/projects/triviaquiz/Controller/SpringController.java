package projects.triviaquiz.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.triviaquiz.Models.Question;
import projects.triviaquiz.Service.QuizService;

@RestController
public class SpringController {
    private final QuizService quizservice;

    @Autowired
    public SpringController(QuizService quizservice) {
        this.quizservice = quizservice;
    }

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    @PostMapping("/Question")
    public ResponseEntity<Question> getRandomQuestion() {
        Question question = quizservice.getRandomQuestion();
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).body(null);
        }
    }
}
