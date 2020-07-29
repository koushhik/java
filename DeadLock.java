public class DeadLock {
	String str1 = "Students";
	String str2 = "Tutorial";
	Thread th1 = new Thread("My Thread 1"){
	public void run(){
		while(true){
			synchronized(str1){
				synchronized(str2){
					System.out.println(str1 + str2);
				}
			}
		}
	}
	};
	Thread th2 = new Thread("My Thread 2"){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized(str1){
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};
public static void main(String a[]){
	DeadLock dl = new DeadLock();
	dl.th1.start();
	dl.th2.start();
}
}
