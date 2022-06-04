// Generated from /media/nico/Stive4/nicko/U/2022-I/UNlenguaje/Interprete/grammar/Lenguaje.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(LenguajeParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(LenguajeParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#inicio2}.
	 * @param ctx the parse tree
	 */
	void enterInicio2(LenguajeParser.Inicio2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#inicio2}.
	 * @param ctx the parse tree
	 */
	void exitInicio2(LenguajeParser.Inicio2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LenguajeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LenguajeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#especificacion}.
	 * @param ctx the parse tree
	 */
	void enterEspecificacion(LenguajeParser.EspecificacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#especificacion}.
	 * @param ctx the parse tree
	 */
	void exitEspecificacion(LenguajeParser.EspecificacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LenguajeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LenguajeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(LenguajeParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(LenguajeParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#const2}.
	 * @param ctx the parse tree
	 */
	void enterConst2(LenguajeParser.Const2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#const2}.
	 * @param ctx the parse tree
	 */
	void exitConst2(LenguajeParser.Const2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#rmt}.
	 * @param ctx the parse tree
	 */
	void enterRmt(LenguajeParser.RmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#rmt}.
	 * @param ctx the parse tree
	 */
	void exitRmt(LenguajeParser.RmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(LenguajeParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(LenguajeParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatriz(LenguajeParser.MatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatriz(LenguajeParser.MatrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#matriz2}.
	 * @param ctx the parse tree
	 */
	void enterMatriz2(LenguajeParser.Matriz2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#matriz2}.
	 * @param ctx the parse tree
	 */
	void exitMatriz2(LenguajeParser.Matriz2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(LenguajeParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(LenguajeParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LenguajeParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LenguajeParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(LenguajeParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(LenguajeParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#pc}.
	 * @param ctx the parse tree
	 */
	void enterPc(LenguajeParser.PcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#pc}.
	 * @param ctx the parse tree
	 */
	void exitPc(LenguajeParser.PcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(LenguajeParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(LenguajeParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LenguajeParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LenguajeParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#idsentencia}.
	 * @param ctx the parse tree
	 */
	void enterIdsentencia(LenguajeParser.IdsentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#idsentencia}.
	 * @param ctx the parse tree
	 */
	void exitIdsentencia(LenguajeParser.IdsentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(LenguajeParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(LenguajeParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(LenguajeParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(LenguajeParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#leer2}.
	 * @param ctx the parse tree
	 */
	void enterLeer2(LenguajeParser.Leer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#leer2}.
	 * @param ctx the parse tree
	 */
	void exitLeer2(LenguajeParser.Leer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#leer3}.
	 * @param ctx the parse tree
	 */
	void enterLeer3(LenguajeParser.Leer3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#leer3}.
	 * @param ctx the parse tree
	 */
	void exitLeer3(LenguajeParser.Leer3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(LenguajeParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(LenguajeParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#imprimir2}.
	 * @param ctx the parse tree
	 */
	void enterImprimir2(LenguajeParser.Imprimir2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#imprimir2}.
	 * @param ctx the parse tree
	 */
	void exitImprimir2(LenguajeParser.Imprimir2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#asigid}.
	 * @param ctx the parse tree
	 */
	void enterAsigid(LenguajeParser.AsigidContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#asigid}.
	 * @param ctx the parse tree
	 */
	void exitAsigid(LenguajeParser.AsigidContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expre}.
	 * @param ctx the parse tree
	 */
	void enterExpre(LenguajeParser.ExpreContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expre}.
	 * @param ctx the parse tree
	 */
	void exitExpre(LenguajeParser.ExpreContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#llaves}.
	 * @param ctx the parse tree
	 */
	void enterLlaves(LenguajeParser.LlavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#llaves}.
	 * @param ctx the parse tree
	 */
	void exitLlaves(LenguajeParser.LlavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(LenguajeParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(LenguajeParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(LenguajeParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(LenguajeParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#lista3}.
	 * @param ctx the parse tree
	 */
	void enterLista3(LenguajeParser.Lista3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#lista3}.
	 * @param ctx the parse tree
	 */
	void exitLista3(LenguajeParser.Lista3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#lista2}.
	 * @param ctx the parse tree
	 */
	void enterLista2(LenguajeParser.Lista2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#lista2}.
	 * @param ctx the parse tree
	 */
	void exitLista2(LenguajeParser.Lista2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expre2}.
	 * @param ctx the parse tree
	 */
	void enterExpre2(LenguajeParser.Expre2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expre2}.
	 * @param ctx the parse tree
	 */
	void exitExpre2(LenguajeParser.Expre2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expre3}.
	 * @param ctx the parse tree
	 */
	void enterExpre3(LenguajeParser.Expre3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expre3}.
	 * @param ctx the parse tree
	 */
	void exitExpre3(LenguajeParser.Expre3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(LenguajeParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(LenguajeParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(LenguajeParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(LenguajeParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#sielse}.
	 * @param ctx the parse tree
	 */
	void enterSielse(LenguajeParser.SielseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#sielse}.
	 * @param ctx the parse tree
	 */
	void exitSielse(LenguajeParser.SielseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(LenguajeParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(LenguajeParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LenguajeParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LenguajeParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(LenguajeParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(LenguajeParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#negativo}.
	 * @param ctx the parse tree
	 */
	void enterNegativo(LenguajeParser.NegativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#negativo}.
	 * @param ctx the parse tree
	 */
	void exitNegativo(LenguajeParser.NegativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(LenguajeParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(LenguajeParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#argumentos2}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos2(LenguajeParser.Argumentos2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#argumentos2}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos2(LenguajeParser.Argumentos2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#subrutinas}.
	 * @param ctx the parse tree
	 */
	void enterSubrutinas(LenguajeParser.SubrutinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#subrutinas}.
	 * @param ctx the parse tree
	 */
	void exitSubrutinas(LenguajeParser.SubrutinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(LenguajeParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(LenguajeParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expreSUB}.
	 * @param ctx the parse tree
	 */
	void enterExpreSUB(LenguajeParser.ExpreSUBContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expreSUB}.
	 * @param ctx the parse tree
	 */
	void exitExpreSUB(LenguajeParser.ExpreSUBContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expreSUB2}.
	 * @param ctx the parse tree
	 */
	void enterExpreSUB2(LenguajeParser.ExpreSUB2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expreSUB2}.
	 * @param ctx the parse tree
	 */
	void exitExpreSUB2(LenguajeParser.ExpreSUB2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#valoref}.
	 * @param ctx the parse tree
	 */
	void enterValoref(LenguajeParser.ValorefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#valoref}.
	 * @param ctx the parse tree
	 */
	void exitValoref(LenguajeParser.ValorefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#refSUB}.
	 * @param ctx the parse tree
	 */
	void enterRefSUB(LenguajeParser.RefSUBContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#refSUB}.
	 * @param ctx the parse tree
	 */
	void exitRefSUB(LenguajeParser.RefSUBContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#idV}.
	 * @param ctx the parse tree
	 */
	void enterIdV(LenguajeParser.IdVContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#idV}.
	 * @param ctx the parse tree
	 */
	void exitIdV(LenguajeParser.IdVContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#idV2}.
	 * @param ctx the parse tree
	 */
	void enterIdV2(LenguajeParser.IdV2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#idV2}.
	 * @param ctx the parse tree
	 */
	void exitIdV2(LenguajeParser.IdV2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#vectordef}.
	 * @param ctx the parse tree
	 */
	void enterVectordef(LenguajeParser.VectordefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#vectordef}.
	 * @param ctx the parse tree
	 */
	void exitVectordef(LenguajeParser.VectordefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(LenguajeParser.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(LenguajeParser.FuncionesContext ctx);
}