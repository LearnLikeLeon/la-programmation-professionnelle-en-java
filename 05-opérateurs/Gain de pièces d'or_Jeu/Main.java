/*
    - Dans ce jeu, un joueur gagnera des pièces d'or ' goldCoins ' au fûr et à mesure que 
    son niveau de jeu evoluera.

*/
public class Main {
    public static void main(String[] args) {

        // Let's clear the VS code console :
        System.out.println("\033c");

        System.out.println(
                "\n******************************************       Debut de notre programme ***************************************************** ");
        // Initialisation du nombre de pièces avant le jeu :
        int goldCoins = 0;
        System.out.println("\n Vous avez actuellement " + goldCoins + " pieces en or.");

        // Gain de 10 pièces d'or par le joueur :
        goldCoins = goldCoins + 10;
        System.out.println("\n Bravo, Vous possedez " + goldCoins + " pieces en or.");

        // Gain de 100 pièces d'or par le joueur :
        goldCoins = goldCoins + 100;
        System.out.println("\n Vous terminez le jeu avec " + goldCoins + " pieces en or.");

        System.out.println("\n\t\t Merci pour votre participation. ");

        System.out.println(
                "\n******************************************       Fin de notre programme ******************************************************* ");

    }

}
