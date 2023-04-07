
public class MessageP
{
private MessageP messageService;
    
    public void Message(MessageP messageService) {
    	 this.messageService = messageService;
    }
    
    public boolean printMessage() 
    {
    	 System.out.println(messageService.printMessage());
		return false;
    }
}
