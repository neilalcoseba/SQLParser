package org.alcoseba.sqlparser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.alcoseba.sqlparser.antlr4.SQLiteLexer;
import org.alcoseba.sqlparser.antlr4.SQLiteParser;
import org.alcoseba.sqlparser.antlr4.impl.SQLiteVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
	public static void main(String[] args) throws IOException {
		String input = "create table t (s char(19))";
		InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
		SQLiteLexer sqliteLexer = new SQLiteLexer(CharStreams.fromStream(stream));
		CommonTokenStream tokens = new CommonTokenStream(sqliteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);
		ParseTree tree = parser.parse();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new SQLiteVisitor(), tree);
	}
}
