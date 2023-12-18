package me.txmc.core.antiillegal.check.checks;

import me.txmc.core.antiillegal.check.Check;import org.bukkit.inventory.ItemStack;

/**
 * @author 254n_m
 * @since 2023/09/18 10:40 PM
 * This file was created as a part of 8b8tAntiIllegal
 */
public class OverStackCheck implements Check {
    @Override
    public boolean check(ItemStack item) {
        return item.getAmount() > item.getType().getMaxStackSize();
    }

    @Override
    public boolean shouldCheck(ItemStack item) {
        return true;
    }

    @Override
    public void fix(ItemStack item) {
        item.setAmount(item.getType().getMaxStackSize());
    }
}
