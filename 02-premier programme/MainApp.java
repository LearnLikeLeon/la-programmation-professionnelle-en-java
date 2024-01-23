/*
    - On appelle toujours le fichier source du code de la même manière que le nom de la classe ' class '.

    - Avant de commencer, vous devez savoir que tous les programmes Java sont composés d'au moins une
classe. Cette classe doit contenir une méthode main. Celle-ci est la méthode principale du programme, c'est elle
que la Java Virtual Machine 'JVM' va chercher afin de lancer votre programme. En conclusion, c'est le point de départ du programme.

    - Une méthode est une suite d'instructions à exécuter. Une méthode contient :
        ->  une entête : celle-ci va être un peu comme la carte d'identité de la méthode. Nous y reviendrons.
        -> un corps : le contenu de la méthode. Ce qui va être fait ! Délimité par des accolades {}.
        -> une valeur de retour : le résultat que la méthode va retourner. SAUF pour les méthodes de type void qui ne renvoient rien.

    Remarque : 

        - Vous verrez, un peu plus tard, qu'un programme n'est qu'une multitude de classes qui s'utilisent l'une l'autre.
        Mais pour le moment, nous n'allons travailler qu'avec une seule classe.

*/

// On definit la classe ' MainApp '
class MainApp {
    /*
     * - Comme je vous l'ai dit plus haut, notre unique classe contient la méthode
     * ' main ' .
     * 
     * - La syntaxe de cette méthode est toujours la même .
     * 
     */
    public static void main(String[] args) {
        /*
         * Expliquons un peu cette ligne de code :
         * Littéralement, elle signifie
         * "la méthode print() va écrire ` Bonjour tout le monde ! :  ` en utilisant l'objet out de la classe System"
         * .
         * - System : ceci correspond à l'appel d'une classe qui s'appelle "System".
         * C'est une classe utilitaire qui permet surtout
         * d'utiliser l'entrée et la sortie standard.
         * - out : objet de la classe System qui gère la sortie standard.
         * - print : méthode qui écrit dans la console la chaîne passée en paramètre.
         * 
         * Confère Livre : Apprenez à Programmer en Java , Page 15
         * 
         * Voici quelques caractères d'echappement : ' \n ', ' \t '. ' \r ', etc....
         */
        System.out.println("Bonjour tout le monde ! : ");
        /*
         * - IntelliJ IDE pourra afficher des caractères speciaux comme les accents .
         * System.out.println("\t\t Régalons-nous avec du langage Java pour débutants."
         * );
         * 
         * - Malheureusement: Visual Studio Code Console ne prend pas les accents en
         * Java.
         * 
         */

        // System.out.println("\t\t Régalons-nous avec du langage Java pour débutants.
        // ");
        System.out.println("\t\t Regalons-nous avec du langage Java pour debutants. ");

        System.out.print("Veuillez Attacher ");
        System.out.print("votre ");
        System.out.print("ceinture !!! \n ");
        System.out.print("On va s'envoler dans du code. Merci ");

    }
}
