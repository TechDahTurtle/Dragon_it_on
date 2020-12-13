
package net.mcreator.dragonitout.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.dragonitout.DragonItOutModElements;

@DragonItOutModElements.ModElement.Tag
public class PlaceholderAxeItem extends DragonItOutModElements.ModElement {
	@ObjectHolder("dragon_it_out:placeholder_axe")
	public static final Item block = null;
	public PlaceholderAxeItem(DragonItOutModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlaceholderIngotItem.block, (int) (1)));
			}
		}, 1, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("placeholder_axe"));
	}
}
