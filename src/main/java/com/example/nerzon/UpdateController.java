package com.example.nerzon;


import com.example.nerzon.handlers.CommandHandler;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class UpdateController extends TeleBot{

    @Override
    public void onUpdateReceived(Update update){
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                if(message.getText().charAt(0) == '/'){
                    try {
                        CommandHandler commandHandler = new CommandHandler();
                        commandHandler.checkOutMessage(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    try {
                        execute(SendMessage.builder()
                                .chatId(message.getChatId())
                                .text("Заглушка")
                                .build());
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
