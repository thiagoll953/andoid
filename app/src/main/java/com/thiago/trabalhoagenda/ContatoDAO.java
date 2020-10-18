package com.thiago.trabalhoagenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ContatoDAO {  //classe que faz o meio de campo do banco com a classe contato. tudo que tiver contato com banco parte dessa classe

    public static void inserir(Context context, Contato contato){ //metodo inserir no banco, chamando a classe contato

        ContentValues valores = new ContentValues();
        valores.put( "nome" , contato.getNome() );            //biblioteca de dados que serão inseridos no banco
        valores.put( "telefone" , contato.getTelefone() );
        valores.put( "email" , contato.getEmail() );

        Banco banco = new Banco(context);                 //objeto tpo banco, context passa a referencia da tela Contato que será executado, nesse caso o formulário Contatos
        SQLiteDatabase db = banco.getWritableDatabase();  //lendo o banco

        db.insert("contatos", null, valores); //inserir passa 3 parametros, nome da tebela, content vales sem valor, null, valores que serão inseridos ContentValues valores = new ContentValues()
    }

    public static void editar(Context context, Contato contato){ //metodo editar

        ContentValues valores = new ContentValues();
        valores.put( "nome",contato.getNome() );            //biblioteca de dados que serão trocados
        valores.put( "telefone", contato.getTelefone() );
        valores.put( "email", contato.getEmail() );

        Banco banco = new Banco(context);                //objeto tpo banco, context passa a referencia da tela Contato que será executado, nesse caso o formulário Contatos
        SQLiteDatabase db = banco.getWritableDatabase(); //lendo o banco

        db.update("contatos",valores, " id = " + contato.getId(), null); //passa a tebela, os "valores", clausula whare e array de clausula whare
    }

    pu


}
