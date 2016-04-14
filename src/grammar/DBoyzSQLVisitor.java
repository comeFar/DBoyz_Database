// Generated from C:/Users/Yi/DBoyz_Database/src\DBoyzSQL.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBoyzSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBoyzSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DBoyzSQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(DBoyzSQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(DBoyzSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(DBoyzSQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(DBoyzSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(DBoyzSQLParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(DBoyzSQLParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(DBoyzSQLParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(DBoyzSQLParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(DBoyzSQLParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(DBoyzSQLParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(DBoyzSQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(DBoyzSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(DBoyzSQLParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(DBoyzSQLParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(DBoyzSQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(DBoyzSQLParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(DBoyzSQLParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(DBoyzSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(DBoyzSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(DBoyzSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(DBoyzSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(DBoyzSQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(DBoyzSQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(DBoyzSQLParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(DBoyzSQLParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(DBoyzSQLParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(DBoyzSQLParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(DBoyzSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(DBoyzSQLParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(DBoyzSQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(DBoyzSQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(DBoyzSQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(DBoyzSQLParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(DBoyzSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(DBoyzSQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(DBoyzSQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(DBoyzSQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(DBoyzSQLParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOP}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOP(DBoyzSQLParser.BinaryOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code undecided}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndecided(DBoyzSQLParser.UndecidedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(DBoyzSQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(DBoyzSQLParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(DBoyzSQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(DBoyzSQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(DBoyzSQLParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(DBoyzSQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(DBoyzSQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(DBoyzSQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(DBoyzSQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(DBoyzSQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(DBoyzSQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(DBoyzSQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(DBoyzSQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(DBoyzSQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(DBoyzSQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#projection_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(DBoyzSQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(DBoyzSQLParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(DBoyzSQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(DBoyzSQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(DBoyzSQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(DBoyzSQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(DBoyzSQLParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(DBoyzSQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(DBoyzSQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(DBoyzSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(DBoyzSQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DBoyzSQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(DBoyzSQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(DBoyzSQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(DBoyzSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(DBoyzSQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(DBoyzSQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(DBoyzSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(DBoyzSQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(DBoyzSQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(DBoyzSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(DBoyzSQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(DBoyzSQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(DBoyzSQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(DBoyzSQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(DBoyzSQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(DBoyzSQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(DBoyzSQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBoyzSQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(DBoyzSQLParser.Any_nameContext ctx);
}