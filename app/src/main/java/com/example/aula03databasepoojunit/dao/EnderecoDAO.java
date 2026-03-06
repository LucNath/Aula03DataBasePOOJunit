package com.example.aula03databasepoojunit.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.aula03databasepoojunit.database.DatabaseHelper;
import com.example.aula03databasepoojunit.model.Endereco;

import java.util.List;

public class EnderecoDAO {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    //Métodos CRUD
    private void open() {
    }

    private void close() {
    }

    //Construtor Padrão
    public EnderecoDAO() {
    }

    //CREATE - INSERIR UM NOVO REGISTRO
    public long insert(Endereco endereco) {
        return 0;
    }

    //READ - CONSULTAR UM REGISTRO PELO ID
    public List<Endereco> select(long id) {
        return null;
    }

    //UPDATE - ATUALIZAR UM REGISTRO EXISTENTE
    public int update(Endereco endereco) {
        return 0;
    }

    //DELETE - EXCLUIR UM REGISTRO PELO ID
    public int delete(long id) {
        return 0;
    }

    //DELETAR TODOS OS REGISTROS
    public int deleteAll() {
        return 0;
    }

    //CONSULTAR TODOS OS REGISTROS
    public int getCount() {
        return 0;
    }

    public Endereco getEndereco(long id) {
        return null;
    }

    public List<Endereco> getByCidade(String cidade) {
        return null;
    }

    public List<Endereco> getByEstado(String estado) {
        return null;
    }

    private Endereco cursorToEndereco(Cursor cursor) {
        return null;
    }


}
