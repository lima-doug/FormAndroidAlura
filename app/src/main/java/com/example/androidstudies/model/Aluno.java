package com.example.androidstudies.model;

import androidx.annotation.NonNull;

public class Aluno {
    private final Object nome;
    private final Object telefone;
    private final Object email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return nome + ", \n" + telefone +
                ", \n" + email + "\n";
    }
}
