package com.thepandaparade.create_automative;

//import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;

import java.util.function.Supplier;

import dev.architectury.core.block.ArchitecturyLiquidBlock;
import dev.architectury.core.fluid.ArchitecturyFlowingFluid;
import dev.architectury.core.fluid.ArchitecturyFluidAttributes;
//import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.core.fluid.SimpleArchitecturyFluidAttributes;
import dev.architectury.core.item.ArchitecturyBucketItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
public final class CreateAutomative {
    public static final String MOD_ID = "create_automative";

    // Registering a new creative tab
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_MODE_TAB = TABS.register("tpp_ca_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".tab"),
                    () -> new ItemStack(CreateAutomative.BLANK_MOULD_ITEM.get())));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(MOD_ID, Registries.FLUID);     
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);  
    // Example Item
/*     public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB))); */

    // Blank Mould
    public static final RegistrySupplier<Item> BLANK_MOULD_ITEM = ITEMS.register("blank_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB).stacksTo(1)));
    
    // Totem Mould
    public static final RegistrySupplier<Item> TOTEM_MOULD_ITEM = ITEMS.register("totem_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));

    // Filled Totem Mould
    public static final RegistrySupplier<Item> FILLED_TOTEM_MOULD_ITEM = ITEMS.register("filled_totem_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));

    // Apple Mould
    public static final RegistrySupplier<Item> APPLE_MOULD_ITEM = ITEMS.register("apple_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));

    // Filled Apple Mould
    public static final RegistrySupplier<Item> FILLED_APPLE_MOULD_ITEM = ITEMS.register("filled_apple_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));
    
    // Star Mould
    public static final RegistrySupplier<Item> STAR_MOULD_ITEM = ITEMS.register("star_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));
    
    // Filled Star Mould
    public static final RegistrySupplier<Item> FILLED_STAR_MOULD_ITEM = ITEMS.register("filled_star_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));

    // Incomplete Basalt
    public static final RegistrySupplier<Item> INCOMPLETE_BASALT_ITEM = ITEMS.register("incomplete_basalt", () ->
                new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));
    
    // Incomplete Monster Spawner
    public static final RegistrySupplier<Item> INCOMPLETE_MONSTER_SPAWNER_ITEM = ITEMS.register("incomplete_spawner", () ->
                        new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));
    
    // Dragon Breath Liquid
    // I can not do this. Placing the liquid chunkbans the world. If this could be fixed, it would be used for the dragon egg recipe
    // and collected by item draining dragon breath.
    public static final ArchitecturyFluidAttributes LIQUID_DRAGON_BREATH_ATTRIBUTES = SimpleArchitecturyFluidAttributes.ofSupplier(() -> CreateAutomative.FLOWING_DRAGON_BREATH_LIQUID, () -> CreateAutomative.DRAGON_BREATH_LIQUID)
    .color(0x800080)
    .temperature(0);
    public static final Supplier<? extends FlowingFluid> DRAGON_BREATH_LIQUID = FLUIDS.register("dragon_breath_liquid", () ->
            new ArchitecturyFlowingFluid.Source(LIQUID_DRAGON_BREATH_ATTRIBUTES));
    public static final RegistrySupplier<Fluid> FLOWING_DRAGON_BREATH_LIQUID = FLUIDS.register("flowing_dragon_breath_liquid", () ->
            new ArchitecturyFlowingFluid.Flowing(LIQUID_DRAGON_BREATH_ATTRIBUTES));
    public static final RegistrySupplier<Item> DRAGON_BREATH_LIQUID_BUCKET = ITEMS.register("dragon_breath_liquid_bucket", () ->
            new ArchitecturyBucketItem(DRAGON_BREATH_LIQUID, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<LiquidBlock> DRAGON_BREATH_LIQUID_BLOCK = BLOCKS.register("dragon_breath_liquid_block", () ->
            new ArchitecturyLiquidBlock(DRAGON_BREATH_LIQUID, BlockBehaviour.Properties.copy(Blocks.WATER)));
    
    
    public static void init() {
        // Write common init code here.
        FLUIDS.register();
        TABS.register();
        ITEMS.register();
        BLOCKS.register();

        //System.out.println("Hello Architectury world!");
        //System.out.println("The Panda Parade marches on!");
        System.out.println("Create Automative has been initialized!");
    }
}
