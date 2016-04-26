import java.util.Scanner;
/**
 * Manipule le dialogue durant le jeu
 * 
 * @author Amir (edit Jerry)
 * @version 1.0
 */
public class Interaction
{
    /**
     *  question pour le lab
     */
    private final static String [] labTalk = {"au laboratoire du savant fou FranckLeBarge", 
            "Résoudre 20 * 5 ? : ",
            " 1-10 \n 2-99 \n 3-100 \n 4-101",
            "3"} ;     
    /**
     *  question pour le casino
     */
    private final static String [] casinoTalk = {"dans le club où tout est permis !",
            "Quelle est la probabilité en pourcentage " +
            "d'avoir une main Quinte \nau jeu de Poker 32 carte ?  : ",
            " 1-10% \n 2-2% \n 3-40% \n 4-60%",
            "2"} ;
    /**
     *  question pour le dojo
     */
    private final static String [] dojoTalk = {"dans le dojo d'arts martiaux shaolin !", 
            "Quel est la partie la plus faible du corps humain ? : ",
            " 1-la tête \n 2-les pieds  \n 3-les bras  \n 4-le torse",
            "1"} ;
    /**
     *  question pour le bar
     */
    private final static String [] barTalk = {"dans le bar où toutes les boissons " +
            "sont super alcoolisées !", 
            "Quel est le degré d'alcool de la Tequila San José ? : ", 
            " 1- 80% \n 2- 35%  \n 3- 8%  \n 4- 0.2%",
            "2"} ;

    /**
     *  question pour le forest
     */
    private final static String []forestTalk ={"dans la Forêt sauvage, où seuls " +
            "les braves ont leur place !", 
            "Quel est le carré du tiers de 12 ? : ", 
            " 1- 17 \n 2- 15  \n 3- 4  \n 4- 16",
            "4"} ;

    /**
     *  question pour le ferry
     */
    private final static String [] ferryTalk = {"au bord du Bateau qui mène " +
            "vers toutes les destinations !", 
            "Combien font 10 noeud en Km/h ? : ",
            " 1- 30 km\n 2- 18 km  \n 3- 50 km  \n 4- 8 km",
            "1"} ;

    /**
     *  question pour le circus
     */
    private final static String [] circusTalk = {"dans le chapiteau du cirque " +
            "des acrobaties dangeureuses !",
            "Pendant combien de jours un être " +
            "humain peu vivre sans manger ? : ",
            " 1- 5 jours \n 2- 9 jours  \n 3- 7 jours  \n 4- 30 jours",
            "4"} ;
    /**
     *  question pour le zoo
     */
    private final static String [] zooTalk = {"dans le zoo des animaux sauvages !", 
            "Quel est l'animal le plus rapide au monde ? : ",
            " 1- le dauphin \n 2- le guépard \n " +
            "3- la tortue  \n 4- la girafe",
            "2"} ;
    /**
     *  question pour le bike
     */
    private final static String [] bikeTalk = {"dans le club des motards fous !",
            "Quel est le constructeur de moto le plus connu " +
            "au monde pour ses \ngrosses cylindrées ? : ", 
            " 1- Suzuki \n 2- Renault  \n 3- Ferrari \n 4- Harley davidson",
            "4"} ;
    /**
     *  question pour le plane
     */
    private final static String [] planeTalk = {"au bord de l'avion qui vole vers " +
            "toutes les destinations !",
            "Quelle est l'altitude minimale en M  à " +
            "partir de laquelle l'avion peut \nvoler ? : ",
            " 1- 1000 m \n 2- 8000 m  \n 3- 50 m \n 4- 600 m ",
            "2"} ;      
    /**
     * Room courante concernee par le dialogue
     */
    private Room curentRoom;
    /**
     * Hero courant (joueur)
     */    
    private Hero hero ;
    /**
     * Scanner pour écrire au clavier
     */  
    private static Scanner sc = new Scanner(System.in); 
    /**
     * Constructeur d'objet Dialogue
     * @param rm la Room concernée par le dialogue
     * @param pr le Hero concerné par le dialogue
     * @param obj l'Objet concerné par le dialogue
     */
    public Interaction (Room rm, Hero pr)
    {
        this.curentRoom = rm ; 
        this.hero = pr ;        
    }

    /**
     * selecteur de dialogue
     */
    public void interactionMaker()
    {       
        String [] content = null ;  

        switch (this.curentRoom.getDescription()) {
            case ("au cirque") :
            content = this.circusTalk ;
            break ;

            case "au monastère Shaolin":
            content = this.dojoTalk ;
            break ;

            case "au zoo" :
            content = this.zooTalk ;
            break ;

            case "au Laboratoire de FrankLeBarge":
            content = this.labTalk ;
            break ;

            case "au ferryBoat" :
            content = this.ferryTalk ;
            break ;

            case "au bar" :
            content = this.barTalk ;
            break ;

            case "au club des motards" :
            content = this.bikeTalk ;
            break ;

            case "à la foret sauvage" :
            content = this.forestTalk ;
            break ;

            case "au casino" :
            content = this.casinoTalk ;
            break ;

            case "à l'aéroport" :
            content = this.planeTalk ;
            break ;       
        }

        if (this.curentRoom.getDescription().equals(
            "à l'arène finale de combat de Satan")) {
            this.finalTalk() ;
        }

        else {
            System.out.println(); 
            System.out.println("Salut " + this.hero.getNom() +
                "," + "\n" + "Bienvenue " + content[0] + "\n" +
                "Peut être que j'ai un objet à t'offrir\n"+
                "et aussi, si tu veux que je te dise où se" + 
                " trouve le catcheur mafieux Satan.\n" +
                "Il faut que tu sois capable de répondre à une question... ");
            System.out.print("Appuies  sur \"ENTER\" pour cotinuer..."); 
            sc.nextLine();
            System.out.print("Veux-tu répondre à ma question ? " +
                "(\"oui\" : pour ouais) : ");
            String str = sc.nextLine();
            if (str.equals("oui")) {
                System.out.println ("Voici ma question : "); 
                System.out.println(content[1]);
                System.out.println();  
                System.out.println ("Les choix : "); 
                System.out.println(content[2]);
                System.out.println();  
                System.out.print("Quel est le numéro " +
                    "de la bonne réponse  ? : "); 
                String str1 = sc.nextLine();
                if (str1.equals(content[3])) {
                    System.out.println("Bien joué !") ;                    
                    if ((this.curentRoom.objet != null) && (this.curentRoom.objet instanceof Nourriture)) {
                        System.out.println("Voyons quel objet je peux te donner...") ;
                        this.eatTalk() ;     
                    }
                    if ((this.curentRoom.objet != null) && (this.curentRoom.objet instanceof Instrument)) {
                        System.out.println("Voyons quel objet je peux te donner...") ;
                        this.instrumentTalk() ;
                    }
                    System.out.println("Le catcheur mafieux SATAN " +
                        "se trouve dans la direction : \n" +
                        curentRoom.directSortie) ;
                    this.hero.setScore(500);
                }
                else {
                    this.hero.ajouterVie (-1.00);
                    System.out.println("Mauvaise réponse ! Je ne " +
                        "peux rien te dire sur SATAN ! \n" +
                        "À la prochaine fois...") ;  
                    System.out.println("Tu as perdu 1 point de vie !" +
                        " Il te reste : " + this.hero.getVie() + " ptVie");
                }   
            } 
            else {
                System.out.println("Hahaha je comprends " +
                    "que tu as peur mon petit, " + this.hero.getNom() +
                    "\n" + "à la prochaine fois...") ;  
            }           
            System.out.println();   
        }                                        
        if ((this.curentRoom.adversaire != null) && (this.curentRoom.adversaire instanceof Monstre)) this.monsterTalk () ;
        if ((this.curentRoom.adversaire != null) && (this.curentRoom.adversaire instanceof Catcheur))this.catcheurTalk () ;
    }    

    /**
     *  methode dialogue pour les rellique
     */
    public void reliqueTalk ()
    {
        System.out.println();
        System.out.print("Super!! la relique ! ");
        System.out.println("C'est : " + this.curentRoom.objet.getNom());
        System.out.print("appuies  sur \"ENTER\" pour récupurer la relique"); 
        sc.nextLine();
        this.hero.setPrise((Relique)this.curentRoom.objet);
        this.hero.setScore(((Relique)this.curentRoom.objet).getPoints());
        System.out.println("Relique : "+ this.curentRoom.objet.getNom()+" récupurée"); 
        this.curentRoom.objet = null;
        if (this.hero.possederUneRelique()) System.out.println("Il te manque encore 2 autres reliques.");
        if (this.hero.possederDeuxRelique()) System.out.println("Il te manque encore 1 autre relique.");
        if (this.hero.possederRelique()) System.out.println("Tu as les 3 reliques, maintenant faut aller affronter Satan");
        System.out.println();
    }

    /**
     *  methode dialogue pour la nouriture
     */
    public void eatTalk ()
    {
        System.out.print("Tiens " + this.curentRoom.objet.getNom() + "! ");
        System.out.println("ça peut te donner de l'énérgie.");
        System.out.print("appuies  sur \"ENTER\" pour récupurer la nouriture"); 
        sc.nextLine();
        this.hero.ajouterVie(((Nourriture)this.curentRoom.objet).getEnergie());
        System.out.print("Cool, désormais j'ai : ");
        System.out.println(hero.getVie() + " points de vie");
        this.curentRoom.objet = null;        
        System.out.println();
    }

    /**
     *  methode dialogue pour les instruments
     */
    public void instrumentTalk ()
    {
        System.out.print("Hum... C'est quoi ça? ");
        System.out.print(this.curentRoom.objet.getNom());
        System.out.println("! ça peut te servir lors des combats!");
        System.out.print("appuies  sur \"ENTER\" pour récupurer l'instrument"); 
        sc.nextLine();
        this.hero.setInstrument((Instrument)this.curentRoom.objet);
        this.hero.setScore(((Instrument)this.curentRoom.objet).getPoints());
        System.out.println(this.curentRoom.objet.getNom()+" récupuré");
        this.curentRoom.objet = null;        
        System.out.println();
    }

    /**
     *  methode dialogue pour le final
     */
    public void finalTalk () 
    {   
        System.out.println(       
            "\n" +
            "Enfin tu m'as retrouvé petit catcheur mexicain ! " +
            "J'ai entendu dire que" + "\n" +
            "pendant un certain moment, " +
            "tu m'as cherché un peu partout" + "\n" +
            "dans le monde ! Tu es devant moi maintenant... ");
        System.out.print("appuies  sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.println("Qu'attends tu de moi au juste ?");
        String str1 = sc.nextLine();
        System.out.println(str1 + " !! OK, si tu veux cela, " + 
            "il faut m'affronter en combat final!");                      
    }

    /**
     *  methode dialogue pour les monstre
     */
    public void monsterTalk () 
    {
        Monstre monstre = (Monstre)this.curentRoom.adversaire ;
        Objet instru = (Objet)this.hero.getInstrument();
        System.out.println("Mauvaise nouvelle, le monstre : " + monstre.getNom()+
            " t'as repéré ! \net Bonne nouvelle, si tu le bats tu purais récupurer la rélique\nqu'il possède");
        System.out.println("Veux-tu combattre le monstre ou t'enfuire ?\n" +
            "(\"combattre\" : pour combattre)");
        System.out.print("(\"n'importe quelle touche\" : pour fuire)\n > ");
        String str = sc.nextLine();
        if (str.equals("combattre")) {
            System.out.println("Mais quel courage !");
            if (this.hero.getInstrument() != null ){                
                System.out.println("T'as l'instrument  : " + instru.getNom());
                System.out.print("Veux-tu l'utiliser pour combattre le monstre : " +monstre.getNom()+
                    " ?\n( \"oui\" : pour ouais) : ");
                str = sc.nextLine();
                if (str.equals("oui")) {
                    this.hero.setInstrument(null);
                    monstre.subirFrappe(monstre.getVie()/2);
                    System.out.println("Grâçe à ton "+instru.getNom()+" le monstre "+monstre.getNom()+
                        " a perdu la moitier\nde ses points de vie,");
                    System.out.println("  -Points de vie du monstre après l'utilisation de l'instrument : "+
                        monstre.getVie() ) ;
                }
            }            
            else System.out.println("Tu n'as pas d'instrument pour contrer le monstre"); 

            while (!monstre.etreMort() && !this.hero.etreMort()){
                System.out.println("Appuies  sur \"ENTER\" pour attaquer le monstre"); 
                sc.nextLine();
                System.out.println("Prend ça "+ monstre.getNom()+"\n"+monstre.getNom()+" : OUCH !");
                this.hero.attaquer(monstre);
                System.out.println("  -Ptvie "+ monstre.getNom()+" après l'attaque : "+
                    monstre.getVie() ) ;
                if (monstre.getVie()<1) {
                    System.out.println("Bravo! Le monstre est mort");
                    System.out.println("Appuies  sur \"ENTER\" pour cotinuer..."); 
                    sc.nextLine();
                    break ;
                }
                System.out.println("Appuies  sur \"ENTER\" pour cotinuer le combat"); 
                sc.nextLine();
                monstre.attaquer(this.hero);
                System.out.println("Tu viens de te faire attaquer par le monstre");
                System.out.println("Il te reste : "+
                    this.hero.getVie()+" points de vie" ) ;
            }

            if (monstre.etreMort()) {
                System.out.println("Ouf ! c'était chaud ! "); 
                this.reliqueTalk ();
                this.hero.setScore(1000);
                this.curentRoom.adversaire = null ;
            }   
            if (this.hero.etreMort()){ 
                System.out.println(monstre.getNom()+ 
                    " : je t'ai bien dit que t'allais te faire dévorer petit catcheur"); 
            }
        }
        else System.out.println("Cours "+this.hero.getNom()+" cours !" );        
        System.out.println();        
    }

    /**
     *  methode dialogue pour les monstre
     */
    public void catcheurTalk () 
    {
        Catcheur catcheur = (Catcheur)this.curentRoom.adversaire ;
        Objet instru = (Objet)this.hero.getInstrument();
        String str = "";
        if (catcheur.getNom().equals("Satan"))
        {
            System.out.println("appuies sur \"ENTER\" pour combattre Satan");                     
            sc.nextLine(); 
            str = "oui" ;
        }
        else
        {          
            System.out.println("tu viens de te faire défié par le catcheur : " + catcheur.getNom()+
                "\nsi tu le bats tu  pourrais récupurer la rélique qu'il possède");
            System.out.print("Acceptes-tu le défi ?" +
                "(\"oui\" : pour ouais) : ");
            str = sc.nextLine();               
        }
        if (str.equals("oui")) { 
            System.out.println("Mais quel courage !");
            if (this.hero.getInstrument() != null ){
                System.out.println("T'as l'instrument  : " + instru.getNom());
                System.out.print("Veux-tu l'utiliser pour combatre le Catcheur : " + catcheur.getNom()+
                    " ?\n(\"oui\" : pour ouais) : ");
                str = sc.nextLine();
                if (str.equals("oui")) {
                    this.hero.setInstrument(null);
                    catcheur.subirFrappe(catcheur.getVie()/2);
                    System.out.println("Grâçe à ton "+instru.getNom()+" le catcheur "+catcheur.getNom()+
                        "a perdu la moitier\nde ses points de vie");
                    System.out.println("Points de vie du catcheur après l'utilisation de l'instrument : "+
                        catcheur.getVie() ) ;
                }
            }            
            else System.out.println("Tu n'as pas d'instrument pour contrer le catcheur"); 

            while (!catcheur.etreMort() && !this.hero.etreMort()){
                System.out.println("Appuies  sur \"ENTER\" pour attaquer le catcheur"); 
                sc.nextLine();
                System.out.println("Prend ça "+ catcheur.getNom()+"\n"+catcheur.getNom()+" : YOHOO !");
                this.hero.attaquer(catcheur);
                System.out.println(" -Ptvie "+ catcheur.getNom()+" après l'attaque : "+
                    catcheur.getVie() ) ;
                if (catcheur.getVie()<1) {
                    System.out.println("Bravo! Le catcheur est batu");
                    System.out.println("Appuies  sur \"ENTER\" pour continuer...");                     
                    sc.nextLine();
                    break ;
                }
                System.out.println("Appuies  sur \"ENTER\" pour cotinuer le combat"); 
                sc.nextLine();
                catcheur.attaquer(this.hero);
                System.out.println("Tu viens de te faire attaquer par le catcheur");
                System.out.println("Il te reste : "+
                    this.hero.getVie()+" points de vie" ) ;
            }

            if (catcheur.etreMort()) {
                System.out.println("Ouf ! quel combat ! c'était chaud ! "); 
                if (!catcheur.getNom().equals("Satan")) this.reliqueTalk ();
                this.hero.setScore(1000);
                this.curentRoom.adversaire = null ;
            }   
            if (this.hero.etreMort()){ 
                System.out.println(catcheur.getNom()+ 
                    " : je t'ai bien dit que t'allais te faire démolir petit catcheur"); 
            }
        }
        else System.out.println("Pas grave ! je t'affronterais quand tu veux" );
        System.out.println();
    }            
}