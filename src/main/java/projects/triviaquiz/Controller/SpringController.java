package projects.triviaquiz.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import projects.triviaquiz.Service.QuizService;

@RestController
public class SpringController {
    private final QuizService quizservice;

    @Autowired
    public SpringController(QuizService quizservice) {
        this.quizservice = quizservice;
    }

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message", "Trivia Quiz App");
        return modelAndView;
    }

    @GetMapping("/configuration")
    public ModelAndView configuration(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("configuration");
        modelAndView.addObject("message", "Configuration");
        return modelAndView;
    }

//    @PostMapping("/question")
//    public ResponseEntity<Question> getRandomQuestion() {
//        Question question = quizservice.getRandomQuestion();
//        if (question != null) {
//            return ResponseEntity.ok(question);
//        } else {
//            return ResponseEntity.status(HttpStatusCode.valueOf(404)).body(null);
//        }
//    }

    @GetMapping("/question/add")
    public ModelAndView addQuestion(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("setup/addQuestion");
        modelAndView.addObject("message", "Add Question");
        return modelAndView;
    }

//    @PostMapping("/question/add")
//    public ResponseEntity<Question> addQuestion(Question question) {
//        quizservice.addQuestion(question);
//        return ResponseEntity.status(HttpStatus.CREATED).body(question);
//    }


}
