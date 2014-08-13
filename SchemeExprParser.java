// Generated from SchemeExpr.g4 by ANTLR 4.2
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
		T__3=1, T__2=2, T__1=3, T__0=4, DEF=5, IF=6, FUN=7, CALL=8, PRINT=9, WHILE=10, 
		BEGIN=11, LET=12, BOOLEAN=13, DOUBLE=14, ID=15, WS=16, PLUS=17, MINUS=18, 
		MUL=19, DIV=20, EQ=21, GT=22, LT=23, AND=24, OR=25, NOT=26;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "'['", "'('", "'def'", "'if'", "'fun'", "'call'", 
		"'print'", "'while'", "'begin'", "'let'", "BOOLEAN", "DOUBLE", "ID", "WS", 
		"'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'&'", "'|'", "'!'"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_letvardec = 2, RULE_rator = 3, RULE_arithRator = 4, 
		RULE_relationalRator = 5, RULE_booleanRator = 6;
	public static final String[] ruleNames = {
		"prog", "expr", "letvardec", "rator", "arithRator", "relationalRator", 
		"booleanRator"
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); expr();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitWhilel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanlContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(SchemeExprParser.BOOLEAN, 0); }
		public BooleanlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBooleanl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunlContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public TerminalNode FUN() { return getToken(SchemeExprParser.FUN, 0); }
		public FunlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitFunl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublelContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(SchemeExprParser.DOUBLE, 0); }
		public DoublelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDoublel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetlContext extends ExprContext {
		public TerminalNode LET() { return getToken(SchemeExprParser.LET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetvardecContext letvardec() {
			return getRuleContext(LetvardecContext.class,0);
		}
		public LetlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitLetl(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitIfl(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitPrintl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalllContext extends ExprContext {
		public TerminalNode CALL() { return getToken(SchemeExprParser.CALL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CalllContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitCalll(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitDefl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginlContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SchemeExprParser.BEGIN, 0); }
		public BeginlContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBeginl(this);
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
		public RatorContext rator() {
			return getRuleContext(RatorContext.class,0);
		}
		public ApplContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ApplContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19); match(4);
				setState(20); ((ApplContext)_localctx).op = rator();
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(21); expr();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27); match(2);
				}
				break;

			case 2:
				_localctx = new DoublelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29); match(DOUBLE);
				}
				break;

			case 3:
				_localctx = new BooleanlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30); match(BOOLEAN);
				}
				break;

			case 4:
				_localctx = new IdlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31); match(ID);
				}
				break;

			case 5:
				_localctx = new DeflContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32); match(4);
				setState(33); match(DEF);
				setState(34); match(ID);
				setState(35); expr();
				setState(36); match(2);
				}
				break;

			case 6:
				_localctx = new LetlContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(38); match(4);
				setState(39); match(LET);
				setState(40); letvardec();
				setState(41); expr();
				setState(42); match(2);
				}
				break;

			case 7:
				_localctx = new IflContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44); match(4);
				setState(45); match(IF);
				setState(46); expr();
				setState(47); expr();
				setState(48); expr();
				setState(49); match(2);
				}
				break;

			case 8:
				_localctx = new PrintlContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(51); match(4);
				setState(52); match(PRINT);
				setState(53); expr();
				setState(54); match(2);
				}
				break;

			case 9:
				_localctx = new WhilelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(56); match(4);
				setState(57); match(WHILE);
				setState(58); expr();
				setState(59); expr();
				setState(60); match(2);
				}
				break;

			case 10:
				_localctx = new BeginlContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(62); match(4);
				setState(63); match(BEGIN);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64); expr();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
				setState(69); match(2);
				}
				break;

			case 11:
				_localctx = new FunlContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(71); match(4);
				setState(72); match(FUN);
				setState(73); match(ID);
				setState(74); expr();
				setState(75); match(2);
				}
				break;

			case 12:
				_localctx = new CalllContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(77); match(4);
				setState(78); match(CALL);
				setState(79); expr();
				setState(80); expr();
				setState(81); match(2);
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

	public static class LetvardecContext extends ParserRuleContext {
		public LetvardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letvardec; }
	 
		public LetvardecContext() { }
		public void copyFrom(LetvardecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetvardeclContext extends LetvardecContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SchemeExprParser.ID, 0); }
		public LetvardeclContext(LetvardecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitLetvardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetvardecContext letvardec() throws RecognitionException {
		LetvardecContext _localctx = new LetvardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letvardec);
		try {
			_localctx = new LetvardeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(3);
			setState(86); match(ID);
			setState(87); expr();
			setState(88); match(1);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatorContext rator() throws RecognitionException {
		RatorContext _localctx = new RatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rator);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); arithRator();
				}
				break;
			case EQ:
			case GT:
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); relationalRator();
				}
				break;
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); booleanRator();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitArithRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithRatorContext arithRator() throws RecognitionException {
		ArithRatorContext _localctx = new ArithRatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitRelationalRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalRatorContext relationalRator() throws RecognitionException {
		RelationalRatorContext _localctx = new RelationalRatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relationalRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeExprVisitor ) return ((SchemeExprVisitor<? extends T>)visitor).visitBooleanRator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanRatorContext booleanRator() throws RecognitionException {
		BooleanRatorContext _localctx = new BooleanRatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleanRator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3D\n\3\r\3\16\3"+
		"E\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3V\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\5\3\2\23\26\3\2\27\31\3\2\32\34p\2\21\3\2\2\2\4U\3"+
		"\2\2\2\6W\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20\22\5"+
		"\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3"+
		"\2\2\2\25\26\7\6\2\2\26\32\5\b\5\2\27\31\5\4\3\2\30\27\3\2\2\2\31\34\3"+
		"\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7"+
		"\4\2\2\36V\3\2\2\2\37V\7\20\2\2 V\7\17\2\2!V\7\21\2\2\"#\7\6\2\2#$\7\7"+
		"\2\2$%\7\21\2\2%&\5\4\3\2&\'\7\4\2\2\'V\3\2\2\2()\7\6\2\2)*\7\16\2\2*"+
		"+\5\6\4\2+,\5\4\3\2,-\7\4\2\2-V\3\2\2\2./\7\6\2\2/\60\7\b\2\2\60\61\5"+
		"\4\3\2\61\62\5\4\3\2\62\63\5\4\3\2\63\64\7\4\2\2\64V\3\2\2\2\65\66\7\6"+
		"\2\2\66\67\7\13\2\2\678\5\4\3\289\7\4\2\29V\3\2\2\2:;\7\6\2\2;<\7\f\2"+
		"\2<=\5\4\3\2=>\5\4\3\2>?\7\4\2\2?V\3\2\2\2@A\7\6\2\2AC\7\r\2\2BD\5\4\3"+
		"\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\4\2\2HV\3\2\2"+
		"\2IJ\7\6\2\2JK\7\t\2\2KL\7\21\2\2LM\5\4\3\2MN\7\4\2\2NV\3\2\2\2OP\7\6"+
		"\2\2PQ\7\n\2\2QR\5\4\3\2RS\5\4\3\2ST\7\4\2\2TV\3\2\2\2U\25\3\2\2\2U\37"+
		"\3\2\2\2U \3\2\2\2U!\3\2\2\2U\"\3\2\2\2U(\3\2\2\2U.\3\2\2\2U\65\3\2\2"+
		"\2U:\3\2\2\2U@\3\2\2\2UI\3\2\2\2UO\3\2\2\2V\5\3\2\2\2WX\7\5\2\2XY\7\21"+
		"\2\2YZ\5\4\3\2Z[\7\3\2\2[\7\3\2\2\2\\`\5\n\6\2]`\5\f\7\2^`\5\16\b\2_\\"+
		"\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\t\2\2\2b\13\3\2\2\2cd\t\3\2"+
		"\2d\r\3\2\2\2ef\t\4\2\2f\17\3\2\2\2\7\23\32EU_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}