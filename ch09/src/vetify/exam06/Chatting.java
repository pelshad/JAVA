package vetify.exam06;

public class Chatting {
	void startChar(String chatId) {
		//������ ������ �߻�. �� ������?
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
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
