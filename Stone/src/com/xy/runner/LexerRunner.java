package com.xy.runner;

import com.xy.exception.ParseException;
import com.xy.lexer.Lexer;
import com.xy.token.Token;

public class LexerRunner {
    public static void main(String[] args) throws ParseException {
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; )
            System.out.println("=> " + t.getText());
    }
}
