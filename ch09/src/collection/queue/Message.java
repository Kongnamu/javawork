package collection.queue;

public class Message {

	String command; // 수량
	String to;      // 대상
	
	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

