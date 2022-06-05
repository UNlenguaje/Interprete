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
		RULE_var = 4, RULE_const = 5, RULE_const2 = 6, RULE_rmt = 7, RULE_vector = 8, 
		RULE_matriz = 9, RULE_matriz2 = 10, RULE_tipodato = 11, RULE_registro = 12, 
		RULE_tipos = 13, RULE_pc = 14, RULE_sentencias = 15, RULE_mientras = 16, 
		RULE_repetir = 17, RULE_eval = 18, RULE_desde = 19, RULE_si = 20, RULE_idsentencia = 21, 
		RULE_int = 22, RULE_leer = 23, RULE_leer2 = 24, RULE_leer3 = 25, RULE_imprimir = 26, 
		RULE_imprimir2 = 27, RULE_asigid = 28, RULE_expre = 29, RULE_llaves = 30, 
		RULE_logic = 31, RULE_lista = 32, RULE_lista3 = 33, RULE_lista2 = 34, 
		RULE_expre2 = 35, RULE_expre3 = 36, RULE_oper = 37, RULE_else = 38, RULE_sielse = 39, 
		RULE_caso = 40, RULE_and = 41, RULE_incremento = 42, RULE_negativo = 43, 
		RULE_argumentos = 44, RULE_argumentos2 = 45, RULE_subrutinas = 46, RULE_ref = 47, 
		RULE_expreSUB = 48, RULE_expreSUB2 = 49, RULE_valoref = 50, RULE_refSUB = 51, 
		RULE_idV = 52, RULE_idV2 = 53, RULE_vectordef = 54, RULE_funciones = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "inicio2", "prog", "especificacion", "var", "const", "const2", 
			"rmt", "vector", "matriz", "matriz2", "tipodato", "registro", "tipos", 
			"pc", "sentencias", "mientras", "repetir", "eval", "desde", "si", "idsentencia", 
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitInicio(this);
		}
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
			setState(112);
			prog();
			setState(113);
			especificacion();
			setState(114);
			match(T__0);
			setState(115);
			sentencias();
			setState(116);
			match(T__1);
			setState(117);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterInicio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitInicio2(this);
		}
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
			setState(119);
			prog();
			setState(120);
			especificacion();
			setState(121);
			match(T__0);
			setState(122);
			sentencias();
			setState(123);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitProg(this);
		}
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__2);
				setState(126);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterEspecificacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitEspecificacion(this);
		}
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__3);
				setState(131);
				var();
				setState(132);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__4);
				setState(135);
				const_();
				setState(136);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__5);
				setState(139);
				tipos();
				setState(140);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitVar(this);
		}
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(ID);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(146);
					match(TK_COMA);
					setState(147);
					match(ID);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(TK_DOS_PUNTOS);
				setState(154);
				rmt();
				setState(155);
				pc();
				setState(156);
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
		public Const2Context const2() {
			return getRuleContext(Const2Context.class,0);
		}
		public PcContext pc() {
			return getRuleContext(PcContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(ID);
				setState(162);
				match(TK_ASIGNACION);
				setState(163);
				const2();
				setState(164);
				pc();
				setState(165);
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

	public static class Const2Context extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(LenguajeParser.TK_NUMERO, 0); }
		public TerminalNode TK_CADENA() { return getToken(LenguajeParser.TK_CADENA, 0); }
		public Const2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterConst2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitConst2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitConst2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const2Context const2() throws RecognitionException {
		Const2Context _localctx = new Const2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_const2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (TK_NUMERO - 7)) | (1L << (TK_CADENA - 7)))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RmtContext rmt() throws RecognitionException {
		RmtContext _localctx = new RmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rmt);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				tipodato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__10);
				setState(174);
				match(TK_CORCHETE_IZQUIERDO);
				setState(175);
				vector();
				setState(176);
				match(TK_CORCHETE_DERECHO);
				setState(177);
				tipodato();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__11);
				setState(180);
				match(TK_CORCHETE_IZQUIERDO);
				setState(181);
				matriz();
				setState(182);
				match(TK_CORCHETE_DERECHO);
				setState(183);
				tipodato();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(T__12);
				setState(186);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matriz);
		int _la;
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(TK_NUMERO);
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						match(TK_COMA);
						setState(193);
						match(TK_NUMERO);
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(199);
					match(TK_COMA);
					setState(200);
					match(TK_MULTIPLICACION);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(TK_MULTIPLICACION);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(207);
					match(TK_COMA);
					setState(208);
					match(TK_MULTIPLICACION);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMatriz2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMatriz2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMatriz2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matriz2Context matriz2() throws RecognitionException {
		Matriz2Context _localctx = new Matriz2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_matriz2);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(TK_COMA);
				setState(218);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterTipodato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitTipodato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipodato);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__12);
				setState(223);
				registro();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(T__15);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TK_LLAVE_IZQUIERDA);
			setState(231);
			var();
			setState(232);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipos);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ID);
				setState(235);
				match(TK_DOS_PUNTOS);
				setState(236);
				rmt();
				setState(237);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterPc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitPc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitPc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PcContext pc() throws RecognitionException {
		PcContext _localctx = new PcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pc);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_y_coma:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
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
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentencias);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(ID);
				setState(247);
				idsentencia();
				setState(248);
				pc();
				setState(249);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				si();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				mientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				eval();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				desde();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				match(T__16);
				setState(257);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(258);
				imprimir();
				setState(259);
				match(TK_PARENTESIS_DERECHO);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(260);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(263);
				sentencias();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				match(T__17);
				setState(266);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(267);
				leer();
				setState(268);
				match(TK_PARENTESIS_DERECHO);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(269);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(272);
				sentencias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				match(T__18);
				setState(275);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(276);
				leer();
				setState(277);
				match(TK_PARENTESIS_DERECHO);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(278);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(281);
				sentencias();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				match(T__19);
				setState(284);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(285);
				match(TK_PARENTESIS_DERECHO);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(286);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(289);
				sentencias();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(290);
				funciones();
				setState(291);
				sentencias();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__20);
			setState(297);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(298);
			expre();
			setState(299);
			match(TK_PARENTESIS_DERECHO);
			setState(300);
			match(TK_LLAVE_IZQUIERDA);
			setState(301);
			sentencias();
			setState(302);
			match(TK_LLAVE_DERECHA);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(303);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(306);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__21);
			setState(309);
			sentencias();
			setState(310);
			match(T__22);
			setState(311);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(312);
			expre();
			setState(313);
			match(TK_PARENTESIS_DERECHO);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(314);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(317);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__23);
			setState(320);
			match(TK_LLAVE_IZQUIERDA);
			setState(321);
			caso();
			setState(322);
			match(T__24);
			setState(323);
			sentencias();
			setState(324);
			match(TK_LLAVE_DERECHA);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(325);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(328);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__25);
			setState(331);
			match(ID);
			setState(332);
			match(TK_ASIGNACION);
			setState(333);
			expre();
			setState(334);
			match(T__22);
			setState(335);
			expre();
			setState(336);
			incremento();
			setState(337);
			match(TK_LLAVE_IZQUIERDA);
			setState(338);
			sentencias();
			setState(339);
			match(TK_LLAVE_DERECHA);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(340);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(343);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__26);
			setState(346);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(347);
			expre();
			setState(348);
			match(TK_PARENTESIS_DERECHO);
			setState(349);
			match(TK_LLAVE_IZQUIERDA);
			setState(350);
			sentencias();
			setState(351);
			else_();
			setState(352);
			match(TK_LLAVE_DERECHA);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(353);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(356);
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
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public List<TerminalNode> TK_PUNTO() { return getTokens(LenguajeParser.TK_PUNTO); }
		public TerminalNode TK_PUNTO(int i) {
			return getToken(LenguajeParser.TK_PUNTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeParser.ID, i);
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
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(LenguajeParser.TK_CORCHETE_DERECHO, 0); }
		public IdsentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idsentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIdsentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIdsentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdsentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsentenciaContext idsentencia() throws RecognitionException {
		IdsentenciaContext _localctx = new IdsentenciaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idsentencia);
		int _la;
		try {
			int _alt;
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(358);
					match(TK_PUNTO);
					setState(359);
					match(ID);
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				asigid();
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(366);
					match(T__27);
					setState(367);
					expre();
					}
					break;
				case 2:
					{
					setState(368);
					expre();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				asigid();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(372);
					expre();
					}
					break;
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CADENA) {
					{
					setState(375);
					match(TK_CADENA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				asigid();
				setState(379);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(380);
				expre();
				setState(381);
				match(TK_PARENTESIS_DERECHO);
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						logic();
						setState(383);
						match(TK_PARENTESIS_IZQUIERDO);
						setState(384);
						expre();
						setState(385);
						match(TK_PARENTESIS_DERECHO);
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__27);
				setState(415);
				expre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_leer);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				ref();
				setState(420);
				match(ID);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(421);
					match(TK_COMA);
					setState(422);
					match(ID);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_DOS_PUNTOS) {
					{
					{
					setState(428);
					match(TK_DOS_PUNTOS);
					setState(429);
					tipodato();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(435);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(438);
				leer();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLeer2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLeer2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer2Context leer2() throws RecognitionException {
		Leer2Context _localctx = new Leer2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_leer2);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(TK_CORCHETE_IZQUIERDO);
				setState(445);
				leer3();
				setState(446);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(TK_COMA);
				setState(449);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLeer3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLeer3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLeer3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer3Context leer3() throws RecognitionException {
		Leer3Context _localctx = new Leer3Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_leer3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		public List<TerminalNode> TK_COMA() { return getTokens(LenguajeParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(LenguajeParser.TK_COMA, i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(455);
				match(ID);
				}
				break;
			case 2:
				{
				setState(456);
				match(TK_NUMERO);
				}
				break;
			case 3:
				{
				setState(457);
				match(TK_CADENA);
				}
				break;
			case 4:
				{
				setState(458);
				funciones();
				}
				break;
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(461);
				match(TK_COMA);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(462);
					match(ID);
					}
					break;
				case 2:
					{
					setState(463);
					match(TK_NUMERO);
					}
					break;
				case 3:
					{
					setState(464);
					match(TK_CADENA);
					}
					break;
				case 4:
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterImprimir2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitImprimir2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imprimir2Context imprimir2() throws RecognitionException {
		Imprimir2Context _localctx = new Imprimir2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_imprimir2);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterAsigid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitAsigid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAsigid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigidContext asigid() throws RecognitionException {
		AsigidContext _localctx = new AsigidContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asigid);
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
		public List<TerminalNode> TK_CADENA() { return getTokens(LenguajeParser.TK_CADENA); }
		public TerminalNode TK_CADENA(int i) {
			return getToken(LenguajeParser.TK_CADENA, i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreContext expre() throws RecognitionException {
		ExpreContext _localctx = new ExpreContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expre);
		try {
			int _alt;
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
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
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(506);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(484);
							oper();
							setState(485);
							match(ID);
							}
							break;
						case 2:
							{
							setState(487);
							oper();
							setState(488);
							match(TK_NUMERO);
							}
							break;
						case 3:
							{
							setState(490);
							oper();
							setState(491);
							funciones();
							}
							break;
						case 4:
							{
							setState(493);
							oper();
							setState(494);
							match(TK_CADENA);
							}
							break;
						case 5:
							{
							setState(496);
							match(TK_PUNTO);
							setState(497);
							match(ID);
							setState(503);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(498);
									oper();
									setState(499);
									expre();
									}
									} 
								}
								setState(505);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
							}
							}
							break;
						}
						} 
					}
					setState(510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(511);
					match(TK_CORCHETE_IZQUIERDO);
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(512);
						matriz();
						}
						break;
					case 2:
						{
						setState(513);
						vector();
						}
						break;
					}
					setState(516);
					match(TK_CORCHETE_DERECHO);
					setState(522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(517);
							oper();
							setState(518);
							match(TK_NUMERO);
							}
							} 
						}
						setState(524);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(525);
							oper();
							setState(526);
							match(ID);
							}
							} 
						}
						setState(532);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					}
					}
					break;
				}
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(536);
				expre();
				setState(537);
				match(TK_PARENTESIS_DERECHO);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(538);
						oper();
						setState(539);
						match(ID);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						oper();
						setState(547);
						match(TK_NUMERO);
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						oper();
						setState(555);
						funciones();
						}
						} 
					}
					setState(561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(562);
						oper();
						setState(563);
						expre();
						}
						} 
					}
					setState(569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(TK_NUMERO);
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(571);
						oper();
						setState(572);
						match(ID);
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(579);
						oper();
						setState(580);
						match(TK_NUMERO);
						}
						} 
					}
					setState(586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						oper();
						setState(588);
						funciones();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				match(TK_LLAVE_IZQUIERDA);
				setState(596);
				llaves();
				setState(597);
				match(TK_LLAVE_DERECHA);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(599);
				match(T__27);
				setState(600);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLlaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLlaves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLlaves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlavesContext llaves() throws RecognitionException {
		LlavesContext _localctx = new LlavesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_llaves);
		try {
			int _alt;
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(TK_LLAVE_IZQUIERDA);
				setState(604);
				llaves();
				setState(605);
				match(TK_LLAVE_DERECHA);
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(606);
						match(TK_COMA);
						setState(607);
						llaves();
						}
						} 
					}
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(TK_CADENA);
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(614);
						match(TK_COMA);
						setState(615);
						llaves();
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(TK_NUMERO);
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(622);
						match(TK_COMA);
						setState(623);
						llaves();
						}
						} 
					}
					setState(628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logic);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(T__28);
				setState(632);
				expre();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(T__29);
				setState(634);
				expre();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				match(ID);
				setState(636);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lista);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(TK_NUMERO);
				setState(640);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(TK_CADENA);
				setState(642);
				lista2();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				match(TK_LLAVE_IZQUIERDA);
				setState(644);
				lista3();
				setState(645);
				match(TK_LLAVE_DERECHA);
				setState(646);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLista3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLista3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista3Context lista3() throws RecognitionException {
		Lista3Context _localctx = new Lista3Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_lista3);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(TK_NUMERO);
				setState(651);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(TK_CADENA);
				setState(653);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterLista2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitLista2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLista2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista2Context lista2() throws RecognitionException {
		Lista2Context _localctx = new Lista2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_lista2);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(TK_COMA);
				setState(658);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpre2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpre2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expre2Context expre2() throws RecognitionException {
		Expre2Context _localctx = new Expre2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expre2);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(TK_SUMA);
				setState(663);
				expre3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				oper();
				setState(665);
				expre();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				match(TK_MULTIPLICACION);
				setState(668);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpre3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpre3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpre3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expre3Context expre3() throws RecognitionException {
		Expre3Context _localctx = new Expre3Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expre3);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				idV();
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oper);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MAYOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(TK_MAYOR);
				}
				break;
			case TK_MAYOR_igual:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(TK_MAYOR_igual);
				}
				break;
			case TK_MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(TK_MENOR);
				}
				break;
			case TK_MENOR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				match(TK_MENOR_IGUAL);
				}
				break;
			case TK_IGUAL_QUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				match(TK_IGUAL_QUE);
				}
				break;
			case TK_SUMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(681);
				match(TK_SUMA);
				}
				break;
			case TK_RESTA:
				enterOuterAlt(_localctx, 7);
				{
				setState(682);
				match(TK_RESTA);
				}
				break;
			case TK_POTENCIACION:
				enterOuterAlt(_localctx, 8);
				{
				setState(683);
				match(TK_POTENCIACION);
				}
				break;
			case TK_MULTIPLICACION:
				enterOuterAlt(_localctx, 9);
				{
				setState(684);
				match(TK_MULTIPLICACION);
				}
				break;
			case TK_MODULO:
				enterOuterAlt(_localctx, 10);
				{
				setState(685);
				match(TK_MODULO);
				}
				break;
			case TK_DIVISION:
				enterOuterAlt(_localctx, 11);
				{
				setState(686);
				match(TK_DIVISION);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 12);
				{
				setState(687);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 13);
				{
				setState(688);
				match(T__29);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(689);
					match(T__30);
					}
				}

				}
				break;
			case TK_DISTINTO_DE:
				enterOuterAlt(_localctx, 14);
				{
				setState(692);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_else);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(T__24);
				setState(696);
				sielse();
				setState(697);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSielse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSielse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSielse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SielseContext sielse() throws RecognitionException {
		SielseContext _localctx = new SielseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sielse);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(T__26);
				setState(703);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(704);
				expre();
				setState(705);
				match(TK_PARENTESIS_DERECHO);
				setState(706);
				else_();
				setState(707);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caso);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(T__31);
				setState(713);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(714);
				expre();
				setState(715);
				and();
				setState(716);
				match(TK_PARENTESIS_DERECHO);
				setState(717);
				sentencias();
				setState(718);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_and);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(T__29);
				setState(724);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_incremento);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(T__32);
				setState(729);
				negativo();
				setState(730);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterNegativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitNegativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitNegativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativoContext negativo() throws RecognitionException {
		NegativoContext _localctx = new NegativoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_negativo);
		try {
			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(TK_RESTA);
				}
				break;
			case T__27:
			case TK_LLAVE_IZQUIERDA:
			case TK_PARENTESIS_IZQUIERDO:
			case ID:
			case TK_NUMERO:
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentos);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(TK_NUMERO);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(740);
					match(TK_COMA);
					setState(741);
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
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(TK_CADENA);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(748);
					match(TK_COMA);
					setState(749);
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
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				match(ID);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(756);
					match(TK_COMA);
					setState(757);
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
					setState(762);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterArgumentos2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitArgumentos2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitArgumentos2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos2Context argumentos2() throws RecognitionException {
		Argumentos2Context _localctx = new Argumentos2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_argumentos2);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(TK_COMA);
				setState(767);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSubrutinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSubrutinas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSubrutinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinasContext subrutinas() throws RecognitionException {
		SubrutinasContext _localctx = new SubrutinasContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subrutinas);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(T__33);
				setState(772);
				match(ID);
				setState(773);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(774);
					leer();
					}
					break;
				}
				setState(777);
				match(TK_PARENTESIS_DERECHO);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(778);
					valoref();
					}
				}

				setState(781);
				inicio2();
				setState(782);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ref);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpreSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpreSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpreSUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreSUBContext expreSUB() throws RecognitionException {
		ExpreSUBContext _localctx = new ExpreSUBContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expreSUB);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(ID);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(792);
					match(TK_COMA);
					setState(793);
					match(ID);
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(799);
				match(TK_DOS_PUNTOS);
				setState(800);
				rmt();
				setState(801);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterExpreSUB2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitExpreSUB2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpreSUB2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreSUB2Context expreSUB2() throws RecognitionException {
		ExpreSUB2Context _localctx = new ExpreSUB2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_expreSUB2);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				match(TK_PUNTO_y_coma);
				setState(807);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterValoref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitValoref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitValoref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorefContext valoref() throws RecognitionException {
		ValorefContext _localctx = new ValorefContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_valoref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T__35);
			setState(812);
			tipodato();
			setState(813);
			especificacion();
			setState(814);
			match(T__0);
			setState(815);
			sentencias();
			setState(816);
			match(T__35);
			setState(817);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(818);
			expre();
			setState(819);
			match(TK_PARENTESIS_DERECHO);
			setState(820);
			match(T__1);
			setState(821);
			refSUB();
			setState(822);
			match(T__0);
			setState(823);
			sentencias();
			setState(824);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterRefSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitRefSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitRefSUB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefSUBContext refSUB() throws RecognitionException {
		RefSUBContext _localctx = new RefSUBContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_refSUB);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(T__3);
				setState(827);
				var();
				setState(828);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(T__4);
				setState(831);
				const_();
				setState(832);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				match(T__5);
				setState(835);
				tipos();
				setState(836);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIdV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIdV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdVContext idV() throws RecognitionException {
		IdVContext _localctx = new IdVContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_idV);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				match(ID);
				setState(842);
				idV2();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(T__36);
				setState(844);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterIdV2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitIdV2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIdV2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdV2Context idV2() throws RecognitionException {
		IdV2Context _localctx = new IdV2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_idV2);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(848);
				vectordef();
				setState(849);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(TK_CORCHETE_IZQUIERDO);
				setState(852);
				vectordef();
				setState(853);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				match(TK_POTENCIACION);
				setState(856);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterVectordef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitVectordef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVectordef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectordefContext vectordef() throws RecognitionException {
		VectordefContext _localctx = new VectordefContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_vectordef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
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
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_funciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(ID);
			setState(863);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(864);
				expre();
				}
				break;
			}
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(867);
				argumentos();
				}
				break;
			}
			setState(870);
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
		"\u0004\u0001B\u0369\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0081"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0090\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a0\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00a9\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bc\b\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c3\b\t\n\t\f\t\u00c6\t\t\u0001"+
		"\t\u0001\t\u0005\t\u00ca\b\t\n\t\f\t\u00cd\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u00d2\b\t\n\t\f\t\u00d5\t\t\u0001\t\u0003\t\u00d8\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00dd\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00f1\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00f5\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0106\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u010f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0118\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0120\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0127\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0131\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013c\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0147\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0156\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0163\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0169\b\u0015\n\u0015\f\u0015\u016c\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0172\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0176\b\u0015\u0001\u0015\u0003\u0015\u0179\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0184\b\u0015\n\u0015"+
		"\f\u0015\u0187\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u018b\b\u0015"+
		"\n\u0015\f\u0015\u018e\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0195\b\u0015\n\u0015\f\u0015\u0198\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019d\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01a2\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01a8\b\u0017\n\u0017\f\u0017\u01ab"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01af\b\u0017\n\u0017\f\u0017"+
		"\u01b2\t\u0017\u0001\u0017\u0003\u0017\u01b5\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01bb\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01c4\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01cc\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d3\b\u001a\u0005\u001a\u01d5"+
		"\b\u001a\n\u001a\f\u001a\u01d8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01dd\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01e3\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01f6\b\u001d\n\u001d\f\u001d\u01f9\t\u001d\u0005"+
		"\u001d\u01fb\b\u001d\n\u001d\f\u001d\u01fe\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0203\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0209\b\u001d\n\u001d\f\u001d\u020c\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0211\b\u001d\n\u001d\f\u001d"+
		"\u0214\t\u001d\u0003\u001d\u0216\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u021e\b\u001d\n"+
		"\u001d\f\u001d\u0221\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0226\b\u001d\n\u001d\f\u001d\u0229\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u022e\b\u001d\n\u001d\f\u001d\u0231\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0236\b\u001d\n\u001d\f\u001d"+
		"\u0239\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u023f\b\u001d\n\u001d\f\u001d\u0242\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0247\b\u001d\n\u001d\f\u001d\u024a\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u024f\b\u001d\n\u001d\f\u001d\u0252"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u025a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0261\b\u001e\n\u001e\f\u001e\u0264\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0269\b\u001e\n\u001e"+
		"\f\u001e\u026c\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0271\b\u001e\n\u001e\f\u001e\u0274\t\u001e\u0003\u001e\u0276\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u027e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0289\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0290\b!\u0001\"\u0001\"\u0001\"\u0003\"\u0295\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u029f\b#\u0001$\u0001$\u0003"+
		"$\u02a3\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02b3\b%\u0001%\u0003%\u02b6"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02bd\b&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02c7\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02d2"+
		"\b(\u0001)\u0001)\u0001)\u0003)\u02d7\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02de\b*\u0001+\u0001+\u0003+\u02e2\b+\u0001,\u0001,\u0001,\u0005"+
		",\u02e7\b,\n,\f,\u02ea\t,\u0001,\u0001,\u0001,\u0005,\u02ef\b,\n,\f,\u02f2"+
		"\t,\u0001,\u0001,\u0001,\u0005,\u02f7\b,\n,\f,\u02fa\t,\u0001,\u0003,"+
		"\u02fd\b,\u0001-\u0001-\u0001-\u0003-\u0302\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0308\b.\u0001.\u0001.\u0003.\u030c\b.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0312\b.\u0001/\u0001/\u0003/\u0316\b/\u00010\u00010\u00010\u0005"+
		"0\u031b\b0\n0\f0\u031e\t0\u00010\u00010\u00010\u00010\u00010\u00030\u0325"+
		"\b0\u00011\u00011\u00011\u00031\u032a\b1\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u0348\b3\u00014\u00014\u00014\u00014\u0003"+
		"4\u034e\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u035b\b5\u00016\u00016\u00017\u00017\u00017\u0003"+
		"7\u0362\b7\u00017\u00037\u0365\b7\u00017\u00017\u00017\u0000\u00008\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0005\u0002\u0000"+
		"\u0007\n@A\u0002\u000055?@\u0001\u0000?@\u0002\u0000&&,,\u0001\u0000?"+
		"A\u03c5\u0000p\u0001\u0000\u0000\u0000\u0002w\u0001\u0000\u0000\u0000"+
		"\u0004\u0080\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000"+
		"\b\u009f\u0001\u0000\u0000\u0000\n\u00a8\u0001\u0000\u0000\u0000\f\u00aa"+
		"\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00bd"+
		"\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014\u00dc"+
		"\u0001\u0000\u0000\u0000\u0016\u00e4\u0001\u0000\u0000\u0000\u0018\u00e6"+
		"\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00f4"+
		"\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000\u0000 \u0128\u0001"+
		"\u0000\u0000\u0000\"\u0134\u0001\u0000\u0000\u0000$\u013f\u0001\u0000"+
		"\u0000\u0000&\u014a\u0001\u0000\u0000\u0000(\u0159\u0001\u0000\u0000\u0000"+
		"*\u019c\u0001\u0000\u0000\u0000,\u01a1\u0001\u0000\u0000\u0000.\u01ba"+
		"\u0001\u0000\u0000\u00000\u01c3\u0001\u0000\u0000\u00002\u01c5\u0001\u0000"+
		"\u0000\u00004\u01cb\u0001\u0000\u0000\u00006\u01dc\u0001\u0000\u0000\u0000"+
		"8\u01de\u0001\u0000\u0000\u0000:\u0259\u0001\u0000\u0000\u0000<\u0275"+
		"\u0001\u0000\u0000\u0000>\u027d\u0001\u0000\u0000\u0000@\u0288\u0001\u0000"+
		"\u0000\u0000B\u028f\u0001\u0000\u0000\u0000D\u0294\u0001\u0000\u0000\u0000"+
		"F\u029e\u0001\u0000\u0000\u0000H\u02a2\u0001\u0000\u0000\u0000J\u02b5"+
		"\u0001\u0000\u0000\u0000L\u02bc\u0001\u0000\u0000\u0000N\u02c6\u0001\u0000"+
		"\u0000\u0000P\u02d1\u0001\u0000\u0000\u0000R\u02d6\u0001\u0000\u0000\u0000"+
		"T\u02dd\u0001\u0000\u0000\u0000V\u02e1\u0001\u0000\u0000\u0000X\u02fc"+
		"\u0001\u0000\u0000\u0000Z\u0301\u0001\u0000\u0000\u0000\\\u0311\u0001"+
		"\u0000\u0000\u0000^\u0315\u0001\u0000\u0000\u0000`\u0324\u0001\u0000\u0000"+
		"\u0000b\u0329\u0001\u0000\u0000\u0000d\u032b\u0001\u0000\u0000\u0000f"+
		"\u0347\u0001\u0000\u0000\u0000h\u034d\u0001\u0000\u0000\u0000j\u035a\u0001"+
		"\u0000\u0000\u0000l\u035c\u0001\u0000\u0000\u0000n\u035e\u0001\u0000\u0000"+
		"\u0000pq\u0003\u0004\u0002\u0000qr\u0003\u0006\u0003\u0000rs\u0005\u0001"+
		"\u0000\u0000st\u0003\u001e\u000f\u0000tu\u0005\u0002\u0000\u0000uv\u0003"+
		"\\.\u0000v\u0001\u0001\u0000\u0000\u0000wx\u0003\u0004\u0002\u0000xy\u0003"+
		"\u0006\u0003\u0000yz\u0005\u0001\u0000\u0000z{\u0003\u001e\u000f\u0000"+
		"{|\u0005\u0002\u0000\u0000|\u0003\u0001\u0000\u0000\u0000}~\u0005\u0003"+
		"\u0000\u0000~\u0081\u0005?\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0005\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083"+
		"\u0084\u0003\b\u0004\u0000\u0084\u0085\u0003\u0006\u0003\u0000\u0085\u0090"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088"+
		"\u0003\n\u0005\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u0090\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u008c\u0003"+
		"\u001a\r\u0000\u008c\u008d\u0003\u0006\u0003\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0082\u0001\u0000"+
		"\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0007\u0001\u0000"+
		"\u0000\u0000\u0091\u0096\u0005?\u0000\u0000\u0092\u0093\u0005\'\u0000"+
		"\u0000\u0093\u0095\u0005?\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005,\u0000\u0000\u009a"+
		"\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c"+
		"\u009d\u0003\b\u0004\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\t\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"?\u0000\u0000\u00a2\u00a3\u0005&\u0000\u0000\u00a3\u00a4\u0003\f\u0006"+
		"\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a6\u0003\n\u0005\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0000\u0000\u0000"+
		"\u00ab\r\u0001\u0000\u0000\u0000\u00ac\u00bc\u0003\u0016\u000b\u0000\u00ad"+
		"\u00ae\u0005\u000b\u0000\u0000\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b0"+
		"\u0003\u0010\b\u0000\u00b0\u00b1\u0005(\u0000\u0000\u00b1\u00b2\u0003"+
		"\u0016\u000b\u0000\u00b2\u00bc\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\f\u0000\u0000\u00b4\u00b5\u0005)\u0000\u0000\u00b5\u00b6\u0003\u0012"+
		"\t\u0000\u00b6\u00b7\u0005(\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b"+
		"\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\r\u0000\u0000"+
		"\u00ba\u00bc\u0003\u0018\f\u0000\u00bb\u00ac\u0001\u0000\u0000\u0000\u00bb"+
		"\u00ad\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0007\u0001\u0000\u0000\u00be\u0011\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c4\u0005@\u0000\u0000\u00c0\u00c1\u0005\'\u0000\u0000\u00c1\u00c3"+
		"\u0005@\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\'\u0000\u0000\u00c8\u00ca\u00055"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d8\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d3\u00055\u0000\u0000\u00cf\u00d0\u0005\'\u0000"+
		"\u0000\u00d0\u00d2\u00055\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003:\u001d\u0000\u00d7"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\'\u0000\u0000\u00da\u00dd\u0003\u0012\t\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u0015\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005\r\u0000\u0000\u00df\u00e5\u0003\u0018\f\u0000\u00e0\u00e5\u0005"+
		"\u000e\u0000\u0000\u00e1\u00e5\u0005\u000f\u0000\u0000\u00e2\u00e5\u0005"+
		"\u0010\u0000\u0000\u00e3\u00e5\u0005?\u0000\u0000\u00e4\u00de\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005/\u0000"+
		"\u0000\u00e7\u00e8\u0003\b\u0004\u0000\u00e8\u00e9\u0005.\u0000\u0000"+
		"\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005?\u0000\u0000\u00eb"+
		"\u00ec\u0005,\u0000\u0000\u00ec\u00ed\u0003\u000e\u0007\u0000\u00ed\u00ee"+
		"\u0003\u001a\r\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00f5\u0005"+
		":\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u001d\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005?\u0000\u0000\u00f7\u00f8\u0003*\u0015\u0000"+
		"\u00f8\u00f9\u0003\u001c\u000e\u0000\u00f9\u00fa\u0003\u001e\u000f\u0000"+
		"\u00fa\u0127\u0001\u0000\u0000\u0000\u00fb\u0127\u0003(\u0014\u0000\u00fc"+
		"\u0127\u0003 \u0010\u0000\u00fd\u0127\u0003\"\u0011\u0000\u00fe\u0127"+
		"\u0003$\u0012\u0000\u00ff\u0127\u0003&\u0013\u0000\u0100\u0101\u0005\u0011"+
		"\u0000\u0000\u0101\u0102\u00057\u0000\u0000\u0102\u0103\u00034\u001a\u0000"+
		"\u0103\u0105\u00056\u0000\u0000\u0104\u0106\u0005:\u0000\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u0127"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0012\u0000\u0000\u010a\u010b"+
		"\u00057\u0000\u0000\u010b\u010c\u0003.\u0017\u0000\u010c\u010e\u00056"+
		"\u0000\u0000\u010d\u010f\u0005:\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0003\u001e\u000f\u0000\u0111\u0127\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0013\u0000\u0000\u0113\u0114\u00057\u0000\u0000"+
		"\u0114\u0115\u0003.\u0017\u0000\u0115\u0117\u00056\u0000\u0000\u0116\u0118"+
		"\u0005:\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0003"+
		"\u001e\u000f\u0000\u011a\u0127\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u0014\u0000\u0000\u011c\u011d\u00057\u0000\u0000\u011d\u011f\u00056\u0000"+
		"\u0000\u011e\u0120\u0005:\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0127\u0003\u001e\u000f\u0000\u0122\u0123\u0003n7\u0000\u0123\u0124"+
		"\u0003\u001e\u000f\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0127"+
		"\u0001\u0000\u0000\u0000\u0126\u00f6\u0001\u0000\u0000\u0000\u0126\u00fb"+
		"\u0001\u0000\u0000\u0000\u0126\u00fc\u0001\u0000\u0000\u0000\u0126\u00fd"+
		"\u0001\u0000\u0000\u0000\u0126\u00fe\u0001\u0000\u0000\u0000\u0126\u00ff"+
		"\u0001\u0000\u0000\u0000\u0126\u0100\u0001\u0000\u0000\u0000\u0126\u0109"+
		"\u0001\u0000\u0000\u0000\u0126\u0112\u0001\u0000\u0000\u0000\u0126\u011b"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005\u0015\u0000\u0000\u0129\u012a\u00057\u0000\u0000\u012a\u012b\u0003"+
		":\u001d\u0000\u012b\u012c\u00056\u0000\u0000\u012c\u012d\u0005/\u0000"+
		"\u0000\u012d\u012e\u0003\u001e\u000f\u0000\u012e\u0130\u0005.\u0000\u0000"+
		"\u012f\u0131\u0005:\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0003\u001e\u000f\u0000\u0133!\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\u0016\u0000\u0000\u0135\u0136\u0003\u001e\u000f\u0000\u0136\u0137"+
		"\u0005\u0017\u0000\u0000\u0137\u0138\u00057\u0000\u0000\u0138\u0139\u0003"+
		":\u001d\u0000\u0139\u013b\u00056\u0000\u0000\u013a\u013c\u0005:\u0000"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0003\u001e\u000f"+
		"\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0018\u0000\u0000"+
		"\u0140\u0141\u0005/\u0000\u0000\u0141\u0142\u0003P(\u0000\u0142\u0143"+
		"\u0005\u0019\u0000\u0000\u0143\u0144\u0003\u001e\u000f\u0000\u0144\u0146"+
		"\u0005.\u0000\u0000\u0145\u0147\u0005:\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0003\u001e\u000f\u0000\u0149%\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005\u001a\u0000\u0000\u014b\u014c\u0005?\u0000\u0000"+
		"\u014c\u014d\u0005&\u0000\u0000\u014d\u014e\u0003:\u001d\u0000\u014e\u014f"+
		"\u0005\u0017\u0000\u0000\u014f\u0150\u0003:\u001d\u0000\u0150\u0151\u0003"+
		"T*\u0000\u0151\u0152\u0005/\u0000\u0000\u0152\u0153\u0003\u001e\u000f"+
		"\u0000\u0153\u0155\u0005.\u0000\u0000\u0154\u0156\u0005:\u0000\u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0003\u001e\u000f\u0000\u0158"+
		"\'\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u001b\u0000\u0000\u015a\u015b"+
		"\u00057\u0000\u0000\u015b\u015c\u0003:\u001d\u0000\u015c\u015d\u00056"+
		"\u0000\u0000\u015d\u015e\u0005/\u0000\u0000\u015e\u015f\u0003\u001e\u000f"+
		"\u0000\u015f\u0160\u0003L&\u0000\u0160\u0162\u0005.\u0000\u0000\u0161"+
		"\u0163\u0005:\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0003\u001e\u000f\u0000\u0165)\u0001\u0000\u0000\u0000\u0166\u0167\u0005"+
		"9\u0000\u0000\u0167\u0169\u0005?\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0171\u00038\u001c\u0000"+
		"\u016e\u016f\u0005\u001c\u0000\u0000\u016f\u0172\u0003:\u001d\u0000\u0170"+
		"\u0172\u0003:\u001d\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u019d\u0001\u0000\u0000\u0000\u0173\u0175"+
		"\u00038\u001c\u0000\u0174\u0176\u0003:\u001d\u0000\u0175\u0174\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0005A\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u019d\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u00038\u001c\u0000\u017b\u017c\u00057\u0000\u0000\u017c"+
		"\u017d\u0003:\u001d\u0000\u017d\u0185\u00056\u0000\u0000\u017e\u017f\u0003"+
		">\u001f\u0000\u017f\u0180\u00057\u0000\u0000\u0180\u0181\u0003:\u001d"+
		"\u0000\u0181\u0182\u00056\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000"+
		"\u0183\u017e\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u019d\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u00059\u0000\u0000\u0189\u018b\u0005?\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0005)\u0000\u0000\u0190\u0191\u0003\u0010\b\u0000\u0191\u0196\u0005"+
		"(\u0000\u0000\u0192\u0193\u00059\u0000\u0000\u0193\u0195\u0005?\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u00038\u001c\u0000\u019a\u019b\u0003:\u001d\u0000\u019b"+
		"\u019d\u0001\u0000\u0000\u0000\u019c\u016a\u0001\u0000\u0000\u0000\u019c"+
		"\u0173\u0001\u0000\u0000\u0000\u019c\u017a\u0001\u0000\u0000\u0000\u019c"+
		"\u018c\u0001\u0000\u0000\u0000\u019d+\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0005\u001c\u0000\u0000\u019f\u01a2\u0003:\u001d\u0000\u01a0\u01a2\u0003"+
		":\u001d\u0000\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2-\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003^/\u0000"+
		"\u01a4\u01a9\u0005?\u0000\u0000\u01a5\u01a6\u0005\'\u0000\u0000\u01a6"+
		"\u01a8\u0005?\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0001\u0000\u0000\u0000\u01aa\u01b0\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005,\u0000\u0000\u01ad\u01af\u0003"+
		"\u0016\u000b\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b5\u0005:\u0000\u0000\u01b4\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0003.\u0017\u0000\u01b7\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0005A\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000"+
		"\u01ba\u01a3\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb/\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005)\u0000\u0000\u01bd\u01be\u00032\u0019\u0000\u01be\u01bf\u0005"+
		"(\u0000\u0000\u01bf\u01c4\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\'"+
		"\u0000\u0000\u01c1\u01c4\u0003.\u0017\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01bc\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c41\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0007\u0002\u0000\u0000\u01c63\u0001\u0000\u0000\u0000\u01c7"+
		"\u01cc\u0005?\u0000\u0000\u01c8\u01cc\u0005@\u0000\u0000\u01c9\u01cc\u0005"+
		"A\u0000\u0000\u01ca\u01cc\u0003n7\u0000\u01cb\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01d6\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d2\u0005\'\u0000\u0000\u01ce\u01d3\u0005?\u0000\u0000"+
		"\u01cf\u01d3\u0005@\u0000\u0000\u01d0\u01d3\u0005A\u0000\u0000\u01d1\u01d3"+
		"\u0003n7\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d75\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\'\u0000\u0000"+
		"\u01da\u01dd\u00034\u001a\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc"+
		"\u01d9\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd"+
		"7\u0001\u0000\u0000\u0000\u01de\u01df\u0007\u0003\u0000\u0000\u01df9\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e3\u0005?\u0000\u0000\u01e1\u01e3\u0003n7"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e3\u01fc\u0001\u0000\u0000\u0000\u01e4\u01e5\u0003J%\u0000\u01e5"+
		"\u01e6\u0005?\u0000\u0000\u01e6\u01fb\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0003J%\u0000\u01e8\u01e9\u0005@\u0000\u0000\u01e9\u01fb\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0003J%\u0000\u01eb\u01ec\u0003n7\u0000\u01ec"+
		"\u01fb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003J%\u0000\u01ee\u01ef\u0005"+
		"A\u0000\u0000\u01ef\u01fb\u0001\u0000\u0000\u0000\u01f0\u01f1\u00059\u0000"+
		"\u0000\u01f1\u01f7\u0005?\u0000\u0000\u01f2\u01f3\u0003J%\u0000\u01f3"+
		"\u01f4\u0003:\u001d\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01e4"+
		"\u0001\u0000\u0000\u0000\u01fa\u01e7\u0001\u0000\u0000\u0000\u01fa\u01ea"+
		"\u0001\u0000\u0000\u0000\u01fa\u01ed\u0001\u0000\u0000\u0000\u01fa\u01f0"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0215"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0202"+
		"\u0005)\u0000\u0000\u0200\u0203\u0003\u0012\t\u0000\u0201\u0203\u0003"+
		"\u0010\b\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u020a\u0005(\u0000"+
		"\u0000\u0205\u0206\u0003J%\u0000\u0206\u0207\u0005@\u0000\u0000\u0207"+
		"\u0209\u0001\u0000\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b\u0212\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020d\u020e\u0003J%\u0000\u020e\u020f\u0005"+
		"?\u0000\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210\u020d\u0001\u0000"+
		"\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u01ff\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u025a\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u00057\u0000\u0000\u0218\u0219\u0003:\u001d\u0000"+
		"\u0219\u021f\u00056\u0000\u0000\u021a\u021b\u0003J%\u0000\u021b\u021c"+
		"\u0005?\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021a\u0001"+
		"\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0227\u0001"+
		"\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0223\u0003"+
		"J%\u0000\u0223\u0224\u0005@\u0000\u0000\u0224\u0226\u0001\u0000\u0000"+
		"\u0000\u0225\u0222\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u022f\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0003J%\u0000\u022b\u022c\u0003n7\u0000\u022c\u022e"+
		"\u0001\u0000\u0000\u0000\u022d\u022a\u0001\u0000\u0000\u0000\u022e\u0231"+
		"\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0001\u0000\u0000\u0000\u0230\u0237\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0003J%\u0000\u0233\u0234\u0003:"+
		"\u001d\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0232\u0001\u0000"+
		"\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u025a\u0001\u0000"+
		"\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u0240\u0005@\u0000"+
		"\u0000\u023b\u023c\u0003J%\u0000\u023c\u023d\u0005?\u0000\u0000\u023d"+
		"\u023f\u0001\u0000\u0000\u0000\u023e\u023b\u0001\u0000\u0000\u0000\u023f"+
		"\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0001\u0000\u0000\u0000\u0241\u0248\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0243\u0244\u0003J%\u0000\u0244\u0245\u0005"+
		"@\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0243\u0001\u0000"+
		"\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u0250\u0001\u0000"+
		"\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0003J%\u0000"+
		"\u024c\u024d\u0003n7\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024b"+
		"\u0001\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u025a"+
		"\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0005/\u0000\u0000\u0254\u0255\u0003<\u001e\u0000\u0255\u0256\u0005."+
		"\u0000\u0000\u0256\u025a\u0001\u0000\u0000\u0000\u0257\u0258\u0005\u001c"+
		"\u0000\u0000\u0258\u025a\u0003:\u001d\u0000\u0259\u01e2\u0001\u0000\u0000"+
		"\u0000\u0259\u0217\u0001\u0000\u0000\u0000\u0259\u023a\u0001\u0000\u0000"+
		"\u0000\u0259\u0253\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a;\u0001\u0000\u0000\u0000\u025b\u025c\u0005/\u0000\u0000\u025c"+
		"\u025d\u0003<\u001e\u0000\u025d\u0262\u0005.\u0000\u0000\u025e\u025f\u0005"+
		"\'\u0000\u0000\u025f\u0261\u0003<\u001e\u0000\u0260\u025e\u0001\u0000"+
		"\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0276\u0001\u0000"+
		"\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u026a\u0005A\u0000"+
		"\u0000\u0266\u0267\u0005\'\u0000\u0000\u0267\u0269\u0003<\u001e\u0000"+
		"\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000"+
		"\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000"+
		"\u026b\u0276\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000"+
		"\u026d\u0272\u0005@\u0000\u0000\u026e\u026f\u0005\'\u0000\u0000\u026f"+
		"\u0271\u0003<\u001e\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0274"+
		"\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0272"+
		"\u0001\u0000\u0000\u0000\u0275\u025b\u0001\u0000\u0000\u0000\u0275\u0265"+
		"\u0001\u0000\u0000\u0000\u0275\u026d\u0001\u0000\u0000\u0000\u0276=\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0005\u001d\u0000\u0000\u0278\u027e\u0003"+
		":\u001d\u0000\u0279\u027a\u0005\u001e\u0000\u0000\u027a\u027e\u0003:\u001d"+
		"\u0000\u027b\u027c\u0005?\u0000\u0000\u027c\u027e\u0003F#\u0000\u027d"+
		"\u0277\u0001\u0000\u0000\u0000\u027d\u0279\u0001\u0000\u0000\u0000\u027d"+
		"\u027b\u0001\u0000\u0000\u0000\u027e?\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0005@\u0000\u0000\u0280\u0289\u0003D\"\u0000\u0281\u0282\u0005A\u0000"+
		"\u0000\u0282\u0289\u0003D\"\u0000\u0283\u0284\u0005/\u0000\u0000\u0284"+
		"\u0285\u0003B!\u0000\u0285\u0286\u0005.\u0000\u0000\u0286\u0287\u0003"+
		"D\"\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u027f\u0001\u0000"+
		"\u0000\u0000\u0288\u0281\u0001\u0000\u0000\u0000\u0288\u0283\u0001\u0000"+
		"\u0000\u0000\u0289A\u0001\u0000\u0000\u0000\u028a\u028b\u0005@\u0000\u0000"+
		"\u028b\u0290\u0003D\"\u0000\u028c\u028d\u0005A\u0000\u0000\u028d\u0290"+
		"\u0003D\"\u0000\u028e\u0290\u0001\u0000\u0000\u0000\u028f\u028a\u0001"+
		"\u0000\u0000\u0000\u028f\u028c\u0001\u0000\u0000\u0000\u028f\u028e\u0001"+
		"\u0000\u0000\u0000\u0290C\u0001\u0000\u0000\u0000\u0291\u0292\u0005\'"+
		"\u0000\u0000\u0292\u0295\u0003@ \u0000\u0293\u0295\u0001\u0000\u0000\u0000"+
		"\u0294\u0291\u0001\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000\u0000"+
		"\u0295E\u0001\u0000\u0000\u0000\u0296\u0297\u0005<\u0000\u0000\u0297\u029f"+
		"\u0003H$\u0000\u0298\u0299\u0003J%\u0000\u0299\u029a\u0003:\u001d\u0000"+
		"\u029a\u029f\u0001\u0000\u0000\u0000\u029b\u029c\u00055\u0000\u0000\u029c"+
		"\u029f\u0003H$\u0000\u029d\u029f\u0001\u0000\u0000\u0000\u029e\u0296\u0001"+
		"\u0000\u0000\u0000\u029e\u0298\u0001\u0000\u0000\u0000\u029e\u029b\u0001"+
		"\u0000\u0000\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029fG\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a3\u0003h4\u0000\u02a1\u02a3\u0005@\u0000\u0000"+
		"\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a3I\u0001\u0000\u0000\u0000\u02a4\u02b6\u00050\u0000\u0000\u02a5\u02b6"+
		"\u00051\u0000\u0000\u02a6\u02b6\u00052\u0000\u0000\u02a7\u02b6\u00053"+
		"\u0000\u0000\u02a8\u02b6\u0005-\u0000\u0000\u02a9\u02b6\u0005<\u0000\u0000"+
		"\u02aa\u02b6\u0005;\u0000\u0000\u02ab\u02b6\u00058\u0000\u0000\u02ac\u02b6"+
		"\u00055\u0000\u0000\u02ad\u02b6\u00054\u0000\u0000\u02ae\u02b6\u0005+"+
		"\u0000\u0000\u02af\u02b6\u0005\u001d\u0000\u0000\u02b0\u02b2\u0005\u001e"+
		"\u0000\u0000\u02b1\u02b3\u0005\u001f\u0000\u0000\u02b2\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b6\u0005*\u0000\u0000\u02b5\u02a4\u0001\u0000\u0000"+
		"\u0000\u02b5\u02a5\u0001\u0000\u0000\u0000\u02b5\u02a6\u0001\u0000\u0000"+
		"\u0000\u02b5\u02a7\u0001\u0000\u0000\u0000\u02b5\u02a8\u0001\u0000\u0000"+
		"\u0000\u02b5\u02a9\u0001\u0000\u0000\u0000\u02b5\u02aa\u0001\u0000\u0000"+
		"\u0000\u02b5\u02ab\u0001\u0000\u0000\u0000\u02b5\u02ac\u0001\u0000\u0000"+
		"\u0000\u02b5\u02ad\u0001\u0000\u0000\u0000\u02b5\u02ae\u0001\u0000\u0000"+
		"\u0000\u02b5\u02af\u0001\u0000\u0000\u0000\u02b5\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6K\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\u0005\u0019\u0000\u0000\u02b8\u02b9\u0003N\'\u0000\u02b9"+
		"\u02ba\u0003L&\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bc\u02b7\u0001\u0000\u0000\u0000\u02bc\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bdM\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u001b"+
		"\u0000\u0000\u02bf\u02c0\u00057\u0000\u0000\u02c0\u02c1\u0003:\u001d\u0000"+
		"\u02c1\u02c2\u00056\u0000\u0000\u02c2\u02c3\u0003L&\u0000\u02c3\u02c4"+
		"\u0003\u001e\u000f\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c7"+
		"\u0003\u001e\u000f\u0000\u02c6\u02be\u0001\u0000\u0000\u0000\u02c6\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c7O\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005"+
		" \u0000\u0000\u02c9\u02ca\u00057\u0000\u0000\u02ca\u02cb\u0003:\u001d"+
		"\u0000\u02cb\u02cc\u0003R)\u0000\u02cc\u02cd\u00056\u0000\u0000\u02cd"+
		"\u02ce\u0003\u001e\u000f\u0000\u02ce\u02cf\u0003P(\u0000\u02cf\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1\u02c8\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2Q\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0005\u001e\u0000\u0000\u02d4\u02d7\u0003:\u001d"+
		"\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d7S\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0005!\u0000\u0000\u02d9\u02da\u0003V+\u0000\u02da\u02db"+
		"\u0003:\u001d\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02de\u0001"+
		"\u0000\u0000\u0000\u02dd\u02d8\u0001\u0000\u0000\u0000\u02dd\u02dc\u0001"+
		"\u0000\u0000\u0000\u02deU\u0001\u0000\u0000\u0000\u02df\u02e2\u0005;\u0000"+
		"\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e2W\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e8\u0005@\u0000\u0000\u02e4\u02e5\u0005\'\u0000\u0000\u02e5"+
		"\u02e7\u0007\u0004\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7"+
		"\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e9\u02fd\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e8\u0001\u0000\u0000\u0000\u02eb\u02f0\u0005A\u0000\u0000\u02ec\u02ed"+
		"\u0005\'\u0000\u0000\u02ed\u02ef\u0007\u0004\u0000\u0000\u02ee\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02fd\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f8\u0005"+
		"?\u0000\u0000\u02f4\u02f5\u0005\'\u0000\u0000\u02f5\u02f7\u0007\u0004"+
		"\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fd\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02e3\u0001\u0000"+
		"\u0000\u0000\u02fc\u02eb\u0001\u0000\u0000\u0000\u02fc\u02f3\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fdY\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0005\'\u0000\u0000\u02ff\u0302\u0003X,\u0000\u0300"+
		"\u0302\u0001\u0000\u0000\u0000\u0301\u02fe\u0001\u0000\u0000\u0000\u0301"+
		"\u0300\u0001\u0000\u0000\u0000\u0302[\u0001\u0000\u0000\u0000\u0303\u0304"+
		"\u0005\"\u0000\u0000\u0304\u0305\u0005?\u0000\u0000\u0305\u0307\u0005"+
		"7\u0000\u0000\u0306\u0308\u0003.\u0017\u0000\u0307\u0306\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000"+
		"\u0000\u0309\u030b\u00056\u0000\u0000\u030a\u030c\u0003d2\u0000\u030b"+
		"\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0003\u0002\u0001\u0000\u030e"+
		"\u030f\u0003\\.\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u0312"+
		"\u0001\u0000\u0000\u0000\u0311\u0303\u0001\u0000\u0000\u0000\u0311\u0310"+
		"\u0001\u0000\u0000\u0000\u0312]\u0001\u0000\u0000\u0000\u0313\u0316\u0005"+
		"#\u0000\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000"+
		"\u0000\u0000\u0315\u0314\u0001\u0000\u0000\u0000\u0316_\u0001\u0000\u0000"+
		"\u0000\u0317\u031c\u0005?\u0000\u0000\u0318\u0319\u0005\'\u0000\u0000"+
		"\u0319\u031b\u0005?\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031b"+
		"\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e"+
		"\u031c\u0001\u0000\u0000\u0000\u031f\u0320\u0005,\u0000\u0000\u0320\u0321"+
		"\u0003\u000e\u0007\u0000\u0321\u0322\u0003b1\u0000\u0322\u0325\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0001\u0000\u0000\u0000\u0324\u0317\u0001\u0000"+
		"\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0325a\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0005:\u0000\u0000\u0327\u032a\u0003`0\u0000\u0328"+
		"\u032a\u0001\u0000\u0000\u0000\u0329\u0326\u0001\u0000\u0000\u0000\u0329"+
		"\u0328\u0001\u0000\u0000\u0000\u032ac\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0005$\u0000\u0000\u032c\u032d\u0003\u0016\u000b\u0000\u032d\u032e\u0003"+
		"\u0006\u0003\u0000\u032e\u032f\u0005\u0001\u0000\u0000\u032f\u0330\u0003"+
		"\u001e\u000f\u0000\u0330\u0331\u0005$\u0000\u0000\u0331\u0332\u00057\u0000"+
		"\u0000\u0332\u0333\u0003:\u001d\u0000\u0333\u0334\u00056\u0000\u0000\u0334"+
		"\u0335\u0005\u0002\u0000\u0000\u0335\u0336\u0003f3\u0000\u0336\u0337\u0005"+
		"\u0001\u0000\u0000\u0337\u0338\u0003\u001e\u000f\u0000\u0338\u0339\u0005"+
		"\u0002\u0000\u0000\u0339e\u0001\u0000\u0000\u0000\u033a\u033b\u0005\u0004"+
		"\u0000\u0000\u033b\u033c\u0003\b\u0004\u0000\u033c\u033d\u0003\u0006\u0003"+
		"\u0000\u033d\u0348\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u0005\u0000"+
		"\u0000\u033f\u0340\u0003\n\u0005\u0000\u0340\u0341\u0003\u0006\u0003\u0000"+
		"\u0341\u0348\u0001\u0000\u0000\u0000\u0342\u0343\u0005\u0006\u0000\u0000"+
		"\u0343\u0344\u0003\u001a\r\u0000\u0344\u0345\u0003\u0006\u0003\u0000\u0345"+
		"\u0348\u0001\u0000\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347"+
		"\u033a\u0001\u0000\u0000\u0000\u0347\u033e\u0001\u0000\u0000\u0000\u0347"+
		"\u0342\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348"+
		"g\u0001\u0000\u0000\u0000\u0349\u034a\u0005?\u0000\u0000\u034a\u034e\u0003"+
		"j5\u0000\u034b\u034c\u0005%\u0000\u0000\u034c\u034e\u0003j5\u0000\u034d"+
		"\u0349\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e"+
		"i\u0001\u0000\u0000\u0000\u034f\u0350\u00057\u0000\u0000\u0350\u0351\u0003"+
		"l6\u0000\u0351\u0352\u00056\u0000\u0000\u0352\u035b\u0001\u0000\u0000"+
		"\u0000\u0353\u0354\u0005)\u0000\u0000\u0354\u0355\u0003l6\u0000\u0355"+
		"\u0356\u0005(\u0000\u0000\u0356\u035b\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u00058\u0000\u0000\u0358\u035b\u0003l6\u0000\u0359\u035b\u0001\u0000"+
		"\u0000\u0000\u035a\u034f\u0001\u0000\u0000\u0000\u035a\u0353\u0001\u0000"+
		"\u0000\u0000\u035a\u0357\u0001\u0000\u0000\u0000\u035a\u0359\u0001\u0000"+
		"\u0000\u0000\u035bk\u0001\u0000\u0000\u0000\u035c\u035d\u0007\u0002\u0000"+
		"\u0000\u035dm\u0001\u0000\u0000\u0000\u035e\u035f\u0005?\u0000\u0000\u035f"+
		"\u0361\u00057\u0000\u0000\u0360\u0362\u0003:\u001d\u0000\u0361\u0360\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0001"+
		"\u0000\u0000\u0000\u0363\u0365\u0003X,\u0000\u0364\u0363\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u00056\u0000\u0000\u0367o\u0001\u0000\u0000\u0000]"+
		"\u0080\u008f\u0096\u009f\u00a8\u00bb\u00c4\u00cb\u00d3\u00d7\u00dc\u00e4"+
		"\u00f0\u00f4\u0105\u010e\u0117\u011f\u0126\u0130\u013b\u0146\u0155\u0162"+
		"\u016a\u0171\u0175\u0178\u0185\u018c\u0196\u019c\u01a1\u01a9\u01b0\u01b4"+
		"\u01ba\u01c3\u01cb\u01d2\u01d6\u01dc\u01e2\u01f7\u01fa\u01fc\u0202\u020a"+
		"\u0212\u0215\u021f\u0227\u022f\u0237\u0240\u0248\u0250\u0259\u0262\u026a"+
		"\u0272\u0275\u027d\u0288\u028f\u0294\u029e\u02a2\u02b2\u02b5\u02bc\u02c6"+
		"\u02d1\u02d6\u02dd\u02e1\u02e8\u02f0\u02f8\u02fc\u0301\u0307\u030b\u0311"+
		"\u0315\u031c\u0324\u0329\u0347\u034d\u035a\u0361\u0364";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}