package com.Shanwer.Main;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;


/**
 * Created by AdminShanwer on 2017/7/5.
 * Last commit on 2017/8/26
 * Developers:Shanwer
 */
public class Patch extends PluginBase implements Listener{
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Patch(),this);
        this.getLogger().warning(TextFormat.GREEN + "Unofficial Nukkit Patch enabled!Author:Shanwer");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isPlayer()) ((Player) sender).usedChunks.clear();
        sender.sendMessage(TextFormat.colorize("&3&b 区块已重发！"));
        return true;
    }
    @EventHandler//监听玩家进入服务器然后修复空背包
    public void onPlayerJoin(PlayerJoinEvent event){
        int fixgamemode = event.getPlayer().getGamemode();
      if(fixgamemode == 1){
        event.getPlayer().setGamemode(0);
        event.getPlayer().setGamemode(1);
    }
        }
            }
