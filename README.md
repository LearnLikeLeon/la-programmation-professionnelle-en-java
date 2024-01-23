# la-programmation-professionnelle-en-java
Nous apprendrons les bases du langage Java qui nous seront nécessaires dans la suite de notre carrière professionnelle.

L'organisation et la bonne documentation de notre parcous d'apprentissage de ce langage java sont présentées ci dessous :

![Les opérateurs d'incrémentation et de décrémentation](https://github.com/LearnLikeLeon/la-programmation-professionnelle-en-java/assets/121564302/2923afcd-2f4e-4e4b-9bb6-df0f44c8839c)


Notre editeur de code sera  : Visual Studio Code

## Qu'allons-nous apprendre à travers ce dépôt de code :

  ### La programmation en Java :
  * Les bases ou les fondamentaux de Java : nous verrons ici ce qu'est Java et comment il fonctionne. Nous créerons notre premier programme, en utilisant des variables, des opérateurs, des conditions, des boucles. . .
  * Java et la Programmation Orientée Objet : après avoir dompté les bases du langage, vous allez devoir apprivoiser une notion capitale : l'objet. Vous apprendrez à encapsuler vos morceaux de code afin de les rendre modulables et réutilisables, mais il y aura du travail à fournir.
  * Les interfaces graphiques :  là, nous verrons comment créer des interfaces graphiques et comment les rendre interactives. C'est vrai que jusqu'à présent, nous avons travaillé en mode console.
  * Les interactions avec les bases de données :  de nos jours, avec la course aux données, beaucoup de programmes doivent interagir avec ce qu'on appelle des bases de données. Dans cette partie, nous verrons comment s'y connecter, comment
récupérer des informations et comment les exploiter.

   ### [Documenter et Versionner son travail sur GitHub](https://docs.github.com/fr/get-started/quickstart/hello-world) : 
    
  * Créer un compte personnel sur GitHub pour commencer à utiliser GitHub. ceci vous permettra de créer des dépôts de codes open source (disponible au public) de vos multiples projets en programmation.

  * Utilisation de GitHub tout en créant un nouveau dépôt de code "New Repository" pour votre projet avec un fichier 'README' qui vous servira de documentation.
  
  * [Modifier le fichier 'ReadMe' pour marquer les objectifs visés et réalisés du projet](https://docs.github.com/fr/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax).

  * De votre station de travail ou sur votre ordinateur à partir de votre editeur de code, developper les lignes de codes qui ferront les fichiers sources de votre projet.

  * Ouvrer votre invite de commande ou le terminal de votre editeur de code et naviguer dans le dossier où se trouve votre projet.
    
  * [Configurer Git sur votre ordinateur tout en donnant vos identifiants](https://docs.github.com/fr/get-started/getting-started-with-git/set-up-git).

  * Versionner votre travail (le developpement de votre code ) en local c'est à dire sur votre ordinateur ou environnement de developpement.

  * Versionner votre travail (le developpement de votre code ) sur GitHub.com c'est à dire pousser votre travail vers un dépôt distant en utilisant les commandes Git.
  
      Lien : https://docs.github.com/fr/get-started/using-git/pushing-commits-to-a-remote-repository
      
  * Une fois la création de votre code de programmation achevée, utilisez votre invite de commande ou le terminal de votre editeur de code pour pousser votre travail pour la première fois ( first commit using your terminal ) : 
  
      ### ' Visual Studio Code ' Terminal ou ' IntelliJ IDE ' Terminal ou ' Command Prompt ' :
        
        - Au cas où vous venez de créer un nouveau dépôt de code pour ce projet et vous vous n'avez pas créer une branche de travail locale en utilisant votre terminal;  saisissez les commandes 'git' suivantes pour envoyer 'push' des validations 'commits' effectuées sur votre branche locale vers un référentiel distant 'votre dépôt de code distant sur GitHub.com' :
    
          $ git init
          $ git add .
          $ git commit -m "mon premier commit using depuis mon editeur de code"
          $ git remote add origin git@github.com:{votre nom d'utilisateur sur GitHub}/{nom de votre dépôt sur GitHub.com concernant ce projet}.git
          $ git push -u origin main


        
        Remarque : Après cette phase d'initialisation, vous pouvez pousser toute autre modifications faite sur ce même projet dans le dit dépôt distant à partir de votre terminal tout en saisissant les commandes 'git' suivantes :

        - L'utilisation des commandes ci-dessous nous permettra de pousser notre code 'n' fois dans ce même dépöt distant:
    
          $ git add .
          $ git commit -m "Ajoût de l'application pour réguler la temperature de la chambre froide."
          $ git push -u origin main


**Félicitations:** _Vous venez de documenter votre parcours illustrant votre Programmation en Java de débutant à Professionnelle ._
