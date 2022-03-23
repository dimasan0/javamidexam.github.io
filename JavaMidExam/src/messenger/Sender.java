package messenger;

/**
 *
 * @author User
 */
public class Sender {
    public static void main(String[] args) {
        var STDM = new StdMessenger();
        System.out.println("StdMessenger\n");
        STDM.sendMessage("", "Test", "Halo!");
        STDM.sendMessage("Budi", "Test", "Do you accept my offer?");
        
        var Mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        Mail.connect();
        Mail.sendMessage("", "Secret", "Don't tell anyone!");
        Mail.sendMessage("Budi", "Project", "Morning!");
        Mail.disconnect();
        Mail.sendMessage("Budi", "exmaple", "Hi!");
    }
}
