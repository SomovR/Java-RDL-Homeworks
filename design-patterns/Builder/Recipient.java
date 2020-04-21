package Builder;

public class Recipient extends ARecipient {

    @Override
    public void create(String username, String address) {

    }

    public static class RecipientBuilder {
       private Recipient recipient;

        public RecipientBuilder() {
            recipient = new Recipient();
        }

        public RecipientBuilder setUsername(String username) {
            recipient.username = username;
            return this;
        }

        public RecipientBuilder setAddress(String address) {
            recipient.address = address;
            return this;
        }

        public Recipient build() {
            return recipient;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
