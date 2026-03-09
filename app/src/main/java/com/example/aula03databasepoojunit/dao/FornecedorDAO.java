package com.example.aula03databasepoojunit.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.aula03databasepoojunit.model.Fornecedor;
import com.example.aula03databasepoojunit.database.DatabaseHelper;
import java.util.List;

public class FornecedorDAO {
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    //Métodos CRUD

    //Construtor Padrão
    public FornecedorDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    private void open() {
        database = dbHelper.getWritableDatabase();
    }
    private void close() {
        dbHelper.close();
    }

    //CREATE - INSERIR UM NOVO REGISTRO (Fornecedor)
    public long insert(Fornecedor fornecedor) {
        return 0;
    }

    //READ - CONSULTAR UM REGISTRO PELO ID (Fornecedor)
    public List<Fornecedor> select(long id) {
        return null;
    }

    //UPDATE - ATUALIZAR UM REGISTRO EXISTENTE (Fornecedor)
    public int update(Fornecedor fornecedor) {
        return 0;
    }

    //DELETE - EXCLUIR UM REGISTRO PELO ID (Fornecedor)
    public int delete(long id) {
        return 0;
    }

    //DELETAR TODOS OS REGISTROS (Fornecedor)
    public int deleteAll() {
        return 0;
    }

    //CONSULTAR TODOS OS REGISTROS (Fornecedor)
    public int getCount() {
        return 0;
    }

    public Fornecedor getFornecedor(long id) {
        return null;
    }

    private Fornecedor cursorToFornecedor(Cursor cursor) {
        return null;
    }


}
