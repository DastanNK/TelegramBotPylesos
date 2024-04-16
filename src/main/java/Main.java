import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    public static void main(String[] args) {
        // TODO Instantiate Telegram Bots API
        try{
            String botToken ="6424135653:AAHkQwga3mxMcNMXVt1zWabye5Kyf0_reK8";
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new botExample());

        }catch(TelegramApiException e){
            e.printStackTrace();
        }

        // TODO Register our bot
    }
}
