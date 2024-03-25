package projects.triviaquiz.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record Question() {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private static int ID;
    private static String question;
    private static String option1;
    private static String option2;
    private static String option3;
    private static String option4;
    private static int AnswerKey;
}
