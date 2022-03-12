package PortoSeguro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> minhaLista = new ArrayList<Integer>();//criação do List
		
		//inserção dos elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		
		//vou percorrer todos os elementos da minhaLista
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();//sem nada entre parênteses para limpar o cash de memória
		
		minhaLista.remove(0);//"remove" serve para deletar um elemento da minhaLista
		
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		int primeiroElemento = minhaLista.get(0);//O "get" vai pegar um elemento da minhaLista através do seu índice
		System.out.println("\nO primeiro elemento da minhaLista é:"+primeiroElemento);
		System.out.println();//sem nada entre parênteses para limpar o cash de memória
		
		for(int i=0;i<minhaLista.size();i++)//O "size" vai verificar o tamanho da minhaLista
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);//O "sort" vai ordenar os elementos da minhaLista em ordem crescente 
		System.out.println("\nDepois de ordenada a minhaLista temos: ");
		System.out.println(minhaLista);
		
		System.out.println();//sem nada entre parênteses para limpar o cash de memória
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
		
	}

}