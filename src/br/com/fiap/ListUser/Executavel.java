package br.com.fiap.ListUser;

import java.util.*;

public class Executavel {
	public static void main(String Args[]) {
		Usuario luiz = new Usuario("luiz","nha",1);
		Usuario delfino = new Usuario("lucas","nha",2);
		Usuario bruno = new Usuario("bruno","nha",3);
		Usuario daivinho = new Usuario("litle david","nha",4);
		Usuario arthur = new Usuario("arthur","nha",5);
		
		Map mapa = new HashMap();
		
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(luiz);
		lista.add(delfino);
		lista.add(bruno);
		lista.add(daivinho);
		lista.add(arthur);
		
		Collections.sort(lista);
		
		for(Usuario usuario:lista) {
			mapa.put(usuario.getNome(), usuario);
		}
		
		getObjeto(mapa,"bruno");
	}
	public static void getObjeto(Map mapa, String chave) {
		
		for(: mapa.containsKey(null)){
			
			
		}
		Object objeto = mapa.get(chave);
		Usuario user = (Usuario) objeto;
		List<Usuario> lista2 = new ArrayList<Usuario>();
		lista2.add(user);
		
		for(Usuario uuser :lista2) {
			System.out.println(uuser.getIdUser());
		}
		
	}
}
