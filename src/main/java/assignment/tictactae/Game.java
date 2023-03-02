package assignment.tictactae;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Game {
	private static Scanner scan;
	private static Scanner scan1;

	public static void game()
    {
    Tictactae tic=new Tictactae();
    PrintStream L=new PrintStream((new FileOutputStream(FileDescriptor.out)));
    scan = new Scanner(System.in);
    scan1 = new Scanner(System.in);
    char mark,mark1;
    int t=0;
    int count=0;
    tic.PrintBoard();
    
    
    L.println("Enter Player1");
    String name=scan.nextLine();
    L.println("Choose X  OR O");
    mark=scan.next().charAt(0);
    HumanPlayer player1=new HumanPlayer(name,mark);
    
    L.println("Enter Player2");
    String name1=scan1.nextLine();
    
    if(mark=='X') {
    mark1='O';
    }else {
    	mark1='X';
    }
    HumanPlayer player2=new HumanPlayer(name1,mark1);
    
    HumanPlayer cp;
    cp = player1;
    
    while(count<9){
    Tictactae.L.println(cp.name + "Turn");
    
    cp.makeMove();
    tic.PrintBoard();
    if(Tictactae.checkRow() || Tictactae.checkcol() || Tictactae.checkDiag() )
    {
    	t++;
    	Tictactae.L.println(cp.name +"Win");
    	break;
    }
    else
    {
    	count++;
    	if(cp==player1)
    	{
    		cp=player2;
    	}
    	else
    	{
    		cp=player1;
    	}
    }
    }
    
    if(t==0) {
    	Tictactae.L.println("Match is Die");
    }
    }
}
