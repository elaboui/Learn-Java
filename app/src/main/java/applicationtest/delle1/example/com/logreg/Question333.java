package applicationtest.delle1.example.com.logreg;

public class Question333 {
    private String mQuestions [] = {
            "Remplissez les blancs pour utiliser la boucle for améliorée pour un tableau appelé '' arr '':\n" +
                    "\n" +
                    "int total = 0;\n" +
                    "for (int x_ __) {\n" +
                    "   total + = x;\n" +
                    "}",
            ""

    };


    private String mChoices [][] = {
            {": arr", "+ arr", "+total"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {": arr",""};




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

