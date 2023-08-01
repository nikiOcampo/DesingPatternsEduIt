package com.educacionit.patrones.command.impl;

import com.educacionit.patrones.command.Command;
import com.educacionit.patrones.server.IServer;

public class ResetServer implements Command {

    private IServer servidor;

    public ResetServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.apagate();
        servidor.prendete();
        servidor.guardaLog();
        servidor.cerraConexion();
    }
}