package com.romagnolocesar.controleenfermagem.modelo.funcionario;
import com.romagnolocesar.controleenfermagem.modelo.Paciente.Paciente;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_funcionario")
    private int id;

    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="status_funcionario")
    private StatusFuncionario StatusFuncionario;

    @Temporal(TemporalType.DATE)
    @Column(name="data_cadastro")
    private Calendar dataCadastro;

    @Temporal(TemporalType.TIME)
    @Column(name="hora_cadastro")
    private Date horaCadastro;

//    @OneToMany(cascade = CascadeType.ALL )
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy="funcionario_responsavel"
    )
    private List<Paciente> pacientes;



    public int getId_funcionario() {
        return id;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public com.romagnolocesar.controleenfermagem.modelo.funcionario.StatusFuncionario isStatusFuncionario() {
        return StatusFuncionario;
    }

    public void setStatusFuncionario(com.romagnolocesar.controleenfermagem.modelo.funcionario.StatusFuncionario statusFuncionario) {
        StatusFuncionario = statusFuncionario;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(Date horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
