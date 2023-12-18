//定义一个线程类ThreadB，计算1+2+...，每累加一个数，休眠200毫秒，当累加到N和>3000时，输出最大的N值并结束线程。
//在测试方法中，创建此线程对象，并启动线程。
public class ThreadTest{
	
	public static void main(String[] args){
		
		//第一种：继承Thread
		Thread t = new ThreadB();
		t.start();
		
		//第二种：实现Runnable接口
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		
	}

}
class ThreadB extends Thread{

	public void run(){
		int i = 1,sum = 0;
		while(sum <= 5){
			sum += i;
			i++;
			Thread.sleep(200);
		}
		System.out.println(i-1);
	}
}

class MyRunnable implements Runnable{
	public void run(){
		int i = 1,sum = 0;
		while(sum <= 5){
			sum += i;
			i++;
			Thread.sleep(200);
		}
		System.out.println(i-1);
	}
	
}