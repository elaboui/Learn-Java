package applicationtest.delle1.example.com.logreg;

public class Question5 {
    private String mQuestions [] = {
            "Remplissez le champ vide pour déclarer une variable entière et lui attribuer la valeur 5." +
                    "___var=___;",
            ""

    };


    private String mChoices [][] = {
            {"float var=5;", "double var=5;", "int var=5;"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"int var=5;",""};




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

