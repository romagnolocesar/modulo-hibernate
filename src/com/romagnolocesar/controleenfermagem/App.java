package com.romagnolocesar.controleenfermagem;

import com.mysql.cj.protocol.x.XProtocolDecoder;
import com.romagnolocesar.controleenfermagem.modelo.Paciente.Paciente;
import com.romagnolocesar.controleenfermagem.modelo.Paciente.TipoPaciente;
import com.romagnolocesar.controleenfermagem.modelo.funcionario.Funcionario;
import com.romagnolocesar.controleenfermagem.modelo.funcionario.StatusFuncionario;
import com.romagnolocesar.controleenfermagem.modelo.procedimento.Procedimento;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class App {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleEnfermagem");
        EntityManager eManager = factory.createEntityManager();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enfermeiro");
        funcionario.setStatusFuncionario(StatusFuncionario.ATIVO);


        Paciente paciente = new Paciente();
        paciente.setNome("César");
        paciente.setEmail("cesar.romagnolo@gmail.com");
        paciente.setDataCadastro(Calendar.getInstance());
        paciente.setHoraCadastro(Calendar.getInstance().getTime());
        paciente.setTipoPaciente(TipoPaciente.UTI);
        paciente.setFuncionarioResponsavel(funcionario);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Janaina");
        paciente2.setEmail("janaina.engenharia1@gmail.com");
        paciente2.setDataCadastro(Calendar.getInstance());
        paciente2.setHoraCadastro(Calendar.getInstance().getTime());
        paciente2.setTipoPaciente(TipoPaciente.EMERGENCIA);
        paciente2.setFuncionarioResponsavel(funcionario);

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente);
        pacientes.add(paciente2);
        funcionario.setPacientes(pacientes);

//        PROCEDIMENTOS
        Procedimento procedimento = new Procedimento();
        procedimento.setNome("Medir Temperatura");
        procedimento.setDescricao("Usar termometro para medir temperatura do paciente");
        procedimento.setFuncionario_responsavel(funcionario);
        procedimento.setPaciente(paciente);

        Procedimento procedimento2 = new Procedimento();
        procedimento2.setNome("Dar Dipirona");
        procedimento2.setDescricao("Dar 10mg de dipirona na veia");
        procedimento2.setFuncionario_responsavel(funcionario);
        procedimento2.setPaciente(paciente);



        eManager.getTransaction().begin();
        eManager.persist(funcionario);
        eManager.persist(procedimento);
        eManager.persist(procedimento2);
        eManager.persist(paciente);
        eManager.persist(paciente2);
        eManager.getTransaction().commit();
        eManager.close();
    }
}

