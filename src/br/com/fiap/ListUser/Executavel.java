package br.com.fiap.ListUser;

import java.util.*;

public class Executavel {
	public static void main(String Args[]) {
		Usuario luiz = new Usuario("luiz","nha",1);
		Usuario delfino = new Usuario("lucas","nha",2);
		Usuario bruno = new Usuario("bruno","nha",3);
		Usuario daivinho = new Usuario("litle david","nha",4);
		Usuario arthur = new Usuario("arthur","nha",5);
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(luiz);
		lista.add(delfino);
		lista.add(bruno);
		lista.add(daivinho);
		lista.add(arthur);
		
		Collections.sort(lista);
		
		for(Usuario nome:lista) {
			
			System.out.println("Nome: "+nome.getNome()+"  Senha: "+nome.getSenha());
		}
	}
}
