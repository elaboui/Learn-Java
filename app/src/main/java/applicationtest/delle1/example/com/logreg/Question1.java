package applicationtest.delle1.example.com.logreg;
// c'est une new class ;
public class Question1 {
    private String mQuestions [] = {
            "pour distribuer votre application sur différentes plates-formes, combien de version Java devez-vous créer ?",
            "Lequel des énoncés suivants est vrai?",
            ""

    };


    private String mChoices [][] = {
            {"2 versions", "un pour chaque plate-forme", "juste une version"},
            {"Java est utilisé uniquement dans les applications Web et mobiles", "Java est utilisé uniquement les applications liées à l'espace de la NASA", "Java a une communauté de développeurs hyge"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"juste une version","Java a une communauté de développeurs hyge",""};




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
