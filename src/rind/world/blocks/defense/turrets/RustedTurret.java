package rind.world.blocks.defense;

import mindustry.Vars;
import mindustry.core.World;
import mindustry.world.Tile;
import mindustry.world.blocks.defense.turrets.ItemTurret;

public class RustedTurret extends ItemTurret {

    public RustedTurret(String name) {
        super(name);
        rotateSpeed = 8f;
        targetAir = true;
        targetGround = true;
    }

    public class RustedTurretBuild extends ItemTurretBuild {

        @Override
        public boolean validateTarget() {
            if (!super.validateTarget()) return false;

            if (target != null) {
                return !isBlockedByWall(x, y, target.getX(), target.getY());
            }

            return true;
        }

        @Override
        public void updateTile() {
            if (
                target != null &&
                isBlockedByWall(x, y, target.getX(), target.getY())
            ) {
                target = null;
            }

            super.updateTile();
        }

        private boolean isBlockedByWall(
            float startX,
            float startY,
            float endX,
            float endY
        ) {
            final boolean[] blocked = { false };

            World.raycast(
                World.toTile(startX),
                World.toTile(startY),
                World.toTile(endX),
                World.toTile(endY),
                (bx, by) -> {
                    Tile tile = Vars.world.tile(bx, by);
                    if (tile != null && tile.solid() && tile.build != this) {
                        blocked[0] = true;
                        return true;
                    }
                    return false;
                }
            );

            return blocked[0];
        }
    }
}
