package rind.content;

import arc.graphics.*;
import mindustry.type.*;

public class RustedItems {

    public static Item handmadeShell, buckshotShell, slugShell, incendiaryShell, pistolBullet, hvPistolAmmo, incendiaryPistolBullet, rifleAmmo, hvRifleAmmo, incendiaryRifleAmmo, explosiveRifleAmmo, rocket, highVelocityRocket, incendiaryRocket, smokeRocket, grenade40mm, explosive40mmGrenade, incendiary40mmGrenade, arrow, boneArrow, fireArrow, highVelocityArrow, nail, samAmmo;

    public static void load() {
        handmadeShell = new Item("handmade-shell", Color.valueOf("d99d73")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        buckshotShell = new Item("buckshot-shell", Color.valueOf("d99d73")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        slugShell = new Item("slug-shell", Color.valueOf("d99d73")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        incendiaryShell = new Item(
            "incendiary-shell",
            Color.valueOf("ff9955")
        ) {
            {
                explosiveness = 1.2f;
                flammability = 1.5f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        pistolBullet = new Item("pistol-bullet", Color.valueOf("a0a0a0")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        hvPistolAmmo = new Item("hv-pistol-ammo", Color.valueOf("8888aa")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        incendiaryPistolBullet = new Item(
            "incendiary-pistol-bullet",
            Color.valueOf("ff6666")
        ) {
            {
                explosiveness = 0.8f;
                flammability = 0.5f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        rifleAmmo = new Item("rifle-ammo", Color.valueOf("a0a0a0")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        hvRifleAmmo = new Item("hv-rifle-ammo", Color.valueOf("7777cc")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        incendiaryRifleAmmo = new Item(
            "incendiary-rifle-ammo",
            Color.valueOf("ff6666")
        ) {
            {
                flammability = 0.8f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        explosiveRifleAmmo = new Item(
            "explosive-rifle-ammo",
            Color.valueOf("ffaa55")
        ) {
            {
                explosiveness = 1.5f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        rocket = new Item("rocket", Color.valueOf("888888")) {
            {
                explosiveness = 2f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        highVelocityRocket = new Item(
            "high-velocity-rocket",
            Color.valueOf("6666aa")
        ) {
            {
                explosiveness = 2f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        incendiaryRocket = new Item(
            "incendiary-rocket",
            Color.valueOf("ff5555")
        ) {
            {
                explosiveness = 1.5f;
                flammability = 2f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        smokeRocket = new Item("smoke-rocket", Color.valueOf("dddddd")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        grenade40mm = new Item("grenade-40mm", Color.valueOf("888888")) {
            {
                explosiveness = 2.5f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        explosive40mmGrenade = new Item(
            "explosive-40mm-grenade",
            Color.valueOf("ffaa55")
        ) {
            {
                explosiveness = 4f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        incendiary40mmGrenade = new Item(
            "incendiary-40mm-grenade",
            Color.valueOf("ff5555")
        ) {
            {
                explosiveness = 2f;
                flammability = 3f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        arrow = new Item("arrow", Color.valueOf("d99d73")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        boneArrow = new Item("bone-arrow", Color.valueOf("e0e0d0")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        fireArrow = new Item("fire-arrow", Color.valueOf("ff5555")) {
            {
                flammability = 1f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        highVelocityArrow = new Item(
            "high-velocity-arrow",
            Color.valueOf("aaaacc")
        ) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };

        nail = new Item("nail", Color.valueOf("888888")) {
            {
                alwaysUnlocked = true;
                buildable = false;
            }
        };
        samAmmo = new Item("sam-ammo", Color.valueOf("66aa66")) {
            {
                explosiveness = 3f;
                alwaysUnlocked = true;
                buildable = false;
            }
        };
    }
}
