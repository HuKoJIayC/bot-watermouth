package com.github.hukojiayc.bot.watermouth;

import com.github.hukojiayc.telegram.bot.core.TelegramBot;

public class Application {

  public static void main(String[] args) {
    TelegramBot.init(args, Application.class);
  }
}
