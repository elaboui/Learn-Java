package applicationtest.delle1.example.com.logreg;

public class Question111 {
    private String mQuestions [] = {
            "En java, un tableau commence à compter à partir de ...",
            "Quelle est la sortie de ce code?\n" +
                    "\n" +
                    "int tmp [] = {5,9,3};\n" +
                    "System.out.println (tmp [1]);",
            ""

    };


    private String mChoices [][] = {
            {"2", "0", "1"},
            {"5", "9", "3"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"0", "9", ""};




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

