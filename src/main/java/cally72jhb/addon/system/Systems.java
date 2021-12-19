package cally72jhb.addon.system;

import cally72jhb.addon.gui.tabs.PlayersTab;
import cally72jhb.addon.gui.tabs.VectorConfigTab;
import cally72jhb.addon.system.commands.*;
import cally72jhb.addon.system.modules.combat.*;
import cally72jhb.addon.system.modules.misc.*;
import cally72jhb.addon.system.modules.movement.*;
import cally72jhb.addon.system.modules.player.*;
import cally72jhb.addon.system.modules.render.*;
import cally72jhb.addon.system.players.Players;
import meteordevelopment.meteorclient.gui.tabs.Tabs;
import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class Systems {
    public static void init() {
        // Modules
        //add(new AutoCityPlus());
        add(new AntiDesync());
        add(new AutoEz());
        add(new BedrockWalk());
        add(new BowBomb());
        add(new CevBreaker());
        add(new ColorPlace());
        add(new ChorusPredict());
        add(new ClipPhase());
        add(new DebugTools());
        add(new EntityFly());
        add(new PortalGodMode());
        add(new PacketFly());
        add(new PingSpoof());
        add(new ReverseStep());
        add(new SilentAntiGhost());
        add(new SkeletonESP());
        add(new StepPlus());
        add(new Strafe());
        add(new SurroundPlus());
        //add(new SurroundPlusPlus());
        add(new Tower());
        add(new Welcomer());
        add(new VectorPresence());

        // Commands
        add(new CenterCommand());
        add(new HeadsCommand());
        add(new MuteCommand());
        add(new TargetCommand());

        Players.get().init();

        Tabs.get().add(new VectorConfigTab());
        Tabs.get().add(new PlayersTab());
    }

    // Utils

    private static void add(Command command) {
        Commands.get().add(command);
    }

    private static void add(Module module) {
        Modules.get().add(module);
    }
}
