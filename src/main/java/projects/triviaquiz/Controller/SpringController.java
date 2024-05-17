package projects.triviaquiz.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import projects.triviaquiz.Models.Question;
import projects.triviaquiz.Service.QuizService;

@RestController
public class SpringController {

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

}
