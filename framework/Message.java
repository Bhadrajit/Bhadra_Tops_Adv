public interface Message
{
    String getMessage();
}
public class Message implements MessageService
{
	public void MessageServiceImpl(String message) {
        this.message = message;
    }
}
   
	
