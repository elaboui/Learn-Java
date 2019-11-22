package applicationtest.delle1.example.com.logreg;

public class Question55 {
    private String mQuestions [] = {
                    "quelle est la sortie du code suivant?\n" +
                    "int a = 11, b = 12, c = 40;" +
                            "switch(a){\n" +
                            "case 40;\n" +
                            "System.out.println(b); break;\n" +
                            "default:\n" +
                            "System.out.println(c);\n" +
                            "}",
            ""

    };


    private String mChoices [][] = {
            {"c", "b", "b et c"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"c",""};




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

