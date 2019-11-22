package applicationtest.delle1.example.com.logreg;

public class Questiontest {
    static String mQuestions [] = {
            "Java est un langage",
            "Java est un langage d´eveloppé par",
            "Lequel des éléments suivants n’est pas un concept POO en Java?",
            " Quand la surcharge de méthode est-elle déterminée?",
            " Quels keywords sont utilisés pour spécifier la visibilité des propriétés et des méthodes ?",
            "Pour la classe B d´efinie comme suit:" +
                    "class B {" +
                    "public B(){System.out.print(”Ciao”);};" +
                    "public B(int i) {this(); System.out.println(”Bonjour ”+i);}}" +
                    "qu’affichera l’instruction suivante?\n" +
                    "B monB=new B(2003);\n",
            " Pour la classe C d´efinie comme suit:\n" +
                    "class C {public static int i;\n" +
                    "public int j;\n" +
                    "public C() {i++; j=i; }}\n" +
                    "qu’affichera le code suivant?\n" +
                    "C x=new C(); C y=new C(); C z= x;\n" +
                    "System.out.println(z.i + ” et ” + z.j);",
            "L’interprétation des programmes Java est effectuée par:",
            "Quelle classe n’a pas de classe mére ?",
            "Qu’est-ce qui est faux pour les interfaces ?",
            "Pour la classe définie comme suit :\n" +
                    "public class Bidon {int x ;} ;\n" +
                    "lequel des programmes est faux ?",
            "Pour avoir un commentaire sur une ligne, on place en début de ligne le(s) caractére(s) :",
            "Lequel de ces identificateurs est incorrect :",
            "De quel type primitif est le littéral 25.5F ?",
            "Pour déclarer une variable de type primitif int qui a pour nom jour, il faut écrire :",
            "Pour spécifier que la valeur d'une variable ne peut changer, on la déclare comme une constante avec le mot réservé :",
            "Trouvez la ligne incorrecte :",
            "Qu'est-ce qu'une \"super classe\" ?",
            "Pour une classe en Java, on accède à l'instance courante avec",
            "Par convention un nom de variable",
            "Le constructeur d'une classe doit porter le meme nom que la classe",
            "Quel opérateur sert pour la concaténation des chaines de caractères ?",
           " Quel mot clé permet de rendre une classe accessible à l'extérieur de son package ?",
            "Comment permettre à une méthode de gérer un nombre de paramètres variable ?",
            "\"--\" est un opérateur de",
            "L'objet Scanner permet ",
            "Quel est la différence entre les variables de type \"long\" et \"double\" ?",
            "Comment afficher \"Hello Word\" dans la console ?",
            "\"switch\" s'utilise pour",
            "Le mot clé \"extends\" est utilisé pour",
            "Quel est l'opérateur de \"OU\" logique ? ",
            " Lequel de ces opérateurs est utilisé pour allouer de la mémoire à un tableau en Java?",
            "Lequel de ces énoncés est incorrect?",
            "Lequel de ces énoncés est incorrect?",
            "Qu’est-ce que s’affiche ce code?" +
                    "int tab[] = new int [4];\n" +
                    "System.out.print(tab);",
            "Lequel de ces éléments est nécessaire à spécifier lors de l’initialisation d’un tableau?",
            "Lequel des éléments suivants n’est pas un type de retour?",
            "Étant donné deux entiers non négatifs « x » et « y » et une chaîne de caractère « str », quel est le nombre de caractères dans l’expression",
            "La valeur initiale d’une variable d’instance de type String qui n’est pas explicitement initialisée dans le programme est … ?",
            "Quelle est la meilleur façon pour obtenir le nombre d’éléments qui se trouve dans le tableau arr.",
            "Lequel de ces mots-clés est utilisé pour créer une classe?",
            "Lesquels de ces instructions ne sont pas valides?",
            "Laquelle de ces déclarations permettrait de démarrer une classe en tant que programme autonome.",
            " Parmi ces propositions, lesquelles sont des déclarations ou des définitions autorisés?"













    };


    private String mChoices [][] = {
            {"Interprété","Compilé et interprété","Compilé"},
            {"Sun Microsystems","Oracle","Hewlett-Packard"},
            {"Héritag", "Encapsulation" ,"Compilation"},
            {"Au moment de l’exécution", " Au moment de l’exécution", "Au moment de la compilation"},
            {"A.final","B.static","C.public"},
            {"erreur d’ex´ecution","Bonjour 2003","CiaoBonjour 2003"},
            {"2 et 2","2 et 1","1 et 1"},
            {" API","AWT","JVM"},
            {"une classe abstraite","Object","String"},
            {"Une I. peut étre instanciée","Une I. peut étre le type d’une référencé","Une I. peut étre implémentée"},
            {"Bidon a=new Bidon(3) ;","Bidon a=new Bidon() ; boolean b= a.equals(”bonjour”) ;","Bidon a=new Bidon() ; String s=a.toString() ;"},
            {"/**_____*/","//","/*____*/"},
            {"ToTaL","2emechoix","nom_prenom"},
            {"double","short","long"},
            {"declare(type int) : jour;","int jour;","jour = new int;"},
            {"final","finalize","const"},
            {"i nt somme = 1 5 ;","int somme=15;","int somme = 15;"},
            {"une classe \"main\"","une classe \"public\"","une classe mère"},
            {"au mot clé \"new\"","au mot clé \"this\"","à l'opérateur \".\""},
            {"commence par une minuscule","est en majuscules","commence par un underscore ( _ )"},
            {"Non, c'est interdit","Pas obligatoirement","Oui, impérativement"},
            {"+","&","&&"},
            {"global","public","super"},
            {"utiliser des mutateurs","la surcharger","la déclarer en void"},
            {"soustraction","négation","décrémentation"},
            {"la lecture d'entrées au clavier","l'acquisition via un scanner","a recherche de ports de communication"},
            {"long définit des entiers et double des nombres en virgule flottante","double n'existe pas en Java","long occupe 2 octets et double 4 octets"},
            {"System.console.print(\"Hello World\");","System.out.print(\"Hello World\");","System.console.display(\"Hello World\");"},
            {"permuter des chaines de caractères","tester une suite de conditions","permuter des variables"},
            {"l'héritage d'une classe","l'adressage mémoire","étendre la portée d'une variable"},
            {"||","OR","XOR"},
            {"malloc"," alloc","new"},
            {"int tab[ ] = int [] new","int [ ] tab = new int[4]","int tab[ ] = new int[4]"},
            {"Le tableau peut être initialisé quand il est déclaré.","Il est nécessaire d’utiliser l’opérateur new pour initialiser un tableau."," Aucun de ces réponses"},
            {"code hexadecimal","la valeur stockée dans tab[0].","0000"},
            {" Nombre de ligne","Nombre de colonne"," Aucune de ces réponses"},
            {"public"," boolean"," void"},
            {"x + y","y – x"," x – y"},
            {"NULL","null","La variable d’instance doit être explicitement affectée."},
            {"arr.size","arr.length()"," arr.length"},
            {"class"," struct","int"},
            {"short s = 15;","int I = ‘0’;","double d = 4.2;"},
            {"public static void main(String args[])","public static int main(char args[])"," public static void main(String args)"},
            {"int y[5];"," int *y;","int[ ] [ ] y[ ];"}

    };



    private String mCorrectAnswers[] = {"Compilé et interprété","Sun Microsystems","Compilation","Au moment de la compilation","C.public","CiaoBonjour 2003",
            "2 et 1","JVM","Object","Une I. peut étre instanciée","Bidon a=new Bidon(3) ;","//",
    "2emechoix","long","int jour;","final","i nt somme = 1 5","une classe mère","au mot clé \"this\"","commence par une minuscule",
    "Oui, impérativement","+","public","la surcharger","décrémentation","la lecture d'entrées au clavier",
    "long définit des entiers et double des nombres en virgule flottante","System.out.print(\"Hello World\");","tester une suite de conditions",
    "l'héritage d'une classe","||"," new","int tab[ ] = int [] new","Il est nécessaire d’utiliser l’opérateur new pour initialiser un tableau.",
    "code hexadecimal"," Aucune de ces réponses","public","y – x","null"," arr.length","class","int I = ‘0’;",
    "public static void main(String args[])","int[ ] [ ] y[ ];"};




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

