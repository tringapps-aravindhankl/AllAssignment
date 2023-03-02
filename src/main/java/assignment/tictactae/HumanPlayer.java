package assignment.tictactae;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class HumanPlayer {
	static PrintStream L=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	String name;
	char mark;
	HumanPlayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	 
	public void makeMove()
	{
	Scanner scan=new Scanner(System.in);
	int row;
	int col;
	do
	{
		System.out.println("enter row and col:");
		row=scan.nextInt();
		col=scan.nextInt();
		
	}while(!validMove(row,col));
	
	Tictactae.placeMark(row,col,mark);
	}
	boolean validMove(int row,int col)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			if(Tictactae.board[row][col]==' ')
			{
			return true;
			}
			else {
			return false;
			}
		}
		else {
		Tictactae.L.println("Invalid");
		return false;
		}
	}
}
