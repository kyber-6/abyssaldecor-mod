package net.abyssaldecor;

import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.abyssaldecor.registry.BlockRegistry;
import net.abyssaldecor.registry.ItemGroupRegistry;
import net.abyssaldecor.registry.ItemRegistry;
import net.minecraft.client.renderer.RenderType;

public class AbyssalDecor {
    public static final String MOD_ID = "abyssaldecor";

    public static void init() {
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
        ItemGroupRegistry.init();
        ItemRegistry.init();
        BlockRegistry.init();
    }

    public static void initClient() {
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.SOLAR_ROD_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.ETHEREAL_ROD_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.LUNAR_ROD_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.TERRESTRIAL_ROD_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.STELLAR_ROD_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.ASTER_BLOCK.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), BlockRegistry.DAFFODIL_BLOCK.get());
    }
}
