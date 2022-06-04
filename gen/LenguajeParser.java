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
		RULE_si = 17, RULE_idsentencia = 18, RULE_int = 19, RULE_leer = 20, RULE_leer2 = 21, 
		RULE_leer3 = 22, RULE_imprimir = 23, RULE_imprimir2 = 24, RULE_asigid = 25, 
		RULE_expre = 26, RULE_llaves = 27, RULE_logic = 28, RULE_lista = 29, RULE_lista3 = 30, 
		RULE_lista2 = 31, RULE_expre2 = 32, RULE_expre3 = 33, RULE_oper = 34, 
		RULE_else = 35, RULE_sielse = 36, RULE_caso = 37, RULE_and = 38, RULE_incremento = 39, 
		RULE_negativo = 40, RULE_argumentos = 41, RULE_argumentos2 = 42, RULE_subrutinas = 43, 
		RULE_ref = 44, RULE_expreSUB = 45, RULE_expreSUB2 = 46, RULE_valoref = 47, 
		RULE_refSUB = 48, RULE_idV = 49, RULE_idV2 = 50, RULE_vectordef = 51, 
		RULE_funciones = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "inicio2", "prog", "especificacion", "var", "const", "const2", 
			"rmt", "vector", "matriz", "matriz2", "tipodato", "registro", "tipos", 
			"pc", "sentencias", "mientras", "si", "idsentencia", "int", "leer", "leer2", 
			"leer3", "imprimir", "imprimir2", "asigid", "expre", "llaves", "logic", 
			"lista", "lista3", "lista2", "expre2", "expre3", "oper", "else", "sielse", 
			"caso", "and", "incremento", "negativo", "argumentos", "argumentos2", 
			"subrutinas", "ref", "expreSUB", "expreSUB2", "valoref", "refSUB", "idV", 
			"idV2", "vectordef", "funciones"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fin'", "'programa'", "'var'", "'const'", "'tipos'", 
			"'TRUE'", "'FALSE'", "'SI'", "'NO'", "'vector'", "'matriz'", "'registro'", 
			"'numerico'", "'cadena'", "'logico'", "'repetir'", "'hasta'", "'eval'", 
			"'sino'", "'desde'", "'imprimir'", "'leer'", "'dim'", "'cls'", "'mientras'", 
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
			setState(106);
			prog();
			setState(107);
			especificacion();
			setState(108);
			match(T__0);
			setState(109);
			sentencias();
			setState(110);
			match(T__1);
			setState(111);
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
			setState(113);
			prog();
			setState(114);
			especificacion();
			setState(115);
			match(T__0);
			setState(116);
			sentencias();
			setState(117);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__2);
				setState(120);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__3);
				setState(125);
				var();
				setState(126);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__4);
				setState(129);
				const_();
				setState(130);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__5);
				setState(133);
				tipos();
				setState(134);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(140);
					match(TK_COMA);
					setState(141);
					match(ID);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(TK_DOS_PUNTOS);
				setState(148);
				rmt();
				setState(149);
				pc();
				setState(150);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				setState(156);
				match(TK_ASIGNACION);
				setState(157);
				const2();
				setState(158);
				pc();
				setState(159);
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
			setState(164);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				tipodato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__10);
				setState(168);
				match(TK_CORCHETE_IZQUIERDO);
				setState(169);
				vector();
				setState(170);
				match(TK_CORCHETE_DERECHO);
				setState(171);
				tipodato();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__11);
				setState(174);
				match(TK_CORCHETE_IZQUIERDO);
				setState(175);
				matriz();
				setState(176);
				match(TK_CORCHETE_DERECHO);
				setState(177);
				tipodato();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(T__12);
				setState(180);
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
			setState(183);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(TK_NUMERO);
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						match(TK_COMA);
						setState(187);
						match(TK_NUMERO);
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(193);
					match(TK_COMA);
					setState(194);
					match(TK_MULTIPLICACION);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(TK_MULTIPLICACION);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(201);
					match(TK_COMA);
					setState(202);
					match(TK_MULTIPLICACION);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(TK_COMA);
				setState(212);
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
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__12);
				setState(217);
				registro();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T__15);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
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
			setState(224);
			match(TK_LLAVE_IZQUIERDA);
			setState(225);
			var();
			setState(226);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ID);
				setState(229);
				match(TK_DOS_PUNTOS);
				setState(230);
				rmt();
				setState(231);
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_y_coma:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
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
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(LenguajeParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(LenguajeParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_PUNTO_y_coma() { return getToken(LenguajeParser.TK_PUNTO_y_coma, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(LenguajeParser.TK_LLAVE_IZQUIERDA, 0); }
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(LenguajeParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(LenguajeParser.TK_ASIGNACION, 0); }
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(ID);
				setState(241);
				idsentencia();
				setState(242);
				pc();
				setState(243);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				si();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				mientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(T__16);
				setState(248);
				sentencias();
				setState(249);
				match(T__17);
				setState(250);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(251);
				expre();
				setState(252);
				match(TK_PARENTESIS_DERECHO);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(253);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(256);
				sentencias();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(T__18);
				setState(259);
				match(TK_LLAVE_IZQUIERDA);
				setState(260);
				caso();
				setState(261);
				match(T__19);
				setState(262);
				sentencias();
				setState(263);
				match(TK_LLAVE_DERECHA);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(264);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(267);
				sentencias();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(T__20);
				setState(270);
				match(ID);
				setState(271);
				match(TK_ASIGNACION);
				setState(272);
				expre();
				setState(273);
				match(T__17);
				setState(274);
				expre();
				setState(275);
				incremento();
				setState(276);
				match(TK_LLAVE_IZQUIERDA);
				setState(277);
				sentencias();
				setState(278);
				match(TK_LLAVE_DERECHA);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(279);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(282);
				sentencias();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(T__21);
				setState(285);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(286);
				imprimir();
				setState(287);
				match(TK_PARENTESIS_DERECHO);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(288);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(291);
				sentencias();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(T__22);
				setState(294);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(295);
				leer();
				setState(296);
				match(TK_PARENTESIS_DERECHO);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(297);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(300);
				sentencias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				match(T__23);
				setState(303);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(304);
				leer();
				setState(305);
				match(TK_PARENTESIS_DERECHO);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(306);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(309);
				sentencias();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(311);
				match(T__24);
				setState(312);
				match(TK_PARENTESIS_IZQUIERDO);
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
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(318);
				funciones();
				setState(319);
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
			setState(324);
			match(T__25);
			setState(325);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(326);
			expre();
			setState(327);
			match(TK_PARENTESIS_DERECHO);
			setState(328);
			match(TK_LLAVE_IZQUIERDA);
			setState(329);
			sentencias();
			setState(330);
			match(TK_LLAVE_DERECHA);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(331);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(334);
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
		enterRule(_localctx, 34, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__26);
			setState(337);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(338);
			expre();
			setState(339);
			match(TK_PARENTESIS_DERECHO);
			setState(340);
			match(TK_LLAVE_IZQUIERDA);
			setState(341);
			sentencias();
			setState(342);
			else_();
			setState(343);
			match(TK_LLAVE_DERECHA);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PUNTO_y_coma) {
				{
				setState(344);
				match(TK_PUNTO_y_coma);
				}
			}

			setState(347);
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
		enterRule(_localctx, 36, RULE_idsentencia);
		int _la;
		try {
			int _alt;
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(349);
					match(TK_PUNTO);
					setState(350);
					match(ID);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				asigid();
				setState(357);
				int_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				asigid();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(360);
					expre();
					}
					break;
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_CADENA) {
					{
					setState(363);
					match(TK_CADENA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				asigid();
				setState(367);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(368);
				expre();
				setState(369);
				match(TK_PARENTESIS_DERECHO);
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						logic();
						setState(371);
						match(TK_PARENTESIS_IZQUIERDO);
						setState(372);
						expre();
						setState(373);
						match(TK_PARENTESIS_DERECHO);
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(380);
					match(TK_PUNTO);
					setState(381);
					match(ID);
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(TK_CORCHETE_IZQUIERDO);
				setState(388);
				vector();
				setState(389);
				match(TK_CORCHETE_DERECHO);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_PUNTO) {
					{
					{
					setState(390);
					match(TK_PUNTO);
					setState(391);
					match(ID);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				asigid();
				setState(398);
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
		enterRule(_localctx, 38, RULE_int);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__27);
				setState(403);
				expre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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
		enterRule(_localctx, 40, RULE_leer);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				ref();
				setState(408);
				match(ID);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(409);
					match(TK_COMA);
					setState(410);
					match(ID);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_DOS_PUNTOS) {
					{
					{
					setState(416);
					match(TK_DOS_PUNTOS);
					setState(417);
					tipodato();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PUNTO_y_coma) {
					{
					setState(423);
					match(TK_PUNTO_y_coma);
					}
				}

				setState(426);
				leer();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
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
		enterRule(_localctx, 42, RULE_leer2);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(TK_CORCHETE_IZQUIERDO);
				setState(433);
				leer3();
				setState(434);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(TK_COMA);
				setState(437);
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
		enterRule(_localctx, 44, RULE_leer3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 46, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(443);
				match(ID);
				}
				break;
			case 2:
				{
				setState(444);
				match(TK_NUMERO);
				}
				break;
			case 3:
				{
				setState(445);
				match(TK_CADENA);
				}
				break;
			case 4:
				{
				setState(446);
				funciones();
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(449);
				match(TK_COMA);
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(450);
					match(ID);
					}
					break;
				case 2:
					{
					setState(451);
					match(TK_NUMERO);
					}
					break;
				case 3:
					{
					setState(452);
					match(TK_CADENA);
					}
					break;
				case 4:
					{
					setState(453);
					funciones();
					}
					break;
				}
				}
				}
				setState(460);
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
		enterRule(_localctx, 48, RULE_imprimir2);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(TK_COMA);
				setState(462);
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
		enterRule(_localctx, 50, RULE_asigid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		enterRule(_localctx, 52, RULE_expre);
		try {
			int _alt;
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(468);
					match(ID);
					}
					break;
				case 2:
					{
					setState(469);
					funciones();
					}
					break;
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(494);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(472);
							oper();
							setState(473);
							match(ID);
							}
							break;
						case 2:
							{
							setState(475);
							oper();
							setState(476);
							match(TK_NUMERO);
							}
							break;
						case 3:
							{
							setState(478);
							oper();
							setState(479);
							funciones();
							}
							break;
						case 4:
							{
							setState(481);
							oper();
							setState(482);
							match(TK_CADENA);
							}
							break;
						case 5:
							{
							setState(484);
							match(TK_PUNTO);
							setState(485);
							match(ID);
							setState(491);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(486);
									oper();
									setState(487);
									expre();
									}
									} 
								}
								setState(493);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
							}
							}
							break;
						}
						} 
					}
					setState(498);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(499);
					match(TK_CORCHETE_IZQUIERDO);
					setState(502);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(500);
						matriz();
						}
						break;
					case 2:
						{
						setState(501);
						vector();
						}
						break;
					}
					setState(504);
					match(TK_CORCHETE_DERECHO);
					setState(510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(505);
							oper();
							setState(506);
							match(TK_NUMERO);
							}
							} 
						}
						setState(512);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					setState(518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(513);
							oper();
							setState(514);
							match(ID);
							}
							} 
						}
						setState(520);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					}
					}
					break;
				}
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(524);
				expre();
				setState(525);
				match(TK_PARENTESIS_DERECHO);
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(534);
						oper();
						setState(535);
						match(TK_NUMERO);
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(542);
						oper();
						setState(543);
						funciones();
						}
						} 
					}
					setState(549);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(550);
						oper();
						setState(551);
						expre();
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(TK_NUMERO);
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(559);
						oper();
						setState(560);
						match(ID);
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						oper();
						setState(568);
						match(TK_NUMERO);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						oper();
						setState(576);
						funciones();
						}
						} 
					}
					setState(582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				match(TK_LLAVE_IZQUIERDA);
				setState(584);
				llaves();
				setState(585);
				match(TK_LLAVE_DERECHA);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				match(T__27);
				setState(588);
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
		enterRule(_localctx, 54, RULE_llaves);
		try {
			int _alt;
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(TK_LLAVE_IZQUIERDA);
				setState(592);
				llaves();
				setState(593);
				match(TK_LLAVE_DERECHA);
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(TK_COMA);
						setState(595);
						llaves();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(TK_CADENA);
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(TK_COMA);
						setState(603);
						llaves();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(TK_NUMERO);
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(TK_COMA);
						setState(611);
						llaves();
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 56, RULE_logic);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(T__28);
				setState(620);
				expre();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(T__29);
				setState(622);
				expre();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				match(ID);
				setState(624);
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
		enterRule(_localctx, 58, RULE_lista);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(TK_NUMERO);
				setState(628);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(TK_CADENA);
				setState(630);
				lista2();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(TK_LLAVE_IZQUIERDA);
				setState(632);
				lista3();
				setState(633);
				match(TK_LLAVE_DERECHA);
				setState(634);
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
		enterRule(_localctx, 60, RULE_lista3);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(TK_NUMERO);
				setState(639);
				lista2();
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(TK_CADENA);
				setState(641);
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
		enterRule(_localctx, 62, RULE_lista2);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(TK_COMA);
				setState(646);
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
		enterRule(_localctx, 64, RULE_expre2);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(TK_SUMA);
				setState(651);
				expre3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				oper();
				setState(653);
				expre();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				match(TK_MULTIPLICACION);
				setState(656);
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
		enterRule(_localctx, 66, RULE_expre3);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				idV();
				}
				break;
			case TK_NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
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
		enterRule(_localctx, 68, RULE_oper);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MAYOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(TK_MAYOR);
				}
				break;
			case TK_MAYOR_igual:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(TK_MAYOR_igual);
				}
				break;
			case TK_MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				match(TK_MENOR);
				}
				break;
			case TK_MENOR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(TK_MENOR_IGUAL);
				}
				break;
			case TK_IGUAL_QUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				match(TK_IGUAL_QUE);
				}
				break;
			case TK_SUMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(669);
				match(TK_SUMA);
				}
				break;
			case TK_RESTA:
				enterOuterAlt(_localctx, 7);
				{
				setState(670);
				match(TK_RESTA);
				}
				break;
			case TK_POTENCIACION:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				match(TK_POTENCIACION);
				}
				break;
			case TK_MULTIPLICACION:
				enterOuterAlt(_localctx, 9);
				{
				setState(672);
				match(TK_MULTIPLICACION);
				}
				break;
			case TK_MODULO:
				enterOuterAlt(_localctx, 10);
				{
				setState(673);
				match(TK_MODULO);
				}
				break;
			case TK_DIVISION:
				enterOuterAlt(_localctx, 11);
				{
				setState(674);
				match(TK_DIVISION);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 12);
				{
				setState(675);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 13);
				{
				setState(676);
				match(T__29);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(677);
					match(T__30);
					}
				}

				}
				break;
			case TK_DISTINTO_DE:
				enterOuterAlt(_localctx, 14);
				{
				setState(680);
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
		enterRule(_localctx, 70, RULE_else);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(T__19);
				setState(684);
				sielse();
				setState(685);
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
		enterRule(_localctx, 72, RULE_sielse);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(T__26);
				setState(691);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(692);
				expre();
				setState(693);
				match(TK_PARENTESIS_DERECHO);
				setState(694);
				else_();
				setState(695);
				sentencias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
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
		enterRule(_localctx, 74, RULE_caso);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(T__31);
				setState(701);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(702);
				expre();
				setState(703);
				and();
				setState(704);
				match(TK_PARENTESIS_DERECHO);
				setState(705);
				sentencias();
				setState(706);
				caso();
				}
				break;
			case T__19:
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
		enterRule(_localctx, 76, RULE_and);
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(T__29);
				setState(712);
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
		enterRule(_localctx, 78, RULE_incremento);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(T__32);
				setState(717);
				negativo();
				setState(718);
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
		enterRule(_localctx, 80, RULE_negativo);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
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
		enterRule(_localctx, 82, RULE_argumentos);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				match(TK_NUMERO);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(728);
					match(TK_COMA);
					setState(729);
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
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(TK_CADENA);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(736);
					match(TK_COMA);
					setState(737);
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
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				match(ID);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(744);
					match(TK_COMA);
					setState(745);
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
					setState(750);
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
		enterRule(_localctx, 84, RULE_argumentos2);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(TK_COMA);
				setState(755);
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
		enterRule(_localctx, 86, RULE_subrutinas);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(T__33);
				setState(760);
				match(ID);
				setState(761);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(762);
					leer();
					}
					break;
				}
				setState(765);
				match(TK_PARENTESIS_DERECHO);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(766);
					valoref();
					}
				}

				setState(769);
				inicio2();
				setState(770);
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
		enterRule(_localctx, 88, RULE_ref);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
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
		enterRule(_localctx, 90, RULE_expreSUB);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(ID);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(780);
					match(TK_COMA);
					setState(781);
					match(ID);
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(787);
				match(TK_DOS_PUNTOS);
				setState(788);
				rmt();
				setState(789);
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
		enterRule(_localctx, 92, RULE_expreSUB2);
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(TK_PUNTO_y_coma);
				setState(795);
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
		enterRule(_localctx, 94, RULE_valoref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(T__35);
			setState(800);
			tipodato();
			setState(801);
			especificacion();
			setState(802);
			match(T__0);
			setState(803);
			sentencias();
			setState(804);
			match(T__35);
			setState(805);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(806);
			expre();
			setState(807);
			match(TK_PARENTESIS_DERECHO);
			setState(808);
			match(T__1);
			setState(809);
			refSUB();
			setState(810);
			match(T__0);
			setState(811);
			sentencias();
			setState(812);
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
		enterRule(_localctx, 96, RULE_refSUB);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(T__3);
				setState(815);
				var();
				setState(816);
				especificacion();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(T__4);
				setState(819);
				const_();
				setState(820);
				especificacion();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				match(T__5);
				setState(823);
				tipos();
				setState(824);
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
		enterRule(_localctx, 98, RULE_idV);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(ID);
				setState(830);
				idV2();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(T__36);
				setState(832);
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
		enterRule(_localctx, 100, RULE_idV2);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(836);
				vectordef();
				setState(837);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(TK_CORCHETE_IZQUIERDO);
				setState(840);
				vectordef();
				setState(841);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(TK_POTENCIACION);
				setState(844);
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
		enterRule(_localctx, 102, RULE_vectordef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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
		enterRule(_localctx, 104, RULE_funciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(ID);
			setState(851);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(852);
				expre();
				}
				break;
			}
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(855);
				argumentos();
				}
				break;
			}
			setState(858);
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
		"\u0004\u0001B\u035d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008f\b\u0004\n\u0004"+
		"\f\u0004\u0092\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a3\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b6\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00bd\b\t\n\t\f\t\u00c0\t\t\u0001\t\u0001\t\u0005\t\u00c4\b\t\n\t\f"+
		"\t\u00c7\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00cc\b\t\n\t\f\t\u00cf\t"+
		"\t\u0001\t\u0003\t\u00d2\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u00d7\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00df\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ef\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ff"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0119\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0122\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u012b\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0134\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u013c\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0143\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014d"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u015a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0160\b\u0012\n\u0012\f\u0012\u0163\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016a\b\u0012\u0001\u0012"+
		"\u0003\u0012\u016d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0178\b\u0012\n\u0012\f\u0012\u017b\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u017f\b\u0012\n\u0012\f\u0012\u0182\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0189\b\u0012\n\u0012"+
		"\f\u0012\u018c\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0191\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0196\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u019c"+
		"\b\u0014\n\u0014\f\u0014\u019f\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01a3\b\u0014\n\u0014\f\u0014\u01a6\t\u0014\u0001\u0014\u0003\u0014\u01a9"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01af"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01b8\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c0\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c7"+
		"\b\u0017\u0005\u0017\u01c9\b\u0017\n\u0017\f\u0017\u01cc\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d1\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01d7\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01ea\b\u001a\n"+
		"\u001a\f\u001a\u01ed\t\u001a\u0005\u001a\u01ef\b\u001a\n\u001a\f\u001a"+
		"\u01f2\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f7\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01fd"+
		"\b\u001a\n\u001a\f\u001a\u0200\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0205\b\u001a\n\u001a\f\u001a\u0208\t\u001a\u0003\u001a\u020a"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0212\b\u001a\n\u001a\f\u001a\u0215\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u021a\b\u001a\n\u001a\f\u001a\u021d"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0222\b\u001a"+
		"\n\u001a\f\u001a\u0225\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u022a\b\u001a\n\u001a\f\u001a\u022d\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0233\b\u001a\n\u001a\f\u001a\u0236"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u023b\b\u001a"+
		"\n\u001a\f\u001a\u023e\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0243\b\u001a\n\u001a\f\u001a\u0246\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u024e\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u0255\b\u001b\n\u001b\f\u001b\u0258\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u025d\b\u001b\n\u001b\f\u001b\u0260\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0265\b\u001b\n\u001b\f\u001b\u0268"+
		"\t\u001b\u0003\u001b\u026a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0272\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u027d\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0284\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0289\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0293\b \u0001!\u0001!\u0003"+
		"!\u0297\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02a7\b\"\u0001"+
		"\"\u0003\"\u02aa\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02b1\b"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02bb"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u02c6\b%\u0001&\u0001&\u0001&\u0003&\u02cb\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02d2\b\'\u0001(\u0001(\u0003(\u02d6\b(\u0001"+
		")\u0001)\u0001)\u0005)\u02db\b)\n)\f)\u02de\t)\u0001)\u0001)\u0001)\u0005"+
		")\u02e3\b)\n)\f)\u02e6\t)\u0001)\u0001)\u0001)\u0005)\u02eb\b)\n)\f)\u02ee"+
		"\t)\u0001)\u0003)\u02f1\b)\u0001*\u0001*\u0001*\u0003*\u02f6\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02fc\b+\u0001+\u0001+\u0003+\u0300\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0306\b+\u0001,\u0001,\u0003,\u030a\b,\u0001"+
		"-\u0001-\u0001-\u0005-\u030f\b-\n-\f-\u0312\t-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0319\b-\u0001.\u0001.\u0001.\u0003.\u031e\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u033c\b0\u00011\u0001"+
		"1\u00011\u00011\u00031\u0342\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u034f\b2\u00013\u00013\u0001"+
		"4\u00014\u00014\u00034\u0356\b4\u00014\u00034\u0359\b4\u00014\u00014\u0001"+
		"4\u0000\u00005\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh\u0000"+
		"\u0005\u0002\u0000\u0007\n@A\u0002\u000055?@\u0001\u0000?@\u0002\u0000"+
		"&&,,\u0001\u0000?A\u03bb\u0000j\u0001\u0000\u0000\u0000\u0002q\u0001\u0000"+
		"\u0000\u0000\u0004z\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000"+
		"\u0000\b\u0099\u0001\u0000\u0000\u0000\n\u00a2\u0001\u0000\u0000\u0000"+
		"\f\u00a4\u0001\u0000\u0000\u0000\u000e\u00b5\u0001\u0000\u0000\u0000\u0010"+
		"\u00b7\u0001\u0000\u0000\u0000\u0012\u00d1\u0001\u0000\u0000\u0000\u0014"+
		"\u00d6\u0001\u0000\u0000\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018"+
		"\u00e0\u0001\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c"+
		"\u00ee\u0001\u0000\u0000\u0000\u001e\u0142\u0001\u0000\u0000\u0000 \u0144"+
		"\u0001\u0000\u0000\u0000\"\u0150\u0001\u0000\u0000\u0000$\u0190\u0001"+
		"\u0000\u0000\u0000&\u0195\u0001\u0000\u0000\u0000(\u01ae\u0001\u0000\u0000"+
		"\u0000*\u01b7\u0001\u0000\u0000\u0000,\u01b9\u0001\u0000\u0000\u0000."+
		"\u01bf\u0001\u0000\u0000\u00000\u01d0\u0001\u0000\u0000\u00002\u01d2\u0001"+
		"\u0000\u0000\u00004\u024d\u0001\u0000\u0000\u00006\u0269\u0001\u0000\u0000"+
		"\u00008\u0271\u0001\u0000\u0000\u0000:\u027c\u0001\u0000\u0000\u0000<"+
		"\u0283\u0001\u0000\u0000\u0000>\u0288\u0001\u0000\u0000\u0000@\u0292\u0001"+
		"\u0000\u0000\u0000B\u0296\u0001\u0000\u0000\u0000D\u02a9\u0001\u0000\u0000"+
		"\u0000F\u02b0\u0001\u0000\u0000\u0000H\u02ba\u0001\u0000\u0000\u0000J"+
		"\u02c5\u0001\u0000\u0000\u0000L\u02ca\u0001\u0000\u0000\u0000N\u02d1\u0001"+
		"\u0000\u0000\u0000P\u02d5\u0001\u0000\u0000\u0000R\u02f0\u0001\u0000\u0000"+
		"\u0000T\u02f5\u0001\u0000\u0000\u0000V\u0305\u0001\u0000\u0000\u0000X"+
		"\u0309\u0001\u0000\u0000\u0000Z\u0318\u0001\u0000\u0000\u0000\\\u031d"+
		"\u0001\u0000\u0000\u0000^\u031f\u0001\u0000\u0000\u0000`\u033b\u0001\u0000"+
		"\u0000\u0000b\u0341\u0001\u0000\u0000\u0000d\u034e\u0001\u0000\u0000\u0000"+
		"f\u0350\u0001\u0000\u0000\u0000h\u0352\u0001\u0000\u0000\u0000jk\u0003"+
		"\u0004\u0002\u0000kl\u0003\u0006\u0003\u0000lm\u0005\u0001\u0000\u0000"+
		"mn\u0003\u001e\u000f\u0000no\u0005\u0002\u0000\u0000op\u0003V+\u0000p"+
		"\u0001\u0001\u0000\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0003\u0006"+
		"\u0003\u0000st\u0005\u0001\u0000\u0000tu\u0003\u001e\u000f\u0000uv\u0005"+
		"\u0002\u0000\u0000v\u0003\u0001\u0000\u0000\u0000wx\u0005\u0003\u0000"+
		"\u0000x{\u0005?\u0000\u0000y{\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0004\u0000\u0000}~\u0003\b\u0004\u0000~\u007f\u0003\u0006\u0003\u0000"+
		"\u007f\u008a\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000"+
		"\u0081\u0082\u0003\n\u0005\u0000\u0082\u0083\u0003\u0006\u0003\u0000\u0083"+
		"\u008a\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085"+
		"\u0086\u0003\u001a\r\u0000\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089|\u0001"+
		"\u0000\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0084\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001"+
		"\u0000\u0000\u0000\u008b\u0090\u0005?\u0000\u0000\u008c\u008d\u0005\'"+
		"\u0000\u0000\u008d\u008f\u0005?\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005,\u0000\u0000"+
		"\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0003\u001c\u000e\u0000"+
		"\u0096\u0097\u0003\b\u0004\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005?\u0000\u0000\u009c\u009d\u0005&\u0000\u0000\u009d\u009e\u0003\f"+
		"\u0006\u0000\u009e\u009f\u0003\u001c\u000e\u0000\u009f\u00a0\u0003\n\u0005"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u000b\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0000\u0000"+
		"\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00b6\u0003\u0016\u000b\u0000"+
		"\u00a7\u00a8\u0005\u000b\u0000\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0010\b\u0000\u00aa\u00ab\u0005(\u0000\u0000\u00ab\u00ac"+
		"\u0003\u0016\u000b\u0000\u00ac\u00b6\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\f\u0000\u0000\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b0\u0003"+
		"\u0012\t\u0000\u00b0\u00b1\u0005(\u0000\u0000\u00b1\u00b2\u0003\u0016"+
		"\u000b\u0000\u00b2\u00b6\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\r\u0000"+
		"\u0000\u00b4\u00b6\u0003\u0018\f\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u000f\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0007\u0001\u0000\u0000\u00b8\u0011\u0001\u0000\u0000\u0000"+
		"\u00b9\u00be\u0005@\u0000\u0000\u00ba\u00bb\u0005\'\u0000\u0000\u00bb"+
		"\u00bd\u0005@\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c5\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\'\u0000\u0000\u00c2\u00c4\u0005"+
		"5\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00d2\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cd\u00055\u0000\u0000\u00c9\u00ca\u0005\'\u0000"+
		"\u0000\u00ca\u00cc\u00055\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u00034\u001a\u0000\u00d1"+
		"\u00b9\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\'\u0000\u0000\u00d4\u00d7\u0003\u0012\t\u0000\u00d5\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\r\u0000\u0000\u00d9\u00df\u0003\u0018\f\u0000\u00da\u00df\u0005"+
		"\u000e\u0000\u0000\u00db\u00df\u0005\u000f\u0000\u0000\u00dc\u00df\u0005"+
		"\u0010\u0000\u0000\u00dd\u00df\u0005?\u0000\u0000\u00de\u00d8\u0001\u0000"+
		"\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005/\u0000"+
		"\u0000\u00e1\u00e2\u0003\b\u0004\u0000\u00e2\u00e3\u0005.\u0000\u0000"+
		"\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005?\u0000\u0000\u00e5"+
		"\u00e6\u0005,\u0000\u0000\u00e6\u00e7\u0003\u000e\u0007\u0000\u00e7\u00e8"+
		"\u0003\u001a\r\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ef\u0005"+
		":\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u001d\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005?\u0000\u0000\u00f1\u00f2\u0003$\u0012\u0000"+
		"\u00f2\u00f3\u0003\u001c\u000e\u0000\u00f3\u00f4\u0003\u001e\u000f\u0000"+
		"\u00f4\u0143\u0001\u0000\u0000\u0000\u00f5\u0143\u0003\"\u0011\u0000\u00f6"+
		"\u0143\u0003 \u0010\u0000\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00f9"+
		"\u0003\u001e\u000f\u0000\u00f9\u00fa\u0005\u0012\u0000\u0000\u00fa\u00fb"+
		"\u00057\u0000\u0000\u00fb\u00fc\u00034\u001a\u0000\u00fc\u00fe\u00056"+
		"\u0000\u0000\u00fd\u00ff\u0005:\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0003\u001e\u000f\u0000\u0101\u0143\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005\u0013\u0000\u0000\u0103\u0104\u0005/\u0000\u0000"+
		"\u0104\u0105\u0003J%\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u0107"+
		"\u0003\u001e\u000f\u0000\u0107\u0109\u0005.\u0000\u0000\u0108\u010a\u0005"+
		":\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u001e"+
		"\u000f\u0000\u010c\u0143\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0015"+
		"\u0000\u0000\u010e\u010f\u0005?\u0000\u0000\u010f\u0110\u0005&\u0000\u0000"+
		"\u0110\u0111\u00034\u001a\u0000\u0111\u0112\u0005\u0012\u0000\u0000\u0112"+
		"\u0113\u00034\u001a\u0000\u0113\u0114\u0003N\'\u0000\u0114\u0115\u0005"+
		"/\u0000\u0000\u0115\u0116\u0003\u001e\u000f\u0000\u0116\u0118\u0005.\u0000"+
		"\u0000\u0117\u0119\u0005:\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0003\u001e\u000f\u0000\u011b\u0143\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\u0016\u0000\u0000\u011d\u011e\u00057\u0000\u0000\u011e"+
		"\u011f\u0003.\u0017\u0000\u011f\u0121\u00056\u0000\u0000\u0120\u0122\u0005"+
		":\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0003\u001e"+
		"\u000f\u0000\u0124\u0143\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0017"+
		"\u0000\u0000\u0126\u0127\u00057\u0000\u0000\u0127\u0128\u0003(\u0014\u0000"+
		"\u0128\u012a\u00056\u0000\u0000\u0129\u012b\u0005:\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0003\u001e\u000f\u0000\u012d\u0143"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0018\u0000\u0000\u012f\u0130"+
		"\u00057\u0000\u0000\u0130\u0131\u0003(\u0014\u0000\u0131\u0133\u00056"+
		"\u0000\u0000\u0132\u0134\u0005:\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0003\u001e\u000f\u0000\u0136\u0143\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\u0019\u0000\u0000\u0138\u0139\u00057\u0000\u0000"+
		"\u0139\u013b\u00056\u0000\u0000\u013a\u013c\u0005:\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u0143\u0003\u001e\u000f\u0000\u013e\u013f"+
		"\u0003h4\u0000\u013f\u0140\u0003\u001e\u000f\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u00f0\u0001\u0000"+
		"\u0000\u0000\u0142\u00f5\u0001\u0000\u0000\u0000\u0142\u00f6\u0001\u0000"+
		"\u0000\u0000\u0142\u00f7\u0001\u0000\u0000\u0000\u0142\u0102\u0001\u0000"+
		"\u0000\u0000\u0142\u010d\u0001\u0000\u0000\u0000\u0142\u011c\u0001\u0000"+
		"\u0000\u0000\u0142\u0125\u0001\u0000\u0000\u0000\u0142\u012e\u0001\u0000"+
		"\u0000\u0000\u0142\u0137\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000"+
		"\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u001f\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0005\u001a\u0000\u0000\u0145\u0146\u00057\u0000"+
		"\u0000\u0146\u0147\u00034\u001a\u0000\u0147\u0148\u00056\u0000\u0000\u0148"+
		"\u0149\u0005/\u0000\u0000\u0149\u014a\u0003\u001e\u000f\u0000\u014a\u014c"+
		"\u0005.\u0000\u0000\u014b\u014d\u0005:\u0000\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0003\u001e\u000f\u0000\u014f!\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\u001b\u0000\u0000\u0151\u0152\u00057\u0000\u0000"+
		"\u0152\u0153\u00034\u001a\u0000\u0153\u0154\u00056\u0000\u0000\u0154\u0155"+
		"\u0005/\u0000\u0000\u0155\u0156\u0003\u001e\u000f\u0000\u0156\u0157\u0003"+
		"F#\u0000\u0157\u0159\u0005.\u0000\u0000\u0158\u015a\u0005:\u0000\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0003\u001e\u000f\u0000"+
		"\u015c#\u0001\u0000\u0000\u0000\u015d\u015e\u00059\u0000\u0000\u015e\u0160"+
		"\u0005?\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u00032\u0019\u0000\u0165\u0166\u0003&\u0013"+
		"\u0000\u0166\u0191\u0001\u0000\u0000\u0000\u0167\u0169\u00032\u0019\u0000"+
		"\u0168\u016a\u00034\u001a\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b"+
		"\u016d\u0005A\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u0191\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u00032\u0019\u0000\u016f\u0170\u00057\u0000\u0000\u0170\u0171\u00034"+
		"\u001a\u0000\u0171\u0179\u00056\u0000\u0000\u0172\u0173\u00038\u001c\u0000"+
		"\u0173\u0174\u00057\u0000\u0000\u0174\u0175\u00034\u001a\u0000\u0175\u0176"+
		"\u00056\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0172\u0001"+
		"\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u0191\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"9\u0000\u0000\u017d\u017f\u0005?\u0000\u0000\u017e\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000"+
		"\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0005)\u0000\u0000"+
		"\u0184\u0185\u0003\u0010\b\u0000\u0185\u018a\u0005(\u0000\u0000\u0186"+
		"\u0187\u00059\u0000\u0000\u0187\u0189\u0005?\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001"+
		"\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0003"+
		"2\u0019\u0000\u018e\u018f\u00034\u001a\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u0161\u0001\u0000\u0000\u0000\u0190\u0167\u0001\u0000\u0000"+
		"\u0000\u0190\u016e\u0001\u0000\u0000\u0000\u0190\u0180\u0001\u0000\u0000"+
		"\u0000\u0191%\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u001c\u0000\u0000"+
		"\u0193\u0196\u00034\u001a\u0000\u0194\u0196\u00034\u001a\u0000\u0195\u0192"+
		"\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\'\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0003X,\u0000\u0198\u019d\u0005?\u0000"+
		"\u0000\u0199\u019a\u0005\'\u0000\u0000\u019a\u019c\u0005?\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u01a4\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005,\u0000\u0000\u01a1\u01a3\u0003\u0016\u000b\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u0005:\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0003(\u0014\u0000\u01ab\u01af\u0001\u0000\u0000\u0000\u01ac\u01af\u0005"+
		"A\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u0197\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af)\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005)\u0000\u0000"+
		"\u01b1\u01b2\u0003,\u0016\u0000\u01b2\u01b3\u0005(\u0000\u0000\u01b3\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\'\u0000\u0000\u01b5\u01b8\u0003"+
		"(\u0014\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8+\u0001\u0000\u0000\u0000\u01b9\u01ba\u0007\u0002\u0000"+
		"\u0000\u01ba-\u0001\u0000\u0000\u0000\u01bb\u01c0\u0005?\u0000\u0000\u01bc"+
		"\u01c0\u0005@\u0000\u0000\u01bd\u01c0\u0005A\u0000\u0000\u01be\u01c0\u0003"+
		"h4\u0000\u01bf\u01bb\u0001\u0000\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01c0\u01ca\u0001\u0000\u0000\u0000\u01c1\u01c6\u0005\'\u0000\u0000"+
		"\u01c2\u01c7\u0005?\u0000\u0000\u01c3\u01c7\u0005@\u0000\u0000\u01c4\u01c7"+
		"\u0005A\u0000\u0000\u01c5\u01c7\u0003h4\u0000\u01c6\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c1\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cb/\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0005\'\u0000\u0000\u01ce\u01d1\u0003.\u0017\u0000"+
		"\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d11\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0007\u0003\u0000\u0000\u01d33\u0001\u0000\u0000\u0000\u01d4\u01d7"+
		"\u0005?\u0000\u0000\u01d5\u01d7\u0003h4\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01f0\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0003D\"\u0000\u01d9\u01da\u0005?\u0000\u0000"+
		"\u01da\u01ef\u0001\u0000\u0000\u0000\u01db\u01dc\u0003D\"\u0000\u01dc"+
		"\u01dd\u0005@\u0000\u0000\u01dd\u01ef\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0003D\"\u0000\u01df\u01e0\u0003h4\u0000\u01e0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0003D\"\u0000\u01e2\u01e3\u0005A\u0000\u0000\u01e3"+
		"\u01ef\u0001\u0000\u0000\u0000\u01e4\u01e5\u00059\u0000\u0000\u01e5\u01eb"+
		"\u0005?\u0000\u0000\u01e6\u01e7\u0003D\"\u0000\u01e7\u01e8\u00034\u001a"+
		"\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e6\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01d8\u0001\u0000\u0000"+
		"\u0000\u01ee\u01db\u0001\u0000\u0000\u0000\u01ee\u01de\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e1\u0001\u0000\u0000\u0000\u01ee\u01e4\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u0209\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f6\u0005)\u0000\u0000"+
		"\u01f4\u01f7\u0003\u0012\t\u0000\u01f5\u01f7\u0003\u0010\b\u0000\u01f6"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fe\u0005(\u0000\u0000\u01f9\u01fa"+
		"\u0003D\"\u0000\u01fa\u01fb\u0005@\u0000\u0000\u01fb\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff\u0206\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0003D\"\u0000\u0202\u0203\u0005?\u0000\u0000"+
		"\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u0201\u0001\u0000\u0000\u0000"+
		"\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u01f3\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u024e\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u00057\u0000\u0000\u020c\u020d\u00034\u001a\u0000\u020d\u0213"+
		"\u00056\u0000\u0000\u020e\u020f\u0003D\"\u0000\u020f\u0210\u0005?\u0000"+
		"\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020e\u0001\u0000\u0000"+
		"\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u021b\u0001\u0000\u0000"+
		"\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0003D\"\u0000"+
		"\u0217\u0218\u0005@\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219"+
		"\u0216\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u0223\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0003D\"\u0000\u021f\u0220\u0003h4\u0000\u0220\u0222\u0001\u0000"+
		"\u0000\u0000\u0221\u021e\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000"+
		"\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224\u022b\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0003D\"\u0000\u0227\u0228\u00034\u001a\u0000"+
		"\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000"+
		"\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u024e\u0001\u0000\u0000\u0000"+
		"\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0234\u0005@\u0000\u0000\u022f"+
		"\u0230\u0003D\"\u0000\u0230\u0231\u0005?\u0000\u0000\u0231\u0233\u0001"+
		"\u0000\u0000\u0000\u0232\u022f\u0001\u0000\u0000\u0000\u0233\u0236\u0001"+
		"\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001"+
		"\u0000\u0000\u0000\u0235\u023c\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0003D\"\u0000\u0238\u0239\u0005@\u0000"+
		"\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0237\u0001\u0000\u0000"+
		"\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u0244\u0001\u0000\u0000"+
		"\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0240\u0003D\"\u0000"+
		"\u0240\u0241\u0003h4\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u023f"+
		"\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u024e"+
		"\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0005/\u0000\u0000\u0248\u0249\u00036\u001b\u0000\u0249\u024a\u0005."+
		"\u0000\u0000\u024a\u024e\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u001c"+
		"\u0000\u0000\u024c\u024e\u00034\u001a\u0000\u024d\u01d6\u0001\u0000\u0000"+
		"\u0000\u024d\u020b\u0001\u0000\u0000\u0000\u024d\u022e\u0001\u0000\u0000"+
		"\u0000\u024d\u0247\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024e5\u0001\u0000\u0000\u0000\u024f\u0250\u0005/\u0000\u0000\u0250"+
		"\u0251\u00036\u001b\u0000\u0251\u0256\u0005.\u0000\u0000\u0252\u0253\u0005"+
		"\'\u0000\u0000\u0253\u0255\u00036\u001b\u0000\u0254\u0252\u0001\u0000"+
		"\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u026a\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025e\u0005A\u0000"+
		"\u0000\u025a\u025b\u0005\'\u0000\u0000\u025b\u025d\u00036\u001b\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u026a\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000"+
		"\u0261\u0266\u0005@\u0000\u0000\u0262\u0263\u0005\'\u0000\u0000\u0263"+
		"\u0265\u00036\u001b\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268"+
		"\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266"+
		"\u0001\u0000\u0000\u0000\u0269\u024f\u0001\u0000\u0000\u0000\u0269\u0259"+
		"\u0001\u0000\u0000\u0000\u0269\u0261\u0001\u0000\u0000\u0000\u026a7\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0005\u001d\u0000\u0000\u026c\u0272\u0003"+
		"4\u001a\u0000\u026d\u026e\u0005\u001e\u0000\u0000\u026e\u0272\u00034\u001a"+
		"\u0000\u026f\u0270\u0005?\u0000\u0000\u0270\u0272\u0003@ \u0000\u0271"+
		"\u026b\u0001\u0000\u0000\u0000\u0271\u026d\u0001\u0000\u0000\u0000\u0271"+
		"\u026f\u0001\u0000\u0000\u0000\u02729\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0005@\u0000\u0000\u0274\u027d\u0003>\u001f\u0000\u0275\u0276\u0005A"+
		"\u0000\u0000\u0276\u027d\u0003>\u001f\u0000\u0277\u0278\u0005/\u0000\u0000"+
		"\u0278\u0279\u0003<\u001e\u0000\u0279\u027a\u0005.\u0000\u0000\u027a\u027b"+
		"\u0003>\u001f\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c\u0273\u0001"+
		"\u0000\u0000\u0000\u027c\u0275\u0001\u0000\u0000\u0000\u027c\u0277\u0001"+
		"\u0000\u0000\u0000\u027d;\u0001\u0000\u0000\u0000\u027e\u027f\u0005@\u0000"+
		"\u0000\u027f\u0284\u0003>\u001f\u0000\u0280\u0281\u0005A\u0000\u0000\u0281"+
		"\u0284\u0003>\u001f\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u027e"+
		"\u0001\u0000\u0000\u0000\u0283\u0280\u0001\u0000\u0000\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0284=\u0001\u0000\u0000\u0000\u0285\u0286\u0005"+
		"\'\u0000\u0000\u0286\u0289\u0003:\u001d\u0000\u0287\u0289\u0001\u0000"+
		"\u0000\u0000\u0288\u0285\u0001\u0000\u0000\u0000\u0288\u0287\u0001\u0000"+
		"\u0000\u0000\u0289?\u0001\u0000\u0000\u0000\u028a\u028b\u0005<\u0000\u0000"+
		"\u028b\u0293\u0003B!\u0000\u028c\u028d\u0003D\"\u0000\u028d\u028e\u0003"+
		"4\u001a\u0000\u028e\u0293\u0001\u0000\u0000\u0000\u028f\u0290\u00055\u0000"+
		"\u0000\u0290\u0293\u0003B!\u0000\u0291\u0293\u0001\u0000\u0000\u0000\u0292"+
		"\u028a\u0001\u0000\u0000\u0000\u0292\u028c\u0001\u0000\u0000\u0000\u0292"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0293"+
		"A\u0001\u0000\u0000\u0000\u0294\u0297\u0003b1\u0000\u0295\u0297\u0005"+
		"@\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0295\u0001\u0000"+
		"\u0000\u0000\u0297C\u0001\u0000\u0000\u0000\u0298\u02aa\u00050\u0000\u0000"+
		"\u0299\u02aa\u00051\u0000\u0000\u029a\u02aa\u00052\u0000\u0000\u029b\u02aa"+
		"\u00053\u0000\u0000\u029c\u02aa\u0005-\u0000\u0000\u029d\u02aa\u0005<"+
		"\u0000\u0000\u029e\u02aa\u0005;\u0000\u0000\u029f\u02aa\u00058\u0000\u0000"+
		"\u02a0\u02aa\u00055\u0000\u0000\u02a1\u02aa\u00054\u0000\u0000\u02a2\u02aa"+
		"\u0005+\u0000\u0000\u02a3\u02aa\u0005\u001d\u0000\u0000\u02a4\u02a6\u0005"+
		"\u001e\u0000\u0000\u02a5\u02a7\u0005\u001f\u0000\u0000\u02a6\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001"+
		"\u0000\u0000\u0000\u02a8\u02aa\u0005*\u0000\u0000\u02a9\u0298\u0001\u0000"+
		"\u0000\u0000\u02a9\u0299\u0001\u0000\u0000\u0000\u02a9\u029a\u0001\u0000"+
		"\u0000\u0000\u02a9\u029b\u0001\u0000\u0000\u0000\u02a9\u029c\u0001\u0000"+
		"\u0000\u0000\u02a9\u029d\u0001\u0000\u0000\u0000\u02a9\u029e\u0001\u0000"+
		"\u0000\u0000\u02a9\u029f\u0001\u0000\u0000\u0000\u02a9\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a1\u0001\u0000\u0000\u0000\u02a9\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a3\u0001\u0000\u0000\u0000\u02a9\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aaE\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0005\u0014\u0000\u0000\u02ac\u02ad\u0003H$\u0000\u02ad"+
		"\u02ae\u0003F#\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ab\u0001\u0000\u0000\u0000\u02b0\u02af\u0001"+
		"\u0000\u0000\u0000\u02b1G\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u001b"+
		"\u0000\u0000\u02b3\u02b4\u00057\u0000\u0000\u02b4\u02b5\u00034\u001a\u0000"+
		"\u02b5\u02b6\u00056\u0000\u0000\u02b6\u02b7\u0003F#\u0000\u02b7\u02b8"+
		"\u0003\u001e\u000f\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02bb"+
		"\u0003\u001e\u000f\u0000\u02ba\u02b2\u0001\u0000\u0000\u0000\u02ba\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bbI\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005"+
		" \u0000\u0000\u02bd\u02be\u00057\u0000\u0000\u02be\u02bf\u00034\u001a"+
		"\u0000\u02bf\u02c0\u0003L&\u0000\u02c0\u02c1\u00056\u0000\u0000\u02c1"+
		"\u02c2\u0003\u001e\u000f\u0000\u02c2\u02c3\u0003J%\u0000\u02c3\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02bc\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6K\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0005\u001e\u0000\u0000\u02c8\u02cb\u00034\u001a"+
		"\u0000\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c7\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cbM\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0005!\u0000\u0000\u02cd\u02ce\u0003P(\u0000\u02ce\u02cf"+
		"\u00034\u001a\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cc\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d2O\u0001\u0000\u0000\u0000\u02d3\u02d6\u0005;\u0000"+
		"\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6Q\u0001\u0000\u0000\u0000"+
		"\u02d7\u02dc\u0005@\u0000\u0000\u02d8\u02d9\u0005\'\u0000\u0000\u02d9"+
		"\u02db\u0007\u0004\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02db"+
		"\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc"+
		"\u02dd\u0001\u0000\u0000\u0000\u02dd\u02f1\u0001\u0000\u0000\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02df\u02e4\u0005A\u0000\u0000\u02e0\u02e1"+
		"\u0005\'\u0000\u0000\u02e1\u02e3\u0007\u0004\u0000\u0000\u02e2\u02e0\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02f1\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02ec\u0005"+
		"?\u0000\u0000\u02e8\u02e9\u0005\'\u0000\u0000\u02e9\u02eb\u0007\u0004"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f1\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u02d7\u0001\u0000"+
		"\u0000\u0000\u02f0\u02df\u0001\u0000\u0000\u0000\u02f0\u02e7\u0001\u0000"+
		"\u0000\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1S\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0005\'\u0000\u0000\u02f3\u02f6\u0003R)\u0000\u02f4"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f5\u02f2\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6U\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0005\"\u0000\u0000\u02f8\u02f9\u0005?\u0000\u0000\u02f9\u02fb\u0005"+
		"7\u0000\u0000\u02fa\u02fc\u0003(\u0014\u0000\u02fb\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ff\u00056\u0000\u0000\u02fe\u0300\u0003^/\u0000\u02ff"+
		"\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300"+
		"\u0301\u0001\u0000\u0000\u0000\u0301\u0302\u0003\u0002\u0001\u0000\u0302"+
		"\u0303\u0003V+\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304\u0306\u0001"+
		"\u0000\u0000\u0000\u0305\u02f7\u0001\u0000\u0000\u0000\u0305\u0304\u0001"+
		"\u0000\u0000\u0000\u0306W\u0001\u0000\u0000\u0000\u0307\u030a\u0005#\u0000"+
		"\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000"+
		"\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030aY\u0001\u0000\u0000\u0000"+
		"\u030b\u0310\u0005?\u0000\u0000\u030c\u030d\u0005\'\u0000\u0000\u030d"+
		"\u030f\u0005?\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0312"+
		"\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311"+
		"\u0001\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0310"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0005,\u0000\u0000\u0314\u0315\u0003"+
		"\u000e\u0007\u0000\u0315\u0316\u0003\\.\u0000\u0316\u0319\u0001\u0000"+
		"\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u030b\u0001\u0000"+
		"\u0000\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0319[\u0001\u0000\u0000"+
		"\u0000\u031a\u031b\u0005:\u0000\u0000\u031b\u031e\u0003Z-\u0000\u031c"+
		"\u031e\u0001\u0000\u0000\u0000\u031d\u031a\u0001\u0000\u0000\u0000\u031d"+
		"\u031c\u0001\u0000\u0000\u0000\u031e]\u0001\u0000\u0000\u0000\u031f\u0320"+
		"\u0005$\u0000\u0000\u0320\u0321\u0003\u0016\u000b\u0000\u0321\u0322\u0003"+
		"\u0006\u0003\u0000\u0322\u0323\u0005\u0001\u0000\u0000\u0323\u0324\u0003"+
		"\u001e\u000f\u0000\u0324\u0325\u0005$\u0000\u0000\u0325\u0326\u00057\u0000"+
		"\u0000\u0326\u0327\u00034\u001a\u0000\u0327\u0328\u00056\u0000\u0000\u0328"+
		"\u0329\u0005\u0002\u0000\u0000\u0329\u032a\u0003`0\u0000\u032a\u032b\u0005"+
		"\u0001\u0000\u0000\u032b\u032c\u0003\u001e\u000f\u0000\u032c\u032d\u0005"+
		"\u0002\u0000\u0000\u032d_\u0001\u0000\u0000\u0000\u032e\u032f\u0005\u0004"+
		"\u0000\u0000\u032f\u0330\u0003\b\u0004\u0000\u0330\u0331\u0003\u0006\u0003"+
		"\u0000\u0331\u033c\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u0005\u0000"+
		"\u0000\u0333\u0334\u0003\n\u0005\u0000\u0334\u0335\u0003\u0006\u0003\u0000"+
		"\u0335\u033c\u0001\u0000\u0000\u0000\u0336\u0337\u0005\u0006\u0000\u0000"+
		"\u0337\u0338\u0003\u001a\r\u0000\u0338\u0339\u0003\u0006\u0003\u0000\u0339"+
		"\u033c\u0001\u0000\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b"+
		"\u032e\u0001\u0000\u0000\u0000\u033b\u0332\u0001\u0000\u0000\u0000\u033b"+
		"\u0336\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033c"+
		"a\u0001\u0000\u0000\u0000\u033d\u033e\u0005?\u0000\u0000\u033e\u0342\u0003"+
		"d2\u0000\u033f\u0340\u0005%\u0000\u0000\u0340\u0342\u0003d2\u0000\u0341"+
		"\u033d\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342"+
		"c\u0001\u0000\u0000\u0000\u0343\u0344\u00057\u0000\u0000\u0344\u0345\u0003"+
		"f3\u0000\u0345\u0346\u00056\u0000\u0000\u0346\u034f\u0001\u0000\u0000"+
		"\u0000\u0347\u0348\u0005)\u0000\u0000\u0348\u0349\u0003f3\u0000\u0349"+
		"\u034a\u0005(\u0000\u0000\u034a\u034f\u0001\u0000\u0000\u0000\u034b\u034c"+
		"\u00058\u0000\u0000\u034c\u034f\u0003f3\u0000\u034d\u034f\u0001\u0000"+
		"\u0000\u0000\u034e\u0343\u0001\u0000\u0000\u0000\u034e\u0347\u0001\u0000"+
		"\u0000\u0000\u034e\u034b\u0001\u0000\u0000\u0000\u034e\u034d\u0001\u0000"+
		"\u0000\u0000\u034fe\u0001\u0000\u0000\u0000\u0350\u0351\u0007\u0002\u0000"+
		"\u0000\u0351g\u0001\u0000\u0000\u0000\u0352\u0353\u0005?\u0000\u0000\u0353"+
		"\u0355\u00057\u0000\u0000\u0354\u0356\u00034\u001a\u0000\u0355\u0354\u0001"+
		"\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0001"+
		"\u0000\u0000\u0000\u0357\u0359\u0003R)\u0000\u0358\u0357\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000"+
		"\u0000\u035a\u035b\u00056\u0000\u0000\u035bi\u0001\u0000\u0000\u0000\\"+
		"z\u0089\u0090\u0099\u00a2\u00b5\u00be\u00c5\u00cd\u00d1\u00d6\u00de\u00ea"+
		"\u00ee\u00fe\u0109\u0118\u0121\u012a\u0133\u013b\u0142\u014c\u0159\u0161"+
		"\u0169\u016c\u0179\u0180\u018a\u0190\u0195\u019d\u01a4\u01a8\u01ae\u01b7"+
		"\u01bf\u01c6\u01ca\u01d0\u01d6\u01eb\u01ee\u01f0\u01f6\u01fe\u0206\u0209"+
		"\u0213\u021b\u0223\u022b\u0234\u023c\u0244\u024d\u0256\u025e\u0266\u0269"+
		"\u0271\u027c\u0283\u0288\u0292\u0296\u02a6\u02a9\u02b0\u02ba\u02c5\u02ca"+
		"\u02d1\u02d5\u02dc\u02e4\u02ec\u02f0\u02f5\u02fb\u02ff\u0305\u0309\u0310"+
		"\u0318\u031d\u033b\u0341\u034e\u0355\u0358";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}