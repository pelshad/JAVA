package vetify.exam06;

public class Chatting {
	void startChar(String chatId) {
		//컴파일 에러가 발생. 그 이유는?
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String messag = "[" + nickName + "]" + inputData;
					sendMessage(messag);
				}
			}
		};
		chat.start();
	}
	
	class Chat{
		void start() {};
		void sendMessage(String message) {}
	}
}
