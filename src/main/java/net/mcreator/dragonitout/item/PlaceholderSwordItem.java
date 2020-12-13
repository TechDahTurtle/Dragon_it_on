
package net.mcreator.dragonitout.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dragonitout.DragonItOutModElements;

@DragonItOutModElements.ModElement.Tag
public class PlaceholderSwordItem extends DragonItOutModElements.ModElement {
	@ObjectHolder("dragon_it_out:placeholder_sword")
	public static final Item block = null;
	public PlaceholderSwordItem(DragonItOutModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, 6f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("placeholder_sword"));
	}
}
