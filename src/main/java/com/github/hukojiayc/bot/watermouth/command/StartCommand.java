package com.github.hukojiayc.bot.watermouth.command;

import com.github.hukojiayc.telegram.bot.handler.BaseCommand;
import com.github.hukojiayc.telegram.bot.tools.utils.TelegramUtils;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

@Slf4j
@AutoService(BaseCommand.class)
public class StartCommand extends BaseCommand {

  public StartCommand() {
    super("start", "Start command");
  }

  @Override
  public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
    TelegramUtils.sendMessage(
        absSender,
        SendMessage.builder()
            .chatId(chat.getId().toString())
            .text("hello")
            .build()
    );
  }
}
