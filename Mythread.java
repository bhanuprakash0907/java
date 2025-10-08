class Mythread extends Thread{
	public void run(){
	   for(int i=1;i<=5;i++){
	  	 System.out.println(Thread.currentThread().getName()+"--count:"+i);
	   try{
	   	Thread.sleep(500);
	   } 		catch(InterruptedException e){
	   			System.out.println(e);
	   }
	}
}
public static void main(String[] args){
	Mythread t1=new Mythread();
	Mythread t2=new Mythread();
	t1.setName("Thread-1");
	t2.setName("thread-2");
	t1.start();
	t2.start();
	}
	}
