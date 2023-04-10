//GUESSER GAME try
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class guesser
{
    int guesnum;
    public int guessnum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser guess the number");
        guesnum= scan.nextInt();
        return guesnum;
    }
}
class player
{
    int player1num;
    int player2num;
    int player3num;
    int player1gues()
    {
        System.out.println("First player guess the number");
        Scanner scan = new Scanner(System.in);
        player1num=scan.nextInt();
        return player1num;
    }       
    int player2gues()
    {
        System.out.println("Second player guess the number");
        Scanner scan = new Scanner(System.in);
        player2num=scan.nextInt();
        return player2num;
    }
    int player3gues()
    {
        System.out.println("Third player guess the number");
        Scanner scan = new Scanner(System.in);
        player3num=scan.nextInt();
        return player3num;
    }
}
class umpair
{
    int numFromguser;
    int numFromp1;
    int numFromp2;
    int numFromp3;
    void collectnumfromguesser()
    {
        guesser g=new guesser();
        numFromguser=g.guessnum();
        //return numFromguser;
    }
    void collectnumfromplayer()
    {
        player p=new player();
        numFromp1=p.player1gues();
        numFromp2=p.player2gues();
        numFromp3=p.player3gues();
    }
    void compair()
    {
        if(numFromguser==numFromp1)
        {
            if(numFromguser==numFromp2&&numFromguser==numFromp3)
            {
                System.out.println("Sob player winner hai");
            }
            else if(numFromguser==numFromp2)
            {
                System.out.println("First and second player winner");
            }
            else if(numFromguser==numFromp3)
            {
                System.out.println("First and third player winner");
            }
            else
            {
                System.out.println("First player won the game");
            }
        }
        else if(numFromguser==numFromp2)
        {
            if(numFromguser==numFromp3)
            {
                System.out.println("Scond and third player winner");
            }
            else
            {
                System.out.println("Second player won teh game");
            }
        }
        else if(numFromguser==numFromp3)
        {
            System.out.println("Third palayer won the game");
        }
        else
        {
            System.out.println("Sob logon har geye");
        }
    }
}
public class game
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Game start");
        umpair u=new umpair();
        u.collectnumfromguesser();
        u.collectnumfromplayer();
        u.compair();
    }
}