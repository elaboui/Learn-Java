package applicationtest.delle1.example.com.logreg;

public class Question6 {
    private String mQuestions [] = {
            "Remplissez les blancs pour imprimer 11.\n" +
                    "int a = 10;\n" +
                    "____a;\n" +
                    "System.out.println (a);",
            "quelle est la sortie du code suivant?\n" +
                    "int x = 14;\n" +
                    "System.out.println (x ++);",
            ""

    };


    private String mChoices [][] = {
            {"++", "+", "--"},
            {"14", "15", "16"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"++", "14",""};




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

