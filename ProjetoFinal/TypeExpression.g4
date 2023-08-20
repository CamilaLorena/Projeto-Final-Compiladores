grammar TypeExpression;

@header{
	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	import java.util.HashMap;
	import javax.swing.JOptionPane;
}

@members{
	private SymbolTable symbolTable = new SymbolTable();
	private DataType currentType;
	private AbstractExpression expression;
	private char operator;
	private DataType leftDT;
	private DataType rightDT;
	private String   idAtribuido;
	private String   text;
	private Program  program = new Program();
	private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
	
	public void init(){
		program.setSymbolTable(symbolTable);
		stack.push(new ArrayList<AbstractCommand>());
	}
		
	public void exibirID(){
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void generateObjectCode(){
		program.generateTarget();
	}
	
	public void runInterpreter(){
		program.run();
	}
}
programa  : 'programa' decl+ cmd+ 'fimprog'{
			program.setComandos(stack.pop());
			for (String chave : symbolTable.getSymbols().keySet()){
				Identifier id = symbolTable.get(chave);
				if (!id.getUtl()){
					JOptionPane.showMessageDialog(null, "WARNING! Variável " + chave +" foi declarada, mas seu valor não foi definido!");
					//System.out.println("WARNING! Variável " + chave +" foi declarada, mas seu valor não foi definido!");
				}
			}
		}
		;
		  
decl	  : tipo lista_var PF
		  ;
		 
tipo	  : 'INTEGER' { currentType = DataType.INTEGER; }
          | 'REAL'    { currentType = DataType.REAL; }
          |'TEXT'	  {currentType = DataType.TEXT;}
          ;
         
lista_var : 
			// adicionado lógica para verificar se o simbolo já foi declarado
			ID { 
					if (!symbolTable.exists(_input.LT(-1).getText())){
							symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
					}
					else {
						throw new RuntimeException("Semantic ERROR - Symbol "+_input.LT(-1).getText()+" already declared");
					}
				} 
           (VIRG 
           	ID { 
           	
           			if (!symbolTable.exists(_input.LT(-1).getText())){
							symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
					}
					else {
						//throw new RuntimeException("Semantic ERROR - Symbol already declared");
						throw new RuntimeException("Semantic ERROR - Symbol "+_input.LT(-1).getText()+" already declared");
						
					} 	
           	}
           )*
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile | cmdDoWhile
			
		  ;
		  

cmdDoWhile     : 'faca' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdDoWhile _cmdDoWhile = new CmdDoWhile();
			} cmd+ {
				_cmdDoWhile.setListaTrue(stack.pop());
					
			}
			'enquanto'
			 AP 
			 expr{
				_relExpr.setLeftSide(expression);
				//JOptionPane.showMessageDialog(null, _relExpr.getLeftSide());
			} 
			OPREL{
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			}
			expr {
				_relExpr.setRightSide(expression);
				_cmdDoWhile.setExpr(_relExpr);
				
			} FP 
			'fimfacaenquanto' PF {
				//_cmdDoWhile.setListaFalse(stack.pop());
				stack.peek().add(_cmdDoWhile);
			}
		  ;
		  
cmdWhile     : 'enquanto'{
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdWhile _cmdWhile = new CmdWhile();
			}
			 AP expr{
				_relExpr.setLeftSide(expression);
				//JOptionPane.showMessageDialog(null, _relExpr.getLeftSide());
			} 
			OPREL{
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			}
			expr {
				_relExpr.setRightSide(expression);
				_cmdWhile.setExpr(_relExpr);
				
			} FP cmd+ {
				_cmdWhile.setListaTrue(stack.pop());
					
			}
			'fimenquanto' PF {
				//_cmdWhile.setListaFalse(stack.pop());
				stack.peek().add(_cmdWhile);
			}
		  ;
		  
cmdIf     : 'se' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdIf _cmdIf = new CmdIf();
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdIf.setExpr(_relExpr);
				
			} FP 'entao'  cmd+  
			{
				_cmdIf.setListaTrue(stack.pop());
					
			}
			('senao' {
				stack.push(new ArrayList<AbstractCommand>());
			}
			cmd+)? 
			
			'fimse' PF {
				_cmdIf.setListaFalse(stack.pop());
				stack.peek().add(_cmdIf);
			}		 
		  ; 
		  
cmdRead   : 'leia' AP ID {
				// id do tipo Identifier é o id que está na tabela de símbolos, se não estiver, retorno excessão
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id == null){
					throw new RuntimeException("Undeclared Variable");
				}
				// Instancio a Classe Cmd_Read do pacote ast, linha 10
				CmdRead _read = new CmdRead(id);
				stack.peek().add(_read);
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Undeclared Variable");	         		
	         	}
	         	CmdWrite _write = new CmdWrite(id);
	         	stack.peek().add(_write);
	         } 
	         | 
	         TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
             ) FP PF
          ;		      		  
   		  
cmdAttr   : ID {
				idAtribuido = _input.LT(-1).getText();
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR- Undeclared Identifier: " + _input.LT(-1).getText());
				}
				leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				rightDT = null;
			}
         	ATTR expr PF
				{
					// logica para atribuir o valor da expressao no identificador
					Identifier id = symbolTable.get(idAtribuido);
					id.setValue(expression.eval());
					id.setUtl(true);
					symbolTable.add(idAtribuido, id);
					
					//System.out.println("EVAL ("+expression+") = "+expression.eval());
					
					CmdAttrib _attr = new CmdAttrib(id, expression);
					stack.peek().add(_attr);
					expression = null;					
				}
		  ;   		  
		  
expr	  : termo exprl*
          ;
          
termo     : NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
				
			}
		  |
			ID {
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
				}
				rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}					
				
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id.getValue() != null){
					expression = new NumberExpression(id.getValue());
				}
				else{
					throw new RuntimeException("Semantic ERROR - Unassigned variable: "+_input.LT(-1).getText());
					// id usado sem ter valor inicial
				}
			}
		  ;
		  
exprl     : (SUM | SUB) { 
				operator = _input.LT(-1).getText().charAt(0);
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
			} 
			termo
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
				
			}
          ;		         
		  
NUMBER	  : [0-9]+ ('.'[0-9]+)?
		  ;
		  
TEXT 	  : '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '<>'
 		  ;          
   		  
ID		  : [a-z] ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	      
BLANK     : (' '| '\t' | '\n' | '\r') -> skip // se encontrar um espaço em branco ele pula
          ;                                 		             		 		 