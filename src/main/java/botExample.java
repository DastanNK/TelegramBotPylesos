import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class botExample extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "pylesos123_bot";
    }

    public String getBotToken(){
        return "6424135653:AAHkQwga3mxMcNMXVt1zWabye5Kyf0_reK8";
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }

    @Override
    public void onUpdateReceived(Update update) {
        String command = update.getMessage().getText();
        if(command.equals("/rent")){
            String message = "You can come to block 818 at 22.";
            SendMessage responce=new SendMessage();
            responce.setChatId(update.getMessage().getChatId().toString());
            responce.setText(message);
            try{
                execute(responce);
            }catch(TelegramApiException e){
                e.printStackTrace();
            }
        }
        if(command.equals("/price")){
            String messagePrice = "The price is 500tg for 2 hors";
            SendMessage responcePrice=new SendMessage();
            responcePrice.setChatId(update.getMessage().getChatId().toString());
            responcePrice.setText(messagePrice);
            try{
                execute(responcePrice);
            }catch(TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }
}
