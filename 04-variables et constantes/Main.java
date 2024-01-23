/*
    - Les variables se nomment en CamelCase ' uneVariable ' . ceci est plus utilisé en C++ et en Java .
    - Elles ne doivent pas contenir de caractères spéciaux, pas d'espaces.
    - Elles doivent commencer par une lettre ou un underscore " _ "

    - Une variable tiend sa portée ou sa localité là où elle a été déclarée. car une fois que l'on quitte 
    la methode où la variable a été declaré; cette variable sera liberée.

    - Par habitude, il faut toujours initialiser votre variable durant la declaration.

    - Pour créer une constante (c'est à dire une variable qui ne change pas sa valeur ), on utlise le mot clé ' final '.
    Par convention en Java, les constantes s'ecrivent en lettre Majuscule.

*/

public class Main {
    public static void main(String[] args) {

        /*
         * 
         * - Les variables déclarées dans la methode 'main' ne seront utilisable qu'à
         * l'interieur de cette methode 'main'.
         * Puis Java detruira ces variables une fois que nous sortons de cette methode.
         * D'où son nom de ' local variable '
         * qui indique que ces variables appartiennent à la methode ' static void main '
         * 
         */

        // Par habitude, il faut toujours initialiser votre variable durant la
        // declaration.
        int ageUtilisateur = 25;

        // Déclarons une constante :

        final int SALAIREPARHEURE = 18;

        // Let's clear the VS code console :
        System.out.println("\033c");

        System.out.println(
                "\n******************************************       Debut de notre programme ***************************************************** ");

        // Pour afficher la valeur d'une variable :
        System.out.println("Votre utilisateur a " + ageUtilisateur + " ans .");
        System.out.println("\t\t Votre employeur vous paiera un salaire de " + SALAIREPARHEURE
                + " Dollars Canadien par heure au travail . Merci");
        System.out.println("\t\t Votre entreprise vous paiera un salaire de " + SALAIREPARHEURE
                + " Dollars Canadien par heure au travail . Merci");

        System.out.println(
                "\n******************************************       Fin de notre programme ******************************************************* ");

    }

}
