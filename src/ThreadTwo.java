
public class ThreadTwo implements Runnable{
	ChatDependency chat;
	String [] str = {"Hi","Me Good, wau ?","Thanks!"};
	
	
	
	public ThreadTwo(ChatDependency chat) {
		super();
		this.chat = chat;
		
		new Thread(this,"Answer Thread").start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < str.length; i++) {
			chat.answer(str[i]);
		}
	}


}
