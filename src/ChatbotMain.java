
public class ChatbotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
			ChatDependency chat = new ChatDependency();
			

			ThreadOne t1 = new ThreadOne(chat);
			ThreadTwo t2 = new ThreadTwo(chat);
		

	}

}
