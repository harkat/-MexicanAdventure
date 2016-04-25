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
     * Room courante concernee par le dialogue
     */
    private Room curentRoom;
    /**
     * Hero courant (joueur)
     */    
    private Hero hero ;
    
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
                content = this.circusTalk() ;
                break ;

            case "au monastère Shaolin":
                content = this.dojoTalk() ;
                break ;

            case "au zoo" :
                content = this.zooTalk() ;
                break ;

            case "au Laboratoire de FrankLeBarge":
                content = this.labTalk() ;
                break ;

            case "au ferryBoat" :
                content = this.ferryTalk() ;
                break ;

            case "au bar" :
                content = this.barTalk() ;
                break ;

            case "au club des motards" :
                content = this.bikeTalk() ;
                break ;

            case "à la foret sauvage" :
                content = this.forestTalk() ;
                break ;

            case "au casino" :
                content = this.casinoTalk() ;
                break ;

            case "à l'aéroport" :
                content = this.planeTalk() ;
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
                "si tu veux que je te dise où se" + 
                " trouve le catcheur mafieux Satan.\n" +
                "Il faut que tu sois capable de répondre à une question... ");
            System.out.print("Appuyer sur \"ENTER\" pour cotinuer..."); 
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
                    System.out.println("Bien joué ! " +
                        "Le catcheur mafieux SATAN " +
                        "se trouve dans la direction : \n" +
                        curentRoom.directSortie) ;
                }
                else {
                    this.hero.ajouterVie (-1.00);
                    System.out.println("Mauvaise réponse ! Je ne " +
                        "peux rien te dire sur SATAN ! \n" +
                        "À la prochaine fois...") ;  
                    System.out.println("Vous avez perdu 1 point de vie !" +
                        " Il vous reste : " + this.hero.getVie() + " ptVie");
                }   
            } 
            else {
                System.out.println("Hahaha je comprends " +
                    "que tu as peur mon petit, " + this.hero.getNom() +
                    "\n" + "à la prochaine fois...") ;  
            }           
            System.out.println();   
        }
        
        if ((this.curentRoom.objet != null) && (this.curentRoom.objet instanceof Relique)) this.reliqueTalk();
        
        if ((this.curentRoom.objet != null) && (this.curentRoom.objet instanceof Nourriture)) this.eatTalk() ;
        
        if ((this.curentRoom.objet != null) && (this.curentRoom.objet instanceof Instrument)) this.instrumentTalk() ;
        
        if ((this.curentRoom.adversaire != null) && (this.curentRoom.adversaire instanceof Monstre))this.monsterTalk () ;
        
        if ((this.curentRoom.adversaire != null) && (this.curentRoom.adversaire instanceof Catcheur))this.catcheurTalk () ;
    }

    /**
     *  methode dialogue pour le lab
     *  @return un tableau de chaines
     */
    public String [] labTalk () 
    {        
        String [] str = {"au laboratoire du savant fou FranckLeBarge", 
            "Résoudre 20 * 5 ? : ",
            " 1-10 \n 2-99 \n 3-100 \n 4-101",
            "3"} ;
        return str ;    
    }
    /**
     *  methode dialogue pour le casino
     *  @return un tableau de chaines
     */
    public String [] casinoTalk () 
    {
        String [] str = {"dans le club où tout est permis !",
            "Quelle est la probabilité en pourcentage " +
                "d'avoir une main Quinte \nau jeu de Poker 32 carte ?  : ",
            " 1-10% \n 2-2% \n 3-40% \n 4-60%",
            "2"} ;
        return str ;
    }
    /**
     *  methode dialogue pour le dojo
     *  @return un tableau de chaines
     */
    public String [] dojoTalk () 
    {       
        String [] str = {"dans le dojo d'arts martiaux shaolin !", 
            "Quel est la partie la plus faible du corps humain ? : ",
            " 1-la tête \n 2-les pieds  \n 3-les bras  \n 4-le torse",
            "1"} ;
        return str ;
    }

    /**
     *  methode dialogue pour le bar
     *  @return un tableau de chaines
     */
    public String [] barTalk () 
    {
        String [] str = {"dans le bar où toutes les boissons " +
                "sont super alcoolisées !", 
            "Quel est le degré d'alcool de la Tequila San José ? : ", 
            " 1- 80% \n 2- 35%  \n 3- 8%  \n 4- 0.2%",
            "2"} ;
        return str ;
    }

    /**
     *  methode dialogue pour le forest
     *  @return un tableau de chaines
     */
    public String [] forestTalk () 
    {
        String [] str = {"dans la Forêt sauvage, où seuls " +
                "les braves ont leur place !", 
            "Quel est le carré du tiers de 12 ? : ", 
            " 1- 17 \n 2- 15  \n 3- 4  \n 4- 16",
            "4"} ;
        return str ;
    }

    /**
     *  methode dialogue pour le ferry
     *  @return un tableau de chaines
     */
    public String [] ferryTalk () 
    {
        String [] str = {"au bord du Bateau qui mène " +
                "vers toutes les destinations !", 
            "Combien font 10 noeud en Km/h ? : ",
            " 1- 30 km\n 2- 18 km  \n 3- 50 km  \n 4- 8 km",
            "1"} ;
        return str ; 
    }

    /**
     *  methode dialogue pour le circus
     *  @return un tableau de chaines
     */
    public String [] circusTalk () 
    {
        String [] str = {"dans le chapiteau du cirque " +
                "des acrobaties dangeureuses !",
            "Pendant combien de jours un être " +
                "humain peu vivre sans manger ? : ",
            " 1- 5 jours \n 2- 9 jours  \n 3- 7 jours  \n 4- 30 jours",
            "4"} ;
        return str ; 
    }

    /**
     *  methode dialogue pour le zoo
     *  @return un tableau de chaines
     */
    public String [] zooTalk ()
    {
        String [] str = {"dans le zoo des animaux sauvages !", 
            "Quel est l'animal le plus rapide au monde ? : ",
            " 1- le dauphin \n 2- le guépard \n " +
                "3- la tortue  \n 4- la girafe",
            "2"} ;
        return str ;
    }

    /**
     *  methode dialogue pour le bike
     *  @return un tableau de chaines
     */
    public String [] bikeTalk () 
    {
        String [] str = {"dans le club des motards fous !",
            "Quel est le constructeur de moto le plus connu " +
                "au monde pour ses \ngrosses cylindrées ? : ", 
            " 1- Suzuki \n 2- Renault  \n 3- Ferrari \n 4- Harley davidson",
            "4"} ;
        return str ; 
    }

    /**
     *  methode dialogue pour le plane
     *  @return un tableau de chaines
     */
    public String [] planeTalk () 
    {
        String [] str = {"au bord de l'avion qui vole vers " +
                "toutes les destinations !",
            "Quelle est l'altitude minimale en M  à " +
                "partir de laquelle l'avion peut \nvoler ? : ",
            " 1- 1000 m \n 2- 8000 m  \n 3- 50 m \n 4- 600 m ",
            "2"} ;
        return str ;        
    }
    
     /**
     *  methode dialogue pour les rellique
     */
    public void reliqueTalk ()
    {
        System.out.print("Super!! je viens de ");
        System.out.println("trouver ça : " + this.curentRoom.objet.getNom());
        this.hero.setPrise((Relique)this.curentRoom.objet);
        this.hero.setScore(((Relique)this.curentRoom.objet).getPoints());
        this.curentRoom.objet = null;
        System.out.println();
    }
    
    /**
     *  methode dialogue pour la nouriture
     */
    public void eatTalk ()
    {
        System.out.print("Tiens un " + this.curentRoom.objet.getNom() + "! ");
        System.out.println("ça me donne de l'énérgie.");
        this.hero.ajouterVie(((Nourriture)this.curentRoom.objet).getEnergie());
        System.out.print("désormais j'ai : ");
        System.out.println(hero.getVie() + " points de vie");
        this.curentRoom.objet = null;
        System.out.println();
    }
    /**
     *  methode dialogue pour les instruments
     */
    public void instrumentTalk ()
    {
        System.out.print("Voyons c'est quoi ça? ");
        System.out.print(this.curentRoom.objet.getNom());
        System.out.println(", ça peut servir");
        this.hero.setInstrument((Instrument)this.curentRoom.objet);
        this.hero.setScore(((Instrument)this.curentRoom.objet).getPoints());
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
            "que pendant un certain moment, " +
            "tu m'as cherché un peu partout" + "\n" +
            "dans le monde ! Tu es devant moi maintenant... ");
        System.out.print("Appuyez sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.println("Qu'attends tu de moi au juste ?");
        String str1 = sc.nextLine();
        System.out.println(str1 + " !! OK, si tu veux cela, " + 
            "il faut m'affronter en combat final!");
        System.out.print("Appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();        
    }
    
    /**
     *  methode dialogue pour les monstre
     */
    public void monsterTalk () 
    {
        Monstre monstre = (Monstre)this.curentRoom.adversaire ;
        Objet instru = (Objet)this.hero.getInstrument();
        System.out.println("Pas de chance pour toi mon petit catcheur! ");
        System.out.println("tu vas te faire dévorer par  le monstre : " + monstre.getNom());
        
        if (this.hero.getInstrument() != null ){
            System.out.println("T'as l'instrument  : " + instru.getNom());
            System.out.print("Veux-tu l'utiliser pour combatre le monstre ? " +
            "(\"oui\" : pour ouais) : ");
            String str = sc.nextLine();
            if (str.equals("oui")) {
                monstre.subirFrappe(monstre.getVie()/2);
                System.out.println("Grâçe à ton "+instru.getNom()+" le monstre "+monstre.getNom()+
                " a perdu la moitier de ses points de vie,");
                System.out.println("  -Points de vie du monstre après l'utilisation de l'istrument : "+
                monstre.getVie() ) ;
            }
        }            
        else System.out.println("Tu n'as pas d'instrument pour contrer le monstre"); 
        
        while (!monstre.etreMort() && !this.hero.etreMort()){
            System.out.println("Appuyer sur \"ENTER\" pour attaquer le monstre"); 
            sc.nextLine();
            System.out.println("Prend ça "+ monstre.getNom()+"\n"+monstre.getNom()+" : OUCH !");
            monstre.subirFrappe(2.00);
            System.out.println("  -Ptvie "+ monstre.getNom()+" après l'attaque : "+
            monstre.getVie() ) ;
            if (monstre.getVie()<1) {
                System.out.println("Bravo! Le monstre est mort");
                System.out.println("Appuyer sur \"ENTER\" pour cotinuer..."); 
                sc.nextLine();
                break ;
            }
            System.out.println("Appuyer sur \"ENTER\" pour cotinuer le combat"); 
            sc.nextLine();
            this.hero.subirFrappe(1.00);
            System.out.println("Tu viens de te faire attaquer par le monstre");
            System.out.println("Il te reste : "+
            this.hero.getVie()+" points de vie" ) ;
        }
        
        if (monstre.etreMort()) {
          System.out.println("Ouf ! c'était chaud ! "); 
          this.curentRoom.adversaire = null ;
        }   
        if (this.hero.etreMort()){ 
            System.out.println(monstre.getNom()+ 
                   " : je t'ai bien dit que t'allais te faire dévorer petit catcheur"); 
        }
        System.out.println();        
    }
    
    /**
     *  methode dialogue pour les monstre
     */
    public void catcheurTalk () 
    {
        Catcheur catcheur = (Catcheur)this.curentRoom.adversaire ;
        Objet instru = (Objet)this.hero.getInstrument();
        System.out.println("tu t'es fait défié par le catcheur : " + catcheur.getNom());
        System.out.println("Faut le combattre");         
        if (this.hero.getInstrument() != null ){
            System.out.println("T'as l'instrument  : " + instru.getNom());
            System.out.println("Veux-tu l'utiliser pour combatre le Catcheur ? " +
            "(\"oui\" : pour ouais) : ");
            String str = sc.nextLine();
            if (str.equals("oui")) {
                catcheur.subirFrappe(catcheur.getVie()/2);
                System.out.println("Grâçe à ton "+instru.getNom()+" le catcheur "+catcheur.getNom()+
                "a perdu la moitier de ses points de vie,");
                System.out.println("Points de vie du catcheur après l'utilisation de l'istrument : "+
                catcheur.getVie() ) ;
            }
        }            
        else System.out.println("Tu n'as pas d'instrument pour contrer le catcheur"); 
        
        while (!catcheur.etreMort() && !this.hero.etreMort()){
            System.out.println("Appuyer sur \"ENTER\" pour attaquer le catcheur"); 
            sc.nextLine();
            System.out.println("Prend ça "+ catcheur.getNom()+"\n"+catcheur.getNom()+" : YOHOO !");
            catcheur.subirFrappe(2.00);
            System.out.println("---Ptvie "+ catcheur.getNom()+" après l'attaque : "+
            catcheur.getVie() ) ;
            if (catcheur.getVie()<1) {
                System.out.println("Bravo! Le catcheur est batu");
                System.out.println("Appuyer sur \"ENTER\" pour cotinuer..."); 
                sc.nextLine();
                break ;
            }
            System.out.println("Appuyer sur \"ENTER\" pour cotinuer le combat"); 
            sc.nextLine();
            this.hero.subirFrappe(1.00);
            System.out.println("Tu viens de te faire attaquer par le catcheur");
            System.out.println("Il te reste : "+
            this.hero.getVie()+" points de vie" ) ;
        }
        
        if (catcheur.etreMort()) {
          System.out.println("Ouf ! c'était chaud ! "); 
          this.curentRoom.adversaire = null ;
        }   
        if (this.hero.etreMort()){ 
            System.out.println(catcheur.getNom()+ 
                   " : je t'ai bien dit que t'allais te faire démolir petit catcheur"); 
        }
        System.out.println();        
    }
}