package applicationtest.delle1.example.com.logreg;

public class Question22 {
    private String mQuestions [] = {
            "Remplir les parties manquantes de la déclaration imbriquée si vous devez imprimer «ça marche!» à l'écran.\n" +
                    "int x = 37;\n" +
                    "si (x> 22) {\n" +
                    "   __ (x> 31) {\n" +
                    "     System .___. Println ('' ça marche! '');\n" +
                    "}}" ,

            ""

    };


    private String mChoices [][] = {
            {"if/write", "if/out", "else/out"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"if/out",""};




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

