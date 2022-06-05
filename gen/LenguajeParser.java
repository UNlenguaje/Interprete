// Generated from C:/Users/de/Interprete/grammar\Lenguaje.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TK_ASIGNACION=38, 
		TK_COMA=39, TK_CORCHETE_DERECHO=40, TK_CORCHETE_IZQUIERDO=41, TK_DISTINTO_DE=42, 
		TK_DIVISION=43, TK_DOS_PUNTOS=44, TK_IGUAL_QUE=45, TK_LLAVE_DERECHA=46, 
		TK_LLAVE_IZQUIERDA=47, TK_MAYOR=48, TK_MAYOR_igual=49, TK_MENOR=50, TK_MENOR_IGUAL=51, 
		TK_MODULO=52, TK_MULTIPLICACION=53, TK_PARENTESIS_DERECHO=54, TK_PARENTESIS_IZQUIERDO=55, 
		TK_POTENCIACION=56, TK_PUNTO=57, TK_PUNTO_y_coma=58, TK_RESTA=59, TK_SUMA=60, 
		COMMENT=61, LINE_COMMENT=62, ID=63, TK_NUMERO=64, TK_CADENA=65, ESP=66;
	public static final int
		RULE_inicio = 0, RULE_inicio2 = 1, RULE_prog = 2, RULE_especificacion = 3, 
		RULE_var = 4, RULE_const = 5, RULE_rmt = 6, RULE_vector = 7, RULE_matriz = 8, 
		RULE_matriz2 = 9, RULE_tipodato = 10, RULE_registro = 11, RULE_tipos = 12, 
		RULE_pc = 13, RULE_sentencias = 14, RULE_mientras = 15, RULE_repetir = 16, 
		RULE_eval = 17, RULE_desde = 18, RULE_si = 19, RULE_idsentencia = 20, 
		RULE_int = 21, RULE_leer = 22, RULE_leer2 = 23, RULE_leer3 = 24, RULE_imprimir = 25, 
		RULE_imprimir2 = 26, RULE_asigid = 27, RULE_expre = 28, RULE_llaves = 29, 
		RULE_logic = 30, RULE_lista = 31, RULE_lista3 = 32, RULE_lista2 = 33, 
		RULE_expre2 = 34, RULE_expre3 = 35, RULE_oper = 36, RULE_else = 37, RULE_sielse = 38, 
		RULE_caso = 39, RULE_and = 40, RULE_incremento = 41, RULE_negativo = 42, 
		RULE_argumentos = 43, RULE_argumentos2 = 44, RULE_subrutinas = 45, RULE_ref = 46, 
		RULE_expreSUB = 47, RULE_expreSUB2 = 48, RULE_valoref = 49, RULE_refSUB = 50, 
		RULE_idV = 51, RULE_idV2 = 52, RULE_vectordef = 53, RULE_funciones = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "inicio2", "prog", "especificacion", "var", "const", "rmt", 
			"vector", "matriz", "matriz2", "tipodato", "registro", "tipos", "pc", 
			"sentencias", "mientras", "repetir", "eval", "desde", "si", "idsentencia", 
			"int", "leer", "leer2", "leer3", "imprimir", "imprimir2", "asigid", "expre", 
			"llaves", "logic", "lista", "lista3", "lista2", "expre2", "expre3", "oper", 
			"else", "sielse", "caso", "and", "incremento", "negativo", "argumentos", 
			"argumentos2", "subrutinas", "ref", "expreSUB", "expreSUB2", "valoref", 
			"refSUB", "idV", "idV2", "vectordef", "funciones"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fin'", "'programa'", "'var'", "'const'", "'tipos'", 
			"'TRUE'", "'FALSE'", "'SI'", "'NO'", "'vector'", "'matriz'", "'registro'", 
			"'numerico'", "'cadena'", "'logico'", "'imprimir'", "'leer'", "'dim'", 
			"'cls'", "'mientras'", "'repetir'", "'hasta'", "'eval'", "'sino'", "'desde'", 
			"'si'", "'int'", "'or'", "'and'", "'not'", "'caso'", "'paso'", "'subrutina'", 
			"'ref'", "'retorna'", "'ascii'", "'='", "','", "']'", "'['", "'<>'", 
			"'/'", "':'", "'=='", "'}'", "'{'", "'>'", "'>='", "'<'", "'<='", "'%'", 
			"'*'", "')'", "'('", "'^'", "'.'", "';'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TK_ASIGNACION", "TK_COMA", "TK_CORCHETE_DERECHO", "TK_CORCHETE_IZQUIERDO", 
			"TK_DISTINTO_DE", "TK_DIVISION", "TK_DOS_PUNTOS", "TK_IGUAL_QUE", "TK_LLAVE_DERECHA", 
			"TK_LLAVE_IZQUIERDA", "TK_MAYOR", "TK_MAYOR_igual", "TK_MENOR", "TK_MENOR_IGUAL", 
			"TK_MODULO", "TK_MULTIPLICACION", "TK_PARENTESIS_DERECHO", "TK_PARENTESIS_IZQUIERDO", 
			"TK_POTENCIACION", "TK_PUNTO", "TK_PUNTO_y_coma", "TK_RESTA", "TK_SUMA", 
			"COMMENT", "LINE_COMMENT", "ID", "TK_NUMERO", "TK_CADENA", "ESP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public EspecificacionContext especificacion() {
			return getRuleContext(EspecificacionContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SubrutinasContext subrutinas() {
			return getRuleContext(SubrutinasContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			prog();
			setState(111);
			especificacion();
			setState(112);
			match(T__0);
			setState(113);
			sentencias();
			setState(114);
			match(T__1);
			setState(115);
			subrutinas();
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

	public static class Inicio2Context extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public EspecificacionContext especificacion() {
			return getRuleContext(EspecificacionContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public Inicio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInicio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicio2Context inicio2() throws RecognitionException {
		Inicio2Context _localctx = new Inicio2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			prog();
			setState(118);
			especificacion();
			setState(119);
			match(T__0);
			setState(120);
			sentencias();
			setState(121);
			match(T__1);
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__2);
				setState(124);
				match(ID);
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EspecificacionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public EspecificacionContext especificacion() {
			return getRuleContext(EspecificacionContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public EspecificacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especificacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitEspecificacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecificacionContext especificacion() throws RecognitionException {
		EspecificacionContext _localctx = new EspecificacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_especificacion);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__3);
				setState(129);
				var();
				setState(130);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__4);
				setState(133);
				const_();
				setState(134);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__5);
				setState(137);
				tipos();
				setState(138);
				especificacion();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(LenguajeParser.TK_DOS_PUNTOS, 0); }
		public RmtContext rmt() {
			return getRuleContext(RmtContext.class,0);
		}
		public PcContext pc() {
			return getRuleContext(PcContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(144);
					match(TK_COMA);
					setState(145);
					match(ID);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(TK_DOS_PUNTOS);
				setState(152);
				rmt();
				setState(153);
				pc();
				setState(154);
				var();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ConstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(LenguajeParser.TK_ASIGNACION, 0); }
		public PcContext pc() {
			return getRuleContext(PcContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(ID);
				setState(160);
				match(TK_ASIGNACION);
				setState(161);
				_la = _input.LA(1);
				if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (TK_NUMERO - 7)) | (1L << (TK_CADENA - 7)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				pc();
				setState(163);
				const_();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RmtContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(LenguajeParser.TK_CORCHETE_IZQUIERDO, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public RmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RmtContext rmt() throws RecognitionException {
		RmtContext _localctx = new RmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rmt);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				tipodato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__10);
				setState(170);
				match(TK_CORCHETE_IZQUIERDO);
				setState(171);
				vector();
				setState(172);
				match(TK_CORCHETE_DERECHO);
				setState(173);
				tipodato();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__11);
				setState(176);
				match(TK_CORCHETE_IZQUIERDO);
				setState(177);
				matriz();
				setState(178);
				match(TK_CORCHETE_DERECHO);
				setState(179);
				tipodato();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__12);
				setState(182);
				registro();
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_MULTIPLICACION() { return getToken(LenguajeParser.TK_MULTIPLICACION, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (TK_MULTIPLICACION - 53)) | (1L << (ID - 53)) | (1L << (TK_NUMERO - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MatrizContext extends ParserRuleContext {
		public List<TerminalNode> TK_NUMERO() { return getTokens(LenguajeParser.TK_NUMERO); }
		public TerminalNode TK_NUMERO(int i) {
			return getToken(LenguajeParser.TK_NUMERO, i);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public List<TerminalNode> TK_MULTIPLICACION() { return getTokens(LenguajeParser.TK_MULTIPLICACION); }
		public TerminalNode TK_MULTIPLICACION(int i) {
			return getToken(LenguajeParser.TK_MULTIPLICACION, i);
		}
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matriz);
		int _la;
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==TK_NUMERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						match(TK_COMA);
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==TK_NUMERO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(195);
					match(TK_COMA);
					setState(196);
					match(TK_MULTIPLICACION);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(TK_MULTIPLICACION);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(203);
					match(TK_COMA);
					setState(204);
					_la = _input.LA(1);
					if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (TK_MULTIPLICACION - 53)) | (1L << (ID - 53)) | (1L << (TK_NUMERO - 53)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				expre();
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

	public static class Matriz2Context extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(LenguajeParser.TK_COMA, 0); }
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public Matriz2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMatriz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matriz2Context matriz2() throws RecognitionException {
		Matriz2Context _localctx = new Matriz2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_matriz2);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(TK_COMA);
				setState(214);
				matriz();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TipodatoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipodato);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__12);
				setState(219);
				registro();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__15);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(ID);
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TK_LLAVE_IZQUIERDA);
			setState(227);
			var();
			setState(228);
			match(TK_LLAVE_DERECHA);
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(LenguajeParser.TK_DOS_PUNTOS, 0); }
		public RmtContext rmt() {
			return getRuleContext(RmtContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipos);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ID);
				setState(231);
				match(TK_DOS_PUNTOS);
				setState(232);
				rmt();
				setState(233);
				tipos();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PcContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public PcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitPc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PcContext pc() throws RecognitionException {
		PcContext _localctx = new PcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pc);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_y_coma:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(TK_PUNTO_y_coma);
				}
				break;
			case T__0:
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__31:
			case T__35:
			case TK_LLAVE_DERECHA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SentenciasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public IdsentenciaContext idsentencia() {
			return getRuleContext(IdsentenciaContext.class,0);
		}
		public PcContext pc() {
			return getRuleContext(PcContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentencias);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(ID);
				setState(243);
				idsentencia();
				setState(244);
				pc();
				setState(245);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				si();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				funciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				mientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				repetir();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				eval();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				desde();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				match(T__16);
				setState(254);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(255);
				imprimir();
				setState(256);
				match(TK_PARENTESIS_DERECHO);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(257);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(260);
				sentencias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				match(T__17);
				setState(263);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(264);
				leer();
				setState(265);
				match(TK_PARENTESIS_DERECHO);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(266);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(269);
				sentencias();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				match(T__18);
				setState(272);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(273);
				leer();
				setState(274);
				match(TK_PARENTESIS_DERECHO);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(275);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(278);
				sentencias();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(280);
				match(T__19);
				setState(281);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(282);
				match(TK_PARENTESIS_DERECHO);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(283);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(286);
				sentencias();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				funciones();
				setState(288);
				sentencias();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__20);
			setState(294);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(295);
			expre();
			setState(296);
			match(TK_PARENTESIS_DERECHO);
			setState(297);
			match(TK_LLAVE_IZQUIERDA);
			setState(298);
			sentencias();
			setState(299);
			match(TK_LLAVE_DERECHA);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(300);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(303);
			sentencias();
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

	public static class RepetirContext extends ParserRuleContext {
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__21);
			setState(306);
			sentencias();
			setState(307);
			match(T__22);
			setState(308);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(309);
			expre();
			setState(310);
			match(TK_PARENTESIS_DERECHO);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(311);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(314);
			sentencias();
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

	public static class EvalContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__23);
			setState(317);
			match(TK_LLAVE_IZQUIERDA);
			setState(318);
			caso();
			setState(319);
			match(T__24);
			setState(320);
			sentencias();
			setState(321);
			match(TK_LLAVE_DERECHA);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(322);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(325);
			sentencias();
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

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(LenguajeParser.TK_ASIGNACION, 0); }
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__25);
			setState(328);
			match(ID);
			setState(329);
			match(TK_ASIGNACION);
			setState(330);
			expre();
			setState(331);
			match(T__22);
			setState(332);
			expre();
			setState(333);
			incremento();
			setState(334);
			match(TK_LLAVE_IZQUIERDA);
			setState(335);
			sentencias();
			setState(336);
			match(TK_LLAVE_DERECHA);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(337);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(340);
			sentencias();
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__26);
			setState(343);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(344);
			expre();
			setState(345);
			match(TK_PARENTESIS_DERECHO);
			setState(346);
			match(TK_LLAVE_IZQUIERDA);
			setState(347);
			sentencias();
			setState(348);
			else_();
			setState(349);
			match(TK_LLAVE_DERECHA);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(350);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(353);
			sentencias();
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

	public static class IdsentenciaContext extends ParserRuleContext {
		public AsigidContext asigid() {
			return getRuleContext(AsigidContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public List<TerminalNode> TK_PUNTO() { return getTokens(LenguajeParser.TK_PUNTO); }
		public TerminalNode TK_PUNTO(int i) {
			return getToken(LenguajeParser.TK_PUNTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public List<TerminalNode> TK_PARENTESIS_IZQUIERDO() { return getTokens(LenguajeParser.TK_PARENTESIS_IZQUIERDO); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO(int i) {
			return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, i);
		}
		public List<TerminalNode> TK_PARENTESIS_DERECHO() { return getTokens(LenguajeParser.TK_PARENTESIS_DERECHO); }
		public TerminalNode TK_PARENTESIS_DERECHO(int i) {
			return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(LenguajeParser.TK_CORCHETE_IZQUIERDO, 0); }
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public IdsentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idsentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdsentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsentenciaContext idsentencia() throws RecognitionException {
		IdsentenciaContext _localctx = new IdsentenciaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idsentencia);
		int _la;
		try {
			int _alt;
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(355);
					match(TK_PUNTO);
					setState(356);
					match(ID);
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				asigid();
				setState(363);
				int_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				asigid();
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(366);
					expre();
					}
					break;
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CADENA) {
					{
					setState(369);
					match(TK_CADENA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				asigid();
				setState(373);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(374);
				expre();
				setState(375);
				match(TK_PARENTESIS_DERECHO);
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(376);
						logic();
						setState(377);
						match(TK_PARENTESIS_IZQUIERDO);
						setState(378);
						expre();
						setState(379);
						match(TK_PARENTESIS_DERECHO);
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(TK_CORCHETE_IZQUIERDO);
				setState(387);
				matriz();
				setState(388);
				match(TK_CORCHETE_DERECHO);
				setState(389);
				asigid();
				setState(390);
				expre();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(392);
					match(TK_PUNTO);
					setState(393);
					match(ID);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(TK_CORCHETE_IZQUIERDO);
				setState(400);
				vector();
				setState(401);
				match(TK_CORCHETE_DERECHO);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(402);
					match(TK_PUNTO);
					setState(403);
					match(ID);
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				asigid();
				setState(410);
				expre();
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

	public static class IntContext extends ParserRuleContext {
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__27);
			setState(415);
			expre();
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

	public static class LeerContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public List<TerminalNode> TK_DOS_PUNTOS() { return getTokens(LenguajeParser.TK_DOS_PUNTOS); }
		public TerminalNode TK_DOS_PUNTOS(int i) {
			return getToken(LenguajeParser.TK_DOS_PUNTOS, i);
		}
		public List<TipodatoContext> tipodato() {
			return getRuleContexts(TipodatoContext.class);
		}
		public TipodatoContext tipodato(int i) {
			return getRuleContext(TipodatoContext.class,i);
		}
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_leer);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				ref();
				setState(418);
				match(ID);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(419);
					match(TK_COMA);
					setState(420);
					match(ID);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_DOS_PUNTOS) {
					{
					{
					setState(426);
					match(TK_DOS_PUNTOS);
					setState(427);
					tipodato();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(433);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(436);
				leer();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(TK_CADENA);
				}
				break;
			case EOF:
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Leer2Context extends ParserRuleContext {
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(LenguajeParser.TK_CORCHETE_IZQUIERDO, 0); }
		public Leer3Context leer3() {
			return getRuleContext(Leer3Context.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public TerminalNode TK_COMA() { return getToken(LenguajeParser.TK_COMA, 0); }
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public Leer2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer2Context leer2() throws RecognitionException {
		Leer2Context _localctx = new Leer2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_leer2);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(TK_CORCHETE_IZQUIERDO);
				setState(443);
				leer3();
				setState(444);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(TK_COMA);
				setState(447);
				leer();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Leer3Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public Leer3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer3Context leer3() throws RecognitionException {
		Leer3Context _localctx = new Leer3Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_leer3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TK_NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ImprimirContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public List<TerminalNode> TK_NUMERO() { return getTokens(LenguajeParser.TK_NUMERO); }
		public TerminalNode TK_NUMERO(int i) {
			return getToken(LenguajeParser.TK_NUMERO, i);
		}
		public List<TerminalNode> TK_CADENA() { return getTokens(LenguajeParser.TK_CADENA); }
		public TerminalNode TK_CADENA(int i) {
			return getToken(LenguajeParser.TK_CADENA, i);
		}
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(453);
				match(ID);
				}
				break;
			case 2:
				{
				setState(454);
				match(TK_NUMERO);
				}
				break;
			case 3:
				{
				setState(455);
				match(TK_CADENA);
				}
				break;
			case 4:
				{
				setState(456);
				funciones();
				}
				break;
			case 5:
				{
				setState(457);
				expre();
				}
				break;
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(460);
				match(TK_COMA);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(461);
					match(ID);
					}
					break;
				case 2:
					{
					setState(462);
					match(TK_NUMERO);
					}
					break;
				case 3:
					{
					setState(463);
					expre();
					}
					break;
				case 4:
					{
					setState(464);
					match(TK_CADENA);
					}
					break;
				case 5:
					{
					setState(465);
					funciones();
					}
					break;
				}
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Imprimir2Context extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(LenguajeParser.TK_COMA, 0); }
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Imprimir2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imprimir2Context imprimir2() throws RecognitionException {
		Imprimir2Context _localctx = new Imprimir2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_imprimir2);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(TK_COMA);
				setState(474);
				imprimir();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsigidContext extends ParserRuleContext {
		public TerminalNode TK_DOS_PUNTOS() { return getToken(LenguajeParser.TK_DOS_PUNTOS, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(LenguajeParser.TK_ASIGNACION, 0); }
		public AsigidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAsigid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigidContext asigid() throws RecognitionException {
		AsigidContext _localctx = new AsigidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_asigid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==TK_ASIGNACION || _la==TK_DOS_PUNTOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpreContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public List<TerminalNode> TK_CADENA() { return getTokens(LenguajeParser.TK_CADENA); }
		public TerminalNode TK_CADENA(int i) {
			return getToken(LenguajeParser.TK_CADENA, i);
		}
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public List<TerminalNode> TK_NUMERO() { return getTokens(LenguajeParser.TK_NUMERO); }
		public TerminalNode TK_NUMERO(int i) {
			return getToken(LenguajeParser.TK_NUMERO, i);
		}
		public List<TerminalNode> TK_PUNTO() { return getTokens(LenguajeParser.TK_PUNTO); }
		public TerminalNode TK_PUNTO(int i) {
			return getToken(LenguajeParser.TK_PUNTO, i);
		}
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(LenguajeParser.TK_CORCHETE_IZQUIERDO, 0); }
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public LlavesContext llaves() {
			return getRuleContext(LlavesContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public ExpreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreContext expre() throws RecognitionException {
		ExpreContext _localctx = new ExpreContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expre);
		try {
			int _alt;
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(480);
					match(ID);
					}
					break;
				case 2:
					{
					setState(481);
					funciones();
					}
					break;
				case 3:
					{
					setState(482);
					match(TK_CADENA);
					}
					break;
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(507);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(485);
							oper();
							setState(486);
							match(ID);
							}
							break;
						case 2:
							{
							setState(488);
							oper();
							setState(489);
							match(TK_NUMERO);
							}
							break;
						case 3:
							{
							setState(491);
							oper();
							setState(492);
							funciones();
							}
							break;
						case 4:
							{
							setState(494);
							oper();
							setState(495);
							match(TK_CADENA);
							}
							break;
						case 5:
							{
							setState(497);
							match(TK_PUNTO);
							setState(498);
							match(ID);
							setState(504);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(499);
									oper();
									setState(500);
									expre();
									}
									} 
								}
								setState(506);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
							}
							}
							break;
						}
						} 
					}
					setState(511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(512);
					match(TK_CORCHETE_IZQUIERDO);
					setState(515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(513);
						matriz();
						}
						break;
					case 2:
						{
						setState(514);
						vector();
						}
						break;
					}
					setState(517);
					match(TK_CORCHETE_DERECHO);
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(518);
							oper();
							setState(519);
							match(TK_NUMERO);
							}
							} 
						}
						setState(525);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(526);
							oper();
							setState(527);
							match(ID);
							}
							} 
						}
						setState(533);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
					break;
				}
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(537);
				expre();
				setState(538);
				match(TK_PARENTESIS_DERECHO);
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						oper();
						setState(540);
						match(ID);
						}
						} 
					}
					setState(546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						oper();
						setState(548);
						match(TK_NUMERO);
						}
						} 
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						oper();
						setState(556);
						funciones();
						}
						} 
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(563);
						oper();
						setState(564);
						expre();
						}
						} 
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(TK_NUMERO);
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						oper();
						setState(573);
						match(ID);
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(580);
						oper();
						setState(581);
						match(TK_NUMERO);
						}
						} 
					}
					setState(587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588);
						oper();
						setState(589);
						funciones();
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				match(TK_LLAVE_IZQUIERDA);
				setState(597);
				llaves();
				setState(598);
				match(TK_LLAVE_DERECHA);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(T__27);
				setState(601);
				expre();
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

	public static class LlavesContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public List<LlavesContext> llaves() {
			return getRuleContexts(LlavesContext.class);
		}
		public LlavesContext llaves(int i) {
			return getRuleContext(LlavesContext.class,i);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public LlavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llaves; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLlaves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlavesContext llaves() throws RecognitionException {
		LlavesContext _localctx = new LlavesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_llaves);
		try {
			int _alt;
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(TK_LLAVE_IZQUIERDA);
				setState(605);
				llaves();
				setState(606);
				match(TK_LLAVE_DERECHA);
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(607);
						match(TK_COMA);
						setState(608);
						llaves();
						}
						} 
					}
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(TK_CADENA);
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(615);
						match(TK_COMA);
						setState(616);
						llaves();
						}
						} 
					}
					setState(621);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				match(TK_NUMERO);
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(623);
						match(TK_COMA);
						setState(624);
						llaves();
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
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

	public static class LogicContext extends ParserRuleContext {
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public Expre2Context expre2() {
			return getRuleContext(Expre2Context.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logic);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(T__28);
				setState(633);
				expre();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(T__29);
				setState(635);
				expre();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				match(ID);
				setState(637);
				expre2();
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public Lista2Context lista2() {
			return getRuleContext(Lista2Context.class,0);
		}
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public Lista3Context lista3() {
			return getRuleContext(Lista3Context.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lista);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(TK_NUMERO);
				setState(641);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(TK_CADENA);
				setState(643);
				lista2();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				match(TK_LLAVE_IZQUIERDA);
				setState(645);
				lista3();
				setState(646);
				match(TK_LLAVE_DERECHA);
				setState(647);
				lista2();
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

	public static class Lista3Context extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public Lista2Context lista2() {
			return getRuleContext(Lista2Context.class,0);
		}
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public Lista3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista3Context lista3() throws RecognitionException {
		Lista3Context _localctx = new Lista3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_lista3);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(TK_NUMERO);
				setState(652);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(TK_CADENA);
				setState(654);
				lista2();
				}
				break;
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Lista2Context extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(LenguajeParser.TK_COMA, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public Lista2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista2Context lista2() throws RecognitionException {
		Lista2Context _localctx = new Lista2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_lista2);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(TK_COMA);
				setState(659);
				lista();
				}
				break;
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expre2Context extends ParserRuleContext {
		public TerminalNode TK_SUMA() { return getToken(LenguajeParser.TK_SUMA, 0); }
		public Expre3Context expre3() {
			return getRuleContext(Expre3Context.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_MULTIPLICACION() { return getToken(LenguajeParser.TK_MULTIPLICACION, 0); }
		public Expre2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expre2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expre2Context expre2() throws RecognitionException {
		Expre2Context _localctx = new Expre2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_expre2);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(TK_SUMA);
				setState(664);
				expre3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				oper();
				setState(666);
				expre();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(TK_MULTIPLICACION);
				setState(669);
				expre3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Expre3Context extends ParserRuleContext {
		public IdVContext idV() {
			return getRuleContext(IdVContext.class,0);
		}
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public Expre3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expre3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expre3Context expre3() throws RecognitionException {
		Expre3Context _localctx = new Expre3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expre3);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				idV();
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(TK_NUMERO);
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

	public static class OperContext extends ParserRuleContext {
		public TerminalNode TK_MAYOR() { return getToken(LenguajeParser.TK_MAYOR, 0); }
		public TerminalNode TK_MAYOR_igual() { return getToken(LenguajeParser.TK_MAYOR_igual, 0); }
		public TerminalNode TK_MENOR() { return getToken(LenguajeParser.TK_MENOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(LenguajeParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_IGUAL_QUE() { return getToken(LenguajeParser.TK_IGUAL_QUE, 0); }
		public TerminalNode TK_SUMA() { return getToken(LenguajeParser.TK_SUMA, 0); }
		public TerminalNode TK_RESTA() { return getToken(LenguajeParser.TK_RESTA, 0); }
		public TerminalNode TK_POTENCIACION() { return getToken(LenguajeParser.TK_POTENCIACION, 0); }
		public TerminalNode TK_MULTIPLICACION() { return getToken(LenguajeParser.TK_MULTIPLICACION, 0); }
		public TerminalNode TK_MODULO() { return getToken(LenguajeParser.TK_MODULO, 0); }
		public TerminalNode TK_DIVISION() { return getToken(LenguajeParser.TK_DIVISION, 0); }
		public TerminalNode TK_DISTINTO_DE() { return getToken(LenguajeParser.TK_DISTINTO_DE, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oper);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MAYOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(TK_MAYOR);
				}
				break;
			case TK_MAYOR_igual:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(TK_MAYOR_igual);
				}
				break;
			case TK_MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(TK_MENOR);
				}
				break;
			case TK_MENOR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				match(TK_MENOR_IGUAL);
				}
				break;
			case TK_IGUAL_QUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				match(TK_IGUAL_QUE);
				}
				break;
			case TK_SUMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(682);
				match(TK_SUMA);
				}
				break;
			case TK_RESTA:
				enterOuterAlt(_localctx, 7);
				{
				setState(683);
				match(TK_RESTA);
				}
				break;
			case TK_POTENCIACION:
				enterOuterAlt(_localctx, 8);
				{
				setState(684);
				match(TK_POTENCIACION);
				}
				break;
			case TK_MULTIPLICACION:
				enterOuterAlt(_localctx, 9);
				{
				setState(685);
				match(TK_MULTIPLICACION);
				}
				break;
			case TK_MODULO:
				enterOuterAlt(_localctx, 10);
				{
				setState(686);
				match(TK_MODULO);
				}
				break;
			case TK_DIVISION:
				enterOuterAlt(_localctx, 11);
				{
				setState(687);
				match(TK_DIVISION);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 12);
				{
				setState(688);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 13);
				{
				setState(689);
				match(T__29);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(690);
					match(T__30);
					}
				}

				}
				break;
			case TK_DISTINTO_DE:
				enterOuterAlt(_localctx, 14);
				{
				setState(693);
				match(TK_DISTINTO_DE);
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

	public static class ElseContext extends ParserRuleContext {
		public SielseContext sielse() {
			return getRuleContext(SielseContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_else);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(T__24);
				setState(697);
				sielse();
				setState(698);
				else_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SielseContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SielseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sielse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSielse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SielseContext sielse() throws RecognitionException {
		SielseContext _localctx = new SielseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sielse);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(T__26);
				setState(704);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(705);
				expre();
				setState(706);
				match(TK_PARENTESIS_DERECHO);
				setState(707);
				else_();
				setState(708);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				sentencias();
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_caso);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(T__31);
				setState(714);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(715);
				expre();
				setState(716);
				and();
				setState(717);
				match(TK_PARENTESIS_DERECHO);
				setState(718);
				sentencias();
				setState(719);
				caso();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AndContext extends ParserRuleContext {
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_and);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(T__29);
				setState(725);
				expre();
				}
				break;
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IncrementoContext extends ParserRuleContext {
		public NegativoContext negativo() {
			return getRuleContext(NegativoContext.class,0);
		}
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_incremento);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(T__32);
				setState(730);
				negativo();
				setState(731);
				expre();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class NegativoContext extends ParserRuleContext {
		public TerminalNode TK_RESTA() { return getToken(LenguajeParser.TK_RESTA, 0); }
		public NegativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitNegativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativoContext negativo() throws RecognitionException {
		NegativoContext _localctx = new NegativoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_negativo);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(TK_RESTA);
				}
				break;
			case T__27:
			case TK_LLAVE_IZQUIERDA:
			case TK_PARENTESIS_IZQUIERDO:
			case ID:
			case TK_NUMERO:
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<TerminalNode> TK_NUMERO() { return getTokens(LenguajeParser.TK_NUMERO); }
		public TerminalNode TK_NUMERO(int i) {
			return getToken(LenguajeParser.TK_NUMERO, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public List<TerminalNode> TK_CADENA() { return getTokens(LenguajeParser.TK_CADENA); }
		public TerminalNode TK_CADENA(int i) {
			return getToken(LenguajeParser.TK_CADENA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argumentos);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(TK_NUMERO);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(741);
					match(TK_COMA);
					setState(742);
					_la = _input.LA(1);
					if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ID - 63)) | (1L << (TK_NUMERO - 63)) | (1L << (TK_CADENA - 63)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(TK_CADENA);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(749);
					match(TK_COMA);
					setState(750);
					_la = _input.LA(1);
					if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ID - 63)) | (1L << (TK_NUMERO - 63)) | (1L << (TK_CADENA - 63)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(ID);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(757);
					match(TK_COMA);
					setState(758);
					_la = _input.LA(1);
					if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (ID - 63)) | (1L << (TK_NUMERO - 63)) | (1L << (TK_CADENA - 63)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Argumentos2Context extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(LenguajeParser.TK_COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Argumentos2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitArgumentos2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos2Context argumentos2() throws RecognitionException {
		Argumentos2Context _localctx = new Argumentos2Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentos2);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(TK_COMA);
				setState(768);
				argumentos();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SubrutinasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public Inicio2Context inicio2() {
			return getRuleContext(Inicio2Context.class,0);
		}
		public SubrutinasContext subrutinas() {
			return getRuleContext(SubrutinasContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ValorefContext valoref() {
			return getRuleContext(ValorefContext.class,0);
		}
		public SubrutinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutinas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSubrutinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinasContext subrutinas() throws RecognitionException {
		SubrutinasContext _localctx = new SubrutinasContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_subrutinas);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(T__33);
				setState(773);
				match(ID);
				setState(774);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(775);
					leer();
					}
					break;
				}
				setState(778);
				match(TK_PARENTESIS_DERECHO);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(779);
					valoref();
					}
				}

				setState(782);
				inicio2();
				setState(783);
				subrutinas();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RefContext extends ParserRuleContext {
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ref);
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(T__34);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpreSUBContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(LenguajeParser.TK_DOS_PUNTOS, 0); }
		public RmtContext rmt() {
			return getRuleContext(RmtContext.class,0);
		}
		public ExpreSUB2Context expreSUB2() {
			return getRuleContext(ExpreSUB2Context.class,0);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public ExpreSUBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreSUB; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpreSUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreSUBContext expreSUB() throws RecognitionException {
		ExpreSUBContext _localctx = new ExpreSUBContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expreSUB);
		int _la;
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(ID);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(793);
					match(TK_COMA);
					setState(794);
					match(ID);
					}
					}
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(800);
				match(TK_DOS_PUNTOS);
				setState(801);
				rmt();
				setState(802);
				expreSUB2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpreSUB2Context extends ParserRuleContext {
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public ExpreSUBContext expreSUB() {
			return getRuleContext(ExpreSUBContext.class,0);
		}
		public ExpreSUB2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreSUB2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpreSUB2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreSUB2Context expreSUB2() throws RecognitionException {
		ExpreSUB2Context _localctx = new ExpreSUB2Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_expreSUB2);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(TK_PUNTO_y_coma);
				setState(808);
				expreSUB();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ValorefContext extends ParserRuleContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public EspecificacionContext especificacion() {
			return getRuleContext(EspecificacionContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public RefSUBContext refSUB() {
			return getRuleContext(RefSUBContext.class,0);
		}
		public ValorefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitValoref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorefContext valoref() throws RecognitionException {
		ValorefContext _localctx = new ValorefContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_valoref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(T__35);
			setState(813);
			tipodato();
			setState(814);
			especificacion();
			setState(815);
			match(T__0);
			setState(816);
			sentencias();
			setState(817);
			match(T__35);
			setState(818);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(819);
			expre();
			setState(820);
			match(TK_PARENTESIS_DERECHO);
			setState(821);
			match(T__1);
			setState(822);
			refSUB();
			setState(823);
			match(T__0);
			setState(824);
			sentencias();
			setState(825);
			match(T__1);
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

	public static class RefSUBContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public EspecificacionContext especificacion() {
			return getRuleContext(EspecificacionContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public RefSUBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refSUB; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRefSUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefSUBContext refSUB() throws RecognitionException {
		RefSUBContext _localctx = new RefSUBContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_refSUB);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(T__3);
				setState(828);
				var();
				setState(829);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(T__4);
				setState(832);
				const_();
				setState(833);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				match(T__5);
				setState(836);
				tipos();
				setState(837);
				especificacion();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class IdVContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public IdV2Context idV2() {
			return getRuleContext(IdV2Context.class,0);
		}
		public IdVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idV; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdVContext idV() throws RecognitionException {
		IdVContext _localctx = new IdVContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_idV);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(ID);
				setState(843);
				idV2();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(T__36);
				setState(845);
				idV2();
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

	public static class IdV2Context extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public VectordefContext vectordef() {
			return getRuleContext(VectordefContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(LenguajeParser.TK_CORCHETE_IZQUIERDO, 0); }
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public TerminalNode TK_POTENCIACION() { return getToken(LenguajeParser.TK_POTENCIACION, 0); }
		public IdV2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idV2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdV2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdV2Context idV2() throws RecognitionException {
		IdV2Context _localctx = new IdV2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_idV2);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(849);
				vectordef();
				setState(850);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(TK_CORCHETE_IZQUIERDO);
				setState(853);
				vectordef();
				setState(854);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				match(TK_POTENCIACION);
				setState(857);
				vectordef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class VectordefContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public VectordefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectordef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVectordef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectordefContext vectordef() throws RecognitionException {
		VectordefContext _localctx = new VectordefContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_vectordef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TK_NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FuncionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(ID);
			setState(864);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(865);
				expre();
				}
				break;
			}
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(868);
				match(TK_COMA);
				setState(869);
				expre();
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(875);
				argumentos();
				}
				break;
			}
			setState(878);
			match(TK_PARENTESIS_DERECHO);
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
		"\u0004\u0001B\u0371\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u007f\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0093\b\u0004\n\u0004\f\u0004\u0096\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a7\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b8\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00bf\b\b\n\b\f\b\u00c2\t\b\u0001\b\u0001\b\u0005\b\u00c6\b"+
		"\b\n\b\f\b\u00c9\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ce\b\b\n\b\f\b"+
		"\u00d1\t\b\u0001\b\u0003\b\u00d4\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00d9"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e1\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ed\b\f\u0001\r\u0001\r\u0003\r\u00f1"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0103"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u010c\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0115"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u011d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0124\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u012e\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0139"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0144\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0153\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0160\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0166\b\u0014\n\u0014\f\u0014\u0169\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0170\b\u0014\u0001\u0014\u0003\u0014\u0173\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u017e\b\u0014\n\u0014\f\u0014\u0181\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u018b\b\u0014\n\u0014\f\u0014\u018e"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0195\b\u0014\n\u0014\f\u0014\u0198\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u019d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01a6\b\u0016"+
		"\n\u0016\f\u0016\u01a9\t\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01ad"+
		"\b\u0016\n\u0016\f\u0016\u01b0\t\u0016\u0001\u0016\u0003\u0016\u01b3\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b9"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01c2\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01cb"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01d3\b\u0019\u0005\u0019\u01d5\b\u0019\n\u0019\f\u0019"+
		"\u01d8\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01dd\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01e4\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u01f7\b\u001c\n\u001c\f\u001c\u01fa\t\u001c\u0005\u001c"+
		"\u01fc\b\u001c\n\u001c\f\u001c\u01ff\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0204\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u020a\b\u001c\n\u001c\f\u001c\u020d\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0212\b\u001c\n\u001c\f\u001c\u0215"+
		"\t\u001c\u0003\u001c\u0217\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u021f\b\u001c\n\u001c"+
		"\f\u001c\u0222\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0227\b\u001c\n\u001c\f\u001c\u022a\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u022f\b\u001c\n\u001c\f\u001c\u0232\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0237\b\u001c\n\u001c\f\u001c\u023a"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0240"+
		"\b\u001c\n\u001c\f\u001c\u0243\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0248\b\u001c\n\u001c\f\u001c\u024b\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0250\b\u001c\n\u001c\f\u001c\u0253\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u025b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0262\b\u001d\n\u001d\f\u001d\u0265\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u026a\b\u001d\n\u001d\f\u001d"+
		"\u026d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0272\b"+
		"\u001d\n\u001d\f\u001d\u0275\t\u001d\u0003\u001d\u0277\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u027f\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u028a\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0291\b \u0001!\u0001!\u0001"+
		"!\u0003!\u0296\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u02a0\b\"\u0001#\u0001#\u0003#\u02a4\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u02b4\b$\u0001$\u0003$\u02b7\b$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u02be\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02c8\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02d3\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u02d8\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02df\b)\u0001"+
		"*\u0001*\u0003*\u02e3\b*\u0001+\u0001+\u0001+\u0005+\u02e8\b+\n+\f+\u02eb"+
		"\t+\u0001+\u0001+\u0001+\u0005+\u02f0\b+\n+\f+\u02f3\t+\u0001+\u0001+"+
		"\u0001+\u0005+\u02f8\b+\n+\f+\u02fb\t+\u0001+\u0003+\u02fe\b+\u0001,\u0001"+
		",\u0001,\u0003,\u0303\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u0309\b-\u0001"+
		"-\u0001-\u0003-\u030d\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u0313\b-\u0001"+
		".\u0001.\u0003.\u0317\b.\u0001/\u0001/\u0001/\u0005/\u031c\b/\n/\f/\u031f"+
		"\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0326\b/\u00010\u00010\u0001"+
		"0\u00030\u032b\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0349\b2\u00013\u00013\u00013\u00013\u00033\u034f\b3\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u035c\b4\u00015\u00015\u00016\u00016\u00016\u00036\u0363\b6\u00016\u0001"+
		"6\u00056\u0367\b6\n6\f6\u036a\t6\u00016\u00036\u036d\b6\u00016\u00016"+
		"\u00016\u0000\u00007\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jl\u0000\u0005\u0002\u0000\u0007\n@A\u0002\u000055?@\u0001\u0000?@\u0002"+
		"\u0000&&,,\u0001\u0000?A\u03d2\u0000n\u0001\u0000\u0000\u0000\u0002u\u0001"+
		"\u0000\u0000\u0000\u0004~\u0001\u0000\u0000\u0000\u0006\u008d\u0001\u0000"+
		"\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00a6\u0001\u0000\u0000"+
		"\u0000\f\u00b7\u0001\u0000\u0000\u0000\u000e\u00b9\u0001\u0000\u0000\u0000"+
		"\u0010\u00d3\u0001\u0000\u0000\u0000\u0012\u00d8\u0001\u0000\u0000\u0000"+
		"\u0014\u00e0\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000\u0000"+
		"\u0018\u00ec\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000"+
		"\u001c\u0123\u0001\u0000\u0000\u0000\u001e\u0125\u0001\u0000\u0000\u0000"+
		" \u0131\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000$\u0147"+
		"\u0001\u0000\u0000\u0000&\u0156\u0001\u0000\u0000\u0000(\u019c\u0001\u0000"+
		"\u0000\u0000*\u019e\u0001\u0000\u0000\u0000,\u01b8\u0001\u0000\u0000\u0000"+
		".\u01c1\u0001\u0000\u0000\u00000\u01c3\u0001\u0000\u0000\u00002\u01ca"+
		"\u0001\u0000\u0000\u00004\u01dc\u0001\u0000\u0000\u00006\u01de\u0001\u0000"+
		"\u0000\u00008\u025a\u0001\u0000\u0000\u0000:\u0276\u0001\u0000\u0000\u0000"+
		"<\u027e\u0001\u0000\u0000\u0000>\u0289\u0001\u0000\u0000\u0000@\u0290"+
		"\u0001\u0000\u0000\u0000B\u0295\u0001\u0000\u0000\u0000D\u029f\u0001\u0000"+
		"\u0000\u0000F\u02a3\u0001\u0000\u0000\u0000H\u02b6\u0001\u0000\u0000\u0000"+
		"J\u02bd\u0001\u0000\u0000\u0000L\u02c7\u0001\u0000\u0000\u0000N\u02d2"+
		"\u0001\u0000\u0000\u0000P\u02d7\u0001\u0000\u0000\u0000R\u02de\u0001\u0000"+
		"\u0000\u0000T\u02e2\u0001\u0000\u0000\u0000V\u02fd\u0001\u0000\u0000\u0000"+
		"X\u0302\u0001\u0000\u0000\u0000Z\u0312\u0001\u0000\u0000\u0000\\\u0316"+
		"\u0001\u0000\u0000\u0000^\u0325\u0001\u0000\u0000\u0000`\u032a\u0001\u0000"+
		"\u0000\u0000b\u032c\u0001\u0000\u0000\u0000d\u0348\u0001\u0000\u0000\u0000"+
		"f\u034e\u0001\u0000\u0000\u0000h\u035b\u0001\u0000\u0000\u0000j\u035d"+
		"\u0001\u0000\u0000\u0000l\u035f\u0001\u0000\u0000\u0000no\u0003\u0004"+
		"\u0002\u0000op\u0003\u0006\u0003\u0000pq\u0005\u0001\u0000\u0000qr\u0003"+
		"\u001c\u000e\u0000rs\u0005\u0002\u0000\u0000st\u0003Z-\u0000t\u0001\u0001"+
		"\u0000\u0000\u0000uv\u0003\u0004\u0002\u0000vw\u0003\u0006\u0003\u0000"+
		"wx\u0005\u0001\u0000\u0000xy\u0003\u001c\u000e\u0000yz\u0005\u0002\u0000"+
		"\u0000z\u0003\u0001\u0000\u0000\u0000{|\u0005\u0003\u0000\u0000|\u007f"+
		"\u0005?\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0003\b\u0004\u0000\u0082\u0083"+
		"\u0003\u0006\u0003\u0000\u0083\u008e\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0005\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0003"+
		"\u0006\u0003\u0000\u0087\u008e\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0006\u0000\u0000\u0089\u008a\u0003\u0018\f\u0000\u008a\u008b\u0003\u0006"+
		"\u0003\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u0080\u0001\u0000\u0000\u0000\u008d\u0084\u0001\u0000"+
		"\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f\u0094\u0005?\u0000"+
		"\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091\u0093\u0005?\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005,\u0000\u0000\u0098\u0099\u0003\f\u0006\u0000\u0099"+
		"\u009a\u0003\u001a\r\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u008f"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\t\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005?\u0000\u0000\u00a0\u00a1\u0005&\u0000"+
		"\u0000\u00a1\u00a2\u0007\u0000\u0000\u0000\u00a2\u00a3\u0003\u001a\r\u0000"+
		"\u00a3\u00a4\u0003\n\u0005\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u000b\u0001\u0000\u0000\u0000\u00a8"+
		"\u00b8\u0003\u0014\n\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000\u00aa\u00ab"+
		"\u0005)\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007\u0000\u00ac\u00ad\u0005"+
		"(\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00b8\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\f\u0000\u0000\u00b0\u00b1\u0005)\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2\u00b3\u0005(\u0000\u0000"+
		"\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b8\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\r\u0000\u0000\u00b6\u00b8\u0003\u0016\u000b\u0000\u00b7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00a9\u0001\u0000\u0000\u0000\u00b7\u00af"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\r\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0007\u0001\u0000\u0000\u00ba\u000f\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c0\u0007\u0002\u0000\u0000\u00bc\u00bd\u0005"+
		"\'\u0000\u0000\u00bd\u00bf\u0007\u0002\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\'\u0000"+
		"\u0000\u00c4\u00c6\u00055\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d4\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cf\u00055\u0000\u0000\u00cb"+
		"\u00cc\u0005\'\u0000\u0000\u00cc\u00ce\u0007\u0001\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u00038\u001c\u0000\u00d3\u00bb\u0001\u0000\u0000\u0000\u00d3\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u0011\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\'\u0000\u0000\u00d6\u00d9\u0003\u0010"+
		"\b\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u0013\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00e1\u0003\u0016\u000b\u0000"+
		"\u00dc\u00e1\u0005\u000e\u0000\u0000\u00dd\u00e1\u0005\u000f\u0000\u0000"+
		"\u00de\u00e1\u0005\u0010\u0000\u0000\u00df\u00e1\u0005?\u0000\u0000\u00e0"+
		"\u00da\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005/\u0000\u0000\u00e3\u00e4\u0003\b\u0004\u0000\u00e4\u00e5"+
		"\u0005.\u0000\u0000\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"?\u0000\u0000\u00e7\u00e8\u0005,\u0000\u0000\u00e8\u00e9\u0003\f\u0006"+
		"\u0000\u00e9\u00ea\u0003\u0018\f\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u0019\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f1\u0005:\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u001b\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005?\u0000\u0000\u00f3\u00f4"+
		"\u0003(\u0014\u0000\u00f4\u00f5\u0003\u001a\r\u0000\u00f5\u00f6\u0003"+
		"\u001c\u000e\u0000\u00f6\u0124\u0001\u0000\u0000\u0000\u00f7\u0124\u0003"+
		"&\u0013\u0000\u00f8\u0124\u0003l6\u0000\u00f9\u0124\u0003\u001e\u000f"+
		"\u0000\u00fa\u0124\u0003 \u0010\u0000\u00fb\u0124\u0003\"\u0011\u0000"+
		"\u00fc\u0124\u0003$\u0012\u0000\u00fd\u00fe\u0005\u0011\u0000\u0000\u00fe"+
		"\u00ff\u00057\u0000\u0000\u00ff\u0100\u00032\u0019\u0000\u0100\u0102\u0005"+
		"6\u0000\u0000\u0101\u0103\u0005:\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0003\u001c\u000e\u0000\u0105\u0124\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\u0012\u0000\u0000\u0107\u0108\u00057\u0000\u0000"+
		"\u0108\u0109\u0003,\u0016\u0000\u0109\u010b\u00056\u0000\u0000\u010a\u010c"+
		"\u0005:\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"\u001c\u000e\u0000\u010e\u0124\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u0013\u0000\u0000\u0110\u0111\u00057\u0000\u0000\u0111\u0112\u0003,\u0016"+
		"\u0000\u0112\u0114\u00056\u0000\u0000\u0113\u0115\u0005:\u0000\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u001c\u000e\u0000\u0117"+
		"\u0124\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0014\u0000\u0000\u0119"+
		"\u011a\u00057\u0000\u0000\u011a\u011c\u00056\u0000\u0000\u011b\u011d\u0005"+
		":\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0124\u0003\u001c"+
		"\u000e\u0000\u011f\u0120\u0003l6\u0000\u0120\u0121\u0003\u001c\u000e\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u00f2\u0001\u0000\u0000\u0000\u0123\u00f7\u0001\u0000\u0000\u0000"+
		"\u0123\u00f8\u0001\u0000\u0000\u0000\u0123\u00f9\u0001\u0000\u0000\u0000"+
		"\u0123\u00fa\u0001\u0000\u0000\u0000\u0123\u00fb\u0001\u0000\u0000\u0000"+
		"\u0123\u00fc\u0001\u0000\u0000\u0000\u0123\u00fd\u0001\u0000\u0000\u0000"+
		"\u0123\u0106\u0001\u0000\u0000\u0000\u0123\u010f\u0001\u0000\u0000\u0000"+
		"\u0123\u0118\u0001\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u001d\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u0015\u0000\u0000\u0126\u0127\u00057\u0000\u0000\u0127"+
		"\u0128\u00038\u001c\u0000\u0128\u0129\u00056\u0000\u0000\u0129\u012a\u0005"+
		"/\u0000\u0000\u012a\u012b\u0003\u001c\u000e\u0000\u012b\u012d\u0005.\u0000"+
		"\u0000\u012c\u012e\u0005:\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0003\u001c\u000e\u0000\u0130\u001f\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0005\u0016\u0000\u0000\u0132\u0133\u0003\u001c\u000e\u0000"+
		"\u0133\u0134\u0005\u0017\u0000\u0000\u0134\u0135\u00057\u0000\u0000\u0135"+
		"\u0136\u00038\u001c\u0000\u0136\u0138\u00056\u0000\u0000\u0137\u0139\u0005"+
		":\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0003\u001c"+
		"\u000e\u0000\u013b!\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0018\u0000"+
		"\u0000\u013d\u013e\u0005/\u0000\u0000\u013e\u013f\u0003N\'\u0000\u013f"+
		"\u0140\u0005\u0019\u0000\u0000\u0140\u0141\u0003\u001c\u000e\u0000\u0141"+
		"\u0143\u0005.\u0000\u0000\u0142\u0144\u0005:\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0003\u001c\u000e\u0000\u0146#\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\u001a\u0000\u0000\u0148\u0149\u0005?\u0000"+
		"\u0000\u0149\u014a\u0005&\u0000\u0000\u014a\u014b\u00038\u001c\u0000\u014b"+
		"\u014c\u0005\u0017\u0000\u0000\u014c\u014d\u00038\u001c\u0000\u014d\u014e"+
		"\u0003R)\u0000\u014e\u014f\u0005/\u0000\u0000\u014f\u0150\u0003\u001c"+
		"\u000e\u0000\u0150\u0152\u0005.\u0000\u0000\u0151\u0153\u0005:\u0000\u0000"+
		"\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0003\u001c\u000e\u0000"+
		"\u0155%\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u001b\u0000\u0000\u0157"+
		"\u0158\u00057\u0000\u0000\u0158\u0159\u00038\u001c\u0000\u0159\u015a\u0005"+
		"6\u0000\u0000\u015a\u015b\u0005/\u0000\u0000\u015b\u015c\u0003\u001c\u000e"+
		"\u0000\u015c\u015d\u0003J%\u0000\u015d\u015f\u0005.\u0000\u0000\u015e"+
		"\u0160\u0005:\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0003\u001c\u000e\u0000\u0162\'\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"9\u0000\u0000\u0164\u0166\u0005?\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u00036\u001b\u0000"+
		"\u016b\u016c\u0003*\u0015\u0000\u016c\u019d\u0001\u0000\u0000\u0000\u016d"+
		"\u016f\u00036\u001b\u0000\u016e\u0170\u00038\u001c\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u0005A\u0000\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u019d\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u00036\u001b\u0000\u0175\u0176\u00057\u0000\u0000"+
		"\u0176\u0177\u00038\u001c\u0000\u0177\u017f\u00056\u0000\u0000\u0178\u0179"+
		"\u0003<\u001e\u0000\u0179\u017a\u00057\u0000\u0000\u017a\u017b\u00038"+
		"\u001c\u0000\u017b\u017c\u00056\u0000\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u019d\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005)\u0000\u0000\u0183\u0184\u0003\u0010\b\u0000"+
		"\u0184\u0185\u0005(\u0000\u0000\u0185\u0186\u00036\u001b\u0000\u0186\u0187"+
		"\u00038\u001c\u0000\u0187\u019d\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"9\u0000\u0000\u0189\u018b\u0005?\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005)\u0000\u0000"+
		"\u0190\u0191\u0003\u000e\u0007\u0000\u0191\u0196\u0005(\u0000\u0000\u0192"+
		"\u0193\u00059\u0000\u0000\u0193\u0195\u0005?\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019a\u0003"+
		"6\u001b\u0000\u019a\u019b\u00038\u001c\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u0167\u0001\u0000\u0000\u0000\u019c\u016d\u0001\u0000\u0000"+
		"\u0000\u019c\u0174\u0001\u0000\u0000\u0000\u019c\u0182\u0001\u0000\u0000"+
		"\u0000\u019c\u018c\u0001\u0000\u0000\u0000\u019d)\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\u001c\u0000\u0000\u019f\u01a0\u00038\u001c\u0000\u01a0"+
		"+\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003\\.\u0000\u01a2\u01a7\u0005"+
		"?\u0000\u0000\u01a3\u01a4\u0005\'\u0000\u0000\u01a4\u01a6\u0005?\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005,\u0000\u0000\u01ab\u01ad\u0003\u0014\n\u0000"+
		"\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b3\u0005:\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0003,\u0016\u0000\u01b5\u01b9\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0005A\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01a1\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9-\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005)\u0000"+
		"\u0000\u01bb\u01bc\u00030\u0018\u0000\u01bc\u01bd\u0005(\u0000\u0000\u01bd"+
		"\u01c2\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\'\u0000\u0000\u01bf\u01c2"+
		"\u0003,\u0016\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01ba\u0001"+
		"\u0000\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2/\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007\u0002"+
		"\u0000\u0000\u01c41\u0001\u0000\u0000\u0000\u01c5\u01cb\u0005?\u0000\u0000"+
		"\u01c6\u01cb\u0005@\u0000\u0000\u01c7\u01cb\u0005A\u0000\u0000\u01c8\u01cb"+
		"\u0003l6\u0000\u01c9\u01cb\u00038\u001c\u0000\u01ca\u01c5\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01d6\u0001\u0000\u0000\u0000\u01cc\u01d2\u0005\'\u0000"+
		"\u0000\u01cd\u01d3\u0005?\u0000\u0000\u01ce\u01d3\u0005@\u0000\u0000\u01cf"+
		"\u01d3\u00038\u001c\u0000\u01d0\u01d3\u0005A\u0000\u0000\u01d1\u01d3\u0003"+
		"l6\u0000\u01d2\u01cd\u0001\u0000\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d73\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\'\u0000\u0000\u01da\u01dd\u00032\u0019\u0000\u01db"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000\u01dc"+
		"\u01db\u0001\u0000\u0000\u0000\u01dd5\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0007\u0003\u0000\u0000\u01df7\u0001\u0000\u0000\u0000\u01e0\u01e4\u0005"+
		"?\u0000\u0000\u01e1\u01e4\u0003l6\u0000\u01e2\u01e4\u0005A\u0000\u0000"+
		"\u01e3\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01fd\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0003H$\u0000\u01e6\u01e7\u0005?\u0000\u0000\u01e7\u01fc"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003H$\u0000\u01e9\u01ea\u0005@"+
		"\u0000\u0000\u01ea\u01fc\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003H$\u0000"+
		"\u01ec\u01ed\u0003l6\u0000\u01ed\u01fc\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0003H$\u0000\u01ef\u01f0\u0005A\u0000\u0000\u01f0\u01fc\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u00059\u0000\u0000\u01f2\u01f8\u0005?\u0000\u0000"+
		"\u01f3\u01f4\u0003H$\u0000\u01f4\u01f5\u00038\u001c\u0000\u01f5\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f3\u0001\u0000\u0000\u0000\u01f7\u01fa"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fb\u01e5\u0001\u0000\u0000\u0000\u01fb\u01e8"+
		"\u0001\u0000\u0000\u0000\u01fb\u01eb\u0001\u0000\u0000\u0000\u01fb\u01ee"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f1\u0001\u0000\u0000\u0000\u01fc\u01ff"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u0216\u0001\u0000\u0000\u0000\u01ff\u01fd"+
		"\u0001\u0000\u0000\u0000\u0200\u0203\u0005)\u0000\u0000\u0201\u0204\u0003"+
		"\u0010\b\u0000\u0202\u0204\u0003\u000e\u0007\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u020b\u0005(\u0000\u0000\u0206\u0207\u0003H$\u0000"+
		"\u0207\u0208\u0005@\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209"+
		"\u0206\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b"+
		"\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u0213\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0003H$\u0000\u020f\u0210\u0005?\u0000\u0000\u0210\u0212\u0001"+
		"\u0000\u0000\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0212\u0215\u0001"+
		"\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u0200\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u025b\u0001\u0000\u0000\u0000\u0218\u0219\u0005"+
		"7\u0000\u0000\u0219\u021a\u00038\u001c\u0000\u021a\u0220\u00056\u0000"+
		"\u0000\u021b\u021c\u0003H$\u0000\u021c\u021d\u0005?\u0000\u0000\u021d"+
		"\u021f\u0001\u0000\u0000\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021f"+
		"\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u0221\u0228\u0001\u0000\u0000\u0000\u0222"+
		"\u0220\u0001\u0000\u0000\u0000\u0223\u0224\u0003H$\u0000\u0224\u0225\u0005"+
		"@\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226\u0223\u0001\u0000"+
		"\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u0230\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0003H$\u0000"+
		"\u022c\u022d\u0003l6\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022b"+
		"\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0238"+
		"\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0003H$\u0000\u0234\u0235\u00038\u001c\u0000\u0235\u0237\u0001\u0000"+
		"\u0000\u0000\u0236\u0233\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000"+
		"\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u025b\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000"+
		"\u0000\u0000\u023b\u0241\u0005@\u0000\u0000\u023c\u023d\u0003H$\u0000"+
		"\u023d\u023e\u0005?\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f"+
		"\u023c\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241"+
		"\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0249\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0003H$\u0000\u0245\u0246\u0005@\u0000\u0000\u0246\u0248\u0001"+
		"\u0000\u0000\u0000\u0247\u0244\u0001\u0000\u0000\u0000\u0248\u024b\u0001"+
		"\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u0251\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0003H$\u0000\u024d\u024e\u0003l6\u0000"+
		"\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u024c\u0001\u0000\u0000\u0000"+
		"\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u025b\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0255\u0005/\u0000\u0000\u0255"+
		"\u0256\u0003:\u001d\u0000\u0256\u0257\u0005.\u0000\u0000\u0257\u025b\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005\u001c\u0000\u0000\u0259\u025b\u0003"+
		"8\u001c\u0000\u025a\u01e3\u0001\u0000\u0000\u0000\u025a\u0218\u0001\u0000"+
		"\u0000\u0000\u025a\u023b\u0001\u0000\u0000\u0000\u025a\u0254\u0001\u0000"+
		"\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b9\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0005/\u0000\u0000\u025d\u025e\u0003:\u001d\u0000\u025e"+
		"\u0263\u0005.\u0000\u0000\u025f\u0260\u0005\'\u0000\u0000\u0260\u0262"+
		"\u0003:\u001d\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0265\u0001"+
		"\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001"+
		"\u0000\u0000\u0000\u0264\u0277\u0001\u0000\u0000\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0266\u026b\u0005A\u0000\u0000\u0267\u0268\u0005\'"+
		"\u0000\u0000\u0268\u026a\u0003:\u001d\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u0277\u0001\u0000\u0000"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026e\u0273\u0005@\u0000\u0000"+
		"\u026f\u0270\u0005\'\u0000\u0000\u0270\u0272\u0003:\u001d\u0000\u0271"+
		"\u026f\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000\u0273"+
		"\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276"+
		"\u025c\u0001\u0000\u0000\u0000\u0276\u0266\u0001\u0000\u0000\u0000\u0276"+
		"\u026e\u0001\u0000\u0000\u0000\u0277;\u0001\u0000\u0000\u0000\u0278\u0279"+
		"\u0005\u001d\u0000\u0000\u0279\u027f\u00038\u001c\u0000\u027a\u027b\u0005"+
		"\u001e\u0000\u0000\u027b\u027f\u00038\u001c\u0000\u027c\u027d\u0005?\u0000"+
		"\u0000\u027d\u027f\u0003D\"\u0000\u027e\u0278\u0001\u0000\u0000\u0000"+
		"\u027e\u027a\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027f=\u0001\u0000\u0000\u0000\u0280\u0281\u0005@\u0000\u0000\u0281\u028a"+
		"\u0003B!\u0000\u0282\u0283\u0005A\u0000\u0000\u0283\u028a\u0003B!\u0000"+
		"\u0284\u0285\u0005/\u0000\u0000\u0285\u0286\u0003@ \u0000\u0286\u0287"+
		"\u0005.\u0000\u0000\u0287\u0288\u0003B!\u0000\u0288\u028a\u0001\u0000"+
		"\u0000\u0000\u0289\u0280\u0001\u0000\u0000\u0000\u0289\u0282\u0001\u0000"+
		"\u0000\u0000\u0289\u0284\u0001\u0000\u0000\u0000\u028a?\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005@\u0000\u0000\u028c\u0291\u0003B!\u0000\u028d"+
		"\u028e\u0005A\u0000\u0000\u028e\u0291\u0003B!\u0000\u028f\u0291\u0001"+
		"\u0000\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u028d\u0001"+
		"\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291A\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0005\'\u0000\u0000\u0293\u0296\u0003>\u001f"+
		"\u0000\u0294\u0296\u0001\u0000\u0000\u0000\u0295\u0292\u0001\u0000\u0000"+
		"\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296C\u0001\u0000\u0000\u0000"+
		"\u0297\u0298\u0005<\u0000\u0000\u0298\u02a0\u0003F#\u0000\u0299\u029a"+
		"\u0003H$\u0000\u029a\u029b\u00038\u001c\u0000\u029b\u02a0\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u00055\u0000\u0000\u029d\u02a0\u0003F#\u0000"+
		"\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u0297\u0001\u0000\u0000\u0000"+
		"\u029f\u0299\u0001\u0000\u0000\u0000\u029f\u029c\u0001\u0000\u0000\u0000"+
		"\u029f\u029e\u0001\u0000\u0000\u0000\u02a0E\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a4\u0003f3\u0000\u02a2\u02a4\u0005@\u0000\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4G\u0001\u0000"+
		"\u0000\u0000\u02a5\u02b7\u00050\u0000\u0000\u02a6\u02b7\u00051\u0000\u0000"+
		"\u02a7\u02b7\u00052\u0000\u0000\u02a8\u02b7\u00053\u0000\u0000\u02a9\u02b7"+
		"\u0005-\u0000\u0000\u02aa\u02b7\u0005<\u0000\u0000\u02ab\u02b7\u0005;"+
		"\u0000\u0000\u02ac\u02b7\u00058\u0000\u0000\u02ad\u02b7\u00055\u0000\u0000"+
		"\u02ae\u02b7\u00054\u0000\u0000\u02af\u02b7\u0005+\u0000\u0000\u02b0\u02b7"+
		"\u0005\u001d\u0000\u0000\u02b1\u02b3\u0005\u001e\u0000\u0000\u02b2\u02b4"+
		"\u0005\u001f\u0000\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b7"+
		"\u0005*\u0000\u0000\u02b6\u02a5\u0001\u0000\u0000\u0000\u02b6\u02a6\u0001"+
		"\u0000\u0000\u0000\u02b6\u02a7\u0001\u0000\u0000\u0000\u02b6\u02a8\u0001"+
		"\u0000\u0000\u0000\u02b6\u02a9\u0001\u0000\u0000\u0000\u02b6\u02aa\u0001"+
		"\u0000\u0000\u0000\u02b6\u02ab\u0001\u0000\u0000\u0000\u02b6\u02ac\u0001"+
		"\u0000\u0000\u0000\u02b6\u02ad\u0001\u0000\u0000\u0000\u02b6\u02ae\u0001"+
		"\u0000\u0000\u0000\u02b6\u02af\u0001\u0000\u0000\u0000\u02b6\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b1\u0001\u0000\u0000\u0000\u02b6\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b7I\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005\u0019"+
		"\u0000\u0000\u02b9\u02ba\u0003L&\u0000\u02ba\u02bb\u0003J%\u0000\u02bb"+
		"\u02be\u0001\u0000\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd"+
		"\u02b8\u0001\u0000\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02be"+
		"K\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005\u001b\u0000\u0000\u02c0\u02c1"+
		"\u00057\u0000\u0000\u02c1\u02c2\u00038\u001c\u0000\u02c2\u02c3\u00056"+
		"\u0000\u0000\u02c3\u02c4\u0003J%\u0000\u02c4\u02c5\u0003\u001c\u000e\u0000"+
		"\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c8\u0003\u001c\u000e\u0000"+
		"\u02c7\u02bf\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c8M\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005 \u0000\u0000\u02ca\u02cb"+
		"\u00057\u0000\u0000\u02cb\u02cc\u00038\u001c\u0000\u02cc\u02cd\u0003P"+
		"(\u0000\u02cd\u02ce\u00056\u0000\u0000\u02ce\u02cf\u0003\u001c\u000e\u0000"+
		"\u02cf\u02d0\u0003N\'\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d2\u02c9\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d3O\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0005\u001e\u0000\u0000\u02d5\u02d8\u00038\u001c\u0000\u02d6\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d8Q\u0001\u0000\u0000\u0000\u02d9\u02da\u0005!\u0000"+
		"\u0000\u02da\u02db\u0003T*\u0000\u02db\u02dc\u00038\u001c\u0000\u02dc"+
		"\u02df\u0001\u0000\u0000\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de"+
		"\u02d9\u0001\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df"+
		"S\u0001\u0000\u0000\u0000\u02e0\u02e3\u0005;\u0000\u0000\u02e1\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e3U\u0001\u0000\u0000\u0000\u02e4\u02e9\u0005@\u0000"+
		"\u0000\u02e5\u02e6\u0005\'\u0000\u0000\u02e6\u02e8\u0007\u0004\u0000\u0000"+
		"\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000"+
		"\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ea\u02fe\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ec\u02f1\u0005A\u0000\u0000\u02ed\u02ee\u0005\'\u0000\u0000\u02ee"+
		"\u02f0\u0007\u0004\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f2\u02fe\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f9\u0005?\u0000\u0000\u02f5\u02f6"+
		"\u0005\'\u0000\u0000\u02f6\u02f8\u0007\u0004\u0000\u0000\u02f7\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fd\u02e4\u0001\u0000\u0000\u0000\u02fd\u02ec\u0001"+
		"\u0000\u0000\u0000\u02fd\u02f4\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001"+
		"\u0000\u0000\u0000\u02feW\u0001\u0000\u0000\u0000\u02ff\u0300\u0005\'"+
		"\u0000\u0000\u0300\u0303\u0003V+\u0000\u0301\u0303\u0001\u0000\u0000\u0000"+
		"\u0302\u02ff\u0001\u0000\u0000\u0000\u0302\u0301\u0001\u0000\u0000\u0000"+
		"\u0303Y\u0001\u0000\u0000\u0000\u0304\u0305\u0005\"\u0000\u0000\u0305"+
		"\u0306\u0005?\u0000\u0000\u0306\u0308\u00057\u0000\u0000\u0307\u0309\u0003"+
		",\u0016\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u00056\u0000"+
		"\u0000\u030b\u030d\u0003b1\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0003\u0002\u0001\u0000\u030f\u0310\u0003Z-\u0000\u0310\u0313\u0001"+
		"\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0304\u0001"+
		"\u0000\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313[\u0001\u0000"+
		"\u0000\u0000\u0314\u0317\u0005#\u0000\u0000\u0315\u0317\u0001\u0000\u0000"+
		"\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0315\u0001\u0000\u0000"+
		"\u0000\u0317]\u0001\u0000\u0000\u0000\u0318\u031d\u0005?\u0000\u0000\u0319"+
		"\u031a\u0005\'\u0000\u0000\u031a\u031c\u0005?\u0000\u0000\u031b\u0319"+
		"\u0001\u0000\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b"+
		"\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320"+
		"\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0005,\u0000\u0000\u0321\u0322\u0003\f\u0006\u0000\u0322\u0323\u0003"+
		"`0\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000"+
		"\u0000\u0325\u0318\u0001\u0000\u0000\u0000\u0325\u0324\u0001\u0000\u0000"+
		"\u0000\u0326_\u0001\u0000\u0000\u0000\u0327\u0328\u0005:\u0000\u0000\u0328"+
		"\u032b\u0003^/\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0327\u0001"+
		"\u0000\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032ba\u0001\u0000"+
		"\u0000\u0000\u032c\u032d\u0005$\u0000\u0000\u032d\u032e\u0003\u0014\n"+
		"\u0000\u032e\u032f\u0003\u0006\u0003\u0000\u032f\u0330\u0005\u0001\u0000"+
		"\u0000\u0330\u0331\u0003\u001c\u000e\u0000\u0331\u0332\u0005$\u0000\u0000"+
		"\u0332\u0333\u00057\u0000\u0000\u0333\u0334\u00038\u001c\u0000\u0334\u0335"+
		"\u00056\u0000\u0000\u0335\u0336\u0005\u0002\u0000\u0000\u0336\u0337\u0003"+
		"d2\u0000\u0337\u0338\u0005\u0001\u0000\u0000\u0338\u0339\u0003\u001c\u000e"+
		"\u0000\u0339\u033a\u0005\u0002\u0000\u0000\u033ac\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u0005\u0004\u0000\u0000\u033c\u033d\u0003\b\u0004\u0000\u033d"+
		"\u033e\u0003\u0006\u0003\u0000\u033e\u0349\u0001\u0000\u0000\u0000\u033f"+
		"\u0340\u0005\u0005\u0000\u0000\u0340\u0341\u0003\n\u0005\u0000\u0341\u0342"+
		"\u0003\u0006\u0003\u0000\u0342\u0349\u0001\u0000\u0000\u0000\u0343\u0344"+
		"\u0005\u0006\u0000\u0000\u0344\u0345\u0003\u0018\f\u0000\u0345\u0346\u0003"+
		"\u0006\u0003\u0000\u0346\u0349\u0001\u0000\u0000\u0000\u0347\u0349\u0001"+
		"\u0000\u0000\u0000\u0348\u033b\u0001\u0000\u0000\u0000\u0348\u033f\u0001"+
		"\u0000\u0000\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0348\u0347\u0001"+
		"\u0000\u0000\u0000\u0349e\u0001\u0000\u0000\u0000\u034a\u034b\u0005?\u0000"+
		"\u0000\u034b\u034f\u0003h4\u0000\u034c\u034d\u0005%\u0000\u0000\u034d"+
		"\u034f\u0003h4\u0000\u034e\u034a\u0001\u0000\u0000\u0000\u034e\u034c\u0001"+
		"\u0000\u0000\u0000\u034fg\u0001\u0000\u0000\u0000\u0350\u0351\u00057\u0000"+
		"\u0000\u0351\u0352\u0003j5\u0000\u0352\u0353\u00056\u0000\u0000\u0353"+
		"\u035c\u0001\u0000\u0000\u0000\u0354\u0355\u0005)\u0000\u0000\u0355\u0356"+
		"\u0003j5\u0000\u0356\u0357\u0005(\u0000\u0000\u0357\u035c\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u00058\u0000\u0000\u0359\u035c\u0003j5\u0000"+
		"\u035a\u035c\u0001\u0000\u0000\u0000\u035b\u0350\u0001\u0000\u0000\u0000"+
		"\u035b\u0354\u0001\u0000\u0000\u0000\u035b\u0358\u0001\u0000\u0000\u0000"+
		"\u035b\u035a\u0001\u0000\u0000\u0000\u035ci\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0007\u0002\u0000\u0000\u035ek\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0005?\u0000\u0000\u0360\u0362\u00057\u0000\u0000\u0361\u0363\u00038"+
		"\u001c\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363\u0368\u0001\u0000\u0000\u0000\u0364\u0365\u0005\'\u0000"+
		"\u0000\u0365\u0367\u00038\u001c\u0000\u0366\u0364\u0001\u0000\u0000\u0000"+
		"\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000\u0000"+
		"\u036a\u0368\u0001\u0000\u0000\u0000\u036b\u036d\u0003V+\u0000\u036c\u036b"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036e"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u00056\u0000\u0000\u036fm\u0001\u0000"+
		"\u0000\u0000\\~\u008d\u0094\u009d\u00a6\u00b7\u00c0\u00c7\u00cf\u00d3"+
		"\u00d8\u00e0\u00ec\u00f0\u0102\u010b\u0114\u011c\u0123\u012d\u0138\u0143"+
		"\u0152\u015f\u0167\u016f\u0172\u017f\u018c\u0196\u019c\u01a7\u01ae\u01b2"+
		"\u01b8\u01c1\u01ca\u01d2\u01d6\u01dc\u01e3\u01f8\u01fb\u01fd\u0203\u020b"+
		"\u0213\u0216\u0220\u0228\u0230\u0238\u0241\u0249\u0251\u025a\u0263\u026b"+
		"\u0273\u0276\u027e\u0289\u0290\u0295\u029f\u02a3\u02b3\u02b6\u02bd\u02c7"+
		"\u02d2\u02d7\u02de\u02e2\u02e9\u02f1\u02f9\u02fd\u0302\u0308\u030c\u0312"+
		"\u0316\u031d\u0325\u032a\u0348\u034e\u035b\u0362\u0368\u036c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}