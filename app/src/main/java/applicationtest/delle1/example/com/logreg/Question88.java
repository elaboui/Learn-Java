package applicationtest.delle1.example.com.logreg;

public class Question88 {
    private String mQuestions [] = {
            "En quoi une boucle do while est-elle différente d'une boucle while?",
            "Remplissez les blancs pour imprimer les valeurs de la variable x 5 fois." +
                    "\n" +
                    "int x=1\n" +
                    "do{\n" +
                    "System.out.println(x);\n" +
                    "x++;\n" +
                    "}\n" +
                    "____(x<=___);",

            ""

    };


    private String mChoices [][] = {
            {"Une boucle do while exécute votre code au moins une fois.", "Une boucle while exécute le code avant de tester la condition.", "Une boucle do while while teste la condition avant d'exécuter le code."},
            {"if/5", "while/1", "while/5"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"Une boucle do while exécute votre code au moins une fois.", "while/5",""};




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

