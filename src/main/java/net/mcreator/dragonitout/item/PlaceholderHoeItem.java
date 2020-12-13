
package net.mcreator.dragonitout.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.dragonitout.DragonItOutModElements;

@DragonItOutModElements.ModElement.Tag
public class PlaceholderHoeItem extends DragonItOutModElements.ModElement {
	@ObjectHolder("dragon_it_out:placeholder_hoe")
	public static final Item block = null;
	public PlaceholderHoeItem(DragonItOutModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlaceholderIngotItem.block, (int) (1)));
			}
		}, 6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("placeholder_hoe"));
	}
}
