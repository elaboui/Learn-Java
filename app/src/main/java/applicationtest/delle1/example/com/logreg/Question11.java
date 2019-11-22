package applicationtest.delle1.example.com.logreg;

public class Question11 {
    private String mQuestions [] = {
            "Remplissez les blancs pour imprimer le plus grand nombre.\n" +
                    "int x = 10; int y = 5;\n" +
                    "____ (x> y) {\n" +
                    "     System.out.println (____);\n" +
                    "} ____ {\n" +
                    "     System.out.println (y);\n" +
                    "}",
            "please clicker sur 'quit' c'est la fin du quiz"

    };


    private String mChoices [][] = {
            {"if/y/else", "if /x/if", "if/x/else"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"if/x/else",""};




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

