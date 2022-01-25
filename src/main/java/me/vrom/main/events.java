package me.vrom.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Objects;


public class events implements Listener {
    @EventHandler
    public void onDamageTake (EntityDamageEvent event) {
        Player player = (Player) event.getEntity();
        if(!player.hasPlayedBefore()) {
        }
    }
}

