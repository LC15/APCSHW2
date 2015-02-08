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
}
