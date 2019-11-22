package applicationtest.delle1.example.com.logreg;

public class Question2 {

    private String mQuestions [] = {
            "Quelle méthode imprime le texte dans un programme Java?",
            "Quelle méthode est le point de départ de tous les programmes java?",

            ""

    };


    private String mChoices [][] = {
            {"out.writeText ()", "System.out.println()", "System.printText()"},
            {"void", "staic", "main"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"System.out.println()", "main",""};




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
