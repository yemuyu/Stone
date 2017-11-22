package com.xy.token;

import com.xy.exception.StoneException;

/**
 * 抽象类
 * 解析返回的"单词"
 * @author liufq
 *
 */
public abstract class Token {
	//new Token(-1){}是匿名内部类写法
	//属性引用自身类的对象,静态属性才可以
	public static final Token EOF = new Token(-1) {}; // end of file
	public static final String EOL = "\\n"; // end of line
	private int lineNumber;

	protected Token(int line) {
		lineNumber = line;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public boolean isIdentifier() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public int getNumber() {
		throw new StoneException("not number token");
	}

	public String getText() {
		return "";
	}
}
