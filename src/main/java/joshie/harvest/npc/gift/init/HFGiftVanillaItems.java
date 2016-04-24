package joshie.harvest.npc.gift.init;

import static joshie.harvest.npc.gift.Gifts.Category.*;
import static joshie.harvest.npc.gift.Gifts.assign;

public class HFGiftVanillaItems {
    public static void init() {
        assign(iron_shovel, TOOLS);
        assign(iron_pickaxe, MINING, TOOLS);
        assign(iron_axe, TOOLS);
        assign(flint_and_steel, TOOLS, DANGER);
        assign(apple, NATURE, COOKING, FARMING);
        assign(bow, TOOLS, BATTLE);
        assign(arrow, TOOLS, BATTLE);
        assign(coal, MINING, CHEAP);
        assign(diamond, MINING, PRETTY, RARE);
        assign(iron_ingot, MINING);
        assign(gold_ingot, MINING);
        assign(iron_sword, BATTLE);
        assign(wooden_sword, CHEAP, BATTLE);
        assign(wooden_shovel, MINING, TOOLS, CHEAP);
        assign(wooden_pickaxe, TOOLS, CHEAP);
        assign(wooden_axe, TOOLS, CHEAP);
        assign(stone_sword, CHEAP, BATTLE);
        assign(stone_shovel, TOOLS, CHEAP);
        assign(stone_pickaxe, MINING, TOOLS, CHEAP);
        assign(stone_axe, TOOLS, CHEAP);
        assign(diamond_sword, RARE, BATTLE);
        assign(diamond_shovel, TOOLS, RARE);
        assign(diamond_pickaxe, MINING, TOOLS, RARE);
        assign(diamond_axe, TOOLS, RARE);
        assign(stick, TOOLS, CHEAP);
        assign(bowl, CHEAP);
        assign(mushroom_stew, NATURE, COOKING);
        assign(golden_sword, BATTLE);
        assign(golden_shovel, TOOLS);
        assign(golden_pickaxe, MINING, TOOLS);
        assign(golden_axe, TOOLS);
        assign(string, NATURE, CHEAP, KNITTING);
        assign(feather, CUTE, NATURE, ANIMALS, PRETTY, FARMING, GIRLY);
        assign(gunpowder, CHEAP, DANGER);
        assign(wooden_hoe, TOOLS, CHEAP, FARMING);
        assign(stone_hoe, TOOLS, FARMING);
        assign(iron_hoe, TOOLS, FARMING);
        assign(diamond_hoe, TOOLS, FARMING);
        assign(golden_hoe, TOOLS, FARMING);
        assign(wheat_seeds, NATURE, CHEAP, FARMING);
        assign(wheat, NATURE, COOKING, FARMING);
        assign(bread, COOKING);
        assign(leather_helmet, BATTLE);
        assign(leather_chestplate, BATTLE);
        assign(leather_leggings, BATTLE);
        assign(leather_boots, BATTLE);
        assign(chainmail_helmet, BATTLE);
        assign(chainmail_chestplate, BATTLE);
        assign(chainmail_leggings, BATTLE);
        assign(chainmail_boots, BATTLE);
        assign(iron_helmet, BATTLE);
        assign(iron_chestplate, BATTLE);
        assign(iron_leggings, BATTLE);
        assign(iron_boots, BATTLE);
        assign(diamond_helmet, PRETTY, RARE, BATTLE);
        assign(diamond_chestplate, PRETTY, RARE, BATTLE);
        assign(diamond_leggings, PRETTY, RARE, BATTLE);
        assign(diamond_boots, PRETTY, RARE, BATTLE);
        assign(golden_helmet, BATTLE);
        assign(golden_chestplate, BATTLE);
        assign(golden_leggings, BATTLE);
        assign(golden_boots, BATTLE);
        assign(flint, MINING, TOOLS, CHEAP);
        assign(porkchop, NATURE, COOKING, FARMING);
        assign(cooked_porkchop, COOKING);
        assign(painting, PRETTY);
        assign(golden_apple, RARE);
        assign(sign, CHEAP, CONSTRUCTION);
        assign(oak_door, CONSTRUCTION);
        assign(spruce_door, CONSTRUCTION);
        assign(birch_door, CONSTRUCTION);
        assign(jungle_door, CONSTRUCTION);
        assign(acacia_door, CONSTRUCTION);
        assign(dark_oak_door, CONSTRUCTION);
        assign(bucket, TOOLS);
        assign(water_bucket, WATER);
        assign(lava_bucket, SCARY, DANGER);
        assign(minecart, MINING);
        assign(saddle, CUTE, ANIMALS);
        assign(iron_door, CONSTRUCTION);
        assign(redstone, MINING);
        assign(snowball, CUTE);
        assign(boat, WATER);
        assign(leather, FARMING);
        assign(milk_bucket, ANIMALS, COOKING, FARMING);
        assign(brick, CONSTRUCTION);
        assign(clay_ball, WATER, CONSTRUCTION);
        assign(reeds, NATURE, FARMING);
        assign(paper, CONSTRUCTION);
        assign(book, CHEAP);
        assign(slime_ball, SCARY, ANIMALS);
        assign(chest_minecart, TECHNOLOGY);
        assign(furnace_minecart, TECHNOLOGY);
        assign(egg, NATURE, ANIMALS, COOKING);
        assign(compass, TOOLS, TECHNOLOGY);
        assign(fishing_rod, ANIMALS, WATER);
        assign(clock, TOOLS, TECHNOLOGY);
        assign(glowstone_dust, PRETTY, GIRLY);
        assign(fish, NATURE, COOKING, WATER);
        assign(cooked_fish, COOKING, WATER);
        assign(dye); //TODO: ASSIGN THE VARIATIONS
        assign(bone, SCARY, DANGER);
        assign(sugar, CUTE, COOKING, GIRLY);
        assign(cake, CUTE, COOKING, GIRLY);
        assign(bed, CONSTRUCTION);
        assign(repeater, TECHNOLOGY);
        assign(cookie, CUTE, COOKING);
        assign(filled_map, TOOLS);
        assign(shears, TOOLS);
        assign(melon, NATURE, COOKING, FARMING);
        assign(pumpkin_seeds, NATURE, FARMING);
        assign(melon_seeds, NATURE, FARMING);
        assign(beef, NATURE, COOKING, FARMING);
        assign(cooked_beef, COOKING);
        assign(chicken, NATURE, COOKING, FARMING);
        assign(cooked_chicken, COOKING);
        assign(rotten_flesh, SCARY, DANGER);
        assign(ender_pearl, RARE, DANGER);
        assign(blaze_rod, DANGER);
        assign(ghast_tear, SCARY, RARE, DANGER);
        assign(gold_nugget, MINING, DANGER);
        assign(nether_wart, DANGER);
        assign(potionitem, WATER, DANGER);
        assign(glass_bottle, COOKING, TOOLS);
        assign(spider_eye, SCARY, DANGER);
        assign(fermented_spider_eye, SCARY, DANGER);
        assign(blaze_powder, DANGER);
        assign(magma_cream, SCARY, DANGER);
        assign(brewing_stand, TECHNOLOGY);
        assign(cauldron, COOKING, CONSTRUCTION);
        assign(ender_eye, SCARY, RARE, DANGER);
        assign(speckled_melon, PRETTY, DANGER);
        assign(spawn_egg, DANGER);
        assign(experience_bottle, PRETTY, RARE);
        assign(fire_charge, SCARY, DANGER);
        assign(writable_book, GIRLY);
        assign(written_book, GIRLY);
        assign(emerald, PRETTY, RARE);
        assign(item_frame, PRETTY);
        assign(flower_pot, CUTE, PRETTY);
        assign(carrot, NATURE, COOKING, FARMING);
        assign(potato, NATURE, COOKING, FARMING);
        assign(baked_potato, COOKING);
        assign(poisonous_potato, SCARY, DANGER);
        assign(map, TOOLS);
        assign(golden_carrot, PRETTY);
        assign(skull, SCARY, RARE);
        assign(carrot_on_a_stick, ANIMALS);
        assign(nether_star, PRETTY);
        assign(pumpkin_pie, COOKING);
        assign(fireworks, PRETTY, GIRLY);
        assign(firework_charge, DANGER);
        assign(enchanted_book, RARE);
        assign(comparator, TECHNOLOGY);
        assign(netherbrick, CONSTRUCTION);
        assign(quartz, MINING);
        assign(tnt_minecart, SCARY, DANGER);
        assign(hopper_minecart, TECHNOLOGY);
        assign(iron_horse_armor, ANIMALS, GIRLY);
        assign(golden_horse_armor, ANIMALS, PRETTY, GIRLY);
        assign(diamond_horse_armor, ANIMALS, PRETTY, RARE, GIRLY);
        assign(lead, ANIMALS, FARMING);
        assign(name_tag, ANIMALS);
        assign(command_block_minecart, TECHNOLOGY);
        assign(record_13, RARE);
        assign(record_cat, RARE);
        assign(record_blocks, RARE);
        assign(record_chirp, RARE);
        assign(record_far, RARE);
        assign(record_mall, RARE);
        assign(record_mellohi, RARE);
        assign(record_stal, RARE);
        assign(record_strad, RARE);
        assign(record_ward, RARE);
        assign(record_11, RARE);
        assign(record_wait, RARE);
    }
}
