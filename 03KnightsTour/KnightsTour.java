import java.util.*;
import java.io.*;


public class KnightsTour{
	//constants for the class
	//terminal specific character to clear screen , or hide/show cursor
	final static String clear =  "\033[2J";
	final static String hide =  "\033[?25l";
	final static String show =  "\033[?25h";

	//instance variable
    private int[][]board;


		//terminal specific character to move the cursor
    private String go(int x,int y){
				return ("\033[" + x + ";" + y + "H");
    }
 
  

    public String name(){
	return "chowdhury.labiba";
    }



  public void wait(int millis){
				try {
						Thread.sleep(millis);
				}
				catch (InterruptedException e) {
				}
    }

    public String toString(){
				String ans = "\n";
				//build your knights tour here...
				
				for(int rows=0; rows<board.length; rows++){
				    for(int cols=0; cols<board.length; cols++){
					ans+=" ";					
					ans+=board[rows][cols];

				    }
				    ans+="\n";
				}

				return hide + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board=new int[size][size];			
    }

    
    public void solve(){
	solve(0,0);			
    }

    public void solve(int startx, int starty){
	solve(startx,starty,0); }


		
    public boolean solve(int x,int y,int currentMoveNumber){


	if (currentMoveNumber>board.length*board.length){
	    return true;}

       
	if(board[x+2][y+1]==0){
		board[x+2][y+1]=currentMoveNumber;
		solve(x+2,y+1,currentMoveNumber+1);
	    }
	if(board[x-2][y+1]==0){
		board[x-2][y+1]=currentMoveNumber;
		solve(x-2,y+1,currentMoveNumber+1);
	    }
	if(board[x+2][y-1]==0){
	    board[x+2][y-1]=currentMoveNumber;
	    solve(x+2,y-1,currentMoveNumber+1);}
	if(board[x-2][y-1]==0){
	    board[x-2][y-1]=currentMoveNumber;
	    solve(x-2,y-1,currentMoveNumber+1);}
	if(board[x+1][y+2]==0){
	    board[x+1][y+2]=currentMoveNumber;
	    solve(x+1,y+2,currentMoveNumber+1);}
	if(board[x-1][y+2]==0){
	    board[x-1][y+2]=currentMoveNumber;
	    solve(x-1,y+2,currentMoveNumber+1);}
	if(board[x+1][y-2]==0){
	    board[x+1][y-2]=currentMoveNumber;
	    solve(x+1,y-2,currentMoveNumber+1);}
	if(board[x-1][y-2]==0){
	    board[x-1][y-2]=currentMoveNumber;
	    solve(x-1,y-2,currentMoveNumber+1);}
    				
	return false;
    }
}
