
public class Main{
	public static void main(String[] args){
		//System.out.println("Hello World");
		MailServer mailServer = new MailServer();
		MailClient client1 = new MailClient(mailServer, "user1");
		MailClient client2 = new MailClient(mailServer, "user2");
		MailClient client3 = new MailClient(mailServer, "user3");
		client1.sendMailItem("user2", "Trabalho", "Ola, Mandei os arquivos em anexo. Att,");
		
		client2.printNextMailItem();
	}
}