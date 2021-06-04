
import java.util.Optional;

public class OptDemo{
	
	
	public static Optional<String> getMessage(int msgid) {
		String[] messages = {"hi","hello","good"};
		if(msgid < messages.length) {
			return Optional.of(messages[msgid]);
		}else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		
		String m = getMessage(3).orElse("nothing");
		System.out.println(m.toUpperCase());

	}

}