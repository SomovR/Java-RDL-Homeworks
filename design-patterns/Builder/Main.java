package Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IRecipient> recipients = new ArrayList<>();
        recipients.add(new Recipient.RecipientBuilder()
                .setUsername("Recipient1")
                .setAddress("RecipientAddress1")
                .build());
        recipients.add(new Recipient.RecipientBuilder()
                .setUsername("Recipient2")
                .setAddress("RecipientAddress2")
                .build());
        Recipient recipient = new Recipient.RecipientBuilder()
                .setUsername("Sender")
                .setAddress("Address")
                .build();
        EmailMessage message = new EmailMessage.EmailMessageBuilder()
                .withBody("body")
                .withSubject("subject")
                .setSender(recipient)
                .withRecipients(recipients)
                .build();
        System.out.println(message);
    }
}
