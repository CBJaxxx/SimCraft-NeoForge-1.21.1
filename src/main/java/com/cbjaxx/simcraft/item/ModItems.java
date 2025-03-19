package com.cbjaxx.simcraft.item;

import com.cbjaxx.simcraft.SimCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimCraft.MODID);

    public static final DeferredItem<Item> GIFT = ITEMS.register("gift",
            () -> new Item(new Item.Properties())); // this is the first registerd item.



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
