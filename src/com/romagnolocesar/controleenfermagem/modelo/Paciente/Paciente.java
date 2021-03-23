package com.romagnolocesar.controleenfermagem.modelo.Paciente;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_paciente")
    private TipoPaciente tipoPaciente;

    @Temporal(TemporalType.DATE)
    @Column(name="data_cadastro")
    private Calendar dataCadastro;

    @Temporal(TemporalType.TIME)
    @Column(name="hora_cadastro")
    private Date horaCadastro;


    public Paciente() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public TipoPaciente getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
}
