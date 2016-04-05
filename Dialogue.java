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

    /**
     * Constructor for objects of class Dialogue
     */
    public Dialogue(Room rm)
    {
        this.curentRoom = rm ; 

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void dialogueMaker()
    {

        switch (this.curentRoom.getDescription()) {
            case ("in the circus") :
            this.circusTalk() ;
            break ;

            case "in the Shaoline dojo":
            this.dojoTalk() ;
            break ;

            case "in the zoo" :
            this.zooTalk() ;
            break ;

            case "in the Laboratory of FrankLeBrage":
            this.labTalk() ;
            break ;

            case "in the ferryBoat" :
            this.ferryTalk() ;
            break ;

            case "in the bar" :
            this.barTalk() ;
            break ;

            case "in the biker's club" :
            this.bikeTalk() ;
            break ;

            case "in the wild forest" :
            this.forestTalk() ;
            break ;

            case "in a casino club" :
            this.casinoTalk() ;
            break ;

            case "in the airplane" :
            this.planeTalk() ;
            break ;       

            case "in Satan fighting arena" :
            this.satanTalk() ;
            break ;

        }

    }

    /**
     *  method 
     */
    public void labTalk () 
    {
        System.out.println(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu au laboratoire du savon fou FranckLeBarge !"+"\n"+
            "si tu veux que je te dise où se trouve la catcheur mafieux Satan"+"\n"+
            "faut répondre à une question scientifique... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("voici ma question : "); 
            System.out.print("Combien Font 20 * 5 ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("100")){
                System.out.println("Bien jouer ! le catcheur ma fieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie) ;
            }
            else {
                System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                    "à la prochaine fois...") ;  
            }   
        } 
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println();        
    }

    /**
     *  method 
     */
    public void casinoTalk () 
    {
        System.out.println(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu dans le club où tout est permis ! même ton ami le catcheur mafieux est déjà passé"+"\n"+
            "par là, si tu veux que je te dise où est-ce qu'il est maintenant"+"\n"+
            "faut que tu me prouves que t'es un parieur qui connait ses chiffres... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question pour savoir où se trouve Satan ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print("Quelle est la probabilité en pourcentage d'avoir une main Quinte en Poker 32 carte ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("2")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("ahaha tous les catcheurs non rien dans la cervelle ! je le savais !"+"\n"+
                    "à la prochaine fois...") ;  
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */

    public void dojoTalk () 
    {
        System.out.println(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu dans le dojo d'arts martiaux shaoline ! si tu veux retrouver le catcheur mafieux Satan"+"\n"+
            "je dois être sûr que t'es prêt pour l'affronter ! si non je te dirais rien. "+"\n"+
            "Faut que tu me prouves que tu connais bien les arts martiaux shaoline... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question pour savoir où se trouve Satan ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print("Quel est la partie la plus faible du corps humain ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("tete")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("tu ferais mieu d'aller t'entrainer encore avant d'affronter Satan !"+"\n"+
                    "à la prochaine fois...") ; 
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */
    public void barTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu dans le bar où tous les boissons sont super alcoolisées !"+"\n"+
            "le catcheur mafieux Satan venait souvent boire ici, j'ai déjà parlé"+"\n"+
            " avec lui et je sais où il est maintenant ! si tu veux savoir par "+"\n"+
            "où aller pour le trouver, tu dois me prouver que t'es un buveur Pro... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print("Quel est le degrés d'alcool de la Tequila San José ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("35")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("désolé ! je peux rien te dire ! Satan était plus connaisseur que toi !"+"\n"+
                    "à la prochaine fois...") ;
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */
    public void forestTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu dans le Forêt sauvage, où seuls les braves ont leur place !"+"\n"+
            "le catcheur mafieux Satan a déja exploré cette forêt, si tu veux le retrouver"+"\n"+
            "il faut me prouver que t'as le courage et le coeur d'un lion"+"\n"+
            "en répondant à ma question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print(" Quel est le carré du tiers de 12 ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("16")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("désolé ! ta bravure n'est pas suffisante pour affronter Satan ! je ne peux rien te dire."+"\n"+
                    "à la prochaine fois...") ;
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */

    public void ferryTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu au bord du Bateau qui mène vers toutes les destinations !"+"\n"+
            "le catcheur mafieux Satan voyage souvant sur ce bateau pour rentrer chez lui"+"\n"+
            "si tu veux savoir où est-ce qu'il est; faut me prouver que t'es un bon marin"+"\n"+
            "en répondant à ma question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) 
        {
            System.out.println ("dit moi : "); 
            System.out.print("Combien font 10 noeud en Km/h ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("30")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);

            } 
            else 
                System.out.println("non c'est faux, je ne peux rien dire à un amateur comme toi, tu dois te débrouiller tout seul."+"\n"+
                    "à la prochaine fois...") ; 
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */

    public void circusTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu dans le cirque des acrobaties dangeureuse !"+"\n"+
            "le catcheur mafieux Satan venait souvent regarder nos spectacles"+"\n"+
            "si tu veux savoir où est-ce qu'il est, faut me prouver que tu connais "+"\n"+
            "tes limites, en répondant à ma question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) 
        {
            System.out.println ("dit moi : "); 
            System.out.print("Pendant combien de jours un être humain peu vivre sans manger ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("30")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }
            else 
                System.out.println("non c'est faux, tant que tu ne connâiteras pas tes limites, tu ne pouras jamais vaincre Satan.."+"\n"+
                    "à la prochaine fois...") ; 
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println();  
    }

    /**
     *  method 
     */

    public void zooTalk ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu dans le zoo des animaux sauvages !"+"\n"+
            "le catcheur mafieux Satan est déja passé par ici ! si tu veux savoir "+"\n"+
            "où est-ce qu'il est maintenant, je dois être sûr que tu sais dompter "+"\n"+
            "n'importe quel animal, en répondant à ma question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) 
        {
            System.out.println ("dit moi : "); 
            System.out.print("quel est l'animal le plus rapide au monde ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("guépard")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }
            else 
                System.out.println("non c'est faux, tant que tu ne sauras pas apprivoiser un animal sauvage, tu ne pouras pas affronter Satan."+"\n"+
                    "à la prochaine fois...") ;  
        }  
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
    }

    /**
     *  method 
     */

    public void bikeTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu dans le club des motards fous !"+"\n"+
            "le catcheur mafieux Satan faisait parti de notre club, si tu veux savoir"+"\n"+
            "où est-ce qu'il est maintenant,je dois être sûr que tu sais conduire"+"\n"+
            "une moto, dans le bon sens du terme... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print(" quel est le constructeur de moto le plus connu au monde pour les grosses cylindres ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("harley davidson")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("désolé, je ne peut rien te dire ! t'es pas assez calé sur les motos."+"\n"+
                    "Satan est plus connaisseur que toi. à la prochaine fois...") ;  
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println();  
    }

    /**
     *  method 
     */

    public void planeTalk () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(); 
        System.out.println("Bienvenu au bord de l'avion qui vole vers toutes les destinations !"+"\n"+
            "le catcheur mafieux Satan voyage souvant sur cet avion si tu veux"+"\n"+
            "savoir où est-ce qu'il est maintenant; faut me prouver que t'as pas peur"+"\n"+
            "des altitudes. en répondant à ma question... ");
        System.out.print("appuyer sur \"ENTER\" pour cotinuer..."); 
        sc.nextLine();
        System.out.print("Veux-tu répondre à ma question ? (\"yes\" : pour ouais et \"no\" : pour non) ");
        String str = sc.nextLine();
        if (str.equals("yes")) {
            System.out.println ("dit moi : "); 
            System.out.print("quelle est l'altitude minimal en KM  à partir de la quelle l'avion peut voler ? : ");
            String str1 = sc.nextLine();
            if (str1.equals("8000")){
                System.out.println("Bien jouer ! le catcheur mafieux Satan se trouve dans la direction : "+
                    curentRoom.directSortie);
            }

            else 
                System.out.println("non c'est faux, je ne peux rien dire à un amateur comme toi, tu dois te débrouiller tout seul."+"\n"+
                    "à la prochaine fois...") ;  
        }
        else {
            System.out.println("ahaha je comprends que t'as peur mon petit catcheur mexicain !"+"\n"+
                "à la prochaine fois...") ;  
        }           
        System.out.println(); 
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
            if (str2.equals("kamikaze")){
                System.out.println("Tu as gagné ! je me remet à toi ! tu peux faire ce que tu veux de moi");
            }
        } 
        System.out.println("**************************************************");

    }
}

