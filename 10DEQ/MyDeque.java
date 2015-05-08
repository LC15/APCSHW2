public class MyDeque<T>{
    T[] d;
    int head;
    int tail;
    int size;
    public MyDeque(){
    }

    public void addFirst(T value){
	resize();
	d[head]=value;
	head--;
	//	if(head<0){}
	size++;
    }
    public void addLast(T value){
	resize();
	d[tail]=value;
	tail++;
	size++;
	//if(tail>size){}
    }
     public T removeFirst(){
	 T r=d[head];
	 d[head]=null;
	 head++;
	 size--;
	 return r;
     }


  public T removeLast(){
      T r= d[tail];
      d[tail]=null;
      tail--;
      size--;
      return r;
  }
    public T getFirst(){
	return d[head];}
     public T getLast(){
	 return d[tail];}
    public void resize(){
	
	T[] newd=(T[]) new Object[size*2];
	for(int i=0;i<size;i++){
	    newd[i]=d[i]; //check?	
	}
	d=newd;
	head=0;
	tail=size-1;
    }


}


    
