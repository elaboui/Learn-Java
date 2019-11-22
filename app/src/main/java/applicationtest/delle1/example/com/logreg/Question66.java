package applicationtest.delle1.example.com.logreg;

public class Question66 {
    private String mQuestions [] = {
            "Combien de fois la boucle suivante fonctionnera-t-elle?\n" +
                    " \n" +
                    "int x =0; int y =5;\n" +
                    "tandis que (x <y) {\n" +
                    "System.out.println ('' Hello '');\n" +
                    "x ++;\n" +
                    "}",
            ""

    };


    private String mChoices [][] = {
            {"4","5","6"},
            {"", "", ""}

    };



    private String mCorrectAnswers[] = {"5",""};




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

