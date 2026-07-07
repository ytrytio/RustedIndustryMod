package rind.content;

import static mindustry.type.ItemStack.with;

import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.part.*;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.draw.*;
import mindustry.world.meta.BuildVisibility;
import rind.world.blocks.defense.RustedTurret;

public class RustedBlocks {

    public static Block autoTurret, shotgunTrap;

    public static void load() {
        autoTurret = new RustedTurret("auto-turret") {
            {
                requirements(
                    Category.turret,
                    with(Items.copper, 150, Items.lead, 100)
                );

                size = 2;
                range = 180f;
                health = 800;
                reload = 20f;
                rotateSpeed = 8f;
                targetAir = false;
                //playerControllable = false;

                ammo(
                    RustedItems.handmadeShell,
                    new BasicBulletType(4f, 10) {
                        {
                            shoot.shots = 5;
                            inaccuracy = 25f;
                            reloadMultiplier = 0.6f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    },
                    RustedItems.buckshotShell,
                    new BasicBulletType(5f, 12) {
                        {
                            shoot.shots = 8;
                            inaccuracy = 20f;
                            reloadMultiplier = 0.5f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    },

                    RustedItems.pistolBullet,
                    new BasicBulletType(8f, 15) {
                        {
                            lifetime = 30f;
                            collidesTiles = true;
                        }
                    },
                    RustedItems.rifleAmmo,
                    new BasicBulletType(10f, 25) {
                        {
                            lifetime = 35f;
                            reloadMultiplier = 1.2f;
                            collidesTiles = true;
                        }
                    },
                    RustedItems.hvRifleAmmo,
                    new BasicBulletType(15f, 35) {
                        {
                            lifetime = 40f;
                            reloadMultiplier = 1.5f;
                            pierce = true;
                            collidesTiles = true;
                        }
                    },
                    RustedItems.incendiaryShell,
                    new BasicBulletType(6f, 20) {
                        {
                            lifetime = 40f;
                            incendAmount = 10;
                            incendSpread = 10f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    }
                );

                drawer = new DrawTurret() {
                    {
                        parts.add(
                            new RegionPart("-mid") {
                                {
                                    progress = PartProgress.recoil;
                                    under = false;
                                    moveY = -1.25f;
                                }
                            }
                        );
                    }
                };

                buildVisibility = BuildVisibility.shown;
            }
        };
        shotgunTrap = new RustedTurret("shotgun-trap") {
            {
                requirements(
                    Category.turret,
                    with(Items.copper, 150, Items.lead, 100)
                );
                size = 2;
                range = 80f;
                health = 450;
                reload = 30f;
                rotateSpeed = 0f;
                targetAir = false;
                shootCone = 45f;

                ammo(
                    RustedItems.handmadeShell,
                    new BasicBulletType(4f, 10) {
                        {
                            shoot.shots = 5;
                            inaccuracy = 25f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    },
                    RustedItems.buckshotShell,
                    new BasicBulletType(5f, 12) {
                        {
                            shoot.shots = 8;
                            inaccuracy = 20f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    },
                    RustedItems.slugShell,
                    new BasicBulletType(10f, 40) {
                        {
                            lifetime = 15f;
                            collidesTiles = true;
                            shootSound = Sounds.shootArtillerySmall;
                        }
                    },
                    RustedItems.incendiaryShell,
                    new BasicBulletType(6f, 20) {
                        {
                            incendAmount = 10;
                            incendSpread = 10f;
                            collidesTiles = true;
                            shootSound = Sounds.shootDiffuse;
                        }
                    }
                );

                drawer = new DrawTurret("-mid");
                buildVisibility = BuildVisibility.shown;
            }
        };
    }
}
