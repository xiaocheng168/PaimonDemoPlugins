package org.example;

import cc.mcyx.paimon.common.PaimonPlugin;
import cc.mcyx.paimon.common.listener.PaimonAutoListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;

public class Main extends PaimonPlugin implements PaimonAutoListener {
    @Override
    public void onEnabled() {
        getLogger().info("好！我来了！");
    }

    @EventHandler
    public void onJoin(PlayerLoginEvent event) {
        event.setKickMessage("进不去!");
        event.setResult(PlayerLoginEvent.Result.KICK_BANNED);
    }
}