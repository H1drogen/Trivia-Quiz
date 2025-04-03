package projects.triviaquiz.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int questionID;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answerKey;

    // getters and setters
    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }
}