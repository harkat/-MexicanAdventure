# Projet Conception et Programmation Orientée Objet - Année Spéciale #

## Description du projet ##

L'objectif du projet est de réaliser un jeu d'aventure avec une
interface textuelle, mais il n'est pas interdit de le compléter
avec une interface graphique au moins pour visualiser
la carte du jeu.

Une source d'inspiration pour ce jeu est : *Colossal Cave Adventure*
(http://fr.wikipedia.org/wiki/Colossal_Cave_Adventure), qui a été créé
en 1975 par William Crowther.

Le jeu consiste à explorer un monde, dans lequel il y a des personnages
et des objets. Le joueur progresse dans le jeu en tapant des commandes
au terminal, consistant le plus souvent dans des directions ou des portes à franchir,
l'ordinateur répond en donnant des informations sur le lieu où se trouve
le joueur. Le joueur peut trouver des objets et les emporter avec lui.
Le joueur peut rencontrer des personnages avec qui il va pouvoir
dialoguer ou contre qui il va devoir se battre.

Un squelette de jeu, qui respecte mal les bonnes pratiques de conception vues
jusqu'à présent, a été réalisé. Ce squelette doit être presque
complètement *refactoré* pour être intégré comme base de votre propre
programme.

Sur la base du squelette de jeu fourni, le but du projet est de réaliser
un jeu d'aventures ayant un scenario original.

Chaque équipe de développement doit réaliser un scenario différent,
dont voici quelques idées :

* Vous êtes un globule blanc parcourant un corps humain à la recherche
de virus à détruire...
* Vous êtes perdu dans un centre commercial et devez trouver la sortie...
* Vous êtes un rat dans une ville et vous devez faire des réserves
de nourriture pour l'hiver...
* Vous êtes une preuse chevalière qui cherche à libérer un damoiseau
prisonnier d'un dragon dans un donjon...
* Vous êtes un démineur et vous devez trouver et
désamorcer une bombe avant qu'elle explose...
* Vous êtes premier ministre d'un pays en crise, vous devez parcourir
le monde à la recherche de soutien pour renégocier votre dette publique...

## Contenu Java du projet ##

Votre projet Java doit respecter les conditions suivantes
pour obtenir une note supérieure à la moyenne :

* Au moins 10 classes
* Au moins une classe abstraite
* Au moins une interface
* Au moins une énumération
* Au moins un singleton : *Randomizer* (par exemple)

Une classe de test sera associée avec chaque classes du programme,
chaque classe aura au minimum un test permettant de valider
le fonctionnement général de la classe.

Chacun des types génériques suivants devra être utilisé
par au moins une variable ou un attribut :

* `List<E>` : http://docs.oracle.com/javase/8/docs/api/java/util/List.html
* `Set<E>` : http://docs.oracle.com/javase/8/docs/api/java/util/Set.html
* `Map<K,V>` : http://docs.oracle.com/javase/8/docs/api/java/util/Map.html

Dans la classe principale la méthode main() aura au maximum deux lignes.
Elle devra juste instancier un objet de la classe principale et éventuellement
appeler une méthode de lancement de la boucle d'interaction.

On respectera les conventions d'écriture de programme Java : utilisez
le plugin `StyleCheck` de BlueJ pour valider la syntaxe.
Voir aussi : http://www.oracle.com/technetwork/java/codeconvtoc-136057.html

On documentera toutes les classes, méthodes et attributs en respectant les
conventions d'écriture des commentaires JavaDoc

On testera les cas d'erreurs et on utilisera au moins l'exception `IllegalArgument`
pour des paramètres de constructeurs ou de méthodes non conformes.

Le programme devra récupérer le plan logique (lieux, passages entre les lieux,
autres éléments suivant votre scenario)
de l'univers depuis un fichier textuel facilement modifiable.

On devra enregistrer l'état du programme dans un fichier sur le disque avant
de quitter le programme et le recharger lors du retour. On pourra proposer
plusieurs sauvegardes pour revenir à différents états du jeu.

## Interaction avec le programme ##

L'interaction avec le programme se fera en mode texte comme dans le projet
Eliza de support technique, que nous avons étudié précédemment.
Ce projet `tech-support` est également une bonne source d'inspiration
pour la gestion des commandes fournies par l'utilisateur.

Il n'est pas interdit de faire une visualistion graphique de l'état du jeu
en s'inspirant pour la partie graphique des projets `fox-and-rabbits`, `bouncing-balls`
et `scribble`.

## Gestion de projet ##

Vous pouvez choisir un chef de projet, qui décidera au dernier ressort
de la répartition du travail. Ce n'est pas obligatoire.

Vous devez définir à l'avance une liste de fonctionnalités à implémenter.
Elle évoluera sûrement au cours du temps. Il est important d'avoir
un plan d'action, comme lorsque l'on fait un voyage ou tout simplement
une recette de cuisine un peu élaborée (quels ingrédients, ustensiles, etc.).

Vous devez travailler de manière incrémentale, chaque version *committée*
doit fonctionner et implémenter une ou plusieurs fonctionnalités nouvelles,
à moins qu'elle ne corrige un bogue ou met en oeuvre du `refactoring`.

Vous devez vous partager le travail entre les membres de l'équipe
du projet, chacun étant responsable d'un sous-ensemble
de classes. Il faut donc bien définir les responsabilités de chaque classe
et spécifier les interfaces de ces classes c'est-à-dire
la signature des méthodes publiques.

Chacun des membres de l'équipe doit effectuer des *commits* sur le serveur
Bitbucket du projet. Au final vous devez avoir pour chaque membre de l'équipe
dans l'historique du projet au moins :

* 20% des *commits* pour une équipe de quatre,
* 16% des *commits* pour une équipe de cinq.

Pour vous partager le travail, c'est une bonne idée de faire des branches Git,
mais ce n'est pas une obligation.

On devra pouvoir voir dans l'historique des commits sur Bitbucket
la plan de développement sous-jacent.

## Soutenance 20 minutes - Mardi 26 avril 2015 ##

Il n'y a pas de rapport à faire, mais une présentation sous forme informatique.

Vous devrez présenter les éléments suivants (15 minutes) :

1. Le scenario de jeu.
1. Le diagramme de classes UML, avec tous les attributs et les méthodes publiques :
   UMLet (http://www.umlet.com) est votre ami, mais tout autre outil
   est le bienvenu.
1. Vous devez présenter au moins deux diagrammes de séquence pour des fonctionnalités
   un peu complexes impliquant trois objets. Vous pouvez utiliser le plugin de l'éditeur
   de diagramme de séquence de BlueJ ou UMLet ou autre chose.
1. Vous pouvez présenter un ou plusieurs diagrammes d'état.
1. Vous devez expliquer et montrer quelques choix techniques que vous avez effectués.
1. Vous devez faire un point sur les difficultés rencontrées.
1. Vous devez expliquer les possibilités d'extension et de généralisation
   de votre projet et ce que vous avez réalisé pour permettre cette évolution.

La présentation peut-être faite sous la forme d'un fichier de type
*Markdown*  intégré au projet sur le serveur Bitbucket, de la même manière
que les travaux pratiques.

### Partie démonstration (5 minutes) ###

1. Montrer l'exécution des tests unitaires.
1. Faire une démo du logiciel, éventuellement automatique.

## TACHE 0 : Constitution de l'équipe ##

Regroupez-vous par 4 ou 5.

Désignez éventuellement un chef de projet.

## TACHE 1 : Scenario de jeu ##

En salle de TD définissez un scenario de jeu. Identifiez les différents
objets de votre univers de jeu. Listez les fonctionnalités souhaitées.
Listez les commandes que vous imaginez.

Votre jeu doit avoir un but, afin que le joueur puisse gagner.
Essayez de penser à un tas de choses qui peuvent rendre le jeu intéressant
(passage dérobés, objets magiques, personnages qui vous aident si vous les
  nourrissez, limites de temps..).

Chaque mardi à 12h00 jusqu'à la soutenance est une étape, il y a donc
trois étapes intermédiaires : le 5, 12 et 19 avril.
Pour chacune de ces étapes, listez les fonctionnalités à réaliser.
Votre projet sera évalué à chaque mardi après-midi et une note sur 5 sera donnée.

Présentez votre projet en 5 minutes à la classe.

Créez un premier diagramme UML de votre jeu final. Dessinez un diagramme
de classe UML de la version de jeu que vous voulez au bout de la première semaine.

Répartissez-vous les responsabilités des différentes classes.

## TACHE 2 : Démarrage du projet technique ##

Le projet est déjà créée sur Bitbucket, il se nomme `adventure0#`,
`#` étant le numéro de votre groupe.
Le chef de projet est administrateur du projet.
L'équipe est déjà associée au projet.

Après avoir initialisé le projet sur sa machine, le chef de projet
télécharge le projet exemple `WorldOfIut` depuis l'espace arche de l'IUT.

Fichier exemple : http://arche.univ-lorraine.fr/mod/resource/view.php?id=264509

Le chef de projet ajoute les fichiers Java au projet avec `git add` et les
synchronise sur la *forge* Bitbucket.

## TACHE 3 : Développez votre jeu ##

Faites votre programme, chaque semaine une version utilisable
mais simplifiée doit être réalisée pour arriver à la version finale le 26 avril.

Chaque version finalisée hebdomadaire devra être identifiée par un *tag*,
par exemple : `git tag v1 -m "Version 1"`

A part la séance de TD du 29 mars et la séance de TP du 19 avril,
le développement logiciel se fait en dehors des heures de TD et TD de COO.

## TACHE 4 : Présentation du jeu ##

Comme dans la vie professionnelle vous devez présenter votre projet
à votre direction ou à vos clients, ici vous le présenterez à vos
camarades.

## Notation ##

La note finale sera une combinaison des élements suivants :
bon fonctionnement du jeu, complexité des fonctionnalités, respect
des bonnes pratiques de développement logiciel, respect des exigences
du projet, répartition des tâches entre les membres du projet,
développement incrémental, présentation du projet.

La note sera la même pour tous les membres de l'équipe.

## PLAGIAT ##

Un logiciel de détection de plagiats analysera vos programmes,
si il détecte un plagiat la note du projet sera divisée par deux.

![Exemple de carte de jeu d'aventure](http://www.spitenet.com/cave/images/AdventureMap.jpg)
