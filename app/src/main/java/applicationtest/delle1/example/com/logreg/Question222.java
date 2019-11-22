package applicationtest.delle1.example.com.logreg;

public class Question222 {
    private String mQuestions [] = {
            "Remplissez les espaces pour calculer la somme des éléments de tableau à l'aide de la boucle for." +
                    "double sum=0.0;\n" +
                    "for(int x=0;x<4;___){\n" +
                    "sum+=myArray[x];\n" +
                    "}\n" +
                    "System.out.println(___);",
            ""

    };


    private String mChoices [][] = {
            {"x+1/sum", "x++/sum", "x++/x"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"++/sum",""};




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

