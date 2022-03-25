package vectorwing.farmersdelight.common.tag;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import vectorwing.farmersdelight.FarmersDelight;

/**
 * References to tags under the Farmer's Delight namespace.
 * These tags are used for mod mechanics.
 */
public class ModTags
{
	// Blocks that are efficiently mined with a Knife.
	public static final TagKey<Block> MINEABLE_WITH_KNIFE = modBlockTag("mineable/knife");

	// Blocks made mostly of straw.
	public static final TagKey<Block> STRAW_BLOCKS = modBlockTag("straw_blocks");

	// Blocks that represent the wild form of a farmable crop.
	public static final TagKey<Block> WILD_CROPS = modBlockTag("wild_crops");

	// Blocks that can heat up cooking workstations.
	public static final TagKey<Block> HEAT_SOURCES = modBlockTag("heat_sources");

	// Blocks that can transfer heat to cooking workstations, if directly above a heat source.
	public static final TagKey<Block> HEAT_CONDUCTORS = modBlockTag("heat_conductors");

	// Blocks to which a Cooking Pot/Skillet will render a tray over. Included in HEAT_SOURCES.
	public static final TagKey<Block> TRAY_HEAT_SOURCES = modBlockTag("tray_heat_sources");

	// Blocks that accelerate decomposition of Organic Compost if placed adjacent to it.
	public static final TagKey<Block> COMPOST_ACTIVATORS = modBlockTag("compost_activators");

	// Blocks in which Mushroom Colonies can keep growing on, if it's dark enough. These blocks cannot form new colonies.
	public static final TagKey<Block> MUSHROOM_COLONY_GROWABLE_ON = modBlockTag("mushroom_colony_growable_on");

	// Blocks that should not have their growth boosted by Rich Soil, if planted on it.
	public static final TagKey<Block> UNAFFECTED_BY_RICH_SOIL = modBlockTag("unaffected_by_rich_soil");

	// Items that represent the wild form of a farmable crop.
	public static final TagKey<Item> WILD_CROPS_ITEM = modItemTag("wild_crops");

	// Items (ideally tools) that can obtain straw when harvesting grassy plants. Populated by all knives by default.
	public static final TagKey<Item> STRAW_HARVESTERS = modItemTag("straw_harvesters");

	// Foods that drop from mobs that wolves prey upon (sheep, rabbit and chicken).
	public static final TagKey<Item> WOLF_PREY = modItemTag("wolf_prey");

	// Foods and items that serve as filling for Cabbage Rolls
	public static final TagKey<Item> CABBAGE_ROLL_INGREDIENTS = modItemTag("cabbage_roll_ingredients");

	// Items commonly held in the off-hand. Cutting Boards won't let them be placed from the off-hand, for convenience.
	public static final TagKey<Item> OFFHAND_EQUIPMENT = modItemTag("offhand_equipment");

	// Knife items for game logic.
	public static final TagKey<Item> KNIVES = modItemTag("tools/knives");

	// Canvas Signs items for crafting.
	public static final TagKey<Item> CANVAS_SIGNS = modItemTag("canvas_signs");

	// Entities that should be able to eat Dog Food when tame. Defaults to tamed Wolves.
	public static final TagKey<EntityType<?>> DOG_FOOD_USERS = modEntityTag("dog_food_users");

	// Entities that should be able to eat Horse Feed when tame. Defaults to most vanilla mounts, except Pigs and Striders.
	public static final TagKey<EntityType<?>> HORSE_FEED_USERS = modEntityTag("horse_feed_users");

	private static TagKey<Item> modItemTag(String path) {
		return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(FarmersDelight.MODID + ":" + path));
	}

	private static TagKey<Block> modBlockTag(String path) {
		return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(FarmersDelight.MODID + ":" + path));
	}

	private static TagKey<EntityType<?>> modEntityTag(String path) {
		return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation(FarmersDelight.MODID + ":" + path));
	}
}
