package rind;

import mindustry.mod.Mod;
import rind.content.*;

public class RustedIndustry extends Mod {

    @Override
    public void loadContent() {
        RustedPlanets.load();
        RustedItems.load();
        RustedBlocks.load();
    }
}
