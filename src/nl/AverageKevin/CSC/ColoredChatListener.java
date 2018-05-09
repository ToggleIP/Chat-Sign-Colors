package nl.AverageKevin.CSC;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.PluginManager;

@SuppressWarnings({ "unused", "deprecation" })
public class ColoredChatListener
  implements Listener
{
  private ColoredChat plugin;
  
  public ColoredChatListener(ColoredChat coloredChat)
  {
    this.plugin = coloredChat;
    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
  }
  
  @EventHandler(priority=EventPriority.NORMAL)
  public void onPlayerChat(PlayerChatEvent e)
  {
    Player p = e.getPlayer();
    String c = this.plugin.getConfig().getString("global.char");
    if (e.getMessage().toLowerCase().contains(this.plugin.getConfig().getString("global.char"))) {
      if (this.plugin.getConfig().getBoolean("global.use permissions"))
      {
        if (e.getMessage().contains(c + "0")) {
          if (p.hasPermission("colorchat.use.black"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "1")) {
          if (p.hasPermission("colorchat.use.darkblue"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "2")) {
          if (p.hasPermission("colorchat.use.darkgreen"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "3")) {
          if (p.hasPermission("colorchat.use.darkturquoise"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "4")) {
          if (p.hasPermission("colorchat.use.darkred"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "5")) {
          if (p.hasPermission("colorchat.use.purple"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "6")) {
          if (p.hasPermission("colorchat.use.gold"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "7")) {
          if (p.hasPermission("colorchat.use.gray"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "8")) {
          if (p.hasPermission("colorchat.use.darkgray"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "9")) {
          if (p.hasPermission("colorchat.use.blue"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "a")) {
          if (p.hasPermission("colorchat.use.green"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "b")) {
          if (p.hasPermission("colorchat.use.turquoise"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "c")) {
          if (p.hasPermission("colorchat.use.red"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "d")) {
          if (p.hasPermission("colorchat.use.pink"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "e")) {
          if (p.hasPermission("colorchat.use.yellow"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
        if (e.getMessage().contains(c + "f")) {
          if (p.hasPermission("colorchat.use.white"))
          {
            e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
          }
          else
          {
            permissionMessage(p);
            e.setCancelled(true);
          }
        }
      }
      else
      {
        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
      }
    }
  }
  
  private void permissionMessage(Player p)
  {
    String m = this.plugin.getConfig().getString("messages.permission message");
    p.sendMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), m));
  }
}