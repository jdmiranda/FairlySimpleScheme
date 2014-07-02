// Generated from /Users/jeremymiranda/IdeaProjects/untitled3/SchemeExpr.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, RATOR=3, ARITHMETIC=4, RELATIONAL=5, BOOLEAN=6, DEF=7, 
		IF=8, ID=9, DOUBLE=10, WS=11, PLUS=12, MINUS=13, MUL=14, DIV=15, EQUAL=16, 
		GREATER=17, LESSER=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "RATOR", "ARITHMETIC", "RELATIONAL", "BOOLEAN", 
		"'def'", "'if'", "ID", "DOUBLE", "WS", "'+'", "'-'", "'*'", "'/'", "'='", 
		"'>'", "'<'", "'&'", "'|'", "'!'", "'true'", "'false'"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"prog", "expr"
	};

	@Override
	public String getGrammarFileName() { return "SchemeExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchemeExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProglContext extends ProgContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProglContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterProgl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitProgl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitProgl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProglContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); expr();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE))) != 0) );
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IflContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IflContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterIfl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitIfl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitIfl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublelContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(SchemeExprParser.DOUBLE, 0); }
		public DoublelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterDoublel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitDoublel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDoublel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(SchemeExprParser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeflContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public DeflContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterDefl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitDefl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDefl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RATOR() { return getToken(SchemeExprParser.RATOR, 0); }
		public ApplContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterAppl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitAppl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitAppl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdlContext extends ExprContext {
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public IdlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterIdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitIdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitIdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DoublelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9); match(DOUBLE);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10); match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new IdlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11); match(ID);
				}
				break;
			case 4:
				_localctx = new ApplContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(12); match(T__0);
				setState(13); ((ApplContext)_localctx).op = match(RATOR);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(14); expr();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20); match(T__1);
				}
				break;
			case 5:
				_localctx = new DeflContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(21); match(T__0);
				setState(22); match(DEF);
				setState(23); match(ID);
				setState(24); expr();
				setState(25); match(T__1);
				}
				break;
			case 6:
				_localctx = new IflContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(27); match(T__0);
				setState(28); match(IF);
				setState(29); expr();
				setState(30); expr();
				setState(31); expr();
				setState(32); match(T__1);
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\'\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\7\3\22\n\3\f\3\16"+
		"\3\25\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"%\n\3\3\3\2\2\4\2\4\2\2+\2\7\3\2\2\2\4$\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2"+
		"\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13%\7\f\2\2\f%\7\b"+
		"\2\2\r%\7\13\2\2\16\17\7\4\2\2\17\23\7\5\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2"+
		"\2\26%\7\3\2\2\27\30\7\4\2\2\30\31\7\t\2\2\31\32\7\13\2\2\32\33\5\4\3"+
		"\2\33\34\7\3\2\2\34%\3\2\2\2\35\36\7\4\2\2\36\37\7\n\2\2\37 \5\4\3\2 "+
		"!\5\4\3\2!\"\5\4\3\2\"#\7\3\2\2#%\3\2\2\2$\13\3\2\2\2$\f\3\2\2\2$\r\3"+
		"\2\2\2$\16\3\2\2\2$\27\3\2\2\2$\35\3\2\2\2%\5\3\2\2\2\5\t\23$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}