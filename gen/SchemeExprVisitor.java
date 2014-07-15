// Generated from /Users/jeremymiranda/IdeaProjects/untitled3/SchemeExpr.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SchemeExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SchemeExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#whilel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilel(@NotNull SchemeExprParser.WhilelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#booleanl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanl(@NotNull SchemeExprParser.BooleanlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#arithRator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithRator(@NotNull SchemeExprParser.ArithRatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublel(@NotNull SchemeExprParser.DoublelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#printl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintl(@NotNull SchemeExprParser.PrintlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#relationalRator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalRator(@NotNull SchemeExprParser.RelationalRatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#defl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefl(@NotNull SchemeExprParser.DeflContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#booleanRator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanRator(@NotNull SchemeExprParser.BooleanRatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgl(@NotNull SchemeExprParser.ProglContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#idl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdl(@NotNull SchemeExprParser.IdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#appl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppl(@NotNull SchemeExprParser.ApplContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#ifl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfl(@NotNull SchemeExprParser.IflContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#rator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRator(@NotNull SchemeExprParser.RatorContext ctx);
}