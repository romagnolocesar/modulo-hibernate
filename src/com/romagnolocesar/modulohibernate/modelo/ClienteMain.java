package com.romagnolocesar.modulohibernate.modelo;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class ClienteMain {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursoHibernatePersistence");
        factory.close();
    }
}
