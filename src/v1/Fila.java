package v1;

import java.util.ArrayList;

public class Fila {

	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa p){
		pessoas.add(p);
	}
	
	public void removePessoa(Pessoa p){
		pessoas.remove(p);
	}
	
	public Pessoa proximoFila(){
		Pessoa proximo = null;
		
		// Verifica se a lista de pessoas possui algum valor
		if(pessoas != null)
		{
			// Primeiramente verifica se � idoso
			proximo = verificaIdoso();
			
			// Se n�o for idoso, verifica se � gr�vida
			if(proximo == null)
				proximo = verificaGravida();
			
			// Se n�o for gr�vida, � uma pessoa normal
			if(proximo == null)
				proximo = pessoas.get(0);
		}
		
		return proximo;
	}
	
	public Pessoa verificaGravida(){
		
		for(Pessoa p: pessoas)
		{
			if(p.isGravida())
				return p;
		}
		
		return null;
	}
	
	public Pessoa verificaIdoso(){
		
		for(Pessoa p: pessoas)
		{
			if(p.isIdoso())
				return p;
		}
		
		return null;
	}
}
