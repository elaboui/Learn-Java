package applicationtest.delle1.example.com.logreg;

public class Question7 {
    private String mQuestions [] = {
            "Glissez et déposez l’une des options ci-dessous pour imprimer '' Bonjour ''.\n" +
                    "___var;\n" +
                    "var = '' Bonjour '';\n" +
                    "System.out.println (____);",
            "quelle déclaration en ce qui concerne le type de données char est vraie?",
            ""

    };


    private String mChoices [][] = {
            {"print/var", "Bonjour/var", "String/var"},
            {"char est utilisé pour stocker des valeurs numériques", "'' bonjour '' est un char", "'k' est un char"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"String/var", "'k' est un char",""};




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

