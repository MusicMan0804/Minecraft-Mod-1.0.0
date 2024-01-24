package net.musicman.tutorialmod.Block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.*;
import net.musicman.tutorialmod.Item.ModItems;
import net.musicman.tutorialmod.TutorialMod;

import java.util.function.Supplier;

public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> CRACKED_JADE_BLOCK = registerBlock("cracked_jade_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> CHALCEDONY_BLOCK = registerBlock("chalcedony_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> JASPER_BLOCK = registerBlock("jasper_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));


    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CHALCEDONY_ORE = registerBlock("chalcedony_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(1,3)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
