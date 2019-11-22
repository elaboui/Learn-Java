package applicationtest.delle1.example.com.logreg;

public class Question3 {
    private String mQuestions [] = {
            "Les commentaires sur une seule ligne sont créés à l'aide de:",
            "vous pouvez ajouter un commentaire de style doc doc en utilisant:",
            ""

    };


    private String mChoices [][] = {
            {"* / caractères au début de la ligne", "// caractères au début de la ligne", "// caractères en fin de ligne"},
            {"/ ** et * / caractères pour envelopper le commentaire.", "/ * et * / caractères pour envelopper le commentaire.", "// caractères au début de la ligne."},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"// caractères au début de la ligne", "/ ** et * / caractères pour envelopper le commentaire.",""};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a) {

        String answer = mCorrectAnswers[a];
        return answer;
    }

}

