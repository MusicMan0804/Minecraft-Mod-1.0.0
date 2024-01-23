package net.musicman.tutorialmod.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.*;
import net.musicman.tutorialmod.TutorialMod;

//Looking to make 5 sets of armor, requiring 3 new items and ores
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHALCEDONY  = ITEMS.register("chalcedony",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JASPER  = ITEMS.register("jasper",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
