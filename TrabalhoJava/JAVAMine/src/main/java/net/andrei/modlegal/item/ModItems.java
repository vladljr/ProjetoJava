package net.andrei.modlegal.item;

import net.andrei.modlegal.ModLegal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModLegal.MOD_ID);

    public static final RegistryObject<Item> ITEM_TESTE = ITEMS.register("item_teste",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> RUBY = ITEMS.register("img",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWORD = ITEMS.register("sword",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}