import java.util.*;
public class maze{
    private static final String clear =  "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");}
    
 int stx, sty;
 int x,y;

    /** Same constructor as before...*/
    public maze(String filename){
       
       
	Scanner in=new Scanner(filename);
	while(in.hasNext()){
	    String nextL=in.nextLine();
	    if(	y==0){
		x=nextL.length();
	      
	    }

	    y++;
	    if(in=="S"){
		sty=y;
		//stx

	}
	
	}
    

   char  [][] maze=new char[x][y];
    String answer;
    //find starting point in the file. then solve
    }
    public String toString(boolean animate){
	if(animate==true){
	    for(int iy=0; iy<y;iy++){
		for(int ix=0; ix<x;ix++){
		    answer+=""+maze[x][y];
	
		    	}}


//do not do the funky character codes

	    }
    }
    public boolean solveBFS(boolean animate){
	T[] tracker;
	int track=0;	
	int xx,yy;
	for(int iy=0; iy<y;iy++){
	    for(int ix=0;ix<x;ix++){
		if(maze[x][y]=="S"){
		    stx=ix;
		    sty=iy;
		}
		if(maze[x][y]=="E"){
		   int  Ex=x;
		   int Ey=y;}

		if(animate==true){}
			    	
	
		if(maze[xx+1,yy]==" "){
		maze[xx,yy]=".";
		tracker[track]="[xx,yy], ";
		
		}

		if(maze[xx+1,yy+1]==" "){
		maze[xx,yy]=".";}

		if(maze[xx,yy]==" "){
		maze[xx,yy]=".";}

		
		//use tracker to move forard

			}
	    }
    }




		    //    public boolean solveDFS(boolean animate){}
    //public boolean solveDFS(){}
    //public boolean solveDFS(){}


}
















