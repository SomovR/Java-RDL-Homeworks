package Builder;

import java.util.List;

public abstract class AEmailMessage implements IEmailMessage {
    List<IRecipient> recipients; // получатели
    IRecipient sender; // отправитель
    String body; // текст письма
    String subject; // тема письма
}
