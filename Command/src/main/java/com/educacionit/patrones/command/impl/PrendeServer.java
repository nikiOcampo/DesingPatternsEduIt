package com.educacionit.patrones.command.impl;

import com.educacionit.patrones.command.Command;
import com.educacionit.patrones.server.IServer;

public class PrendeServer implements Command {

    private IServer servidor;

    public PrendeServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.prendete();
        servidor.guardaLog();
        servidor.cerraConexion();
    }
}
