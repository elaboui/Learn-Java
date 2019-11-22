package applicationtest.delle1.example.com.logreg;

public class Question44 {
    private String mQuestions [] = {
            "Remplissez le vide pour tester les deux conditions dans l'instruction if suivante.\n" +
                    "\n" +
                    "int age = 23;\n" +
                    "int mony = 4000;\n" +
                    "si (âge> 21 ___ argent> 500) {\n" +
                    "    System.out.println ('' welcome '');\n" +
                    "}",
            "quelle est la sortie du code suivant?\n" +
                    "int a = 11; int b = 12;\n" +
                    "int c = 40;\n" +
                    "si (a> 100 || b> 3) {\n" +
                    "System.ou.println (a);\n" +
                    "}autre{\n" +
                    "System.out.println (c);\n" +
                    "}",

            ""

    };


    private String mChoices [][] = {
            {"AND", "&", "&&"},
            {"12", "11", "40"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"&&", "11",""};




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

