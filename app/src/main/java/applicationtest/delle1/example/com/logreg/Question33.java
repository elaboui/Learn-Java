package applicationtest.delle1.example.com.logreg;

public class Question33 {
    private String mQuestions [] = {
            "Une déclaration if peut contenir combien d'autres déclarations if?",
            ""

    };


    private String mChoices [][] = {
            {"Autant que vous voulez", "seulement remorquer", "Aucun"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"Autant que vous voulez",""};




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

