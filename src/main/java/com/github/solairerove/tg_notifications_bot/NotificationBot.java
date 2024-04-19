package com.github.solairerove.tg_notifications_bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NotificationBot extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "хуй";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        System.out.printf("Update received from %s with message %s\n", user.getFirstName(), msg.getText());
    }

    @Override
    public String getBotUsername() {
        return "EquityEchoBot";
    }
}
