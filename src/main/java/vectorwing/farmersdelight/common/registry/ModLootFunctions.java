package vectorwing.farmersdelight.common.registry;

import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import vectorwing.farmersdelight.common.loot.function.CopyMealFunction;
import vectorwing.farmersdelight.common.loot.function.CopySkilletFunction;
import vectorwing.farmersdelight.common.loot.function.SmokerCookFunction;

public class ModLootFunctions {
    public static LootItemFunctionType COPY_MEAL = null;
    public static LootItemFunctionType COPY_SKILLET = null;
    public static LootItemFunctionType SMOKER_COOK = null;

    public static void register() {
        COPY_MEAL = LootItemFunctions.register(CopyMealFunction.ID.toString(), new CopyMealFunction.Serializer());
        COPY_SKILLET = LootItemFunctions.register(CopySkilletFunction.ID.toString(), new CopySkilletFunction.Serializer());
        SMOKER_COOK = LootItemFunctions.register(SmokerCookFunction.ID.toString(), new SmokerCookFunction.Serializer());
    }
}
