
public class ThreadOne implements Runnable {
	ChatDependency chat;
	String [] str = {"Hi","How are you ?","I am also fine!"};
	
	
	
	public ThreadOne(ChatDependency chat) {
		super();
		this.chat = chat;
		
		new Thread(this,"Question Thread").start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < str.length; i++) {
			chat.question(str[i]);
		}
	}
}
