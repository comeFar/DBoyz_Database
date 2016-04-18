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
		RULE_select_stmt = 28, RULE_update_stmt = 29, RULE_update_stmt_limited = 30, 
		RULE_vacuum_stmt = 31, RULE_column_def = 32, RULE_type_name = 33, RULE_column_constraint = 34, 
		RULE_conflict_clause = 35, RULE_binary_operator = 36, RULE_expr = 37, 
		RULE_foreign_key_clause = 38, RULE_raise_function = 39, RULE_indexed_column = 40, 
		RULE_table_constraint = 41, RULE_with_clause = 42, RULE_qualified_table_name = 43, 
		RULE_ordering_term = 44, RULE_pragma_value = 45, RULE_common_table_expression = 46, 
		RULE_projector = 47, RULE_table_or_subquery = 48, RULE_join_clause = 49, 
		RULE_join_operator = 50, RULE_join_constraint = 51, RULE_select_core = 52, 
		RULE_projection_clause = 53, RULE_where_clause = 54, RULE_compound_operator = 55, 
		RULE_cte_table_name = 56, RULE_signed_number = 57, RULE_literal_value = 58, 
		RULE_unary_operator = 59, RULE_error_message = 60, RULE_module_argument = 61, 
		RULE_column_alias = 62, RULE_keyword = 63, RULE_name = 64, RULE_function_name = 65, 
		RULE_database_name = 66, RULE_table_name = 67, RULE_table_or_index_name = 68, 
		RULE_new_table_name = 69, RULE_column_name = 70, RULE_collation_name = 71, 
		RULE_foreign_table = 72, RULE_index_name = 73, RULE_trigger_name = 74, 
		RULE_view_name = 75, RULE_module_name = 76, RULE_pragma_name = 77, RULE_savepoint_name = 78, 
		RULE_table_alias = 79, RULE_transaction_name = 80, RULE_any_name = 81;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "insert_stmt", 
		"pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", 
		"select_stmt", "update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", 
		"type_name", "column_constraint", "conflict_clause", "binary_operator", 
		"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "projector", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "projection_clause", 
		"where_clause", "compound_operator", "cte_table_name", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_UPDATE - 139)) | (1L << (K_VACUUM - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
				{
				setState(166);
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
					setState(164);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(165);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
			setState(173);
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(176);
				match(SCOL);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			sql_stmt();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(183);
						match(SCOL);
						}
						}
						setState(186); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(188);
					sql_stmt();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(SCOL);
					}
					} 
				}
				setState(199);
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
			setState(205);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(200);
				match(K_EXPLAIN);
				setState(203);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(201);
					match(K_QUERY);
					setState(202);
					match(K_PLAN);
					}
				}

				}
			}

			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(207);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(208);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(209);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(210);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(211);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(212);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(213);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(214);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(215);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(216);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(217);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(218);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(219);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(220);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(221);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(222);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(223);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(224);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(225);
				insert_stmt();
				}
				break;
			case 20:
				{
				setState(226);
				pragma_stmt();
				}
				break;
			case 21:
				{
				setState(227);
				reindex_stmt();
				}
				break;
			case 22:
				{
				setState(228);
				release_stmt();
				}
				break;
			case 23:
				{
				setState(229);
				rollback_stmt();
				}
				break;
			case 24:
				{
				setState(230);
				savepoint_stmt();
				}
				break;
			case 25:
				{
				setState(231);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(232);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(233);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(234);
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
			setState(237);
			match(K_ALTER);
			setState(238);
			match(K_TABLE);
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(239);
				database_name();
				setState(240);
				match(DOT);
				}
				break;
			}
			setState(244);
			table_name();
			setState(253);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(245);
				match(K_RENAME);
				setState(246);
				match(K_TO);
				setState(247);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(248);
				match(K_ADD);
				setState(250);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(249);
					match(K_COLUMN);
					}
					break;
				}
				setState(252);
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
			setState(255);
			match(K_ANALYZE);
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(256);
				database_name();
				}
				break;
			case 2:
				{
				setState(257);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(258);
				database_name();
				setState(259);
				match(DOT);
				setState(260);
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
			setState(264);
			match(K_ATTACH);
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(265);
				match(K_DATABASE);
				}
				break;
			}
			setState(268);
			expr(0);
			setState(269);
			match(K_AS);
			setState(270);
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
			setState(272);
			match(K_BEGIN);
			setState(274);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(280);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(276);
				match(K_TRANSACTION);
				setState(278);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(277);
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
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(287);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(283);
				match(K_TRANSACTION);
				setState(285);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(284);
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
			setState(301);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(289);
				match(K_WITH);
				setState(291);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(290);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(293);
				common_table_expression();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					common_table_expression();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(303);
			select_core();
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(304);
					match(K_UNION);
					setState(306);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(305);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(308);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(309);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312);
				select_core();
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(327);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(317);
				match(K_ORDER);
				setState(318);
				match(K_BY);
				setState(319);
				ordering_term();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(320);
					match(COMMA);
					setState(321);
					ordering_term();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(335);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(329);
				match(K_LIMIT);
				setState(330);
				expr(0);
				setState(333);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(331);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(332);
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
			setState(337);
			match(K_CREATE);
			setState(339);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(338);
				match(K_UNIQUE);
				}
			}

			setState(341);
			match(K_INDEX);
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(342);
				match(K_IF);
				setState(343);
				match(K_NOT);
				setState(344);
				match(K_EXISTS);
				}
				break;
			}
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(347);
				database_name();
				setState(348);
				match(DOT);
				}
				break;
			}
			setState(352);
			index_name();
			setState(353);
			match(K_ON);
			setState(354);
			table_name();
			setState(355);
			match(OPEN_PAR);
			setState(356);
			indexed_column();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357);
				match(COMMA);
				setState(358);
				indexed_column();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(CLOSE_PAR);
			setState(367);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(365);
				match(K_WHERE);
				setState(366);
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
			setState(369);
			match(K_CREATE);
			setState(371);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(373);
			match(K_TABLE);
			setState(377);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(374);
				match(K_IF);
				setState(375);
				match(K_NOT);
				setState(376);
				match(K_EXISTS);
				}
				break;
			}
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(379);
				database_name();
				setState(380);
				match(DOT);
				}
				break;
			}
			setState(384);
			table_name();
			setState(408);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(385);
				match(OPEN_PAR);
				setState(386);
				column_def();
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						match(COMMA);
						setState(388);
						column_def();
						}
						} 
					}
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(394);
					match(COMMA);
					setState(395);
					table_constraint();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				match(CLOSE_PAR);
				setState(404);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(402);
					match(K_WITHOUT);
					setState(403);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(406);
				match(K_AS);
				setState(407);
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
			setState(410);
			match(K_CREATE);
			setState(412);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(414);
			match(K_TRIGGER);
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(415);
				match(K_IF);
				setState(416);
				match(K_NOT);
				setState(417);
				match(K_EXISTS);
				}
				break;
			}
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(420);
				database_name();
				setState(421);
				match(DOT);
				}
				break;
			}
			setState(425);
			trigger_name();
			setState(430);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(426);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(427);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(428);
				match(K_INSTEAD);
				setState(429);
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
			setState(446);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(432);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(433);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(434);
				match(K_UPDATE);
				setState(444);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(435);
					match(K_OF);
					setState(436);
					column_name();
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(437);
						match(COMMA);
						setState(438);
						column_name();
						}
						}
						setState(443);
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
			setState(448);
			match(K_ON);
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(449);
				database_name();
				setState(450);
				match(DOT);
				}
				break;
			}
			setState(454);
			table_name();
			setState(458);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(455);
				match(K_FOR);
				setState(456);
				match(K_EACH);
				setState(457);
				match(K_ROW);
				}
			}

			setState(462);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(460);
				match(K_WHEN);
				setState(461);
				expr(0);
				}
			}

			setState(464);
			match(K_BEGIN);
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(465);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(466);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(467);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(468);
					select_stmt();
					}
					break;
				}
				setState(471);
				match(SCOL);
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(477);
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
			setState(479);
			match(K_CREATE);
			setState(481);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(480);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(483);
			match(K_VIEW);
			setState(487);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(484);
				match(K_IF);
				setState(485);
				match(K_NOT);
				setState(486);
				match(K_EXISTS);
				}
				break;
			}
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(489);
				database_name();
				setState(490);
				match(DOT);
				}
				break;
			}
			setState(494);
			view_name();
			setState(495);
			match(K_AS);
			setState(496);
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
			setState(498);
			match(K_CREATE);
			setState(499);
			match(K_VIRTUAL);
			setState(500);
			match(K_TABLE);
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(501);
				match(K_IF);
				setState(502);
				match(K_NOT);
				setState(503);
				match(K_EXISTS);
				}
				break;
			}
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(506);
				database_name();
				setState(507);
				match(DOT);
				}
				break;
			}
			setState(511);
			table_name();
			setState(512);
			match(K_USING);
			setState(513);
			module_name();
			setState(525);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(514);
				match(OPEN_PAR);
				setState(515);
				module_argument();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					module_argument();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(523);
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
			setState(528);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(527);
				with_clause();
				}
			}

			setState(530);
			match(K_DELETE);
			setState(531);
			match(K_FROM);
			setState(532);
			qualified_table_name();
			setState(535);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(533);
				match(K_WHERE);
				setState(534);
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
			setState(538);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(537);
				with_clause();
				}
			}

			setState(540);
			match(K_DELETE);
			setState(541);
			match(K_FROM);
			setState(542);
			qualified_table_name();
			setState(545);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(543);
				match(K_WHERE);
				setState(544);
				expr(0);
				}
			}

			setState(565);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(557);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(547);
					match(K_ORDER);
					setState(548);
					match(K_BY);
					setState(549);
					ordering_term();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(550);
						match(COMMA);
						setState(551);
						ordering_term();
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(559);
				match(K_LIMIT);
				setState(560);
				expr(0);
				setState(563);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(561);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(562);
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
			setState(567);
			match(K_DETACH);
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(568);
				match(K_DATABASE);
				}
				break;
			}
			setState(571);
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
			setState(573);
			match(K_DROP);
			setState(574);
			match(K_INDEX);
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(575);
				match(K_IF);
				setState(576);
				match(K_EXISTS);
				}
				break;
			}
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(579);
				database_name();
				setState(580);
				match(DOT);
				}
				break;
			}
			setState(584);
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
			setState(586);
			match(K_DROP);
			setState(587);
			match(K_TABLE);
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(588);
				match(K_IF);
				setState(589);
				match(K_EXISTS);
				}
				break;
			}
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(592);
				database_name();
				setState(593);
				match(DOT);
				}
				break;
			}
			setState(597);
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
			setState(599);
			match(K_DROP);
			setState(600);
			match(K_TRIGGER);
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(601);
				match(K_IF);
				setState(602);
				match(K_EXISTS);
				}
				break;
			}
			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(605);
				database_name();
				setState(606);
				match(DOT);
				}
				break;
			}
			setState(610);
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
			setState(612);
			match(K_DROP);
			setState(613);
			match(K_VIEW);
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(614);
				match(K_IF);
				setState(615);
				match(K_EXISTS);
				}
				break;
			}
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(618);
				database_name();
				setState(619);
				match(DOT);
				}
				break;
			}
			setState(623);
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
			setState(626);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(625);
				with_clause();
				}
			}

			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(628);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(629);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(630);
				match(K_INSERT);
				setState(631);
				match(K_OR);
				setState(632);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(633);
				match(K_INSERT);
				setState(634);
				match(K_OR);
				setState(635);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(636);
				match(K_INSERT);
				setState(637);
				match(K_OR);
				setState(638);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(639);
				match(K_INSERT);
				setState(640);
				match(K_OR);
				setState(641);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(642);
				match(K_INSERT);
				setState(643);
				match(K_OR);
				setState(644);
				match(K_IGNORE);
				}
				break;
			}
			setState(647);
			match(K_INTO);
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(648);
				database_name();
				setState(649);
				match(DOT);
				}
				break;
			}
			setState(653);
			table_name();
			setState(665);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(654);
				match(OPEN_PAR);
				setState(655);
				column_name();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(656);
					match(COMMA);
					setState(657);
					column_name();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(663);
				match(CLOSE_PAR);
				}
			}

			setState(698);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(667);
				match(K_VALUES);
				setState(668);
				match(OPEN_PAR);
				setState(669);
				expr(0);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(670);
					match(COMMA);
					setState(671);
					expr(0);
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(677);
				match(CLOSE_PAR);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(678);
					match(COMMA);
					setState(679);
					match(OPEN_PAR);
					setState(680);
					expr(0);
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(681);
						match(COMMA);
						setState(682);
						expr(0);
						}
						}
						setState(687);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(688);
					match(CLOSE_PAR);
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(695);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(696);
				match(K_DEFAULT);
				setState(697);
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
			setState(700);
			match(K_PRAGMA);
			setState(704);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(701);
				database_name();
				setState(702);
				match(DOT);
				}
				break;
			}
			setState(706);
			pragma_name();
			setState(713);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(707);
				match(ASSIGN);
				setState(708);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(709);
				match(OPEN_PAR);
				setState(710);
				pragma_value();
				setState(711);
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
			setState(715);
			match(K_REINDEX);
			setState(726);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(716);
				collation_name();
				}
				break;
			case 2:
				{
				setState(720);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(717);
					database_name();
					setState(718);
					match(DOT);
					}
					break;
				}
				setState(724);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(722);
					table_name();
					}
					break;
				case 2:
					{
					setState(723);
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
			setState(728);
			match(K_RELEASE);
			setState(730);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(729);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(732);
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
			setState(734);
			match(K_ROLLBACK);
			setState(739);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(735);
				match(K_TRANSACTION);
				setState(737);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(736);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(746);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(741);
				match(K_TO);
				setState(743);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(742);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(745);
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
			setState(748);
			match(K_SAVEPOINT);
			setState(749);
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
		enterRule(_localctx, 56, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(751);
				match(K_WITH);
				setState(753);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(752);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(755);
				common_table_expression();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(756);
					match(COMMA);
					setState(757);
					common_table_expression();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(765);
			select_core();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(766);
				compound_operator();
				setState(767);
				select_core();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(774);
				match(K_ORDER);
				setState(775);
				match(K_BY);
				setState(776);
				ordering_term();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(777);
					match(COMMA);
					setState(778);
					ordering_term();
					}
					}
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(792);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(786);
				match(K_LIMIT);
				setState(787);
				expr(0);
				setState(790);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(788);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(789);
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
		enterRule(_localctx, 58, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(794);
				with_clause();
				}
			}

			setState(797);
			match(K_UPDATE);
			setState(808);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(798);
				match(K_OR);
				setState(799);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(800);
				match(K_OR);
				setState(801);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(802);
				match(K_OR);
				setState(803);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(804);
				match(K_OR);
				setState(805);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(806);
				match(K_OR);
				setState(807);
				match(K_IGNORE);
				}
				break;
			}
			setState(810);
			qualified_table_name();
			setState(811);
			match(K_SET);
			setState(812);
			column_name();
			setState(813);
			match(ASSIGN);
			setState(814);
			expr(0);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				column_name();
				setState(817);
				match(ASSIGN);
				setState(818);
				expr(0);
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(827);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(825);
				match(K_WHERE);
				setState(826);
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
		enterRule(_localctx, 60, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(829);
				with_clause();
				}
			}

			setState(832);
			match(K_UPDATE);
			setState(843);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(833);
				match(K_OR);
				setState(834);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(835);
				match(K_OR);
				setState(836);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(837);
				match(K_OR);
				setState(838);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(839);
				match(K_OR);
				setState(840);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(841);
				match(K_OR);
				setState(842);
				match(K_IGNORE);
				}
				break;
			}
			setState(845);
			qualified_table_name();
			setState(846);
			match(K_SET);
			setState(847);
			column_name();
			setState(848);
			match(ASSIGN);
			setState(849);
			expr(0);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(850);
				match(COMMA);
				setState(851);
				column_name();
				setState(852);
				match(ASSIGN);
				setState(853);
				expr(0);
				}
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(860);
				match(K_WHERE);
				setState(861);
				expr(0);
				}
			}

			setState(882);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(874);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(864);
					match(K_ORDER);
					setState(865);
					match(K_BY);
					setState(866);
					ordering_term();
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(867);
						match(COMMA);
						setState(868);
						ordering_term();
						}
						}
						setState(873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(876);
				match(K_LIMIT);
				setState(877);
				expr(0);
				setState(880);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(878);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(879);
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
		enterRule(_localctx, 62, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
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
		enterRule(_localctx, 64, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			column_name();
			setState(888);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(887);
				type_name();
				}
				break;
			}
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(890);
				column_constraint();
				}
				}
				setState(895);
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
		enterRule(_localctx, 66, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(896);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(899); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(911);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(901);
				match(OPEN_PAR);
				setState(902);
				signed_number();
				setState(903);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(905);
				match(OPEN_PAR);
				setState(906);
				signed_number();
				setState(907);
				match(COMMA);
				setState(908);
				signed_number();
				setState(909);
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
		enterRule(_localctx, 68, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(913);
				match(K_CONSTRAINT);
				setState(914);
				name();
				}
			}

			setState(950);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(917);
				match(K_PRIMARY);
				setState(918);
				match(K_KEY);
				setState(920);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(919);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(922);
				conflict_clause();
				setState(924);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(923);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(927);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(926);
					match(K_NOT);
					}
				}

				setState(929);
				match(K_NULL);
				setState(930);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(931);
				match(K_UNIQUE);
				setState(932);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(933);
				match(K_CHECK);
				setState(934);
				match(OPEN_PAR);
				setState(935);
				expr(0);
				setState(936);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(938);
				match(K_DEFAULT);
				setState(945);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(939);
					signed_number();
					}
					break;
				case 2:
					{
					setState(940);
					literal_value();
					}
					break;
				case 3:
					{
					setState(941);
					match(OPEN_PAR);
					setState(942);
					expr(0);
					setState(943);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(947);
				match(K_COLLATE);
				setState(948);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(949);
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
		enterRule(_localctx, 70, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(952);
				match(K_ON);
				setState(953);
				match(K_CONFLICT);
				setState(954);
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
		enterRule(_localctx, 72, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(957);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(958);
				match(EQ);
				}
				break;
			case 3:
				{
				setState(959);
				match(NOT_EQ1);
				}
				break;
			case 4:
				{
				setState(960);
				match(NOT_EQ2);
				}
				break;
			case 5:
				{
				setState(961);
				match(PIPE2);
				}
				break;
			case 6:
				{
				setState(962);
				match(LT);
				}
				break;
			case 7:
				{
				setState(963);
				match(LT_EQ);
				}
				break;
			case 8:
				{
				setState(964);
				match(GT);
				}
				break;
			case 9:
				{
				setState(965);
				match(GT_EQ);
				}
				break;
			case 10:
				{
				setState(966);
				match(K_IS);
				}
				break;
			case 11:
				{
				setState(967);
				match(K_IS);
				setState(968);
				match(K_NOT);
				}
				break;
			case 12:
				{
				setState(969);
				match(K_IN);
				}
				break;
			case 13:
				{
				setState(970);
				match(K_LIKE);
				}
				break;
			case 14:
				{
				setState(971);
				match(K_GLOB);
				}
				break;
			case 15:
				{
				setState(972);
				match(K_MATCH);
				}
				break;
			case 16:
				{
				setState(973);
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
	public static class FunctionContext extends ExprContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(DBoyzSQLParser.K_DISTINCT, 0); }
		public FunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitFunction(this);
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
			setState(1052);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(977);
				unary_operator();
				setState(978);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(980);
				literal_value();
				}
				break;
			case 3:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(981);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(985);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(982);
						database_name();
						setState(983);
						match(DOT);
						}
						break;
					}
					setState(987);
					table_name();
					setState(988);
					match(DOT);
					}
					break;
				}
				setState(992);
				column_name();
				}
				break;
			case 5:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993);
				function_name();
				setState(994);
				match(OPEN_PAR);
				setState(1007);
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
					setState(996);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(995);
						match(K_DISTINCT);
						}
						break;
					}
					setState(998);
					expr(0);
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(999);
						match(COMMA);
						setState(1000);
						expr(0);
						}
						}
						setState(1005);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1006);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1009);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1011);
				match(OPEN_PAR);
				setState(1012);
				expr(0);
				setState(1013);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1015);
				match(K_CAST);
				setState(1016);
				match(OPEN_PAR);
				setState(1017);
				expr(0);
				setState(1018);
				match(K_AS);
				setState(1019);
				type_name();
				setState(1020);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1026);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1023);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1022);
						match(K_NOT);
						}
					}

					setState(1025);
					match(K_EXISTS);
					}
				}

				setState(1028);
				match(OPEN_PAR);
				setState(1029);
				select_stmt();
				setState(1030);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1032);
				match(K_CASE);
				setState(1034);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1033);
					expr(0);
					}
					break;
				}
				setState(1041); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1036);
					match(K_WHEN);
					setState(1037);
					expr(0);
					setState(1038);
					match(K_THEN);
					setState(1039);
					expr(0);
					}
					}
					setState(1043); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1047);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1045);
					match(K_ELSE);
					setState(1046);
					expr(0);
					}
				}

				setState(1049);
				match(K_END);
				}
				break;
			case 10:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1051);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1134);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1054);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1055);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1056);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1058);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1059);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1060);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1061);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1062);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1063);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1064);
						binary_operator();
						setState(1065);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1067);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1068);
						match(K_AND);
						setState(1069);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1070);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1071);
						match(K_OR);
						setState(1072);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1073);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1074);
						match(K_IS);
						setState(1076);
						switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
						case 1:
							{
							setState(1075);
							match(K_NOT);
							}
							break;
						}
						setState(1078);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1079);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1081);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1080);
							match(K_NOT);
							}
						}

						setState(1083);
						match(K_BETWEEN);
						setState(1084);
						expr(0);
						setState(1085);
						match(K_AND);
						setState(1086);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1088);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1089);
						match(K_COLLATE);
						setState(1090);
						collation_name();
						}
						break;
					case 10:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1091);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1093);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1092);
							match(K_NOT);
							}
						}

						setState(1095);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1096);
						expr(0);
						setState(1099);
						switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
						case 1:
							{
							setState(1097);
							match(K_ESCAPE);
							setState(1098);
							expr(0);
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1106);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1102);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1103);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1104);
							match(K_NOT);
							setState(1105);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 12:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1110);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1109);
							match(K_NOT);
							}
						}

						setState(1112);
						match(K_IN);
						setState(1132);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1113);
							match(OPEN_PAR);
							setState(1123);
							switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
							case 1:
								{
								setState(1114);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1115);
								expr(0);
								setState(1120);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1116);
									match(COMMA);
									setState(1117);
									expr(0);
									}
									}
									setState(1122);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1125);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1129);
							switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
							case 1:
								{
								setState(1126);
								database_name();
								setState(1127);
								match(DOT);
								}
								break;
							}
							setState(1131);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
			setState(1139);
			match(K_REFERENCES);
			setState(1140);
			foreign_table();
			setState(1152);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1141);
				match(OPEN_PAR);
				setState(1142);
				column_name();
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1143);
					match(COMMA);
					setState(1144);
					column_name();
					}
					}
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1150);
				match(CLOSE_PAR);
				}
			}

			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1168);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1154);
					match(K_ON);
					setState(1155);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1164);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1156);
						match(K_SET);
						setState(1157);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1158);
						match(K_SET);
						setState(1159);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1160);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1161);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1162);
						match(K_NO);
						setState(1163);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1166);
					match(K_MATCH);
					setState(1167);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1185);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1176);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1175);
					match(K_NOT);
					}
				}

				setState(1178);
				match(K_DEFERRABLE);
				setState(1183);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1179);
					match(K_INITIALLY);
					setState(1180);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1181);
					match(K_INITIALLY);
					setState(1182);
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
			setState(1187);
			match(K_RAISE);
			setState(1188);
			match(OPEN_PAR);
			setState(1193);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1189);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1190);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1191);
				match(COMMA);
				setState(1192);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1195);
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
			setState(1197);
			column_name();
			setState(1200);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1198);
				match(K_COLLATE);
				setState(1199);
				collation_name();
				}
			}

			setState(1203);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1202);
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
			setState(1207);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1205);
				match(K_CONSTRAINT);
				setState(1206);
				name();
				}
			}

			setState(1245);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1212);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1209);
					match(K_PRIMARY);
					setState(1210);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1211);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1214);
				match(OPEN_PAR);
				setState(1215);
				indexed_column();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1216);
					match(COMMA);
					setState(1217);
					indexed_column();
					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				match(CLOSE_PAR);
				setState(1224);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1226);
				match(K_CHECK);
				setState(1227);
				match(OPEN_PAR);
				setState(1228);
				expr(0);
				setState(1229);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1231);
				match(K_FOREIGN);
				setState(1232);
				match(K_KEY);
				setState(1233);
				match(OPEN_PAR);
				setState(1234);
				column_name();
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1235);
					match(COMMA);
					setState(1236);
					column_name();
					}
					}
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1242);
				match(CLOSE_PAR);
				setState(1243);
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
			setState(1247);
			match(K_WITH);
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1248);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1251);
			cte_table_name();
			setState(1252);
			match(K_AS);
			setState(1253);
			match(OPEN_PAR);
			setState(1254);
			select_stmt();
			setState(1255);
			match(CLOSE_PAR);
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1256);
				match(COMMA);
				setState(1257);
				cte_table_name();
				setState(1258);
				match(K_AS);
				setState(1259);
				match(OPEN_PAR);
				setState(1260);
				select_stmt();
				setState(1261);
				match(CLOSE_PAR);
				}
				}
				setState(1267);
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
			setState(1271);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1268);
				database_name();
				setState(1269);
				match(DOT);
				}
				break;
			}
			setState(1273);
			table_name();
			setState(1279);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1274);
				match(K_INDEXED);
				setState(1275);
				match(K_BY);
				setState(1276);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1277);
				match(K_NOT);
				setState(1278);
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
			setState(1281);
			expr(0);
			setState(1284);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1282);
				match(K_COLLATE);
				setState(1283);
				collation_name();
				}
			}

			setState(1287);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1286);
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
			setState(1292);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
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
			setState(1294);
			table_name();
			setState(1306);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1295);
				match(OPEN_PAR);
				setState(1296);
				column_name();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1297);
					match(COMMA);
					setState(1298);
					column_name();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1304);
				match(CLOSE_PAR);
				}
			}

			setState(1308);
			match(K_AS);
			setState(1309);
			match(OPEN_PAR);
			setState(1310);
			select_stmt();
			setState(1311);
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

	public static class ProjectorContext extends ParserRuleContext {
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
		public ProjectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterProjector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitProjector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitProjector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectorContext projector() throws RecognitionException {
		ProjectorContext _localctx = new ProjectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_projector);
		int _la;
		try {
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				table_name();
				setState(1315);
				match(DOT);
				setState(1316);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1318);
				expr(0);
				setState(1323);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1320);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1319);
						match(K_AS);
						}
					}

					setState(1322);
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
			setState(1374);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1327);
					database_name();
					setState(1328);
					match(DOT);
					}
					break;
				}
				setState(1332);
				table_name();
				setState(1337);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1334);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1333);
						match(K_AS);
						}
						break;
					}
					setState(1336);
					table_alias();
					}
					break;
				}
				setState(1344);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1339);
					match(K_INDEXED);
					setState(1340);
					match(K_BY);
					setState(1341);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1342);
					match(K_NOT);
					setState(1343);
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
				setState(1346);
				match(OPEN_PAR);
				setState(1356);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1347);
					table_or_subquery();
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1348);
						match(COMMA);
						setState(1349);
						table_or_subquery();
						}
						}
						setState(1354);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1355);
					join_clause();
					}
					break;
				}
				setState(1358);
				match(CLOSE_PAR);
				setState(1363);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1360);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1359);
						match(K_AS);
						}
						break;
					}
					setState(1362);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				match(OPEN_PAR);
				setState(1366);
				select_stmt();
				setState(1367);
				match(CLOSE_PAR);
				setState(1372);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1369);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1368);
						match(K_AS);
						}
						break;
					}
					setState(1371);
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
			setState(1376);
			table_or_subquery();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1377);
				join_operator();
				setState(1378);
				table_or_subquery();
				setState(1379);
				join_constraint();
				}
				}
				setState(1385);
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
			setState(1399);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
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
				setState(1388);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1387);
					match(K_NATURAL);
					}
				}

				setState(1396);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1390);
					match(K_LEFT);
					setState(1392);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1391);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1394);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1395);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1398);
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
			setState(1415);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1401);
				match(K_ON);
				setState(1402);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1403);
				match(K_USING);
				setState(1404);
				match(OPEN_PAR);
				setState(1405);
				column_name();
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1406);
					match(COMMA);
					setState(1407);
					column_name();
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1413);
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
			setState(1481);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				match(K_SELECT);
				setState(1419);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1418);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1421);
				projection_clause();
				setState(1434);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1422);
					match(K_FROM);
					setState(1432);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1423);
						table_or_subquery();
						setState(1428);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1424);
							match(COMMA);
							setState(1425);
							table_or_subquery();
							}
							}
							setState(1430);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1431);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1436);
				where_clause();
				setState(1451);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1437);
					match(K_GROUP);
					setState(1438);
					match(K_BY);
					setState(1439);
					expr(0);
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1440);
						match(COMMA);
						setState(1441);
						expr(0);
						}
						}
						setState(1446);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1449);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1447);
						match(K_HAVING);
						setState(1448);
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
				setState(1453);
				match(K_VALUES);
				setState(1454);
				match(OPEN_PAR);
				setState(1455);
				expr(0);
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1456);
					match(COMMA);
					setState(1457);
					expr(0);
					}
					}
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1463);
				match(CLOSE_PAR);
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1464);
					match(COMMA);
					setState(1465);
					match(OPEN_PAR);
					setState(1466);
					expr(0);
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1467);
						match(COMMA);
						setState(1468);
						expr(0);
						}
						}
						setState(1473);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1474);
					match(CLOSE_PAR);
					}
					}
					setState(1480);
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
		public List<ProjectorContext> projector() {
			return getRuleContexts(ProjectorContext.class);
		}
		public ProjectorContext projector(int i) {
			return getRuleContext(ProjectorContext.class,i);
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
			setState(1483);
			projector();
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1484);
				match(COMMA);
				setState(1485);
				projector();
				}
				}
				setState(1490);
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
			setState(1493);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1491);
				match(K_WHERE);
				setState(1492);
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
			setState(1500);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				match(K_UNION);
				setState(1497);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1498);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1499);
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
			setState(1502);
			table_name();
			setState(1514);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1503);
				match(OPEN_PAR);
				setState(1504);
				column_name();
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1505);
					match(COMMA);
					setState(1506);
					column_name();
					}
					}
					setState(1511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1512);
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
			setState(1517);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1516);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1519);
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
			setState(1521);
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
			setState(1523);
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
		enterRule(_localctx, 120, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
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
		enterRule(_localctx, 122, RULE_module_argument);
		try {
			setState(1529);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
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
		enterRule(_localctx, 124, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
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
		enterRule(_localctx, 126, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
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
		enterRule(_localctx, 128, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
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
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
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
		enterRule(_localctx, 132, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
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
		enterRule(_localctx, 134, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
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
		enterRule(_localctx, 136, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
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
		enterRule(_localctx, 138, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
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
		enterRule(_localctx, 140, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
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
		enterRule(_localctx, 142, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
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
		enterRule(_localctx, 144, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
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
		enterRule(_localctx, 146, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
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
		enterRule(_localctx, 148, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
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
		enterRule(_localctx, 150, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
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
		enterRule(_localctx, 152, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
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
		enterRule(_localctx, 154, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
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
		enterRule(_localctx, 156, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
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
		enterRule(_localctx, 158, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
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
		enterRule(_localctx, 160, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
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
		enterRule(_localctx, 162, RULE_any_name);
		try {
			setState(1576);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
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
				setState(1570);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1572);
				match(OPEN_PAR);
				setState(1573);
				any_name();
				setState(1574);
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
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u062d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00b4"+
		"\n\4\f\4\16\4\u00b7\13\4\3\4\3\4\6\4\u00bb\n\4\r\4\16\4\u00bc\3\4\7\4"+
		"\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3"+
		"\5\3\5\3\5\5\5\u00ce\n\5\5\5\u00d0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00ee\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00f5\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00fd\n\6\3\6\5\6\u0100\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0109\n\7\3\b\3\b\5\b\u010d\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0115"+
		"\n\t\3\t\3\t\5\t\u0119\n\t\5\t\u011b\n\t\3\n\3\n\3\n\5\n\u0120\n\n\5\n"+
		"\u0122\n\n\3\13\3\13\5\13\u0126\n\13\3\13\3\13\3\13\7\13\u012b\n\13\f"+
		"\13\16\13\u012e\13\13\5\13\u0130\n\13\3\13\3\13\3\13\5\13\u0135\n\13\3"+
		"\13\3\13\5\13\u0139\n\13\3\13\6\13\u013c\n\13\r\13\16\13\u013d\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0145\n\13\f\13\16\13\u0148\13\13\5\13\u014a\n"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0150\n\13\5\13\u0152\n\13\3\f\3\f\5\f\u0156"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u015c\n\f\3\f\3\f\3\f\5\f\u0161\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u016a\n\f\f\f\16\f\u016d\13\f\3\f\3\f\3\f\5\f\u0172"+
		"\n\f\3\r\3\r\5\r\u0176\n\r\3\r\3\r\3\r\3\r\5\r\u017c\n\r\3\r\3\r\3\r\5"+
		"\r\u0181\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0188\n\r\f\r\16\r\u018b\13\r\3\r"+
		"\3\r\7\r\u018f\n\r\f\r\16\r\u0192\13\r\3\r\3\r\3\r\5\r\u0197\n\r\3\r\3"+
		"\r\5\r\u019b\n\r\3\16\3\16\5\16\u019f\n\16\3\16\3\16\3\16\3\16\5\16\u01a5"+
		"\n\16\3\16\3\16\3\16\5\16\u01aa\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b1"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01ba\n\16\f\16\16\16\u01bd"+
		"\13\16\5\16\u01bf\n\16\5\16\u01c1\n\16\3\16\3\16\3\16\3\16\5\16\u01c7"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u01cd\n\16\3\16\3\16\5\16\u01d1\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01d8\n\16\3\16\3\16\6\16\u01dc\n\16\r\16"+
		"\16\16\u01dd\3\16\3\16\3\17\3\17\5\17\u01e4\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01ea\n\17\3\17\3\17\3\17\5\17\u01ef\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01fb\n\20\3\20\3\20\3\20\5\20\u0200\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0209\n\20\f\20\16\20\u020c"+
		"\13\20\3\20\3\20\5\20\u0210\n\20\3\21\5\21\u0213\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u021a\n\21\3\22\5\22\u021d\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0224\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u022b\n\22\f\22\16\22\u022e"+
		"\13\22\5\22\u0230\n\22\3\22\3\22\3\22\3\22\5\22\u0236\n\22\5\22\u0238"+
		"\n\22\3\23\3\23\5\23\u023c\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0244"+
		"\n\24\3\24\3\24\3\24\5\24\u0249\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0251\n\25\3\25\3\25\3\25\5\25\u0256\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\5\26\u025e\n\26\3\26\3\26\3\26\5\26\u0263\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u026b\n\27\3\27\3\27\3\27\5\27\u0270\n\27\3\27\3\27\3"+
		"\30\5\30\u0275\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0288\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u028e\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u0295\n\30\f\30\16\30\u0298"+
		"\13\30\3\30\3\30\5\30\u029c\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u02a3\n"+
		"\30\f\30\16\30\u02a6\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u02ae\n"+
		"\30\f\30\16\30\u02b1\13\30\3\30\3\30\7\30\u02b5\n\30\f\30\16\30\u02b8"+
		"\13\30\3\30\3\30\3\30\5\30\u02bd\n\30\3\31\3\31\3\31\3\31\5\31\u02c3\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02cc\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u02d3\n\32\3\32\3\32\5\32\u02d7\n\32\5\32\u02d9\n\32\3"+
		"\33\3\33\5\33\u02dd\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u02e4\n\34\5\34"+
		"\u02e6\n\34\3\34\3\34\5\34\u02ea\n\34\3\34\5\34\u02ed\n\34\3\35\3\35\3"+
		"\35\3\36\3\36\5\36\u02f4\n\36\3\36\3\36\3\36\7\36\u02f9\n\36\f\36\16\36"+
		"\u02fc\13\36\5\36\u02fe\n\36\3\36\3\36\3\36\3\36\7\36\u0304\n\36\f\36"+
		"\16\36\u0307\13\36\3\36\3\36\3\36\3\36\3\36\7\36\u030e\n\36\f\36\16\36"+
		"\u0311\13\36\5\36\u0313\n\36\3\36\3\36\3\36\3\36\5\36\u0319\n\36\5\36"+
		"\u031b\n\36\3\37\5\37\u031e\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u032b\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0337\n\37\f\37\16\37\u033a\13\37\3\37\3\37\5\37"+
		"\u033e\n\37\3 \5 \u0341\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u034e\n"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u035a\n \f \16 \u035d\13 \3 \3 \5 "+
		"\u0361\n \3 \3 \3 \3 \3 \7 \u0368\n \f \16 \u036b\13 \5 \u036d\n \3 \3"+
		" \3 \3 \5 \u0373\n \5 \u0375\n \3!\3!\3\"\3\"\5\"\u037b\n\"\3\"\7\"\u037e"+
		"\n\"\f\"\16\"\u0381\13\"\3#\6#\u0384\n#\r#\16#\u0385\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u0392\n#\3$\3$\5$\u0396\n$\3$\3$\3$\5$\u039b\n$\3$\3"+
		"$\5$\u039f\n$\3$\5$\u03a2\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u03b4\n$\3$\3$\3$\5$\u03b9\n$\3%\3%\3%\5%\u03be\n%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03d1\n&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u03dc\n\'\3\'\3\'\3\'\5\'\u03e1\n\'\3\'\3\'"+
		"\3\'\3\'\5\'\u03e7\n\'\3\'\3\'\3\'\7\'\u03ec\n\'\f\'\16\'\u03ef\13\'\3"+
		"\'\5\'\u03f2\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0402\n\'\3\'\5\'\u0405\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u040d\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\6\'\u0414\n\'\r\'\16\'\u0415\3\'\3\'\5\'\u041a"+
		"\n\'\3\'\3\'\3\'\5\'\u041f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0437\n\'\3\'\3\'"+
		"\3\'\5\'\u043c\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0448\n"+
		"\'\3\'\3\'\3\'\3\'\5\'\u044e\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0455\n\'\3\'"+
		"\3\'\5\'\u0459\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0461\n\'\f\'\16\'\u0464"+
		"\13\'\5\'\u0466\n\'\3\'\3\'\3\'\3\'\5\'\u046c\n\'\3\'\5\'\u046f\n\'\7"+
		"\'\u0471\n\'\f\'\16\'\u0474\13\'\3(\3(\3(\3(\3(\3(\7(\u047c\n(\f(\16("+
		"\u047f\13(\3(\3(\5(\u0483\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u048f\n"+
		"(\3(\3(\5(\u0493\n(\7(\u0495\n(\f(\16(\u0498\13(\3(\5(\u049b\n(\3(\3("+
		"\3(\3(\3(\5(\u04a2\n(\5(\u04a4\n(\3)\3)\3)\3)\3)\3)\5)\u04ac\n)\3)\3)"+
		"\3*\3*\3*\5*\u04b3\n*\3*\5*\u04b6\n*\3+\3+\5+\u04ba\n+\3+\3+\3+\5+\u04bf"+
		"\n+\3+\3+\3+\3+\7+\u04c5\n+\f+\16+\u04c8\13+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\7+\u04d8\n+\f+\16+\u04db\13+\3+\3+\3+\5+\u04e0\n+\3,"+
		"\3,\5,\u04e4\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u04f2\n,\f,\16"+
		",\u04f5\13,\3-\3-\3-\5-\u04fa\n-\3-\3-\3-\3-\3-\3-\5-\u0502\n-\3.\3.\3"+
		".\5.\u0507\n.\3.\5.\u050a\n.\3/\3/\3/\5/\u050f\n/\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0516\n\60\f\60\16\60\u0519\13\60\3\60\3\60\5\60\u051d\n\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u052b"+
		"\n\61\3\61\5\61\u052e\n\61\5\61\u0530\n\61\3\62\3\62\3\62\5\62\u0535\n"+
		"\62\3\62\3\62\5\62\u0539\n\62\3\62\5\62\u053c\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0543\n\62\3\62\3\62\3\62\3\62\7\62\u0549\n\62\f\62\16\62\u054c"+
		"\13\62\3\62\5\62\u054f\n\62\3\62\3\62\5\62\u0553\n\62\3\62\5\62\u0556"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u055c\n\62\3\62\5\62\u055f\n\62\5\62\u0561"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u0568\n\63\f\63\16\63\u056b\13\63"+
		"\3\64\3\64\5\64\u056f\n\64\3\64\3\64\5\64\u0573\n\64\3\64\3\64\5\64\u0577"+
		"\n\64\3\64\5\64\u057a\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0583"+
		"\n\65\f\65\16\65\u0586\13\65\3\65\3\65\5\65\u058a\n\65\3\66\3\66\5\66"+
		"\u058e\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u0595\n\66\f\66\16\66\u0598"+
		"\13\66\3\66\5\66\u059b\n\66\5\66\u059d\n\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u05a5\n\66\f\66\16\66\u05a8\13\66\3\66\3\66\5\66\u05ac\n\66\5"+
		"\66\u05ae\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u05b5\n\66\f\66\16\66\u05b8"+
		"\13\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u05c0\n\66\f\66\16\66\u05c3"+
		"\13\66\3\66\3\66\7\66\u05c7\n\66\f\66\16\66\u05ca\13\66\5\66\u05cc\n\66"+
		"\3\67\3\67\3\67\7\67\u05d1\n\67\f\67\16\67\u05d4\13\67\38\38\58\u05d8"+
		"\n8\39\39\39\39\39\59\u05df\n9\3:\3:\3:\3:\3:\7:\u05e6\n:\f:\16:\u05e9"+
		"\13:\3:\3:\5:\u05ed\n:\3;\5;\u05f0\n;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\5"+
		"?\u05fc\n?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3"+
		"I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3"+
		"S\3S\3S\5S\u062b\nS\3S\2\3LT\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\2\23\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0085"+
		"\u0086\4\2$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20\23"+
		"\6\2OOcceexx\4\2==\u008d\u008d\5\2\33\33JJ\177\177\4\2\37\37@@\6\2\66"+
		"8jj\u0098\u0098\u009a\u009b\4\2\n\fhh\4\2\u0097\u0097\u009a\u009a\3\2"+
		"\33\u0096\u071f\2\u00aa\3\2\2\2\4\u00af\3\2\2\2\6\u00b5\3\2\2\2\b\u00cf"+
		"\3\2\2\2\n\u00ef\3\2\2\2\f\u0101\3\2\2\2\16\u010a\3\2\2\2\20\u0112\3\2"+
		"\2\2\22\u011c\3\2\2\2\24\u012f\3\2\2\2\26\u0153\3\2\2\2\30\u0173\3\2\2"+
		"\2\32\u019c\3\2\2\2\34\u01e1\3\2\2\2\36\u01f4\3\2\2\2 \u0212\3\2\2\2\""+
		"\u021c\3\2\2\2$\u0239\3\2\2\2&\u023f\3\2\2\2(\u024c\3\2\2\2*\u0259\3\2"+
		"\2\2,\u0266\3\2\2\2.\u0274\3\2\2\2\60\u02be\3\2\2\2\62\u02cd\3\2\2\2\64"+
		"\u02da\3\2\2\2\66\u02e0\3\2\2\28\u02ee\3\2\2\2:\u02fd\3\2\2\2<\u031d\3"+
		"\2\2\2>\u0340\3\2\2\2@\u0376\3\2\2\2B\u0378\3\2\2\2D\u0383\3\2\2\2F\u0395"+
		"\3\2\2\2H\u03bd\3\2\2\2J\u03d0\3\2\2\2L\u041e\3\2\2\2N\u0475\3\2\2\2P"+
		"\u04a5\3\2\2\2R\u04af\3\2\2\2T\u04b9\3\2\2\2V\u04e1\3\2\2\2X\u04f9\3\2"+
		"\2\2Z\u0503\3\2\2\2\\\u050e\3\2\2\2^\u0510\3\2\2\2`\u052f\3\2\2\2b\u0560"+
		"\3\2\2\2d\u0562\3\2\2\2f\u0579\3\2\2\2h\u0589\3\2\2\2j\u05cb\3\2\2\2l"+
		"\u05cd\3\2\2\2n\u05d7\3\2\2\2p\u05de\3\2\2\2r\u05e0\3\2\2\2t\u05ef\3\2"+
		"\2\2v\u05f3\3\2\2\2x\u05f5\3\2\2\2z\u05f7\3\2\2\2|\u05fb\3\2\2\2~\u05fd"+
		"\3\2\2\2\u0080\u05ff\3\2\2\2\u0082\u0601\3\2\2\2\u0084\u0603\3\2\2\2\u0086"+
		"\u0605\3\2\2\2\u0088\u0607\3\2\2\2\u008a\u0609\3\2\2\2\u008c\u060b\3\2"+
		"\2\2\u008e\u060d\3\2\2\2\u0090\u060f\3\2\2\2\u0092\u0611\3\2\2\2\u0094"+
		"\u0613\3\2\2\2\u0096\u0615\3\2\2\2\u0098\u0617\3\2\2\2\u009a\u0619\3\2"+
		"\2\2\u009c\u061b\3\2\2\2\u009e\u061d\3\2\2\2\u00a0\u061f\3\2\2\2\u00a2"+
		"\u0621\3\2\2\2\u00a4\u062a\3\2\2\2\u00a6\u00a9\5\6\4\2\u00a7\u00a9\5\4"+
		"\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\2\2\3\u00ae\3\3\2\2\2\u00af\u00b0\7\u009f\2\2\u00b0"+
		"\u00b1\b\3\1\2\u00b1\5\3\2\2\2\u00b2\u00b4\7\3\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c1\5\b\5\2\u00b9\u00bb\7\3\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\5\b\5\2\u00bf\u00ba\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c7\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\7\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\7I\2\2\u00cb\u00cc\7t\2\2\u00cc\u00ce"+
		"\7q\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ed\3\2\2\2\u00d1\u00ee\5\n"+
		"\6\2\u00d2\u00ee\5\f\7\2\u00d3\u00ee\5\16\b\2\u00d4\u00ee\5\20\t\2\u00d5"+
		"\u00ee\5\22\n\2\u00d6\u00ee\5\24\13\2\u00d7\u00ee\5\26\f\2\u00d8\u00ee"+
		"\5\30\r\2\u00d9\u00ee\5\32\16\2\u00da\u00ee\5\34\17\2\u00db\u00ee\5\36"+
		"\20\2\u00dc\u00ee\5 \21\2\u00dd\u00ee\5\"\22\2\u00de\u00ee\5$\23\2\u00df"+
		"\u00ee\5&\24\2\u00e0\u00ee\5(\25\2\u00e1\u00ee\5*\26\2\u00e2\u00ee\5,"+
		"\27\2\u00e3\u00ee\5.\30\2\u00e4\u00ee\5\60\31\2\u00e5\u00ee\5\62\32\2"+
		"\u00e6\u00ee\5\64\33\2\u00e7\u00ee\5\66\34\2\u00e8\u00ee\58\35\2\u00e9"+
		"\u00ee\5:\36\2\u00ea\u00ee\5<\37\2\u00eb\u00ee\5> \2\u00ec\u00ee\5@!\2"+
		"\u00ed\u00d1\3\2\2\2\u00ed\u00d2\3\2\2\2\u00ed\u00d3\3\2\2\2\u00ed\u00d4"+
		"\3\2\2\2\u00ed\u00d5\3\2\2\2\u00ed\u00d6\3\2\2\2\u00ed\u00d7\3\2\2\2\u00ed"+
		"\u00d8\3\2\2\2\u00ed\u00d9\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed\u00db\3\2"+
		"\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed\u00de\3\2\2\2\u00ed"+
		"\u00df\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e2\3\2"+
		"\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed"+
		"\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2"+
		"\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\t\3\2\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f4\7\u0084\2\2\u00f1\u00f2\5\u0086"+
		"D\2\u00f2\u00f3\7\4\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00ff\5\u0088E\2\u00f7\u00f8"+
		"\7{\2\2\u00f8\u00f9\7\u0088\2\2\u00f9\u0100\5\u008cG\2\u00fa\u00fc\7\35"+
		"\2\2\u00fb\u00fd\7\60\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\5B\"\2\u00ff\u00f7\3\2\2\2\u00ff\u00fa\3\2"+
		"\2\2\u0100\13\3\2\2\2\u0101\u0108\7!\2\2\u0102\u0109\5\u0086D\2\u0103"+
		"\u0109\5\u008aF\2\u0104\u0105\5\u0086D\2\u0105\u0106\7\4\2\2\u0106\u0107"+
		"\5\u008aF\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2"+
		"\2\u0108\u0104\3\2\2\2\u0108\u0109\3\2\2\2\u0109\r\3\2\2\2\u010a\u010c"+
		"\7%\2\2\u010b\u010d\79\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\5L\'\2\u010f\u0110\7#\2\2\u0110\u0111\5\u0086"+
		"D\2\u0111\17\3\2\2\2\u0112\u0114\7(\2\2\u0113\u0115\t\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011a\3\2\2\2\u0116\u0118\7\u0089\2"+
		"\2\u0117\u0119\5\u00a2R\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u011b\3\2\2\2\u011b\21\3\2\2"+
		"\2\u011c\u0121\t\3\2\2\u011d\u011f\7\u0089\2\2\u011e\u0120\5\u00a2R\2"+
		"\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\23\3\2\2\2\u0123\u0125\7\u0095\2\2"+
		"\u0124\u0126\7v\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u012c\5^\60\2\u0128\u0129\7\7\2\2\u0129\u012b\5^\60\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0123\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013b\5j\66\2\u0132\u0134\7\u008b"+
		"\2\2\u0133\u0135\7\37\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0139\3\2\2\2\u0136\u0139\7\\\2\2\u0137\u0139\7F\2\2\u0138\u0132\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\5j\66\2\u013b\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0149\3\2\2\2\u013f\u0140\7o\2\2\u0140"+
		"\u0141\7*\2\2\u0141\u0146\5Z.\2\u0142\u0143\7\7\2\2\u0143\u0145\5Z.\2"+
		"\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u013f\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0151\3\2\2\2\u014b\u014c\7d\2\2\u014c\u014f\5L\'"+
		"\2\u014d\u014e\t\4\2\2\u014e\u0150\5L\'\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\25\3\2\2\2\u0153\u0155\7\64\2\2\u0154\u0156\7\u008c\2\2\u0155\u0154\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015b\7V\2\2\u0158"+
		"\u0159\7R\2\2\u0159\u015a\7h\2\2\u015a\u015c\7H\2\2\u015b\u0158\3\2\2"+
		"\2\u015b\u015c\3\2\2\2\u015c\u0160\3\2\2\2\u015d\u015e\5\u0086D\2\u015e"+
		"\u015f\7\4\2\2\u015f\u0161\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\5\u0094K\2\u0163\u0164\7m\2\2\u0164"+
		"\u0165\5\u0088E\2\u0165\u0166\7\5\2\2\u0166\u016b\5R*\2\u0167\u0168\7"+
		"\7\2\2\u0168\u016a\5R*\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u0171\7\6\2\2\u016f\u0170\7\u0094\2\2\u0170\u0172\5L\'\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\27\3\2\2\2\u0173\u0175\7\64\2"+
		"\2\u0174\u0176\t\5\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u017b\7\u0084\2\2\u0178\u0179\7R\2\2\u0179\u017a\7h\2\2"+
		"\u017a\u017c\7H\2\2\u017b\u0178\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0180"+
		"\3\2\2\2\u017d\u017e\5\u0086D\2\u017e\u017f\7\4\2\2\u017f\u0181\3\2\2"+
		"\2\u0180\u017d\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u019a"+
		"\5\u0088E\2\u0183\u0184\7\5\2\2\u0184\u0189\5B\"\2\u0185\u0186\7\7\2\2"+
		"\u0186\u0188\5B\"\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0190\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018d\7\7\2\2\u018d\u018f\5T+\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0196\7\6\2\2\u0194\u0195\7\u0096\2\2\u0195\u0197\7\u0097"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\3\2\2\2\u0198"+
		"\u0199\7#\2\2\u0199\u019b\5:\36\2\u019a\u0183\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\31\3\2\2\2\u019c\u019e\7\64\2\2\u019d\u019f\t\5\2\2\u019e\u019d"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\7\u008a\2"+
		"\2\u01a1\u01a2\7R\2\2\u01a2\u01a3\7h\2\2\u01a3\u01a5\7H\2\2\u01a4\u01a1"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a7\5\u0086D"+
		"\2\u01a7\u01a8\7\4\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\5\u0096L\2\u01ac\u01b1\7\'\2"+
		"\2\u01ad\u01b1\7\36\2\2\u01ae\u01af\7[\2\2\u01af\u01b1\7k\2\2\u01b0\u01ac"+
		"\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01c0\3\2\2\2\u01b2\u01c1\7=\2\2\u01b3\u01c1\7Z\2\2\u01b4\u01be\7\u008d"+
		"\2\2\u01b5\u01b6\7k\2\2\u01b6\u01bb\5\u008eH\2\u01b7\u01b8\7\7\2\2\u01b8"+
		"\u01ba\5\u008eH\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01b5\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01b2\3\2"+
		"\2\2\u01c0\u01b3\3\2\2\2\u01c0\u01b4\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c6\7m\2\2\u01c3\u01c4\5\u0086D\2\u01c4\u01c5\7\4\2\2\u01c5\u01c7\3"+
		"\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cc\5\u0088E\2\u01c9\u01ca\7K\2\2\u01ca\u01cb\7B\2\2\u01cb\u01cd\7"+
		"\u0080\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2"+
		"\u01ce\u01cf\7\u0093\2\2\u01cf\u01d1\5L\'\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01db\7(\2\2\u01d3\u01d8\5<\37"+
		"\2\u01d4\u01d8\5.\30\2\u01d5\u01d8\5 \21\2\u01d6\u01d8\5:\36\2\u01d7\u01d3"+
		"\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\7\3\2\2\u01da\u01dc\3\2\2\2\u01db\u01d7\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\7D\2\2\u01e0\33\3\2\2\2\u01e1\u01e3\7\64\2"+
		"\2\u01e2\u01e4\t\5\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e9\7\u0091\2\2\u01e6\u01e7\7R\2\2\u01e7\u01e8\7h\2\2"+
		"\u01e8\u01ea\7H\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ee"+
		"\3\2\2\2\u01eb\u01ec\5\u0086D\2\u01ec\u01ed\7\4\2\2\u01ed\u01ef\3\2\2"+
		"\2\u01ee\u01eb\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1"+
		"\5\u0098M\2\u01f1\u01f2\7#\2\2\u01f2\u01f3\5:\36\2\u01f3\35\3\2\2\2\u01f4"+
		"\u01f5\7\64\2\2\u01f5\u01f6\7\u0092\2\2\u01f6\u01fa\7\u0084\2\2\u01f7"+
		"\u01f8\7R\2\2\u01f8\u01f9\7h\2\2\u01f9\u01fb\7H\2\2\u01fa\u01f7\3\2\2"+
		"\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fd\5\u0086D\2\u01fd"+
		"\u01fe\7\4\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5\u0088E\2\u0202\u0203\7\u008e\2"+
		"\2\u0203\u020f\5\u009aN\2\u0204\u0205\7\5\2\2\u0205\u020a\5|?\2\u0206"+
		"\u0207\7\7\2\2\u0207\u0209\5|?\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2"+
		"\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020d\u020e\7\6\2\2\u020e\u0210\3\2\2\2\u020f\u0204\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\37\3\2\2\2\u0211\u0213\5V,\2\u0212\u0211\3\2\2\2"+
		"\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7=\2\2\u0215\u0216"+
		"\7M\2\2\u0216\u0219\5X-\2\u0217\u0218\7\u0094\2\2\u0218\u021a\5L\'\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a!\3\2\2\2\u021b\u021d\5V,\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7="+
		"\2\2\u021f\u0220\7M\2\2\u0220\u0223\5X-\2\u0221\u0222\7\u0094\2\2\u0222"+
		"\u0224\5L\'\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0237\3\2"+
		"\2\2\u0225\u0226\7o\2\2\u0226\u0227\7*\2\2\u0227\u022c\5Z.\2\u0228\u0229"+
		"\7\7\2\2\u0229\u022b\5Z.\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022f\u0225\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\7d\2\2\u0232\u0235\5L\'\2\u0233\u0234\t\4\2\2\u0234\u0236\5L\'"+
		"\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u022f"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238#\3\2\2\2\u0239\u023b\7?\2\2\u023a\u023c"+
		"\79\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\5\u0086D\2\u023e%\3\2\2\2\u023f\u0240\7A\2\2\u0240\u0243\7V\2\2"+
		"\u0241\u0242\7R\2\2\u0242\u0244\7H\2\2\u0243\u0241\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0248\3\2\2\2\u0245\u0246\5\u0086D\2\u0246\u0247\7\4\2"+
		"\2\u0247\u0249\3\2\2\2\u0248\u0245\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\5\u0094K\2\u024b\'\3\2\2\2\u024c\u024d\7A\2\2\u024d"+
		"\u0250\7\u0084\2\2\u024e\u024f\7R\2\2\u024f\u0251\7H\2\2\u0250\u024e\3"+
		"\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\3\2\2\2\u0252\u0253\5\u0086D\2"+
		"\u0253\u0254\7\4\2\2\u0254\u0256\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5\u0088E\2\u0258)\3\2\2\2\u0259"+
		"\u025a\7A\2\2\u025a\u025d\7\u008a\2\2\u025b\u025c\7R\2\2\u025c\u025e\7"+
		"H\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\3\2\2\2\u025f"+
		"\u0260\5\u0086D\2\u0260\u0261\7\4\2\2\u0261\u0263\3\2\2\2\u0262\u025f"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\u0096L"+
		"\2\u0265+\3\2\2\2\u0266\u0267\7A\2\2\u0267\u026a\7\u0091\2\2\u0268\u0269"+
		"\7R\2\2\u0269\u026b\7H\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026f\3\2\2\2\u026c\u026d\5\u0086D\2\u026d\u026e\7\4\2\2\u026e\u0270"+
		"\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\5\u0098M\2\u0272-\3\2\2\2\u0273\u0275\5V,\2\u0274\u0273\3\2\2\2"+
		"\u0274\u0275\3\2\2\2\u0275\u0287\3\2\2\2\u0276\u0288\7Z\2\2\u0277\u0288"+
		"\7|\2\2\u0278\u0279\7Z\2\2\u0279\u027a\7n\2\2\u027a\u0288\7|\2\2\u027b"+
		"\u027c\7Z\2\2\u027c\u027d\7n\2\2\u027d\u0288\7\177\2\2\u027e\u027f\7Z"+
		"\2\2\u027f\u0280\7n\2\2\u0280\u0288\7\33\2\2\u0281\u0282\7Z\2\2\u0282"+
		"\u0283\7n\2\2\u0283\u0288\7J\2\2\u0284\u0285\7Z\2\2\u0285\u0286\7n\2\2"+
		"\u0286\u0288\7S\2\2\u0287\u0276\3\2\2\2\u0287\u0277\3\2\2\2\u0287\u0278"+
		"\3\2\2\2\u0287\u027b\3\2\2\2\u0287\u027e\3\2\2\2\u0287\u0281\3\2\2\2\u0287"+
		"\u0284\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028d\7]\2\2\u028a\u028b\5\u0086"+
		"D\2\u028b\u028c\7\4\2\2\u028c\u028e\3\2\2\2\u028d\u028a\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u029b\5\u0088E\2\u0290\u0291"+
		"\7\5\2\2\u0291\u0296\5\u008eH\2\u0292\u0293\7\7\2\2\u0293\u0295\5\u008e"+
		"H\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7\6"+
		"\2\2\u029a\u029c\3\2\2\2\u029b\u0290\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u02bc\3\2\2\2\u029d\u029e\7\u0090\2\2\u029e\u029f\7\5\2\2\u029f\u02a4"+
		"\5L\'\2\u02a0\u02a1\7\7\2\2\u02a1\u02a3\5L\'\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02b6\7\6\2\2\u02a8\u02a9\7\7\2\2\u02a9"+
		"\u02aa\7\5\2\2\u02aa\u02af\5L\'\2\u02ab\u02ac\7\7\2\2\u02ac\u02ae\5L\'"+
		"\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0"+
		"\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\7\6\2\2\u02b3"+
		"\u02b5\3\2\2\2\u02b4\u02a8\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bd\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9"+
		"\u02bd\5:\36\2\u02ba\u02bb\7:\2\2\u02bb\u02bd\7\u0090\2\2\u02bc\u029d"+
		"\3\2\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd/\3\2\2\2\u02be"+
		"\u02c2\7r\2\2\u02bf\u02c0\5\u0086D\2\u02c0\u02c1\7\4\2\2\u02c1\u02c3\3"+
		"\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02cb\5\u009cO\2\u02c5\u02c6\7\b\2\2\u02c6\u02cc\5\\/\2\u02c7\u02c8\7"+
		"\5\2\2\u02c8\u02c9\5\\/\2\u02c9\u02ca\7\6\2\2\u02ca\u02cc\3\2\2\2\u02cb"+
		"\u02c5\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\61\3\2\2"+
		"\2\u02cd\u02d8\7y\2\2\u02ce\u02d9\5\u0090I\2\u02cf\u02d0\5\u0086D\2\u02d0"+
		"\u02d1\7\4\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d7\5\u0088E\2\u02d5\u02d7\5\u0094K\2"+
		"\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02ce"+
		"\3\2\2\2\u02d8\u02d2\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\63\3\2\2\2\u02da"+
		"\u02dc\7z\2\2\u02db\u02dd\7\u0081\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\5\u009eP\2\u02df\65\3\2\2\2\u02e0"+
		"\u02e5\7\177\2\2\u02e1\u02e3\7\u0089\2\2\u02e2\u02e4\5\u00a2R\2\u02e3"+
		"\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e1\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02ec\3\2\2\2\u02e7\u02e9\7\u0088\2\2\u02e8"+
		"\u02ea\7\u0081\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ed\5\u009eP\2\u02ec\u02e7\3\2\2\2\u02ec\u02ed\3\2\2"+
		"\2\u02ed\67\3\2\2\2\u02ee\u02ef\7\u0081\2\2\u02ef\u02f0\5\u009eP\2\u02f0"+
		"9\3\2\2\2\u02f1\u02f3\7\u0095\2\2\u02f2\u02f4\7v\2\2\u02f3\u02f2\3\2\2"+
		"\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fa\5^\60\2\u02f6\u02f7"+
		"\7\7\2\2\u02f7\u02f9\5^\60\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2"+
		"\2\2\u02fd\u02f1\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0305\5j\66\2\u0300\u0301\5p9\2\u0301\u0302\5j\66\2\u0302\u0304\3\2\2"+
		"\2\u0303\u0300\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0312\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\7o\2\2\u0309"+
		"\u030a\7*\2\2\u030a\u030f\5Z.\2\u030b\u030c\7\7\2\2\u030c\u030e\5Z.\2"+
		"\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0308\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u031a\3\2\2\2\u0314\u0315\7d\2\2\u0315\u0318\5L\'"+
		"\2\u0316\u0317\t\4\2\2\u0317\u0319\5L\'\2\u0318\u0316\3\2\2\2\u0318\u0319"+
		"\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0314\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		";\3\2\2\2\u031c\u031e\5V,\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u032a\7\u008d\2\2\u0320\u0321\7n\2\2\u0321\u032b"+
		"\7\177\2\2\u0322\u0323\7n\2\2\u0323\u032b\7\33\2\2\u0324\u0325\7n\2\2"+
		"\u0325\u032b\7|\2\2\u0326\u0327\7n\2\2\u0327\u032b\7J\2\2\u0328\u0329"+
		"\7n\2\2\u0329\u032b\7S\2\2\u032a\u0320\3\2\2\2\u032a\u0322\3\2\2\2\u032a"+
		"\u0324\3\2\2\2\u032a\u0326\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u032d\5X-\2\u032d\u032e\7\u0083\2\2\u032e"+
		"\u032f\5\u008eH\2\u032f\u0330\7\b\2\2\u0330\u0338\5L\'\2\u0331\u0332\7"+
		"\7\2\2\u0332\u0333\5\u008eH\2\u0333\u0334\7\b\2\2\u0334\u0335\5L\'\2\u0335"+
		"\u0337\3\2\2\2\u0336\u0331\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2"+
		"\2\2\u0338\u0339\3\2\2\2\u0339\u033d\3\2\2\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033c\7\u0094\2\2\u033c\u033e\5L\'\2\u033d\u033b\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e=\3\2\2\2\u033f\u0341\5V,\2\u0340\u033f\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u034d\7\u008d\2\2\u0343\u0344\7n\2"+
		"\2\u0344\u034e\7\177\2\2\u0345\u0346\7n\2\2\u0346\u034e\7\33\2\2\u0347"+
		"\u0348\7n\2\2\u0348\u034e\7|\2\2\u0349\u034a\7n\2\2\u034a\u034e\7J\2\2"+
		"\u034b\u034c\7n\2\2\u034c\u034e\7S\2\2\u034d\u0343\3\2\2\2\u034d\u0345"+
		"\3\2\2\2\u034d\u0347\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034b\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\5X-\2\u0350\u0351\7\u0083"+
		"\2\2\u0351\u0352\5\u008eH\2\u0352\u0353\7\b\2\2\u0353\u035b\5L\'\2\u0354"+
		"\u0355\7\7\2\2\u0355\u0356\5\u008eH\2\u0356\u0357\7\b\2\2\u0357\u0358"+
		"\5L\'\2\u0358\u035a\3\2\2\2\u0359\u0354\3\2\2\2\u035a\u035d\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0360\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035e\u035f\7\u0094\2\2\u035f\u0361\5L\'\2\u0360\u035e\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0374\3\2\2\2\u0362\u0363\7o\2\2\u0363\u0364\7*\2"+
		"\2\u0364\u0369\5Z.\2\u0365\u0366\7\7\2\2\u0366\u0368\5Z.\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0362\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u036e\3\2\2\2\u036e\u036f\7d\2\2\u036f\u0372\5L\'\2\u0370\u0371"+
		"\t\4\2\2\u0371\u0373\5L\'\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0375\3\2\2\2\u0374\u036c\3\2\2\2\u0374\u0375\3\2\2\2\u0375?\3\2\2\2"+
		"\u0376\u0377\7\u008f\2\2\u0377A\3\2\2\2\u0378\u037a\5\u008eH\2\u0379\u037b"+
		"\5D#\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037f\3\2\2\2\u037c"+
		"\u037e\5F$\2\u037d\u037c\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2"+
		"\2\u037f\u0380\3\2\2\2\u0380C\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0384"+
		"\5\u0082B\2\u0383\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0383\3\2\2"+
		"\2\u0385\u0386\3\2\2\2\u0386\u0391\3\2\2\2\u0387\u0388\7\5\2\2\u0388\u0389"+
		"\5t;\2\u0389\u038a\7\6\2\2\u038a\u0392\3\2\2\2\u038b\u038c\7\5\2\2\u038c"+
		"\u038d\5t;\2\u038d\u038e\7\7\2\2\u038e\u038f\5t;\2\u038f\u0390\7\6\2\2"+
		"\u0390\u0392\3\2\2\2\u0391\u0387\3\2\2\2\u0391\u038b\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392E\3\2\2\2\u0393\u0394\7\63\2\2\u0394\u0396\5\u0082B\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u03b8\3\2\2\2\u0397\u0398\7s"+
		"\2\2\u0398\u039a\7a\2\2\u0399\u039b\t\6\2\2\u039a\u0399\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\5H%\2\u039d\u039f\7&\2"+
		"\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03b9\3\2\2\2\u03a0\u03a2"+
		"\7h\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a4\7j\2\2\u03a4\u03b9\5H%\2\u03a5\u03a6\7\u008c\2\2\u03a6\u03b9\5"+
		"H%\2\u03a7\u03a8\7.\2\2\u03a8\u03a9\7\5\2\2\u03a9\u03aa\5L\'\2\u03aa\u03ab"+
		"\7\6\2\2\u03ab\u03b9\3\2\2\2\u03ac\u03b3\7:\2\2\u03ad\u03b4\5t;\2\u03ae"+
		"\u03b4\5v<\2\u03af\u03b0\7\5\2\2\u03b0\u03b1\5L\'\2\u03b1\u03b2\7\6\2"+
		"\2\u03b2\u03b4\3\2\2\2\u03b3\u03ad\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b3\u03af"+
		"\3\2\2\2\u03b4\u03b9\3\2\2\2\u03b5\u03b6\7/\2\2\u03b6\u03b9\5\u0090I\2"+
		"\u03b7\u03b9\5N(\2\u03b8\u0397\3\2\2\2\u03b8\u03a1\3\2\2\2\u03b8\u03a5"+
		"\3\2\2\2\u03b8\u03a7\3\2\2\2\u03b8\u03ac\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b8"+
		"\u03b7\3\2\2\2\u03b9G\3\2\2\2\u03ba\u03bb\7m\2\2\u03bb\u03bc\7\62\2\2"+
		"\u03bc\u03be\t\7\2\2\u03bd\u03ba\3\2\2\2\u03bd\u03be\3\2\2\2\u03beI\3"+
		"\2\2\2\u03bf\u03d1\7\b\2\2\u03c0\u03d1\7\30\2\2\u03c1\u03d1\7\31\2\2\u03c2"+
		"\u03d1\7\32\2\2\u03c3\u03d1\7\r\2\2\u03c4\u03d1\7\24\2\2\u03c5\u03d1\7"+
		"\25\2\2\u03c6\u03d1\7\26\2\2\u03c7\u03d1\7\27\2\2\u03c8\u03d1\7^\2\2\u03c9"+
		"\u03ca\7^\2\2\u03ca\u03d1\7h\2\2\u03cb\u03d1\7U\2\2\u03cc\u03d1\7c\2\2"+
		"\u03cd\u03d1\7O\2\2\u03ce\u03d1\7e\2\2\u03cf\u03d1\7x\2\2\u03d0\u03bf"+
		"\3\2\2\2\u03d0\u03c0\3\2\2\2\u03d0\u03c1\3\2\2\2\u03d0\u03c2\3\2\2\2\u03d0"+
		"\u03c3\3\2\2\2\u03d0\u03c4\3\2\2\2\u03d0\u03c5\3\2\2\2\u03d0\u03c6\3\2"+
		"\2\2\u03d0\u03c7\3\2\2\2\u03d0\u03c8\3\2\2\2\u03d0\u03c9\3\2\2\2\u03d0"+
		"\u03cb\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d0\u03cd\3\2\2\2\u03d0\u03ce\3\2"+
		"\2\2\u03d0\u03cf\3\2\2\2\u03d1K\3\2\2\2\u03d2\u03d3\b\'\1\2\u03d3\u03d4"+
		"\5x=\2\u03d4\u03d5\5L\'\25\u03d5\u041f\3\2\2\2\u03d6\u041f\5v<\2\u03d7"+
		"\u041f\7\u0099\2\2\u03d8\u03d9\5\u0086D\2\u03d9\u03da\7\4\2\2\u03da\u03dc"+
		"\3\2\2\2\u03db\u03d8\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03de\5\u0088E\2\u03de\u03df\7\4\2\2\u03df\u03e1\3\2\2\2\u03e0\u03db"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u041f\5\u008eH"+
		"\2\u03e3\u03e4\5\u0084C\2\u03e4\u03f1\7\5\2\2\u03e5\u03e7\7@\2\2\u03e6"+
		"\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ed\5L"+
		"\'\2\u03e9\u03ea\7\7\2\2\u03ea\u03ec\5L\'\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f2\3\2"+
		"\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f2\7\t\2\2\u03f1\u03e6\3\2\2\2\u03f1"+
		"\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\7\6"+
		"\2\2\u03f4\u041f\3\2\2\2\u03f5\u03f6\7\5\2\2\u03f6\u03f7\5L\'\2\u03f7"+
		"\u03f8\7\6\2\2\u03f8\u041f\3\2\2\2\u03f9\u03fa\7-\2\2\u03fa\u03fb\7\5"+
		"\2\2\u03fb\u03fc\5L\'\2\u03fc\u03fd\7#\2\2\u03fd\u03fe\5D#\2\u03fe\u03ff"+
		"\7\6\2\2\u03ff\u041f\3\2\2\2\u0400\u0402\7h\2\2\u0401\u0400\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\7H\2\2\u0404\u0401\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\7\5\2\2\u0407"+
		"\u0408\5:\36\2\u0408\u0409\7\6\2\2\u0409\u041f\3\2\2\2\u040a\u040c\7,"+
		"\2\2\u040b\u040d\5L\'\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u0413\3\2\2\2\u040e\u040f\7\u0093\2\2\u040f\u0410\5L\'\2\u0410\u0411"+
		"\7\u0087\2\2\u0411\u0412\5L\'\2\u0412\u0414\3\2\2\2\u0413\u040e\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0419"+
		"\3\2\2\2\u0417\u0418\7C\2\2\u0418\u041a\5L\'\2\u0419\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\7D\2\2\u041c\u041f\3\2"+
		"\2\2\u041d\u041f\5P)\2\u041e\u03d2\3\2\2\2\u041e\u03d6\3\2\2\2\u041e\u03d7"+
		"\3\2\2\2\u041e\u03e0\3\2\2\2\u041e\u03e3\3\2\2\2\u041e\u03f5\3\2\2\2\u041e"+
		"\u03f9\3\2\2\2\u041e\u0404\3\2\2\2\u041e\u040a\3\2\2\2\u041e\u041d\3\2"+
		"\2\2\u041f\u0472\3\2\2\2\u0420\u0421\f\24\2\2\u0421\u0422\t\b\2\2\u0422"+
		"\u0471\5L\'\25\u0423\u0424\f\23\2\2\u0424\u0425\t\t\2\2\u0425\u0471\5"+
		"L\'\24\u0426\u0427\f\22\2\2\u0427\u0428\t\n\2\2\u0428\u0471\5L\'\23\u0429"+
		"\u042a\f\21\2\2\u042a\u042b\5J&\2\u042b\u042c\5L\'\22\u042c\u0471\3\2"+
		"\2\2\u042d\u042e\f\20\2\2\u042e\u042f\7\"\2\2\u042f\u0471\5L\'\21\u0430"+
		"\u0431\f\17\2\2\u0431\u0432\7n\2\2\u0432\u0471\5L\'\20\u0433\u0434\f\b"+
		"\2\2\u0434\u0436\7^\2\2\u0435\u0437\7h\2\2\u0436\u0435\3\2\2\2\u0436\u0437"+
		"\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0471\5L\'\t\u0439\u043b\f\7\2\2\u043a"+
		"\u043c\7h\2\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043e\7)\2\2\u043e\u043f\5L\'\2\u043f\u0440\7\"\2\2\u0440\u0441"+
		"\5L\'\b\u0441\u0471\3\2\2\2\u0442\u0443\f\13\2\2\u0443\u0444\7/\2\2\u0444"+
		"\u0471\5\u0090I\2\u0445\u0447\f\n\2\2\u0446\u0448\7h\2\2\u0447\u0446\3"+
		"\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\t\13\2\2\u044a"+
		"\u044d\5L\'\2\u044b\u044c\7E\2\2\u044c\u044e\5L\'\2\u044d\u044b\3\2\2"+
		"\2\u044d\u044e\3\2\2\2\u044e\u0471\3\2\2\2\u044f\u0454\f\t\2\2\u0450\u0455"+
		"\7_\2\2\u0451\u0455\7i\2\2\u0452\u0453\7h\2\2\u0453\u0455\7j\2\2\u0454"+
		"\u0450\3\2\2\2\u0454\u0451\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0471\3\2"+
		"\2\2\u0456\u0458\f\6\2\2\u0457\u0459\7h\2\2\u0458\u0457\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u046e\7U\2\2\u045b\u0465\7\5"+
		"\2\2\u045c\u0466\5:\36\2\u045d\u0462\5L\'\2\u045e\u045f\7\7\2\2\u045f"+
		"\u0461\5L\'\2\u0460\u045e\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2"+
		"\2\2\u0462\u0463\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0465"+
		"\u045c\3\2\2\2\u0465\u045d\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2"+
		"\2\2\u0467\u046f\7\6\2\2\u0468\u0469\5\u0086D\2\u0469\u046a\7\4\2\2\u046a"+
		"\u046c\3\2\2\2\u046b\u0468\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u046f\5\u0088E\2\u046e\u045b\3\2\2\2\u046e\u046b\3\2\2\2\u046f"+
		"\u0471\3\2\2\2\u0470\u0420\3\2\2\2\u0470\u0423\3\2\2\2\u0470\u0426\3\2"+
		"\2\2\u0470\u0429\3\2\2\2\u0470\u042d\3\2\2\2\u0470\u0430\3\2\2\2\u0470"+
		"\u0433\3\2\2\2\u0470\u0439\3\2\2\2\u0470\u0442\3\2\2\2\u0470\u0445\3\2"+
		"\2\2\u0470\u044f\3\2\2\2\u0470\u0456\3\2\2\2\u0471\u0474\3\2\2\2\u0472"+
		"\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473M\3\2\2\2\u0474\u0472\3\2\2\2"+
		"\u0475\u0476\7w\2\2\u0476\u0482\5\u0092J\2\u0477\u0478\7\5\2\2\u0478\u047d"+
		"\5\u008eH\2\u0479\u047a\7\7\2\2\u047a\u047c\5\u008eH\2\u047b\u0479\3\2"+
		"\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0480\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0481\7\6\2\2\u0481\u0483\3\2"+
		"\2\2\u0482\u0477\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0496\3\2\2\2\u0484"+
		"\u0485\7m\2\2\u0485\u048e\t\f\2\2\u0486\u0487\7\u0083\2\2\u0487\u048f"+
		"\7j\2\2\u0488\u0489\7\u0083\2\2\u0489\u048f\7:\2\2\u048a\u048f\7+\2\2"+
		"\u048b\u048f\7}\2\2\u048c\u048d\7g\2\2\u048d\u048f\7\34\2\2\u048e\u0486"+
		"\3\2\2\2\u048e\u0488\3\2\2\2\u048e\u048a\3\2\2\2\u048e\u048b\3\2\2\2\u048e"+
		"\u048c\3\2\2\2\u048f\u0493\3\2\2\2\u0490\u0491\7e\2\2\u0491\u0493\5\u0082"+
		"B\2\u0492\u0484\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0495\3\2\2\2\u0494"+
		"\u0492\3\2\2\2\u0495\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2"+
		"\2\2\u0497\u04a3\3\2\2\2\u0498\u0496\3\2\2\2\u0499\u049b\7h\2\2\u049a"+
		"\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a1\7;"+
		"\2\2\u049d\u049e\7X\2\2\u049e\u04a2\7<\2\2\u049f\u04a0\7X\2\2\u04a0\u04a2"+
		"\7T\2\2\u04a1\u049d\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a4\3\2\2\2\u04a3\u049a\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4O\3\2\2\2"+
		"\u04a5\u04a6\7u\2\2\u04a6\u04ab\7\5\2\2\u04a7\u04ac\7S\2\2\u04a8\u04a9"+
		"\t\r\2\2\u04a9\u04aa\7\7\2\2\u04aa\u04ac\5z>\2\u04ab\u04a7\3\2\2\2\u04ab"+
		"\u04a8\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\7\6\2\2\u04aeQ\3\2\2\2"+
		"\u04af\u04b2\5\u008eH\2\u04b0\u04b1\7/\2\2\u04b1\u04b3\5\u0090I\2\u04b2"+
		"\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b6\t\6"+
		"\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6S\3\2\2\2\u04b7\u04b8"+
		"\7\63\2\2\u04b8\u04ba\5\u0082B\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2"+
		"\2\u04ba\u04df\3\2\2\2\u04bb\u04bc\7s\2\2\u04bc\u04bf\7a\2\2\u04bd\u04bf"+
		"\7\u008c\2\2\u04be\u04bb\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2\2"+
		"\2\u04c0\u04c1\7\5\2\2\u04c1\u04c6\5R*\2\u04c2\u04c3\7\7\2\2\u04c3\u04c5"+
		"\5R*\2\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\7\6"+
		"\2\2\u04ca\u04cb\5H%\2\u04cb\u04e0\3\2\2\2\u04cc\u04cd\7.\2\2\u04cd\u04ce"+
		"\7\5\2\2\u04ce\u04cf\5L\'\2\u04cf\u04d0\7\6\2\2\u04d0\u04e0\3\2\2\2\u04d1"+
		"\u04d2\7L\2\2\u04d2\u04d3\7a\2\2\u04d3\u04d4\7\5\2\2\u04d4\u04d9\5\u008e"+
		"H\2\u04d5\u04d6\7\7\2\2\u04d6\u04d8\5\u008eH\2\u04d7\u04d5\3\2\2\2\u04d8"+
		"\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dc\3\2"+
		"\2\2\u04db\u04d9\3\2\2\2\u04dc\u04dd\7\6\2\2\u04dd\u04de\5N(\2\u04de\u04e0"+
		"\3\2\2\2\u04df\u04be\3\2\2\2\u04df\u04cc\3\2\2\2\u04df\u04d1\3\2\2\2\u04e0"+
		"U\3\2\2\2\u04e1\u04e3\7\u0095\2\2\u04e2\u04e4\7v\2\2\u04e3\u04e2\3\2\2"+
		"\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5r:\2\u04e6\u04e7"+
		"\7#\2\2\u04e7\u04e8\7\5\2\2\u04e8\u04e9\5:\36\2\u04e9\u04f3\7\6\2\2\u04ea"+
		"\u04eb\7\7\2\2\u04eb\u04ec\5r:\2\u04ec\u04ed\7#\2\2\u04ed\u04ee\7\5\2"+
		"\2\u04ee\u04ef\5:\36\2\u04ef\u04f0\7\6\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ea"+
		"\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"W\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6\u04f7\5\u0086D\2\u04f7\u04f8\7\4\2"+
		"\2\u04f8\u04fa\3\2\2\2\u04f9\u04f6\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb"+
		"\3\2\2\2\u04fb\u0501\5\u0088E\2\u04fc\u04fd\7W\2\2\u04fd\u04fe\7*\2\2"+
		"\u04fe\u0502\5\u0094K\2\u04ff\u0500\7h\2\2\u0500\u0502\7W\2\2\u0501\u04fc"+
		"\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502Y\3\2\2\2\u0503"+
		"\u0506\5L\'\2\u0504\u0505\7/\2\2\u0505\u0507\5\u0090I\2\u0506\u0504\3"+
		"\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u050a\t\6\2\2\u0509"+
		"\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a[\3\2\2\2\u050b\u050f\5t;\2\u050c"+
		"\u050f\5\u0082B\2\u050d\u050f\7\u009a\2\2\u050e\u050b\3\2\2\2\u050e\u050c"+
		"\3\2\2\2\u050e\u050d\3\2\2\2\u050f]\3\2\2\2\u0510\u051c\5\u0088E\2\u0511"+
		"\u0512\7\5\2\2\u0512\u0517\5\u008eH\2\u0513\u0514\7\7\2\2\u0514\u0516"+
		"\5\u008eH\2\u0515\u0513\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2"+
		"\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051b"+
		"\7\6\2\2\u051b\u051d\3\2\2\2\u051c\u0511\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051e\3\2\2\2\u051e\u051f\7#\2\2\u051f\u0520\7\5\2\2\u0520\u0521\5:\36"+
		"\2\u0521\u0522\7\6\2\2\u0522_\3\2\2\2\u0523\u0530\7\t\2\2\u0524\u0525"+
		"\5\u0088E\2\u0525\u0526\7\4\2\2\u0526\u0527\7\t\2\2\u0527\u0530\3\2\2"+
		"\2\u0528\u052d\5L\'\2\u0529\u052b\7#\2\2\u052a\u0529\3\2\2\2\u052a\u052b"+
		"\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\5~@\2\u052d\u052a\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u0523\3\2\2\2\u052f\u0524\3\2"+
		"\2\2\u052f\u0528\3\2\2\2\u0530a\3\2\2\2\u0531\u0532\5\u0086D\2\u0532\u0533"+
		"\7\4\2\2\u0533\u0535\3\2\2\2\u0534\u0531\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u053b\5\u0088E\2\u0537\u0539\7#\2\2\u0538\u0537\3"+
		"\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\5\u00a0Q\2"+
		"\u053b\u0538\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0542\3\2\2\2\u053d\u053e"+
		"\7W\2\2\u053e\u053f\7*\2\2\u053f\u0543\5\u0094K\2\u0540\u0541\7h\2\2\u0541"+
		"\u0543\7W\2\2\u0542\u053d\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2"+
		"\2\2\u0543\u0561\3\2\2\2\u0544\u054e\7\5\2\2\u0545\u054a\5b\62\2\u0546"+
		"\u0547\7\7\2\2\u0547\u0549\5b\62\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054f\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u054f\5d\63\2\u054e\u0545\3\2\2\2\u054e\u054d\3\2"+
		"\2\2\u054f\u0550\3\2\2\2\u0550\u0555\7\6\2\2\u0551\u0553\7#\2\2\u0552"+
		"\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0556\5\u00a0"+
		"Q\2\u0555\u0552\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0561\3\2\2\2\u0557"+
		"\u0558\7\5\2\2\u0558\u0559\5:\36\2\u0559\u055e\7\6\2\2\u055a\u055c\7#"+
		"\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u055f\5\u00a0Q\2\u055e\u055b\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561"+
		"\3\2\2\2\u0560\u0534\3\2\2\2\u0560\u0544\3\2\2\2\u0560\u0557\3\2\2\2\u0561"+
		"c\3\2\2\2\u0562\u0569\5b\62\2\u0563\u0564\5f\64\2\u0564\u0565\5b\62\2"+
		"\u0565\u0566\5h\65\2\u0566\u0568\3\2\2\2\u0567\u0563\3\2\2\2\u0568\u056b"+
		"\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056ae\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056c\u057a\7\7\2\2\u056d\u056f\7f\2\2\u056e\u056d\3\2"+
		"\2\2\u056e\u056f\3\2\2\2\u056f\u0576\3\2\2\2\u0570\u0572\7b\2\2\u0571"+
		"\u0573\7p\2\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0577\3\2"+
		"\2\2\u0574\u0577\7Y\2\2\u0575\u0577\7\65\2\2\u0576\u0570\3\2\2\2\u0576"+
		"\u0574\3\2\2\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2"+
		"\2\2\u0578\u057a\7`\2\2\u0579\u056c\3\2\2\2\u0579\u056e\3\2\2\2\u057a"+
		"g\3\2\2\2\u057b\u057c\7m\2\2\u057c\u058a\5L\'\2\u057d\u057e\7\u008e\2"+
		"\2\u057e\u057f\7\5\2\2\u057f\u0584\5\u008eH\2\u0580\u0581\7\7\2\2\u0581"+
		"\u0583\5\u008eH\2\u0582\u0580\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582"+
		"\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587"+
		"\u0588\7\6\2\2\u0588\u058a\3\2\2\2\u0589\u057b\3\2\2\2\u0589\u057d\3\2"+
		"\2\2\u0589\u058a\3\2\2\2\u058ai\3\2\2\2\u058b\u058d\7\u0082\2\2\u058c"+
		"\u058e\t\16\2\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3"+
		"\2\2\2\u058f\u059c\5l\67\2\u0590\u059a\7M\2\2\u0591\u0596\5b\62\2\u0592"+
		"\u0593\7\7\2\2\u0593\u0595\5b\62\2\u0594\u0592\3\2\2\2\u0595\u0598\3\2"+
		"\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059b\3\2\2\2\u0598"+
		"\u0596\3\2\2\2\u0599\u059b\5d\63\2\u059a\u0591\3\2\2\2\u059a\u0599\3\2"+
		"\2\2\u059b\u059d\3\2\2\2\u059c\u0590\3\2\2\2\u059c\u059d\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u05ad\5n8\2\u059f\u05a0\7P\2\2\u05a0\u05a1\7*\2\2"+
		"\u05a1\u05a6\5L\'\2\u05a2\u05a3\7\7\2\2\u05a3\u05a5\5L\'\2\u05a4\u05a2"+
		"\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"\u05ab\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9\u05aa\7Q\2\2\u05aa\u05ac\5L\'"+
		"\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u059f"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05cc\3\2\2\2\u05af\u05b0\7\u0090\2"+
		"\2\u05b0\u05b1\7\5\2\2\u05b1\u05b6\5L\'\2\u05b2\u05b3\7\7\2\2\u05b3\u05b5"+
		"\5L\'\2\u05b4\u05b2\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6"+
		"\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05c8\7\6"+
		"\2\2\u05ba\u05bb\7\7\2\2\u05bb\u05bc\7\5\2\2\u05bc\u05c1\5L\'\2\u05bd"+
		"\u05be\7\7\2\2\u05be\u05c0\5L\'\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2"+
		"\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3"+
		"\u05c1\3\2\2\2\u05c4\u05c5\7\6\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05ba\3\2"+
		"\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9"+
		"\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u058b\3\2\2\2\u05cb\u05af\3\2"+
		"\2\2\u05cck\3\2\2\2\u05cd\u05d2\5`\61\2\u05ce\u05cf\7\7\2\2\u05cf\u05d1"+
		"\5`\61\2\u05d0\u05ce\3\2\2\2\u05d1\u05d4\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3m\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5\u05d6\7\u0094"+
		"\2\2\u05d6\u05d8\5L\'\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"o\3\2\2\2\u05d9\u05df\7\u008b\2\2\u05da\u05db\7\u008b\2\2\u05db\u05df"+
		"\7\37\2\2\u05dc\u05df\7\\\2\2\u05dd\u05df\7F\2\2\u05de\u05d9\3\2\2\2\u05de"+
		"\u05da\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05dd\3\2\2\2\u05dfq\3\2\2\2"+
		"\u05e0\u05ec\5\u0088E\2\u05e1\u05e2\7\5\2\2\u05e2\u05e7\5\u008eH\2\u05e3"+
		"\u05e4\7\7\2\2\u05e4\u05e6\5\u008eH\2\u05e5\u05e3\3\2\2\2\u05e6\u05e9"+
		"\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9"+
		"\u05e7\3\2\2\2\u05ea\u05eb\7\6\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05e1\3\2"+
		"\2\2\u05ec\u05ed\3\2\2\2\u05eds\3\2\2\2\u05ee\u05f0\t\t\2\2\u05ef\u05ee"+
		"\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\7\u0098\2"+
		"\2\u05f2u\3\2\2\2\u05f3\u05f4\t\17\2\2\u05f4w\3\2\2\2\u05f5\u05f6\t\20"+
		"\2\2\u05f6y\3\2\2\2\u05f7\u05f8\7\u009a\2\2\u05f8{\3\2\2\2\u05f9\u05fc"+
		"\5L\'\2\u05fa\u05fc\5B\"\2\u05fb\u05f9\3\2\2\2\u05fb\u05fa\3\2\2\2\u05fc"+
		"}\3\2\2\2\u05fd\u05fe\t\21\2\2\u05fe\177\3\2\2\2\u05ff\u0600\t\22\2\2"+
		"\u0600\u0081\3\2\2\2\u0601\u0602\5\u00a4S\2\u0602\u0083\3\2\2\2\u0603"+
		"\u0604\5\u00a4S\2\u0604\u0085\3\2\2\2\u0605\u0606\5\u00a4S\2\u0606\u0087"+
		"\3\2\2\2\u0607\u0608\5\u00a4S\2\u0608\u0089\3\2\2\2\u0609\u060a\5\u00a4"+
		"S\2\u060a\u008b\3\2\2\2\u060b\u060c\5\u00a4S\2\u060c\u008d\3\2\2\2\u060d"+
		"\u060e\5\u00a4S\2\u060e\u008f\3\2\2\2\u060f\u0610\5\u00a4S\2\u0610\u0091"+
		"\3\2\2\2\u0611\u0612\5\u00a4S\2\u0612\u0093\3\2\2\2\u0613\u0614\5\u00a4"+
		"S\2\u0614\u0095\3\2\2\2\u0615\u0616\5\u00a4S\2\u0616\u0097\3\2\2\2\u0617"+
		"\u0618\5\u00a4S\2\u0618\u0099\3\2\2\2\u0619\u061a\5\u00a4S\2\u061a\u009b"+
		"\3\2\2\2\u061b\u061c\5\u00a4S\2\u061c\u009d\3\2\2\2\u061d\u061e\5\u00a4"+
		"S\2\u061e\u009f\3\2\2\2\u061f\u0620\5\u00a4S\2\u0620\u00a1\3\2\2\2\u0621"+
		"\u0622\5\u00a4S\2\u0622\u00a3\3\2\2\2\u0623\u062b\7\u0097\2\2\u0624\u062b"+
		"\5\u0080A\2\u0625\u062b\7\u009a\2\2\u0626\u0627\7\5\2\2\u0627\u0628\5"+
		"\u00a4S\2\u0628\u0629\7\6\2\2\u0629\u062b\3\2\2\2\u062a\u0623\3\2\2\2"+
		"\u062a\u0624\3\2\2\2\u062a\u0625\3\2\2\2\u062a\u0626\3\2\2\2\u062b\u00a5"+
		"\3\2\2\2\u00da\u00a8\u00aa\u00b5\u00bc\u00c1\u00c7\u00cd\u00cf\u00ed\u00f4"+
		"\u00fc\u00ff\u0108\u010c\u0114\u0118\u011a\u011f\u0121\u0125\u012c\u012f"+
		"\u0134\u0138\u013d\u0146\u0149\u014f\u0151\u0155\u015b\u0160\u016b\u0171"+
		"\u0175\u017b\u0180\u0189\u0190\u0196\u019a\u019e\u01a4\u01a9\u01b0\u01bb"+
		"\u01be\u01c0\u01c6\u01cc\u01d0\u01d7\u01dd\u01e3\u01e9\u01ee\u01fa\u01ff"+
		"\u020a\u020f\u0212\u0219\u021c\u0223\u022c\u022f\u0235\u0237\u023b\u0243"+
		"\u0248\u0250\u0255\u025d\u0262\u026a\u026f\u0274\u0287\u028d\u0296\u029b"+
		"\u02a4\u02af\u02b6\u02bc\u02c2\u02cb\u02d2\u02d6\u02d8\u02dc\u02e3\u02e5"+
		"\u02e9\u02ec\u02f3\u02fa\u02fd\u0305\u030f\u0312\u0318\u031a\u031d\u032a"+
		"\u0338\u033d\u0340\u034d\u035b\u0360\u0369\u036c\u0372\u0374\u037a\u037f"+
		"\u0385\u0391\u0395\u039a\u039e\u03a1\u03b3\u03b8\u03bd\u03d0\u03db\u03e0"+
		"\u03e6\u03ed\u03f1\u0401\u0404\u040c\u0415\u0419\u041e\u0436\u043b\u0447"+
		"\u044d\u0454\u0458\u0462\u0465\u046b\u046e\u0470\u0472\u047d\u0482\u048e"+
		"\u0492\u0496\u049a\u04a1\u04a3\u04ab\u04b2\u04b5\u04b9\u04be\u04c6\u04d9"+
		"\u04df\u04e3\u04f3\u04f9\u0501\u0506\u0509\u050e\u0517\u051c\u052a\u052d"+
		"\u052f\u0534\u0538\u053b\u0542\u054a\u054e\u0552\u0555\u055b\u055e\u0560"+
		"\u0569\u056e\u0572\u0576\u0579\u0584\u0589\u058d\u0596\u059a\u059c\u05a6"+
		"\u05ab\u05ad\u05b6\u05c1\u05c8\u05cb\u05d2\u05d7\u05de\u05e7\u05ec\u05ef"+
		"\u05fb\u062a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}