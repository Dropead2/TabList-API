package me.dropead2.tab.listener;

import lombok.RequiredArgsConstructor;
import me.dropead2.tab.TabHandler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@RequiredArgsConstructor
public class PlayerListener implements Listener {

    private final TabHandler handler;

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        this.handler.sendUpdate(event.getPlayer());
    }
}
