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
					ans+=" ,"+board[rows][cols]+"\n";
				    }
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
	//huh
	solve(startx,starty, 0);
	//currentMoveNumber	
    }


		
    public boolean solve(int x,int y,int currentMoveNumber){
	if(currentMoveNumber<board.length*board[board.length].length){
	    return true;}
	if(x>board.length||x<0){
	    solve(0,y,currentMoveNumber);
	}
	if(y>board.length||y<0){
	    solve(x,0,currentMoveNumber);
	}
	
    		

    System.out.println(this);
				wait(20);
				
				return false;
    }


}
