package Anu;


interface Message {
    void send();
}
class EmailMessage implements Message {
    public void send() {
        System.out.println("Email sent.");
    }
}
class SmsMessage implements Message {
    public void send() {
        System.out.println("SMS sent.");
    }
}
class PushMessage implements Message {
    public void send() {
        System.out.println("Push Notification sent.");
    }
}
class MessageFactory {
    public static Message getMessage(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailMessage();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsMessage();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushMessage();
        } else {
            return null;
        }
    }
}
public class FactoryExample {
    public static void main(String[] args) {
        Message m1 = MessageFactory.getMessage("sms");
        Message m2 = MessageFactory.getMessage("push");

        m1.send();
        m2.send();
    }
}

