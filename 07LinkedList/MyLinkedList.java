public class MyLinkedList{
    int size;
    int head;
    int tail;   

    public String name(){
	return "chowdhury.labiba";
    }

 public String toString(){
	String fs="";	
	while(index>=0){fs+=""+value;index--;}
	return fs;


    }
    LNode<T> workIt= 3;
    public int get(T index){
   	int h=0;
	while(h!=index){
	    h++;
	    workIt=workIt.getNext();}
	return workIt;
    }
    public void set(T index, T value){
	int h=0;
	while(h!=index){
	    workIt=workIt.getNext;
	    h++;}
	workIt.setValue(value);}
    private boolean add(T value){
	addEnd(value);
	return true;
}
    private boolean add(T index, T value){
	if( index>size||index<0){
	    throw new ArrayIndexOutOfBoundsException();
	    return true;
}
	if(index==size){
	    addEnd(value);
	    return true;
	}
	else{
	    
	    while(head!=index){
		head=	head.getNext();}
		head.setNext(value);
		return true;
}

    }
    public void addEnd(int data){
	LNode<T> tail;
	tail.setNext(data);
    }
    public void remove(int index){
	LNode<T> nLN;
	int h;
	while(h!= index){
	    nLN.add(getValue(h));
	    h++;
	    if(h==ndex){h++;}}
	//getvalue
    }	
    public int size(){
	return sz=0;
	
	
   }
