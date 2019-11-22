package applicationtest.delle1.example.com.logreg;

public class Question4 {
    private String mQuestions [] = {
            "quel type de variable utiliseriez-vous pour un nom de ville?",
            "___________name=''elBOUI''",
            " _______ age=24;   __________height=189.87;",
            " _______ prenom='hafida';   __________nom=''el aboui'';",
            ""

    };


    private String mChoices [][] = {
            {"double ", "int", "String"},
            {"double ", "int", "String"},
            {"double/int", "int/int", "int/double"},
            {"String/string", "char/String", "String/char"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"String", "String", "int/double","char/String",""};




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

