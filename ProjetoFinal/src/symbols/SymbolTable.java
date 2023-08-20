package symbols;

import java.util.HashMap;

public class SymbolTable {
	
	private HashMap<String, Identifier> symbols; // mapa rash de string e identifier (o que na aula ele chama de symbol)
	
	// construtor
	public SymbolTable() {
		this.symbols = new HashMap<String, Identifier>();
	}	
	
	// get símbolo
	public Identifier get(String key) {
		return this.symbols.get(key);
	}
	
	// adiciona símbolos no mapa
	public void add(String key, Identifier id) {
		this.symbols.put(key, id);
	}
	
	//busca no map hash se o símbolo existe ou não
	public boolean exists(String key) {
		return this.symbols.containsKey(key);
	}

	public HashMap<String, Identifier> getSymbols() {
		return symbols;
	}

	public void setSymbols(HashMap<String, Identifier> symbols) {
		this.symbols = symbols;
	}
	
}
