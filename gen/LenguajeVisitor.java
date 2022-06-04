// Generated from C:/Users/de/Interprete/grammar\Lenguaje.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(LenguajeParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#inicio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio2(LenguajeParser.Inicio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LenguajeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#especificacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificacion(LenguajeParser.EspecificacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LenguajeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(LenguajeParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#const2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst2(LenguajeParser.Const2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#rmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmt(LenguajeParser.RmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(LenguajeParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz(LenguajeParser.MatrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#matriz2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz2(LenguajeParser.Matriz2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(LenguajeParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(LenguajeParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(LenguajeParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#pc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPc(LenguajeParser.PcContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(LenguajeParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LenguajeParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LenguajeParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#idsentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsentencia(LenguajeParser.IdsentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(LenguajeParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#leer2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer2(LenguajeParser.Leer2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#leer3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer3(LenguajeParser.Leer3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(LenguajeParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#imprimir2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir2(LenguajeParser.Imprimir2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#asigid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigid(LenguajeParser.AsigidContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#expre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpre(LenguajeParser.ExpreContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#llaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlaves(LenguajeParser.LlavesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(LenguajeParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(LenguajeParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#lista3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista3(LenguajeParser.Lista3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#lista2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista2(LenguajeParser.Lista2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#expre2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpre2(LenguajeParser.Expre2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#expre3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpre3(LenguajeParser.Expre3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(LenguajeParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(LenguajeParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#sielse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSielse(LenguajeParser.SielseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(LenguajeParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LenguajeParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(LenguajeParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#negativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativo(LenguajeParser.NegativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(LenguajeParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#argumentos2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos2(LenguajeParser.Argumentos2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#subrutinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutinas(LenguajeParser.SubrutinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(LenguajeParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#expreSUB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreSUB(LenguajeParser.ExpreSUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#expreSUB2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreSUB2(LenguajeParser.ExpreSUB2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#valoref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoref(LenguajeParser.ValorefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#refSUB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefSUB(LenguajeParser.RefSUBContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#idV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdV(LenguajeParser.IdVContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#idV2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdV2(LenguajeParser.IdV2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#vectordef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectordef(LenguajeParser.VectordefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(LenguajeParser.FuncionesContext ctx);
}