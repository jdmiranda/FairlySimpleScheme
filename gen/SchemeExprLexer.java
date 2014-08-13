// Generated from /Users/jeremymiranda/IdeaProjects/untitled3/SchemeExpr.g4 by ANTLR 4.x

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, DEF=5, IF=6, FUN=7, CALL=8, PRINT=9, WHILE=10, 
		BEGIN=11, LET=12, BOOLEAN=13, DOUBLE=14, ID=15, WS=16, PLUS=17, MINUS=18, 
		MUL=19, DIV=20, EQ=21, GT=22, LT=23, AND=24, OR=25, NOT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "DEF", "IF", "FUN", "CALL", "PRINT", "WHILE", 
		"BEGIN", "LET", "BOOLEAN", "DIGIT", "LETTER", "DOUBLE", "ID", "WS", "PLUS", 
		"MINUS", "MUL", "DIV", "EQ", "GT", "LT", "AND", "OR", "NOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16s\n\16\3\17\3\17\3\20\3\20\3\21\5\21z\n\21\3\21\6\21}\n\21\r\21\16"+
		"\21~\3\21\3\21\7\21\u0083\n\21\f\21\16\21\u0086\13\21\5\21\u0088\n\21"+
		"\3\22\3\22\3\22\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3\23\6\23\u0093"+
		"\n\23\r\23\16\23\u0094\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\2\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37"+
		"\2!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34\3\2\5"+
		"\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\r"+
		"G\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27_\3\2\2\2"+
		"\31e\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#\u0089\3\2"+
		"\2\2%\u0092\3\2\2\2\'\u0098\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e"+
		"\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2"+
		"\2\2\67\u00a8\3\2\2\29\u00aa\3\2\2\2;<\7_\2\2<\4\3\2\2\2=>\7+\2\2>\6\3"+
		"\2\2\2?@\7]\2\2@\b\3\2\2\2AB\7*\2\2B\n\3\2\2\2CD\7f\2\2DE\7g\2\2EF\7h"+
		"\2\2F\f\3\2\2\2GH\7k\2\2HI\7h\2\2I\16\3\2\2\2JK\7h\2\2KL\7w\2\2LM\7p\2"+
		"\2M\20\3\2\2\2NO\7e\2\2OP\7c\2\2PQ\7n\2\2QR\7n\2\2R\22\3\2\2\2ST\7r\2"+
		"\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\24\3\2\2\2YZ\7y\2\2Z[\7j\2\2["+
		"\\\7k\2\2\\]\7n\2\2]^\7g\2\2^\26\3\2\2\2_`\7d\2\2`a\7g\2\2ab\7i\2\2bc"+
		"\7k\2\2cd\7p\2\2d\30\3\2\2\2ef\7n\2\2fg\7g\2\2gh\7v\2\2h\32\3\2\2\2ij"+
		"\7v\2\2jk\7t\2\2kl\7w\2\2ls\7g\2\2mn\7h\2\2no\7c\2\2op\7n\2\2pq\7u\2\2"+
		"qs\7g\2\2ri\3\2\2\2rm\3\2\2\2s\34\3\2\2\2tu\t\2\2\2u\36\3\2\2\2vw\t\3"+
		"\2\2w \3\2\2\2xz\7/\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5\35\17\2|{\3"+
		"\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0087\3\2\2\2\u0080\u0084"+
		"\7\60\2\2\u0081\u0083\5\35\17\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0088\3\2\2\2\u0088\"\3\2\2\2\u0089"+
		"\u008e\5\37\20\2\u008a\u008d\5\37\20\2\u008b\u008d\5\35\17\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f$\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\4\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\23\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7-\2\2\u0099(\3\2\2\2\u009a\u009b\7/\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\7,\2\2\u009d,\3\2\2\2\u009e\u009f\7\61\2\2\u009f.\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\62\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\66\3\2\2\2\u00a8\u00a9"+
		"\7~\2\2\u00a98\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab:\3\2\2\2\13\2ry~\u0084"+
		"\u0087\u008c\u008e\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}