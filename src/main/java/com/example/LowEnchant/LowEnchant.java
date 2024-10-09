package com.example.LowEnchant;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentOffer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LowEnchant extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("LowEnchant Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("LowEnchant Plugin Disabled!");
    }

    @EventHandler
    public void onPrepareEnchant(PrepareItemEnchantEvent event) {
        for (EnchantmentOffer offer : event.getOffers()) {
            if (offer != null) {
                offer.setEnchantmentLevel(1);
            }
        }
    }
}
