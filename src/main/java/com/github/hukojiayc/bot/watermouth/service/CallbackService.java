package com.github.hukojiayc.bot.watermouth.service;

import com.github.hukojiayc.telegram.bot.handler.CallbackHandler;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.bots.AbsSender;

@Slf4j
@AutoService(CallbackHandler.class)
public class CallbackService implements CallbackHandler {

  @Override
  public void processingMessage(AbsSender absSender, CallbackQuery callbackQuery) {

  }
}
