package com.thepandaparade.create_automative;

//import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
//import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

//import java.util.function.Supplier;

public final class CreateAutomative {
    public static final String MOD_ID = "create_automative";

    // Registering a new creative tab
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_MODE_TAB = TABS.register("tpp_ca_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".tab"),
                    () -> new ItemStack(CreateAutomative.BLANK_MOULD_ITEM.get())));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    // Example Item
/*     public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB))); */

    // Blank Mould
    public static final RegistrySupplier<Item> BLANK_MOULD_ITEM = ITEMS.register("blank_mould", () ->
            new Item(new Item.Properties().arch$tab(CreateAutomative.CREATIVE_MODE_TAB)));
    
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

    public static void init() {
        // Write common init code here.
        TABS.register();
        ITEMS.register();

        //System.out.println("Hello Architectury world!");
        //System.out.println("The Panda Parade marches on!");
        System.out.println("Create Automative has been initialized!");
    }
}
