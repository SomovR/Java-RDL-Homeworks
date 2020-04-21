package Builder;

import java.util.List;


public class EmailMessage extends AEmailMessage {


    @Override
    public void send() {

    }

    @Override
    public IEmailMessage receive() {
        return null;
    }

    @Override
    public IEmailMessage create(IRecipient sender, IRecipient... recipient) {
        return null;
    }

    public static class EmailMessageBuilder {
        private EmailMessage message;

        public EmailMessageBuilder() {
            message = new EmailMessage();
        }

        public EmailMessageBuilder withBody(String body) {
            message.body = body;
            return this;
        }

        public EmailMessageBuilder withSubject(String subject) {
            message.subject = subject;
            return this;
        }

        public EmailMessageBuilder withRecipients(List<IRecipient> recipients) {
            message.recipients = recipients;
            return this;
        }

        public EmailMessageBuilder setSender(IRecipient sender) {
            message.sender = sender;
            return this;
        }

        public EmailMessage build() {
            return message;
        }
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "recipients=" + recipients +
                ", sender=" + sender +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}