package ga.ejer.report;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// TODO: Fix cooldown!

public class CooldownManager {
    private final Map<UUID, Integer> cooldowns = new HashMap<>();

    public static final int DEFAULT_COOLDOWN = 60;

    public void setCooldown(UUID player, int time){
        if(time < 1) {
            cooldowns.remove(player);
        } else {
            cooldowns.put(player, time);
        }
    }

    public int getCooldown(UUID player){
        return cooldowns.getOrDefault(player, 0);
    }
}
