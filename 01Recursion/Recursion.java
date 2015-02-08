public class Recursion{
    public String name(){
	return "Chowdhury,Labiba";
    }
    public int fact(int n){
	if(n<0){}
	return wurk(1,n);
    }
    public int wurk(int m, int a){ 
	m=m*a;
	if (a==1){return m;} 
	a--;
	return wurk(m,a);

    }
    public int fib(int n){
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
}
