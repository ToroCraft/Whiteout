package net.torocraft.whiteout.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.torocraft.whiteout.Whiteout;

public class BlockBlack extends Block {

	public static BlockBlack INSTANCE;

	public static Item ITEM_INSTANCE;

	public static final String NAME = "black_block";

	public static void init() {
		INSTANCE = new BlockBlack();
		ResourceLocation resourceName = new ResourceLocation(Whiteout.MODID, NAME);
		INSTANCE.setRegistryName(resourceName);
		GameRegistry.register(INSTANCE);

		ITEM_INSTANCE = new ItemBlock(INSTANCE);
		ITEM_INSTANCE.setRegistryName(resourceName);
		GameRegistry.register(ITEM_INSTANCE);
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	public static void registerRenders() {
		ModelResourceLocation model = new ModelResourceLocation(Whiteout.MODID + ":" + NAME, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ITEM_INSTANCE, 0, model);
	}

	public BlockBlack() {
		super(Material.IRON);
		setHardness(1.0F);
		setResistance(10000F);
		setSoundType(SoundType.METAL);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setLightLevel(1f);
		setUnlocalizedName(NAME);
	}

}
