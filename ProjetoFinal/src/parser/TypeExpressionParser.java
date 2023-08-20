// Generated from TypeExpression.g4 by ANTLR 4.7.1
package parser;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		TEXT=17, ATTR=18, SUM=19, SUB=20, OPREL=21, ID=22, VIRG=23, PF=24, AP=25, 
		FP=26, BLANK=27;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_tipo = 2, RULE_lista_var = 3, RULE_cmd = 4, 
		RULE_cmdDoWhile = 5, RULE_cmdWhile = 6, RULE_cmdIf = 7, RULE_cmdRead = 8, 
		RULE_cmdWrite = 9, RULE_cmdAttr = 10, RULE_expr = 11, RULE_termo = 12, 
		RULE_exprl = 13;
	public static final String[] ruleNames = {
		"programa", "decl", "tipo", "lista_var", "cmd", "cmdDoWhile", "cmdWhile", 
		"cmdIf", "cmdRead", "cmdWrite", "cmdAttr", "expr", "termo", "exprl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'INTEGER'", "'REAL'", "'TEXT'", "'faca'", 
		"'enquanto'", "'fimfacaenquanto'", "'fimenquanto'", "'se'", "'entao'", 
		"'senao'", "'fimse'", "'leia'", "'escreva'", null, null, "':='", "'+'", 
		"'-'", null, null, "','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "OPREL", 
		"ID", "VIRG", "PF", "AP", "FP", "BLANK"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public TypeExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				decl();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				cmd();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
			setState(39);
			match(T__1);

						program.setComandos(stack.pop());
						for (String chave : symbolTable.getSymbols().keySet()){
							Identifier id = symbolTable.get(chave);
							if (!id.getUtl()){
								JOptionPane.showMessageDialog(null, "WARNING! Variável " + chave +" foi declarada, mas seu valor não foi definido!");
								//System.out.println("WARNING! Variável " + chave +" foi declarada, mas seu valor não foi definido!");
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			tipo();
			setState(43);
			lista_var();
			setState(44);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__2);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(T__3);
				 currentType = DataType.REAL; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__4);
				currentType = DataType.TEXT;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TypeExpressionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TypeExpressionParser.ID, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TypeExpressionParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(TypeExpressionParser.VIRG, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			 
								if (!symbolTable.exists(_input.LT(-1).getText())){
										symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
								}
								else {
									throw new RuntimeException("Semantic ERROR - Symbol "+_input.LT(-1).getText()+" already declared");
								}
							
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(56);
				match(VIRG);
				setState(57);
				match(ID);
				 
				           	
				           			if (!symbolTable.exists(_input.LT(-1).getText())){
											symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType)); 
									}
									else {
										//throw new RuntimeException("Semantic ERROR - Symbol already declared");
										throw new RuntimeException("Semantic ERROR - Symbol "+_input.LT(-1).getText()+" already declared");
										
									} 	
				           	
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdAttr();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdRead();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				cmdWrite();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				cmdIf();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				cmdWhile();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				cmdDoWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdDoWhile);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__5);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdDoWhile _cmdDoWhile = new CmdDoWhile();
						
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					cmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

							_cmdDoWhile.setListaTrue(stack.pop());
								
						
			setState(80);
			match(T__6);
			setState(81);
			match(AP);
			setState(82);
			expr();

							_relExpr.setLeftSide(expression);
							//JOptionPane.showMessageDialog(null, _relExpr.getLeftSide());
						
			setState(84);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(86);
			expr();

							_relExpr.setRightSide(expression);
							_cmdDoWhile.setExpr(_relExpr);
							
						
			setState(88);
			match(FP);
			setState(89);
			match(T__7);
			setState(90);
			match(PF);

							//_cmdDoWhile.setListaFalse(stack.pop());
							stack.peek().add(_cmdDoWhile);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__6);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdWhile _cmdWhile = new CmdWhile();
						
			setState(95);
			match(AP);
			setState(96);
			expr();

							_relExpr.setLeftSide(expression);
							//JOptionPane.showMessageDialog(null, _relExpr.getLeftSide());
						
			setState(98);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(100);
			expr();

							_relExpr.setRightSide(expression);
							_cmdWhile.setExpr(_relExpr);
							
						
			setState(102);
			match(FP);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				cmd();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );

							_cmdWhile.setListaTrue(stack.pop());
								
						
			setState(109);
			match(T__8);
			setState(110);
			match(PF);

							//_cmdWhile.setListaFalse(stack.pop());
							stack.peek().add(_cmdWhile);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(TypeExpressionParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__9);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();				
							CmdIf _cmdIf = new CmdIf();
						
			setState(115);
			match(AP);
			setState(116);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(118);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
						
			setState(120);
			expr();

							_relExpr.setRightSide(expression);
							_cmdIf.setExpr(_relExpr);
							
						
			setState(122);
			match(FP);
			setState(123);
			match(T__10);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				cmd();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );

							_cmdIf.setListaTrue(stack.pop());
								
						
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(130);
				match(T__11);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					cmd();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
				}
			}

			setState(139);
			match(T__12);
			setState(140);
			match(PF);

							_cmdIf.setListaFalse(stack.pop());
							stack.peek().add(_cmdIf);
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__13);
			setState(144);
			match(AP);
			setState(145);
			match(ID);

							// id do tipo Identifier é o id que está na tabela de símbolos, se não estiver, retorno excessão
							Identifier id = symbolTable.get(_input.LT(-1).getText());
							if (id == null){
								throw new RuntimeException("Undeclared Variable");
							}
							// Instancio a Classe Cmd_Read do pacote ast, linha 10
							CmdRead _read = new CmdRead(id);
							stack.peek().add(_read);
						 
			setState(147);
			match(FP);
			setState(148);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(TypeExpressionParser.AP, 0); }
		public TerminalNode FP() { return getToken(TypeExpressionParser.FP, 0); }
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TypeExpressionParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(151);
			match(AP);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(152);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	CmdWrite _write = new CmdWrite(id);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(154);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			match(FP);
			setState(159);
			match(PF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(TypeExpressionParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PF() { return getToken(TypeExpressionParser.PF, 0); }
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitCmdAttr(this);
		}
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR- Undeclared Identifier: " + _input.LT(-1).getText());
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
						
			setState(163);
			match(ATTR);
			setState(164);
			expr();
			setState(165);
			match(PF);

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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			termo();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUB) {
				{
				{
				setState(169);
				exprl();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TypeExpressionParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TypeExpressionParser.ID, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(NUMBER);

								expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
								
							
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ID);

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
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(TypeExpressionParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(TypeExpressionParser.SUB, 0); }
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeExpressionListener ) ((TypeExpressionListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText().charAt(0);
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
						
			setState(183);
			termo();

							_exprADD.setRightSide(expression);
							expression = _exprADD;
							
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\""+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\6\7N\n\7\r\7\16\7O\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\6\bk\n\b\r\b\16\bl\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0080\n\t\r\t\16\t\u0081\3\t\3"+
		"\t\3\t\3\t\6\t\u0088\n\t\r\t\16\t\u0089\5\t\u008c\n\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009f"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00ad\n\r"+
		"\f\r\16\r\u00b0\13\r\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\25"+
		"\26\2\u00c0\2\36\3\2\2\2\4,\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nH\3\2\2\2"+
		"\fJ\3\2\2\2\16_\3\2\2\2\20s\3\2\2\2\22\u0091\3\2\2\2\24\u0098\3\2\2\2"+
		"\26\u00a3\3\2\2\2\30\u00aa\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36"+
		" \7\3\2\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3"+
		"\2\2\2$&\5\n\6\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2"+
		")*\7\4\2\2*+\b\2\1\2+\3\3\2\2\2,-\5\6\4\2-.\5\b\5\2./\7\32\2\2/\5\3\2"+
		"\2\2\60\61\7\5\2\2\61\67\b\4\1\2\62\63\7\6\2\2\63\67\b\4\1\2\64\65\7\7"+
		"\2\2\65\67\b\4\1\2\66\60\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\67\7\3\2"+
		"\2\289\7\30\2\29?\b\5\1\2:;\7\31\2\2;<\7\30\2\2<>\b\5\1\2=:\3\2\2\2>A"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BI\5\26\f\2CI\5\22\n"+
		"\2DI\5\24\13\2EI\5\20\t\2FI\5\16\b\2GI\5\f\7\2HB\3\2\2\2HC\3\2\2\2HD\3"+
		"\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JK\7\b\2\2KM\b\7\1\2L"+
		"N\5\n\6\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\7\1\2"+
		"RS\7\t\2\2ST\7\33\2\2TU\5\30\r\2UV\b\7\1\2VW\7\27\2\2WX\b\7\1\2XY\5\30"+
		"\r\2YZ\b\7\1\2Z[\7\34\2\2[\\\7\n\2\2\\]\7\32\2\2]^\b\7\1\2^\r\3\2\2\2"+
		"_`\7\t\2\2`a\b\b\1\2ab\7\33\2\2bc\5\30\r\2cd\b\b\1\2de\7\27\2\2ef\b\b"+
		"\1\2fg\5\30\r\2gh\b\b\1\2hj\7\34\2\2ik\5\n\6\2ji\3\2\2\2kl\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\b\1\2op\7\13\2\2pq\7\32\2\2qr\b\b\1\2r"+
		"\17\3\2\2\2st\7\f\2\2tu\b\t\1\2uv\7\33\2\2vw\5\30\r\2wx\b\t\1\2xy\7\27"+
		"\2\2yz\b\t\1\2z{\5\30\r\2{|\b\t\1\2|}\7\34\2\2}\177\7\r\2\2~\u0080\5\n"+
		"\6\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u008b\b\t\1\2\u0084\u0085\7\16\2\2\u0085"+
		"\u0087\b\t\1\2\u0086\u0088\5\n\6\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0084\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\17"+
		"\2\2\u008e\u008f\7\32\2\2\u008f\u0090\b\t\1\2\u0090\21\3\2\2\2\u0091\u0092"+
		"\7\20\2\2\u0092\u0093\7\33\2\2\u0093\u0094\7\30\2\2\u0094\u0095\b\n\1"+
		"\2\u0095\u0096\7\34\2\2\u0096\u0097\7\32\2\2\u0097\23\3\2\2\2\u0098\u0099"+
		"\7\21\2\2\u0099\u009e\7\33\2\2\u009a\u009b\7\30\2\2\u009b\u009f\b\13\1"+
		"\2\u009c\u009d\7\23\2\2\u009d\u009f\b\13\1\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\7"+
		"\32\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\b\f\1\2\u00a5"+
		"\u00a6\7\24\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9"+
		"\b\f\1\2\u00a9\27\3\2\2\2\u00aa\u00ae\5\32\16\2\u00ab\u00ad\5\34\17\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2"+
		"\u00b6\b\16\1\2\u00b3\u00b4\7\30\2\2\u00b4\u00b6\b\16\1\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\t\2\2\2\u00b8"+
		"\u00b9\b\17\1\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\b\17\1\2\u00bb\35\3"+
		"\2\2\2\17\"\'\66?HOl\u0081\u0089\u008b\u009e\u00ae\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}