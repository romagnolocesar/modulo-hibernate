package com.romagnolocesar.controleenfermagem.modelo;

import com.romagnolocesar.controleenfermagem.modelo.Paciente.Paciente;
import com.romagnolocesar.controleenfermagem.modelo.Paciente.TipoPaciente;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import java.util.Calendar;

public class ClienteMain {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleEnfermagem");
        EntityManager eManager = factory.createEntityManager();

        Paciente paciente = new Paciente();
        paciente.setNome("César");
        paciente.setEmail("cesar.romagnolo@gmail.com");
        paciente.setDataCadastro(Calendar.getInstance());
        paciente.setHoraCadastro(Calendar.getInstance().getTime());
        paciente.setTipoPaciente(TipoPaciente.UTI);

        eManager.getTransaction().begin();
        eManager.persist(paciente);
        eManager.getTransaction().commit();
        eManager.close();
    }
}
