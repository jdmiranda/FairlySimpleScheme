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
	 * Visit a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublel(@NotNull SchemeExprParser.DoublelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#ifl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfl(@NotNull SchemeExprParser.IflContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#defl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefl(@NotNull SchemeExprParser.DeflContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgl(@NotNull SchemeExprParser.ProglContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#booll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooll(@NotNull SchemeExprParser.BoollContext ctx);
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
}