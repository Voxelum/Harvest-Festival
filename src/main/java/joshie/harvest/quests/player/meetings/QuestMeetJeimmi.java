package joshie.harvest.quests.player.meetings;

import joshie.harvest.api.quests.HFQuest;
import joshie.harvest.buildings.HFBuildings;
import joshie.harvest.npcs.HFNPCs;
import joshie.harvest.quests.base.QuestMeeting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

@HFQuest("meeting.jeimmi")
public class QuestMeetJeimmi extends QuestMeeting {
    public QuestMeetJeimmi() {
        super(HFBuildings.TOWNHALL, HFNPCs.MAYOR);
    }

    @Override
    @SuppressWarnings("unchecked")
    public String getDescription(World world, EntityPlayer player) {
        if (hasBuilding(player)) return getLocalized("description");
        else if (building.getRules().canDo(world, player, 1)) return getLocalized("build");
        else return null;
    }

    @Override
    @Nonnull
    public ItemStack getCurrentIcon(World world, EntityPlayer player) {
        return hasBuilding(player) ? primary : buildingStack;
    }
}
