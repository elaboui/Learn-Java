package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class btn3 extends AppCompatActivity {

   private ListView lvProduct;
   private production1 adapter;
   private List<production> mProductList;
   @RequiresApi(api = Build.VERSION_CODES.M)
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_btn3);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      fab.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + "elaboui.hafida@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My email's subject");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "My email's body");

            try {
               startActivity(Intent.createChooser(emailIntent, "Send email using..."));
            } catch (android.content.ActivityNotFoundException ex) {
               Toast.makeText(btn3.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
            }
         }
      });
      lvProduct = (ListView)findViewById(R.id.listview);

      mProductList = new ArrayList<>();
      //Add sample data for list
      //We can get data from DB, webservice here
      mProductList.add(new production(1, "JAVAC", "compilateur java"));
      mProductList.add(new production(2, "JAR",  "l'outil d'archivage java"));
      mProductList.add(new production(3, "JDB",  "L'outil de débogage Java"));
      mProductList.add(new production(4, "JRE",  "Environnement d'exécution Java"));
      mProductList.add(new production(5, "JVM",  "La machine virtuelle Java"));
      mProductList.add(new production(6, "IDE",  "Environnement de Développement Intégré"));
      mProductList.add(new production(7, "Argument",  "une donnée qui est passée dans une méthode ou un programme. Aussi appelé paramètre"));
      mProductList.add(new production(8, "break;",  "utilisé exit a pour, commuter, while ou do_while"));
      mProductList.add(new production(9, "continue; ",  "termine l'itération en cours"));
      mProductList.add(new production(10, "exception", "une erreur ou une anomalie qui se produit pendant l'exécution d'un programme"));
      mProductList.add(new production(11, "array", "collection est une tableau  de variable du même type"));
      mProductList.add(new production(12, "package", "un groupe de types similaires de classes"));
      mProductList.add(new production(13, "API", "Interface de programmation d'applications"));
      mProductList.add(new production(14, "int", "utilisé pour déclarer une variable entière"));
      mProductList.add(new production(15, "boolean", "utilisé pour déclarer une variable booléenne, qui ne renvoie que deux valeurs possibles: true et false"));
      mProductList.add(new production(15, "float", "utilisé pour déclarer une variable à virgule flottante"));
      mProductList.add(new production(15, "char", "utilisé pour déclarer une variable de caractère"));
      mProductList.add(new production(15, "string", "une séquence de caractères"));
      mProductList.add(new production(15, "void", "indique qu'une méthode ne renvoie pas de valeur"));
      mProductList.add(new production(15, "null", "absence de valeur"));
      mProductList.add(new production(15, "integer", "nombre entier"));
      mProductList.add(new production(15, "floating point number", "un nombre réel"));
      mProductList.add(new production(15, "enum", "une collection de constantes"));
      mProductList.add(new production(15, "boolean", "un type de données avec seulement deux valeurs possibles: true ou false"));
      mProductList.add(new production(15, "ArrayList", "un tableau redimensionnable"));
      mProductList.add(new production(15, "LinkedList", "une structure de données composée d'un groupe de nœuds qui représentent ensemble une séquence.Chaque nœud est composé de données et d'un lien vers le nœud suivant de la séquence"));
      mProductList.add(new production(15, "HashMap", "utilisé pour stocker la collecte des données dans les paires de clés et valeurs"));
      mProductList.add(new production(15, "Iterator", "un objet qui permet de parcourir une collection"));
      mProductList.add(new production(15, "instance", "chaque objet est appelé une instance de classe"));
      mProductList.add(new production(15, "constrecteur", "méthodes spéciales utilisées pour initialiser des objets et appelées au moment de la création de l'objet"));
      mProductList.add(new production(15, "methode", "une collection d'instructions regroupées pour effectuer une opération (également appelée fonction)"));
      mProductList.add(new production(15, "encapsulation", "l'emballage de données et de méthodes dans un seul composant"));
      mProductList.add(new production(15, "heritage", "un processus par lequel une classe hérite des membres et des méthodes d'une autre classe"));
      mProductList.add(new production(15, "polymorphisme", "polymorphisme signifie qu'un appel à une méthode membre entraînera l'exécution d'une méthode différente en fonction du type d'objet invoquant la méthode"));
      mProductList.add(new production(15, "extends", "utilisé pour hériter d'une sous-classe"));
      mProductList.add(new production(15, "static", "la variable statique et les méthodes appartiennent à la classe au lieu d'une instance spécifique"));
      mProductList.add(new production(15, "classe abstraite", "si une classe est déclarée abstraite, elle ne peut pas être instanciée et vous devez en hériter. toute classe contenant une méthode abstraite doit être définie comme abstraite"));
      mProductList.add(new production(15, "interface", "une classe complètement abstraite, qui ne contient que des méthodes abstraites"));
      mProductList.add(new production(15, "getter", "La méthode getter renvoie la valeur de l'attribut"));
      mProductList.add(new production(15, "setter", "La méthode setter prend un paramètre et l'assigne à l'attribut"));


      //Init adapter
      adapter = new production1(getApplicationContext(), mProductList);
      lvProduct.setAdapter(adapter);

        /*lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked product id =" + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });*/
   }
}




