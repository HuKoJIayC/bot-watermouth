package com.github.hukojiayc.bot.watermouth.service;

import com.github.hukojiayc.telegram.bot.handler.NonCommandHandler;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.bots.AbsSender;

@Slf4j
@AutoService(NonCommandHandler.class)
public class NonCommandService implements NonCommandHandler {

  @Override
  public void processingMessage(AbsSender absSender, Message message) {

  }
}
