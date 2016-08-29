package joshie.harvest.cooking.item;

import joshie.harvest.cooking.item.ItemIngredients.Ingredient;
import joshie.harvest.core.HFTab;
import joshie.harvest.core.base.item.ItemHFEnum;
import net.minecraft.util.IStringSerializable;

public class ItemIngredients extends ItemHFEnum<ItemIngredients, Ingredient> {
    public enum Ingredient implements IStringSerializable {
        BUTTER(false), KETCHUP(false), COOKIES(false), EGG_SCRAMBLED(false), SASHIMI(false),
        FLOUR, OIL, RICEBALL, SALT, CHOCOLATE;

        private final boolean isReal;

        Ingredient() {
            isReal = true;
        }

        Ingredient(boolean isReal) {
            this.isReal = isReal;
        }

        @Override
        public String getName() {
            return name().toLowerCase();
        }
    }

    public ItemIngredients() {
        super(HFTab.COOKING, Ingredient.class);
    }

    @Override
    public boolean shouldDisplayInCreative(Ingredient ingredient) {
        return ingredient.isReal;
    }
}