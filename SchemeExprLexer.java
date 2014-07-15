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
		T__1=1, T__0=2, DEF=3, IF=4, PRINT=5, WHILE=6, BEGIN=7, BOOLEAN=8, DOUBLE=9, 
		ID=10, WS=11, PLUS=12, MINUS=13, MUL=14, DIV=15, EQ=16, GT=17, LT=18, 
		AND=19, OR=20, NOT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'def'", "'if'", "'print'", "'while'", "'begin'", "BOOLEAN", 
		"DOUBLE", "ID", "WS", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", 
		"'&'", "'|'", "'!'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "DEF", "IF", "PRINT", "WHILE", "BEGIN", "BOOLEAN", "DIGIT", 
		"LETTER", "DOUBLE", "ID", "WS", "PLUS", "MINUS", "MUL", "DIV", "EQ", "GT", 
		"LT", "AND", "OR", "NOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tX\n\t\3\n\3\n\3\13\3\13\3\f\5\f_\n\f\3\f\6\fb\n\f\r\f\16\f"+
		"c\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\5\fm\n\f\3\r\3\r\3\r\7\rr\n\r\f\r\16"+
		"\ru\13\r\3\16\6\16x\n\16\r\16\16\16y\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\3\2\5\3\2\62;\4\2C\\c"+
		"|\5\2\13\f\17\17\"\"\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\rB\3\2"+
		"\2\2\17H\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27^\3\2\2\2\31n\3"+
		"\2\2\2\33w\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3"+
		"\2\2\2%\u0085\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d"+
		"\3\2\2\2/\u008f\3\2\2\2\61\62\7+\2\2\62\4\3\2\2\2\63\64\7*\2\2\64\6\3"+
		"\2\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7h\2\28\b\3\2\2\29:\7k\2\2:;\7h\2"+
		"\2;\n\3\2\2\2<=\7r\2\2=>\7t\2\2>?\7k\2\2?@\7p\2\2@A\7v\2\2A\f\3\2\2\2"+
		"BC\7y\2\2CD\7j\2\2DE\7k\2\2EF\7n\2\2FG\7g\2\2G\16\3\2\2\2HI\7d\2\2IJ\7"+
		"g\2\2JK\7i\2\2KL\7k\2\2LM\7p\2\2M\20\3\2\2\2NO\7v\2\2OP\7t\2\2PQ\7w\2"+
		"\2QX\7g\2\2RS\7h\2\2ST\7c\2\2TU\7n\2\2UV\7u\2\2VX\7g\2\2WN\3\2\2\2WR\3"+
		"\2\2\2X\22\3\2\2\2YZ\t\2\2\2Z\24\3\2\2\2[\\\t\3\2\2\\\26\3\2\2\2]_\7/"+
		"\2\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\23\n\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2dl\3\2\2\2ei\7\60\2\2fh\5\23\n\2gf\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2le\3\2\2\2lm\3\2\2\2m\30\3\2\2"+
		"\2ns\5\25\13\2or\5\25\13\2pr\5\23\n\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq"+
		"\3\2\2\2st\3\2\2\2t\32\3\2\2\2us\3\2\2\2vx\t\4\2\2wv\3\2\2\2xy\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\16\2\2|\34\3\2\2\2}~\7-\2\2~\36\3\2"+
		"\2\2\177\u0080\7/\2\2\u0080 \3\2\2\2\u0081\u0082\7,\2\2\u0082\"\3\2\2"+
		"\2\u0083\u0084\7\61\2\2\u0084$\3\2\2\2\u0085\u0086\7?\2\2\u0086&\3\2\2"+
		"\2\u0087\u0088\7@\2\2\u0088(\3\2\2\2\u0089\u008a\7>\2\2\u008a*\3\2\2\2"+
		"\u008b\u008c\7(\2\2\u008c,\3\2\2\2\u008d\u008e\7~\2\2\u008e.\3\2\2\2\u008f"+
		"\u0090\7#\2\2\u0090\60\3\2\2\2\13\2W^cilqsy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}