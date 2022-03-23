package messenger;

/**
 *
 * @author User
 */
public class StdMessenger implements Messenger{
    boolean isSuccess;

    @Override
    public void sendMessage(String receiver, String subject, String messege) {
        System.out.println("Receiver\t: "+receiver);
        System.out.println("Subject\t\t: "+subject);
        System.out.println("Message\t\t: "+messege);
        
        if (receiver == "") {
            isSuccess = false;
            System.out.println("Status Message\t: "+isSuccess);
            System.out.println("Std not sent.\n");
        } else {
            isSuccess = true;
            System.out.println("Status Message\t: "+isSuccess);
            System.out.println("Std sent.\n");
        }
    }
    
    
}
