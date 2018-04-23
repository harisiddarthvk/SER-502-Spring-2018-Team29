package com.ez.compiler;

// Generated from ../data/EZ.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EZParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94;
	public static final int
		RULE_program = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_decl_statement = 3, 
		RULE_assign_statement = 4, RULE_read_statement = 5, RULE_write_statement = 6, 
		RULE_if_statement = 7, RULE_loop_statement = 8, RULE_comment_statement = 9, 
		RULE_expression = 10, RULE_exp1 = 11, RULE_cond_expression = 12, RULE_cond_operators = 13, 
		RULE_identifier = 14, RULE_letters = 15, RULE_underscore = 16, RULE_bool_val = 17, 
		RULE_number = 18, RULE_digit = 19, RULE_lowerChar = 20, RULE_upperChar = 21, 
		RULE_spaceChar = 22;
	public static final String[] ruleNames = {
		"program", "statement_list", "statement", "decl_statement", "assign_statement", 
		"read_statement", "write_statement", "if_statement", "loop_statement", 
		"comment_statement", "expression", "exp1", "cond_expression", "cond_operators", 
		"identifier", "letters", "underscore", "bool_val", "number", "digit", 
		"lowerChar", "upperChar", "spaceChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'variable '", "';'", "' = '", "'read '", "'write '", "'if'", "'('", 
		"')'", "'then'", "'{'", "'}'", "'else'", "'{statement_list}'", "'repeat_when'", 
		"'/#'", "'#/'", "' + '", "'-'", "'*'", "'/'", "'%'", "'=='", "'<'", "'>'", 
		"'<='", "'>='", "'!='", "'_'", "'true'", "'false'", "'0'", "'1'", "'2'", 
		"'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", 
		"'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", 
		"'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", 
		"'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'\r'", 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
	};
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
	public String getGrammarFileName() { return "EZ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EZParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			statement_list();
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<SpaceCharContext> spaceChar() {
			return getRuleContexts(SpaceCharContext.class);
		}
		public SpaceCharContext spaceChar(int i) {
			return getRuleContext(SpaceCharContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_list);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				statement();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__92 || _la==T__93) {
					{
					{
					setState(49);
					spaceChar();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				statement_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				statement();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__92 || _la==T__93) {
					{
					{
					setState(58);
					spaceChar();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public Decl_statementContext decl_statement() {
			return getRuleContext(Decl_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Comment_statementContext comment_statement() {
			return getRuleContext(Comment_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				decl_statement();
				}
				break;
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				assign_statement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				read_statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				write_statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				if_statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				loop_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				comment_statement();
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

	public static class Decl_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Decl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterDecl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitDecl_statement(this);
		}
	}

	public final Decl_statementContext decl_statement() throws RecognitionException {
		Decl_statementContext _localctx = new Decl_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__0);
			setState(76);
			identifier();
			setState(77);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitAssign_statement(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			identifier();
			setState(80);
			match(T__2);
			setState(81);
			expression();
			setState(82);
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

	public static class Read_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__3);
			setState(85);
			identifier();
			setState(86);
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

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			expression();
			setState(90);
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

	public static class If_statementContext extends ParserRuleContext {
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__5);
				setState(93);
				match(T__6);
				setState(94);
				cond_expression();
				setState(95);
				match(T__7);
				setState(96);
				match(T__8);
				setState(97);
				match(T__9);
				setState(98);
				statement_list();
				setState(99);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__5);
				setState(102);
				match(T__6);
				setState(103);
				cond_expression();
				setState(104);
				match(T__7);
				setState(105);
				match(T__8);
				setState(106);
				match(T__9);
				setState(107);
				statement_list();
				setState(108);
				match(T__10);
				setState(109);
				match(T__11);
				setState(110);
				match(T__12);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
			setState(115);
			match(T__6);
			setState(116);
			cond_expression();
			setState(117);
			match(T__7);
			setState(118);
			match(T__9);
			setState(119);
			statement_list();
			setState(120);
			match(T__10);
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

	public static class Comment_statementContext extends ParserRuleContext {
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitComment_statement(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comment_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__14);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					matchWildcard();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(129);
			match(T__15);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				exp1();
				setState(132);
				match(T__16);
				setState(133);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				exp1();
				setState(136);
				match(T__17);
				setState(137);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp1);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				identifier();
				setState(143);
				match(T__18);
				setState(144);
				exp1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				number();
				setState(147);
				match(T__18);
				setState(148);
				exp1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				identifier();
				setState(151);
				match(T__19);
				setState(152);
				exp1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				number();
				setState(155);
				match(T__19);
				setState(156);
				exp1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				identifier();
				setState(159);
				match(T__20);
				setState(160);
				exp1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				number();
				setState(163);
				match(T__20);
				setState(164);
				exp1();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				identifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				number();
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Cond_operatorsContext cond_operators() {
			return getRuleContext(Cond_operatorsContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitCond_expression(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond_expression);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				expression();
				setState(171);
				cond_operators();
				setState(172);
				expression();
				}
				break;
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				bool_val();
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

	public static class Cond_operatorsContext extends ParserRuleContext {
		public Cond_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterCond_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitCond_operators(this);
		}
	}

	public final Cond_operatorsContext cond_operators() throws RecognitionException {
		Cond_operatorsContext _localctx = new Cond_operatorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public LowerCharContext lowerChar() {
			return getRuleContext(LowerCharContext.class,0);
		}
		public List<LettersContext> letters() {
			return getRuleContexts(LettersContext.class);
		}
		public LettersContext letters(int i) {
			return getRuleContext(LettersContext.class,i);
		}
		public List<UnderscoreContext> underscore() {
			return getRuleContexts(UnderscoreContext.class);
		}
		public UnderscoreContext underscore(int i) {
			return getRuleContext(UnderscoreContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			lowerChar();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)))) != 0)) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
					{
					setState(180);
					letters();
					}
					break;
				case T__27:
					{
					setState(181);
					underscore();
					}
					break;
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
					{
					setState(182);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
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

	public static class LettersContext extends ParserRuleContext {
		public List<LowerCharContext> lowerChar() {
			return getRuleContexts(LowerCharContext.class);
		}
		public LowerCharContext lowerChar(int i) {
			return getRuleContext(LowerCharContext.class,i);
		}
		public List<UpperCharContext> upperChar() {
			return getRuleContexts(UpperCharContext.class);
		}
		public UpperCharContext upperChar(int i) {
			return getRuleContext(UpperCharContext.class,i);
		}
		public LettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterLetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitLetters(this);
		}
	}

	public final LettersContext letters() throws RecognitionException {
		LettersContext _localctx = new LettersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_letters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(190);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
					case T__60:
					case T__61:
					case T__62:
					case T__63:
					case T__64:
					case T__65:
						{
						setState(188);
						lowerChar();
						}
						break;
					case T__66:
					case T__67:
					case T__68:
					case T__69:
					case T__70:
					case T__71:
					case T__72:
					case T__73:
					case T__74:
					case T__75:
					case T__76:
					case T__77:
					case T__78:
					case T__79:
					case T__80:
					case T__81:
					case T__82:
					case T__83:
					case T__84:
					case T__85:
					case T__86:
					case T__87:
					case T__88:
					case T__89:
					case T__90:
					case T__91:
						{
						setState(189);
						upperChar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UnderscoreContext extends ParserRuleContext {
		public UnderscoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterUnderscore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitUnderscore(this);
		}
	}

	public final UnderscoreContext underscore() throws RecognitionException {
		UnderscoreContext _localctx = new UnderscoreContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_underscore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__27);
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

	public static class Bool_valContext extends ParserRuleContext {
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterBool_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitBool_val(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(198);
				match(T__17);
				}
			}

			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				digit();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) );
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

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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

	public static class LowerCharContext extends ParserRuleContext {
		public LowerCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterLowerChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitLowerChar(this);
		}
	}

	public final LowerCharContext lowerChar() throws RecognitionException {
		LowerCharContext _localctx = new LowerCharContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lowerChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__41 - 41)) | (1L << (T__42 - 41)) | (1L << (T__43 - 41)) | (1L << (T__44 - 41)) | (1L << (T__45 - 41)) | (1L << (T__46 - 41)) | (1L << (T__47 - 41)) | (1L << (T__48 - 41)) | (1L << (T__49 - 41)) | (1L << (T__50 - 41)) | (1L << (T__51 - 41)) | (1L << (T__52 - 41)) | (1L << (T__53 - 41)) | (1L << (T__54 - 41)) | (1L << (T__55 - 41)) | (1L << (T__56 - 41)) | (1L << (T__57 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__61 - 41)) | (1L << (T__62 - 41)) | (1L << (T__63 - 41)) | (1L << (T__64 - 41)) | (1L << (T__65 - 41)))) != 0)) ) {
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

	public static class UpperCharContext extends ParserRuleContext {
		public UpperCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterUpperChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitUpperChar(this);
		}
	}

	public final UpperCharContext upperChar() throws RecognitionException {
		UpperCharContext _localctx = new UpperCharContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_upperChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__71 - 67)) | (1L << (T__72 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__78 - 67)) | (1L << (T__79 - 67)) | (1L << (T__80 - 67)) | (1L << (T__81 - 67)) | (1L << (T__82 - 67)) | (1L << (T__83 - 67)) | (1L << (T__84 - 67)) | (1L << (T__85 - 67)) | (1L << (T__86 - 67)) | (1L << (T__87 - 67)) | (1L << (T__88 - 67)) | (1L << (T__89 - 67)) | (1L << (T__90 - 67)) | (1L << (T__91 - 67)))) != 0)) ) {
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

	public static class SpaceCharContext extends ParserRuleContext {
		public SpaceCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).enterSpaceChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZListener ) ((EZListener)listener).exitSpaceChar(this);
		}
	}

	public final SpaceCharContext spaceChar() throws RecognitionException {
		SpaceCharContext _localctx = new SpaceCharContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_spaceChar);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__92);
				setState(213);
				match(T__93);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__93);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(T__92);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00b2\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ba\n\20\f\20\16"+
		"\20\u00bd\13\20\3\21\3\21\6\21\u00c1\n\21\r\21\16\21\u00c2\3\22\3\22\3"+
		"\23\3\23\3\24\5\24\u00ca\n\24\3\24\6\24\u00cd\n\24\r\24\16\24\u00ce\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00db\n\30\3\30"+
		"\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\30\35"+
		"\3\2\37 \3\2!*\3\2+D\3\2E^\2\u00e3\2\60\3\2\2\2\4B\3\2\2\2\6K\3\2\2\2"+
		"\bM\3\2\2\2\nQ\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2"+
		"\24|\3\2\2\2\26\u008e\3\2\2\2\30\u00aa\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3"+
		"\3\2\2\2\36\u00b5\3\2\2\2 \u00c0\3\2\2\2\"\u00c4\3\2\2\2$\u00c6\3\2\2"+
		"\2&\u00c9\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d4\3\2\2\2.\u00da"+
		"\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\66\5\6\4\2\63\65\5.\30\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29:\5\4\3\2:C\3\2\2\2;?\5\6\4\2<>\5.\30\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B\62\3\2\2\2B;\3\2\2\2C\5\3\2\2\2DL\5"+
		"\b\5\2EL\5\n\6\2FL\5\f\7\2GL\5\16\b\2HL\5\20\t\2IL\5\22\n\2JL\5\24\13"+
		"\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2"+
		"\2L\7\3\2\2\2MN\7\3\2\2NO\5\36\20\2OP\7\4\2\2P\t\3\2\2\2QR\5\36\20\2R"+
		"S\7\5\2\2ST\5\26\f\2TU\7\4\2\2U\13\3\2\2\2VW\7\6\2\2WX\5\36\20\2XY\7\4"+
		"\2\2Y\r\3\2\2\2Z[\7\7\2\2[\\\5\26\f\2\\]\7\4\2\2]\17\3\2\2\2^_\7\b\2\2"+
		"_`\7\t\2\2`a\5\32\16\2ab\7\n\2\2bc\7\13\2\2cd\7\f\2\2de\5\4\3\2ef\7\r"+
		"\2\2fs\3\2\2\2gh\7\b\2\2hi\7\t\2\2ij\5\32\16\2jk\7\n\2\2kl\7\13\2\2lm"+
		"\7\f\2\2mn\5\4\3\2no\7\r\2\2op\7\16\2\2pq\7\17\2\2qs\3\2\2\2r^\3\2\2\2"+
		"rg\3\2\2\2s\21\3\2\2\2tu\7\20\2\2uv\7\t\2\2vw\5\32\16\2wx\7\n\2\2xy\7"+
		"\f\2\2yz\5\4\3\2z{\7\r\2\2{\23\3\2\2\2|\u0080\7\21\2\2}\177\13\2\2\2~"+
		"}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\22\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\5\30\r\2\u0086\u0087\7\23\2\2\u0087\u0088\5\26\f\2\u0088\u008f"+
		"\3\2\2\2\u0089\u008a\5\30\r\2\u008a\u008b\7\24\2\2\u008b\u008c\5\26\f"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008f\5\30\r\2\u008e\u0085\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\5\36\20"+
		"\2\u0091\u0092\7\25\2\2\u0092\u0093\5\30\r\2\u0093\u00ab\3\2\2\2\u0094"+
		"\u0095\5&\24\2\u0095\u0096\7\25\2\2\u0096\u0097\5\30\r\2\u0097\u00ab\3"+
		"\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7\26\2\2\u009a\u009b\5\30\r\2"+
		"\u009b\u00ab\3\2\2\2\u009c\u009d\5&\24\2\u009d\u009e\7\26\2\2\u009e\u009f"+
		"\5\30\r\2\u009f\u00ab\3\2\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\27\2"+
		"\2\u00a2\u00a3\5\30\r\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\5&\24\2\u00a5"+
		"\u00a6\7\27\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00ab\3\2\2\2\u00a8\u00ab\5"+
		"\36\20\2\u00a9\u00ab\5&\24\2\u00aa\u0090\3\2\2\2\u00aa\u0094\3\2\2\2\u00aa"+
		"\u0098\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad"+
		"\5\26\f\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\5\26\f\2\u00af\u00b2\3\2\2"+
		"\2\u00b0\u00b2\5$\23\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33"+
		"\3\2\2\2\u00b3\u00b4\t\2\2\2\u00b4\35\3\2\2\2\u00b5\u00bb\5*\26\2\u00b6"+
		"\u00ba\5 \21\2\u00b7\u00ba\5\"\22\2\u00b8\u00ba\5(\25\2\u00b9\u00b6\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00c1\5*\26\2\u00bf\u00c1\5,\27\2\u00c0\u00be\3\2\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00c5\7\36\2\2\u00c5#\3\2\2\2\u00c6\u00c7\t\3\2\2\u00c7"+
		"%\3\2\2\2\u00c8\u00ca\7\24\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cc\3\2\2\2\u00cb\u00cd\5(\25\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\'\3\2\2\2\u00d0"+
		"\u00d1\t\4\2\2\u00d1)\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3+\3\2\2\2\u00d4"+
		"\u00d5\t\6\2\2\u00d5-\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7\u00db\7`\2\2\u00d8"+
		"\u00db\7`\2\2\u00d9\u00db\7_\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db/\3\2\2\2\22\66?BKr\u0080\u008e\u00aa\u00b1"+
		"\u00b9\u00bb\u00c0\u00c2\u00c9\u00ce\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}