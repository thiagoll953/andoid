package com.thiago.trabalhoagenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {        //classe de conexão com banco, ela herda SQLiteOpenHelper, classe que nos permite trabalhar com a classe

    private static final String NOME_BANCO = "contatos";
    private static final int VERSAO_BANCO = 1;

    public Banco(Context context){ //metodo construtor da classe Banco que carrega o metodo da classe
        super(context, NOME_BANCO, null, VERSAO_BANCO);  //super estou chamando o metodo construtor da super classe, classe herdada, se passa 4 valores context, ref. aplicação, nome do banco e versão
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {  //metodo que serve para criar uma tabela
        sqLiteDatabase.execSQL( "CREATE TABLE contatos (" +
                                " id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT , " +
                                " nome TEXT NOT NULL , " +
                                " telefone TEXT NOT NULL , " +
                                " email TEXT ) " );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {   //metodo que serve para adicionar novas tabelas, passando as versões

    }
}
