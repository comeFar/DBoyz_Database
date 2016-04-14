// Generated from C:/Users/Yi/DBoyz_Database/src\DBoyzSQL.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBoyzSQLParser}.
 */
public interface DBoyzSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DBoyzSQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DBoyzSQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(DBoyzSQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(DBoyzSQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(DBoyzSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(DBoyzSQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(DBoyzSQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(DBoyzSQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(DBoyzSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(DBoyzSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(DBoyzSQLParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(DBoyzSQLParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(DBoyzSQLParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(DBoyzSQLParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(DBoyzSQLParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(DBoyzSQLParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(DBoyzSQLParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(DBoyzSQLParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(DBoyzSQLParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(DBoyzSQLParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(DBoyzSQLParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(DBoyzSQLParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(DBoyzSQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(DBoyzSQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(DBoyzSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(DBoyzSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(DBoyzSQLParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(DBoyzSQLParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(DBoyzSQLParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(DBoyzSQLParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(DBoyzSQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(DBoyzSQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(DBoyzSQLParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(DBoyzSQLParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(DBoyzSQLParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(DBoyzSQLParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(DBoyzSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(DBoyzSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(DBoyzSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(DBoyzSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(DBoyzSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(DBoyzSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(DBoyzSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(DBoyzSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(DBoyzSQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(DBoyzSQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(DBoyzSQLParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(DBoyzSQLParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(DBoyzSQLParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(DBoyzSQLParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(DBoyzSQLParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(DBoyzSQLParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(DBoyzSQLParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(DBoyzSQLParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(DBoyzSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(DBoyzSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(DBoyzSQLParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(DBoyzSQLParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(DBoyzSQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(DBoyzSQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(DBoyzSQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(DBoyzSQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(DBoyzSQLParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(DBoyzSQLParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(DBoyzSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(DBoyzSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(DBoyzSQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(DBoyzSQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(DBoyzSQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(DBoyzSQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(DBoyzSQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(DBoyzSQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(DBoyzSQLParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(DBoyzSQLParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOP}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOP(DBoyzSQLParser.BinaryOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOP}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOP(DBoyzSQLParser.BinaryOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code undecided}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUndecided(DBoyzSQLParser.UndecidedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code undecided}
	 * labeled alternative in {@link DBoyzSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUndecided(DBoyzSQLParser.UndecidedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(DBoyzSQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(DBoyzSQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(DBoyzSQLParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(DBoyzSQLParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(DBoyzSQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(DBoyzSQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(DBoyzSQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(DBoyzSQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(DBoyzSQLParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(DBoyzSQLParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(DBoyzSQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(DBoyzSQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(DBoyzSQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(DBoyzSQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(DBoyzSQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(DBoyzSQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(DBoyzSQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(DBoyzSQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(DBoyzSQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(DBoyzSQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(DBoyzSQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(DBoyzSQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(DBoyzSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(DBoyzSQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(DBoyzSQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(DBoyzSQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(DBoyzSQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(DBoyzSQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(DBoyzSQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(DBoyzSQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#projection_clause}.
	 * @param ctx the parse tree
	 */
	void enterProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#projection_clause}.
	 * @param ctx the parse tree
	 */
	void exitProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(DBoyzSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(DBoyzSQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(DBoyzSQLParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(DBoyzSQLParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(DBoyzSQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(DBoyzSQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(DBoyzSQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(DBoyzSQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(DBoyzSQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(DBoyzSQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(DBoyzSQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(DBoyzSQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(DBoyzSQLParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(DBoyzSQLParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(DBoyzSQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(DBoyzSQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(DBoyzSQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(DBoyzSQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(DBoyzSQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(DBoyzSQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(DBoyzSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(DBoyzSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DBoyzSQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DBoyzSQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(DBoyzSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(DBoyzSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(DBoyzSQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(DBoyzSQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(DBoyzSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(DBoyzSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(DBoyzSQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(DBoyzSQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(DBoyzSQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(DBoyzSQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(DBoyzSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(DBoyzSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(DBoyzSQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(DBoyzSQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(DBoyzSQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(DBoyzSQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(DBoyzSQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(DBoyzSQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(DBoyzSQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(DBoyzSQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(DBoyzSQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(DBoyzSQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(DBoyzSQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(DBoyzSQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(DBoyzSQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(DBoyzSQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(DBoyzSQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(DBoyzSQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(DBoyzSQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(DBoyzSQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(DBoyzSQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(DBoyzSQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBoyzSQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(DBoyzSQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBoyzSQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(DBoyzSQLParser.Any_nameContext ctx);
}