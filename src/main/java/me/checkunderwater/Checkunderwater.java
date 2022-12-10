package me.checkunderwater;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Checkunderwater extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[Checkunderwater] Plugin enabled");
        PlayerWaterChecker.init(this, 10);
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void check(PlayerEntersWaterEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("You entered water");
    }
    @EventHandler
    public void chec1k(PlayerLeavesWaterEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("You leaved water");
    }
    @EventHandler
    public void check2(PlayerInWaterEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("You are in water");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[Checkunderwater] Plugin disabled");
    }
}
