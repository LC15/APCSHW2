public class NQueens{
    int[][]board;
    int currentMoveNumber=0;
    public NQueens(int size){
	if(size<4){System.out.println("Size must be an integer greater than or equal to 4");}
	else{
	    board=new int[size][size];}
    }
    
 public String toString(){
     String ans="";
				
				
				for(int rows=0; rows<board.length; rows++){
				    for(int cols=0; cols<board.length; cols++){
					ans+=", ";					
					ans+=board[rows][cols];

				    }
				    ans+="\n";
				}
				return ans;
}
    public String name(){
	return("chowdhury.labiba");
    }
    public boolean solve(){
return	solve(0);
    }
    public boolean solve(int x){
	if(currentMoveNumber>board.length*board.length){
	    return true;}
	currentMoveNumber++;	
	solve(x);
	return false;}
}
