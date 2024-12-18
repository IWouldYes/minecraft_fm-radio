
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.acoolradio.minecraftfmradio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.acoolradio.minecraftfmradio.block.RadioBlock;
import net.acoolradio.minecraftfmradio.FmradioMod;

public class FmradioModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FmradioMod.MODID);
	public static final RegistryObject<Block> RADIO = REGISTRY.register("radio", () -> new RadioBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
