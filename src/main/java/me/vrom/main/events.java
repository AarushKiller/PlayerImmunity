package me.vrom.main;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class events implements Listener {
    public void onDamageTake (EntityDamageEvent event) {
        Player player = (Player) event.getEntity();
        if(!player.hasPlayedBefore()) {
            
        }
    }
}

