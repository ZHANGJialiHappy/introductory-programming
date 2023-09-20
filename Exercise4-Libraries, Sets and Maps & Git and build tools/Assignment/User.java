public class User {
    private Message[] inbox;
    private int messageCount;

    public User() {
        inbox = new Message[20];
        messageCount = 0;
    }

    private String addMessage(Message msg) {
        if (messageCount < inbox.length) {
            inbox[messageCount] = msg;
            messageCount++;
            return "Message is added!";
        } else {
            return "Sorry, the inbox is full!";
        }
    }

    public boolean sendMessage(Message msg) {
        return msg.getReceiver().addMessage(msg) == ("Message is added!");
        // if (msg.getReceiver().addMessage(msg) == "Sorry, the inbox is full!") {
        // return false;
        // }
        // return true;
    }

    public String readMessage() {
        if (messageCount == 0) {
            return "There is no message to read!";
        } else {
            String message = inbox[0].getText();
            for (int i = 0; i < inbox.length - 1; i++) {
                inbox[i] = inbox[i + 1];
            }
            inbox[19] = null;
            messageCount--;
            return message;
        }
    }
}