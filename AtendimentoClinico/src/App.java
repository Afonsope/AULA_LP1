import java.time.LocalDateTime;

import entities.AdminEntity;
import entities.FuncionarioEntity;
import entities.MedicoEntity;
import entities.ProcedimentosEntity;
import entities.StatusEntity;

public class App {
    public static void main(String[] args) throws Exception {
        StatusEntity status = new StatusEntity(1, "ativo");
        AdminEntity adm = new AdminEntity("111.111.111-11", "Pedro Afonso Paulina Ataide", "123", status, LocalDateTime.now());
        FuncionarioEntity funcionario = new FuncionarioEntity("222.222.222-22", "Luciene Calvalcanti", "LP1", status, "Atendimento");
        MedicoEntity medico1 = new MedicoEntity("333.333.333-33", "Waldir", "Agro", status, "123.456.789-00");
        MedicoEntity medico2 = new MedicoEntity("444.444.444-44", "Sergio", "dba", status, "098.765.432-11");
        ProcedimentosEntity procedimento1 = new ProcedimentosEntity(1, "Raio-X", "Visão de osso fraturado");
        ProcedimentosEntity procedimento2 = new ProcedimentosEntity(2, "Raio-X", "Visão de osso fraturado");
    }
}
