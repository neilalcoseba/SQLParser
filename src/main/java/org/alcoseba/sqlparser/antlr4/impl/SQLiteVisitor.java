package org.alcoseba.sqlparser.antlr4.impl;

import org.alcoseba.sqlparser.antlr4.SQLiteBaseListener;
import org.alcoseba.sqlparser.antlr4.SQLiteParser.Create_index_stmtContext;
import org.alcoseba.sqlparser.antlr4.SQLiteParser.Create_table_stmtContext;
import org.alcoseba.sqlparser.antlr4.SQLiteParser.Table_nameContext;

public class SQLiteVisitor extends SQLiteBaseListener {

	@Override
	public void enterCreate_table_stmt(Create_table_stmtContext ctx) {
		System.out.println("Entering Create Table");

		super.enterCreate_table_stmt(ctx);
	}

	@Override
	public void enterCreate_index_stmt(Create_index_stmtContext ctx) {
		super.enterCreate_index_stmt(ctx);
	}

	@Override
	public void enterTable_name(Table_nameContext ctx) {
		System.out.println("Table Name : " + ctx.getText());

		super.enterTable_name(ctx);
	}
}
