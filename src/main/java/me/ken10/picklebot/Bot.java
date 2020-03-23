package me.ken10.picklebot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {
  private Bot() throws LoginException {
    new JDABuilder()
            .setToken("NjkxMTgyMDk1ODM3NDI5Nzcx.Xnf4gA.C8BSKAyVgM0lOXOck1ISJQkjhHc")
            .addEventListeners(new Listener())
            .setActivity(Activity.playing("with my pickle"))
            .build();
  }
  public static void main(String[] args) throws LoginException {
    new Bot();
  }

}
