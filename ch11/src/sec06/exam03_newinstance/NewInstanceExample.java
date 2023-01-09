package sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		

	}

}
