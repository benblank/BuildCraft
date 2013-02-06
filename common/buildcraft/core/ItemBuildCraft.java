/**
 * Copyright (c) SpaceToad, 2011
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package buildcraft.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import buildcraft.BuildCraftCore;
import buildcraft.core.utils.StringUtil;

public class ItemBuildCraft extends Item {

	public ItemBuildCraft(int i) {
		super(i);

		if (i == BuildCraftCore.mainConfiguration.get(Configuration.CATEGORY_ITEM, "fuel.id", DefaultProps.FUEL_ID).getInt(DefaultProps.FUEL_ID)) {
			setTextureFile(DefaultProps.TEXTURE_LIQUID);
		} else {
			setTextureFile(DefaultProps.TEXTURE_ITEMS);
		}

		setCreativeTab(CreativeTabBuildCraft.tabBuildCraft);
	}

	@Override
	public String getItemDisplayName(ItemStack itemstack) {
		return StringUtil.localize(getItemNameIS(itemstack));
	}
}
