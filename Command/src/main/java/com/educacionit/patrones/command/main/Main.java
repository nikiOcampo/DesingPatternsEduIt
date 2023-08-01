package com.educacionit.patrones.command.main;

import com.educacionit.patrones.command.Command;
import com.educacionit.patrones.command.impl.PrendeServer;
import com.educacionit.patrones.invoker.Invoker;
import com.educacionit.patrones.server.IServer;
import com.educacionit.patrones.server.impl.ArgentinaServer;

public class Main {
    public static void main(String[] args) {
        IServer server = new ArgentinaServer();

        Command command = new PrendeServer(server);

        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
