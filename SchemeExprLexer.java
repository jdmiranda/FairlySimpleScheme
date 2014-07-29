// Generated from SchemeExpr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, DEF=5, IF=6, PRINT=7, WHILE=8, BEGIN=9, 
		LET=10, BOOLEAN=11, DOUBLE=12, ID=13, WS=14, PLUS=15, MINUS=16, MUL=17, 
		DIV=18, EQ=19, GT=20, LT=21, AND=22, OR=23, NOT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "'['", "'('", "'def'", "'if'", "'print'", "'while'", "'begin'", 
		"'let'", "BOOLEAN", "DOUBLE", "ID", "WS", "'+'", "'-'", "'*'", "'/'", 
		"'='", "'>'", "'<'", "'&'", "'|'", "'!'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "DEF", "IF", "PRINT", "WHILE", "BEGIN", 
		"LET", "BOOLEAN", "DIGIT", "LETTER", "DOUBLE", "ID", "WS", "PLUS", "MINUS", 
		"MUL", "DIV", "EQ", "GT", "LT", "AND", "OR", "NOT"
	};


	public SchemeExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SchemeExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\ff\n\f\3\r\3\r\3\16\3\16\3\17\5\17m\n\17\3\17\6\17p\n\17\r\17\16"+
		"\17q\3\17\3\17\7\17v\n\17\f\17\16\17y\13\17\5\17{\n\17\3\20\3\20\3\20"+
		"\7\20\u0080\n\20\f\20\16\20\u0083\13\20\3\21\6\21\u0086\n\21\r\21\16\21"+
		"\u0087\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2"+
		"\2\13?\3\2\2\2\rC\3\2\2\2\17F\3\2\2\2\21L\3\2\2\2\23R\3\2\2\2\25X\3\2"+
		"\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37|\3\2\2\2!\u0085"+
		"\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2"+
		"+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u009b"+
		"\3\2\2\2\65\u009d\3\2\2\2\678\7_\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<"+
		"\7]\2\2<\b\3\2\2\2=>\7*\2\2>\n\3\2\2\2?@\7f\2\2@A\7g\2\2AB\7h\2\2B\f\3"+
		"\2\2\2CD\7k\2\2DE\7h\2\2E\16\3\2\2\2FG\7r\2\2GH\7t\2\2HI\7k\2\2IJ\7p\2"+
		"\2JK\7v\2\2K\20\3\2\2\2LM\7y\2\2MN\7j\2\2NO\7k\2\2OP\7n\2\2PQ\7g\2\2Q"+
		"\22\3\2\2\2RS\7d\2\2ST\7g\2\2TU\7i\2\2UV\7k\2\2VW\7p\2\2W\24\3\2\2\2X"+
		"Y\7n\2\2YZ\7g\2\2Z[\7v\2\2[\26\3\2\2\2\\]\7v\2\2]^\7t\2\2^_\7w\2\2_f\7"+
		"g\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2df\7g\2\2e\\\3\2\2\2e`\3\2\2"+
		"\2f\30\3\2\2\2gh\t\2\2\2h\32\3\2\2\2ij\t\3\2\2j\34\3\2\2\2km\7/\2\2lk"+
		"\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\31\r\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2rz\3\2\2\2sw\7\60\2\2tv\5\31\r\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zs\3\2\2\2z{\3\2\2\2{\36\3\2\2\2|\u0081"+
		"\5\33\16\2}\u0080\5\33\16\2~\u0080\5\31\r\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082 \3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\b\21\2\2\u008a\"\3\2\2\2\u008b\u008c\7-\2\2\u008c$\3"+
		"\2\2\2\u008d\u008e\7/\2\2\u008e&\3\2\2\2\u008f\u0090\7,\2\2\u0090(\3\2"+
		"\2\2\u0091\u0092\7\61\2\2\u0092*\3\2\2\2\u0093\u0094\7?\2\2\u0094,\3\2"+
		"\2\2\u0095\u0096\7@\2\2\u0096.\3\2\2\2\u0097\u0098\7>\2\2\u0098\60\3\2"+
		"\2\2\u0099\u009a\7(\2\2\u009a\62\3\2\2\2\u009b\u009c\7~\2\2\u009c\64\3"+
		"\2\2\2\u009d\u009e\7#\2\2\u009e\66\3\2\2\2\13\2elqwz\177\u0081\u0087\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}