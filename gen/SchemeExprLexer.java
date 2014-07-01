// Generated from /Users/jeremymiranda/IdeaProjects/untitled3/SchemeExpr.g4 by ANTLR 4.x
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
		T__1=1, T__0=2, RATOR=3, ARITHMETIC=4, RELATIONAL=5, BOOLEAN=6, DEF=7, 
		IF=8, ID=9, DOUBLE=10, WS=11, PLUS=12, MINUS=13, MUL=14, DIV=15, EQUAL=16, 
		GREATER=17, LESSER=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "RATOR", "ARITHMETIC", "RELATIONAL", "BOOLEAN", "DEF", 
		"IF", "DIGIT", "LETTER", "UNDERSCORE", "ID", "DOUBLE", "WS", "PLUS", "MINUS", 
		"MUL", "DIV", "EQUAL", "GREATER", "LESSER", "AND", "OR", "NOT", "TRUE", 
		"FALSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4?\n\4\3\5\3\5"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\rd\n\r\f\r\16\rg\13\r\3\16\5\16j\n\16\3\16\6\16m\n\16\r\16\16\16n\3\16"+
		"\3\16\7\16s\n\16\f\16\16\16v\13\16\5\16x\n\16\3\17\6\17{\n\17\r\17\16"+
		"\17|\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\2\25\2\27\2\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00ae"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3\67\3\2\2\2\59\3\2\2\2\7>\3\2\2\2\tD\3\2\2\2\13I\3\2\2\2\rP\3\2\2"+
		"\2\17R\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2"+
		"\2\2\33i\3\2\2\2\35z\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3"+
		"\2\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2\2\65\u0099\3\2"+
		"\2\2\678\7+\2\28\4\3\2\2\29:\7*\2\2:\6\3\2\2\2;?\5\t\5\2<?\5\13\6\2=?"+
		"\5\r\7\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\b\3\2\2\2@E\5\37\20\2AE\5!\21"+
		"\2BE\5#\22\2CE\5%\23\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\n\3\2"+
		"\2\2FJ\5\'\24\2GJ\5)\25\2HJ\5+\26\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\f\3"+
		"\2\2\2KQ\5\63\32\2LQ\5\65\33\2MQ\5-\27\2NQ\5/\30\2OQ\5\61\31\2PK\3\2\2"+
		"\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\16\3\2\2\2RS\7f\2\2ST\7g\2"+
		"\2TU\7h\2\2U\20\3\2\2\2VW\7k\2\2WX\7h\2\2X\22\3\2\2\2YZ\t\2\2\2Z\24\3"+
		"\2\2\2[\\\t\3\2\2\\\26\3\2\2\2]^\7a\2\2^\30\3\2\2\2_e\5\25\13\2`d\5\25"+
		"\13\2ad\5\23\n\2bd\5\27\f\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2f\32\3\2\2\2ge\3\2\2\2hj\7/\2\2ih\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2km\5\23\n\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ow\3\2\2"+
		"\2pt\7\60\2\2qs\5\23\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2wp\3\2\2\2wx\3\2\2\2x\34\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\17\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7-\2\2\u0081 \3\2\2\2\u0082\u0083\7/\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7,\2\2\u0085$\3\2\2\2\u0086\u0087\7\61\2\2\u0087&\3\2\2\2\u0088"+
		"\u0089\7?\2\2\u0089(\3\2\2\2\u008a\u008b\7@\2\2\u008b*\3\2\2\2\u008c\u008d"+
		"\7>\2\2\u008d,\3\2\2\2\u008e\u008f\7(\2\2\u008f.\3\2\2\2\u0090\u0091\7"+
		"~\2\2\u0091\60\3\2\2\2\u0092\u0093\7#\2\2\u0093\62\3\2\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097\u0098\7g\2\2\u0098"+
		"\64\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\66\3\2\2\2\16\2>DIPceintw|\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}