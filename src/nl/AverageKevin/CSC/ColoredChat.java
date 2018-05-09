package nl.AverageKevin.CSC;

import java.io.PrintStream;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class ColoredChat
  extends JavaPlugin
{
  public void onEnable()
  {
    System.out.println(getDescription().getName() + " v" + getDescription().getVersion() + " enabled!");
    registerEvents();
    loadConfig();
  }
  
  public void onDisable()
  {
    System.out.println(getDescription().getName() + " v" + getDescription().getVersion() + " disabled!");
  }
  
  public void registerEvents()
  {
    new ColoredChatListener(this);
    new SignListener(this);
  }
  
  public void loadConfig()
  {
    FileConfiguration cfg = getConfig();
    cfg.options().copyDefaults(true);
    cfg.options().copyHeader(true);
    saveConfig();
  }
}
