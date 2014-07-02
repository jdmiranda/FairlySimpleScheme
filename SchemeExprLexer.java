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
		T__1=1, T__0=2, RATOR=3, ARITHMETIC=4, RELATIONAL=5, BOOLEAN=6, DEF=7, 
		IF=8, ID=9, DOUBLE=10, WS=11, PLUS=12, MINUS=13, MUL=14, DIV=15, EQUAL=16, 
		GREATER=17, LESSER=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "RATOR", "ARITHMETIC", "RELATIONAL", "BOOLEAN", "'def'", 
		"'if'", "ID", "DOUBLE", "WS", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", 
		"'<'", "'&'", "'|'", "'!'", "'true'", "'false'"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\5\4>\n\4\3\5\3\5\3\5"+
		"\3\5\5\5D\n\5\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\rc"+
		"\n\r\f\r\16\rf\13\r\3\16\5\16i\n\16\3\16\6\16l\n\16\r\16\16\16m\3\16\3"+
		"\16\7\16r\n\16\f\16\16\16u\13\16\5\16w\n\16\3\17\6\17z\n\17\r\17\16\17"+
		"{\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\2\25\2\27\2\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61"+
		"\27\63\30\65\31\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00ac\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67"+
		"\3\2\2\2\59\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rO\3\2\2\2\17Q\3"+
		"\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33"+
		"h\3\2\2\2\35y\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085"+
		"\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2"+
		"/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u0093\3\2\2\2\65\u0098\3\2\2\2\67"+
		"8\7+\2\28\4\3\2\2\29:\7*\2\2:\6\3\2\2\2;>\5\t\5\2<>\5\13\6\2=;\3\2\2\2"+
		"=<\3\2\2\2>\b\3\2\2\2?D\5\37\20\2@D\5!\21\2AD\5#\22\2BD\5%\23\2C?\3\2"+
		"\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\n\3\2\2\2EI\5\'\24\2FI\5)\25\2GI\5"+
		"+\26\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\f\3\2\2\2JP\5\63\32\2KP\5\65\33"+
		"\2LP\5-\27\2MP\5/\30\2NP\5\61\31\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2"+
		"\2\2ON\3\2\2\2P\16\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7h\2\2T\20\3\2\2\2UV\7"+
		"k\2\2VW\7h\2\2W\22\3\2\2\2XY\t\2\2\2Y\24\3\2\2\2Z[\t\3\2\2[\26\3\2\2\2"+
		"\\]\7a\2\2]\30\3\2\2\2^d\5\25\13\2_c\5\25\13\2`c\5\23\n\2ac\5\27\f\2b"+
		"_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\32\3\2\2"+
		"\2fd\3\2\2\2gi\7/\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\5\23\n\2kj\3\2\2"+
		"\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2nv\3\2\2\2os\7\60\2\2pr\5\23\n\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vo\3\2\2\2vw\3\2"+
		"\2\2w\34\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3"+
		"\2\2\2}~\b\17\2\2~\36\3\2\2\2\177\u0080\7-\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7/\2\2\u0082\"\3\2\2\2\u0083\u0084\7,\2\2\u0084$\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086&\3\2\2\2\u0087\u0088\7?\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a*\3\2\2\2\u008b\u008c\7>\2\2\u008c,\3\2\2\2\u008d\u008e\7"+
		"(\2\2\u008e.\3\2\2\2\u008f\u0090\7~\2\2\u0090\60\3\2\2\2\u0091\u0092\7"+
		"#\2\2\u0092\62\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7w\2\2\u0096\u0097\7g\2\2\u0097\64\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d"+
		"\66\3\2\2\2\16\2=CHObdhmsv{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}