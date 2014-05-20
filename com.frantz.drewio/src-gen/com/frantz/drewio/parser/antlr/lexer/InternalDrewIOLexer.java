package com.frantz.drewio.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDrewIOLexer extends Lexer {
    public static final int RULE_ID=19;
    public static final int RULE_ANY_OTHER=25;
    public static final int KEYWORD_1=13;
    public static final int KEYWORD_15=4;
    public static final int KEYWORD_5=17;
    public static final int KEYWORD_4=16;
    public static final int KEYWORD_13=5;
    public static final int KEYWORD_3=15;
    public static final int KEYWORD_14=6;
    public static final int KEYWORD_2=14;
    public static final int KEYWORD_11=7;
    public static final int RULE_SL_COMMENT=23;
    public static final int EOF=-1;
    public static final int KEYWORD_12=8;
    public static final int KEYWORD_10=10;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_STRING=21;
    public static final int KEYWORD_6=18;
    public static final int KEYWORD_7=12;
    public static final int KEYWORD_8=11;
    public static final int KEYWORD_9=9;
    public static final int RULE_INT=20;
    public static final int RULE_WS=24;

    // delegates
    // delegators

    public InternalDrewIOLexer() {;} 
    public InternalDrewIOLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDrewIOLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g"; }

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:19:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:19:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:21:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:21:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:23:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:23:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:25:12: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:25:14: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:27:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:27:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:29:11: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:29:13: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:31:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:31:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:33:11: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:33:13: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:35:11: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:35:13: ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:37:11: ( '(' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:37:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:39:11: ( ')' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:39:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:41:11: ( ',' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:41:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:43:11: ( ';' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:43:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:45:11: ( '{' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:45:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:47:11: ( '}' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:47:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:51:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:51:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:51:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:51:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:51:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:53:10: ( ( '0' .. '9' )+ )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:53:12: ( '0' .. '9' )+
            {
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:53:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:53:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:55:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:57:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:57:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:57:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:57:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:41: ( '\\r' )? '\\n'
                    {
                    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:59:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:61:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:61:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:61:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:63:16: ( . )
            // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:63:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:8: ( KEYWORD_15 | KEYWORD_13 | KEYWORD_14 | KEYWORD_11 | KEYWORD_12 | KEYWORD_9 | KEYWORD_10 | KEYWORD_8 | KEYWORD_7 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=22;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:10: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 2 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:21: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 3 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:32: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 4 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:43: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 5 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:54: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 6 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:65: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 7 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:75: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 8 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:86: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 9 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:96: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 10 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:106: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 11 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:116: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 12 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:126: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 13 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:136: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 14 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:146: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 15 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:156: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 16 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:166: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../com.frantz.drewio/src-gen/com/frantz/drewio/parser/antlr/lexer/InternalDrewIOLexer.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\27\6\uffff\1\25\2\uffff\3\25\2\uffff\1\27\1\uffff\3"+
        "\27\1\57\3\27\13\uffff\5\27\1\uffff\12\27\1\102\3\27\1\106\2\27"+
        "\1\111\1\uffff\3\27\1\uffff\1\115\1\116\1\uffff\1\27\1\120\1\121"+
        "\2\uffff\1\122\3\uffff";
    static final String DFA12_eofS =
        "\123\uffff";
    static final String DFA12_minS =
        "\1\0\1\105\1\117\2\116\1\124\1\114\1\131\6\uffff\1\101\2\uffff"+
        "\2\0\1\52\2\uffff\1\103\1\uffff\1\117\1\120\1\124\1\60\1\122\1\117"+
        "\1\120\13\uffff\1\105\1\114\1\105\1\125\1\120\1\uffff\1\111\1\101"+
        "\1\105\1\111\1\105\1\107\1\124\1\125\1\116\1\124\1\60\1\126\1\101"+
        "\1\105\1\60\1\124\1\107\1\60\1\uffff\1\105\1\116\1\122\1\uffff\2"+
        "\60\1\uffff\1\123\2\60\2\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\157\1\156\1\165\1\164\1\154\1\171\6\uffff\1\172"+
        "\2\uffff\2\uffff\1\57\2\uffff\1\143\1\uffff\1\157\2\164\1\172\1"+
        "\162\1\157\1\160\13\uffff\1\145\1\154\1\145\1\165\1\160\1\uffff"+
        "\1\151\1\141\1\145\1\151\1\145\1\147\1\164\1\165\1\156\1\164\1\172"+
        "\1\166\1\141\1\145\1\172\1\164\1\147\1\172\1\uffff\1\145\1\156\1"+
        "\162\1\uffff\2\172\1\uffff\1\163\2\172\2\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\20\1\21\3\uffff"+
        "\1\25\1\26\1\uffff\1\20\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\21\1\22\1\23\1\24\1\25\5\uffff\1\11\22\uffff\1\10\3\uffff\1\7\2"+
        "\uffff\1\6\3\uffff\1\4\1\5\1\uffff\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\1\0\20\uffff\1\2\1\1\100\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\1\10\1"+
            "\11\2\25\1\12\2\25\1\23\12\20\1\25\1\13\5\25\1\17\1\2\3\17\1"+
            "\6\2\17\1\3\5\17\1\4\2\17\1\1\1\5\1\7\6\17\3\25\1\16\1\17\1"+
            "\25\1\17\1\2\3\17\1\6\2\17\1\3\5\17\1\4\2\17\1\1\1\5\1\7\6\17"+
            "\1\14\1\25\1\15\uff82\25",
            "\1\26\37\uffff\1\26",
            "\1\30\37\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "\1\33\6\uffff\1\32\30\uffff\1\33\6\uffff\1\32",
            "\1\34\37\uffff\1\34",
            "\1\35\37\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "\1\52\37\uffff\1\52",
            "",
            "\1\53\37\uffff\1\53",
            "\1\55\3\uffff\1\54\33\uffff\1\55\3\uffff\1\54",
            "\1\56\37\uffff\1\56",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\117\37\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_15 | KEYWORD_13 | KEYWORD_14 | KEYWORD_11 | KEYWORD_12 | KEYWORD_9 | KEYWORD_10 | KEYWORD_8 | KEYWORD_7 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='R'||LA12_0=='r') ) {s = 1;}

                        else if ( (LA12_0=='B'||LA12_0=='b') ) {s = 2;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 4;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0==';') ) {s = 11;}

                        else if ( (LA12_0=='{') ) {s = 12;}

                        else if ( (LA12_0=='}') ) {s = 13;}

                        else if ( (LA12_0=='^') ) {s = 14;}

                        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='c' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='u' && LA12_0<='z')) ) {s = 15;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}