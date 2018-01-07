package com.king.myThread.first;

public class WelcomeApp {

	public static void main(String[] args) {
		//创建线程
        /*Thread welcomeThread=new WelcomeThtead();*/
        Thread welcomeThread=new Thread(new WelcomeThtead());
        //启动线程
        welcomeThread.start();
        //输出“当前线程”的线程名称
        System.out.printf("1.Welcome! I'm %s.%n",Thread.currentThread().getName());
	}

}
class WelcomeThtead extends Thread{

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		System.out.printf("2.Welcome! I'm %s.%n",Thread.currentThread().getName());
	}
	//在该方法中实现线程的任务处理逻辑
	
}
