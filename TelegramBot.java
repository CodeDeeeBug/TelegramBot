package com.TgBot.TelegramBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {
	
	@Override
	public void onUpdateReceived (Update update) {
		//System.out.println(update.getMessage().getText());
		//System.out.println(update.getMessage().getFrom().getFirstName());
		
		String command = update.getMessage().getText();
		
		if(command.equals("/ask")) {
			String message = "What's your question?";
			SendMessage response = new SendMessage();
			response.setChatId(update.getMessage().getChatId().toString());
			response.setText(message);
			
			try {
				execute(response);
			} catch(TelegramApiException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String getBotUsername() {
		
		//TODO
		
		return "BlueVibes_bot";

	}
	
	@Override
	public String getBotToken() {

		//TODO
		
		return "7404980941:AAG5FfQh89AIRWKV_x65_sxAlBwf6t10yCo";
		
	}

}
