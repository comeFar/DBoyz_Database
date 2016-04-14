// Generated from C:/Users/Yi/DBoyz_Database/src\DBoyzSQL.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBoyzSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SINGLE_LINE_COMMENT=154, 
		MULTILINE_COMMENT=155, SPACES=156, UNEXPECTED_CHAR=157;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_insert_stmt = 22, RULE_pragma_stmt = 23, RULE_reindex_stmt = 24, 
		RULE_release_stmt = 25, RULE_rollback_stmt = 26, RULE_savepoint_stmt = 27, 
		RULE_simple_select_stmt = 28, RULE_select_stmt = 29, RULE_update_stmt = 30, 
		RULE_update_stmt_limited = 31, RULE_vacuum_stmt = 32, RULE_column_def = 33, 
		RULE_type_name = 34, RULE_column_constraint = 35, RULE_conflict_clause = 36, 
		RULE_expr = 37, RULE_foreign_key_clause = 38, RULE_raise_function = 39, 
		RULE_indexed_column = 40, RULE_table_constraint = 41, RULE_with_clause = 42, 
		RULE_qualified_table_name = 43, RULE_ordering_term = 44, RULE_pragma_value = 45, 
		RULE_common_table_expression = 46, RULE_result_column = 47, RULE_table_or_subquery = 48, 
		RULE_join_clause = 49, RULE_join_operator = 50, RULE_join_constraint = 51, 
		RULE_select_core = 52, RULE_projection_clause = 53, RULE_where_clause = 54, 
		RULE_compound_operator = 55, RULE_cte_table_name = 56, RULE_signed_number = 57, 
		RULE_literal_value = 58, RULE_unary_operator = 59, RULE_binary_operator = 60, 
		RULE_error_message = 61, RULE_module_argument = 62, RULE_column_alias = 63, 
		RULE_keyword = 64, RULE_name = 65, RULE_function_name = 66, RULE_database_name = 67, 
		RULE_table_name = 68, RULE_table_or_index_name = 69, RULE_new_table_name = 70, 
		RULE_column_name = 71, RULE_collation_name = 72, RULE_foreign_table = 73, 
		RULE_index_name = 74, RULE_trigger_name = 75, RULE_view_name = 76, RULE_module_name = 77, 
		RULE_pragma_name = 78, RULE_savepoint_name = 79, RULE_table_alias = 80, 
		RULE_transaction_name = 81, RULE_any_name = 82;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "insert_stmt", 
		"pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", 
		"simple_select_stmt", "select_stmt", "update_stmt", "update_stmt_limited", 
		"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
		"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "projection_clause", 
		"where_clause", "compound_operator", "cte_table_name", "signed_number", 
		"literal_value", "unary_operator", "binary_operator", "error_message", 
		"module_argument", "column_alias", "keyword", "name", "function_name", 
		"database_name", "table_name", "table_or_index_name", "new_table_name", 
		"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
		"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
		"transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "DBoyzSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBoyzSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DBoyzSQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_UPDATE - 139)) | (1L << (K_VACUUM - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
				{
				setState(168);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(166);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(167);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(DBoyzSQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(178);
				match(SCOL);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			sql_stmt();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(185);
						match(SCOL);
						}
						}
						setState(188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(190);
					sql_stmt();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(SCOL);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(DBoyzSQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(DBoyzSQLParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(DBoyzSQLParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(202);
				match(K_EXPLAIN);
				setState(205);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(203);
					match(K_QUERY);
					setState(204);
					match(K_PLAN);
					}
				}

				}
			}

			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(209);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(210);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(211);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(212);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(213);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(214);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(215);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(216);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(217);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(218);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(219);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(220);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(221);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(222);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(223);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(224);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(225);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(226);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(227);
				insert_stmt();
				}
				break;
			case 20:
				{
				setState(228);
				pragma_stmt();
				}
				break;
			case 21:
				{
				setState(229);
				reindex_stmt();
				}
				break;
			case 22:
				{
				setState(230);
				release_stmt();
				}
				break;
			case 23:
				{
				setState(231);
				rollback_stmt();
				}
				break;
			case 24:
				{
				setState(232);
				savepoint_stmt();
				}
				break;
			case 25:
				{
				setState(233);
				simple_select_stmt();
				}
				break;
			case 26:
				{
				setState(234);
				select_stmt();
				}
				break;
			case 27:
				{
				setState(235);
				update_stmt();
				}
				break;
			case 28:
				{
				setState(236);
				update_stmt_limited();
				}
				break;
			case 29:
				{
				setState(237);
				vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(DBoyzSQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(DBoyzSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(DBoyzSQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(DBoyzSQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(DBoyzSQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(DBoyzSQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(K_ALTER);
			setState(241);
			match(K_TABLE);
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(242);
				database_name();
				setState(243);
				match(DOT);
				}
				break;
			}
			setState(247);
			table_name();
			setState(256);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(248);
				match(K_RENAME);
				setState(249);
				match(K_TO);
				setState(250);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(251);
				match(K_ADD);
				setState(253);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(252);
					match(K_COLUMN);
					}
					break;
				}
				setState(255);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(DBoyzSQLParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(K_ANALYZE);
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(259);
				database_name();
				}
				break;
			case 2:
				{
				setState(260);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(261);
				database_name();
				setState(262);
				match(DOT);
				setState(263);
				table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(DBoyzSQLParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(DBoyzSQLParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(K_ATTACH);
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(268);
				match(K_DATABASE);
				}
				break;
			}
			setState(271);
			expr(0);
			setState(272);
			match(K_AS);
			setState(273);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(DBoyzSQLParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(DBoyzSQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(DBoyzSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(DBoyzSQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(DBoyzSQLParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(K_BEGIN);
			setState(277);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(283);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(279);
				match(K_TRANSACTION);
				setState(281);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(280);
					transaction_name();
					}
					break;
				}
				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(DBoyzSQLParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(DBoyzSQLParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(DBoyzSQLParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(290);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(286);
				match(K_TRANSACTION);
				setState(288);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(287);
					transaction_name();
					}
					break;
				}
				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(DBoyzSQLParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(DBoyzSQLParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(DBoyzSQLParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(DBoyzSQLParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(DBoyzSQLParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(DBoyzSQLParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(DBoyzSQLParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(DBoyzSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(DBoyzSQLParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(DBoyzSQLParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(292);
				match(K_WITH);
				setState(294);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(293);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(296);
				common_table_expression();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					common_table_expression();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(306);
			select_core();
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(307);
					match(K_UNION);
					setState(309);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(308);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(311);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(312);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315);
				select_core();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(330);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(320);
				match(K_ORDER);
				setState(321);
				match(K_BY);
				setState(322);
				ordering_term();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(323);
					match(COMMA);
					setState(324);
					ordering_term();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(332);
				match(K_LIMIT);
				setState(333);
				expr(0);
				setState(336);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(334);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(335);
					expr(0);
					}
				}

				}
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(DBoyzSQLParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(DBoyzSQLParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(DBoyzSQLParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(K_CREATE);
			setState(342);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(341);
				match(K_UNIQUE);
				}
			}

			setState(344);
			match(K_INDEX);
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(345);
				match(K_IF);
				setState(346);
				match(K_NOT);
				setState(347);
				match(K_EXISTS);
				}
				break;
			}
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(350);
				database_name();
				setState(351);
				match(DOT);
				}
				break;
			}
			setState(355);
			index_name();
			setState(356);
			match(K_ON);
			setState(357);
			table_name();
			setState(358);
			match(OPEN_PAR);
			setState(359);
			indexed_column();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				indexed_column();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(CLOSE_PAR);
			setState(370);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(368);
				match(K_WHERE);
				setState(369);
				expr(0);
				}
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(DBoyzSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(DBoyzSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(DBoyzSQLParser.K_TEMPORARY, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(DBoyzSQLParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DBoyzSQLParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(K_CREATE);
			setState(374);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(376);
			match(K_TABLE);
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(377);
				match(K_IF);
				setState(378);
				match(K_NOT);
				setState(379);
				match(K_EXISTS);
				}
				break;
			}
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(382);
				database_name();
				setState(383);
				match(DOT);
				}
				break;
			}
			setState(387);
			table_name();
			setState(411);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(388);
				match(OPEN_PAR);
				setState(389);
				column_def();
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(390);
						match(COMMA);
						setState(391);
						column_def();
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					table_constraint();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(CLOSE_PAR);
				setState(407);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(405);
					match(K_WITHOUT);
					setState(406);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(409);
				match(K_AS);
				setState(410);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(DBoyzSQLParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(DBoyzSQLParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(DBoyzSQLParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(DBoyzSQLParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(DBoyzSQLParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(DBoyzSQLParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(DBoyzSQLParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_BEFORE() { return getToken(DBoyzSQLParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(DBoyzSQLParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(DBoyzSQLParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(DBoyzSQLParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(DBoyzSQLParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(DBoyzSQLParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(DBoyzSQLParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(DBoyzSQLParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(DBoyzSQLParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(DBoyzSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(DBoyzSQLParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(K_CREATE);
			setState(415);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(417);
			match(K_TRIGGER);
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(418);
				match(K_IF);
				setState(419);
				match(K_NOT);
				setState(420);
				match(K_EXISTS);
				}
				break;
			}
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(423);
				database_name();
				setState(424);
				match(DOT);
				}
				break;
			}
			setState(428);
			trigger_name();
			setState(433);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(429);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(430);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(431);
				match(K_INSTEAD);
				setState(432);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(435);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(436);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(437);
				match(K_UPDATE);
				setState(447);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(438);
					match(K_OF);
					setState(439);
					column_name();
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(440);
						match(COMMA);
						setState(441);
						column_name();
						}
						}
						setState(446);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(451);
			match(K_ON);
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(452);
				database_name();
				setState(453);
				match(DOT);
				}
				break;
			}
			setState(457);
			table_name();
			setState(461);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(458);
				match(K_FOR);
				setState(459);
				match(K_EACH);
				setState(460);
				match(K_ROW);
				}
			}

			setState(465);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(463);
				match(K_WHEN);
				setState(464);
				expr(0);
				}
			}

			setState(467);
			match(K_BEGIN);
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(468);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(469);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(470);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(471);
					select_stmt();
					}
					break;
				}
				setState(474);
				match(SCOL);
				}
				}
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(480);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(DBoyzSQLParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(DBoyzSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(DBoyzSQLParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(K_CREATE);
			setState(484);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(483);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(486);
			match(K_VIEW);
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(487);
				match(K_IF);
				setState(488);
				match(K_NOT);
				setState(489);
				match(K_EXISTS);
				}
				break;
			}
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(492);
				database_name();
				setState(493);
				match(DOT);
				}
				break;
			}
			setState(497);
			view_name();
			setState(498);
			match(K_AS);
			setState(499);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(DBoyzSQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(DBoyzSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(DBoyzSQLParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(K_CREATE);
			setState(502);
			match(K_VIRTUAL);
			setState(503);
			match(K_TABLE);
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(504);
				match(K_IF);
				setState(505);
				match(K_NOT);
				setState(506);
				match(K_EXISTS);
				}
				break;
			}
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(509);
				database_name();
				setState(510);
				match(DOT);
				}
				break;
			}
			setState(514);
			table_name();
			setState(515);
			match(K_USING);
			setState(516);
			module_name();
			setState(528);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(517);
				match(OPEN_PAR);
				setState(518);
				module_argument();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(519);
					match(COMMA);
					setState(520);
					module_argument();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526);
				match(CLOSE_PAR);
				}
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(DBoyzSQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(DBoyzSQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(530);
				with_clause();
				}
			}

			setState(533);
			match(K_DELETE);
			setState(534);
			match(K_FROM);
			setState(535);
			qualified_table_name();
			setState(538);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(536);
				match(K_WHERE);
				setState(537);
				expr(0);
				}
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(DBoyzSQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(DBoyzSQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(540);
				with_clause();
				}
			}

			setState(543);
			match(K_DELETE);
			setState(544);
			match(K_FROM);
			setState(545);
			qualified_table_name();
			setState(548);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(546);
				match(K_WHERE);
				setState(547);
				expr(0);
				}
			}

			setState(568);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(560);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(550);
					match(K_ORDER);
					setState(551);
					match(K_BY);
					setState(552);
					ordering_term();
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(553);
						match(COMMA);
						setState(554);
						ordering_term();
						}
						}
						setState(559);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(562);
				match(K_LIMIT);
				setState(563);
				expr(0);
				setState(566);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(565);
					expr(0);
					}
				}

				}
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(DBoyzSQLParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(DBoyzSQLParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(K_DETACH);
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(571);
				match(K_DATABASE);
				}
				break;
			}
			setState(574);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(DBoyzSQLParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(DBoyzSQLParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(K_DROP);
			setState(577);
			match(K_INDEX);
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(578);
				match(K_IF);
				setState(579);
				match(K_EXISTS);
				}
				break;
			}
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(582);
				database_name();
				setState(583);
				match(DOT);
				}
				break;
			}
			setState(587);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(DBoyzSQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(DBoyzSQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(K_DROP);
			setState(590);
			match(K_TABLE);
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(591);
				match(K_IF);
				setState(592);
				match(K_EXISTS);
				}
				break;
			}
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(595);
				database_name();
				setState(596);
				match(DOT);
				}
				break;
			}
			setState(600);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(DBoyzSQLParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(DBoyzSQLParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(K_DROP);
			setState(603);
			match(K_TRIGGER);
			setState(606);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(604);
				match(K_IF);
				setState(605);
				match(K_EXISTS);
				}
				break;
			}
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(608);
				database_name();
				setState(609);
				match(DOT);
				}
				break;
			}
			setState(613);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(DBoyzSQLParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(DBoyzSQLParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(K_DROP);
			setState(616);
			match(K_VIEW);
			setState(619);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(617);
				match(K_IF);
				setState(618);
				match(K_EXISTS);
				}
				break;
			}
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(621);
				database_name();
				setState(622);
				match(DOT);
				}
				break;
			}
			setState(626);
			view_name();
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(DBoyzSQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(DBoyzSQLParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(DBoyzSQLParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(DBoyzSQLParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(DBoyzSQLParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(DBoyzSQLParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(628);
				with_clause();
				}
			}

			setState(648);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(631);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(632);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(633);
				match(K_INSERT);
				setState(634);
				match(K_OR);
				setState(635);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(636);
				match(K_INSERT);
				setState(637);
				match(K_OR);
				setState(638);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(639);
				match(K_INSERT);
				setState(640);
				match(K_OR);
				setState(641);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(642);
				match(K_INSERT);
				setState(643);
				match(K_OR);
				setState(644);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(645);
				match(K_INSERT);
				setState(646);
				match(K_OR);
				setState(647);
				match(K_IGNORE);
				}
				break;
			}
			setState(650);
			match(K_INTO);
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(651);
				database_name();
				setState(652);
				match(DOT);
				}
				break;
			}
			setState(656);
			table_name();
			setState(668);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(657);
				match(OPEN_PAR);
				setState(658);
				column_name();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(659);
					match(COMMA);
					setState(660);
					column_name();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				match(CLOSE_PAR);
				}
			}

			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(670);
				match(K_VALUES);
				setState(671);
				match(OPEN_PAR);
				setState(672);
				expr(0);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(673);
					match(COMMA);
					setState(674);
					expr(0);
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				match(CLOSE_PAR);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					match(OPEN_PAR);
					setState(683);
					expr(0);
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						expr(0);
						}
						}
						setState(690);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(691);
					match(CLOSE_PAR);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(698);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(699);
				match(K_DEFAULT);
				setState(700);
				match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(DBoyzSQLParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(K_PRAGMA);
			setState(707);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(704);
				database_name();
				setState(705);
				match(DOT);
				}
				break;
			}
			setState(709);
			pragma_name();
			setState(716);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(710);
				match(ASSIGN);
				setState(711);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(712);
				match(OPEN_PAR);
				setState(713);
				pragma_value();
				setState(714);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(DBoyzSQLParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(K_REINDEX);
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(719);
				collation_name();
				}
				break;
			case 2:
				{
				setState(723);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(720);
					database_name();
					setState(721);
					match(DOT);
					}
					break;
				}
				setState(727);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(725);
					table_name();
					}
					break;
				case 2:
					{
					setState(726);
					index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(DBoyzSQLParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(DBoyzSQLParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(K_RELEASE);
			setState(733);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(732);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(735);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(DBoyzSQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(DBoyzSQLParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(DBoyzSQLParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(K_ROLLBACK);
			setState(742);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(738);
				match(K_TRANSACTION);
				setState(740);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(739);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(749);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(744);
				match(K_TO);
				setState(746);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(745);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(748);
				savepoint_name();
				}
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(DBoyzSQLParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(K_SAVEPOINT);
			setState(752);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(DBoyzSQLParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(DBoyzSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(754);
				match(K_WITH);
				setState(756);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(755);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(758);
				common_table_expression();
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(759);
					match(COMMA);
					setState(760);
					common_table_expression();
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(768);
			select_core();
			setState(779);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(769);
				match(K_ORDER);
				setState(770);
				match(K_BY);
				setState(771);
				ordering_term();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					ordering_term();
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(787);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(781);
				match(K_LIMIT);
				setState(782);
				expr(0);
				setState(785);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(784);
					expr(0);
					}
				}

				}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(DBoyzSQLParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(DBoyzSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(789);
				match(K_WITH);
				setState(791);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(790);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(793);
				common_table_expression();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(794);
					match(COMMA);
					setState(795);
					common_table_expression();
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(803);
			select_core();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(804);
				compound_operator();
				setState(805);
				select_core();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(812);
				match(K_ORDER);
				setState(813);
				match(K_BY);
				setState(814);
				ordering_term();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(815);
					match(COMMA);
					setState(816);
					ordering_term();
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(830);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(824);
				match(K_LIMIT);
				setState(825);
				expr(0);
				setState(828);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(827);
					expr(0);
					}
				}

				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(DBoyzSQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(DBoyzSQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(DBoyzSQLParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(DBoyzSQLParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(832);
				with_clause();
				}
			}

			setState(835);
			match(K_UPDATE);
			setState(846);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(836);
				match(K_OR);
				setState(837);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(838);
				match(K_OR);
				setState(839);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(840);
				match(K_OR);
				setState(841);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(842);
				match(K_OR);
				setState(843);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(844);
				match(K_OR);
				setState(845);
				match(K_IGNORE);
				}
				break;
			}
			setState(848);
			qualified_table_name();
			setState(849);
			match(K_SET);
			setState(850);
			column_name();
			setState(851);
			match(ASSIGN);
			setState(852);
			expr(0);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(853);
				match(COMMA);
				setState(854);
				column_name();
				setState(855);
				match(ASSIGN);
				setState(856);
				expr(0);
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(863);
				match(K_WHERE);
				setState(864);
				expr(0);
				}
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(DBoyzSQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(DBoyzSQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(DBoyzSQLParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(DBoyzSQLParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(867);
				with_clause();
				}
			}

			setState(870);
			match(K_UPDATE);
			setState(881);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(871);
				match(K_OR);
				setState(872);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(873);
				match(K_OR);
				setState(874);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(875);
				match(K_OR);
				setState(876);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(877);
				match(K_OR);
				setState(878);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(879);
				match(K_OR);
				setState(880);
				match(K_IGNORE);
				}
				break;
			}
			setState(883);
			qualified_table_name();
			setState(884);
			match(K_SET);
			setState(885);
			column_name();
			setState(886);
			match(ASSIGN);
			setState(887);
			expr(0);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888);
				match(COMMA);
				setState(889);
				column_name();
				setState(890);
				match(ASSIGN);
				setState(891);
				expr(0);
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(898);
				match(K_WHERE);
				setState(899);
				expr(0);
				}
			}

			setState(920);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(912);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(902);
					match(K_ORDER);
					setState(903);
					match(K_BY);
					setState(904);
					ordering_term();
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(905);
						match(COMMA);
						setState(906);
						ordering_term();
						}
						}
						setState(911);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(914);
				match(K_LIMIT);
				setState(915);
				expr(0);
				setState(918);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(916);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(917);
					expr(0);
					}
				}

				}
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(DBoyzSQLParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			column_name();
			setState(926);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(925);
				type_name();
				}
				break;
			}
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(928);
				column_constraint();
				}
				}
				setState(933);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(934);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(937); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(949);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(939);
				match(OPEN_PAR);
				setState(940);
				signed_number();
				setState(941);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(943);
				match(OPEN_PAR);
				setState(944);
				signed_number();
				setState(945);
				match(COMMA);
				setState(946);
				signed_number();
				setState(947);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(DBoyzSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(DBoyzSQLParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(DBoyzSQLParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(DBoyzSQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(DBoyzSQLParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(DBoyzSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(DBoyzSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(DBoyzSQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(DBoyzSQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(DBoyzSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(DBoyzSQLParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(951);
				match(K_CONSTRAINT);
				setState(952);
				name();
				}
			}

			setState(988);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(955);
				match(K_PRIMARY);
				setState(956);
				match(K_KEY);
				setState(958);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(957);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(960);
				conflict_clause();
				setState(962);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(961);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(965);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(964);
					match(K_NOT);
					}
				}

				setState(967);
				match(K_NULL);
				setState(968);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(969);
				match(K_UNIQUE);
				setState(970);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(971);
				match(K_CHECK);
				setState(972);
				match(OPEN_PAR);
				setState(973);
				expr(0);
				setState(974);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(976);
				match(K_DEFAULT);
				setState(983);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(977);
					signed_number();
					}
					break;
				case 2:
					{
					setState(978);
					literal_value();
					}
					break;
				case 3:
					{
					setState(979);
					match(OPEN_PAR);
					setState(980);
					expr(0);
					setState(981);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(985);
				match(K_COLLATE);
				setState(986);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(987);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(DBoyzSQLParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(DBoyzSQLParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(DBoyzSQLParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(990);
				match(K_ON);
				setState(991);
				match(K_CONFLICT);
				setState(992);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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
	public static class BinaryOPContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public BinaryOPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterBinaryOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitBinaryOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitBinaryOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UndecidedContext extends ExprContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(DBoyzSQLParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(DBoyzSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(DBoyzSQLParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(DBoyzSQLParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(DBoyzSQLParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(DBoyzSQLParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(DBoyzSQLParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(DBoyzSQLParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(DBoyzSQLParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(DBoyzSQLParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(DBoyzSQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(DBoyzSQLParser.K_OR, 0); }
		public TerminalNode K_IS() { return getToken(DBoyzSQLParser.K_IS, 0); }
		public TerminalNode K_BETWEEN() { return getToken(DBoyzSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(DBoyzSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(DBoyzSQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(DBoyzSQLParser.K_GLOB, 0); }
		public TerminalNode K_REGEXP() { return getToken(DBoyzSQLParser.K_REGEXP, 0); }
		public TerminalNode K_MATCH() { return getToken(DBoyzSQLParser.K_MATCH, 0); }
		public TerminalNode K_ESCAPE() { return getToken(DBoyzSQLParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(DBoyzSQLParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(DBoyzSQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(DBoyzSQLParser.K_NULL, 0); }
		public TerminalNode K_IN() { return getToken(DBoyzSQLParser.K_IN, 0); }
		public UndecidedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterUndecided(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitUndecided(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitUndecided(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(996);
				unary_operator();
				setState(997);
				expr(21);
				}
				break;
			case 2:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				literal_value();
				}
				break;
			case 3:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1000);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1004);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(1001);
						database_name();
						setState(1002);
						match(DOT);
						}
						break;
					}
					setState(1006);
					table_name();
					setState(1007);
					match(DOT);
					}
					break;
				}
				setState(1011);
				column_name();
				}
				break;
			case 5:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1012);
				function_name();
				setState(1013);
				match(OPEN_PAR);
				setState(1026);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1015);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						setState(1014);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1017);
					expr(0);
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1018);
						match(COMMA);
						setState(1019);
						expr(0);
						}
						}
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1025);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1028);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1030);
				match(OPEN_PAR);
				setState(1031);
				expr(0);
				setState(1032);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1034);
				match(K_CAST);
				setState(1035);
				match(OPEN_PAR);
				setState(1036);
				expr(0);
				setState(1037);
				match(K_AS);
				setState(1038);
				type_name();
				setState(1039);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1042);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1041);
						match(K_NOT);
						}
					}

					setState(1044);
					match(K_EXISTS);
					}
				}

				setState(1047);
				match(OPEN_PAR);
				setState(1048);
				select_stmt();
				setState(1049);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1051);
				match(K_CASE);
				setState(1053);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1052);
					expr(0);
					}
					break;
				}
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1055);
					match(K_WHEN);
					setState(1056);
					expr(0);
					setState(1057);
					match(K_THEN);
					setState(1058);
					expr(0);
					}
					}
					setState(1062); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1066);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1064);
					match(K_ELSE);
					setState(1065);
					expr(0);
					}
				}

				setState(1068);
				match(K_END);
				}
				break;
			case 10:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1070);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1159);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1073);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1074);
						match(PIPE2);
						setState(1075);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1076);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1077);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1078);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1079);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1080);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1081);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1082);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1083);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1084);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1085);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1086);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1087);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1088);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1089);
						binary_operator();
						setState(1090);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1092);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1093);
						match(K_AND);
						setState(1094);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1095);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1096);
						match(K_OR);
						setState(1097);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1098);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1099);
						match(K_IS);
						setState(1101);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(1100);
							match(K_NOT);
							}
							break;
						}
						setState(1103);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1106);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1105);
							match(K_NOT);
							}
						}

						setState(1108);
						match(K_BETWEEN);
						setState(1109);
						expr(0);
						setState(1110);
						match(K_AND);
						setState(1111);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1114);
						match(K_COLLATE);
						setState(1115);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1116);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1118);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1117);
							match(K_NOT);
							}
						}

						setState(1120);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1121);
						expr(0);
						setState(1124);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1122);
							match(K_ESCAPE);
							setState(1123);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1131);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1127);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1128);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1129);
							match(K_NOT);
							setState(1130);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1133);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1135);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1134);
							match(K_NOT);
							}
						}

						setState(1137);
						match(K_IN);
						setState(1157);
						switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
						case 1:
							{
							setState(1138);
							match(OPEN_PAR);
							setState(1148);
							switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
							case 1:
								{
								setState(1139);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1140);
								expr(0);
								setState(1145);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1141);
									match(COMMA);
									setState(1142);
									expr(0);
									}
									}
									setState(1147);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1150);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1154);
							switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
							case 1:
								{
								setState(1151);
								database_name();
								setState(1152);
								match(DOT);
								}
								break;
							}
							setState(1156);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(DBoyzSQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(DBoyzSQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(DBoyzSQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(DBoyzSQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(DBoyzSQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(DBoyzSQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(DBoyzSQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(DBoyzSQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(DBoyzSQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(DBoyzSQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(DBoyzSQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(DBoyzSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(DBoyzSQLParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(DBoyzSQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(DBoyzSQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(DBoyzSQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(DBoyzSQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(DBoyzSQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(DBoyzSQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(DBoyzSQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(DBoyzSQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(DBoyzSQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(DBoyzSQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(DBoyzSQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(DBoyzSQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(DBoyzSQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(DBoyzSQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(K_REFERENCES);
			setState(1165);
			foreign_table();
			setState(1177);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1166);
				match(OPEN_PAR);
				setState(1167);
				column_name();
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1168);
					match(COMMA);
					setState(1169);
					column_name();
					}
					}
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1175);
				match(CLOSE_PAR);
				}
			}

			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1193);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1179);
					match(K_ON);
					setState(1180);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1189);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(1181);
						match(K_SET);
						setState(1182);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1183);
						match(K_SET);
						setState(1184);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1185);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1186);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1187);
						match(K_NO);
						setState(1188);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1191);
					match(K_MATCH);
					setState(1192);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1210);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1201);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1200);
					match(K_NOT);
					}
				}

				setState(1203);
				match(K_DEFERRABLE);
				setState(1208);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1204);
					match(K_INITIALLY);
					setState(1205);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1206);
					match(K_INITIALLY);
					setState(1207);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(DBoyzSQLParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(K_RAISE);
			setState(1213);
			match(OPEN_PAR);
			setState(1218);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1214);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1215);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1216);
				match(COMMA);
				setState(1217);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1220);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(DBoyzSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(DBoyzSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(DBoyzSQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			column_name();
			setState(1225);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1223);
				match(K_COLLATE);
				setState(1224);
				collation_name();
				}
			}

			setState(1228);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1227);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(DBoyzSQLParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(DBoyzSQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(DBoyzSQLParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(DBoyzSQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(DBoyzSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(DBoyzSQLParser.K_UNIQUE, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1230);
				match(K_CONSTRAINT);
				setState(1231);
				name();
				}
			}

			setState(1270);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1237);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1234);
					match(K_PRIMARY);
					setState(1235);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1236);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1239);
				match(OPEN_PAR);
				setState(1240);
				indexed_column();
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1241);
					match(COMMA);
					setState(1242);
					indexed_column();
					}
					}
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1248);
				match(CLOSE_PAR);
				setState(1249);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1251);
				match(K_CHECK);
				setState(1252);
				match(OPEN_PAR);
				setState(1253);
				expr(0);
				setState(1254);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1256);
				match(K_FOREIGN);
				setState(1257);
				match(K_KEY);
				setState(1258);
				match(OPEN_PAR);
				setState(1259);
				column_name();
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1260);
					match(COMMA);
					setState(1261);
					column_name();
					}
					}
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1267);
				match(CLOSE_PAR);
				setState(1268);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(DBoyzSQLParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(DBoyzSQLParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(DBoyzSQLParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(DBoyzSQLParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(K_WITH);
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1273);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1276);
			cte_table_name();
			setState(1277);
			match(K_AS);
			setState(1278);
			match(OPEN_PAR);
			setState(1279);
			select_stmt();
			setState(1280);
			match(CLOSE_PAR);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1281);
				match(COMMA);
				setState(1282);
				cte_table_name();
				setState(1283);
				match(K_AS);
				setState(1284);
				match(OPEN_PAR);
				setState(1285);
				select_stmt();
				setState(1286);
				match(CLOSE_PAR);
				}
				}
				setState(1292);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(DBoyzSQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1293);
				database_name();
				setState(1294);
				match(DOT);
				}
				break;
			}
			setState(1298);
			table_name();
			setState(1304);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1299);
				match(K_INDEXED);
				setState(1300);
				match(K_BY);
				setState(1301);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1302);
				match(K_NOT);
				setState(1303);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(DBoyzSQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(DBoyzSQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(DBoyzSQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			expr(0);
			setState(1309);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1307);
				match(K_COLLATE);
				setState(1308);
				collation_name();
				}
			}

			setState(1312);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1311);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DBoyzSQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pragma_value);
		try {
			setState(1317);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			table_name();
			setState(1331);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1320);
				match(OPEN_PAR);
				setState(1321);
				column_name();
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1322);
					match(COMMA);
					setState(1323);
					column_name();
					}
					}
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1329);
				match(CLOSE_PAR);
				}
			}

			setState(1333);
			match(K_AS);
			setState(1334);
			match(OPEN_PAR);
			setState(1335);
			select_stmt();
			setState(1336);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_result_column);
		int _la;
		try {
			setState(1350);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				table_name();
				setState(1340);
				match(DOT);
				setState(1341);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				expr(0);
				setState(1348);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1345);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1344);
						match(K_AS);
						}
					}

					setState(1347);
					column_alias();
					}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(DBoyzSQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_table_or_subquery);
		int _la;
		try {
			setState(1399);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1352);
					database_name();
					setState(1353);
					match(DOT);
					}
					break;
				}
				setState(1357);
				table_name();
				setState(1362);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1359);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1358);
						match(K_AS);
						}
						break;
					}
					setState(1361);
					table_alias();
					}
					break;
				}
				setState(1369);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1364);
					match(K_INDEXED);
					setState(1365);
					match(K_BY);
					setState(1366);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1367);
					match(K_NOT);
					setState(1368);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				match(OPEN_PAR);
				setState(1381);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1372);
					table_or_subquery();
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1373);
						match(COMMA);
						setState(1374);
						table_or_subquery();
						}
						}
						setState(1379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1380);
					join_clause();
					}
					break;
				}
				setState(1383);
				match(CLOSE_PAR);
				setState(1388);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1385);
					switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
						{
						setState(1384);
						match(K_AS);
						}
						break;
					}
					setState(1387);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				match(OPEN_PAR);
				setState(1391);
				select_stmt();
				setState(1392);
				match(CLOSE_PAR);
				setState(1397);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1394);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1393);
						match(K_AS);
						}
						break;
					}
					setState(1396);
					table_alias();
					}
					break;
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			table_or_subquery();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1402);
				join_operator();
				setState(1403);
				table_or_subquery();
				setState(1404);
				join_constraint();
				}
				}
				setState(1410);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(DBoyzSQLParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(DBoyzSQLParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(DBoyzSQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(DBoyzSQLParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(DBoyzSQLParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(DBoyzSQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_join_operator);
		int _la;
		try {
			setState(1424);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1412);
					match(K_NATURAL);
					}
				}

				setState(1421);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1415);
					match(K_LEFT);
					setState(1417);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1416);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1419);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1420);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1423);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(DBoyzSQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(DBoyzSQLParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1426);
				match(K_ON);
				setState(1427);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1428);
				match(K_USING);
				setState(1429);
				match(OPEN_PAR);
				setState(1430);
				column_name();
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1431);
					match(COMMA);
					setState(1432);
					column_name();
					}
					}
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1438);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(DBoyzSQLParser.K_SELECT, 0); }
		public Projection_clauseContext projection_clause() {
			return getRuleContext(Projection_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(DBoyzSQLParser.K_FROM, 0); }
		public TerminalNode K_GROUP() { return getToken(DBoyzSQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(DBoyzSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(DBoyzSQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(DBoyzSQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(DBoyzSQLParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_select_core);
		int _la;
		try {
			setState(1506);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(K_SELECT);
				setState(1444);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1443);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1446);
				projection_clause();
				setState(1459);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1447);
					match(K_FROM);
					setState(1457);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1448);
						table_or_subquery();
						setState(1453);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1449);
							match(COMMA);
							setState(1450);
							table_or_subquery();
							}
							}
							setState(1455);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1456);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1461);
				where_clause();
				setState(1476);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1462);
					match(K_GROUP);
					setState(1463);
					match(K_BY);
					setState(1464);
					expr(0);
					setState(1469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1465);
						match(COMMA);
						setState(1466);
						expr(0);
						}
						}
						setState(1471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1474);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1472);
						match(K_HAVING);
						setState(1473);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				match(K_VALUES);
				setState(1479);
				match(OPEN_PAR);
				setState(1480);
				expr(0);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1481);
					match(COMMA);
					setState(1482);
					expr(0);
					}
					}
					setState(1487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
				match(CLOSE_PAR);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1489);
					match(COMMA);
					setState(1490);
					match(OPEN_PAR);
					setState(1491);
					expr(0);
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1492);
						match(COMMA);
						setState(1493);
						expr(0);
						}
						}
						setState(1498);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1499);
					match(CLOSE_PAR);
					}
					}
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Projection_clauseContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Projection_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterProjection_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitProjection_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitProjection_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Projection_clauseContext projection_clause() throws RecognitionException {
		Projection_clauseContext _localctx = new Projection_clauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_projection_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			result_column();
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1509);
				match(COMMA);
				setState(1510);
				result_column();
				}
				}
				setState(1515);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_where_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1516);
				match(K_WHERE);
				setState(1517);
				expr(0);
				}
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(DBoyzSQLParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(DBoyzSQLParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(DBoyzSQLParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(DBoyzSQLParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compound_operator);
		try {
			setState(1525);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				match(K_UNION);
				setState(1522);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			table_name();
			setState(1539);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1528);
				match(OPEN_PAR);
				setState(1529);
				column_name();
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1530);
					match(COMMA);
					setState(1531);
					column_name();
					}
					}
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1537);
				match(CLOSE_PAR);
				}
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(DBoyzSQLParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1541);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1544);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(DBoyzSQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DBoyzSQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(DBoyzSQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(DBoyzSQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(DBoyzSQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(DBoyzSQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(DBoyzSQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode K_IS() { return getToken(DBoyzSQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(DBoyzSQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(DBoyzSQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(DBoyzSQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(DBoyzSQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(DBoyzSQLParser.K_REGEXP, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1550);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(1551);
				match(EQ);
				}
				break;
			case 3:
				{
				setState(1552);
				match(NOT_EQ1);
				}
				break;
			case 4:
				{
				setState(1553);
				match(NOT_EQ2);
				}
				break;
			case 5:
				{
				setState(1554);
				match(K_IS);
				}
				break;
			case 6:
				{
				setState(1555);
				match(K_IS);
				setState(1556);
				match(K_NOT);
				}
				break;
			case 7:
				{
				setState(1557);
				match(K_IN);
				}
				break;
			case 8:
				{
				setState(1558);
				match(K_LIKE);
				}
				break;
			case 9:
				{
				setState(1559);
				match(K_GLOB);
				}
				break;
			case 10:
				{
				setState(1560);
				match(K_MATCH);
				}
				break;
			case 11:
				{
				setState(1561);
				match(K_REGEXP);
				}
				break;
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DBoyzSQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_module_argument);
		try {
			setState(1568);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DBoyzSQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DBoyzSQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(DBoyzSQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(DBoyzSQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(DBoyzSQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(DBoyzSQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(DBoyzSQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(DBoyzSQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(DBoyzSQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(DBoyzSQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(DBoyzSQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(DBoyzSQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(DBoyzSQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(DBoyzSQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(DBoyzSQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(DBoyzSQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(DBoyzSQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(DBoyzSQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(DBoyzSQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(DBoyzSQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(DBoyzSQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(DBoyzSQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(DBoyzSQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(DBoyzSQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(DBoyzSQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(DBoyzSQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(DBoyzSQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(DBoyzSQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(DBoyzSQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(DBoyzSQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(DBoyzSQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(DBoyzSQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(DBoyzSQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(DBoyzSQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(DBoyzSQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(DBoyzSQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(DBoyzSQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(DBoyzSQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(DBoyzSQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(DBoyzSQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(DBoyzSQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(DBoyzSQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(DBoyzSQLParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(DBoyzSQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(DBoyzSQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(DBoyzSQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(DBoyzSQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(DBoyzSQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(DBoyzSQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(DBoyzSQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(DBoyzSQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(DBoyzSQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(DBoyzSQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(DBoyzSQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(DBoyzSQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(DBoyzSQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(DBoyzSQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(DBoyzSQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(DBoyzSQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(DBoyzSQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(DBoyzSQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(DBoyzSQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(DBoyzSQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(DBoyzSQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(DBoyzSQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(DBoyzSQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(DBoyzSQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(DBoyzSQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(DBoyzSQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(DBoyzSQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(DBoyzSQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(DBoyzSQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(DBoyzSQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(DBoyzSQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(DBoyzSQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(DBoyzSQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(DBoyzSQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(DBoyzSQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(DBoyzSQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(DBoyzSQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(DBoyzSQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(DBoyzSQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(DBoyzSQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(DBoyzSQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(DBoyzSQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(DBoyzSQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(DBoyzSQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(DBoyzSQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(DBoyzSQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(DBoyzSQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(DBoyzSQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(DBoyzSQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(DBoyzSQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(DBoyzSQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(DBoyzSQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(DBoyzSQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(DBoyzSQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(DBoyzSQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(DBoyzSQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(DBoyzSQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(DBoyzSQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(DBoyzSQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(DBoyzSQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(DBoyzSQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(DBoyzSQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(DBoyzSQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(DBoyzSQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(DBoyzSQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(DBoyzSQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(DBoyzSQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(DBoyzSQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(DBoyzSQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(DBoyzSQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(DBoyzSQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(DBoyzSQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(DBoyzSQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(DBoyzSQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(DBoyzSQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(DBoyzSQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(DBoyzSQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(DBoyzSQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(DBoyzSQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(DBoyzSQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(DBoyzSQLParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DBoyzSQLParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DBoyzSQLParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_any_name);
		try {
			setState(1615);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1610);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				match(OPEN_PAR);
				setState(1612);
				any_name();
				setState(1613);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u0654\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\7\2\u00ab\n\2\f\2\16\2\u00ae\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4"+
		"\u00b6\n\4\f\4\16\4\u00b9\13\4\3\4\3\4\6\4\u00bd\n\4\r\4\16\4\u00be\3"+
		"\4\7\4\u00c2\n\4\f\4\16\4\u00c5\13\4\3\4\7\4\u00c8\n\4\f\4\16\4\u00cb"+
		"\13\4\3\5\3\5\3\5\5\5\u00d0\n\5\5\5\u00d2\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f1\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00f8\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0100\n\6\3\6\5\6\u0103\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u010c\n\7\3\b\3\b\5\b\u0110\n\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\5\t\u0118\n\t\3\t\3\t\5\t\u011c\n\t\5\t\u011e\n\t\3\n\3\n\3\n\5\n"+
		"\u0123\n\n\5\n\u0125\n\n\3\13\3\13\5\13\u0129\n\13\3\13\3\13\3\13\7\13"+
		"\u012e\n\13\f\13\16\13\u0131\13\13\5\13\u0133\n\13\3\13\3\13\3\13\5\13"+
		"\u0138\n\13\3\13\3\13\5\13\u013c\n\13\3\13\6\13\u013f\n\13\r\13\16\13"+
		"\u0140\3\13\3\13\3\13\3\13\3\13\7\13\u0148\n\13\f\13\16\13\u014b\13\13"+
		"\5\13\u014d\n\13\3\13\3\13\3\13\3\13\5\13\u0153\n\13\5\13\u0155\n\13\3"+
		"\f\3\f\5\f\u0159\n\f\3\f\3\f\3\f\3\f\5\f\u015f\n\f\3\f\3\f\3\f\5\f\u0164"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u016d\n\f\f\f\16\f\u0170\13\f\3\f"+
		"\3\f\3\f\5\f\u0175\n\f\3\r\3\r\5\r\u0179\n\r\3\r\3\r\3\r\3\r\5\r\u017f"+
		"\n\r\3\r\3\r\3\r\5\r\u0184\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u018b\n\r\f\r\16"+
		"\r\u018e\13\r\3\r\3\r\7\r\u0192\n\r\f\r\16\r\u0195\13\r\3\r\3\r\3\r\5"+
		"\r\u019a\n\r\3\r\3\r\5\r\u019e\n\r\3\16\3\16\5\16\u01a2\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u01a8\n\16\3\16\3\16\3\16\5\16\u01ad\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u01b4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u01bd\n\16\f\16\16\16\u01c0\13\16\5\16\u01c2\n\16\5\16\u01c4\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01ca\n\16\3\16\3\16\3\16\3\16\5\16\u01d0\n\16\3"+
		"\16\3\16\5\16\u01d4\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01db\n\16\3\16"+
		"\3\16\6\16\u01df\n\16\r\16\16\16\u01e0\3\16\3\16\3\17\3\17\5\17\u01e7"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01ed\n\17\3\17\3\17\3\17\5\17\u01f2\n"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fe\n\20"+
		"\3\20\3\20\3\20\5\20\u0203\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u020c\n\20\f\20\16\20\u020f\13\20\3\20\3\20\5\20\u0213\n\20\3\21\5\21"+
		"\u0216\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u021d\n\21\3\22\5\22\u0220\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0227\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u022e\n\22\f\22\16\22\u0231\13\22\5\22\u0233\n\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0239\n\22\5\22\u023b\n\22\3\23\3\23\5\23\u023f\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\5\24\u0247\n\24\3\24\3\24\3\24\5\24\u024c\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0254\n\25\3\25\3\25\3\25\5\25\u0259"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0261\n\26\3\26\3\26\3\26\5\26"+
		"\u0266\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u026e\n\27\3\27\3\27\3"+
		"\27\5\27\u0273\n\27\3\27\3\27\3\30\5\30\u0278\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u028b\n\30\3\30\3\30\3\30\3\30\5\30\u0291\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\7\30\u0298\n\30\f\30\16\30\u029b\13\30\3\30\3\30\5\30\u029f\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u02a6\n\30\f\30\16\30\u02a9\13\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u02b1\n\30\f\30\16\30\u02b4\13\30\3\30\3"+
		"\30\7\30\u02b8\n\30\f\30\16\30\u02bb\13\30\3\30\3\30\3\30\5\30\u02c0\n"+
		"\30\3\31\3\31\3\31\3\31\5\31\u02c6\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u02cf\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u02d6\n\32\3\32\3"+
		"\32\5\32\u02da\n\32\5\32\u02dc\n\32\3\33\3\33\5\33\u02e0\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u02e7\n\34\5\34\u02e9\n\34\3\34\3\34\5\34\u02ed\n"+
		"\34\3\34\5\34\u02f0\n\34\3\35\3\35\3\35\3\36\3\36\5\36\u02f7\n\36\3\36"+
		"\3\36\3\36\7\36\u02fc\n\36\f\36\16\36\u02ff\13\36\5\36\u0301\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0309\n\36\f\36\16\36\u030c\13\36\5\36"+
		"\u030e\n\36\3\36\3\36\3\36\3\36\5\36\u0314\n\36\5\36\u0316\n\36\3\37\3"+
		"\37\5\37\u031a\n\37\3\37\3\37\3\37\7\37\u031f\n\37\f\37\16\37\u0322\13"+
		"\37\5\37\u0324\n\37\3\37\3\37\3\37\3\37\7\37\u032a\n\37\f\37\16\37\u032d"+
		"\13\37\3\37\3\37\3\37\3\37\3\37\7\37\u0334\n\37\f\37\16\37\u0337\13\37"+
		"\5\37\u0339\n\37\3\37\3\37\3\37\3\37\5\37\u033f\n\37\5\37\u0341\n\37\3"+
		" \5 \u0344\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0351\n \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \7 \u035d\n \f \16 \u0360\13 \3 \3 \5 \u0364\n \3!"+
		"\5!\u0367\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0374\n!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\7!\u0380\n!\f!\16!\u0383\13!\3!\3!\5!\u0387\n!\3!\3"+
		"!\3!\3!\3!\7!\u038e\n!\f!\16!\u0391\13!\5!\u0393\n!\3!\3!\3!\3!\5!\u0399"+
		"\n!\5!\u039b\n!\3\"\3\"\3#\3#\5#\u03a1\n#\3#\7#\u03a4\n#\f#\16#\u03a7"+
		"\13#\3$\6$\u03aa\n$\r$\16$\u03ab\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03b8"+
		"\n$\3%\3%\5%\u03bc\n%\3%\3%\3%\5%\u03c1\n%\3%\3%\5%\u03c5\n%\3%\5%\u03c8"+
		"\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03da\n%\3%\3%"+
		"\3%\5%\u03df\n%\3&\3&\3&\5&\u03e4\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u03ef\n\'\3\'\3\'\3\'\5\'\u03f4\n\'\3\'\3\'\3\'\3\'\5\'\u03fa\n"+
		"\'\3\'\3\'\3\'\7\'\u03ff\n\'\f\'\16\'\u0402\13\'\3\'\5\'\u0405\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0415\n\'\3\'"+
		"\5\'\u0418\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0420\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\6\'\u0427\n\'\r\'\16\'\u0428\3\'\3\'\5\'\u042d\n\'\3\'\3\'\3\'\5\'"+
		"\u0432\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0450\n\'\3\'"+
		"\3\'\3\'\5\'\u0455\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0461"+
		"\n\'\3\'\3\'\3\'\3\'\5\'\u0467\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u046e\n\'\3"+
		"\'\3\'\5\'\u0472\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u047a\n\'\f\'\16\'\u047d"+
		"\13\'\5\'\u047f\n\'\3\'\3\'\3\'\3\'\5\'\u0485\n\'\3\'\5\'\u0488\n\'\7"+
		"\'\u048a\n\'\f\'\16\'\u048d\13\'\3(\3(\3(\3(\3(\3(\7(\u0495\n(\f(\16("+
		"\u0498\13(\3(\3(\5(\u049c\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u04a8\n"+
		"(\3(\3(\5(\u04ac\n(\7(\u04ae\n(\f(\16(\u04b1\13(\3(\5(\u04b4\n(\3(\3("+
		"\3(\3(\3(\5(\u04bb\n(\5(\u04bd\n(\3)\3)\3)\3)\3)\3)\5)\u04c5\n)\3)\3)"+
		"\3*\3*\3*\5*\u04cc\n*\3*\5*\u04cf\n*\3+\3+\5+\u04d3\n+\3+\3+\3+\5+\u04d8"+
		"\n+\3+\3+\3+\3+\7+\u04de\n+\f+\16+\u04e1\13+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\7+\u04f1\n+\f+\16+\u04f4\13+\3+\3+\3+\5+\u04f9\n+\3,"+
		"\3,\5,\u04fd\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u050b\n,\f,\16"+
		",\u050e\13,\3-\3-\3-\5-\u0513\n-\3-\3-\3-\3-\3-\3-\5-\u051b\n-\3.\3.\3"+
		".\5.\u0520\n.\3.\5.\u0523\n.\3/\3/\3/\5/\u0528\n/\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u052f\n\60\f\60\16\60\u0532\13\60\3\60\3\60\5\60\u0536\n\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0544"+
		"\n\61\3\61\5\61\u0547\n\61\5\61\u0549\n\61\3\62\3\62\3\62\5\62\u054e\n"+
		"\62\3\62\3\62\5\62\u0552\n\62\3\62\5\62\u0555\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u055c\n\62\3\62\3\62\3\62\3\62\7\62\u0562\n\62\f\62\16\62\u0565"+
		"\13\62\3\62\5\62\u0568\n\62\3\62\3\62\5\62\u056c\n\62\3\62\5\62\u056f"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u0575\n\62\3\62\5\62\u0578\n\62\5\62\u057a"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u0581\n\63\f\63\16\63\u0584\13\63"+
		"\3\64\3\64\5\64\u0588\n\64\3\64\3\64\5\64\u058c\n\64\3\64\3\64\5\64\u0590"+
		"\n\64\3\64\5\64\u0593\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u059c"+
		"\n\65\f\65\16\65\u059f\13\65\3\65\3\65\5\65\u05a3\n\65\3\66\3\66\5\66"+
		"\u05a7\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u05ae\n\66\f\66\16\66\u05b1"+
		"\13\66\3\66\5\66\u05b4\n\66\5\66\u05b6\n\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u05be\n\66\f\66\16\66\u05c1\13\66\3\66\3\66\5\66\u05c5\n\66\5"+
		"\66\u05c7\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u05ce\n\66\f\66\16\66\u05d1"+
		"\13\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u05d9\n\66\f\66\16\66\u05dc"+
		"\13\66\3\66\3\66\7\66\u05e0\n\66\f\66\16\66\u05e3\13\66\5\66\u05e5\n\66"+
		"\3\67\3\67\3\67\7\67\u05ea\n\67\f\67\16\67\u05ed\13\67\38\38\58\u05f1"+
		"\n8\39\39\39\39\39\59\u05f8\n9\3:\3:\3:\3:\3:\7:\u05ff\n:\f:\16:\u0602"+
		"\13:\3:\3:\5:\u0606\n:\3;\5;\u0609\n;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\5>\u061d\n>\3?\3?\3@\3@\5@\u0623\n@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u0652\nT\3"+
		"T\2\3LU\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\2\24\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0085\u0086\4\2"+
		"$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27"+
		"\6\2OOcceexx\4\2==\u008d\u008d\5\2\33\33JJ\177\177\4\2\37\37@@\6\2\66"+
		"8jj\u0098\u0098\u009a\u009b\4\2\n\fhh\4\2\u0097\u0097\u009a\u009a\3\2"+
		"\33\u0096\u074a\2\u00ac\3\2\2\2\4\u00b1\3\2\2\2\6\u00b7\3\2\2\2\b\u00d1"+
		"\3\2\2\2\n\u00f2\3\2\2\2\f\u0104\3\2\2\2\16\u010d\3\2\2\2\20\u0115\3\2"+
		"\2\2\22\u011f\3\2\2\2\24\u0132\3\2\2\2\26\u0156\3\2\2\2\30\u0176\3\2\2"+
		"\2\32\u019f\3\2\2\2\34\u01e4\3\2\2\2\36\u01f7\3\2\2\2 \u0215\3\2\2\2\""+
		"\u021f\3\2\2\2$\u023c\3\2\2\2&\u0242\3\2\2\2(\u024f\3\2\2\2*\u025c\3\2"+
		"\2\2,\u0269\3\2\2\2.\u0277\3\2\2\2\60\u02c1\3\2\2\2\62\u02d0\3\2\2\2\64"+
		"\u02dd\3\2\2\2\66\u02e3\3\2\2\28\u02f1\3\2\2\2:\u0300\3\2\2\2<\u0323\3"+
		"\2\2\2>\u0343\3\2\2\2@\u0366\3\2\2\2B\u039c\3\2\2\2D\u039e\3\2\2\2F\u03a9"+
		"\3\2\2\2H\u03bb\3\2\2\2J\u03e3\3\2\2\2L\u0431\3\2\2\2N\u048e\3\2\2\2P"+
		"\u04be\3\2\2\2R\u04c8\3\2\2\2T\u04d2\3\2\2\2V\u04fa\3\2\2\2X\u0512\3\2"+
		"\2\2Z\u051c\3\2\2\2\\\u0527\3\2\2\2^\u0529\3\2\2\2`\u0548\3\2\2\2b\u0579"+
		"\3\2\2\2d\u057b\3\2\2\2f\u0592\3\2\2\2h\u05a2\3\2\2\2j\u05e4\3\2\2\2l"+
		"\u05e6\3\2\2\2n\u05f0\3\2\2\2p\u05f7\3\2\2\2r\u05f9\3\2\2\2t\u0608\3\2"+
		"\2\2v\u060c\3\2\2\2x\u060e\3\2\2\2z\u061c\3\2\2\2|\u061e\3\2\2\2~\u0622"+
		"\3\2\2\2\u0080\u0624\3\2\2\2\u0082\u0626\3\2\2\2\u0084\u0628\3\2\2\2\u0086"+
		"\u062a\3\2\2\2\u0088\u062c\3\2\2\2\u008a\u062e\3\2\2\2\u008c\u0630\3\2"+
		"\2\2\u008e\u0632\3\2\2\2\u0090\u0634\3\2\2\2\u0092\u0636\3\2\2\2\u0094"+
		"\u0638\3\2\2\2\u0096\u063a\3\2\2\2\u0098\u063c\3\2\2\2\u009a\u063e\3\2"+
		"\2\2\u009c\u0640\3\2\2\2\u009e\u0642\3\2\2\2\u00a0\u0644\3\2\2\2\u00a2"+
		"\u0646\3\2\2\2\u00a4\u0648\3\2\2\2\u00a6\u0651\3\2\2\2\u00a8\u00ab\5\6"+
		"\4\2\u00a9\u00ab\5\4\3\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\2\2\3\u00b0\3\3\2\2\2\u00b1\u00b2"+
		"\7\u009f\2\2\u00b2\u00b3\b\3\1\2\u00b3\5\3\2\2\2\u00b4\u00b6\7\3\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00c3\5\b\5\2\u00bb"+
		"\u00bd\7\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\5\b\5\2\u00c1"+
		"\u00bc\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c9\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\3\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\7I\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00d0\7q\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00f0\3\2"+
		"\2\2\u00d3\u00f1\5\n\6\2\u00d4\u00f1\5\f\7\2\u00d5\u00f1\5\16\b\2\u00d6"+
		"\u00f1\5\20\t\2\u00d7\u00f1\5\22\n\2\u00d8\u00f1\5\24\13\2\u00d9\u00f1"+
		"\5\26\f\2\u00da\u00f1\5\30\r\2\u00db\u00f1\5\32\16\2\u00dc\u00f1\5\34"+
		"\17\2\u00dd\u00f1\5\36\20\2\u00de\u00f1\5 \21\2\u00df\u00f1\5\"\22\2\u00e0"+
		"\u00f1\5$\23\2\u00e1\u00f1\5&\24\2\u00e2\u00f1\5(\25\2\u00e3\u00f1\5*"+
		"\26\2\u00e4\u00f1\5,\27\2\u00e5\u00f1\5.\30\2\u00e6\u00f1\5\60\31\2\u00e7"+
		"\u00f1\5\62\32\2\u00e8\u00f1\5\64\33\2\u00e9\u00f1\5\66\34\2\u00ea\u00f1"+
		"\58\35\2\u00eb\u00f1\5:\36\2\u00ec\u00f1\5<\37\2\u00ed\u00f1\5> \2\u00ee"+
		"\u00f1\5@!\2\u00ef\u00f1\5B\"\2\u00f0\u00d3\3\2\2\2\u00f0\u00d4\3\2\2"+
		"\2\u00f0\u00d5\3\2\2\2\u00f0\u00d6\3\2\2\2\u00f0\u00d7\3\2\2\2\u00f0\u00d8"+
		"\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00da\3\2\2\2\u00f0\u00db\3\2\2\2\u00f0"+
		"\u00dc\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00df\3\2"+
		"\2\2\u00f0\u00e0\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e2\3\2\2\2\u00f0"+
		"\u00e3\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e6\3\2"+
		"\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\t\3\2\2\2\u00f2\u00f3"+
		"\7 \2\2\u00f3\u00f7\7\u0084\2\2\u00f4\u00f5\5\u0088E\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u0102\5\u008aF\2\u00fa\u00fb\7{\2\2\u00fb\u00fc\7"+
		"\u0088\2\2\u00fc\u0103\5\u008eH\2\u00fd\u00ff\7\35\2\2\u00fe\u0100\7\60"+
		"\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\5D#\2\u0102\u00fa\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\13\3\2\2\2"+
		"\u0104\u010b\7!\2\2\u0105\u010c\5\u0088E\2\u0106\u010c\5\u008cG\2\u0107"+
		"\u0108\5\u0088E\2\u0108\u0109\7\4\2\2\u0109\u010a\5\u008cG\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\r\3\2\2\2\u010d\u010f\7%\2\2\u010e\u0110\79\2\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5L"+
		"\'\2\u0112\u0113\7#\2\2\u0113\u0114\5\u0088E\2\u0114\17\3\2\2\2\u0115"+
		"\u0117\7(\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011d\3\2\2\2\u0119\u011b\7\u0089\2\2\u011a\u011c\5\u00a4S"+
		"\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0119"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\21\3\2\2\2\u011f\u0124\t\3\2\2\u0120"+
		"\u0122\7\u0089\2\2\u0121\u0123\5\u00a4S\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\23\3\2\2\2\u0126\u0128\7\u0095\2\2\u0127\u0129\7v\2\2\u0128\u0127\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012f\5^\60\2\u012b"+
		"\u012c\7\7\2\2\u012c\u012e\5^\60\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u013e\5j\66\2\u0135\u0137\7\u008b\2\2\u0136\u0138\7\37\2\2"+
		"\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013c"+
		"\7\\\2\2\u013a\u013c\7F\2\2\u013b\u0135\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\5j\66\2\u013e\u013b\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u014c\3\2\2\2\u0142\u0143\7o\2\2\u0143\u0144\7*\2\2\u0144\u0149\5Z.\2"+
		"\u0145\u0146\7\7\2\2\u0146\u0148\5Z.\2\u0147\u0145\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0154\3\2"+
		"\2\2\u014e\u014f\7d\2\2\u014f\u0152\5L\'\2\u0150\u0151\t\4\2\2\u0151\u0153"+
		"\5L\'\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u014e\3\2\2\2\u0154\u0155\3\2\2\2\u0155\25\3\2\2\2\u0156\u0158\7\64\2"+
		"\2\u0157\u0159\7\u008c\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015e\7V\2\2\u015b\u015c\7R\2\2\u015c\u015d\7h\2"+
		"\2\u015d\u015f\7H\2\2\u015e\u015b\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163"+
		"\3\2\2\2\u0160\u0161\5\u0088E\2\u0161\u0162\7\4\2\2\u0162\u0164\3\2\2"+
		"\2\u0163\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\5\u0096L\2\u0166\u0167\7m\2\2\u0167\u0168\5\u008aF\2\u0168\u0169\7\5"+
		"\2\2\u0169\u016e\5R*\2\u016a\u016b\7\7\2\2\u016b\u016d\5R*\2\u016c\u016a"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\7\6\2\2\u0172\u0173\7\u0094"+
		"\2\2\u0173\u0175\5L\'\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\27\3\2\2\2\u0176\u0178\7\64\2\2\u0177\u0179\t\5\2\2\u0178\u0177\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017e\7\u0084\2\2\u017b"+
		"\u017c\7R\2\2\u017c\u017d\7h\2\2\u017d\u017f\7H\2\2\u017e\u017b\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0183\3\2\2\2\u0180\u0181\5\u0088E\2\u0181"+
		"\u0182\7\4\2\2\u0182\u0184\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u019d\5\u008aF\2\u0186\u0187\7\5\2\2\u0187"+
		"\u018c\5D#\2\u0188\u0189\7\7\2\2\u0189\u018b\5D#\2\u018a\u0188\3\2\2\2"+
		"\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0193"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\7\2\2\u0190\u0192\5T+\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0199\7\6\2\2\u0197"+
		"\u0198\7\u0096\2\2\u0198\u019a\7\u0097\2\2\u0199\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019e\3\2\2\2\u019b\u019c\7#\2\2\u019c\u019e\5<\37\2\u019d"+
		"\u0186\3\2\2\2\u019d\u019b\3\2\2\2\u019e\31\3\2\2\2\u019f\u01a1\7\64\2"+
		"\2\u01a0\u01a2\t\5\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a7\7\u008a\2\2\u01a4\u01a5\7R\2\2\u01a5\u01a6\7h\2\2"+
		"\u01a6\u01a8\7H\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac"+
		"\3\2\2\2\u01a9\u01aa\5\u0088E\2\u01aa\u01ab\7\4\2\2\u01ab\u01ad\3\2\2"+
		"\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b3"+
		"\5\u0098M\2\u01af\u01b4\7\'\2\2\u01b0\u01b4\7\36\2\2\u01b1\u01b2\7[\2"+
		"\2\u01b2\u01b4\7k\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01c3\3\2\2\2\u01b5\u01c4\7=\2\2\u01b6"+
		"\u01c4\7Z\2\2\u01b7\u01c1\7\u008d\2\2\u01b8\u01b9\7k\2\2\u01b9\u01be\5"+
		"\u0090I\2\u01ba\u01bb\7\7\2\2\u01bb\u01bd\5\u0090I\2\u01bc\u01ba\3\2\2"+
		"\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01b8\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01b5\3\2\2\2\u01c3\u01b6\3\2\2\2\u01c3\u01b7\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c9\7m\2\2\u01c6\u01c7\5\u0088E\2\u01c7"+
		"\u01c8\7\4\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\5\u008aF\2\u01cc\u01cd\7K\2\2\u01cd"+
		"\u01ce\7B\2\2\u01ce\u01d0\7\u0080\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\7\u0093\2\2\u01d2\u01d4\5L\'"+
		"\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01de"+
		"\7(\2\2\u01d6\u01db\5> \2\u01d7\u01db\5.\30\2\u01d8\u01db\5 \21\2\u01d9"+
		"\u01db\5<\37\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\3\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01da\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7D\2\2\u01e3"+
		"\33\3\2\2\2\u01e4\u01e6\7\64\2\2\u01e5\u01e7\t\5\2\2\u01e6\u01e5\3\2\2"+
		"\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ec\7\u0091\2\2\u01e9"+
		"\u01ea\7R\2\2\u01ea\u01eb\7h\2\2\u01eb\u01ed\7H\2\2\u01ec\u01e9\3\2\2"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\3\2\2\2\u01ee\u01ef\5\u0088E\2\u01ef"+
		"\u01f0\7\4\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\5\u009aN\2\u01f4\u01f5\7#\2\2\u01f5"+
		"\u01f6\5<\37\2\u01f6\35\3\2\2\2\u01f7\u01f8\7\64\2\2\u01f8\u01f9\7\u0092"+
		"\2\2\u01f9\u01fd\7\u0084\2\2\u01fa\u01fb\7R\2\2\u01fb\u01fc\7h\2\2\u01fc"+
		"\u01fe\7H\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0202\3\2"+
		"\2\2\u01ff\u0200\5\u0088E\2\u0200\u0201\7\4\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u01ff\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5\u008a"+
		"F\2\u0205\u0206\7\u008e\2\2\u0206\u0212\5\u009cO\2\u0207\u0208\7\5\2\2"+
		"\u0208\u020d\5~@\2\u0209\u020a\7\7\2\2\u020a\u020c\5~@\2\u020b\u0209\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\6\2\2\u0211\u0213\3\2"+
		"\2\2\u0212\u0207\3\2\2\2\u0212\u0213\3\2\2\2\u0213\37\3\2\2\2\u0214\u0216"+
		"\5V,\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\7=\2\2\u0218\u0219\7M\2\2\u0219\u021c\5X-\2\u021a\u021b\7\u0094"+
		"\2\2\u021b\u021d\5L\'\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"!\3\2\2\2\u021e\u0220\5V,\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\7=\2\2\u0222\u0223\7M\2\2\u0223\u0226\5X-\2"+
		"\u0224\u0225\7\u0094\2\2\u0225\u0227\5L\'\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u023a\3\2\2\2\u0228\u0229\7o\2\2\u0229\u022a\7*\2"+
		"\2\u022a\u022f\5Z.\2\u022b\u022c\7\7\2\2\u022c\u022e\5Z.\2\u022d\u022b"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0228\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7d\2\2\u0235\u0238\5L\'\2\u0236\u0237"+
		"\t\4\2\2\u0237\u0239\5L\'\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0232\3\2\2\2\u023a\u023b\3\2\2\2\u023b#\3\2\2\2"+
		"\u023c\u023e\7?\2\2\u023d\u023f\79\2\2\u023e\u023d\3\2\2\2\u023e\u023f"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5\u0088E\2\u0241%\3\2\2\2\u0242"+
		"\u0243\7A\2\2\u0243\u0246\7V\2\2\u0244\u0245\7R\2\2\u0245\u0247\7H\2\2"+
		"\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u0249"+
		"\5\u0088E\2\u0249\u024a\7\4\2\2\u024a\u024c\3\2\2\2\u024b\u0248\3\2\2"+
		"\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\u0096L\2\u024e"+
		"\'\3\2\2\2\u024f\u0250\7A\2\2\u0250\u0253\7\u0084\2\2\u0251\u0252\7R\2"+
		"\2\u0252\u0254\7H\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258"+
		"\3\2\2\2\u0255\u0256\5\u0088E\2\u0256\u0257\7\4\2\2\u0257\u0259\3\2\2"+
		"\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\5\u008aF\2\u025b)\3\2\2\2\u025c\u025d\7A\2\2\u025d\u0260\7\u008a\2\2"+
		"\u025e\u025f\7R\2\2\u025f\u0261\7H\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0265\3\2\2\2\u0262\u0263\5\u0088E\2\u0263\u0264\7\4\2"+
		"\2\u0264\u0266\3\2\2\2\u0265\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u0268\5\u0098M\2\u0268+\3\2\2\2\u0269\u026a\7A\2\2\u026a"+
		"\u026d\7\u0091\2\2\u026b\u026c\7R\2\2\u026c\u026e\7H\2\2\u026d\u026b\3"+
		"\2\2\2\u026d\u026e\3\2\2\2\u026e\u0272\3\2\2\2\u026f\u0270\5\u0088E\2"+
		"\u0270\u0271\7\4\2\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5\u009aN\2\u0275-\3\2\2\2\u0276"+
		"\u0278\5V,\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u028a\3\2\2"+
		"\2\u0279\u028b\7Z\2\2\u027a\u028b\7|\2\2\u027b\u027c\7Z\2\2\u027c\u027d"+
		"\7n\2\2\u027d\u028b\7|\2\2\u027e\u027f\7Z\2\2\u027f\u0280\7n\2\2\u0280"+
		"\u028b\7\177\2\2\u0281\u0282\7Z\2\2\u0282\u0283\7n\2\2\u0283\u028b\7\33"+
		"\2\2\u0284\u0285\7Z\2\2\u0285\u0286\7n\2\2\u0286\u028b\7J\2\2\u0287\u0288"+
		"\7Z\2\2\u0288\u0289\7n\2\2\u0289\u028b\7S\2\2\u028a\u0279\3\2\2\2\u028a"+
		"\u027a\3\2\2\2\u028a\u027b\3\2\2\2\u028a\u027e\3\2\2\2\u028a\u0281\3\2"+
		"\2\2\u028a\u0284\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u0290\7]\2\2\u028d\u028e\5\u0088E\2\u028e\u028f\7\4\2\2\u028f\u0291\3"+
		"\2\2\2\u0290\u028d\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u029e\5\u008aF\2\u0293\u0294\7\5\2\2\u0294\u0299\5\u0090I\2\u0295\u0296"+
		"\7\7\2\2\u0296\u0298\5\u0090I\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2"+
		"\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029d\7\6\2\2\u029d\u029f\3\2\2\2\u029e\u0293\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02bf\3\2\2\2\u02a0\u02a1\7\u0090\2\2\u02a1\u02a2"+
		"\7\5\2\2\u02a2\u02a7\5L\'\2\u02a3\u02a4\7\7\2\2\u02a4\u02a6\5L\'\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02b9\7\6\2\2\u02ab"+
		"\u02ac\7\7\2\2\u02ac\u02ad\7\5\2\2\u02ad\u02b2\5L\'\2\u02ae\u02af\7\7"+
		"\2\2\u02af\u02b1\5L\'\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02b6\7\6\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c0\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02c0\5<\37\2\u02bd\u02be\7:\2\2\u02be"+
		"\u02c0\7\u0090\2\2\u02bf\u02a0\3\2\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0/\3\2\2\2\u02c1\u02c5\7r\2\2\u02c2\u02c3\5\u0088E\2\u02c3"+
		"\u02c4\7\4\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ce\5\u009eP\2\u02c8\u02c9\7\b\2\2\u02c9"+
		"\u02cf\5\\/\2\u02ca\u02cb\7\5\2\2\u02cb\u02cc\5\\/\2\u02cc\u02cd\7\6\2"+
		"\2\u02cd\u02cf\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02ca\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\61\3\2\2\2\u02d0\u02db\7y\2\2\u02d1\u02dc\5\u0092J\2\u02d2"+
		"\u02d3\5\u0088E\2\u02d3\u02d4\7\4\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d2"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02da\5\u008aF"+
		"\2\u02d8\u02da\5\u0096L\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d5\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\63\3\2\2\2\u02dd\u02df\7z\2\2\u02de\u02e0\7\u0081\2\2\u02df"+
		"\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\5\u00a0"+
		"Q\2\u02e2\65\3\2\2\2\u02e3\u02e8\7\177\2\2\u02e4\u02e6\7\u0089\2\2\u02e5"+
		"\u02e7\5\u00a4S\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9"+
		"\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ef\3\2\2\2\u02ea"+
		"\u02ec\7\u0088\2\2\u02eb\u02ed\7\u0081\2\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\5\u00a0Q\2\u02ef\u02ea\3\2\2"+
		"\2\u02ef\u02f0\3\2\2\2\u02f0\67\3\2\2\2\u02f1\u02f2\7\u0081\2\2\u02f2"+
		"\u02f3\5\u00a0Q\2\u02f39\3\2\2\2\u02f4\u02f6\7\u0095\2\2\u02f5\u02f7\7"+
		"v\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02fd\5^\60\2\u02f9\u02fa\7\7\2\2\u02fa\u02fc\5^\60\2\u02fb\u02f9\3\2"+
		"\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u02f4\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0302\3\2\2\2\u0302\u030d\5j\66\2\u0303\u0304\7o\2\2\u0304"+
		"\u0305\7*\2\2\u0305\u030a\5Z.\2\u0306\u0307\7\7\2\2\u0307\u0309\5Z.\2"+
		"\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u0303\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0315\3\2\2\2\u030f\u0310\7d\2\2\u0310\u0313\5L\'"+
		"\2\u0311\u0312\t\4\2\2\u0312\u0314\5L\'\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u030f\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		";\3\2\2\2\u0317\u0319\7\u0095\2\2\u0318\u031a\7v\2\2\u0319\u0318\3\2\2"+
		"\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0320\5^\60\2\u031c\u031d"+
		"\7\7\2\2\u031d\u031f\5^\60\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2"+
		"\2\2\u0323\u0317\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u032b\5j\66\2\u0326\u0327\5p9\2\u0327\u0328\5j\66\2\u0328\u032a\3\2\2"+
		"\2\u0329\u0326\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c"+
		"\3\2\2\2\u032c\u0338\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u032f\7o\2\2\u032f"+
		"\u0330\7*\2\2\u0330\u0335\5Z.\2\u0331\u0332\7\7\2\2\u0332\u0334\5Z.\2"+
		"\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u032e\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u0340\3\2\2\2\u033a\u033b\7d\2\2\u033b\u033e\5L\'"+
		"\2\u033c\u033d\t\4\2\2\u033d\u033f\5L\'\2\u033e\u033c\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u033a\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"=\3\2\2\2\u0342\u0344\5V,\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0350\7\u008d\2\2\u0346\u0347\7n\2\2\u0347\u0351"+
		"\7\177\2\2\u0348\u0349\7n\2\2\u0349\u0351\7\33\2\2\u034a\u034b\7n\2\2"+
		"\u034b\u0351\7|\2\2\u034c\u034d\7n\2\2\u034d\u0351\7J\2\2\u034e\u034f"+
		"\7n\2\2\u034f\u0351\7S\2\2\u0350\u0346\3\2\2\2\u0350\u0348\3\2\2\2\u0350"+
		"\u034a\3\2\2\2\u0350\u034c\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0352\3\2\2\2\u0352\u0353\5X-\2\u0353\u0354\7\u0083\2\2\u0354"+
		"\u0355\5\u0090I\2\u0355\u0356\7\b\2\2\u0356\u035e\5L\'\2\u0357\u0358\7"+
		"\7\2\2\u0358\u0359\5\u0090I\2\u0359\u035a\7\b\2\2\u035a\u035b\5L\'\2\u035b"+
		"\u035d\3\2\2\2\u035c\u0357\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0363\3\2\2\2\u0360\u035e\3\2\2\2\u0361"+
		"\u0362\7\u0094\2\2\u0362\u0364\5L\'\2\u0363\u0361\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364?\3\2\2\2\u0365\u0367\5V,\2\u0366\u0365\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0373\7\u008d\2\2\u0369\u036a\7n\2"+
		"\2\u036a\u0374\7\177\2\2\u036b\u036c\7n\2\2\u036c\u0374\7\33\2\2\u036d"+
		"\u036e\7n\2\2\u036e\u0374\7|\2\2\u036f\u0370\7n\2\2\u0370\u0374\7J\2\2"+
		"\u0371\u0372\7n\2\2\u0372\u0374\7S\2\2\u0373\u0369\3\2\2\2\u0373\u036b"+
		"\3\2\2\2\u0373\u036d\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0371\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\5X-\2\u0376\u0377\7\u0083"+
		"\2\2\u0377\u0378\5\u0090I\2\u0378\u0379\7\b\2\2\u0379\u0381\5L\'\2\u037a"+
		"\u037b\7\7\2\2\u037b\u037c\5\u0090I\2\u037c\u037d\7\b\2\2\u037d\u037e"+
		"\5L\'\2\u037e\u0380\3\2\2\2\u037f\u037a\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0386\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0384\u0385\7\u0094\2\2\u0385\u0387\5L\'\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u039a\3\2\2\2\u0388\u0389\7o\2\2\u0389\u038a\7*\2"+
		"\2\u038a\u038f\5Z.\2\u038b\u038c\7\7\2\2\u038c\u038e\5Z.\2\u038d\u038b"+
		"\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0388\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7d\2\2\u0395\u0398\5L\'\2\u0396\u0397"+
		"\t\4\2\2\u0397\u0399\5L\'\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039b\3\2\2\2\u039a\u0392\3\2\2\2\u039a\u039b\3\2\2\2\u039bA\3\2\2\2"+
		"\u039c\u039d\7\u008f\2\2\u039dC\3\2\2\2\u039e\u03a0\5\u0090I\2\u039f\u03a1"+
		"\5F$\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a5\3\2\2\2\u03a2"+
		"\u03a4\5H%\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2"+
		"\2\u03a5\u03a6\3\2\2\2\u03a6E\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03aa"+
		"\5\u0084C\2\u03a9\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03a9\3\2\2"+
		"\2\u03ab\u03ac\3\2\2\2\u03ac\u03b7\3\2\2\2\u03ad\u03ae\7\5\2\2\u03ae\u03af"+
		"\5t;\2\u03af\u03b0\7\6\2\2\u03b0\u03b8\3\2\2\2\u03b1\u03b2\7\5\2\2\u03b2"+
		"\u03b3\5t;\2\u03b3\u03b4\7\7\2\2\u03b4\u03b5\5t;\2\u03b5\u03b6\7\6\2\2"+
		"\u03b6\u03b8\3\2\2\2\u03b7\u03ad\3\2\2\2\u03b7\u03b1\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8G\3\2\2\2\u03b9\u03ba\7\63\2\2\u03ba\u03bc\5\u0084C\2\u03bb"+
		"\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03de\3\2\2\2\u03bd\u03be\7s"+
		"\2\2\u03be\u03c0\7a\2\2\u03bf\u03c1\t\6\2\2\u03c0\u03bf\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\5J&\2\u03c3\u03c5\7&\2"+
		"\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03df\3\2\2\2\u03c6\u03c8"+
		"\7h\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u03ca\7j\2\2\u03ca\u03df\5J&\2\u03cb\u03cc\7\u008c\2\2\u03cc\u03df\5"+
		"J&\2\u03cd\u03ce\7.\2\2\u03ce\u03cf\7\5\2\2\u03cf\u03d0\5L\'\2\u03d0\u03d1"+
		"\7\6\2\2\u03d1\u03df\3\2\2\2\u03d2\u03d9\7:\2\2\u03d3\u03da\5t;\2\u03d4"+
		"\u03da\5v<\2\u03d5\u03d6\7\5\2\2\u03d6\u03d7\5L\'\2\u03d7\u03d8\7\6\2"+
		"\2\u03d8\u03da\3\2\2\2\u03d9\u03d3\3\2\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d5"+
		"\3\2\2\2\u03da\u03df\3\2\2\2\u03db\u03dc\7/\2\2\u03dc\u03df\5\u0092J\2"+
		"\u03dd\u03df\5N(\2\u03de\u03bd\3\2\2\2\u03de\u03c7\3\2\2\2\u03de\u03cb"+
		"\3\2\2\2\u03de\u03cd\3\2\2\2\u03de\u03d2\3\2\2\2\u03de\u03db\3\2\2\2\u03de"+
		"\u03dd\3\2\2\2\u03dfI\3\2\2\2\u03e0\u03e1\7m\2\2\u03e1\u03e2\7\62\2\2"+
		"\u03e2\u03e4\t\7\2\2\u03e3\u03e0\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4K\3"+
		"\2\2\2\u03e5\u03e6\b\'\1\2\u03e6\u03e7\5x=\2\u03e7\u03e8\5L\'\27\u03e8"+
		"\u0432\3\2\2\2\u03e9\u0432\5v<\2\u03ea\u0432\7\u0099\2\2\u03eb\u03ec\5"+
		"\u0088E\2\u03ec\u03ed\7\4\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03eb\3\2\2\2"+
		"\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\5\u008aF\2\u03f1"+
		"\u03f2\7\4\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u0432\5\u0090I\2\u03f6\u03f7\5\u0086D\2"+
		"\u03f7\u0404\7\5\2\2\u03f8\u03fa\7@\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u0400\5L\'\2\u03fc\u03fd\7\7\2\2\u03fd"+
		"\u03ff\5L\'\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0400\u0401\3\2\2\2\u0401\u0405\3\2\2\2\u0402\u0400\3\2\2\2\u0403"+
		"\u0405\7\t\2\2\u0404\u03f9\3\2\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0407\7\6\2\2\u0407\u0432\3\2\2\2\u0408"+
		"\u0409\7\5\2\2\u0409\u040a\5L\'\2\u040a\u040b\7\6\2\2\u040b\u0432\3\2"+
		"\2\2\u040c\u040d\7-\2\2\u040d\u040e\7\5\2\2\u040e\u040f\5L\'\2\u040f\u0410"+
		"\7#\2\2\u0410\u0411\5F$\2\u0411\u0412\7\6\2\2\u0412\u0432\3\2\2\2\u0413"+
		"\u0415\7h\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2"+
		"\2\2\u0416\u0418\7H\2\2\u0417\u0414\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041a\7\5\2\2\u041a\u041b\5<\37\2\u041b\u041c\7\6"+
		"\2\2\u041c\u0432\3\2\2\2\u041d\u041f\7,\2\2\u041e\u0420\5L\'\2\u041f\u041e"+
		"\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0426\3\2\2\2\u0421\u0422\7\u0093\2"+
		"\2\u0422\u0423\5L\'\2\u0423\u0424\7\u0087\2\2\u0424\u0425\5L\'\2\u0425"+
		"\u0427\3\2\2\2\u0426\u0421\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426\3\2"+
		"\2\2\u0428\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u042b\7C\2\2\u042b"+
		"\u042d\5L\'\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2"+
		"\2\2\u042e\u042f\7D\2\2\u042f\u0432\3\2\2\2\u0430\u0432\5P)\2\u0431\u03e5"+
		"\3\2\2\2\u0431\u03e9\3\2\2\2\u0431\u03ea\3\2\2\2\u0431\u03f3\3\2\2\2\u0431"+
		"\u03f6\3\2\2\2\u0431\u0408\3\2\2\2\u0431\u040c\3\2\2\2\u0431\u0417\3\2"+
		"\2\2\u0431\u041d\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u048b\3\2\2\2\u0433"+
		"\u0434\f\26\2\2\u0434\u0435\7\r\2\2\u0435\u048a\5L\'\27\u0436\u0437\f"+
		"\25\2\2\u0437\u0438\t\b\2\2\u0438\u048a\5L\'\26\u0439\u043a\f\24\2\2\u043a"+
		"\u043b\t\t\2\2\u043b\u048a\5L\'\25\u043c\u043d\f\23\2\2\u043d\u043e\t"+
		"\n\2\2\u043e\u048a\5L\'\24\u043f\u0440\f\22\2\2\u0440\u0441\t\13\2\2\u0441"+
		"\u048a\5L\'\23\u0442\u0443\f\21\2\2\u0443\u0444\5z>\2\u0444\u0445\5L\'"+
		"\22\u0445\u048a\3\2\2\2\u0446\u0447\f\20\2\2\u0447\u0448\7\"\2\2\u0448"+
		"\u048a\5L\'\21\u0449\u044a\f\17\2\2\u044a\u044b\7n\2\2\u044b\u048a\5L"+
		"\'\20\u044c\u044d\f\b\2\2\u044d\u044f\7^\2\2\u044e\u0450\7h\2\2\u044f"+
		"\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u048a\5L"+
		"\'\t\u0452\u0454\f\7\2\2\u0453\u0455\7h\2\2\u0454\u0453\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\7)\2\2\u0457\u0458\5L\'"+
		"\2\u0458\u0459\7\"\2\2\u0459\u045a\5L\'\b\u045a\u048a\3\2\2\2\u045b\u045c"+
		"\f\13\2\2\u045c\u045d\7/\2\2\u045d\u048a\5\u0092J\2\u045e\u0460\f\n\2"+
		"\2\u045f\u0461\7h\2\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0463\t\f\2\2\u0463\u0466\5L\'\2\u0464\u0465\7E\2\2\u0465"+
		"\u0467\5L\'\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u048a\3\2"+
		"\2\2\u0468\u046d\f\t\2\2\u0469\u046e\7_\2\2\u046a\u046e\7i\2\2\u046b\u046c"+
		"\7h\2\2\u046c\u046e\7j\2\2\u046d\u0469\3\2\2\2\u046d\u046a\3\2\2\2\u046d"+
		"\u046b\3\2\2\2\u046e\u048a\3\2\2\2\u046f\u0471\f\6\2\2\u0470\u0472\7h"+
		"\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0487\7U\2\2\u0474\u047e\7\5\2\2\u0475\u047f\5<\37\2\u0476\u047b\5L\'"+
		"\2\u0477\u0478\7\7\2\2\u0478\u047a\5L\'\2\u0479\u0477\3\2\2\2\u047a\u047d"+
		"\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\3\2\2\2\u047d"+
		"\u047b\3\2\2\2\u047e\u0475\3\2\2\2\u047e\u0476\3\2\2\2\u047e\u047f\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u0488\7\6\2\2\u0481\u0482\5\u0088E\2\u0482"+
		"\u0483\7\4\2\2\u0483\u0485\3\2\2\2\u0484\u0481\3\2\2\2\u0484\u0485\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u0488\5\u008aF\2\u0487\u0474\3\2\2\2\u0487"+
		"\u0484\3\2\2\2\u0488\u048a\3\2\2\2\u0489\u0433\3\2\2\2\u0489\u0436\3\2"+
		"\2\2\u0489\u0439\3\2\2\2\u0489\u043c\3\2\2\2\u0489\u043f\3\2\2\2\u0489"+
		"\u0442\3\2\2\2\u0489\u0446\3\2\2\2\u0489\u0449\3\2\2\2\u0489\u044c\3\2"+
		"\2\2\u0489\u0452\3\2\2\2\u0489\u045b\3\2\2\2\u0489\u045e\3\2\2\2\u0489"+
		"\u0468\3\2\2\2\u0489\u046f\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2"+
		"\2\2\u048b\u048c\3\2\2\2\u048cM\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u048f"+
		"\7w\2\2\u048f\u049b\5\u0094K\2\u0490\u0491\7\5\2\2\u0491\u0496\5\u0090"+
		"I\2\u0492\u0493\7\7\2\2\u0493\u0495\5\u0090I\2\u0494\u0492\3\2\2\2\u0495"+
		"\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2"+
		"\2\2\u0498\u0496\3\2\2\2\u0499\u049a\7\6\2\2\u049a\u049c\3\2\2\2\u049b"+
		"\u0490\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04af\3\2\2\2\u049d\u049e\7m"+
		"\2\2\u049e\u04a7\t\r\2\2\u049f\u04a0\7\u0083\2\2\u04a0\u04a8\7j\2\2\u04a1"+
		"\u04a2\7\u0083\2\2\u04a2\u04a8\7:\2\2\u04a3\u04a8\7+\2\2\u04a4\u04a8\7"+
		"}\2\2\u04a5\u04a6\7g\2\2\u04a6\u04a8\7\34\2\2\u04a7\u049f\3\2\2\2\u04a7"+
		"\u04a1\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a8\u04ac\3\2\2\2\u04a9\u04aa\7e\2\2\u04aa\u04ac\5\u0084C\2\u04ab"+
		"\u049d\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04ab\3\2"+
		"\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04bc\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b4\7h\2\2\u04b3\u04b2\3\2"+
		"\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04ba\7;\2\2\u04b6"+
		"\u04b7\7X\2\2\u04b7\u04bb\7<\2\2\u04b8\u04b9\7X\2\2\u04b9\u04bb\7T\2\2"+
		"\u04ba\u04b6\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd"+
		"\3\2\2\2\u04bc\u04b3\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bdO\3\2\2\2\u04be"+
		"\u04bf\7u\2\2\u04bf\u04c4\7\5\2\2\u04c0\u04c5\7S\2\2\u04c1\u04c2\t\16"+
		"\2\2\u04c2\u04c3\7\7\2\2\u04c3\u04c5\5|?\2\u04c4\u04c0\3\2\2\2\u04c4\u04c1"+
		"\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7\6\2\2\u04c7Q\3\2\2\2\u04c8"+
		"\u04cb\5\u0090I\2\u04c9\u04ca\7/\2\2\u04ca\u04cc\5\u0092J\2\u04cb\u04c9"+
		"\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04cf\t\6\2\2\u04ce"+
		"\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cfS\3\2\2\2\u04d0\u04d1\7\63\2\2"+
		"\u04d1\u04d3\5\u0084C\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04f8\3\2\2\2\u04d4\u04d5\7s\2\2\u04d5\u04d8\7a\2\2\u04d6\u04d8\7\u008c"+
		"\2\2\u04d7\u04d4\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\7\5\2\2\u04da\u04df\5R*\2\u04db\u04dc\7\7\2\2\u04dc\u04de\5R*\2"+
		"\u04dd\u04db\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0"+
		"\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e3\7\6\2\2\u04e3"+
		"\u04e4\5J&\2\u04e4\u04f9\3\2\2\2\u04e5\u04e6\7.\2\2\u04e6\u04e7\7\5\2"+
		"\2\u04e7\u04e8\5L\'\2\u04e8\u04e9\7\6\2\2\u04e9\u04f9\3\2\2\2\u04ea\u04eb"+
		"\7L\2\2\u04eb\u04ec\7a\2\2\u04ec\u04ed\7\5\2\2\u04ed\u04f2\5\u0090I\2"+
		"\u04ee\u04ef\7\7\2\2\u04ef\u04f1\5\u0090I\2\u04f0\u04ee\3\2\2\2\u04f1"+
		"\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2"+
		"\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f6\7\6\2\2\u04f6\u04f7\5N(\2\u04f7\u04f9"+
		"\3\2\2\2\u04f8\u04d7\3\2\2\2\u04f8\u04e5\3\2\2\2\u04f8\u04ea\3\2\2\2\u04f9"+
		"U\3\2\2\2\u04fa\u04fc\7\u0095\2\2\u04fb\u04fd\7v\2\2\u04fc\u04fb\3\2\2"+
		"\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\5r:\2\u04ff\u0500"+
		"\7#\2\2\u0500\u0501\7\5\2\2\u0501\u0502\5<\37\2\u0502\u050c\7\6\2\2\u0503"+
		"\u0504\7\7\2\2\u0504\u0505\5r:\2\u0505\u0506\7#\2\2\u0506\u0507\7\5\2"+
		"\2\u0507\u0508\5<\37\2\u0508\u0509\7\6\2\2\u0509\u050b\3\2\2\2\u050a\u0503"+
		"\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"W\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0510\5\u0088E\2\u0510\u0511\7\4\2"+
		"\2\u0511\u0513\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514"+
		"\3\2\2\2\u0514\u051a\5\u008aF\2\u0515\u0516\7W\2\2\u0516\u0517\7*\2\2"+
		"\u0517\u051b\5\u0096L\2\u0518\u0519\7h\2\2\u0519\u051b\7W\2\2\u051a\u0515"+
		"\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051bY\3\2\2\2\u051c"+
		"\u051f\5L\'\2\u051d\u051e\7/\2\2\u051e\u0520\5\u0092J\2\u051f\u051d\3"+
		"\2\2\2\u051f\u0520\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u0523\t\6\2\2\u0522"+
		"\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523[\3\2\2\2\u0524\u0528\5t;\2\u0525"+
		"\u0528\5\u0084C\2\u0526\u0528\7\u009a\2\2\u0527\u0524\3\2\2\2\u0527\u0525"+
		"\3\2\2\2\u0527\u0526\3\2\2\2\u0528]\3\2\2\2\u0529\u0535\5\u008aF\2\u052a"+
		"\u052b\7\5\2\2\u052b\u0530\5\u0090I\2\u052c\u052d\7\7\2\2\u052d\u052f"+
		"\5\u0090I\2\u052e\u052c\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2"+
		"\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0534"+
		"\7\6\2\2\u0534\u0536\3\2\2\2\u0535\u052a\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u0538\7#\2\2\u0538\u0539\7\5\2\2\u0539\u053a\5<\37"+
		"\2\u053a\u053b\7\6\2\2\u053b_\3\2\2\2\u053c\u0549\7\t\2\2\u053d\u053e"+
		"\5\u008aF\2\u053e\u053f\7\4\2\2\u053f\u0540\7\t\2\2\u0540\u0549\3\2\2"+
		"\2\u0541\u0546\5L\'\2\u0542\u0544\7#\2\2\u0543\u0542\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\5\u0080A\2\u0546\u0543\3\2\2"+
		"\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548\u053c\3\2\2\2\u0548\u053d"+
		"\3\2\2\2\u0548\u0541\3\2\2\2\u0549a\3\2\2\2\u054a\u054b\5\u0088E\2\u054b"+
		"\u054c\7\4\2\2\u054c\u054e\3\2\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2"+
		"\2\2\u054e\u054f\3\2\2\2\u054f\u0554\5\u008aF\2\u0550\u0552\7#\2\2\u0551"+
		"\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\5\u00a2"+
		"R\2\u0554\u0551\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u055b\3\2\2\2\u0556"+
		"\u0557\7W\2\2\u0557\u0558\7*\2\2\u0558\u055c\5\u0096L\2\u0559\u055a\7"+
		"h\2\2\u055a\u055c\7W\2\2\u055b\u0556\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u057a\3\2\2\2\u055d\u0567\7\5\2\2\u055e\u0563\5b"+
		"\62\2\u055f\u0560\7\7\2\2\u0560\u0562\5b\62\2\u0561\u055f\3\2\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0568\3\2"+
		"\2\2\u0565\u0563\3\2\2\2\u0566\u0568\5d\63\2\u0567\u055e\3\2\2\2\u0567"+
		"\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056e\7\6\2\2\u056a\u056c\7#"+
		"\2\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u056f\5\u00a2R\2\u056e\u056b\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u057a"+
		"\3\2\2\2\u0570\u0571\7\5\2\2\u0571\u0572\5<\37\2\u0572\u0577\7\6\2\2\u0573"+
		"\u0575\7#\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2"+
		"\2\2\u0576\u0578\5\u00a2R\2\u0577\u0574\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u057a\3\2\2\2\u0579\u054d\3\2\2\2\u0579\u055d\3\2\2\2\u0579\u0570\3\2"+
		"\2\2\u057ac\3\2\2\2\u057b\u0582\5b\62\2\u057c\u057d\5f\64\2\u057d\u057e"+
		"\5b\62\2\u057e\u057f\5h\65\2\u057f\u0581\3\2\2\2\u0580\u057c\3\2\2\2\u0581"+
		"\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583e\3\2\2\2"+
		"\u0584\u0582\3\2\2\2\u0585\u0593\7\7\2\2\u0586\u0588\7f\2\2\u0587\u0586"+
		"\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058f\3\2\2\2\u0589\u058b\7b\2\2\u058a"+
		"\u058c\7p\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u0590\3\2"+
		"\2\2\u058d\u0590\7Y\2\2\u058e\u0590\7\65\2\2\u058f\u0589\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0593\7`\2\2\u0592\u0585\3\2\2\2\u0592\u0587\3\2\2\2\u0593"+
		"g\3\2\2\2\u0594\u0595\7m\2\2\u0595\u05a3\5L\'\2\u0596\u0597\7\u008e\2"+
		"\2\u0597\u0598\7\5\2\2\u0598\u059d\5\u0090I\2\u0599\u059a\7\7\2\2\u059a"+
		"\u059c\5\u0090I\2\u059b\u0599\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b"+
		"\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u059d\3\2\2\2\u05a0"+
		"\u05a1\7\6\2\2\u05a1\u05a3\3\2\2\2\u05a2\u0594\3\2\2\2\u05a2\u0596\3\2"+
		"\2\2\u05a2\u05a3\3\2\2\2\u05a3i\3\2\2\2\u05a4\u05a6\7\u0082\2\2\u05a5"+
		"\u05a7\t\17\2\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3"+
		"\2\2\2\u05a8\u05b5\5l\67\2\u05a9\u05b3\7M\2\2\u05aa\u05af\5b\62\2\u05ab"+
		"\u05ac\7\7\2\2\u05ac\u05ae\5b\62\2\u05ad\u05ab\3\2\2\2\u05ae\u05b1\3\2"+
		"\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b4\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b2\u05b4\5d\63\2\u05b3\u05aa\3\2\2\2\u05b3\u05b2\3\2"+
		"\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05a9\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05b7\3\2\2\2\u05b7\u05c6\5n8\2\u05b8\u05b9\7P\2\2\u05b9\u05ba\7*\2\2"+
		"\u05ba\u05bf\5L\'\2\u05bb\u05bc\7\7\2\2\u05bc\u05be\5L\'\2\u05bd\u05bb"+
		"\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c4\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c3\7Q\2\2\u05c3\u05c5\5L\'"+
		"\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05b8"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05e5\3\2\2\2\u05c8\u05c9\7\u0090\2"+
		"\2\u05c9\u05ca\7\5\2\2\u05ca\u05cf\5L\'\2\u05cb\u05cc\7\7\2\2\u05cc\u05ce"+
		"\5L\'\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf\u05cd\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d2\u05e1\7\6"+
		"\2\2\u05d3\u05d4\7\7\2\2\u05d4\u05d5\7\5\2\2\u05d5\u05da\5L\'\2\u05d6"+
		"\u05d7\7\7\2\2\u05d7\u05d9\5L\'\2\u05d8\u05d6\3\2\2\2\u05d9\u05dc\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dd\u05de\7\6\2\2\u05de\u05e0\3\2\2\2\u05df\u05d3\3\2"+
		"\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05a4\3\2\2\2\u05e4\u05c8\3\2"+
		"\2\2\u05e5k\3\2\2\2\u05e6\u05eb\5`\61\2\u05e7\u05e8\7\7\2\2\u05e8\u05ea"+
		"\5`\61\2\u05e9\u05e7\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ecm\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\7\u0094"+
		"\2\2\u05ef\u05f1\5L\'\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"o\3\2\2\2\u05f2\u05f8\7\u008b\2\2\u05f3\u05f4\7\u008b\2\2\u05f4\u05f8"+
		"\7\37\2\2\u05f5\u05f8\7\\\2\2\u05f6\u05f8\7F\2\2\u05f7\u05f2\3\2\2\2\u05f7"+
		"\u05f3\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8q\3\2\2\2"+
		"\u05f9\u0605\5\u008aF\2\u05fa\u05fb\7\5\2\2\u05fb\u0600\5\u0090I\2\u05fc"+
		"\u05fd\7\7\2\2\u05fd\u05ff\5\u0090I\2\u05fe\u05fc\3\2\2\2\u05ff\u0602"+
		"\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602"+
		"\u0600\3\2\2\2\u0603\u0604\7\6\2\2\u0604\u0606\3\2\2\2\u0605\u05fa\3\2"+
		"\2\2\u0605\u0606\3\2\2\2\u0606s\3\2\2\2\u0607\u0609\t\t\2\2\u0608\u0607"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\7\u0098\2"+
		"\2\u060bu\3\2\2\2\u060c\u060d\t\20\2\2\u060dw\3\2\2\2\u060e\u060f\t\21"+
		"\2\2\u060fy\3\2\2\2\u0610\u061d\7\b\2\2\u0611\u061d\7\30\2\2\u0612\u061d"+
		"\7\31\2\2\u0613\u061d\7\32\2\2\u0614\u061d\7^\2\2\u0615\u0616\7^\2\2\u0616"+
		"\u061d\7h\2\2\u0617\u061d\7U\2\2\u0618\u061d\7c\2\2\u0619\u061d\7O\2\2"+
		"\u061a\u061d\7e\2\2\u061b\u061d\7x\2\2\u061c\u0610\3\2\2\2\u061c\u0611"+
		"\3\2\2\2\u061c\u0612\3\2\2\2\u061c\u0613\3\2\2\2\u061c\u0614\3\2\2\2\u061c"+
		"\u0615\3\2\2\2\u061c\u0617\3\2\2\2\u061c\u0618\3\2\2\2\u061c\u0619\3\2"+
		"\2\2\u061c\u061a\3\2\2\2\u061c\u061b\3\2\2\2\u061d{\3\2\2\2\u061e\u061f"+
		"\7\u009a\2\2\u061f}\3\2\2\2\u0620\u0623\5L\'\2\u0621\u0623\5D#\2\u0622"+
		"\u0620\3\2\2\2\u0622\u0621\3\2\2\2\u0623\177\3\2\2\2\u0624\u0625\t\22"+
		"\2\2\u0625\u0081\3\2\2\2\u0626\u0627\t\23\2\2\u0627\u0083\3\2\2\2\u0628"+
		"\u0629\5\u00a6T\2\u0629\u0085\3\2\2\2\u062a\u062b\5\u00a6T\2\u062b\u0087"+
		"\3\2\2\2\u062c\u062d\5\u00a6T\2\u062d\u0089\3\2\2\2\u062e\u062f\5\u00a6"+
		"T\2\u062f\u008b\3\2\2\2\u0630\u0631\5\u00a6T\2\u0631\u008d\3\2\2\2\u0632"+
		"\u0633\5\u00a6T\2\u0633\u008f\3\2\2\2\u0634\u0635\5\u00a6T\2\u0635\u0091"+
		"\3\2\2\2\u0636\u0637\5\u00a6T\2\u0637\u0093\3\2\2\2\u0638\u0639\5\u00a6"+
		"T\2\u0639\u0095\3\2\2\2\u063a\u063b\5\u00a6T\2\u063b\u0097\3\2\2\2\u063c"+
		"\u063d\5\u00a6T\2\u063d\u0099\3\2\2\2\u063e\u063f\5\u00a6T\2\u063f\u009b"+
		"\3\2\2\2\u0640\u0641\5\u00a6T\2\u0641\u009d\3\2\2\2\u0642\u0643\5\u00a6"+
		"T\2\u0643\u009f\3\2\2\2\u0644\u0645\5\u00a6T\2\u0645\u00a1\3\2\2\2\u0646"+
		"\u0647\5\u00a6T\2\u0647\u00a3\3\2\2\2\u0648\u0649\5\u00a6T\2\u0649\u00a5"+
		"\3\2\2\2\u064a\u0652\7\u0097\2\2\u064b\u0652\5\u0082B\2\u064c\u0652\7"+
		"\u009a\2\2\u064d\u064e\7\5\2\2\u064e\u064f\5\u00a6T\2\u064f\u0650\7\6"+
		"\2\2\u0650\u0652\3\2\2\2\u0651\u064a\3\2\2\2\u0651\u064b\3\2\2\2\u0651"+
		"\u064c\3\2\2\2\u0651\u064d\3\2\2\2\u0652\u00a7\3\2\2\2\u00e1\u00aa\u00ac"+
		"\u00b7\u00be\u00c3\u00c9\u00cf\u00d1\u00f0\u00f7\u00ff\u0102\u010b\u010f"+
		"\u0117\u011b\u011d\u0122\u0124\u0128\u012f\u0132\u0137\u013b\u0140\u0149"+
		"\u014c\u0152\u0154\u0158\u015e\u0163\u016e\u0174\u0178\u017e\u0183\u018c"+
		"\u0193\u0199\u019d\u01a1\u01a7\u01ac\u01b3\u01be\u01c1\u01c3\u01c9\u01cf"+
		"\u01d3\u01da\u01e0\u01e6\u01ec\u01f1\u01fd\u0202\u020d\u0212\u0215\u021c"+
		"\u021f\u0226\u022f\u0232\u0238\u023a\u023e\u0246\u024b\u0253\u0258\u0260"+
		"\u0265\u026d\u0272\u0277\u028a\u0290\u0299\u029e\u02a7\u02b2\u02b9\u02bf"+
		"\u02c5\u02ce\u02d5\u02d9\u02db\u02df\u02e6\u02e8\u02ec\u02ef\u02f6\u02fd"+
		"\u0300\u030a\u030d\u0313\u0315\u0319\u0320\u0323\u032b\u0335\u0338\u033e"+
		"\u0340\u0343\u0350\u035e\u0363\u0366\u0373\u0381\u0386\u038f\u0392\u0398"+
		"\u039a\u03a0\u03a5\u03ab\u03b7\u03bb\u03c0\u03c4\u03c7\u03d9\u03de\u03e3"+
		"\u03ee\u03f3\u03f9\u0400\u0404\u0414\u0417\u041f\u0428\u042c\u0431\u044f"+
		"\u0454\u0460\u0466\u046d\u0471\u047b\u047e\u0484\u0487\u0489\u048b\u0496"+
		"\u049b\u04a7\u04ab\u04af\u04b3\u04ba\u04bc\u04c4\u04cb\u04ce\u04d2\u04d7"+
		"\u04df\u04f2\u04f8\u04fc\u050c\u0512\u051a\u051f\u0522\u0527\u0530\u0535"+
		"\u0543\u0546\u0548\u054d\u0551\u0554\u055b\u0563\u0567\u056b\u056e\u0574"+
		"\u0577\u0579\u0582\u0587\u058b\u058f\u0592\u059d\u05a2\u05a6\u05af\u05b3"+
		"\u05b5\u05bf\u05c4\u05c6\u05cf\u05da\u05e1\u05e4\u05eb\u05f0\u05f7\u0600"+
		"\u0605\u0608\u061c\u0622\u0651";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}