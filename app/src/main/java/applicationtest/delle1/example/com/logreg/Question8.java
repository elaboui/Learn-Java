package applicationtest.delle1.example.com.logreg;

public class Question8 {
    private String mQuestions [] = {
            "Completer ce code .\n" +
                    "importer java.util.Scanner;\n" +
                    "classe tes {\n" +
                    "    public Static void main (String [] args) {\n" +
                    "       ______ sc = nouveau scanner (System.in);\n" +
                    "      String st = sc ._______ ();\n" +
                    "     }\n" +
                    "}",
            ""

    };


    private String mChoices [][] = {
            {"Scanner/nextLine","Scanner/next", "nextLine/Scanner"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"Scanner/next",""};




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
