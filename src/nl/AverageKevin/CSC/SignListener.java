package nl.AverageKevin.CSC;

import java.io.PrintStream;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.PluginManager;

@SuppressWarnings("unused")
public class SignListener
  implements Listener
{
  private ColoredChat plugin2;
  
  public SignListener(ColoredChat coloredChat)
  {
    this.plugin2 = coloredChat;
    this.plugin2.getServer().getPluginManager().registerEvents(this, this.plugin2);
  }
  
  public boolean onCommand(CommandSender sender, Command command, String commandlabel, String[] args)
  {
    if (command.getName().equalsIgnoreCase("colors"))
    {
      if ((sender.hasPermission("signs.command")) || (sender.isOp()))
      {
        sender.sendMessage("§aColors: §0&0§1&1§2&2§3&3§4&4§5&5§6&6§7&7§8&8§9&9 §a&a§b&b§c&c§d&d§e&e§f&f");
        return true;
      }
      sender.sendMessage(ChatColor.RED + "You do not have permission to perform this command.");
      
      return false;
    }
    return true;
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onSignChange(SignChangeEvent event)
  {
    String CHAR = this.plugin2.getConfig().getString("Sign.char");
    if (CHAR.length() != 1)
    {
      System.out.println("The character specified in the config.yml can only be at the length of one.");
      return;
    }
    char[] ch = CHAR.toCharArray();
    if (event.getPlayer().hasPermission("signs.format")) {
      for (int i = 0; i <= 3; i++)
      {
        String line = event.getLine(i);
        line = ChatColor.translateAlternateColorCodes(ch[0], line);
        event.setLine(i, line);
      }
    }
  }
}
