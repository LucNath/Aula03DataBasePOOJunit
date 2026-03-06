package com.example.aula03databasepoojunit.database;

public class DatabaseHelper {

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







}
