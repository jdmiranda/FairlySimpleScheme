// Generated from /Users/jeremymiranda/IdeaProjects/untitled3/SchemeExpr.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SchemeExprParser}.
 */
public interface SchemeExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#arithRator}.
	 * @param ctx the parse tree
	 */
	void enterArithRator(@NotNull SchemeExprParser.ArithRatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#arithRator}.
	 * @param ctx the parse tree
	 */
	void exitArithRator(@NotNull SchemeExprParser.ArithRatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#booleanl}.
	 * @param ctx the parse tree
	 */
	void enterBooleanl(@NotNull SchemeExprParser.BooleanlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#booleanl}.
	 * @param ctx the parse tree
	 */
	void exitBooleanl(@NotNull SchemeExprParser.BooleanlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 */
	void enterDoublel(@NotNull SchemeExprParser.DoublelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 */
	void exitDoublel(@NotNull SchemeExprParser.DoublelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#ifl}.
	 * @param ctx the parse tree
	 */
	void enterIfl(@NotNull SchemeExprParser.IflContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#ifl}.
	 * @param ctx the parse tree
	 */
	void exitIfl(@NotNull SchemeExprParser.IflContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#relationalRator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalRator(@NotNull SchemeExprParser.RelationalRatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#relationalRator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalRator(@NotNull SchemeExprParser.RelationalRatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#booleanRator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanRator(@NotNull SchemeExprParser.BooleanRatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#booleanRator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanRator(@NotNull SchemeExprParser.BooleanRatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#rator}.
	 * @param ctx the parse tree
	 */
	void enterRator(@NotNull SchemeExprParser.RatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#rator}.
	 * @param ctx the parse tree
	 */
	void exitRator(@NotNull SchemeExprParser.RatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#defl}.
	 * @param ctx the parse tree
	 */
	void enterDefl(@NotNull SchemeExprParser.DeflContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#defl}.
	 * @param ctx the parse tree
	 */
	void exitDefl(@NotNull SchemeExprParser.DeflContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 */
	void enterProgl(@NotNull SchemeExprParser.ProglContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 */
	void exitProgl(@NotNull SchemeExprParser.ProglContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#appl}.
	 * @param ctx the parse tree
	 */
	void enterAppl(@NotNull SchemeExprParser.ApplContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#appl}.
	 * @param ctx the parse tree
	 */
	void exitAppl(@NotNull SchemeExprParser.ApplContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#idl}.
	 * @param ctx the parse tree
	 */
	void enterIdl(@NotNull SchemeExprParser.IdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#idl}.
	 * @param ctx the parse tree
	 */
	void exitIdl(@NotNull SchemeExprParser.IdlContext ctx);
}