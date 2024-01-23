/*
    - l'opérateur ' = ' : permet d'effectuer une affectation de la valeur dans une variable .
    - l'opérateur ' + ' : permet d'additionner deux variables numériques (mais aussi de concaténer des chaînes de caractères ).

    -> Les convertions ou ' cast ' : En Java, nous serons amenés à convertir des variables juste pour palier au type de resultat que nous 
    expectons pendant notre programme.

    -> Ce type de conversion s'appelle une conversion d'ajustement, ou cast de variable.

    - Le langage Java contient deux opérateurs qui permettent d'incrémenter et de décrémenter les variables de 1. 
    Ces opérateurs sont : ' ++ '  et ' -- ' . Ils sont placés soit avant soit après la variable dont on veut changer la valeur .

        int i = 0; ++i; i++; --i; i--;

        -> L'operateur de Post-incrémentation : ' i++ '

        -> L'operateur de Pré-incrémentation : ' ++i '

        -> L'operateur de Post-décrémentation : ' i-- '

        -> L'operateur de Pré-décrémentation : ' --i '


    - Lorsqu'on place l'opérateur d'incrémentation avant la variable (++i), elle est incrémentée avant usage.
     Mais quand l'opérateur est placé après (i++), la variable est incrémentée après son utilisation.

    - Lien externe_1 : https://armel-ndjobo.developpez.com/tutoriels/java/chap4-operateurs/

    - Nous pouvons reduire nos syntax en faisant des operateurs raccourcis comme : " += " , " -= " , " *= " , " /= " ou " %= " 

        Generalement, nous ecrivons : prixTotalDuPanier = prixTotalDuPanier + 20 ;

        De manière reduite, ca donne : prixTotalDuPanier += 20 ;

        Lien externe_2 : https://koor.fr/Java/Tutorial/JavaOperators.wp#:~:text=Les%20op%C3%A9rateurs%20de%20comparaisons,-Les%20op%C3%A9rateurs%20de&text=Il%20y%20a%20six%20op%C3%A9rateurs,le%20test%20de%20sup%C3%A9riorit%C3%A9%20stricte).
    
*/

public class Main {
    public static void main(String[] args) {

        // Let's clear the VS code console :
        System.out.println("\033c");

        System.out.println(
                "\n******************************************       Debut de notre programme ***************************************************** ");

        // Déclarons des variables de types numérique :

        int age = 0;
        int yearOfBirth = 1990;
        int currentYear = 2024;

        double notesTotal = 120, nombreDeCoefficient = 8;

        age = currentYear - yearOfBirth;

        // Faisons une conversion d'ajustement, ou cast de variable :
        // Nous forçons le resultat à etre un nombre sans virgule.
        int moyenneGenerale = (int) (notesTotal / nombreDeCoefficient);

        // Concatenons notre variable à une chaîne de caractères :

        System.out.println("\n Nous sommes en :  " + currentYear);
        System.out.println(" Votre an de naissance est en  : " + yearOfBirth);
        System.out.println("\t\t Vous avez maintenant :  " + age + " ans. Merci......");

        System.out.println("\t\t Vous avez obtenu une moyenne generale de : " + moyenneGenerale);

        System.out.println(
                "\n Maintenant que vous savez manipuler des variables, je vous propose de decouvrir des operateurs. ");

        System.out.println(
                "\n******************************************       Fin de notre programme ******************************************************* ");

    }

}
