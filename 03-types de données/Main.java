/*
    -> En Java, nous avons deux types de variables :
        - Des variables de type simple ou primitif : Ce qu'on appelle des types simples ou types primitifs en Java; sont tout bonnement
    des nombres entiers, des nombres réels, des booléens ou encore des caractères. Vous verrez qu'il y a plusieurs façons de déclarer certains de ces types.

        - Des variables de type complexe ou des objets .

        Remarque : 
            - Une déclaration de variable se fait comme ceci :

                <Type de la variable> <Nom de la variable> ;

            Cette opération se termine toujours par un point-virgule ( ; . Ensuite, on l'initialise en entrant une valeur.

    NB : 
        - To paste the normal way:  Shift + Ctrl + V

        Link : https://github.com/redhat-developer/vscode-java/issues/3154

        - To clear the console : 
        
                System.out.println("\033c");

*/

public class Main {
    public static void main(String[] args) {

        // Déclarons des variables de types numérique :

        int age = 0;
        int yearOfBirth = 1990;
        int currentYear = 2024;

        age = currentYear - yearOfBirth;

        System.out.println("\n Nous sommes en :  " + currentYear);
        System.out.println(" Votre an de naissance est en  : " + yearOfBirth);
        System.out.println("\t\t Vous avez maintenant :  " + age + " ans. Merci......\n");

        byte B = 22; // initializes a byte type variable B.
        int rayonDuCercle = 10; // Example of initialization

        float pi = 3.14f; // declares and assigns a value of PI.
        double aireDuCercle, perimetreDuCercle, diametreDuCercle; // Declares three variables at the same time

        char a = 'a'; // the char variable a iis initialized with value 'a'
        String message = "Vous etes sur Canal2 International.";

        aireDuCercle = rayonDuCercle * rayonDuCercle * pi;
        perimetreDuCercle = 2 * rayonDuCercle * pi;
        diametreDuCercle = rayonDuCercle * 2;

        // Let's clear the VS code console :
        System.out.println("\033c");

        System.out.println(
                "\n******************************************       Debut de notre programme ***************************************************** ");
        System.out.println("\n Votre cercle a un diametre de " + diametreDuCercle + " metres. ");
        System.out.println(" Votre cercle a un perimetre de " + perimetreDuCercle + " metres carres. ");
        System.out
                .println("\n\t\t Votre cercle a une superficie de " + aireDuCercle + " metres carres. Merci......\n");

        System.out.println(
                "\n******************************************       Fin de notre programme ******************************************************* ");

    }

}
