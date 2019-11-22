package applicationtest.delle1.example.com.logreg;

public class Question444 {
    private String mQuestions [] ={
                    "Quelle est la sortie de ce code?\n" +
                            "String array[][]={{''salut'' , ''el aboui'', ''hafida''},{''el aboui, '' soufia'', ''bonjour''}};\n" +
                            "System.out.println(array[1][1]);",
            "Quelle est la sortie de ce code?\n" +
                    "\n" +
                    "int array [] [] = {{3,5,8}, {7,54,1,12,4}};\n" +
                    "System.out.println (tableau [0] [2]);",
            "complete the lesson to unlock your certificate"

    };


    private String mChoices [][] = {
            {"soufia", "bonjour", "el boui"},
            {"1", "8", "5"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"soufia", "8",""};




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
