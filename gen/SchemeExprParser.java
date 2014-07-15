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
		T__1=1, T__0=2, DEF=3, IF=4, PRINT=5, WHILE=6, BEGIN=7, BOOLEAN=8, DOUBLE=9, 
		ID=10, WS=11, PLUS=12, MINUS=13, MUL=14, DIV=15, EQ=16, GT=17, LT=18, 
		AND=19, OR=20, NOT=21;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'def'", "'if'", "'print'", "'while'", "'begin'", 
		"BOOLEAN", "DOUBLE", "ID", "WS", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", 
		"'<'", "'&'", "'|'", "'!'"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_rator = 2, RULE_arithRator = 3, RULE_relationalRator = 4, 
		RULE_booleanRator = 5;
	public static final String[] ruleNames = {
		"prog", "expr", "rator", "arithRator", "relationalRator", "booleanRator"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); expr();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
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
	public static class WhilelContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(SchemeExprParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhilelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterWhilel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitWhilel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitWhilel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanlContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(SchemeExprParser.BOOLEAN, 0); }
		public BooleanlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterBooleanl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitBooleanl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBooleanl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IflContext extends ExprContext {
		public TerminalNode IF() { return getToken(SchemeExprParser.IF, 0); }
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
	public static class PrintlContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(SchemeExprParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterPrintl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitPrintl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitPrintl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeflContext extends ExprContext {
		public TerminalNode DEF() { return getToken(SchemeExprParser.DEF, 0); }
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
	public static class ApplContext extends ExprContext {
		public RatorContext op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SchemeExprParser.BEGIN, 0); }
		public RatorContext rator() {
			return getRuleContext(RatorContext.class,0);
		}
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

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ApplContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17); match(T__0);
				setState(18); match(BEGIN);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(19); expr();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25); match(T__1);
				}
				break;
			case 2:
				_localctx = new ApplContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(T__0);
				setState(27); ((ApplContext)_localctx).op = rator();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(28); expr();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34); match(T__1);
				}
				break;
			case 3:
				_localctx = new DoublelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36); match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new BooleanlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37); match(BOOLEAN);
				}
				break;
			case 5:
				_localctx = new IdlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38); match(ID);
				}
				break;
			case 6:
				_localctx = new DeflContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(39); match(T__0);
				setState(40); match(DEF);
				setState(41); match(ID);
				setState(42); expr();
				setState(43); match(T__1);
				}
				break;
			case 7:
				_localctx = new IflContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(45); match(T__0);
				setState(46); match(IF);
				setState(47); expr();
				setState(48); expr();
				setState(49); expr();
				setState(50); match(T__1);
				}
				break;
			case 8:
				_localctx = new PrintlContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(52); match(T__0);
				setState(53); match(PRINT);
				setState(54); expr();
				setState(55); match(T__1);
				}
				break;
			case 9:
				_localctx = new WhilelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(57); match(T__0);
				setState(58); match(WHILE);
				setState(59); expr();
				setState(60); expr();
				setState(61); match(T__1);
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

	public static class RatorContext extends ParserRuleContext {
		public ArithRatorContext arithRator() {
			return getRuleContext(ArithRatorContext.class,0);
		}
		public RelationalRatorContext relationalRator() {
			return getRuleContext(RelationalRatorContext.class,0);
		}
		public BooleanRatorContext booleanRator() {
			return getRuleContext(BooleanRatorContext.class,0);
		}
		public RatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterRator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitRator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatorContext rator() throws RecognitionException {
		RatorContext _localctx = new RatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rator);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); arithRator();
				}
				break;
			case EQ:
			case GT:
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); relationalRator();
				}
				break;
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); booleanRator();
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

	public static class ArithRatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SchemeExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SchemeExprParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(SchemeExprParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SchemeExprParser.PLUS, 0); }
		public ArithRatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithRator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterArithRator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitArithRator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitArithRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithRatorContext arithRator() throws RecognitionException {
		ArithRatorContext _localctx = new ArithRatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RelationalRatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SchemeExprParser.LT, 0); }
		public TerminalNode GT() { return getToken(SchemeExprParser.GT, 0); }
		public TerminalNode EQ() { return getToken(SchemeExprParser.EQ, 0); }
		public RelationalRatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalRator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterRelationalRator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitRelationalRator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitRelationalRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalRatorContext relationalRator() throws RecognitionException {
		RelationalRatorContext _localctx = new RelationalRatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relationalRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << LT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BooleanRatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SchemeExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(SchemeExprParser.OR, 0); }
		public TerminalNode NOT() { return getToken(SchemeExprParser.NOT, 0); }
		public BooleanRatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanRator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).enterBooleanRator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeExprListener ) ((SchemeExprListener)listener).exitBooleanRator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBooleanRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanRatorContext booleanRator() throws RecognitionException {
		BooleanRatorContext _localctx = new BooleanRatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4\3\4"+
		"\5\4G\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5\3\2\16\21"+
		"\3\2\22\24\3\2\25\27U\2\17\3\2\2\2\4A\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\n"+
		"J\3\2\2\2\fL\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\4\2\2\24\30\7\t\2\2\25\27\5"+
		"\4\3\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3"+
		"\2\2\2\32\30\3\2\2\2\33B\7\3\2\2\34\35\7\4\2\2\35!\5\6\4\2\36 \5\4\3\2"+
		"\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$"+
		"%\7\3\2\2%B\3\2\2\2&B\7\13\2\2\'B\7\n\2\2(B\7\f\2\2)*\7\4\2\2*+\7\5\2"+
		"\2+,\7\f\2\2,-\5\4\3\2-.\7\3\2\2.B\3\2\2\2/\60\7\4\2\2\60\61\7\6\2\2\61"+
		"\62\5\4\3\2\62\63\5\4\3\2\63\64\5\4\3\2\64\65\7\3\2\2\65B\3\2\2\2\66\67"+
		"\7\4\2\2\678\7\7\2\289\5\4\3\29:\7\3\2\2:B\3\2\2\2;<\7\4\2\2<=\7\b\2\2"+
		"=>\5\4\3\2>?\5\4\3\2?@\7\3\2\2@B\3\2\2\2A\23\3\2\2\2A\34\3\2\2\2A&\3\2"+
		"\2\2A\'\3\2\2\2A(\3\2\2\2A)\3\2\2\2A/\3\2\2\2A\66\3\2\2\2A;\3\2\2\2B\5"+
		"\3\2\2\2CG\5\b\5\2DG\5\n\6\2EG\5\f\7\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G"+
		"\7\3\2\2\2HI\t\2\2\2I\t\3\2\2\2JK\t\3\2\2K\13\3\2\2\2LM\t\4\2\2M\r\3\2"+
		"\2\2\7\21\30!AF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}