public class Recursion{
    public String name(){
	return "Chowdhury,Labiba";
    }
    public int fact(int n){

	if(n<0){
	    throw new IllegalArgumentException("Enter a number greater than 0 in order to find the factorial value");}


	return wurk(1,n);
    }
    public int wurk(int m, int a){ 
	
	if (a==1||a==0){return m;} 
	
m=m*a;
	a--;
	return wurk(m,a);
	
    }
    public int fib(int n){
	if(n<0){
	    throw new IllegalArgumentException("Enter a number greater than or equal to 0 in order to find the value at the entered position of the fibonacci sequence");}

	if(n==0){return 0;}
	if(n==1){return 1;}
	return fibHELPWORKPLS(1,n,0,1);
	//a function that keeps track of position, where you want to be, and sum


    }

    public int fibHELPWORKPLS(int p, int n, int a, int b){
	if(n==p){
	    return b;}
	else{
	    p++;
	    int s=a+b;
	    a=b;
	    b=s;
	    return fibHELPWORKPLS(p,n,a,b);}

    }

    public double sqrt(double n){
	if(n<0.0){System.out.println("enter a positive number to find the square root of that number.");
				     //return;
	}
		return halpSQRT(1,n);    
    }
       
	public double halpSQRT(double guess,double n){
	    if(guess*guess==n){return guess;}
	   double nguess=((n/guess)+guess)/2;
	    return halpSQRT(nguess, n);
	}
}

    
