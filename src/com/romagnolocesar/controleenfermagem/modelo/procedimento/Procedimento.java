package com.romagnolocesar.controleenfermagem.modelo.procedimento;

import com.romagnolocesar.controleenfermagem.modelo.Paciente.Paciente;
import com.romagnolocesar.controleenfermagem.modelo.funcionario.Funcionario;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_prodecimento")
    private int id;

    private String nome;

    private String descricao;

    @Temporal(TemporalType.DATE)
    @Column(name="data_cadastro")
    private Calendar dataCadastro;

    @Temporal(TemporalType.TIME)
    @Column(name="hora_cadastro")
    private Date horaCadastro;

    private long data;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario_responsavel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_paciente")
    private Paciente paciente;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Funcionario getFuncionario_responsavel() {
        return funcionario_responsavel;
    }

    public void setFuncionario_responsavel(Funcionario funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
