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
		T__1=1, T__0=2, DEF=3, IF=4, BOOLEAN=5, DOUBLE=6, ID=7, WS=8, PLUS=9, 
		MINUS=10, MUL=11, DIV=12, EQ=13, GT=14, LT=15, AND=16, OR=17, NOT=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "DEF", "IF", "BOOLEAN", "DIGIT", "LETTER", "DOUBLE", "ID", 
		"WS", "PLUS", "MINUS", "MUL", "DIV", "EQ", "GT", "LT", "AND", "OR", "NOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\5\tG\n\t\3\t\6\tJ\n\t\r\t\16\tK\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\5\tU"+
		"\n\t\3\n\3\n\3\n\7\nZ\n\n\f\n\16\n]\13\n\3\13\6\13`\n\13\r\13\16\13a\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\2\17"+
		"\2\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24\3\2"+
		"\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2"+
		"\2\2\7/\3\2\2\2\t\63\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21F\3"+
		"\2\2\2\23V\3\2\2\2\25_\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35"+
		"k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)w\3\2\2"+
		"\2+,\7+\2\2,\4\3\2\2\2-.\7*\2\2.\6\3\2\2\2/\60\7f\2\2\60\61\7g\2\2\61"+
		"\62\7h\2\2\62\b\3\2\2\2\63\64\7k\2\2\64\65\7h\2\2\65\n\3\2\2\2\66\67\7"+
		"v\2\2\678\7t\2\289\7w\2\29@\7g\2\2:;\7h\2\2;<\7c\2\2<=\7n\2\2=>\7u\2\2"+
		">@\7g\2\2?\66\3\2\2\2?:\3\2\2\2@\f\3\2\2\2AB\t\2\2\2B\16\3\2\2\2CD\t\3"+
		"\2\2D\20\3\2\2\2EG\7/\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\5\r\7\2IH\3"+
		"\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LT\3\2\2\2MQ\7\60\2\2NP\5\r\7\2ON"+
		"\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TM\3\2\2\2T"+
		"U\3\2\2\2U\22\3\2\2\2V[\5\17\b\2WZ\5\17\b\2XZ\5\r\7\2YW\3\2\2\2YX\3\2"+
		"\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\24\3\2\2\2][\3\2\2\2^`\t\4\2\2_"+
		"^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\13\2\2d\26\3\2\2"+
		"\2ef\7-\2\2f\30\3\2\2\2gh\7/\2\2h\32\3\2\2\2ij\7,\2\2j\34\3\2\2\2kl\7"+
		"\61\2\2l\36\3\2\2\2mn\7?\2\2n \3\2\2\2op\7@\2\2p\"\3\2\2\2qr\7>\2\2r$"+
		"\3\2\2\2st\7(\2\2t&\3\2\2\2uv\7~\2\2v(\3\2\2\2wx\7#\2\2x*\3\2\2\2\13\2"+
		"?FKQTY[a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}