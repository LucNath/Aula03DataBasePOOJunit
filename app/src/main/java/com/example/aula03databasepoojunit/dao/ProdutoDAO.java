package com.example.aula03databasepoojunit.dao;

import android.database.sqlite.SQLiteDatabase;
import com.example.aula03databasepoojunit.database.DatabaseHelper;
import com.example.aula03databasepoojunit.model.Produto;
import java.util.List;

public class ProdutoDAO {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    //Métodos CRUD
    private void open() {
    }

    private void close() {
    }

    //Construtor Padrão
    public ProdutoDAO() {
    }

    //CREATE - INSERIR UM NOVO REGISTRO (Produto)
    public long insert(Produto produto) {
        return 0;
    }

    //READ - LISTAR TODOS OS REGISTROS (Protudo)
    public List<Produto> getAll() {
        return null;
    }

    //UPDATE - ATUALIZAR UM REGISTRO EXISTENTE
    public int update(Produto endereco) {
        return 0;
    }

    //DELETE - EXCLUIR UM REGISTRO PELO ID (Produto)
    public int delete(long id) {
        return 0;
    }

    //DELETAR TODOS OS REGISTROS
    public int deleteAll() {
        return 0;
    }

    //CONTAR TODOS OS REGISTROS
    public int getCount() {
        return 0;
    }

    public Produto getProduto(long id) {
        return null;
    }

    public List<Produto> getByDescricao(String descricao) {
        return null;
    }

    //JOINS - JUNÇÃO DE TABELAS
    public List<Produto> getAllWithFornecedor() {
        return null;
    }
    public List<Produto> getEmEstoque() {
        return null;
    }
    private Produto cursorToProduto(android.database.Cursor cursor) {
        return null;
    }


}
