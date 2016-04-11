import java.util.Scanner;
/**
 * Write a description of class Dialogue here.
 * 
 * @author Amir 
 * @version 1.0
 */
public class Dialogue
{
    // instance variables - replace the example below with your own
    private Room curentRoom;
    private Hero hero ;
    /**
     * Constructor for objects of class Dialogue
     */
    public Dialogue(Room rm, Hero pr)
    {
        this.curentRoom = rm ; 
        this.hero = pr ;

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void dialogueMaker()
    {
        String [] content = null ;

        switch (this.curentRoom.getDescription()) {
            case ("in the circus") :
            content = this.circusTalk() ;
            break ;

            case "in the Shaoline dojo":
            content = this.dojoTalk() ;
            break ;

            case "in the zoo" :
            content = this.zooTalk() ;
            break ;

            case "in the Laboratory of FrankLeBrage":
            content = this.labTalk() ;
            break ;

            case "in the ferryBoat" :
            content = this.ferryTalk() ;
            break ;

            case "in the bar" :
            content = this.barTalk() ;
            break ;

            case "in the biker's club" :
            content = this.bikeTalk() ;
            break ;

            case "in the wild forest" :
            content = this.forestTalk() ;
            break ;

            case "in a casino club" :
            content = this.casinoTalk() ;
            break ;

            case "in the airplane" :
            content = this.planeTalk() ;
            break ;       

            case "in Satan fighting arena" :
            this.satanTalk() ;
            break ;

        }
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Salut "+this.hero.getNom()+", soit le bienvenue "
            +content[0]+"\n"+
            "si tu veux que je te dise où se"+ 
            "trouve le catcheur mafieux Satan"+"\n"+
            "faut répondre à une question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais) : ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("voici ma question : "); 
            System.out.print(content[1]);
            System.out.println ("Choix : "); 
            System.out.println(content[2]);
            System.out.print("Quelle est le numéro de la bonne réponse  ? : "); 
            String str1 = sc.nextLine();
            if (str1.equals(content[3])){
                System.out.println("Bien jouer ! le catcheur mafieux SATAN se trouve dans la direction : "+"\n"+
                    curentRoom.directSortie) ;
            }
            else {
                this.hero.ajouterVie (-1.00);
                System.out.println("Mauvaise réponse ! je ne peux rien te dire sur SATAN !"+"\n"+
                    "à la prochaine fois...") ;  
                System.out.println("Vous avez Perdu 1 point de vie ! vos points de vie sont égale à : "+this.hero.getVie()) ;
            }   
        } 
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit "+this.hero.getNom()+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println();        
    }

    /**
     *  method 
     */
    public String [] labTalk () 
    {        
        String [] str = {"au laboratoire du savant fou FranckLeBarge", 
        "Combien Font 20 * 5 ? : ",
        " 1-10 \n 2-99 \n 3-100 \n 4-101",
        "4"} ;
        return str ;    
    }

    /**
     *  method 
     */
    public String [] casinoTalk () 
    {
        String [] str = {"dans le club où tout est permis !",
        "Quelle est la probabilité en pourcentage d'avoir une main Quinte en Poker 32 carte ?  : ",
        " 1-10% \n 2-2% \n 3-40% \n 4-60%",
        "2"} ;
        return str ;
    }

    /**
     *  method 
     */

    public String [] dojoTalk () 
    {       
        String [] str = {"dans le dojo d'arts martiaux shaoline !", 
        "Quel est la partie la plus faible du corps humain ? : ",
        " 1-la tête \n 2-les pieds  \n 3-les bras  \n 4-le torse",
        "1"} ;
        return str ;
    }

    /**
     *  method 
     */
    public String [] barTalk () 
    {
        String [] str = {"dans le bar où tous les boissons sont super alcoolisées !", 
        "Quel est le degrés d'alcool de la Tequila San José ? : ", 
        " 1- 80% \n 2- 35%  \n 3- 8%  \n 4- 0.2%",
        "2"} ;
        return str ;
    }

    /**
     *  method 
     */
    public String [] forestTalk () 
    {
        String [] str = {"dans le Forêt sauvage, où seuls les braves ont leur place !", 
        " Quel est le carré du tiers de 12 ? : ", 
        " 1- 17 \n 2- 15  \n 3- 4  \n 4- 16",
        "4"} ;
        return str ;
    }

    /**
     *  method 
     */

    public String [] ferryTalk () 
    {
        String [] str = {"au bord du Bateau qui mène vers toutes les destinations !", 
        "Combien font 10 noeud en Km/h ? : ",
        " 1- 30 km\n 2- 18 km  \n 3- 50 km  \n 4- 8 km",
        "1"} ;
        return str ; 
    }

    /**
     *  method 
     */

    public String [] circusTalk () 
    {
        String [] str = {"dans le cirque des acrobaties dangeureuse !",
        " Pendant combien de jours un être humain peu vivre sans manger ? : ",
        " 1- 5 jours \n 2- 9 jours  \n 3- 7 jours  \n 4- 30 jours",
        "4"} ;
        return str ; 
    }

    /**
     *  method 
     */

    public String [] zooTalk ()
    {
        String [] str = {"dans le zoo des animaux sauvages !", 
        "quel est l'animal le plus rapide au monde ? : ",
        " 1- le dauphin \n 2- le guépard \n 3- la tortue  \n 4- la gérafe",
        "2"} ;
        return str ;
    }

    /**
     *  method 
     */

    public String [] bikeTalk () 
    {
        String [] str = {"dans le club des motards fous !",
        "quel est le constructeur de moto le plus connu au monde pour ses grosses cylindrées ? : ", 
        " 1-Suzuki \n 2-Renault  \n 3- Ferrari \n 4- Harley davidson",
        "4"} ;
        return str ; 
    }

    /**
     *  method 
     */

    public String [] planeTalk () 
    {
        String [] str = {"au bord de l'avion qui vole vers toutes les destinations !",
        "quelle est l'altitude minimal en KM  à partir de la quelle l'avion peut voler ? : ",
        " 1- 1000 km \n 2- 8000 km  \n 3- 50 km \n 4- 600 km ",
        "2"} ;
        return str ;		
    }

    /**
     *  method 
     */

    public void satanTalk () 
    {	

        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("**************************************************"+"\n"+
            "Enfin tu m'as retrouvé petit catcheur mexicain ! j'ai entendu dire que"+"\n"+
            "que pendant un certain moment, tu m'as cherché un peu partout"+"\n"+
            "dans le monde ! t'es devant moi maintenant... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.println("qu'attends tu de moi au just ?");
        String str1 = sc.nextLine();
        System.out.println(str1+" !! OK, si tu veux cela, il faut répondre à mon énigme !");

        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();

        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print("Cette personne est punis quand elle fait une tentative d'un crime, mais elle ne l'est pas si elle le commet ? : ");
            String str2 = sc.nextLine();
            if (str2.contains("kamikaze")){
                System.out.println("Tu as gagné ! je me remet à toi ! tu peux faire ce que tu veux de moi");
            }
        } 
        System.out.println("**************************************************");

    }
}