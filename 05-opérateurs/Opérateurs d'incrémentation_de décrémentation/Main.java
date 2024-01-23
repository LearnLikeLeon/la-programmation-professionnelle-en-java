public class Main {
    public static void main(String[] args) {
        // Déclarons 3 Variables de types 'int' qui sont des entiers naturels :
        int i, j, n;

        System.out.println(
                "\n******************************************       Debut de notre programme ***************************************************** ");

        // Let's clear the VS code console :
        System.out.println("\033c");
        /*
         * Simplement la post-incrémentation : n = i++ veut dire :
         * 
         * n = i ;
         * i = i + 1;
         * 
         * Nous allons faire une copie de notre variable ici et on va à ce resultat
         * ensuite ajouter plus 1.
         */
        i = 0;
        n = i++; // Post-incrémentation
        System.out.println(
                " Dans ce cas de la post-incrementation de la variable ' i ' :\n\t nous avons la variable 'i' qui a une valeur de  "
                        + i + " \n\t puis la variable 'n' qui a une valeur de  " + n);
        i = 10;

        /*
         * Tandis que la pré-incrémentation : n = ++i veut dire :
         * 
         * i = i + 1 ;
         * n = i ;
         * 
         * Nous allons d'abord incrémenté (on met la priorie à l'incrémentation d'abord)
         * et ensuite on affecte cela comme nouvelle valeur.
         * 
         */
        n = ++i;// Pré-incrémentation
        System.out.println(
                "\n Dans ce cas de la pre-incrementation de la variable ' i ' :\n\t nous avons la variable 'i' qui a une valeur de  "
                        + i + " \n\t puis la variable 'n' qui a une valeur de  " + n);
        i = 20;
        j = 5;
        n = i++ * ++j;
        System.out.println("\n Dans ce troisieme cas, nous avons la variable 'i' qui a une valeur de " + i
                + " ; puis la variable 'n' qui a une valeur de  " + n);
        i = 15;
        n = i += 3;
        System.out.println("\n Dans ce cas :\n\t nous avons la variable 'i' qui a une valeur de " + i
                + " \n\t puis la variable 'n' qui a une valeur de  " + n);
        i = 3;
        j = 5;
        n = i *= --j;
        System.out.println("\n Dans ce cas :\n\t nous avons la variable 'i' qui a une valeur de " + i
                + " \n\t puis la variable 'j' qui a une valeur de  " + j
                + " \n\t enfin la variable 'n' qui a une valeur de  " + n);

        System.out.println(
                "\n******************************************       Fin de notre programme ******************************************************* ");

    }

}
