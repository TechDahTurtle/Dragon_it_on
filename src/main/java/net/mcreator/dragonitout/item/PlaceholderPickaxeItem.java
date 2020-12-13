
package net.mcreator.dragonitout.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dragonitout.DragonItOutModElements;

@DragonItOutModElements.ModElement.Tag
public class PlaceholderPickaxeItem extends DragonItOutModElements.ModElement {
	@ObjectHolder("dragon_it_out:placeholder_pickaxe")
	public static final Item block = null;
	public PlaceholderPickaxeItem(DragonItOutModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 20f;
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
		}, 1, 6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("placeholder_pickaxe"));
	}
}
