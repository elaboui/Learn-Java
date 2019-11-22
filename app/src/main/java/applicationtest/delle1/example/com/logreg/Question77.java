package applicationtest.delle1.example.com.logreg;

public class Question77 {
    private String mQuestions [] = {
            "Glissez et déposez l’une des options ci-dessous pour imprimer le mot-clé «Génial!» 10 fois:" +
                    "____for(int i=0;i<10;___){\n" +
                    "System.out.println(''___'');\n" +
                    "}",
            ""

    };


    private String mChoices [][] = {
            {"if/i+1/Great!", "for/i++/Great!", "for/i--/Great!"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"for/i++/Great!",""};




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

