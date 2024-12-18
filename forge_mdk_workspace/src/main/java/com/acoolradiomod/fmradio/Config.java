package com.acoolradiomod.fmradio;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = FmRadioMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER.define("logDirtBlock", false);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

//    @SubscribeEvent
//    public static void onLoad(ModConfigEvent.OnLoadEvent event) {
//        // Add any initialization code here if needed
//    }
}
