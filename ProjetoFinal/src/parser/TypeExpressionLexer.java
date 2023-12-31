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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		TEXT=17, ATTR=18, SUM=19, SUB=20, OPREL=21, ID=22, VIRG=23, PF=24, AP=25, 
		FP=26, BLANK=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUMBER", "TEXT", 
		"ATTR", "SUM", "SUB", "OPREL", "ID", "VIRG", "PF", "AP", "FP", "BLANK"
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


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\6\21\u00aa\n\21\r\21\16\21\u00ab\3\21\3\21\6\21\u00b0"+
		"\n\21\r\21\16\21\u00b1\5\21\u00b4\n\21\3\22\3\22\7\22\u00b8\n\22\f\22"+
		"\16\22\u00bb\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d0\n\26\3\27\3\27"+
		"\7\27\u00d4\n\27\f\27\16\27\u00d7\13\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\35\3\2\7\3\2\62;\b\2\13\13\"#//\62;C\\c|\3\2"+
		"c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5B\3\2\2\2\7J\3\2\2\2\tR\3\2\2\2"+
		"\13W\3\2\2\2\r\\\3\2\2\2\17a\3\2\2\2\21j\3\2\2\2\23z\3\2\2\2\25\u0086"+
		"\3\2\2\2\27\u0089\3\2\2\2\31\u008f\3\2\2\2\33\u0095\3\2\2\2\35\u009b\3"+
		"\2\2\2\37\u00a0\3\2\2\2!\u00a9\3\2\2\2#\u00b5\3\2\2\2%\u00be\3\2\2\2\'"+
		"\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d8\3\2"+
		"\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2"+
		"\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7i\2\2=>\7t\2\2>?\7c\2\2?@\7o\2\2@A\7"+
		"c\2\2A\4\3\2\2\2BC\7h\2\2CD\7k\2\2DE\7o\2\2EF\7r\2\2FG\7t\2\2GH\7q\2\2"+
		"HI\7i\2\2I\6\3\2\2\2JK\7K\2\2KL\7P\2\2LM\7V\2\2MN\7G\2\2NO\7I\2\2OP\7"+
		"G\2\2PQ\7T\2\2Q\b\3\2\2\2RS\7T\2\2ST\7G\2\2TU\7C\2\2UV\7N\2\2V\n\3\2\2"+
		"\2WX\7V\2\2XY\7G\2\2YZ\7Z\2\2Z[\7V\2\2[\f\3\2\2\2\\]\7h\2\2]^\7c\2\2^"+
		"_\7e\2\2_`\7c\2\2`\16\3\2\2\2ab\7g\2\2bc\7p\2\2cd\7s\2\2de\7w\2\2ef\7"+
		"c\2\2fg\7p\2\2gh\7v\2\2hi\7q\2\2i\20\3\2\2\2jk\7h\2\2kl\7k\2\2lm\7o\2"+
		"\2mn\7h\2\2no\7c\2\2op\7e\2\2pq\7c\2\2qr\7g\2\2rs\7p\2\2st\7s\2\2tu\7"+
		"w\2\2uv\7c\2\2vw\7p\2\2wx\7v\2\2xy\7q\2\2y\22\3\2\2\2z{\7h\2\2{|\7k\2"+
		"\2|}\7o\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7s\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2"+
		"\u0085\24\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\26\3\2\2"+
		"\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7q\2\2\u008e\30\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7p\2\2\u0092\u0093\7c\2\2\u0093\u0094\7q\2\2\u0094"+
		"\32\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7k\2\2\u0097\u0098\7o\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\34\3\2\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7k\2\2\u009e\u009f\7c\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7t\2\2"+
		"\u00a4\u00a5\7g\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7c\2\2\u00a7 \3\2\2"+
		"\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af\7\60\2\2"+
		"\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\"\3\2\2\2\u00b5\u00b9\7$\2\2\u00b6\u00b8\t\3\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd"+
		"$\3\2\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0\7?\2\2\u00c0&\3\2\2\2\u00c1\u00c2"+
		"\7-\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4*\3\2\2\2\u00c5\u00d0\7"+
		"@\2\2\u00c6\u00c7\7@\2\2\u00c7\u00d0\7?\2\2\u00c8\u00d0\7>\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca\u00d0\7?\2\2\u00cb\u00cc\7?\2\2\u00cc\u00d0\7?\2\2\u00cd"+
		"\u00ce\7>\2\2\u00ce\u00d0\7@\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2"+
		"\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0,\3\2\2\2\u00d1\u00d5\t\4\2\2\u00d2\u00d4\t\5\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6.\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\60\3"+
		"\2\2\2\u00da\u00db\7\60\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd"+
		"\64\3\2\2\2\u00de\u00df\7+\2\2\u00df\66\3\2\2\2\u00e0\u00e1\t\6\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\b\34\2\2\u00e38\3\2\2\2\13\2\u00ab\u00b1\u00b3"+
		"\u00b7\u00b9\u00cf\u00d3\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}