package rind.content;

import arc.graphics.*;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.meta.*;

public class RustedPlanets {

    public static Planet rustara;

    public static void load() {
        rustara = new Planet("rustara", Planets.sun, 1f, 2) {
            {
                generator = new TantrosPlanetGenerator();
                meshLoader = () -> new HexMesh(this, 4);
                accessible = false;
                visible = false;
                atmosphereColor = Color.valueOf("3db899");
                iconColor = Color.valueOf("597be3");
                startSector = 10;
                atmosphereRadIn = -0.01f;
                atmosphereRadOut = 0.3f;
                defaultEnv = Env.underwater | Env.terrestrial;
                ruleSetter = r -> {};
            }
        };
    }
}
