package com.example.nerzon.handlers;

import com.example.nerzon.UpdateController;
import lombok.Getter;
import lombok.Setter;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Getter
@Setter
public class CommandHandler extends UpdateController {

    private String[] commandsList = {
      "/start",
      "/getTasks",
      "/addTask",
      "/editTasks"
    };

    private String start(){
        return "A bot written to optimize the workflow\nFor a list of commands write /help";
    }

//    private String getTasks(){
//        return ;
//    }
//    private String addTask(){
//        return ;
//    }
//    private String editTasks(){
//        return;
//    }

    public void checkOutMessage(Message message) throws TelegramApiException {
        String text = message.getText();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        if("/start".equals(text)){
            sendMessage.setText(start());
            execute(sendMessage);
            return;
        }
        if("/getTasks".equals(text)){
            sendMessage.setText("Get tasks");
            execute(sendMessage);
            return;
        }
        if("/addTask".equals(text)){
            sendMessage.setText("Add Task");
            execute(sendMessage);
            return;
        }
        if("/editTasks".equals(text)){
            sendMessage.setText("Edit tasks");
            execute(sendMessage);
            return;
        }
        if("/help".equals(text)){
            String sendingText = "";
            for(String element: commandsList){
                sendingText += element + "\n";
            }
            sendMessage.setText(sendingText);
            execute(sendMessage);
            return;
        }
        sendMessage.setText("I don't know this command");
        execute(sendMessage);
    }
}
