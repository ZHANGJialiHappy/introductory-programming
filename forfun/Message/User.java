public class User {
    private Message[] inbox;
    private int messageCount;

    public User() {
        inbox = new Message[20];
        messageCount = 0;
    }

    private String addMessage(Message msg) {
        if (messageCount >= inbox.length - 1) {
            return "Sorry, the inbox is full!";
        } else {
            inbox[messageCount] = msg;
            messageCount++;
            return "Message is added!";
        }
    }

    public boolean sendMessage(Message msg) {
        return msg.getReceiver().addMessage(msg).equals("Message is added!");
    }

    public String readMessage() {
        if (messageCount == 0) {
            return "There is no message to read!";
        } else {
            String msg = inbox[0].getText();
            for (int i = 0; i < inbox.length - 1; i++) {
                inbox[i] = inbox[i + 1];
            }
            inbox[inbox.length - 1] = null;
            messageCount--;
            return msg;
        }
    }
}
