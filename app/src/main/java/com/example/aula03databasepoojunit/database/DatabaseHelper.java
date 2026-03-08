package com.example.aula03databasepoojunit.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "AppAula03.db";
    private static final int DATABASE_VERSION = 1;

    //Tabela Endereços
    public static final String TABLE_ENDERECO = "endereco";
    public static final String COLUMN_ENDERECO_ID = "id";
    public static final String COLUMN_ENDERECO_ENDERECO = "endereco";
    public static final String COLUMN_ENDERECO_CIDADE = "cidade";
    public static final String COLUMN_ENDERECO_ESTADO = "estado";

    //Tabela Fornecedores
    public static final String TABLE_FORNECEDOR = "fornecedor";
    public static final String COLUMN_FORNECEDOR_ID = "id";
    public static final String COLUMN_FORNECEDOR_NOME = "nome";
    public static final String COLUMN_FORNECEDOR_CONTATO = "contato";
    public static final String COLUMN_FORNECEDOR_ENDERECO_ID = "endereco_id";

    //Tabela Produtos
    public static final String TABLE_PRODUTO = "produto";
    public static final String COLUMN_PRODUTO_ID = "id";
    public static final String COLUMN_PRODUTO_DESCRICAO = "descricao";
    public static final String COLUMN_PRODUTO_UNIDADE = "unidade";
    public static final String COLUMN_PRODUTO_QUANTIDADE = "quantidade";
    public static final String COLUMN_PRODUTO_VALOR = "valor";
    public static final String COLUMN_PRODUTO_ESTOQUE = "estoque";

    //Tabela de relacionamento entre Fornecedores e Produtos
    public static final String TABLE_FORNECEDOR_PRODUTO = "fornecedor_produto";
    public static final String COLUMN_FORNECEDOR_PRODUTO_FORNECEDOR_ID = "fornecedor_id";
    public static final String COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID = "produto_id";

    private static final String CREATE_TABLE_ENDERECO = "CREATE TABLE " + TABLE_ENDERECO + "(" +
            COLUMN_ENDERECO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_ENDERECO_ENDERECO + " TEXT, " +
            COLUMN_ENDERECO_CIDADE + " TEXT, " +
            COLUMN_ENDERECO_ESTADO + " TEXT" +
            ")";

    public static final String CREATE_TABLE_FORNECEDOR = "CREATE TABLE " + TABLE_FORNECEDOR + "(" +
            COLUMN_FORNECEDOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_FORNECEDOR_NOME + " TEXT, " +
            COLUMN_FORNECEDOR_CONTATO + " TEXT, " +
            COLUMN_FORNECEDOR_ENDERECO_ID + " INTEGER, " +
            "FOREIGN KEY (" + COLUMN_FORNECEDOR_ENDERECO_ID + ") REFERENCES " + TABLE_ENDERECO + "(" + COLUMN_ENDERECO_ID + ")" +
            ")";

    public static final String CREATE_TABLE_PRODUTO = "CREATE TABLE " + TABLE_PRODUTO + "(" +
            COLUMN_PRODUTO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_PRODUTO_DESCRICAO + " TEXT, " +
            COLUMN_PRODUTO_UNIDADE + " TEXT, " +
            COLUMN_PRODUTO_QUANTIDADE + " REAL, " +
            COLUMN_PRODUTO_VALOR + " REAL, " +
            COLUMN_PRODUTO_ESTOQUE + " INTEGER, " +
            "FOREIGN KEY (" + COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID + ") REFERENCES " + TABLE_FORNECEDOR + "(" + COLUMN_FORNECEDOR_ID + ")" +
            ")";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}