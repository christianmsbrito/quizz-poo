
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Database {
    
    private static ArrayList<User> users;
    private static ArrayList<Question> questions;

    public static ArrayList<Question> getQuizMatematica(){
      ArrayList<Question> quiz = new ArrayList<>();
      quiz.add(new Question("Qual a capital de São Paulo?", "3", new String[]{"São Pedro","São Bastos","São Paulo"}));
      quiz.add(new Question("Complete a frase: 'O rato roeu...'", "1", new String[]{"'A roupa do rei de Roma.'","'e morreu.'","'mas sobrevive com a ajuda de aparelhos.'"}));
      quiz.add(new Question("Qual a capital da Bahia?", "2", new String[]{"Salvador","Belém","Salvadeiro"}));
      quiz.add(new Question("Quantos ossos o corpo humano adulto possui?", "3", new String[]{"328","404","206"}));
      quiz.add(new Question("Quantos dedos um humano normal possui em cada mão?", "3", new String[]{"3","4","5"}));
      quiz.add(new Question("Qual dessas cores é primária?", "3", new String[]{"Roxo","Dourada","Azul"}));
      quiz.add(new Question("Qual animal anda de quatro patas?", "3", new String[]{"Humano","Pato","Ornitorrínco"}));
      quiz.add(new Question("Se você fosse um paladino, o que faria?", "3", new String[]{"Caçar","Nadar","Recuperar a Terra Santa"}));
      quiz.add(new Question("Qual animal é ovíparo?", "3", new String[]{"Elefante","Cachorro","Ornitorrinco"}));
      quiz.add(new Question("Qual animal é um mamífero?", "3", new String[]{"Cobra","Lagarto","Ornitorrínco"}));
      return quiz;
    }
    
    public static void insertUser(User user) {
        users.add(user);
    }
}
