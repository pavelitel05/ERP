package com.example.nerzon;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor

public class TeleBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "@NerzonStudyingErpBot";
    }

    @Override
    public String getBotToken() {
        return "###";
    }

    @Override
    public void onUpdateReceived(Update update) {
    }
}
