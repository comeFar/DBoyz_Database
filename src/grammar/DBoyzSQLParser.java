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
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_foreign_key_clause = 40, 
		RULE_raise_function = 41, RULE_indexed_column = 42, RULE_table_constraint = 43, 
		RULE_with_clause = 44, RULE_qualified_table_name = 45, RULE_ordering_term = 46, 
		RULE_pragma_value = 47, RULE_common_table_expression = 48, RULE_result_column = 49, 
		RULE_table_or_subquery = 50, RULE_join_clause = 51, RULE_join_operator = 52, 
		RULE_join_constraint = 53, RULE_select_core = 54, RULE_projection_clause = 55, 
		RULE_where_clause = 56, RULE_compound_operator = 57, RULE_cte_table_name = 58, 
		RULE_signed_number = 59, RULE_literal_value = 60, RULE_unary_operator = 61, 
		RULE_binary_operator = 62, RULE_error_message = 63, RULE_module_argument = 64, 
		RULE_column_alias = 65, RULE_keyword = 66, RULE_name = 67, RULE_function_name = 68, 
		RULE_database_name = 69, RULE_table_name = 70, RULE_table_or_index_name = 71, 
		RULE_new_table_name = 72, RULE_column_name = 73, RULE_collation_name = 74, 
		RULE_foreign_table = 75, RULE_index_name = 76, RULE_trigger_name = 77, 
		RULE_view_name = 78, RULE_module_name = 79, RULE_pragma_name = 80, RULE_savepoint_name = 81, 
		RULE_table_alias = 82, RULE_transaction_name = 83, RULE_any_name = 84;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "projection_clause", "where_clause", 
		"compound_operator", "cte_table_name", "signed_number", "literal_value", 
		"unary_operator", "binary_operator", "error_message", "module_argument", 
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_UPDATE - 139)) | (1L << (K_VACUUM - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
				{
				setState(172);
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
					setState(170);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(171);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(179);
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
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(182);
				match(SCOL);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			sql_stmt();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(189);
						match(SCOL);
						}
						}
						setState(192); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(194);
					sql_stmt();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(SCOL);
					}
					} 
				}
				setState(205);
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
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
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
			setState(211);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(206);
				match(K_EXPLAIN);
				setState(209);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(207);
					match(K_QUERY);
					setState(208);
					match(K_PLAN);
					}
				}

				}
			}

			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(213);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(214);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(215);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(216);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(217);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(218);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(219);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(220);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(221);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(222);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(223);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(224);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(225);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(226);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(227);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(228);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(229);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(230);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(231);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(232);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(233);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(234);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(235);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(236);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(237);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(238);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(239);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(240);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(241);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(242);
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
			setState(245);
			match(K_ALTER);
			setState(246);
			match(K_TABLE);
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(247);
				database_name();
				setState(248);
				match(DOT);
				}
				break;
			}
			setState(252);
			table_name();
			setState(261);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(253);
				match(K_RENAME);
				setState(254);
				match(K_TO);
				setState(255);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(256);
				match(K_ADD);
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(257);
					match(K_COLUMN);
					}
					break;
				}
				setState(260);
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
			setState(263);
			match(K_ANALYZE);
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(264);
				database_name();
				}
				break;
			case 2:
				{
				setState(265);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(266);
				database_name();
				setState(267);
				match(DOT);
				setState(268);
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
			setState(272);
			match(K_ATTACH);
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(273);
				match(K_DATABASE);
				}
				break;
			}
			setState(276);
			expr(0);
			setState(277);
			match(K_AS);
			setState(278);
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
			setState(280);
			match(K_BEGIN);
			setState(282);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(288);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(284);
				match(K_TRANSACTION);
				setState(286);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(285);
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
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(295);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(291);
				match(K_TRANSACTION);
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(292);
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
			setState(309);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(297);
				match(K_WITH);
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(298);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(301);
				common_table_expression();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					common_table_expression();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311);
			select_core();
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(312);
					match(K_UNION);
					setState(314);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(313);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(316);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(317);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320);
				select_core();
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(335);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(325);
				match(K_ORDER);
				setState(326);
				match(K_BY);
				setState(327);
				ordering_term();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					ordering_term();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(337);
				match(K_LIMIT);
				setState(338);
				expr(0);
				setState(341);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(339);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(340);
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
			setState(345);
			match(K_CREATE);
			setState(347);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(346);
				match(K_UNIQUE);
				}
			}

			setState(349);
			match(K_INDEX);
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(350);
				match(K_IF);
				setState(351);
				match(K_NOT);
				setState(352);
				match(K_EXISTS);
				}
				break;
			}
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(355);
				database_name();
				setState(356);
				match(DOT);
				}
				break;
			}
			setState(360);
			index_name();
			setState(361);
			match(K_ON);
			setState(362);
			table_name();
			setState(363);
			match(OPEN_PAR);
			setState(364);
			indexed_column();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				indexed_column();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CLOSE_PAR);
			setState(375);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(373);
				match(K_WHERE);
				setState(374);
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
			setState(377);
			match(K_CREATE);
			setState(379);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(381);
			match(K_TABLE);
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(382);
				match(K_IF);
				setState(383);
				match(K_NOT);
				setState(384);
				match(K_EXISTS);
				}
				break;
			}
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(387);
				database_name();
				setState(388);
				match(DOT);
				}
				break;
			}
			setState(392);
			table_name();
			setState(416);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(393);
				match(OPEN_PAR);
				setState(394);
				column_def();
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(395);
						match(COMMA);
						setState(396);
						column_def();
						}
						} 
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					table_constraint();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				match(CLOSE_PAR);
				setState(412);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(410);
					match(K_WITHOUT);
					setState(411);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(414);
				match(K_AS);
				setState(415);
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
			setState(418);
			match(K_CREATE);
			setState(420);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(422);
			match(K_TRIGGER);
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(423);
				match(K_IF);
				setState(424);
				match(K_NOT);
				setState(425);
				match(K_EXISTS);
				}
				break;
			}
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(428);
				database_name();
				setState(429);
				match(DOT);
				}
				break;
			}
			setState(433);
			trigger_name();
			setState(438);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(434);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(435);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(436);
				match(K_INSTEAD);
				setState(437);
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
			setState(454);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(440);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(441);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(442);
				match(K_UPDATE);
				setState(452);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(443);
					match(K_OF);
					setState(444);
					column_name();
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(445);
						match(COMMA);
						setState(446);
						column_name();
						}
						}
						setState(451);
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
			setState(456);
			match(K_ON);
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(457);
				database_name();
				setState(458);
				match(DOT);
				}
				break;
			}
			setState(462);
			table_name();
			setState(466);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(463);
				match(K_FOR);
				setState(464);
				match(K_EACH);
				setState(465);
				match(K_ROW);
				}
			}

			setState(470);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(468);
				match(K_WHEN);
				setState(469);
				expr(0);
				}
			}

			setState(472);
			match(K_BEGIN);
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(477);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(473);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(474);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(475);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(476);
					select_stmt();
					}
					break;
				}
				setState(479);
				match(SCOL);
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(485);
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
			setState(487);
			match(K_CREATE);
			setState(489);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(491);
			match(K_VIEW);
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(492);
				match(K_IF);
				setState(493);
				match(K_NOT);
				setState(494);
				match(K_EXISTS);
				}
				break;
			}
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(497);
				database_name();
				setState(498);
				match(DOT);
				}
				break;
			}
			setState(502);
			view_name();
			setState(503);
			match(K_AS);
			setState(504);
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
			setState(506);
			match(K_CREATE);
			setState(507);
			match(K_VIRTUAL);
			setState(508);
			match(K_TABLE);
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(509);
				match(K_IF);
				setState(510);
				match(K_NOT);
				setState(511);
				match(K_EXISTS);
				}
				break;
			}
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(514);
				database_name();
				setState(515);
				match(DOT);
				}
				break;
			}
			setState(519);
			table_name();
			setState(520);
			match(K_USING);
			setState(521);
			module_name();
			setState(533);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(522);
				match(OPEN_PAR);
				setState(523);
				module_argument();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(524);
					match(COMMA);
					setState(525);
					module_argument();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
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
			setState(536);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(535);
				with_clause();
				}
			}

			setState(538);
			match(K_DELETE);
			setState(539);
			match(K_FROM);
			setState(540);
			qualified_table_name();
			setState(543);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(541);
				match(K_WHERE);
				setState(542);
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
			setState(546);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(545);
				with_clause();
				}
			}

			setState(548);
			match(K_DELETE);
			setState(549);
			match(K_FROM);
			setState(550);
			qualified_table_name();
			setState(553);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(551);
				match(K_WHERE);
				setState(552);
				expr(0);
				}
			}

			setState(573);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(565);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(555);
					match(K_ORDER);
					setState(556);
					match(K_BY);
					setState(557);
					ordering_term();
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(558);
						match(COMMA);
						setState(559);
						ordering_term();
						}
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(567);
				match(K_LIMIT);
				setState(568);
				expr(0);
				setState(571);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(569);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(570);
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
			setState(575);
			match(K_DETACH);
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(576);
				match(K_DATABASE);
				}
				break;
			}
			setState(579);
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
			setState(581);
			match(K_DROP);
			setState(582);
			match(K_INDEX);
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(583);
				match(K_IF);
				setState(584);
				match(K_EXISTS);
				}
				break;
			}
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(587);
				database_name();
				setState(588);
				match(DOT);
				}
				break;
			}
			setState(592);
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
			setState(594);
			match(K_DROP);
			setState(595);
			match(K_TABLE);
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(596);
				match(K_IF);
				setState(597);
				match(K_EXISTS);
				}
				break;
			}
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(600);
				database_name();
				setState(601);
				match(DOT);
				}
				break;
			}
			setState(605);
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
			setState(607);
			match(K_DROP);
			setState(608);
			match(K_TRIGGER);
			setState(611);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(609);
				match(K_IF);
				setState(610);
				match(K_EXISTS);
				}
				break;
			}
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(613);
				database_name();
				setState(614);
				match(DOT);
				}
				break;
			}
			setState(618);
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
			setState(620);
			match(K_DROP);
			setState(621);
			match(K_VIEW);
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(622);
				match(K_IF);
				setState(623);
				match(K_EXISTS);
				}
				break;
			}
			setState(629);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(626);
				database_name();
				setState(627);
				match(DOT);
				}
				break;
			}
			setState(631);
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
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
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(633);
				match(K_WITH);
				setState(635);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(634);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(637);
				common_table_expression();
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(638);
					match(COMMA);
					setState(639);
					common_table_expression();
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(647);
			select_core();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(648);
				compound_operator();
				setState(649);
				select_core();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(656);
				match(K_ORDER);
				setState(657);
				match(K_BY);
				setState(658);
				ordering_term();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(659);
					match(COMMA);
					setState(660);
					ordering_term();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(674);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(668);
				match(K_LIMIT);
				setState(669);
				expr(0);
				setState(672);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(670);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(671);
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
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(676);
				with_clause();
				}
			}

			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(679);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(680);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(681);
				match(K_INSERT);
				setState(682);
				match(K_OR);
				setState(683);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(684);
				match(K_INSERT);
				setState(685);
				match(K_OR);
				setState(686);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(687);
				match(K_INSERT);
				setState(688);
				match(K_OR);
				setState(689);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(690);
				match(K_INSERT);
				setState(691);
				match(K_OR);
				setState(692);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(693);
				match(K_INSERT);
				setState(694);
				match(K_OR);
				setState(695);
				match(K_IGNORE);
				}
				break;
			}
			setState(698);
			match(K_INTO);
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(699);
				database_name();
				setState(700);
				match(DOT);
				}
				break;
			}
			setState(704);
			table_name();
			setState(716);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(705);
				match(OPEN_PAR);
				setState(706);
				column_name();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					column_name();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(CLOSE_PAR);
				}
			}

			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(718);
				match(K_VALUES);
				setState(719);
				match(OPEN_PAR);
				setState(720);
				expr(0);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(721);
					match(COMMA);
					setState(722);
					expr(0);
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(CLOSE_PAR);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(729);
					match(COMMA);
					setState(730);
					match(OPEN_PAR);
					setState(731);
					expr(0);
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(732);
						match(COMMA);
						setState(733);
						expr(0);
						}
						}
						setState(738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(739);
					match(CLOSE_PAR);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(746);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(747);
				match(K_DEFAULT);
				setState(748);
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
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(K_PRAGMA);
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(752);
				database_name();
				setState(753);
				match(DOT);
				}
				break;
			}
			setState(757);
			pragma_name();
			setState(764);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(758);
				match(ASSIGN);
				setState(759);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(760);
				match(OPEN_PAR);
				setState(761);
				pragma_value();
				setState(762);
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
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(K_REINDEX);
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(767);
				collation_name();
				}
				break;
			case 2:
				{
				setState(771);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(768);
					database_name();
					setState(769);
					match(DOT);
					}
					break;
				}
				setState(775);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(773);
					table_name();
					}
					break;
				case 2:
					{
					setState(774);
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
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(K_RELEASE);
			setState(781);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(780);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(783);
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
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(K_ROLLBACK);
			setState(790);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(786);
				match(K_TRANSACTION);
				setState(788);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(787);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(797);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(792);
				match(K_TO);
				setState(794);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(793);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(796);
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
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(K_SAVEPOINT);
			setState(800);
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
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(802);
				match(K_WITH);
				setState(804);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(803);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(806);
				common_table_expression();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(807);
					match(COMMA);
					setState(808);
					common_table_expression();
					}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(816);
			select_core();
			setState(827);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(817);
				match(K_ORDER);
				setState(818);
				match(K_BY);
				setState(819);
				ordering_term();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(820);
					match(COMMA);
					setState(821);
					ordering_term();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(835);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(829);
				match(K_LIMIT);
				setState(830);
				expr(0);
				setState(833);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(831);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(832);
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
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
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
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(837);
				match(K_WITH);
				setState(839);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(838);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(841);
				common_table_expression();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					common_table_expression();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(851);
			select_or_values();
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(852);
				compound_operator();
				setState(853);
				select_or_values();
				}
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(860);
				match(K_ORDER);
				setState(861);
				match(K_BY);
				setState(862);
				ordering_term();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					ordering_term();
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(878);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(872);
				match(K_LIMIT);
				setState(873);
				expr(0);
				setState(876);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(874);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(875);
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(DBoyzSQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(DBoyzSQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(DBoyzSQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(DBoyzSQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(DBoyzSQLParser.K_BY, 0); }
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
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBoyzSQLListener ) ((DBoyzSQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBoyzSQLVisitor ) return ((DBoyzSQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(954);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(K_SELECT);
				setState(882);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(881);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(884);
				result_column();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					result_column();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(892);
					match(K_FROM);
					setState(902);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(893);
						table_or_subquery();
						setState(898);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(894);
							match(COMMA);
							setState(895);
							table_or_subquery();
							}
							}
							setState(900);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(901);
						join_clause();
						}
						break;
					}
					}
				}

				setState(908);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(906);
					match(K_WHERE);
					setState(907);
					expr(0);
					}
				}

				setState(924);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(910);
					match(K_GROUP);
					setState(911);
					match(K_BY);
					setState(912);
					expr(0);
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(913);
						match(COMMA);
						setState(914);
						expr(0);
						}
						}
						setState(919);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(922);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(920);
						match(K_HAVING);
						setState(921);
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
				setState(926);
				match(K_VALUES);
				setState(927);
				match(OPEN_PAR);
				setState(928);
				expr(0);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(929);
					match(COMMA);
					setState(930);
					expr(0);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				match(CLOSE_PAR);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(937);
					match(COMMA);
					setState(938);
					match(OPEN_PAR);
					setState(939);
					expr(0);
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(940);
						match(COMMA);
						setState(941);
						expr(0);
						}
						}
						setState(946);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(947);
					match(CLOSE_PAR);
					}
					}
					setState(953);
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
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(956);
				with_clause();
				}
			}

			setState(959);
			match(K_UPDATE);
			setState(970);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(960);
				match(K_OR);
				setState(961);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(962);
				match(K_OR);
				setState(963);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(964);
				match(K_OR);
				setState(965);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(966);
				match(K_OR);
				setState(967);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(968);
				match(K_OR);
				setState(969);
				match(K_IGNORE);
				}
				break;
			}
			setState(972);
			qualified_table_name();
			setState(973);
			match(K_SET);
			setState(974);
			column_name();
			setState(975);
			match(ASSIGN);
			setState(976);
			expr(0);
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(977);
				match(COMMA);
				setState(978);
				column_name();
				setState(979);
				match(ASSIGN);
				setState(980);
				expr(0);
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(987);
				match(K_WHERE);
				setState(988);
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
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(991);
				with_clause();
				}
			}

			setState(994);
			match(K_UPDATE);
			setState(1005);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(995);
				match(K_OR);
				setState(996);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(997);
				match(K_OR);
				setState(998);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(999);
				match(K_OR);
				setState(1000);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1001);
				match(K_OR);
				setState(1002);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1003);
				match(K_OR);
				setState(1004);
				match(K_IGNORE);
				}
				break;
			}
			setState(1007);
			qualified_table_name();
			setState(1008);
			match(K_SET);
			setState(1009);
			column_name();
			setState(1010);
			match(ASSIGN);
			setState(1011);
			expr(0);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1012);
				match(COMMA);
				setState(1013);
				column_name();
				setState(1014);
				match(ASSIGN);
				setState(1015);
				expr(0);
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1024);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1022);
				match(K_WHERE);
				setState(1023);
				expr(0);
				}
			}

			setState(1044);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1036);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1026);
					match(K_ORDER);
					setState(1027);
					match(K_BY);
					setState(1028);
					ordering_term();
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1029);
						match(COMMA);
						setState(1030);
						ordering_term();
						}
						}
						setState(1035);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1038);
				match(K_LIMIT);
				setState(1039);
				expr(0);
				setState(1042);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1040);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1041);
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
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			column_name();
			setState(1050);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1049);
				type_name();
				}
				break;
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(1052);
				column_constraint();
				}
				}
				setState(1057);
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
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1058);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1061); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1073);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1063);
				match(OPEN_PAR);
				setState(1064);
				signed_number();
				setState(1065);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1067);
				match(OPEN_PAR);
				setState(1068);
				signed_number();
				setState(1069);
				match(COMMA);
				setState(1070);
				signed_number();
				setState(1071);
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
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1075);
				match(K_CONSTRAINT);
				setState(1076);
				name();
				}
			}

			setState(1112);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1079);
				match(K_PRIMARY);
				setState(1080);
				match(K_KEY);
				setState(1082);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1081);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1084);
				conflict_clause();
				setState(1086);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1085);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1089);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1088);
					match(K_NOT);
					}
				}

				setState(1091);
				match(K_NULL);
				setState(1092);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1093);
				match(K_UNIQUE);
				setState(1094);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1095);
				match(K_CHECK);
				setState(1096);
				match(OPEN_PAR);
				setState(1097);
				expr(0);
				setState(1098);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1100);
				match(K_DEFAULT);
				setState(1107);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1101);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1102);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1103);
					match(OPEN_PAR);
					setState(1104);
					expr(0);
					setState(1105);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1109);
				match(K_COLLATE);
				setState(1110);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1111);
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
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1114);
				match(K_ON);
				setState(1115);
				match(K_CONFLICT);
				setState(1116);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1120);
				unary_operator();
				setState(1121);
				expr(21);
				}
				break;
			case 2:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				literal_value();
				}
				break;
			case 3:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1124);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1128);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1125);
						database_name();
						setState(1126);
						match(DOT);
						}
						break;
					}
					setState(1130);
					table_name();
					setState(1131);
					match(DOT);
					}
					break;
				}
				setState(1135);
				column_name();
				}
				break;
			case 5:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				function_name();
				setState(1137);
				match(OPEN_PAR);
				setState(1150);
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
					setState(1139);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1138);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1141);
					expr(0);
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1142);
						match(COMMA);
						setState(1143);
						expr(0);
						}
						}
						setState(1148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1149);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1152);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				match(OPEN_PAR);
				setState(1155);
				expr(0);
				setState(1156);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				match(K_CAST);
				setState(1159);
				match(OPEN_PAR);
				setState(1160);
				expr(0);
				setState(1161);
				match(K_AS);
				setState(1162);
				type_name();
				setState(1163);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1169);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1166);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1165);
						match(K_NOT);
						}
					}

					setState(1168);
					match(K_EXISTS);
					}
				}

				setState(1171);
				match(OPEN_PAR);
				setState(1172);
				select_stmt();
				setState(1173);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1175);
				match(K_CASE);
				setState(1177);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1176);
					expr(0);
					}
					break;
				}
				setState(1184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1179);
					match(K_WHEN);
					setState(1180);
					expr(0);
					setState(1181);
					match(K_THEN);
					setState(1182);
					expr(0);
					}
					}
					setState(1186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1190);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1188);
					match(K_ELSE);
					setState(1189);
					expr(0);
					}
				}

				setState(1192);
				match(K_END);
				}
				break;
			case 10:
				{
				_localctx = new UndecidedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1194);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1283);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1197);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1198);
						match(PIPE2);
						setState(1199);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1200);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1201);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1202);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1203);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1204);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1205);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1206);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1207);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1208);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1209);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1210);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1211);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOPContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1212);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1213);
						binary_operator();
						setState(1214);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1216);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1217);
						match(K_AND);
						setState(1218);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1219);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1220);
						match(K_OR);
						setState(1221);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1223);
						match(K_IS);
						setState(1225);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1224);
							match(K_NOT);
							}
							break;
						}
						setState(1227);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1230);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1229);
							match(K_NOT);
							}
						}

						setState(1232);
						match(K_BETWEEN);
						setState(1233);
						expr(0);
						setState(1234);
						match(K_AND);
						setState(1235);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1237);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1238);
						match(K_COLLATE);
						setState(1239);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new UndecidedContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1242);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1241);
							match(K_NOT);
							}
						}

						setState(1244);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1245);
						expr(0);
						setState(1248);
						switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
						case 1:
							{
							setState(1246);
							match(K_ESCAPE);
							setState(1247);
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
						setState(1250);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1255);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1251);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1252);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1253);
							match(K_NOT);
							setState(1254);
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
						setState(1257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1259);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1258);
							match(K_NOT);
							}
						}

						setState(1261);
						match(K_IN);
						setState(1281);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1262);
							match(OPEN_PAR);
							setState(1272);
							switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
							case 1:
								{
								setState(1263);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1264);
								expr(0);
								setState(1269);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1265);
									match(COMMA);
									setState(1266);
									expr(0);
									}
									}
									setState(1271);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1274);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1278);
							switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
							case 1:
								{
								setState(1275);
								database_name();
								setState(1276);
								match(DOT);
								}
								break;
							}
							setState(1280);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(K_REFERENCES);
			setState(1289);
			foreign_table();
			setState(1301);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1290);
				match(OPEN_PAR);
				setState(1291);
				column_name();
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1292);
					match(COMMA);
					setState(1293);
					column_name();
					}
					}
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1299);
				match(CLOSE_PAR);
				}
			}

			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1317);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1303);
					match(K_ON);
					setState(1304);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1313);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1305);
						match(K_SET);
						setState(1306);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1307);
						match(K_SET);
						setState(1308);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1309);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1310);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1311);
						match(K_NO);
						setState(1312);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1315);
					match(K_MATCH);
					setState(1316);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1334);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1325);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1324);
					match(K_NOT);
					}
				}

				setState(1327);
				match(K_DEFERRABLE);
				setState(1332);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(K_INITIALLY);
					setState(1329);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1330);
					match(K_INITIALLY);
					setState(1331);
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
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(K_RAISE);
			setState(1337);
			match(OPEN_PAR);
			setState(1342);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1338);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1339);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1340);
				match(COMMA);
				setState(1341);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1344);
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
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			column_name();
			setState(1349);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1347);
				match(K_COLLATE);
				setState(1348);
				collation_name();
				}
			}

			setState(1352);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1351);
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
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1354);
				match(K_CONSTRAINT);
				setState(1355);
				name();
				}
			}

			setState(1394);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1361);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1358);
					match(K_PRIMARY);
					setState(1359);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1360);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1363);
				match(OPEN_PAR);
				setState(1364);
				indexed_column();
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1365);
					match(COMMA);
					setState(1366);
					indexed_column();
					}
					}
					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1372);
				match(CLOSE_PAR);
				setState(1373);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1375);
				match(K_CHECK);
				setState(1376);
				match(OPEN_PAR);
				setState(1377);
				expr(0);
				setState(1378);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1380);
				match(K_FOREIGN);
				setState(1381);
				match(K_KEY);
				setState(1382);
				match(OPEN_PAR);
				setState(1383);
				column_name();
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1384);
					match(COMMA);
					setState(1385);
					column_name();
					}
					}
					setState(1390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1391);
				match(CLOSE_PAR);
				setState(1392);
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
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(K_WITH);
			setState(1398);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1397);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1400);
			cte_table_name();
			setState(1401);
			match(K_AS);
			setState(1402);
			match(OPEN_PAR);
			setState(1403);
			select_stmt();
			setState(1404);
			match(CLOSE_PAR);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1405);
				match(COMMA);
				setState(1406);
				cte_table_name();
				setState(1407);
				match(K_AS);
				setState(1408);
				match(OPEN_PAR);
				setState(1409);
				select_stmt();
				setState(1410);
				match(CLOSE_PAR);
				}
				}
				setState(1416);
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
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1417);
				database_name();
				setState(1418);
				match(DOT);
				}
				break;
			}
			setState(1422);
			table_name();
			setState(1428);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1423);
				match(K_INDEXED);
				setState(1424);
				match(K_BY);
				setState(1425);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1426);
				match(K_NOT);
				setState(1427);
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
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			expr(0);
			setState(1433);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1431);
				match(K_COLLATE);
				setState(1432);
				collation_name();
				}
			}

			setState(1436);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1435);
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
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1440);
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
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			table_name();
			setState(1455);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1444);
				match(OPEN_PAR);
				setState(1445);
				column_name();
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1446);
					match(COMMA);
					setState(1447);
					column_name();
					}
					}
					setState(1452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1453);
				match(CLOSE_PAR);
				}
			}

			setState(1457);
			match(K_AS);
			setState(1458);
			match(OPEN_PAR);
			setState(1459);
			select_stmt();
			setState(1460);
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
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1474);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				table_name();
				setState(1464);
				match(DOT);
				setState(1465);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				expr(0);
				setState(1472);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1469);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1468);
						match(K_AS);
						}
					}

					setState(1471);
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
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1523);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1476);
					database_name();
					setState(1477);
					match(DOT);
					}
					break;
				}
				setState(1481);
				table_name();
				setState(1486);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1483);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						setState(1482);
						match(K_AS);
						}
						break;
					}
					setState(1485);
					table_alias();
					}
					break;
				}
				setState(1493);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1488);
					match(K_INDEXED);
					setState(1489);
					match(K_BY);
					setState(1490);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1491);
					match(K_NOT);
					setState(1492);
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
				setState(1495);
				match(OPEN_PAR);
				setState(1505);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1496);
					table_or_subquery();
					setState(1501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1497);
						match(COMMA);
						setState(1498);
						table_or_subquery();
						}
						}
						setState(1503);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1504);
					join_clause();
					}
					break;
				}
				setState(1507);
				match(CLOSE_PAR);
				setState(1512);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1509);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						setState(1508);
						match(K_AS);
						}
						break;
					}
					setState(1511);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				match(OPEN_PAR);
				setState(1515);
				select_stmt();
				setState(1516);
				match(CLOSE_PAR);
				setState(1521);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1518);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1517);
						match(K_AS);
						}
						break;
					}
					setState(1520);
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
		enterRule(_localctx, 102, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			table_or_subquery();
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1526);
				join_operator();
				setState(1527);
				table_or_subquery();
				setState(1528);
				join_constraint();
				}
				}
				setState(1534);
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
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1548);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
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
				setState(1537);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1536);
					match(K_NATURAL);
					}
				}

				setState(1545);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1539);
					match(K_LEFT);
					setState(1541);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1540);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1543);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1544);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1547);
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
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1550);
				match(K_ON);
				setState(1551);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1552);
				match(K_USING);
				setState(1553);
				match(OPEN_PAR);
				setState(1554);
				column_name();
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1555);
					match(COMMA);
					setState(1556);
					column_name();
					}
					}
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562);
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
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			setState(1630);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(K_SELECT);
				setState(1568);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1567);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1570);
				projection_clause();
				setState(1583);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1571);
					match(K_FROM);
					setState(1581);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1572);
						table_or_subquery();
						setState(1577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1573);
							match(COMMA);
							setState(1574);
							table_or_subquery();
							}
							}
							setState(1579);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1580);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1585);
				where_clause();
				setState(1600);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1586);
					match(K_GROUP);
					setState(1587);
					match(K_BY);
					setState(1588);
					expr(0);
					setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1589);
						match(COMMA);
						setState(1590);
						expr(0);
						}
						}
						setState(1595);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1598);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1596);
						match(K_HAVING);
						setState(1597);
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
				setState(1602);
				match(K_VALUES);
				setState(1603);
				match(OPEN_PAR);
				setState(1604);
				expr(0);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1605);
					match(COMMA);
					setState(1606);
					expr(0);
					}
					}
					setState(1611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1612);
				match(CLOSE_PAR);
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1613);
					match(COMMA);
					setState(1614);
					match(OPEN_PAR);
					setState(1615);
					expr(0);
					setState(1620);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1616);
						match(COMMA);
						setState(1617);
						expr(0);
						}
						}
						setState(1622);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1623);
					match(CLOSE_PAR);
					}
					}
					setState(1629);
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
		enterRule(_localctx, 110, RULE_projection_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			result_column();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1633);
				match(COMMA);
				setState(1634);
				result_column();
				}
				}
				setState(1639);
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
		enterRule(_localctx, 112, RULE_where_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1640);
				match(K_WHERE);
				setState(1641);
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
		enterRule(_localctx, 114, RULE_compound_operator);
		try {
			setState(1649);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				match(K_UNION);
				setState(1646);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1647);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1648);
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
		enterRule(_localctx, 116, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			table_name();
			setState(1663);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1652);
				match(OPEN_PAR);
				setState(1653);
				column_name();
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1654);
					match(COMMA);
					setState(1655);
					column_name();
					}
					}
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1661);
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
		enterRule(_localctx, 118, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1665);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1668);
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
		enterRule(_localctx, 120, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
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
		enterRule(_localctx, 122, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
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
		enterRule(_localctx, 124, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1674);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(1675);
				match(EQ);
				}
				break;
			case 3:
				{
				setState(1676);
				match(NOT_EQ1);
				}
				break;
			case 4:
				{
				setState(1677);
				match(NOT_EQ2);
				}
				break;
			case 5:
				{
				setState(1678);
				match(K_IS);
				}
				break;
			case 6:
				{
				setState(1679);
				match(K_IS);
				setState(1680);
				match(K_NOT);
				}
				break;
			case 7:
				{
				setState(1681);
				match(K_IN);
				}
				break;
			case 8:
				{
				setState(1682);
				match(K_LIKE);
				}
				break;
			case 9:
				{
				setState(1683);
				match(K_GLOB);
				}
				break;
			case 10:
				{
				setState(1684);
				match(K_MATCH);
				}
				break;
			case 11:
				{
				setState(1685);
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
		enterRule(_localctx, 126, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 128, RULE_module_argument);
		try {
			setState(1692);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
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
		enterRule(_localctx, 130, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
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
		enterRule(_localctx, 132, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
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
		enterRule(_localctx, 134, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
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
		enterRule(_localctx, 136, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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
		enterRule(_localctx, 138, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
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
		enterRule(_localctx, 140, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
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
		enterRule(_localctx, 142, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
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
		enterRule(_localctx, 144, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
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
		enterRule(_localctx, 146, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
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
		enterRule(_localctx, 148, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
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
		enterRule(_localctx, 150, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
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
		enterRule(_localctx, 152, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
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
		enterRule(_localctx, 154, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
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
		enterRule(_localctx, 156, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
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
		enterRule(_localctx, 158, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
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
		enterRule(_localctx, 160, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
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
		enterRule(_localctx, 162, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
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
		enterRule(_localctx, 164, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
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
		enterRule(_localctx, 166, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
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
		enterRule(_localctx, 168, RULE_any_name);
		try {
			setState(1739);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
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
				setState(1733);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1735);
				match(OPEN_PAR);
				setState(1736);
				any_name();
				setState(1737);
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
		case 39:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u06d0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\7\2\u00af\n\2\f\2\16\2\u00b2\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\7\4\u00ba\n\4\f\4\16\4\u00bd\13\4\3\4\3\4\6\4\u00c1\n\4\r\4\16"+
		"\4\u00c2\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3\4\7\4\u00cc\n\4\f\4\16"+
		"\4\u00cf\13\4\3\5\3\5\3\5\5\5\u00d4\n\5\5\5\u00d6\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f6\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00fd\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0105\n\6\3\6\5\6\u0108\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0111\n\7\3\b\3\b\5\b\u0115\n\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u011d\n\t\3\t\3\t\5\t\u0121\n\t\5\t\u0123\n\t\3\n"+
		"\3\n\3\n\5\n\u0128\n\n\5\n\u012a\n\n\3\13\3\13\5\13\u012e\n\13\3\13\3"+
		"\13\3\13\7\13\u0133\n\13\f\13\16\13\u0136\13\13\5\13\u0138\n\13\3\13\3"+
		"\13\3\13\5\13\u013d\n\13\3\13\3\13\5\13\u0141\n\13\3\13\6\13\u0144\n\13"+
		"\r\13\16\13\u0145\3\13\3\13\3\13\3\13\3\13\7\13\u014d\n\13\f\13\16\13"+
		"\u0150\13\13\5\13\u0152\n\13\3\13\3\13\3\13\3\13\5\13\u0158\n\13\5\13"+
		"\u015a\n\13\3\f\3\f\5\f\u015e\n\f\3\f\3\f\3\f\3\f\5\f\u0164\n\f\3\f\3"+
		"\f\3\f\5\f\u0169\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0172\n\f\f\f\16"+
		"\f\u0175\13\f\3\f\3\f\3\f\5\f\u017a\n\f\3\r\3\r\5\r\u017e\n\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0184\n\r\3\r\3\r\3\r\5\r\u0189\n\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u0190\n\r\f\r\16\r\u0193\13\r\3\r\3\r\7\r\u0197\n\r\f\r\16\r\u019a"+
		"\13\r\3\r\3\r\3\r\5\r\u019f\n\r\3\r\3\r\5\r\u01a3\n\r\3\16\3\16\5\16\u01a7"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u01ad\n\16\3\16\3\16\3\16\5\16\u01b2\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u01c2\n\16\f\16\16\16\u01c5\13\16\5\16\u01c7\n\16\5\16"+
		"\u01c9\n\16\3\16\3\16\3\16\3\16\5\16\u01cf\n\16\3\16\3\16\3\16\3\16\5"+
		"\16\u01d5\n\16\3\16\3\16\5\16\u01d9\n\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u01e0\n\16\3\16\3\16\6\16\u01e4\n\16\r\16\16\16\u01e5\3\16\3\16\3\17"+
		"\3\17\5\17\u01ec\n\17\3\17\3\17\3\17\3\17\5\17\u01f2\n\17\3\17\3\17\3"+
		"\17\5\17\u01f7\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0203\n\20\3\20\3\20\3\20\5\20\u0208\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u0211\n\20\f\20\16\20\u0214\13\20\3\20\3\20\5\20\u0218"+
		"\n\20\3\21\5\21\u021b\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0222\n\21\3"+
		"\22\5\22\u0225\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u022c\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0233\n\22\f\22\16\22\u0236\13\22\5\22\u0238\n\22"+
		"\3\22\3\22\3\22\3\22\5\22\u023e\n\22\5\22\u0240\n\22\3\23\3\23\5\23\u0244"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u024c\n\24\3\24\3\24\3\24\5\24"+
		"\u0251\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0259\n\25\3\25\3\25\3"+
		"\25\5\25\u025e\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0266\n\26\3\26"+
		"\3\26\3\26\5\26\u026b\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0273\n"+
		"\27\3\27\3\27\3\27\5\27\u0278\n\27\3\27\3\27\3\30\3\30\5\30\u027e\n\30"+
		"\3\30\3\30\3\30\7\30\u0283\n\30\f\30\16\30\u0286\13\30\5\30\u0288\n\30"+
		"\3\30\3\30\3\30\3\30\7\30\u028e\n\30\f\30\16\30\u0291\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0298\n\30\f\30\16\30\u029b\13\30\5\30\u029d\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u02a3\n\30\5\30\u02a5\n\30\3\31\5\31\u02a8\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u02bb\n\31\3\31\3\31\3\31\3\31\5\31\u02c1\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u02c8\n\31\f\31\16\31\u02cb\13\31\3\31"+
		"\3\31\5\31\u02cf\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u02d6\n\31\f\31\16"+
		"\31\u02d9\13\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02e1\n\31\f\31\16"+
		"\31\u02e4\13\31\3\31\3\31\7\31\u02e8\n\31\f\31\16\31\u02eb\13\31\3\31"+
		"\3\31\3\31\5\31\u02f0\n\31\3\32\3\32\3\32\3\32\5\32\u02f6\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ff\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0306\n\33\3\33\3\33\5\33\u030a\n\33\5\33\u030c\n\33\3\34\3\34\5"+
		"\34\u0310\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u0317\n\35\5\35\u0319\n\35"+
		"\3\35\3\35\5\35\u031d\n\35\3\35\5\35\u0320\n\35\3\36\3\36\3\36\3\37\3"+
		"\37\5\37\u0327\n\37\3\37\3\37\3\37\7\37\u032c\n\37\f\37\16\37\u032f\13"+
		"\37\5\37\u0331\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0339\n\37\f\37"+
		"\16\37\u033c\13\37\5\37\u033e\n\37\3\37\3\37\3\37\3\37\5\37\u0344\n\37"+
		"\5\37\u0346\n\37\3 \3 \5 \u034a\n \3 \3 \3 \7 \u034f\n \f \16 \u0352\13"+
		" \5 \u0354\n \3 \3 \3 \3 \7 \u035a\n \f \16 \u035d\13 \3 \3 \3 \3 \3 "+
		"\7 \u0364\n \f \16 \u0367\13 \5 \u0369\n \3 \3 \3 \3 \5 \u036f\n \5 \u0371"+
		"\n \3!\3!\5!\u0375\n!\3!\3!\3!\7!\u037a\n!\f!\16!\u037d\13!\3!\3!\3!\3"+
		"!\7!\u0383\n!\f!\16!\u0386\13!\3!\5!\u0389\n!\5!\u038b\n!\3!\3!\5!\u038f"+
		"\n!\3!\3!\3!\3!\3!\7!\u0396\n!\f!\16!\u0399\13!\3!\3!\5!\u039d\n!\5!\u039f"+
		"\n!\3!\3!\3!\3!\3!\7!\u03a6\n!\f!\16!\u03a9\13!\3!\3!\3!\3!\3!\3!\7!\u03b1"+
		"\n!\f!\16!\u03b4\13!\3!\3!\7!\u03b8\n!\f!\16!\u03bb\13!\5!\u03bd\n!\3"+
		"\"\5\"\u03c0\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03cd"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u03d9\n\"\f\"\16\"\u03dc"+
		"\13\"\3\"\3\"\5\"\u03e0\n\"\3#\5#\u03e3\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u03f0\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u03fc\n#\f#\16#\u03ff"+
		"\13#\3#\3#\5#\u0403\n#\3#\3#\3#\3#\3#\7#\u040a\n#\f#\16#\u040d\13#\5#"+
		"\u040f\n#\3#\3#\3#\3#\5#\u0415\n#\5#\u0417\n#\3$\3$\3%\3%\5%\u041d\n%"+
		"\3%\7%\u0420\n%\f%\16%\u0423\13%\3&\6&\u0426\n&\r&\16&\u0427\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0434\n&\3\'\3\'\5\'\u0438\n\'\3\'\3\'\3\'\5"+
		"\'\u043d\n\'\3\'\3\'\5\'\u0441\n\'\3\'\5\'\u0444\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0456\n\'\3\'\3\'\3"+
		"\'\5\'\u045b\n\'\3(\3(\3(\5(\u0460\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u046b"+
		"\n)\3)\3)\3)\5)\u0470\n)\3)\3)\3)\3)\5)\u0476\n)\3)\3)\3)\7)\u047b\n)"+
		"\f)\16)\u047e\13)\3)\5)\u0481\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u0491\n)\3)\5)\u0494\n)\3)\3)\3)\3)\3)\3)\5)\u049c\n)\3)\3)\3"+
		")\3)\3)\6)\u04a3\n)\r)\16)\u04a4\3)\3)\5)\u04a9\n)\3)\3)\3)\5)\u04ae\n"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u04cc\n)\3)\3)\3)\5)\u04d1\n)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u04dd\n)\3)\3)\3)\3)\5)\u04e3\n)\3)\3)\3)\3)\3)\5)\u04ea"+
		"\n)\3)\3)\5)\u04ee\n)\3)\3)\3)\3)\3)\3)\7)\u04f6\n)\f)\16)\u04f9\13)\5"+
		")\u04fb\n)\3)\3)\3)\3)\5)\u0501\n)\3)\5)\u0504\n)\7)\u0506\n)\f)\16)\u0509"+
		"\13)\3*\3*\3*\3*\3*\3*\7*\u0511\n*\f*\16*\u0514\13*\3*\3*\5*\u0518\n*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0524\n*\3*\3*\5*\u0528\n*\7*\u052a"+
		"\n*\f*\16*\u052d\13*\3*\5*\u0530\n*\3*\3*\3*\3*\3*\5*\u0537\n*\5*\u0539"+
		"\n*\3+\3+\3+\3+\3+\3+\5+\u0541\n+\3+\3+\3,\3,\3,\5,\u0548\n,\3,\5,\u054b"+
		"\n,\3-\3-\5-\u054f\n-\3-\3-\3-\5-\u0554\n-\3-\3-\3-\3-\7-\u055a\n-\f-"+
		"\16-\u055d\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u056d\n-\f"+
		"-\16-\u0570\13-\3-\3-\3-\5-\u0575\n-\3.\3.\5.\u0579\n.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\7.\u0587\n.\f.\16.\u058a\13.\3/\3/\3/\5/\u058f\n"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0597\n/\3\60\3\60\3\60\5\60\u059c\n\60\3\60\5"+
		"\60\u059f\n\60\3\61\3\61\3\61\5\61\u05a4\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u05ab\n\62\f\62\16\62\u05ae\13\62\3\62\3\62\5\62\u05b2\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05c0\n\63"+
		"\3\63\5\63\u05c3\n\63\5\63\u05c5\n\63\3\64\3\64\3\64\5\64\u05ca\n\64\3"+
		"\64\3\64\5\64\u05ce\n\64\3\64\5\64\u05d1\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u05d8\n\64\3\64\3\64\3\64\3\64\7\64\u05de\n\64\f\64\16\64\u05e1"+
		"\13\64\3\64\5\64\u05e4\n\64\3\64\3\64\5\64\u05e8\n\64\3\64\5\64\u05eb"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u05f1\n\64\3\64\5\64\u05f4\n\64\5\64\u05f6"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u05fd\n\65\f\65\16\65\u0600\13\65"+
		"\3\66\3\66\5\66\u0604\n\66\3\66\3\66\5\66\u0608\n\66\3\66\3\66\5\66\u060c"+
		"\n\66\3\66\5\66\u060f\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0618"+
		"\n\67\f\67\16\67\u061b\13\67\3\67\3\67\5\67\u061f\n\67\38\38\58\u0623"+
		"\n8\38\38\38\38\38\78\u062a\n8\f8\168\u062d\138\38\58\u0630\n8\58\u0632"+
		"\n8\38\38\38\38\38\38\78\u063a\n8\f8\168\u063d\138\38\38\58\u0641\n8\5"+
		"8\u0643\n8\38\38\38\38\38\78\u064a\n8\f8\168\u064d\138\38\38\38\38\38"+
		"\38\78\u0655\n8\f8\168\u0658\138\38\38\78\u065c\n8\f8\168\u065f\138\5"+
		"8\u0661\n8\39\39\39\79\u0666\n9\f9\169\u0669\139\3:\3:\5:\u066d\n:\3;"+
		"\3;\3;\3;\3;\5;\u0674\n;\3<\3<\3<\3<\3<\7<\u067b\n<\f<\16<\u067e\13<\3"+
		"<\3<\5<\u0682\n<\3=\5=\u0685\n=\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\5@\u0699\n@\3A\3A\3B\3B\5B\u069f\nB\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3"+
		"Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\3V\5V\u06ce\nV\3V\2\3P"+
		"W\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\2\24\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0085\u0086"+
		"\4\2\37\37@@\4\2$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n\13\3"+
		"\2\20\23\3\2\24\27\6\2OOcceexx\4\2==\u008d\u008d\5\2\33\33JJ\177\177\6"+
		"\2\668jj\u0098\u0098\u009a\u009b\4\2\n\fhh\4\2\u0097\u0097\u009a\u009a"+
		"\3\2\33\u0096\u07da\2\u00b0\3\2\2\2\4\u00b5\3\2\2\2\6\u00bb\3\2\2\2\b"+
		"\u00d5\3\2\2\2\n\u00f7\3\2\2\2\f\u0109\3\2\2\2\16\u0112\3\2\2\2\20\u011a"+
		"\3\2\2\2\22\u0124\3\2\2\2\24\u0137\3\2\2\2\26\u015b\3\2\2\2\30\u017b\3"+
		"\2\2\2\32\u01a4\3\2\2\2\34\u01e9\3\2\2\2\36\u01fc\3\2\2\2 \u021a\3\2\2"+
		"\2\"\u0224\3\2\2\2$\u0241\3\2\2\2&\u0247\3\2\2\2(\u0254\3\2\2\2*\u0261"+
		"\3\2\2\2,\u026e\3\2\2\2.\u0287\3\2\2\2\60\u02a7\3\2\2\2\62\u02f1\3\2\2"+
		"\2\64\u0300\3\2\2\2\66\u030d\3\2\2\28\u0313\3\2\2\2:\u0321\3\2\2\2<\u0330"+
		"\3\2\2\2>\u0353\3\2\2\2@\u03bc\3\2\2\2B\u03bf\3\2\2\2D\u03e2\3\2\2\2F"+
		"\u0418\3\2\2\2H\u041a\3\2\2\2J\u0425\3\2\2\2L\u0437\3\2\2\2N\u045f\3\2"+
		"\2\2P\u04ad\3\2\2\2R\u050a\3\2\2\2T\u053a\3\2\2\2V\u0544\3\2\2\2X\u054e"+
		"\3\2\2\2Z\u0576\3\2\2\2\\\u058e\3\2\2\2^\u0598\3\2\2\2`\u05a3\3\2\2\2"+
		"b\u05a5\3\2\2\2d\u05c4\3\2\2\2f\u05f5\3\2\2\2h\u05f7\3\2\2\2j\u060e\3"+
		"\2\2\2l\u061e\3\2\2\2n\u0660\3\2\2\2p\u0662\3\2\2\2r\u066c\3\2\2\2t\u0673"+
		"\3\2\2\2v\u0675\3\2\2\2x\u0684\3\2\2\2z\u0688\3\2\2\2|\u068a\3\2\2\2~"+
		"\u0698\3\2\2\2\u0080\u069a\3\2\2\2\u0082\u069e\3\2\2\2\u0084\u06a0\3\2"+
		"\2\2\u0086\u06a2\3\2\2\2\u0088\u06a4\3\2\2\2\u008a\u06a6\3\2\2\2\u008c"+
		"\u06a8\3\2\2\2\u008e\u06aa\3\2\2\2\u0090\u06ac\3\2\2\2\u0092\u06ae\3\2"+
		"\2\2\u0094\u06b0\3\2\2\2\u0096\u06b2\3\2\2\2\u0098\u06b4\3\2\2\2\u009a"+
		"\u06b6\3\2\2\2\u009c\u06b8\3\2\2\2\u009e\u06ba\3\2\2\2\u00a0\u06bc\3\2"+
		"\2\2\u00a2\u06be\3\2\2\2\u00a4\u06c0\3\2\2\2\u00a6\u06c2\3\2\2\2\u00a8"+
		"\u06c4\3\2\2\2\u00aa\u06cd\3\2\2\2\u00ac\u00af\5\6\4\2\u00ad\u00af\5\4"+
		"\3\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\7\2\2\3\u00b4\3\3\2\2\2\u00b5\u00b6\7\u009f\2\2\u00b6"+
		"\u00b7\b\3\1\2\u00b7\5\3\2\2\2\u00b8\u00ba\7\3\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c7\5\b\5\2\u00bf\u00c1\7\3\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\b\5\2\u00c5\u00c0\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\7\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00d3\7I\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d4"+
		"\7q\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f5\3\2\2\2\u00d7\u00f6\5\n"+
		"\6\2\u00d8\u00f6\5\f\7\2\u00d9\u00f6\5\16\b\2\u00da\u00f6\5\20\t\2\u00db"+
		"\u00f6\5\22\n\2\u00dc\u00f6\5\24\13\2\u00dd\u00f6\5\26\f\2\u00de\u00f6"+
		"\5\30\r\2\u00df\u00f6\5\32\16\2\u00e0\u00f6\5\34\17\2\u00e1\u00f6\5\36"+
		"\20\2\u00e2\u00f6\5 \21\2\u00e3\u00f6\5\"\22\2\u00e4\u00f6\5$\23\2\u00e5"+
		"\u00f6\5&\24\2\u00e6\u00f6\5(\25\2\u00e7\u00f6\5*\26\2\u00e8\u00f6\5,"+
		"\27\2\u00e9\u00f6\5.\30\2\u00ea\u00f6\5\60\31\2\u00eb\u00f6\5\62\32\2"+
		"\u00ec\u00f6\5\64\33\2\u00ed\u00f6\5\66\34\2\u00ee\u00f6\58\35\2\u00ef"+
		"\u00f6\5:\36\2\u00f0\u00f6\5<\37\2\u00f1\u00f6\5> \2\u00f2\u00f6\5B\""+
		"\2\u00f3\u00f6\5D#\2\u00f4\u00f6\5F$\2\u00f5\u00d7\3\2\2\2\u00f5\u00d8"+
		"\3\2\2\2\u00f5\u00d9\3\2\2\2\u00f5\u00da\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5"+
		"\u00dc\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00de\3\2\2\2\u00f5\u00df\3\2"+
		"\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5"+
		"\u00e3\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00e6\3\2"+
		"\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5"+
		"\u00ea\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\t\3\2\2\2\u00f7\u00f8\7 \2\2\u00f8\u00fc\7\u0084\2\2\u00f9"+
		"\u00fa\5\u008cG\2\u00fa\u00fb\7\4\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f9"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107\5\u008eH"+
		"\2\u00ff\u0100\7{\2\2\u0100\u0101\7\u0088\2\2\u0101\u0108\5\u0092J\2\u0102"+
		"\u0104\7\35\2\2\u0103\u0105\7\60\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5H%\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0108\13\3\2\2\2\u0109\u0110\7!\2\2\u010a\u0111\5\u008c"+
		"G\2\u010b\u0111\5\u0090I\2\u010c\u010d\5\u008cG\2\u010d\u010e\7\4\2\2"+
		"\u010e\u010f\5\u0090I\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\r\3\2\2\2"+
		"\u0112\u0114\7%\2\2\u0113\u0115\79\2\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\5P)\2\u0117\u0118\7#\2\2\u0118"+
		"\u0119\5\u008cG\2\u0119\17\3\2\2\2\u011a\u011c\7(\2\2\u011b\u011d\t\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e"+
		"\u0120\7\u0089\2\2\u011f\u0121\5\u00a8U\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\21\3\2\2\2\u0124\u0129\t\3\2\2\u0125\u0127\7\u0089\2\2\u0126\u0128\5"+
		"\u00a8U\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2"+
		"\u0129\u0125\3\2\2\2\u0129\u012a\3\2\2\2\u012a\23\3\2\2\2\u012b\u012d"+
		"\7\u0095\2\2\u012c\u012e\7v\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u012f\3\2\2\2\u012f\u0134\5b\62\2\u0130\u0131\7\7\2\2\u0131\u0133"+
		"\5b\62\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u012b\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0143\5n8\2\u013a\u013c"+
		"\7\u008b\2\2\u013b\u013d\7\37\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0141\3\2\2\2\u013e\u0141\7\\\2\2\u013f\u0141\7F\2\2\u0140"+
		"\u013a\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0144\5n8\2\u0143\u0140\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0151\3\2\2\2\u0147\u0148\7o\2\2\u0148"+
		"\u0149\7*\2\2\u0149\u014e\5^\60\2\u014a\u014b\7\7\2\2\u014b\u014d\5^\60"+
		"\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0147\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0159\3\2\2\2\u0153\u0154\7d\2\2\u0154\u0157\5P)"+
		"\2\u0155\u0156\t\4\2\2\u0156\u0158\5P)\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\25\3\2\2\2\u015b\u015d\7\64\2\2\u015c\u015e\7\u008c\2\2\u015d\u015c\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\7V\2\2\u0160"+
		"\u0161\7R\2\2\u0161\u0162\7h\2\2\u0162\u0164\7H\2\2\u0163\u0160\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0168\3\2\2\2\u0165\u0166\5\u008cG\2\u0166"+
		"\u0167\7\4\2\2\u0167\u0169\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\u009aN\2\u016b\u016c\7m\2\2\u016c"+
		"\u016d\5\u008eH\2\u016d\u016e\7\5\2\2\u016e\u0173\5V,\2\u016f\u0170\7"+
		"\7\2\2\u0170\u0172\5V,\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0179\7\6\2\2\u0177\u0178\7\u0094\2\2\u0178\u017a\5P)\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\27\3\2\2\2\u017b\u017d\7\64\2"+
		"\2\u017c\u017e\t\5\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0183\7\u0084\2\2\u0180\u0181\7R\2\2\u0181\u0182\7h\2\2"+
		"\u0182\u0184\7H\2\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0188"+
		"\3\2\2\2\u0185\u0186\5\u008cG\2\u0186\u0187\7\4\2\2\u0187\u0189\3\2\2"+
		"\2\u0188\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u01a2"+
		"\5\u008eH\2\u018b\u018c\7\5\2\2\u018c\u0191\5H%\2\u018d\u018e\7\7\2\2"+
		"\u018e\u0190\5H%\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0198\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0195\7\7\2\2\u0195\u0197\5X-\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2"+
		"\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u019e\7\6\2\2\u019c\u019d\7\u0096\2\2\u019d\u019f\7\u0097"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\3\2\2\2\u01a0"+
		"\u01a1\7#\2\2\u01a1\u01a3\5> \2\u01a2\u018b\3\2\2\2\u01a2\u01a0\3\2\2"+
		"\2\u01a3\31\3\2\2\2\u01a4\u01a6\7\64\2\2\u01a5\u01a7\t\5\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac\7\u008a\2"+
		"\2\u01a9\u01aa\7R\2\2\u01aa\u01ab\7h\2\2\u01ab\u01ad\7H\2\2\u01ac\u01a9"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01af\5\u008cG"+
		"\2\u01af\u01b0\7\4\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\5\u009cO\2\u01b4\u01b9\7\'\2"+
		"\2\u01b5\u01b9\7\36\2\2\u01b6\u01b7\7[\2\2\u01b7\u01b9\7k\2\2\u01b8\u01b4"+
		"\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c8\3\2\2\2\u01ba\u01c9\7=\2\2\u01bb\u01c9\7Z\2\2\u01bc\u01c6\7\u008d"+
		"\2\2\u01bd\u01be\7k\2\2\u01be\u01c3\5\u0094K\2\u01bf\u01c0\7\7\2\2\u01c0"+
		"\u01c2\5\u0094K\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01bd\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ba\3\2"+
		"\2\2\u01c8\u01bb\3\2\2\2\u01c8\u01bc\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01ce\7m\2\2\u01cb\u01cc\5\u008cG\2\u01cc\u01cd\7\4\2\2\u01cd\u01cf\3"+
		"\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d4\5\u008eH\2\u01d1\u01d2\7K\2\2\u01d2\u01d3\7B\2\2\u01d3\u01d5\7"+
		"\u0080\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2"+
		"\u01d6\u01d7\7\u0093\2\2\u01d7\u01d9\5P)\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e3\7(\2\2\u01db\u01e0\5B\"\2\u01dc"+
		"\u01e0\5\60\31\2\u01dd\u01e0\5 \21\2\u01de\u01e0\5> \2\u01df\u01db\3\2"+
		"\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\7\3\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\7D\2\2\u01e8\33\3\2\2\2\u01e9\u01eb\7\64\2"+
		"\2\u01ea\u01ec\t\5\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01f1\7\u0091\2\2\u01ee\u01ef\7R\2\2\u01ef\u01f0\7h\2\2"+
		"\u01f0\u01f2\7H\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f6"+
		"\3\2\2\2\u01f3\u01f4\5\u008cG\2\u01f4\u01f5\7\4\2\2\u01f5\u01f7\3\2\2"+
		"\2\u01f6\u01f3\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\5\u009eP\2\u01f9\u01fa\7#\2\2\u01fa\u01fb\5> \2\u01fb\35\3\2\2\2\u01fc"+
		"\u01fd\7\64\2\2\u01fd\u01fe\7\u0092\2\2\u01fe\u0202\7\u0084\2\2\u01ff"+
		"\u0200\7R\2\2\u0200\u0201\7h\2\2\u0201\u0203\7H\2\2\u0202\u01ff\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0207\3\2\2\2\u0204\u0205\5\u008cG\2\u0205"+
		"\u0206\7\4\2\2\u0206\u0208\3\2\2\2\u0207\u0204\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\5\u008eH\2\u020a\u020b\7\u008e\2"+
		"\2\u020b\u0217\5\u00a0Q\2\u020c\u020d\7\5\2\2\u020d\u0212\5\u0082B\2\u020e"+
		"\u020f\7\7\2\2\u020f\u0211\5\u0082B\2\u0210\u020e\3\2\2\2\u0211\u0214"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0216\7\6\2\2\u0216\u0218\3\2\2\2\u0217\u020c\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\37\3\2\2\2\u0219\u021b\5Z.\2\u021a\u0219"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7=\2\2\u021d"+
		"\u021e\7M\2\2\u021e\u0221\5\\/\2\u021f\u0220\7\u0094\2\2\u0220\u0222\5"+
		"P)\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222!\3\2\2\2\u0223\u0225"+
		"\5Z.\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0227\7=\2\2\u0227\u0228\7M\2\2\u0228\u022b\5\\/\2\u0229\u022a\7\u0094"+
		"\2\2\u022a\u022c\5P)\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u023f"+
		"\3\2\2\2\u022d\u022e\7o\2\2\u022e\u022f\7*\2\2\u022f\u0234\5^\60\2\u0230"+
		"\u0231\7\7\2\2\u0231\u0233\5^\60\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u022d\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023a\7d\2\2\u023a\u023d\5P)\2\u023b\u023c\t\4\2\2\u023c\u023e"+
		"\5P)\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u0237\3\2\2\2\u023f\u0240\3\2\2\2\u0240#\3\2\2\2\u0241\u0243\7?\2\2\u0242"+
		"\u0244\79\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245\u0246\5\u008cG\2\u0246%\3\2\2\2\u0247\u0248\7A\2\2\u0248\u024b"+
		"\7V\2\2\u0249\u024a\7R\2\2\u024a\u024c\7H\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u0250\3\2\2\2\u024d\u024e\5\u008cG\2\u024e\u024f"+
		"\7\4\2\2\u024f\u0251\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\5\u009aN\2\u0253\'\3\2\2\2\u0254\u0255\7A\2"+
		"\2\u0255\u0258\7\u0084\2\2\u0256\u0257\7R\2\2\u0257\u0259\7H\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025d\3\2\2\2\u025a\u025b\5\u008c"+
		"G\2\u025b\u025c\7\4\2\2\u025c\u025e\3\2\2\2\u025d\u025a\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5\u008eH\2\u0260)\3\2\2"+
		"\2\u0261\u0262\7A\2\2\u0262\u0265\7\u008a\2\2\u0263\u0264\7R\2\2\u0264"+
		"\u0266\7H\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u026a\3\2"+
		"\2\2\u0267\u0268\5\u008cG\2\u0268\u0269\7\4\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u009c"+
		"O\2\u026d+\3\2\2\2\u026e\u026f\7A\2\2\u026f\u0272\7\u0091\2\2\u0270\u0271"+
		"\7R\2\2\u0271\u0273\7H\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0277\3\2\2\2\u0274\u0275\5\u008cG\2\u0275\u0276\7\4\2\2\u0276\u0278"+
		"\3\2\2\2\u0277\u0274\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\5\u009eP\2\u027a-\3\2\2\2\u027b\u027d\7\u0095\2\2\u027c\u027e\7"+
		"v\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0284\5b\62\2\u0280\u0281\7\7\2\2\u0281\u0283\5b\62\2\u0282\u0280\3\2"+
		"\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u027b\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028f\5n8\2\u028a\u028b\5t;\2\u028b\u028c"+
		"\5n8\2\u028c\u028e\3\2\2\2\u028d\u028a\3\2\2\2\u028e\u0291\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u029c\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0292\u0293\7o\2\2\u0293\u0294\7*\2\2\u0294\u0299\5^\60\2\u0295\u0296"+
		"\7\7\2\2\u0296\u0298\5^\60\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029c\u0292\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a4\3\2\2\2\u029e"+
		"\u029f\7d\2\2\u029f\u02a2\5P)\2\u02a0\u02a1\t\4\2\2\u02a1\u02a3\5P)\2"+
		"\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u029e"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5/\3\2\2\2\u02a6\u02a8\5Z.\2\u02a7\u02a6"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ba\3\2\2\2\u02a9\u02bb\7Z\2\2\u02aa"+
		"\u02bb\7|\2\2\u02ab\u02ac\7Z\2\2\u02ac\u02ad\7n\2\2\u02ad\u02bb\7|\2\2"+
		"\u02ae\u02af\7Z\2\2\u02af\u02b0\7n\2\2\u02b0\u02bb\7\177\2\2\u02b1\u02b2"+
		"\7Z\2\2\u02b2\u02b3\7n\2\2\u02b3\u02bb\7\33\2\2\u02b4\u02b5\7Z\2\2\u02b5"+
		"\u02b6\7n\2\2\u02b6\u02bb\7J\2\2\u02b7\u02b8\7Z\2\2\u02b8\u02b9\7n\2\2"+
		"\u02b9\u02bb\7S\2\2\u02ba\u02a9\3\2\2\2\u02ba\u02aa\3\2\2\2\u02ba\u02ab"+
		"\3\2\2\2\u02ba\u02ae\3\2\2\2\u02ba\u02b1\3\2\2\2\u02ba\u02b4\3\2\2\2\u02ba"+
		"\u02b7\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c0\7]\2\2\u02bd\u02be\5\u008c"+
		"G\2\u02be\u02bf\7\4\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02ce\5\u008eH\2\u02c3\u02c4"+
		"\7\5\2\2\u02c4\u02c9\5\u0094K\2\u02c5\u02c6\7\7\2\2\u02c6\u02c8\5\u0094"+
		"K\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7\6"+
		"\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c3\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02ef\3\2\2\2\u02d0\u02d1\7\u0090\2\2\u02d1\u02d2\7\5\2\2\u02d2\u02d7"+
		"\5P)\2\u02d3\u02d4\7\7\2\2\u02d4\u02d6\5P)\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02e9\7\6\2\2\u02db\u02dc\7\7\2\2\u02dc"+
		"\u02dd\7\5\2\2\u02dd\u02e2\5P)\2\u02de\u02df\7\7\2\2\u02df\u02e1\5P)\2"+
		"\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\6\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02db\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02f0\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\u02f0\5> \2\u02ed\u02ee\7:\2\2\u02ee\u02f0\7\u0090\2\2\u02ef\u02d0\3"+
		"\2\2\2\u02ef\u02ec\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\61\3\2\2\2\u02f1"+
		"\u02f5\7r\2\2\u02f2\u02f3\5\u008cG\2\u02f3\u02f4\7\4\2\2\u02f4\u02f6\3"+
		"\2\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02fe\5\u00a2R\2\u02f8\u02f9\7\b\2\2\u02f9\u02ff\5`\61\2\u02fa\u02fb"+
		"\7\5\2\2\u02fb\u02fc\5`\61\2\u02fc\u02fd\7\6\2\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02f8\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\63\3\2\2"+
		"\2\u0300\u030b\7y\2\2\u0301\u030c\5\u0096L\2\u0302\u0303\5\u008cG\2\u0303"+
		"\u0304\7\4\2\2\u0304\u0306\3\2\2\2\u0305\u0302\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u0309\3\2\2\2\u0307\u030a\5\u008eH\2\u0308\u030a\5\u009aN\2"+
		"\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0301"+
		"\3\2\2\2\u030b\u0305\3\2\2\2\u030b\u030c\3\2\2\2\u030c\65\3\2\2\2\u030d"+
		"\u030f\7z\2\2\u030e\u0310\7\u0081\2\2\u030f\u030e\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\5\u00a4S\2\u0312\67\3\2\2\2\u0313"+
		"\u0318\7\177\2\2\u0314\u0316\7\u0089\2\2\u0315\u0317\5\u00a8U\2\u0316"+
		"\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0314\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u031f\3\2\2\2\u031a\u031c\7\u0088\2\2\u031b"+
		"\u031d\7\u0081\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u0320\5\u00a4S\2\u031f\u031a\3\2\2\2\u031f\u0320\3\2\2"+
		"\2\u03209\3\2\2\2\u0321\u0322\7\u0081\2\2\u0322\u0323\5\u00a4S\2\u0323"+
		";\3\2\2\2\u0324\u0326\7\u0095\2\2\u0325\u0327\7v\2\2\u0326\u0325\3\2\2"+
		"\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032d\5b\62\2\u0329\u032a"+
		"\7\7\2\2\u032a\u032c\5b\62\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u0330\u0324\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u033d\5n8\2\u0333\u0334\7o\2\2\u0334\u0335\7*\2\2\u0335\u033a\5^\60\2"+
		"\u0336\u0337\7\7\2\2\u0337\u0339\5^\60\2\u0338\u0336\3\2\2\2\u0339\u033c"+
		"\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033d\u0333\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0345\3\2"+
		"\2\2\u033f\u0340\7d\2\2\u0340\u0343\5P)\2\u0341\u0342\t\4\2\2\u0342\u0344"+
		"\5P)\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345"+
		"\u033f\3\2\2\2\u0345\u0346\3\2\2\2\u0346=\3\2\2\2\u0347\u0349\7\u0095"+
		"\2\2\u0348\u034a\7v\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u0350\5b\62\2\u034c\u034d\7\7\2\2\u034d\u034f\5b"+
		"\62\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0347\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u035b\5@!\2\u0356\u0357"+
		"\5t;\2\u0357\u0358\5@!\2\u0358\u035a\3\2\2\2\u0359\u0356\3\2\2\2\u035a"+
		"\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0368\3\2"+
		"\2\2\u035d\u035b\3\2\2\2\u035e\u035f\7o\2\2\u035f\u0360\7*\2\2\u0360\u0365"+
		"\5^\60\2\u0361\u0362\7\7\2\2\u0362\u0364\5^\60\2\u0363\u0361\3\2\2\2\u0364"+
		"\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0369\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u035e\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u0370\3\2\2\2\u036a\u036b\7d\2\2\u036b\u036e\5P)\2\u036c\u036d\t\4\2"+
		"\2\u036d\u036f\5P)\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371"+
		"\3\2\2\2\u0370\u036a\3\2\2\2\u0370\u0371\3\2\2\2\u0371?\3\2\2\2\u0372"+
		"\u0374\7\u0082\2\2\u0373\u0375\t\6\2\2\u0374\u0373\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037b\5d\63\2\u0377\u0378\7\7\2\2\u0378"+
		"\u037a\5d\63\2\u0379\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u038a\3\2\2\2\u037d\u037b\3\2\2\2\u037e"+
		"\u0388\7M\2\2\u037f\u0384\5f\64\2\u0380\u0381\7\7\2\2\u0381\u0383\5f\64"+
		"\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0389\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389\5h\65\2\u0388"+
		"\u037f\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u037e\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038d\7\u0094\2\2\u038d"+
		"\u038f\5P)\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u039e\3\2\2"+
		"\2\u0390\u0391\7P\2\2\u0391\u0392\7*\2\2\u0392\u0397\5P)\2\u0393\u0394"+
		"\7\7\2\2\u0394\u0396\5P)\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039c\3\2\2\2\u0399\u0397\3\2"+
		"\2\2\u039a\u039b\7Q\2\2\u039b\u039d\5P)\2\u039c\u039a\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u0390\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03bd\3\2\2\2\u03a0\u03a1\7\u0090\2\2\u03a1\u03a2\7\5\2\2\u03a2\u03a7"+
		"\5P)\2\u03a3\u03a4\7\7\2\2\u03a4\u03a6\5P)\2\u03a5\u03a3\3\2\2\2\u03a6"+
		"\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03b9\7\6\2\2\u03ab\u03ac\7\7\2\2\u03ac"+
		"\u03ad\7\5\2\2\u03ad\u03b2\5P)\2\u03ae\u03af\7\7\2\2\u03af\u03b1\5P)\2"+
		"\u03b0\u03ae\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3"+
		"\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\7\6\2\2\u03b6"+
		"\u03b8\3\2\2\2\u03b7\u03ab\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u0372\3\2\2\2\u03bc\u03a0\3\2\2\2\u03bdA\3\2\2\2\u03be\u03c0\5Z.\2\u03bf"+
		"\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03cc\7\u008d"+
		"\2\2\u03c2\u03c3\7n\2\2\u03c3\u03cd\7\177\2\2\u03c4\u03c5\7n\2\2\u03c5"+
		"\u03cd\7\33\2\2\u03c6\u03c7\7n\2\2\u03c7\u03cd\7|\2\2\u03c8\u03c9\7n\2"+
		"\2\u03c9\u03cd\7J\2\2\u03ca\u03cb\7n\2\2\u03cb\u03cd\7S\2\2\u03cc\u03c2"+
		"\3\2\2\2\u03cc\u03c4\3\2\2\2\u03cc\u03c6\3\2\2\2\u03cc\u03c8\3\2\2\2\u03cc"+
		"\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\5\\"+
		"/\2\u03cf\u03d0\7\u0083\2\2\u03d0\u03d1\5\u0094K\2\u03d1\u03d2\7\b\2\2"+
		"\u03d2\u03da\5P)\2\u03d3\u03d4\7\7\2\2\u03d4\u03d5\5\u0094K\2\u03d5\u03d6"+
		"\7\b\2\2\u03d6\u03d7\5P)\2\u03d7\u03d9\3\2\2\2\u03d8\u03d3\3\2\2\2\u03d9"+
		"\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03df\3\2"+
		"\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7\u0094\2\2\u03de\u03e0\5P)\2\u03df"+
		"\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0C\3\2\2\2\u03e1\u03e3\5Z.\2\u03e2"+
		"\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03ef\7\u008d"+
		"\2\2\u03e5\u03e6\7n\2\2\u03e6\u03f0\7\177\2\2\u03e7\u03e8\7n\2\2\u03e8"+
		"\u03f0\7\33\2\2\u03e9\u03ea\7n\2\2\u03ea\u03f0\7|\2\2\u03eb\u03ec\7n\2"+
		"\2\u03ec\u03f0\7J\2\2\u03ed\u03ee\7n\2\2\u03ee\u03f0\7S\2\2\u03ef\u03e5"+
		"\3\2\2\2\u03ef\u03e7\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03eb\3\2\2\2\u03ef"+
		"\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\5\\"+
		"/\2\u03f2\u03f3\7\u0083\2\2\u03f3\u03f4\5\u0094K\2\u03f4\u03f5\7\b\2\2"+
		"\u03f5\u03fd\5P)\2\u03f6\u03f7\7\7\2\2\u03f7\u03f8\5\u0094K\2\u03f8\u03f9"+
		"\7\b\2\2\u03f9\u03fa\5P)\2\u03fa\u03fc\3\2\2\2\u03fb\u03f6\3\2\2\2\u03fc"+
		"\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0402\3\2"+
		"\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\7\u0094\2\2\u0401\u0403\5P)\2\u0402"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0416\3\2\2\2\u0404\u0405\7o"+
		"\2\2\u0405\u0406\7*\2\2\u0406\u040b\5^\60\2\u0407\u0408\7\7\2\2\u0408"+
		"\u040a\5^\60\2\u0409\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2"+
		"\2\2\u040b\u040c\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040e"+
		"\u0404\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7d"+
		"\2\2\u0411\u0414\5P)\2\u0412\u0413\t\4\2\2\u0413\u0415\5P)\2\u0414\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u040e\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417E\3\2\2\2\u0418\u0419\7\u008f\2\2\u0419G\3\2\2\2\u041a"+
		"\u041c\5\u0094K\2\u041b\u041d\5J&\2\u041c\u041b\3\2\2\2\u041c\u041d\3"+
		"\2\2\2\u041d\u0421\3\2\2\2\u041e\u0420\5L\'\2\u041f\u041e\3\2\2\2\u0420"+
		"\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422I\3\2\2\2"+
		"\u0423\u0421\3\2\2\2\u0424\u0426\5\u0088E\2\u0425\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0433\3\2"+
		"\2\2\u0429\u042a\7\5\2\2\u042a\u042b\5x=\2\u042b\u042c\7\6\2\2\u042c\u0434"+
		"\3\2\2\2\u042d\u042e\7\5\2\2\u042e\u042f\5x=\2\u042f\u0430\7\7\2\2\u0430"+
		"\u0431\5x=\2\u0431\u0432\7\6\2\2\u0432\u0434\3\2\2\2\u0433\u0429\3\2\2"+
		"\2\u0433\u042d\3\2\2\2\u0433\u0434\3\2\2\2\u0434K\3\2\2\2\u0435\u0436"+
		"\7\63\2\2\u0436\u0438\5\u0088E\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2"+
		"\2\u0438\u045a\3\2\2\2\u0439\u043a\7s\2\2\u043a\u043c\7a\2\2\u043b\u043d"+
		"\t\7\2\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u0440\5N(\2\u043f\u0441\7&\2\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2"+
		"\2\u0441\u045b\3\2\2\2\u0442\u0444\7h\2\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7j\2\2\u0446\u045b\5N(\2\u0447"+
		"\u0448\7\u008c\2\2\u0448\u045b\5N(\2\u0449\u044a\7.\2\2\u044a\u044b\7"+
		"\5\2\2\u044b\u044c\5P)\2\u044c\u044d\7\6\2\2\u044d\u045b\3\2\2\2\u044e"+
		"\u0455\7:\2\2\u044f\u0456\5x=\2\u0450\u0456\5z>\2\u0451\u0452\7\5\2\2"+
		"\u0452\u0453\5P)\2\u0453\u0454\7\6\2\2\u0454\u0456\3\2\2\2\u0455\u044f"+
		"\3\2\2\2\u0455\u0450\3\2\2\2\u0455\u0451\3\2\2\2\u0456\u045b\3\2\2\2\u0457"+
		"\u0458\7/\2\2\u0458\u045b\5\u0096L\2\u0459\u045b\5R*\2\u045a\u0439\3\2"+
		"\2\2\u045a\u0443\3\2\2\2\u045a\u0447\3\2\2\2\u045a\u0449\3\2\2\2\u045a"+
		"\u044e\3\2\2\2\u045a\u0457\3\2\2\2\u045a\u0459\3\2\2\2\u045bM\3\2\2\2"+
		"\u045c\u045d\7m\2\2\u045d\u045e\7\62\2\2\u045e\u0460\t\b\2\2\u045f\u045c"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460O\3\2\2\2\u0461\u0462\b)\1\2\u0462\u0463"+
		"\5|?\2\u0463\u0464\5P)\27\u0464\u04ae\3\2\2\2\u0465\u04ae\5z>\2\u0466"+
		"\u04ae\7\u0099\2\2\u0467\u0468\5\u008cG\2\u0468\u0469\7\4\2\2\u0469\u046b"+
		"\3\2\2\2\u046a\u0467\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046d\5\u008eH\2\u046d\u046e\7\4\2\2\u046e\u0470\3\2\2\2\u046f\u046a"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u04ae\5\u0094K"+
		"\2\u0472\u0473\5\u008aF\2\u0473\u0480\7\5\2\2\u0474\u0476\7@\2\2\u0475"+
		"\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u047c\5P"+
		")\2\u0478\u0479\7\7\2\2\u0479\u047b\5P)\2\u047a\u0478\3\2\2\2\u047b\u047e"+
		"\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u0481\3\2\2\2\u047e"+
		"\u047c\3\2\2\2\u047f\u0481\7\t\2\2\u0480\u0475\3\2\2\2\u0480\u047f\3\2"+
		"\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7\6\2\2\u0483"+
		"\u04ae\3\2\2\2\u0484\u0485\7\5\2\2\u0485\u0486\5P)\2\u0486\u0487\7\6\2"+
		"\2\u0487\u04ae\3\2\2\2\u0488\u0489\7-\2\2\u0489\u048a\7\5\2\2\u048a\u048b"+
		"\5P)\2\u048b\u048c\7#\2\2\u048c\u048d\5J&\2\u048d\u048e\7\6\2\2\u048e"+
		"\u04ae\3\2\2\2\u048f\u0491\7h\2\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u0492\3\2\2\2\u0492\u0494\7H\2\2\u0493\u0490\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\7\5\2\2\u0496\u0497\5>"+
		" \2\u0497\u0498\7\6\2\2\u0498\u04ae\3\2\2\2\u0499\u049b\7,\2\2\u049a\u049c"+
		"\5P)\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a2\3\2\2\2\u049d"+
		"\u049e\7\u0093\2\2\u049e\u049f\5P)\2\u049f\u04a0\7\u0087\2\2\u04a0\u04a1"+
		"\5P)\2\u04a1\u04a3\3\2\2\2\u04a2\u049d\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a7\7C"+
		"\2\2\u04a7\u04a9\5P)\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa"+
		"\3\2\2\2\u04aa\u04ab\7D\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04ae\5T+\2\u04ad"+
		"\u0461\3\2\2\2\u04ad\u0465\3\2\2\2\u04ad\u0466\3\2\2\2\u04ad\u046f\3\2"+
		"\2\2\u04ad\u0472\3\2\2\2\u04ad\u0484\3\2\2\2\u04ad\u0488\3\2\2\2\u04ad"+
		"\u0493\3\2\2\2\u04ad\u0499\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae\u0507\3\2"+
		"\2\2\u04af\u04b0\f\26\2\2\u04b0\u04b1\7\r\2\2\u04b1\u0506\5P)\27\u04b2"+
		"\u04b3\f\25\2\2\u04b3\u04b4\t\t\2\2\u04b4\u0506\5P)\26\u04b5\u04b6\f\24"+
		"\2\2\u04b6\u04b7\t\n\2\2\u04b7\u0506\5P)\25\u04b8\u04b9\f\23\2\2\u04b9"+
		"\u04ba\t\13\2\2\u04ba\u0506\5P)\24\u04bb\u04bc\f\22\2\2\u04bc\u04bd\t"+
		"\f\2\2\u04bd\u0506\5P)\23\u04be\u04bf\f\21\2\2\u04bf\u04c0\5~@\2\u04c0"+
		"\u04c1\5P)\22\u04c1\u0506\3\2\2\2\u04c2\u04c3\f\20\2\2\u04c3\u04c4\7\""+
		"\2\2\u04c4\u0506\5P)\21\u04c5\u04c6\f\17\2\2\u04c6\u04c7\7n\2\2\u04c7"+
		"\u0506\5P)\20\u04c8\u04c9\f\b\2\2\u04c9\u04cb\7^\2\2\u04ca\u04cc\7h\2"+
		"\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u0506"+
		"\5P)\t\u04ce\u04d0\f\7\2\2\u04cf\u04d1\7h\2\2\u04d0\u04cf\3\2\2\2\u04d0"+
		"\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7)\2\2\u04d3\u04d4\5P)"+
		"\2\u04d4\u04d5\7\"\2\2\u04d5\u04d6\5P)\b\u04d6\u0506\3\2\2\2\u04d7\u04d8"+
		"\f\13\2\2\u04d8\u04d9\7/\2\2\u04d9\u0506\5\u0096L\2\u04da\u04dc\f\n\2"+
		"\2\u04db\u04dd\7h\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de"+
		"\3\2\2\2\u04de\u04df\t\r\2\2\u04df\u04e2\5P)\2\u04e0\u04e1\7E\2\2\u04e1"+
		"\u04e3\5P)\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u0506\3\2\2"+
		"\2\u04e4\u04e9\f\t\2\2\u04e5\u04ea\7_\2\2\u04e6\u04ea\7i\2\2\u04e7\u04e8"+
		"\7h\2\2\u04e8\u04ea\7j\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9"+
		"\u04e7\3\2\2\2\u04ea\u0506\3\2\2\2\u04eb\u04ed\f\6\2\2\u04ec\u04ee\7h"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u0503\7U\2\2\u04f0\u04fa\7\5\2\2\u04f1\u04fb\5> \2\u04f2\u04f7\5P)\2"+
		"\u04f3\u04f4\7\7\2\2\u04f4\u04f6\5P)\2\u04f5\u04f3\3\2\2\2\u04f6\u04f9"+
		"\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9"+
		"\u04f7\3\2\2\2\u04fa\u04f1\3\2\2\2\u04fa\u04f2\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fb\u04fc\3\2\2\2\u04fc\u0504\7\6\2\2\u04fd\u04fe\5\u008cG\2\u04fe"+
		"\u04ff\7\4\2\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0504\5\u008eH\2\u0503\u04f0\3\2\2\2\u0503"+
		"\u0500\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u04af\3\2\2\2\u0505\u04b2\3\2"+
		"\2\2\u0505\u04b5\3\2\2\2\u0505\u04b8\3\2\2\2\u0505\u04bb\3\2\2\2\u0505"+
		"\u04be\3\2\2\2\u0505\u04c2\3\2\2\2\u0505\u04c5\3\2\2\2\u0505\u04c8\3\2"+
		"\2\2\u0505\u04ce\3\2\2\2\u0505\u04d7\3\2\2\2\u0505\u04da\3\2\2\2\u0505"+
		"\u04e4\3\2\2\2\u0505\u04eb\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2"+
		"\2\2\u0507\u0508\3\2\2\2\u0508Q\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u050b"+
		"\7w\2\2\u050b\u0517\5\u0098M\2\u050c\u050d\7\5\2\2\u050d\u0512\5\u0094"+
		"K\2\u050e\u050f\7\7\2\2\u050f\u0511\5\u0094K\2\u0510\u050e\3\2\2\2\u0511"+
		"\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2"+
		"\2\2\u0514\u0512\3\2\2\2\u0515\u0516\7\6\2\2\u0516\u0518\3\2\2\2\u0517"+
		"\u050c\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u052b\3\2\2\2\u0519\u051a\7m"+
		"\2\2\u051a\u0523\t\16\2\2\u051b\u051c\7\u0083\2\2\u051c\u0524\7j\2\2\u051d"+
		"\u051e\7\u0083\2\2\u051e\u0524\7:\2\2\u051f\u0524\7+\2\2\u0520\u0524\7"+
		"}\2\2\u0521\u0522\7g\2\2\u0522\u0524\7\34\2\2\u0523\u051b\3\2\2\2\u0523"+
		"\u051d\3\2\2\2\u0523\u051f\3\2\2\2\u0523\u0520\3\2\2\2\u0523\u0521\3\2"+
		"\2\2\u0524\u0528\3\2\2\2\u0525\u0526\7e\2\2\u0526\u0528\5\u0088E\2\u0527"+
		"\u0519\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u0527\3\2"+
		"\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u0538\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u0530\7h\2\2\u052f\u052e\3\2"+
		"\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0536\7;\2\2\u0532"+
		"\u0533\7X\2\2\u0533\u0537\7<\2\2\u0534\u0535\7X\2\2\u0535\u0537\7T\2\2"+
		"\u0536\u0532\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0539"+
		"\3\2\2\2\u0538\u052f\3\2\2\2\u0538\u0539\3\2\2\2\u0539S\3\2\2\2\u053a"+
		"\u053b\7u\2\2\u053b\u0540\7\5\2\2\u053c\u0541\7S\2\2\u053d\u053e\t\17"+
		"\2\2\u053e\u053f\7\7\2\2\u053f\u0541\5\u0080A\2\u0540\u053c\3\2\2\2\u0540"+
		"\u053d\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\7\6\2\2\u0543U\3\2\2\2"+
		"\u0544\u0547\5\u0094K\2\u0545\u0546\7/\2\2\u0546\u0548\5\u0096L\2\u0547"+
		"\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549\u054b\t\7"+
		"\2\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054bW\3\2\2\2\u054c\u054d"+
		"\7\63\2\2\u054d\u054f\5\u0088E\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2"+
		"\2\u054f\u0574\3\2\2\2\u0550\u0551\7s\2\2\u0551\u0554\7a\2\2\u0552\u0554"+
		"\7\u008c\2\2\u0553\u0550\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u0555\3\2\2"+
		"\2\u0555\u0556\7\5\2\2\u0556\u055b\5V,\2\u0557\u0558\7\7\2\2\u0558\u055a"+
		"\5V,\2\u0559\u0557\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u055f\7\6"+
		"\2\2\u055f\u0560\5N(\2\u0560\u0575\3\2\2\2\u0561\u0562\7.\2\2\u0562\u0563"+
		"\7\5\2\2\u0563\u0564\5P)\2\u0564\u0565\7\6\2\2\u0565\u0575\3\2\2\2\u0566"+
		"\u0567\7L\2\2\u0567\u0568\7a\2\2\u0568\u0569\7\5\2\2\u0569\u056e\5\u0094"+
		"K\2\u056a\u056b\7\7\2\2\u056b\u056d\5\u0094K\2\u056c\u056a\3\2\2\2\u056d"+
		"\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2"+
		"\2\2\u0570\u056e\3\2\2\2\u0571\u0572\7\6\2\2\u0572\u0573\5R*\2\u0573\u0575"+
		"\3\2\2\2\u0574\u0553\3\2\2\2\u0574\u0561\3\2\2\2\u0574\u0566\3\2\2\2\u0575"+
		"Y\3\2\2\2\u0576\u0578\7\u0095\2\2\u0577\u0579\7v\2\2\u0578\u0577\3\2\2"+
		"\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\5v<\2\u057b\u057c"+
		"\7#\2\2\u057c\u057d\7\5\2\2\u057d\u057e\5> \2\u057e\u0588\7\6\2\2\u057f"+
		"\u0580\7\7\2\2\u0580\u0581\5v<\2\u0581\u0582\7#\2\2\u0582\u0583\7\5\2"+
		"\2\u0583\u0584\5> \2\u0584\u0585\7\6\2\2\u0585\u0587\3\2\2\2\u0586\u057f"+
		"\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"[\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058c\5\u008cG\2\u058c\u058d\7\4\2"+
		"\2\u058d\u058f\3\2\2\2\u058e\u058b\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0596\5\u008eH\2\u0591\u0592\7W\2\2\u0592\u0593\7*\2\2"+
		"\u0593\u0597\5\u009aN\2\u0594\u0595\7h\2\2\u0595\u0597\7W\2\2\u0596\u0591"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597]\3\2\2\2\u0598"+
		"\u059b\5P)\2\u0599\u059a\7/\2\2\u059a\u059c\5\u0096L\2\u059b\u0599\3\2"+
		"\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059f\t\7\2\2\u059e"+
		"\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f_\3\2\2\2\u05a0\u05a4\5x=\2\u05a1"+
		"\u05a4\5\u0088E\2\u05a2\u05a4\7\u009a\2\2\u05a3\u05a0\3\2\2\2\u05a3\u05a1"+
		"\3\2\2\2\u05a3\u05a2\3\2\2\2\u05a4a\3\2\2\2\u05a5\u05b1\5\u008eH\2\u05a6"+
		"\u05a7\7\5\2\2\u05a7\u05ac\5\u0094K\2\u05a8\u05a9\7\7\2\2\u05a9\u05ab"+
		"\5\u0094K\2\u05aa\u05a8\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2"+
		"\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0"+
		"\7\6\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05a6\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b4\7#\2\2\u05b4\u05b5\7\5\2\2\u05b5\u05b6\5> "+
		"\2\u05b6\u05b7\7\6\2\2\u05b7c\3\2\2\2\u05b8\u05c5\7\t\2\2\u05b9\u05ba"+
		"\5\u008eH\2\u05ba\u05bb\7\4\2\2\u05bb\u05bc\7\t\2\2\u05bc\u05c5\3\2\2"+
		"\2\u05bd\u05c2\5P)\2\u05be\u05c0\7#\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\5\u0084C\2\u05c2\u05bf\3\2\2"+
		"\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05b8\3\2\2\2\u05c4\u05b9"+
		"\3\2\2\2\u05c4\u05bd\3\2\2\2\u05c5e\3\2\2\2\u05c6\u05c7\5\u008cG\2\u05c7"+
		"\u05c8\7\4\2\2\u05c8\u05ca\3\2\2\2\u05c9\u05c6\3\2\2\2\u05c9\u05ca\3\2"+
		"\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05d0\5\u008eH\2\u05cc\u05ce\7#\2\2\u05cd"+
		"\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\5\u00a6"+
		"T\2\u05d0\u05cd\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d7\3\2\2\2\u05d2"+
		"\u05d3\7W\2\2\u05d3\u05d4\7*\2\2\u05d4\u05d8\5\u009aN\2\u05d5\u05d6\7"+
		"h\2\2\u05d6\u05d8\7W\2\2\u05d7\u05d2\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05f6\3\2\2\2\u05d9\u05e3\7\5\2\2\u05da\u05df\5f"+
		"\64\2\u05db\u05dc\7\7\2\2\u05dc\u05de\5f\64\2\u05dd\u05db\3\2\2\2\u05de"+
		"\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e4\3\2"+
		"\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e4\5h\65\2\u05e3\u05da\3\2\2\2\u05e3"+
		"\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05ea\7\6\2\2\u05e6\u05e8\7#"+
		"\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"+
		"\u05eb\5\u00a6T\2\u05ea\u05e7\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05f6"+
		"\3\2\2\2\u05ec\u05ed\7\5\2\2\u05ed\u05ee\5> \2\u05ee\u05f3\7\6\2\2\u05ef"+
		"\u05f1\7#\2\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f4\5\u00a6T\2\u05f3\u05f0\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05f6\3\2\2\2\u05f5\u05c9\3\2\2\2\u05f5\u05d9\3\2\2\2\u05f5\u05ec\3\2"+
		"\2\2\u05f6g\3\2\2\2\u05f7\u05fe\5f\64\2\u05f8\u05f9\5j\66\2\u05f9\u05fa"+
		"\5f\64\2\u05fa\u05fb\5l\67\2\u05fb\u05fd\3\2\2\2\u05fc\u05f8\3\2\2\2\u05fd"+
		"\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ffi\3\2\2\2"+
		"\u0600\u05fe\3\2\2\2\u0601\u060f\7\7\2\2\u0602\u0604\7f\2\2\u0603\u0602"+
		"\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u060b\3\2\2\2\u0605\u0607\7b\2\2\u0606"+
		"\u0608\7p\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060c\3\2"+
		"\2\2\u0609\u060c\7Y\2\2\u060a\u060c\7\65\2\2\u060b\u0605\3\2\2\2\u060b"+
		"\u0609\3\2\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060f\7`\2\2\u060e\u0601\3\2\2\2\u060e\u0603\3\2\2\2\u060f"+
		"k\3\2\2\2\u0610\u0611\7m\2\2\u0611\u061f\5P)\2\u0612\u0613\7\u008e\2\2"+
		"\u0613\u0614\7\5\2\2\u0614\u0619\5\u0094K\2\u0615\u0616\7\7\2\2\u0616"+
		"\u0618\5\u0094K\2\u0617\u0615\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\3\2\2\2\u061b\u0619\3\2\2\2\u061c"+
		"\u061d\7\6\2\2\u061d\u061f\3\2\2\2\u061e\u0610\3\2\2\2\u061e\u0612\3\2"+
		"\2\2\u061e\u061f\3\2\2\2\u061fm\3\2\2\2\u0620\u0622\7\u0082\2\2\u0621"+
		"\u0623\t\6\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0631\5p9\2\u0625\u062f\7M\2\2\u0626\u062b\5f\64\2\u0627\u0628"+
		"\7\7\2\2\u0628\u062a\5f\64\2\u0629\u0627\3\2\2\2\u062a\u062d\3\2\2\2\u062b"+
		"\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0630\3\2\2\2\u062d\u062b\3\2"+
		"\2\2\u062e\u0630\5h\65\2\u062f\u0626\3\2\2\2\u062f\u062e\3\2\2\2\u0630"+
		"\u0632\3\2\2\2\u0631\u0625\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0642\5r:\2\u0634\u0635\7P\2\2\u0635\u0636\7*\2\2\u0636\u063b"+
		"\5P)\2\u0637\u0638\7\7\2\2\u0638\u063a\5P)\2\u0639\u0637\3\2\2\2\u063a"+
		"\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u0640\3\2"+
		"\2\2\u063d\u063b\3\2\2\2\u063e\u063f\7Q\2\2\u063f\u0641\5P)\2\u0640\u063e"+
		"\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0634\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0661\3\2\2\2\u0644\u0645\7\u0090\2\2\u0645\u0646"+
		"\7\5\2\2\u0646\u064b\5P)\2\u0647\u0648\7\7\2\2\u0648\u064a\5P)\2\u0649"+
		"\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2"+
		"\2\2\u064c\u064e\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u065d\7\6\2\2\u064f"+
		"\u0650\7\7\2\2\u0650\u0651\7\5\2\2\u0651\u0656\5P)\2\u0652\u0653\7\7\2"+
		"\2\u0653\u0655\5P)\2\u0654\u0652\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654"+
		"\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u065a\7\6\2\2\u065a\u065c\3\2\2\2\u065b\u064f\3\2\2\2\u065c\u065f\3\2"+
		"\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0661\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u0660\u0620\3\2\2\2\u0660\u0644\3\2\2\2\u0661o\3\2\2\2"+
		"\u0662\u0667\5d\63\2\u0663\u0664\7\7\2\2\u0664\u0666\5d\63\2\u0665\u0663"+
		"\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"q\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066b\7\u0094\2\2\u066b\u066d\5P)"+
		"\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066ds\3\2\2\2\u066e\u0674"+
		"\7\u008b\2\2\u066f\u0670\7\u008b\2\2\u0670\u0674\7\37\2\2\u0671\u0674"+
		"\7\\\2\2\u0672\u0674\7F\2\2\u0673\u066e\3\2\2\2\u0673\u066f\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0674u\3\2\2\2\u0675\u0681\5\u008e"+
		"H\2\u0676\u0677\7\5\2\2\u0677\u067c\5\u0094K\2\u0678\u0679\7\7\2\2\u0679"+
		"\u067b\5\u0094K\2\u067a\u0678\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a"+
		"\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u067c\3\2\2\2\u067f"+
		"\u0680\7\6\2\2\u0680\u0682\3\2\2\2\u0681\u0676\3\2\2\2\u0681\u0682\3\2"+
		"\2\2\u0682w\3\2\2\2\u0683\u0685\t\n\2\2\u0684\u0683\3\2\2\2\u0684\u0685"+
		"\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\7\u0098\2\2\u0687y\3\2\2\2\u0688"+
		"\u0689\t\20\2\2\u0689{\3\2\2\2\u068a\u068b\t\21\2\2\u068b}\3\2\2\2\u068c"+
		"\u0699\7\b\2\2\u068d\u0699\7\30\2\2\u068e\u0699\7\31\2\2\u068f\u0699\7"+
		"\32\2\2\u0690\u0699\7^\2\2\u0691\u0692\7^\2\2\u0692\u0699\7h\2\2\u0693"+
		"\u0699\7U\2\2\u0694\u0699\7c\2\2\u0695\u0699\7O\2\2\u0696\u0699\7e\2\2"+
		"\u0697\u0699\7x\2\2\u0698\u068c\3\2\2\2\u0698\u068d\3\2\2\2\u0698\u068e"+
		"\3\2\2\2\u0698\u068f\3\2\2\2\u0698\u0690\3\2\2\2\u0698\u0691\3\2\2\2\u0698"+
		"\u0693\3\2\2\2\u0698\u0694\3\2\2\2\u0698\u0695\3\2\2\2\u0698\u0696\3\2"+
		"\2\2\u0698\u0697\3\2\2\2\u0699\177\3\2\2\2\u069a\u069b\7\u009a\2\2\u069b"+
		"\u0081\3\2\2\2\u069c\u069f\5P)\2\u069d\u069f\5H%\2\u069e\u069c\3\2\2\2"+
		"\u069e\u069d\3\2\2\2\u069f\u0083\3\2\2\2\u06a0\u06a1\t\22\2\2\u06a1\u0085"+
		"\3\2\2\2\u06a2\u06a3\t\23\2\2\u06a3\u0087\3\2\2\2\u06a4\u06a5\5\u00aa"+
		"V\2\u06a5\u0089\3\2\2\2\u06a6\u06a7\5\u00aaV\2\u06a7\u008b\3\2\2\2\u06a8"+
		"\u06a9\5\u00aaV\2\u06a9\u008d\3\2\2\2\u06aa\u06ab\5\u00aaV\2\u06ab\u008f"+
		"\3\2\2\2\u06ac\u06ad\5\u00aaV\2\u06ad\u0091\3\2\2\2\u06ae\u06af\5\u00aa"+
		"V\2\u06af\u0093\3\2\2\2\u06b0\u06b1\5\u00aaV\2\u06b1\u0095\3\2\2\2\u06b2"+
		"\u06b3\5\u00aaV\2\u06b3\u0097\3\2\2\2\u06b4\u06b5\5\u00aaV\2\u06b5\u0099"+
		"\3\2\2\2\u06b6\u06b7\5\u00aaV\2\u06b7\u009b\3\2\2\2\u06b8\u06b9\5\u00aa"+
		"V\2\u06b9\u009d\3\2\2\2\u06ba\u06bb\5\u00aaV\2\u06bb\u009f\3\2\2\2\u06bc"+
		"\u06bd\5\u00aaV\2\u06bd\u00a1\3\2\2\2\u06be\u06bf\5\u00aaV\2\u06bf\u00a3"+
		"\3\2\2\2\u06c0\u06c1\5\u00aaV\2\u06c1\u00a5\3\2\2\2\u06c2\u06c3\5\u00aa"+
		"V\2\u06c3\u00a7\3\2\2\2\u06c4\u06c5\5\u00aaV\2\u06c5\u00a9\3\2\2\2\u06c6"+
		"\u06ce\7\u0097\2\2\u06c7\u06ce\5\u0086D\2\u06c8\u06ce\7\u009a\2\2\u06c9"+
		"\u06ca\7\5\2\2\u06ca\u06cb\5\u00aaV\2\u06cb\u06cc\7\6\2\2\u06cc\u06ce"+
		"\3\2\2\2\u06cd\u06c6\3\2\2\2\u06cd\u06c7\3\2\2\2\u06cd\u06c8\3\2\2\2\u06cd"+
		"\u06c9\3\2\2\2\u06ce\u00ab\3\2\2\2\u00f6\u00ae\u00b0\u00bb\u00c2\u00c7"+
		"\u00cd\u00d3\u00d5\u00f5\u00fc\u0104\u0107\u0110\u0114\u011c\u0120\u0122"+
		"\u0127\u0129\u012d\u0134\u0137\u013c\u0140\u0145\u014e\u0151\u0157\u0159"+
		"\u015d\u0163\u0168\u0173\u0179\u017d\u0183\u0188\u0191\u0198\u019e\u01a2"+
		"\u01a6\u01ac\u01b1\u01b8\u01c3\u01c6\u01c8\u01ce\u01d4\u01d8\u01df\u01e5"+
		"\u01eb\u01f1\u01f6\u0202\u0207\u0212\u0217\u021a\u0221\u0224\u022b\u0234"+
		"\u0237\u023d\u023f\u0243\u024b\u0250\u0258\u025d\u0265\u026a\u0272\u0277"+
		"\u027d\u0284\u0287\u028f\u0299\u029c\u02a2\u02a4\u02a7\u02ba\u02c0\u02c9"+
		"\u02ce\u02d7\u02e2\u02e9\u02ef\u02f5\u02fe\u0305\u0309\u030b\u030f\u0316"+
		"\u0318\u031c\u031f\u0326\u032d\u0330\u033a\u033d\u0343\u0345\u0349\u0350"+
		"\u0353\u035b\u0365\u0368\u036e\u0370\u0374\u037b\u0384\u0388\u038a\u038e"+
		"\u0397\u039c\u039e\u03a7\u03b2\u03b9\u03bc\u03bf\u03cc\u03da\u03df\u03e2"+
		"\u03ef\u03fd\u0402\u040b\u040e\u0414\u0416\u041c\u0421\u0427\u0433\u0437"+
		"\u043c\u0440\u0443\u0455\u045a\u045f\u046a\u046f\u0475\u047c\u0480\u0490"+
		"\u0493\u049b\u04a4\u04a8\u04ad\u04cb\u04d0\u04dc\u04e2\u04e9\u04ed\u04f7"+
		"\u04fa\u0500\u0503\u0505\u0507\u0512\u0517\u0523\u0527\u052b\u052f\u0536"+
		"\u0538\u0540\u0547\u054a\u054e\u0553\u055b\u056e\u0574\u0578\u0588\u058e"+
		"\u0596\u059b\u059e\u05a3\u05ac\u05b1\u05bf\u05c2\u05c4\u05c9\u05cd\u05d0"+
		"\u05d7\u05df\u05e3\u05e7\u05ea\u05f0\u05f3\u05f5\u05fe\u0603\u0607\u060b"+
		"\u060e\u0619\u061e\u0622\u062b\u062f\u0631\u063b\u0640\u0642\u064b\u0656"+
		"\u065d\u0660\u0667\u066c\u0673\u067c\u0681\u0684\u0698\u069e\u06cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}