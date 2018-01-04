package com.frantz.txtuml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.frantz.txtuml.services.TxtUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTxtUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-->'", "'<--'", "'boolean'", "'string'", "'integer'", "'double'", "'public'", "'private'", "'class'", "'{'", "'}'", "'inherits'", "','", "';'", "':'", "'('", "')'", "'sequence'", "'actors'", "'messages'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTxtUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTxtUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTxtUMLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g"; }


     
     	private TxtUMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TxtUMLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:61:1: ( ruleModel EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:69:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:73:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:74:1: ( ( rule__Model__StatementsAssignment )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:74:1: ( ( rule__Model__StatementsAssignment )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:75:1: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:76:1: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:76:2: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_in_ruleModel94);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:89:1: ( ruleStatement EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:104:1: ( rule__Statement__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement155);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClassDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:116:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:117:1: ( ruleClassDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:118:1: ruleClassDecl EOF
            {
             before(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_ruleClassDecl_in_entryRuleClassDecl182);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDecl189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:125:1: ruleClassDecl : ( ( rule__ClassDecl__Group__0 ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:129:2: ( ( ( rule__ClassDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:130:1: ( ( rule__ClassDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:130:1: ( ( rule__ClassDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:131:1: ( rule__ClassDecl__Group__0 )
            {
             before(grammarAccess.getClassDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:132:1: ( rule__ClassDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:132:2: rule__ClassDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__0_in_ruleClassDecl215);
            rule__ClassDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleClassMember"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:144:1: entryRuleClassMember : ruleClassMember EOF ;
    public final void entryRuleClassMember() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:145:1: ( ruleClassMember EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:146:1: ruleClassMember EOF
            {
             before(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_ruleClassMember_in_entryRuleClassMember242);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMember249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:153:1: ruleClassMember : ( ( rule__ClassMember__Alternatives ) ) ;
    public final void ruleClassMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:157:2: ( ( ( rule__ClassMember__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:158:1: ( ( rule__ClassMember__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:158:1: ( ( rule__ClassMember__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:159:1: ( rule__ClassMember__Alternatives )
            {
             before(grammarAccess.getClassMemberAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:160:1: ( rule__ClassMember__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:160:2: rule__ClassMember__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassMember__Alternatives_in_ruleClassMember275);
            rule__ClassMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleClassSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:172:1: entryRuleClassSectionDecl : ruleClassSectionDecl EOF ;
    public final void entryRuleClassSectionDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:173:1: ( ruleClassSectionDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:174:1: ruleClassSectionDecl EOF
            {
             before(grammarAccess.getClassSectionDeclRule()); 
            pushFollow(FOLLOW_ruleClassSectionDecl_in_entryRuleClassSectionDecl302);
            ruleClassSectionDecl();

            state._fsp--;

             after(grammarAccess.getClassSectionDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSectionDecl309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassSectionDecl"


    // $ANTLR start "ruleClassSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:181:1: ruleClassSectionDecl : ( ( rule__ClassSectionDecl__Group__0 ) ) ;
    public final void ruleClassSectionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:185:2: ( ( ( rule__ClassSectionDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:186:1: ( ( rule__ClassSectionDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:186:1: ( ( rule__ClassSectionDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:187:1: ( rule__ClassSectionDecl__Group__0 )
            {
             before(grammarAccess.getClassSectionDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:188:1: ( rule__ClassSectionDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:188:2: rule__ClassSectionDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__0_in_ruleClassSectionDecl335);
            rule__ClassSectionDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassSectionDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassSectionDecl"


    // $ANTLR start "entryRuleVisibilityDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:200:1: entryRuleVisibilityDecl : ruleVisibilityDecl EOF ;
    public final void entryRuleVisibilityDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:201:1: ( ruleVisibilityDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:202:1: ruleVisibilityDecl EOF
            {
             before(grammarAccess.getVisibilityDeclRule()); 
            pushFollow(FOLLOW_ruleVisibilityDecl_in_entryRuleVisibilityDecl362);
            ruleVisibilityDecl();

            state._fsp--;

             after(grammarAccess.getVisibilityDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibilityDecl369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisibilityDecl"


    // $ANTLR start "ruleVisibilityDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:209:1: ruleVisibilityDecl : ( ( rule__VisibilityDecl__Group__0 ) ) ;
    public final void ruleVisibilityDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:213:2: ( ( ( rule__VisibilityDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:214:1: ( ( rule__VisibilityDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:214:1: ( ( rule__VisibilityDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:215:1: ( rule__VisibilityDecl__Group__0 )
            {
             before(grammarAccess.getVisibilityDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:216:1: ( rule__VisibilityDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:216:2: rule__VisibilityDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VisibilityDecl__Group__0_in_ruleVisibilityDecl395);
            rule__VisibilityDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityDecl"


    // $ANTLR start "entryRuleMethodDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:228:1: entryRuleMethodDecl : ruleMethodDecl EOF ;
    public final void entryRuleMethodDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:229:1: ( ruleMethodDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:230:1: ruleMethodDecl EOF
            {
             before(grammarAccess.getMethodDeclRule()); 
            pushFollow(FOLLOW_ruleMethodDecl_in_entryRuleMethodDecl422);
            ruleMethodDecl();

            state._fsp--;

             after(grammarAccess.getMethodDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDecl429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:237:1: ruleMethodDecl : ( ( rule__MethodDecl__Group__0 ) ) ;
    public final void ruleMethodDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:241:2: ( ( ( rule__MethodDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:242:1: ( ( rule__MethodDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:242:1: ( ( rule__MethodDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:243:1: ( rule__MethodDecl__Group__0 )
            {
             before(grammarAccess.getMethodDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:244:1: ( rule__MethodDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:244:2: rule__MethodDecl__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDecl__Group__0_in_ruleMethodDecl455);
            rule__MethodDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleAttributeDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:256:1: entryRuleAttributeDecl : ruleAttributeDecl EOF ;
    public final void entryRuleAttributeDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:257:1: ( ruleAttributeDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:258:1: ruleAttributeDecl EOF
            {
             before(grammarAccess.getAttributeDeclRule()); 
            pushFollow(FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl482);
            ruleAttributeDecl();

            state._fsp--;

             after(grammarAccess.getAttributeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDecl489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeDecl"


    // $ANTLR start "ruleAttributeDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:265:1: ruleAttributeDecl : ( ( rule__AttributeDecl__Group__0 ) ) ;
    public final void ruleAttributeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:269:2: ( ( ( rule__AttributeDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:270:1: ( ( rule__AttributeDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:270:1: ( ( rule__AttributeDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:271:1: ( rule__AttributeDecl__Group__0 )
            {
             before(grammarAccess.getAttributeDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:272:1: ( rule__AttributeDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:272:2: rule__AttributeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeDecl__Group__0_in_ruleAttributeDecl515);
            rule__AttributeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDecl"


    // $ANTLR start "entryRuleAssociationDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:284:1: entryRuleAssociationDecl : ruleAssociationDecl EOF ;
    public final void entryRuleAssociationDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:285:1: ( ruleAssociationDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:286:1: ruleAssociationDecl EOF
            {
             before(grammarAccess.getAssociationDeclRule()); 
            pushFollow(FOLLOW_ruleAssociationDecl_in_entryRuleAssociationDecl542);
            ruleAssociationDecl();

            state._fsp--;

             after(grammarAccess.getAssociationDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationDecl549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationDecl"


    // $ANTLR start "ruleAssociationDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:293:1: ruleAssociationDecl : ( ( rule__AssociationDecl__Group__0 ) ) ;
    public final void ruleAssociationDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:297:2: ( ( ( rule__AssociationDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:298:1: ( ( rule__AssociationDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:298:1: ( ( rule__AssociationDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:299:1: ( rule__AssociationDecl__Group__0 )
            {
             before(grammarAccess.getAssociationDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:300:1: ( rule__AssociationDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:300:2: rule__AssociationDecl__Group__0
            {
            pushFollow(FOLLOW_rule__AssociationDecl__Group__0_in_ruleAssociationDecl575);
            rule__AssociationDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationDecl"


    // $ANTLR start "entryRuleSequenceDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:312:1: entryRuleSequenceDecl : ruleSequenceDecl EOF ;
    public final void entryRuleSequenceDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:313:1: ( ruleSequenceDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:314:1: ruleSequenceDecl EOF
            {
             before(grammarAccess.getSequenceDeclRule()); 
            pushFollow(FOLLOW_ruleSequenceDecl_in_entryRuleSequenceDecl602);
            ruleSequenceDecl();

            state._fsp--;

             after(grammarAccess.getSequenceDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceDecl609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceDecl"


    // $ANTLR start "ruleSequenceDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:321:1: ruleSequenceDecl : ( ( rule__SequenceDecl__Group__0 ) ) ;
    public final void ruleSequenceDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:325:2: ( ( ( rule__SequenceDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:326:1: ( ( rule__SequenceDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:326:1: ( ( rule__SequenceDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:327:1: ( rule__SequenceDecl__Group__0 )
            {
             before(grammarAccess.getSequenceDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:328:1: ( rule__SequenceDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:328:2: rule__SequenceDecl__Group__0
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__0_in_ruleSequenceDecl635);
            rule__SequenceDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceDecl"


    // $ANTLR start "entryRuleSequenceSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:340:1: entryRuleSequenceSectionDecl : ruleSequenceSectionDecl EOF ;
    public final void entryRuleSequenceSectionDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:341:1: ( ruleSequenceSectionDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:342:1: ruleSequenceSectionDecl EOF
            {
             before(grammarAccess.getSequenceSectionDeclRule()); 
            pushFollow(FOLLOW_ruleSequenceSectionDecl_in_entryRuleSequenceSectionDecl662);
            ruleSequenceSectionDecl();

            state._fsp--;

             after(grammarAccess.getSequenceSectionDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceSectionDecl669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceSectionDecl"


    // $ANTLR start "ruleSequenceSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:349:1: ruleSequenceSectionDecl : ( ( rule__SequenceSectionDecl__Alternatives ) ) ;
    public final void ruleSequenceSectionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:353:2: ( ( ( rule__SequenceSectionDecl__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:354:1: ( ( rule__SequenceSectionDecl__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:354:1: ( ( rule__SequenceSectionDecl__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:355:1: ( rule__SequenceSectionDecl__Alternatives )
            {
             before(grammarAccess.getSequenceSectionDeclAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:356:1: ( rule__SequenceSectionDecl__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:356:2: rule__SequenceSectionDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__SequenceSectionDecl__Alternatives_in_ruleSequenceSectionDecl695);
            rule__SequenceSectionDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSequenceSectionDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceSectionDecl"


    // $ANTLR start "entryRuleActorSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:368:1: entryRuleActorSectionDecl : ruleActorSectionDecl EOF ;
    public final void entryRuleActorSectionDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:369:1: ( ruleActorSectionDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:370:1: ruleActorSectionDecl EOF
            {
             before(grammarAccess.getActorSectionDeclRule()); 
            pushFollow(FOLLOW_ruleActorSectionDecl_in_entryRuleActorSectionDecl722);
            ruleActorSectionDecl();

            state._fsp--;

             after(grammarAccess.getActorSectionDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorSectionDecl729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActorSectionDecl"


    // $ANTLR start "ruleActorSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:377:1: ruleActorSectionDecl : ( ( rule__ActorSectionDecl__Group__0 ) ) ;
    public final void ruleActorSectionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:381:2: ( ( ( rule__ActorSectionDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:382:1: ( ( rule__ActorSectionDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:382:1: ( ( rule__ActorSectionDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:383:1: ( rule__ActorSectionDecl__Group__0 )
            {
             before(grammarAccess.getActorSectionDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:384:1: ( rule__ActorSectionDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:384:2: rule__ActorSectionDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__0_in_ruleActorSectionDecl755);
            rule__ActorSectionDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorSectionDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorSectionDecl"


    // $ANTLR start "entryRuleMessageSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:396:1: entryRuleMessageSectionDecl : ruleMessageSectionDecl EOF ;
    public final void entryRuleMessageSectionDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:397:1: ( ruleMessageSectionDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:398:1: ruleMessageSectionDecl EOF
            {
             before(grammarAccess.getMessageSectionDeclRule()); 
            pushFollow(FOLLOW_ruleMessageSectionDecl_in_entryRuleMessageSectionDecl782);
            ruleMessageSectionDecl();

            state._fsp--;

             after(grammarAccess.getMessageSectionDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSectionDecl789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageSectionDecl"


    // $ANTLR start "ruleMessageSectionDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:405:1: ruleMessageSectionDecl : ( ( rule__MessageSectionDecl__Group__0 ) ) ;
    public final void ruleMessageSectionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:409:2: ( ( ( rule__MessageSectionDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:410:1: ( ( rule__MessageSectionDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:410:1: ( ( rule__MessageSectionDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:411:1: ( rule__MessageSectionDecl__Group__0 )
            {
             before(grammarAccess.getMessageSectionDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:412:1: ( rule__MessageSectionDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:412:2: rule__MessageSectionDecl__Group__0
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__0_in_ruleMessageSectionDecl815);
            rule__MessageSectionDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSectionDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageSectionDecl"


    // $ANTLR start "entryRuleActorDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:424:1: entryRuleActorDecl : ruleActorDecl EOF ;
    public final void entryRuleActorDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:425:1: ( ruleActorDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:426:1: ruleActorDecl EOF
            {
             before(grammarAccess.getActorDeclRule()); 
            pushFollow(FOLLOW_ruleActorDecl_in_entryRuleActorDecl842);
            ruleActorDecl();

            state._fsp--;

             after(grammarAccess.getActorDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorDecl849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActorDecl"


    // $ANTLR start "ruleActorDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:433:1: ruleActorDecl : ( ( rule__ActorDecl__Group__0 ) ) ;
    public final void ruleActorDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:437:2: ( ( ( rule__ActorDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:438:1: ( ( rule__ActorDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:438:1: ( ( rule__ActorDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:439:1: ( rule__ActorDecl__Group__0 )
            {
             before(grammarAccess.getActorDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:440:1: ( rule__ActorDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:440:2: rule__ActorDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ActorDecl__Group__0_in_ruleActorDecl875);
            rule__ActorDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorDecl"


    // $ANTLR start "entryRuleMessageDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:452:1: entryRuleMessageDecl : ruleMessageDecl EOF ;
    public final void entryRuleMessageDecl() throws RecognitionException {
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:453:1: ( ruleMessageDecl EOF )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:454:1: ruleMessageDecl EOF
            {
             before(grammarAccess.getMessageDeclRule()); 
            pushFollow(FOLLOW_ruleMessageDecl_in_entryRuleMessageDecl902);
            ruleMessageDecl();

            state._fsp--;

             after(grammarAccess.getMessageDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageDecl909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageDecl"


    // $ANTLR start "ruleMessageDecl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:461:1: ruleMessageDecl : ( ( rule__MessageDecl__Group__0 ) ) ;
    public final void ruleMessageDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:465:2: ( ( ( rule__MessageDecl__Group__0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:466:1: ( ( rule__MessageDecl__Group__0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:466:1: ( ( rule__MessageDecl__Group__0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:467:1: ( rule__MessageDecl__Group__0 )
            {
             before(grammarAccess.getMessageDeclAccess().getGroup()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:468:1: ( rule__MessageDecl__Group__0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:468:2: rule__MessageDecl__Group__0
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__0_in_ruleMessageDecl935);
            rule__MessageDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDecl"


    // $ANTLR start "ruleMessageOperator"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:481:1: ruleMessageOperator : ( ( rule__MessageOperator__Alternatives ) ) ;
    public final void ruleMessageOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:485:1: ( ( ( rule__MessageOperator__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:486:1: ( ( rule__MessageOperator__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:486:1: ( ( rule__MessageOperator__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:487:1: ( rule__MessageOperator__Alternatives )
            {
             before(grammarAccess.getMessageOperatorAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:488:1: ( rule__MessageOperator__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:488:2: rule__MessageOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageOperator__Alternatives_in_ruleMessageOperator972);
            rule__MessageOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageOperator"


    // $ANTLR start "ruleDataType"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:500:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:504:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:505:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:505:1: ( ( rule__DataType__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:506:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:507:1: ( rule__DataType__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:507:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1008);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleVisibility"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:519:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:523:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:524:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:524:1: ( ( rule__Visibility__Alternatives ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:525:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:526:1: ( rule__Visibility__Alternatives )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:526:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1044);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:537:1: rule__Statement__Alternatives : ( ( ruleClassDecl ) | ( ruleSequenceDecl ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:541:1: ( ( ruleClassDecl ) | ( ruleSequenceDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:542:1: ( ruleClassDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:542:1: ( ruleClassDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:543:1: ruleClassDecl
                    {
                     before(grammarAccess.getStatementAccess().getClassDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassDecl_in_rule__Statement__Alternatives1079);
                    ruleClassDecl();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getClassDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:548:6: ( ruleSequenceDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:548:6: ( ruleSequenceDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:549:1: ruleSequenceDecl
                    {
                     before(grammarAccess.getStatementAccess().getSequenceDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSequenceDecl_in_rule__Statement__Alternatives1096);
                    ruleSequenceDecl();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSequenceDeclParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__ClassMember__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:559:1: rule__ClassMember__Alternatives : ( ( ruleMethodDecl ) | ( ruleAttributeDecl ) | ( ruleAssociationDecl ) );
    public final void rule__ClassMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:563:1: ( ( ruleMethodDecl ) | ( ruleAttributeDecl ) | ( ruleAssociationDecl ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==26) ) {
                        alt3=1;
                    }
                    else if ( (LA3_6==EOF||(LA3_6>=23 && LA3_6<=24)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==26) ) {
                        alt3=1;
                    }
                    else if ( (LA3_6==EOF||(LA3_6>=23 && LA3_6<=24)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==26) ) {
                        alt3=1;
                    }
                    else if ( (LA3_6==EOF||(LA3_6>=23 && LA3_6<=24)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==26) ) {
                        alt3=1;
                    }
                    else if ( (LA3_6==EOF||(LA3_6>=23 && LA3_6<=24)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:564:1: ( ruleMethodDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:564:1: ( ruleMethodDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:565:1: ruleMethodDecl
                    {
                     before(grammarAccess.getClassMemberAccess().getMethodDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethodDecl_in_rule__ClassMember__Alternatives1128);
                    ruleMethodDecl();

                    state._fsp--;

                     after(grammarAccess.getClassMemberAccess().getMethodDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:570:6: ( ruleAttributeDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:570:6: ( ruleAttributeDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:571:1: ruleAttributeDecl
                    {
                     before(grammarAccess.getClassMemberAccess().getAttributeDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttributeDecl_in_rule__ClassMember__Alternatives1145);
                    ruleAttributeDecl();

                    state._fsp--;

                     after(grammarAccess.getClassMemberAccess().getAttributeDeclParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:576:6: ( ruleAssociationDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:576:6: ( ruleAssociationDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:577:1: ruleAssociationDecl
                    {
                     before(grammarAccess.getClassMemberAccess().getAssociationDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssociationDecl_in_rule__ClassMember__Alternatives1162);
                    ruleAssociationDecl();

                    state._fsp--;

                     after(grammarAccess.getClassMemberAccess().getAssociationDeclParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMember__Alternatives"


    // $ANTLR start "rule__SequenceSectionDecl__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:587:1: rule__SequenceSectionDecl__Alternatives : ( ( ruleActorSectionDecl ) | ( ruleMessageSectionDecl ) );
    public final void rule__SequenceSectionDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:591:1: ( ( ruleActorSectionDecl ) | ( ruleMessageSectionDecl ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:592:1: ( ruleActorSectionDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:592:1: ( ruleActorSectionDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:593:1: ruleActorSectionDecl
                    {
                     before(grammarAccess.getSequenceSectionDeclAccess().getActorSectionDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActorSectionDecl_in_rule__SequenceSectionDecl__Alternatives1194);
                    ruleActorSectionDecl();

                    state._fsp--;

                     after(grammarAccess.getSequenceSectionDeclAccess().getActorSectionDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:598:6: ( ruleMessageSectionDecl )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:598:6: ( ruleMessageSectionDecl )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:599:1: ruleMessageSectionDecl
                    {
                     before(grammarAccess.getSequenceSectionDeclAccess().getMessageSectionDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMessageSectionDecl_in_rule__SequenceSectionDecl__Alternatives1211);
                    ruleMessageSectionDecl();

                    state._fsp--;

                     after(grammarAccess.getSequenceSectionDeclAccess().getMessageSectionDeclParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceSectionDecl__Alternatives"


    // $ANTLR start "rule__MessageOperator__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:609:1: rule__MessageOperator__Alternatives : ( ( ( '-->' ) ) | ( ( '<--' ) ) );
    public final void rule__MessageOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:613:1: ( ( ( '-->' ) ) | ( ( '<--' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:614:1: ( ( '-->' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:614:1: ( ( '-->' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:615:1: ( '-->' )
                    {
                     before(grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:616:1: ( '-->' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:616:3: '-->'
                    {
                    match(input,11,FOLLOW_11_in_rule__MessageOperator__Alternatives1244); 

                    }

                     after(grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:621:6: ( ( '<--' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:621:6: ( ( '<--' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:622:1: ( '<--' )
                    {
                     before(grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:623:1: ( '<--' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:623:3: '<--'
                    {
                    match(input,12,FOLLOW_12_in_rule__MessageOperator__Alternatives1265); 

                    }

                     after(grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageOperator__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:633:1: rule__DataType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:637:1: ( ( ( 'boolean' ) ) | ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:638:1: ( ( 'boolean' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:638:1: ( ( 'boolean' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:639:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:640:1: ( 'boolean' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:640:3: 'boolean'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives1301); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:645:6: ( ( 'string' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:645:6: ( ( 'string' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:646:1: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:647:1: ( 'string' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:647:3: 'string'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives1322); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:652:6: ( ( 'integer' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:652:6: ( ( 'integer' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:653:1: ( 'integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:654:1: ( 'integer' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:654:3: 'integer'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives1343); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:659:6: ( ( 'double' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:659:6: ( ( 'double' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:660:1: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:661:1: ( 'double' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:661:3: 'double'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataType__Alternatives1364); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:671:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:675:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:676:1: ( ( 'public' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:676:1: ( ( 'public' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:677:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:678:1: ( 'public' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:678:3: 'public'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives1400); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:683:6: ( ( 'private' ) )
                    {
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:683:6: ( ( 'private' ) )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:684:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:685:1: ( 'private' )
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:685:3: 'private'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives1421); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__ClassDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:697:1: rule__ClassDecl__Group__0 : rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 ;
    public final void rule__ClassDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:701:1: ( rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:702:2: rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__0__Impl_in_rule__ClassDecl__Group__01454);
            rule__ClassDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__1_in_rule__ClassDecl__Group__01457);
            rule__ClassDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__0"


    // $ANTLR start "rule__ClassDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:709:1: rule__ClassDecl__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:713:1: ( ( 'class' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:714:1: ( 'class' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:714:1: ( 'class' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:715:1: 'class'
            {
             before(grammarAccess.getClassDeclAccess().getClassKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ClassDecl__Group__0__Impl1485); 
             after(grammarAccess.getClassDeclAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:728:1: rule__ClassDecl__Group__1 : rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2 ;
    public final void rule__ClassDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:732:1: ( rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:733:2: rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__1__Impl_in_rule__ClassDecl__Group__11516);
            rule__ClassDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__2_in_rule__ClassDecl__Group__11519);
            rule__ClassDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__1"


    // $ANTLR start "rule__ClassDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:740:1: rule__ClassDecl__Group__1__Impl : ( ( rule__ClassDecl__NameAssignment_1 ) ) ;
    public final void rule__ClassDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:744:1: ( ( ( rule__ClassDecl__NameAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:745:1: ( ( rule__ClassDecl__NameAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:745:1: ( ( rule__ClassDecl__NameAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:746:1: ( rule__ClassDecl__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclAccess().getNameAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:747:1: ( rule__ClassDecl__NameAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:747:2: rule__ClassDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassDecl__NameAssignment_1_in_rule__ClassDecl__Group__1__Impl1546);
            rule__ClassDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__1__Impl"


    // $ANTLR start "rule__ClassDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:757:1: rule__ClassDecl__Group__2 : rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3 ;
    public final void rule__ClassDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:761:1: ( rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:762:2: rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__2__Impl_in_rule__ClassDecl__Group__21576);
            rule__ClassDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__3_in_rule__ClassDecl__Group__21579);
            rule__ClassDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__2"


    // $ANTLR start "rule__ClassDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:769:1: rule__ClassDecl__Group__2__Impl : ( ( rule__ClassDecl__Group_2__0 )? ) ;
    public final void rule__ClassDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:773:1: ( ( ( rule__ClassDecl__Group_2__0 )? ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:774:1: ( ( rule__ClassDecl__Group_2__0 )? )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:774:1: ( ( rule__ClassDecl__Group_2__0 )? )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:775:1: ( rule__ClassDecl__Group_2__0 )?
            {
             before(grammarAccess.getClassDeclAccess().getGroup_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:776:1: ( rule__ClassDecl__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:776:2: rule__ClassDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ClassDecl__Group_2__0_in_rule__ClassDecl__Group__2__Impl1606);
                    rule__ClassDecl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__2__Impl"


    // $ANTLR start "rule__ClassDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:786:1: rule__ClassDecl__Group__3 : rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4 ;
    public final void rule__ClassDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:790:1: ( rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:791:2: rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__3__Impl_in_rule__ClassDecl__Group__31637);
            rule__ClassDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__4_in_rule__ClassDecl__Group__31640);
            rule__ClassDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__3"


    // $ANTLR start "rule__ClassDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:798:1: rule__ClassDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:802:1: ( ( '{' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:803:1: ( '{' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:803:1: ( '{' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:804:1: '{'
            {
             before(grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__ClassDecl__Group__3__Impl1668); 
             after(grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__3__Impl"


    // $ANTLR start "rule__ClassDecl__Group__4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:817:1: rule__ClassDecl__Group__4 : rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5 ;
    public final void rule__ClassDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:821:1: ( rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:822:2: rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__4__Impl_in_rule__ClassDecl__Group__41699);
            rule__ClassDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__5_in_rule__ClassDecl__Group__41702);
            rule__ClassDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__4"


    // $ANTLR start "rule__ClassDecl__Group__4__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:829:1: rule__ClassDecl__Group__4__Impl : ( ( rule__ClassDecl__SectionsAssignment_4 ) ) ;
    public final void rule__ClassDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:833:1: ( ( ( rule__ClassDecl__SectionsAssignment_4 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:834:1: ( ( rule__ClassDecl__SectionsAssignment_4 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:834:1: ( ( rule__ClassDecl__SectionsAssignment_4 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:835:1: ( rule__ClassDecl__SectionsAssignment_4 )
            {
             before(grammarAccess.getClassDeclAccess().getSectionsAssignment_4()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:836:1: ( rule__ClassDecl__SectionsAssignment_4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:836:2: rule__ClassDecl__SectionsAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassDecl__SectionsAssignment_4_in_rule__ClassDecl__Group__4__Impl1729);
            rule__ClassDecl__SectionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getSectionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__4__Impl"


    // $ANTLR start "rule__ClassDecl__Group__5"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:846:1: rule__ClassDecl__Group__5 : rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6 ;
    public final void rule__ClassDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:850:1: ( rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:851:2: rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__5__Impl_in_rule__ClassDecl__Group__51759);
            rule__ClassDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group__6_in_rule__ClassDecl__Group__51762);
            rule__ClassDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__5"


    // $ANTLR start "rule__ClassDecl__Group__5__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:858:1: rule__ClassDecl__Group__5__Impl : ( ( rule__ClassDecl__SectionsAssignment_5 )* ) ;
    public final void rule__ClassDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:862:1: ( ( ( rule__ClassDecl__SectionsAssignment_5 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:863:1: ( ( rule__ClassDecl__SectionsAssignment_5 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:863:1: ( ( rule__ClassDecl__SectionsAssignment_5 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:864:1: ( rule__ClassDecl__SectionsAssignment_5 )*
            {
             before(grammarAccess.getClassDeclAccess().getSectionsAssignment_5()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:865:1: ( rule__ClassDecl__SectionsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=13 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:865:2: rule__ClassDecl__SectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ClassDecl__SectionsAssignment_5_in_rule__ClassDecl__Group__5__Impl1789);
            	    rule__ClassDecl__SectionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassDeclAccess().getSectionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__5__Impl"


    // $ANTLR start "rule__ClassDecl__Group__6"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:875:1: rule__ClassDecl__Group__6 : rule__ClassDecl__Group__6__Impl ;
    public final void rule__ClassDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:879:1: ( rule__ClassDecl__Group__6__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:880:2: rule__ClassDecl__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group__6__Impl_in_rule__ClassDecl__Group__61820);
            rule__ClassDecl__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__6"


    // $ANTLR start "rule__ClassDecl__Group__6__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:886:1: rule__ClassDecl__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:890:1: ( ( '}' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:891:1: ( '}' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:891:1: ( '}' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:892:1: '}'
            {
             before(grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__ClassDecl__Group__6__Impl1848); 
             after(grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__6__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:919:1: rule__ClassDecl__Group_2__0 : rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1 ;
    public final void rule__ClassDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:923:1: ( rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:924:2: rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group_2__0__Impl_in_rule__ClassDecl__Group_2__01893);
            rule__ClassDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group_2__1_in_rule__ClassDecl__Group_2__01896);
            rule__ClassDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__0"


    // $ANTLR start "rule__ClassDecl__Group_2__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:931:1: rule__ClassDecl__Group_2__0__Impl : ( 'inherits' ) ;
    public final void rule__ClassDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:935:1: ( ( 'inherits' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:936:1: ( 'inherits' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:936:1: ( 'inherits' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:937:1: 'inherits'
            {
             before(grammarAccess.getClassDeclAccess().getInheritsKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ClassDecl__Group_2__0__Impl1924); 
             after(grammarAccess.getClassDeclAccess().getInheritsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:950:1: rule__ClassDecl__Group_2__1 : rule__ClassDecl__Group_2__1__Impl rule__ClassDecl__Group_2__2 ;
    public final void rule__ClassDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:954:1: ( rule__ClassDecl__Group_2__1__Impl rule__ClassDecl__Group_2__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:955:2: rule__ClassDecl__Group_2__1__Impl rule__ClassDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group_2__1__Impl_in_rule__ClassDecl__Group_2__11955);
            rule__ClassDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group_2__2_in_rule__ClassDecl__Group_2__11958);
            rule__ClassDecl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__1"


    // $ANTLR start "rule__ClassDecl__Group_2__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:962:1: rule__ClassDecl__Group_2__1__Impl : ( ( rule__ClassDecl__InheritsAssignment_2_1 ) ) ;
    public final void rule__ClassDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:966:1: ( ( ( rule__ClassDecl__InheritsAssignment_2_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:967:1: ( ( rule__ClassDecl__InheritsAssignment_2_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:967:1: ( ( rule__ClassDecl__InheritsAssignment_2_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:968:1: ( rule__ClassDecl__InheritsAssignment_2_1 )
            {
             before(grammarAccess.getClassDeclAccess().getInheritsAssignment_2_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:969:1: ( rule__ClassDecl__InheritsAssignment_2_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:969:2: rule__ClassDecl__InheritsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ClassDecl__InheritsAssignment_2_1_in_rule__ClassDecl__Group_2__1__Impl1985);
            rule__ClassDecl__InheritsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getInheritsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__1__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:979:1: rule__ClassDecl__Group_2__2 : rule__ClassDecl__Group_2__2__Impl ;
    public final void rule__ClassDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:983:1: ( rule__ClassDecl__Group_2__2__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:984:2: rule__ClassDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group_2__2__Impl_in_rule__ClassDecl__Group_2__22015);
            rule__ClassDecl__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__2"


    // $ANTLR start "rule__ClassDecl__Group_2__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:990:1: rule__ClassDecl__Group_2__2__Impl : ( ( rule__ClassDecl__Group_2_2__0 )* ) ;
    public final void rule__ClassDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:994:1: ( ( ( rule__ClassDecl__Group_2_2__0 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:995:1: ( ( rule__ClassDecl__Group_2_2__0 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:995:1: ( ( rule__ClassDecl__Group_2_2__0 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:996:1: ( rule__ClassDecl__Group_2_2__0 )*
            {
             before(grammarAccess.getClassDeclAccess().getGroup_2_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:997:1: ( rule__ClassDecl__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:997:2: rule__ClassDecl__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassDecl__Group_2_2__0_in_rule__ClassDecl__Group_2__2__Impl2042);
            	    rule__ClassDecl__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassDeclAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__2__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2_2__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1013:1: rule__ClassDecl__Group_2_2__0 : rule__ClassDecl__Group_2_2__0__Impl rule__ClassDecl__Group_2_2__1 ;
    public final void rule__ClassDecl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1017:1: ( rule__ClassDecl__Group_2_2__0__Impl rule__ClassDecl__Group_2_2__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1018:2: rule__ClassDecl__Group_2_2__0__Impl rule__ClassDecl__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group_2_2__0__Impl_in_rule__ClassDecl__Group_2_2__02079);
            rule__ClassDecl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDecl__Group_2_2__1_in_rule__ClassDecl__Group_2_2__02082);
            rule__ClassDecl__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2_2__0"


    // $ANTLR start "rule__ClassDecl__Group_2_2__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1025:1: rule__ClassDecl__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDecl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1029:1: ( ( ',' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1030:1: ( ',' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1030:1: ( ',' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1031:1: ','
            {
             before(grammarAccess.getClassDeclAccess().getCommaKeyword_2_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassDecl__Group_2_2__0__Impl2110); 
             after(grammarAccess.getClassDeclAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2_2__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2_2__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1044:1: rule__ClassDecl__Group_2_2__1 : rule__ClassDecl__Group_2_2__1__Impl ;
    public final void rule__ClassDecl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1048:1: ( rule__ClassDecl__Group_2_2__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1049:2: rule__ClassDecl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassDecl__Group_2_2__1__Impl_in_rule__ClassDecl__Group_2_2__12141);
            rule__ClassDecl__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2_2__1"


    // $ANTLR start "rule__ClassDecl__Group_2_2__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1055:1: rule__ClassDecl__Group_2_2__1__Impl : ( ( rule__ClassDecl__InheritsAssignment_2_2_1 ) ) ;
    public final void rule__ClassDecl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1059:1: ( ( ( rule__ClassDecl__InheritsAssignment_2_2_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1060:1: ( ( rule__ClassDecl__InheritsAssignment_2_2_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1060:1: ( ( rule__ClassDecl__InheritsAssignment_2_2_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1061:1: ( rule__ClassDecl__InheritsAssignment_2_2_1 )
            {
             before(grammarAccess.getClassDeclAccess().getInheritsAssignment_2_2_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1062:1: ( rule__ClassDecl__InheritsAssignment_2_2_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1062:2: rule__ClassDecl__InheritsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ClassDecl__InheritsAssignment_2_2_1_in_rule__ClassDecl__Group_2_2__1__Impl2168);
            rule__ClassDecl__InheritsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getInheritsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2_2__1__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1076:1: rule__ClassSectionDecl__Group__0 : rule__ClassSectionDecl__Group__0__Impl rule__ClassSectionDecl__Group__1 ;
    public final void rule__ClassSectionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1080:1: ( rule__ClassSectionDecl__Group__0__Impl rule__ClassSectionDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1081:2: rule__ClassSectionDecl__Group__0__Impl rule__ClassSectionDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__0__Impl_in_rule__ClassSectionDecl__Group__02202);
            rule__ClassSectionDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__1_in_rule__ClassSectionDecl__Group__02205);
            rule__ClassSectionDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__0"


    // $ANTLR start "rule__ClassSectionDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1088:1: rule__ClassSectionDecl__Group__0__Impl : ( ( rule__ClassSectionDecl__VisibilityAssignment_0 )? ) ;
    public final void rule__ClassSectionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1092:1: ( ( ( rule__ClassSectionDecl__VisibilityAssignment_0 )? ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1093:1: ( ( rule__ClassSectionDecl__VisibilityAssignment_0 )? )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1093:1: ( ( rule__ClassSectionDecl__VisibilityAssignment_0 )? )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1094:1: ( rule__ClassSectionDecl__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassSectionDeclAccess().getVisibilityAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1095:1: ( rule__ClassSectionDecl__VisibilityAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=17 && LA11_0<=18)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1095:2: rule__ClassSectionDecl__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ClassSectionDecl__VisibilityAssignment_0_in_rule__ClassSectionDecl__Group__0__Impl2232);
                    rule__ClassSectionDecl__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassSectionDeclAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__0__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1105:1: rule__ClassSectionDecl__Group__1 : rule__ClassSectionDecl__Group__1__Impl rule__ClassSectionDecl__Group__2 ;
    public final void rule__ClassSectionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1109:1: ( rule__ClassSectionDecl__Group__1__Impl rule__ClassSectionDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1110:2: rule__ClassSectionDecl__Group__1__Impl rule__ClassSectionDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__1__Impl_in_rule__ClassSectionDecl__Group__12263);
            rule__ClassSectionDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__2_in_rule__ClassSectionDecl__Group__12266);
            rule__ClassSectionDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__1"


    // $ANTLR start "rule__ClassSectionDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1117:1: rule__ClassSectionDecl__Group__1__Impl : ( ( rule__ClassSectionDecl__MembersAssignment_1 ) ) ;
    public final void rule__ClassSectionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1121:1: ( ( ( rule__ClassSectionDecl__MembersAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1122:1: ( ( rule__ClassSectionDecl__MembersAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1122:1: ( ( rule__ClassSectionDecl__MembersAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1123:1: ( rule__ClassSectionDecl__MembersAssignment_1 )
            {
             before(grammarAccess.getClassSectionDeclAccess().getMembersAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1124:1: ( rule__ClassSectionDecl__MembersAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1124:2: rule__ClassSectionDecl__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__MembersAssignment_1_in_rule__ClassSectionDecl__Group__1__Impl2293);
            rule__ClassSectionDecl__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassSectionDeclAccess().getMembersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__1__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1134:1: rule__ClassSectionDecl__Group__2 : rule__ClassSectionDecl__Group__2__Impl rule__ClassSectionDecl__Group__3 ;
    public final void rule__ClassSectionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1138:1: ( rule__ClassSectionDecl__Group__2__Impl rule__ClassSectionDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1139:2: rule__ClassSectionDecl__Group__2__Impl rule__ClassSectionDecl__Group__3
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__2__Impl_in_rule__ClassSectionDecl__Group__22323);
            rule__ClassSectionDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__3_in_rule__ClassSectionDecl__Group__22326);
            rule__ClassSectionDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__2"


    // $ANTLR start "rule__ClassSectionDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1146:1: rule__ClassSectionDecl__Group__2__Impl : ( ( rule__ClassSectionDecl__Group_2__0 )* ) ;
    public final void rule__ClassSectionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1150:1: ( ( ( rule__ClassSectionDecl__Group_2__0 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1151:1: ( ( rule__ClassSectionDecl__Group_2__0 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1151:1: ( ( rule__ClassSectionDecl__Group_2__0 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1152:1: ( rule__ClassSectionDecl__Group_2__0 )*
            {
             before(grammarAccess.getClassSectionDeclAccess().getGroup_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1153:1: ( rule__ClassSectionDecl__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1153:2: rule__ClassSectionDecl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassSectionDecl__Group_2__0_in_rule__ClassSectionDecl__Group__2__Impl2353);
            	    rule__ClassSectionDecl__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassSectionDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__2__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1163:1: rule__ClassSectionDecl__Group__3 : rule__ClassSectionDecl__Group__3__Impl ;
    public final void rule__ClassSectionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1167:1: ( rule__ClassSectionDecl__Group__3__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1168:2: rule__ClassSectionDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group__3__Impl_in_rule__ClassSectionDecl__Group__32384);
            rule__ClassSectionDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__3"


    // $ANTLR start "rule__ClassSectionDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1174:1: rule__ClassSectionDecl__Group__3__Impl : ( ';' ) ;
    public final void rule__ClassSectionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1178:1: ( ( ';' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1179:1: ( ';' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1179:1: ( ';' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1180:1: ';'
            {
             before(grammarAccess.getClassSectionDeclAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ClassSectionDecl__Group__3__Impl2412); 
             after(grammarAccess.getClassSectionDeclAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group__3__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group_2__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1201:1: rule__ClassSectionDecl__Group_2__0 : rule__ClassSectionDecl__Group_2__0__Impl rule__ClassSectionDecl__Group_2__1 ;
    public final void rule__ClassSectionDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1205:1: ( rule__ClassSectionDecl__Group_2__0__Impl rule__ClassSectionDecl__Group_2__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1206:2: rule__ClassSectionDecl__Group_2__0__Impl rule__ClassSectionDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group_2__0__Impl_in_rule__ClassSectionDecl__Group_2__02451);
            rule__ClassSectionDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassSectionDecl__Group_2__1_in_rule__ClassSectionDecl__Group_2__02454);
            rule__ClassSectionDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group_2__0"


    // $ANTLR start "rule__ClassSectionDecl__Group_2__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1213:1: rule__ClassSectionDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ClassSectionDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1217:1: ( ( ',' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1218:1: ( ',' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1218:1: ( ',' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1219:1: ','
            {
             before(grammarAccess.getClassSectionDeclAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassSectionDecl__Group_2__0__Impl2482); 
             after(grammarAccess.getClassSectionDeclAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group_2__0__Impl"


    // $ANTLR start "rule__ClassSectionDecl__Group_2__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1232:1: rule__ClassSectionDecl__Group_2__1 : rule__ClassSectionDecl__Group_2__1__Impl ;
    public final void rule__ClassSectionDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1236:1: ( rule__ClassSectionDecl__Group_2__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1237:2: rule__ClassSectionDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__Group_2__1__Impl_in_rule__ClassSectionDecl__Group_2__12513);
            rule__ClassSectionDecl__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group_2__1"


    // $ANTLR start "rule__ClassSectionDecl__Group_2__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1243:1: rule__ClassSectionDecl__Group_2__1__Impl : ( ( rule__ClassSectionDecl__MembersAssignment_2_1 ) ) ;
    public final void rule__ClassSectionDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1247:1: ( ( ( rule__ClassSectionDecl__MembersAssignment_2_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1248:1: ( ( rule__ClassSectionDecl__MembersAssignment_2_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1248:1: ( ( rule__ClassSectionDecl__MembersAssignment_2_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1249:1: ( rule__ClassSectionDecl__MembersAssignment_2_1 )
            {
             before(grammarAccess.getClassSectionDeclAccess().getMembersAssignment_2_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1250:1: ( rule__ClassSectionDecl__MembersAssignment_2_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1250:2: rule__ClassSectionDecl__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ClassSectionDecl__MembersAssignment_2_1_in_rule__ClassSectionDecl__Group_2__1__Impl2540);
            rule__ClassSectionDecl__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassSectionDeclAccess().getMembersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__Group_2__1__Impl"


    // $ANTLR start "rule__VisibilityDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1264:1: rule__VisibilityDecl__Group__0 : rule__VisibilityDecl__Group__0__Impl rule__VisibilityDecl__Group__1 ;
    public final void rule__VisibilityDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1268:1: ( rule__VisibilityDecl__Group__0__Impl rule__VisibilityDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1269:2: rule__VisibilityDecl__Group__0__Impl rule__VisibilityDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VisibilityDecl__Group__0__Impl_in_rule__VisibilityDecl__Group__02574);
            rule__VisibilityDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VisibilityDecl__Group__1_in_rule__VisibilityDecl__Group__02577);
            rule__VisibilityDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityDecl__Group__0"


    // $ANTLR start "rule__VisibilityDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1276:1: rule__VisibilityDecl__Group__0__Impl : ( ( rule__VisibilityDecl__VisibilityAssignment_0 ) ) ;
    public final void rule__VisibilityDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1280:1: ( ( ( rule__VisibilityDecl__VisibilityAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1281:1: ( ( rule__VisibilityDecl__VisibilityAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1281:1: ( ( rule__VisibilityDecl__VisibilityAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1282:1: ( rule__VisibilityDecl__VisibilityAssignment_0 )
            {
             before(grammarAccess.getVisibilityDeclAccess().getVisibilityAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1283:1: ( rule__VisibilityDecl__VisibilityAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1283:2: rule__VisibilityDecl__VisibilityAssignment_0
            {
            pushFollow(FOLLOW_rule__VisibilityDecl__VisibilityAssignment_0_in_rule__VisibilityDecl__Group__0__Impl2604);
            rule__VisibilityDecl__VisibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityDeclAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityDecl__Group__0__Impl"


    // $ANTLR start "rule__VisibilityDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1293:1: rule__VisibilityDecl__Group__1 : rule__VisibilityDecl__Group__1__Impl ;
    public final void rule__VisibilityDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1297:1: ( rule__VisibilityDecl__Group__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1298:2: rule__VisibilityDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VisibilityDecl__Group__1__Impl_in_rule__VisibilityDecl__Group__12634);
            rule__VisibilityDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityDecl__Group__1"


    // $ANTLR start "rule__VisibilityDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1304:1: rule__VisibilityDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__VisibilityDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1308:1: ( ( ':' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1309:1: ( ':' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1309:1: ( ':' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1310:1: ':'
            {
             before(grammarAccess.getVisibilityDeclAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__VisibilityDecl__Group__1__Impl2662); 
             after(grammarAccess.getVisibilityDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityDecl__Group__1__Impl"


    // $ANTLR start "rule__MethodDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1327:1: rule__MethodDecl__Group__0 : rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 ;
    public final void rule__MethodDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1331:1: ( rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1332:2: rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1
            {
            pushFollow(FOLLOW_rule__MethodDecl__Group__0__Impl_in_rule__MethodDecl__Group__02697);
            rule__MethodDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodDecl__Group__1_in_rule__MethodDecl__Group__02700);
            rule__MethodDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0"


    // $ANTLR start "rule__MethodDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1339:1: rule__MethodDecl__Group__0__Impl : ( ( rule__MethodDecl__ReturnTypeAssignment_0 ) ) ;
    public final void rule__MethodDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1343:1: ( ( ( rule__MethodDecl__ReturnTypeAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1344:1: ( ( rule__MethodDecl__ReturnTypeAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1344:1: ( ( rule__MethodDecl__ReturnTypeAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1345:1: ( rule__MethodDecl__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodDeclAccess().getReturnTypeAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1346:1: ( rule__MethodDecl__ReturnTypeAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1346:2: rule__MethodDecl__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDecl__ReturnTypeAssignment_0_in_rule__MethodDecl__Group__0__Impl2727);
            rule__MethodDecl__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getReturnTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0__Impl"


    // $ANTLR start "rule__MethodDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1356:1: rule__MethodDecl__Group__1 : rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 ;
    public final void rule__MethodDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1360:1: ( rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1361:2: rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2
            {
            pushFollow(FOLLOW_rule__MethodDecl__Group__1__Impl_in_rule__MethodDecl__Group__12757);
            rule__MethodDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodDecl__Group__2_in_rule__MethodDecl__Group__12760);
            rule__MethodDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1"


    // $ANTLR start "rule__MethodDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1368:1: rule__MethodDecl__Group__1__Impl : ( ( rule__MethodDecl__NameAssignment_1 ) ) ;
    public final void rule__MethodDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1372:1: ( ( ( rule__MethodDecl__NameAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1373:1: ( ( rule__MethodDecl__NameAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1373:1: ( ( rule__MethodDecl__NameAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1374:1: ( rule__MethodDecl__NameAssignment_1 )
            {
             before(grammarAccess.getMethodDeclAccess().getNameAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1375:1: ( rule__MethodDecl__NameAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1375:2: rule__MethodDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDecl__NameAssignment_1_in_rule__MethodDecl__Group__1__Impl2787);
            rule__MethodDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1__Impl"


    // $ANTLR start "rule__MethodDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1385:1: rule__MethodDecl__Group__2 : rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 ;
    public final void rule__MethodDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1389:1: ( rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1390:2: rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3
            {
            pushFollow(FOLLOW_rule__MethodDecl__Group__2__Impl_in_rule__MethodDecl__Group__22817);
            rule__MethodDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodDecl__Group__3_in_rule__MethodDecl__Group__22820);
            rule__MethodDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2"


    // $ANTLR start "rule__MethodDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1397:1: rule__MethodDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1401:1: ( ( '(' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1402:1: ( '(' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1402:1: ( '(' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1403:1: '('
            {
             before(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__MethodDecl__Group__2__Impl2848); 
             after(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2__Impl"


    // $ANTLR start "rule__MethodDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1416:1: rule__MethodDecl__Group__3 : rule__MethodDecl__Group__3__Impl ;
    public final void rule__MethodDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1420:1: ( rule__MethodDecl__Group__3__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1421:2: rule__MethodDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodDecl__Group__3__Impl_in_rule__MethodDecl__Group__32879);
            rule__MethodDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3"


    // $ANTLR start "rule__MethodDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1427:1: rule__MethodDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1431:1: ( ( ')' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1432:1: ( ')' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1432:1: ( ')' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1433:1: ')'
            {
             before(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__MethodDecl__Group__3__Impl2907); 
             after(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3__Impl"


    // $ANTLR start "rule__AttributeDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1454:1: rule__AttributeDecl__Group__0 : rule__AttributeDecl__Group__0__Impl rule__AttributeDecl__Group__1 ;
    public final void rule__AttributeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1458:1: ( rule__AttributeDecl__Group__0__Impl rule__AttributeDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1459:2: rule__AttributeDecl__Group__0__Impl rule__AttributeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeDecl__Group__0__Impl_in_rule__AttributeDecl__Group__02946);
            rule__AttributeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeDecl__Group__1_in_rule__AttributeDecl__Group__02949);
            rule__AttributeDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__Group__0"


    // $ANTLR start "rule__AttributeDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1466:1: rule__AttributeDecl__Group__0__Impl : ( ( rule__AttributeDecl__TypeAssignment_0 ) ) ;
    public final void rule__AttributeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1470:1: ( ( ( rule__AttributeDecl__TypeAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1471:1: ( ( rule__AttributeDecl__TypeAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1471:1: ( ( rule__AttributeDecl__TypeAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1472:1: ( rule__AttributeDecl__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeDeclAccess().getTypeAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1473:1: ( rule__AttributeDecl__TypeAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1473:2: rule__AttributeDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeDecl__TypeAssignment_0_in_rule__AttributeDecl__Group__0__Impl2976);
            rule__AttributeDecl__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__Group__0__Impl"


    // $ANTLR start "rule__AttributeDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1483:1: rule__AttributeDecl__Group__1 : rule__AttributeDecl__Group__1__Impl ;
    public final void rule__AttributeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1487:1: ( rule__AttributeDecl__Group__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1488:2: rule__AttributeDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeDecl__Group__1__Impl_in_rule__AttributeDecl__Group__13006);
            rule__AttributeDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__Group__1"


    // $ANTLR start "rule__AttributeDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1494:1: rule__AttributeDecl__Group__1__Impl : ( ( rule__AttributeDecl__NameAssignment_1 ) ) ;
    public final void rule__AttributeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1498:1: ( ( ( rule__AttributeDecl__NameAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1499:1: ( ( rule__AttributeDecl__NameAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1499:1: ( ( rule__AttributeDecl__NameAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1500:1: ( rule__AttributeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeDeclAccess().getNameAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1501:1: ( rule__AttributeDecl__NameAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1501:2: rule__AttributeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeDecl__NameAssignment_1_in_rule__AttributeDecl__Group__1__Impl3033);
            rule__AttributeDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__Group__1__Impl"


    // $ANTLR start "rule__AssociationDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1515:1: rule__AssociationDecl__Group__0 : rule__AssociationDecl__Group__0__Impl rule__AssociationDecl__Group__1 ;
    public final void rule__AssociationDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1519:1: ( rule__AssociationDecl__Group__0__Impl rule__AssociationDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1520:2: rule__AssociationDecl__Group__0__Impl rule__AssociationDecl__Group__1
            {
            pushFollow(FOLLOW_rule__AssociationDecl__Group__0__Impl_in_rule__AssociationDecl__Group__03067);
            rule__AssociationDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssociationDecl__Group__1_in_rule__AssociationDecl__Group__03070);
            rule__AssociationDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__Group__0"


    // $ANTLR start "rule__AssociationDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1527:1: rule__AssociationDecl__Group__0__Impl : ( ( rule__AssociationDecl__TypeAssignment_0 ) ) ;
    public final void rule__AssociationDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1531:1: ( ( ( rule__AssociationDecl__TypeAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1532:1: ( ( rule__AssociationDecl__TypeAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1532:1: ( ( rule__AssociationDecl__TypeAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1533:1: ( rule__AssociationDecl__TypeAssignment_0 )
            {
             before(grammarAccess.getAssociationDeclAccess().getTypeAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1534:1: ( rule__AssociationDecl__TypeAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1534:2: rule__AssociationDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__AssociationDecl__TypeAssignment_0_in_rule__AssociationDecl__Group__0__Impl3097);
            rule__AssociationDecl__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__Group__0__Impl"


    // $ANTLR start "rule__AssociationDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1544:1: rule__AssociationDecl__Group__1 : rule__AssociationDecl__Group__1__Impl ;
    public final void rule__AssociationDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1548:1: ( rule__AssociationDecl__Group__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1549:2: rule__AssociationDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssociationDecl__Group__1__Impl_in_rule__AssociationDecl__Group__13127);
            rule__AssociationDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__Group__1"


    // $ANTLR start "rule__AssociationDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1555:1: rule__AssociationDecl__Group__1__Impl : ( ( rule__AssociationDecl__NameAssignment_1 ) ) ;
    public final void rule__AssociationDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1559:1: ( ( ( rule__AssociationDecl__NameAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1560:1: ( ( rule__AssociationDecl__NameAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1560:1: ( ( rule__AssociationDecl__NameAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1561:1: ( rule__AssociationDecl__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationDeclAccess().getNameAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1562:1: ( rule__AssociationDecl__NameAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1562:2: rule__AssociationDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssociationDecl__NameAssignment_1_in_rule__AssociationDecl__Group__1__Impl3154);
            rule__AssociationDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__Group__1__Impl"


    // $ANTLR start "rule__SequenceDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1576:1: rule__SequenceDecl__Group__0 : rule__SequenceDecl__Group__0__Impl rule__SequenceDecl__Group__1 ;
    public final void rule__SequenceDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1580:1: ( rule__SequenceDecl__Group__0__Impl rule__SequenceDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1581:2: rule__SequenceDecl__Group__0__Impl rule__SequenceDecl__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__0__Impl_in_rule__SequenceDecl__Group__03188);
            rule__SequenceDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceDecl__Group__1_in_rule__SequenceDecl__Group__03191);
            rule__SequenceDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__0"


    // $ANTLR start "rule__SequenceDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1588:1: rule__SequenceDecl__Group__0__Impl : ( 'sequence' ) ;
    public final void rule__SequenceDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1592:1: ( ( 'sequence' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1593:1: ( 'sequence' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1593:1: ( 'sequence' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1594:1: 'sequence'
            {
             before(grammarAccess.getSequenceDeclAccess().getSequenceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SequenceDecl__Group__0__Impl3219); 
             after(grammarAccess.getSequenceDeclAccess().getSequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__0__Impl"


    // $ANTLR start "rule__SequenceDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1607:1: rule__SequenceDecl__Group__1 : rule__SequenceDecl__Group__1__Impl rule__SequenceDecl__Group__2 ;
    public final void rule__SequenceDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1611:1: ( rule__SequenceDecl__Group__1__Impl rule__SequenceDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1612:2: rule__SequenceDecl__Group__1__Impl rule__SequenceDecl__Group__2
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__1__Impl_in_rule__SequenceDecl__Group__13250);
            rule__SequenceDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceDecl__Group__2_in_rule__SequenceDecl__Group__13253);
            rule__SequenceDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__1"


    // $ANTLR start "rule__SequenceDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1619:1: rule__SequenceDecl__Group__1__Impl : ( ( rule__SequenceDecl__NameAssignment_1 ) ) ;
    public final void rule__SequenceDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1623:1: ( ( ( rule__SequenceDecl__NameAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1624:1: ( ( rule__SequenceDecl__NameAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1624:1: ( ( rule__SequenceDecl__NameAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1625:1: ( rule__SequenceDecl__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceDeclAccess().getNameAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1626:1: ( rule__SequenceDecl__NameAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1626:2: rule__SequenceDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SequenceDecl__NameAssignment_1_in_rule__SequenceDecl__Group__1__Impl3280);
            rule__SequenceDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__1__Impl"


    // $ANTLR start "rule__SequenceDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1636:1: rule__SequenceDecl__Group__2 : rule__SequenceDecl__Group__2__Impl rule__SequenceDecl__Group__3 ;
    public final void rule__SequenceDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1640:1: ( rule__SequenceDecl__Group__2__Impl rule__SequenceDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1641:2: rule__SequenceDecl__Group__2__Impl rule__SequenceDecl__Group__3
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__2__Impl_in_rule__SequenceDecl__Group__23310);
            rule__SequenceDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceDecl__Group__3_in_rule__SequenceDecl__Group__23313);
            rule__SequenceDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__2"


    // $ANTLR start "rule__SequenceDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1648:1: rule__SequenceDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__SequenceDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1652:1: ( ( '{' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1653:1: ( '{' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1653:1: ( '{' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1654:1: '{'
            {
             before(grammarAccess.getSequenceDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__SequenceDecl__Group__2__Impl3341); 
             after(grammarAccess.getSequenceDeclAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__2__Impl"


    // $ANTLR start "rule__SequenceDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1667:1: rule__SequenceDecl__Group__3 : rule__SequenceDecl__Group__3__Impl rule__SequenceDecl__Group__4 ;
    public final void rule__SequenceDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1671:1: ( rule__SequenceDecl__Group__3__Impl rule__SequenceDecl__Group__4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1672:2: rule__SequenceDecl__Group__3__Impl rule__SequenceDecl__Group__4
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__3__Impl_in_rule__SequenceDecl__Group__33372);
            rule__SequenceDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceDecl__Group__4_in_rule__SequenceDecl__Group__33375);
            rule__SequenceDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__3"


    // $ANTLR start "rule__SequenceDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1679:1: rule__SequenceDecl__Group__3__Impl : ( ( rule__SequenceDecl__Group_3__0 )? ) ;
    public final void rule__SequenceDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1683:1: ( ( ( rule__SequenceDecl__Group_3__0 )? ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1684:1: ( ( rule__SequenceDecl__Group_3__0 )? )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1684:1: ( ( rule__SequenceDecl__Group_3__0 )? )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1685:1: ( rule__SequenceDecl__Group_3__0 )?
            {
             before(grammarAccess.getSequenceDeclAccess().getGroup_3()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1686:1: ( rule__SequenceDecl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1686:2: rule__SequenceDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SequenceDecl__Group_3__0_in_rule__SequenceDecl__Group__3__Impl3402);
                    rule__SequenceDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__3__Impl"


    // $ANTLR start "rule__SequenceDecl__Group__4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1696:1: rule__SequenceDecl__Group__4 : rule__SequenceDecl__Group__4__Impl ;
    public final void rule__SequenceDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1700:1: ( rule__SequenceDecl__Group__4__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1701:2: rule__SequenceDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group__4__Impl_in_rule__SequenceDecl__Group__43433);
            rule__SequenceDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__4"


    // $ANTLR start "rule__SequenceDecl__Group__4__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1707:1: rule__SequenceDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__SequenceDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1711:1: ( ( '}' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1712:1: ( '}' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1712:1: ( '}' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1713:1: '}'
            {
             before(grammarAccess.getSequenceDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__SequenceDecl__Group__4__Impl3461); 
             after(grammarAccess.getSequenceDeclAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group__4__Impl"


    // $ANTLR start "rule__SequenceDecl__Group_3__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1736:1: rule__SequenceDecl__Group_3__0 : rule__SequenceDecl__Group_3__0__Impl rule__SequenceDecl__Group_3__1 ;
    public final void rule__SequenceDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1740:1: ( rule__SequenceDecl__Group_3__0__Impl rule__SequenceDecl__Group_3__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1741:2: rule__SequenceDecl__Group_3__0__Impl rule__SequenceDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group_3__0__Impl_in_rule__SequenceDecl__Group_3__03502);
            rule__SequenceDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceDecl__Group_3__1_in_rule__SequenceDecl__Group_3__03505);
            rule__SequenceDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group_3__0"


    // $ANTLR start "rule__SequenceDecl__Group_3__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1748:1: rule__SequenceDecl__Group_3__0__Impl : ( ( rule__SequenceDecl__SectionsAssignment_3_0 ) ) ;
    public final void rule__SequenceDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1752:1: ( ( ( rule__SequenceDecl__SectionsAssignment_3_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1753:1: ( ( rule__SequenceDecl__SectionsAssignment_3_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1753:1: ( ( rule__SequenceDecl__SectionsAssignment_3_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1754:1: ( rule__SequenceDecl__SectionsAssignment_3_0 )
            {
             before(grammarAccess.getSequenceDeclAccess().getSectionsAssignment_3_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1755:1: ( rule__SequenceDecl__SectionsAssignment_3_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1755:2: rule__SequenceDecl__SectionsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__SequenceDecl__SectionsAssignment_3_0_in_rule__SequenceDecl__Group_3__0__Impl3532);
            rule__SequenceDecl__SectionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDeclAccess().getSectionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group_3__0__Impl"


    // $ANTLR start "rule__SequenceDecl__Group_3__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1765:1: rule__SequenceDecl__Group_3__1 : rule__SequenceDecl__Group_3__1__Impl ;
    public final void rule__SequenceDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1769:1: ( rule__SequenceDecl__Group_3__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1770:2: rule__SequenceDecl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceDecl__Group_3__1__Impl_in_rule__SequenceDecl__Group_3__13562);
            rule__SequenceDecl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group_3__1"


    // $ANTLR start "rule__SequenceDecl__Group_3__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1776:1: rule__SequenceDecl__Group_3__1__Impl : ( ( rule__SequenceDecl__SectionsAssignment_3_1 )* ) ;
    public final void rule__SequenceDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1780:1: ( ( ( rule__SequenceDecl__SectionsAssignment_3_1 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1781:1: ( ( rule__SequenceDecl__SectionsAssignment_3_1 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1781:1: ( ( rule__SequenceDecl__SectionsAssignment_3_1 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1782:1: ( rule__SequenceDecl__SectionsAssignment_3_1 )*
            {
             before(grammarAccess.getSequenceDeclAccess().getSectionsAssignment_3_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1783:1: ( rule__SequenceDecl__SectionsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1783:2: rule__SequenceDecl__SectionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__SequenceDecl__SectionsAssignment_3_1_in_rule__SequenceDecl__Group_3__1__Impl3589);
            	    rule__SequenceDecl__SectionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSequenceDeclAccess().getSectionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__Group_3__1__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1797:1: rule__ActorSectionDecl__Group__0 : rule__ActorSectionDecl__Group__0__Impl rule__ActorSectionDecl__Group__1 ;
    public final void rule__ActorSectionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1801:1: ( rule__ActorSectionDecl__Group__0__Impl rule__ActorSectionDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1802:2: rule__ActorSectionDecl__Group__0__Impl rule__ActorSectionDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__0__Impl_in_rule__ActorSectionDecl__Group__03624);
            rule__ActorSectionDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__1_in_rule__ActorSectionDecl__Group__03627);
            rule__ActorSectionDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__0"


    // $ANTLR start "rule__ActorSectionDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1809:1: rule__ActorSectionDecl__Group__0__Impl : ( 'actors' ) ;
    public final void rule__ActorSectionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1813:1: ( ( 'actors' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1814:1: ( 'actors' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1814:1: ( 'actors' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1815:1: 'actors'
            {
             before(grammarAccess.getActorSectionDeclAccess().getActorsKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ActorSectionDecl__Group__0__Impl3655); 
             after(grammarAccess.getActorSectionDeclAccess().getActorsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__0__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1828:1: rule__ActorSectionDecl__Group__1 : rule__ActorSectionDecl__Group__1__Impl rule__ActorSectionDecl__Group__2 ;
    public final void rule__ActorSectionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1832:1: ( rule__ActorSectionDecl__Group__1__Impl rule__ActorSectionDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1833:2: rule__ActorSectionDecl__Group__1__Impl rule__ActorSectionDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__1__Impl_in_rule__ActorSectionDecl__Group__13686);
            rule__ActorSectionDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__2_in_rule__ActorSectionDecl__Group__13689);
            rule__ActorSectionDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__1"


    // $ANTLR start "rule__ActorSectionDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1840:1: rule__ActorSectionDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__ActorSectionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1844:1: ( ( ':' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1845:1: ( ':' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1845:1: ( ':' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1846:1: ':'
            {
             before(grammarAccess.getActorSectionDeclAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ActorSectionDecl__Group__1__Impl3717); 
             after(grammarAccess.getActorSectionDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__1__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1859:1: rule__ActorSectionDecl__Group__2 : rule__ActorSectionDecl__Group__2__Impl rule__ActorSectionDecl__Group__3 ;
    public final void rule__ActorSectionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1863:1: ( rule__ActorSectionDecl__Group__2__Impl rule__ActorSectionDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1864:2: rule__ActorSectionDecl__Group__2__Impl rule__ActorSectionDecl__Group__3
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__2__Impl_in_rule__ActorSectionDecl__Group__23748);
            rule__ActorSectionDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__3_in_rule__ActorSectionDecl__Group__23751);
            rule__ActorSectionDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__2"


    // $ANTLR start "rule__ActorSectionDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1871:1: rule__ActorSectionDecl__Group__2__Impl : ( ( rule__ActorSectionDecl__ActorsAssignment_2 ) ) ;
    public final void rule__ActorSectionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1875:1: ( ( ( rule__ActorSectionDecl__ActorsAssignment_2 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1876:1: ( ( rule__ActorSectionDecl__ActorsAssignment_2 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1876:1: ( ( rule__ActorSectionDecl__ActorsAssignment_2 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1877:1: ( rule__ActorSectionDecl__ActorsAssignment_2 )
            {
             before(grammarAccess.getActorSectionDeclAccess().getActorsAssignment_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1878:1: ( rule__ActorSectionDecl__ActorsAssignment_2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1878:2: rule__ActorSectionDecl__ActorsAssignment_2
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__ActorsAssignment_2_in_rule__ActorSectionDecl__Group__2__Impl3778);
            rule__ActorSectionDecl__ActorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorSectionDeclAccess().getActorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__2__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1888:1: rule__ActorSectionDecl__Group__3 : rule__ActorSectionDecl__Group__3__Impl rule__ActorSectionDecl__Group__4 ;
    public final void rule__ActorSectionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1892:1: ( rule__ActorSectionDecl__Group__3__Impl rule__ActorSectionDecl__Group__4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1893:2: rule__ActorSectionDecl__Group__3__Impl rule__ActorSectionDecl__Group__4
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__3__Impl_in_rule__ActorSectionDecl__Group__33808);
            rule__ActorSectionDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__4_in_rule__ActorSectionDecl__Group__33811);
            rule__ActorSectionDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__3"


    // $ANTLR start "rule__ActorSectionDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1900:1: rule__ActorSectionDecl__Group__3__Impl : ( ( rule__ActorSectionDecl__Group_3__0 )* ) ;
    public final void rule__ActorSectionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1904:1: ( ( ( rule__ActorSectionDecl__Group_3__0 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1905:1: ( ( rule__ActorSectionDecl__Group_3__0 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1905:1: ( ( rule__ActorSectionDecl__Group_3__0 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1906:1: ( rule__ActorSectionDecl__Group_3__0 )*
            {
             before(grammarAccess.getActorSectionDeclAccess().getGroup_3()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1907:1: ( rule__ActorSectionDecl__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1907:2: rule__ActorSectionDecl__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ActorSectionDecl__Group_3__0_in_rule__ActorSectionDecl__Group__3__Impl3838);
            	    rule__ActorSectionDecl__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getActorSectionDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__3__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group__4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1917:1: rule__ActorSectionDecl__Group__4 : rule__ActorSectionDecl__Group__4__Impl ;
    public final void rule__ActorSectionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1921:1: ( rule__ActorSectionDecl__Group__4__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1922:2: rule__ActorSectionDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group__4__Impl_in_rule__ActorSectionDecl__Group__43869);
            rule__ActorSectionDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__4"


    // $ANTLR start "rule__ActorSectionDecl__Group__4__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1928:1: rule__ActorSectionDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__ActorSectionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1932:1: ( ( ';' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1933:1: ( ';' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1933:1: ( ';' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1934:1: ';'
            {
             before(grammarAccess.getActorSectionDeclAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ActorSectionDecl__Group__4__Impl3897); 
             after(grammarAccess.getActorSectionDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group__4__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group_3__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1957:1: rule__ActorSectionDecl__Group_3__0 : rule__ActorSectionDecl__Group_3__0__Impl rule__ActorSectionDecl__Group_3__1 ;
    public final void rule__ActorSectionDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1961:1: ( rule__ActorSectionDecl__Group_3__0__Impl rule__ActorSectionDecl__Group_3__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1962:2: rule__ActorSectionDecl__Group_3__0__Impl rule__ActorSectionDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group_3__0__Impl_in_rule__ActorSectionDecl__Group_3__03938);
            rule__ActorSectionDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorSectionDecl__Group_3__1_in_rule__ActorSectionDecl__Group_3__03941);
            rule__ActorSectionDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group_3__0"


    // $ANTLR start "rule__ActorSectionDecl__Group_3__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1969:1: rule__ActorSectionDecl__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ActorSectionDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1973:1: ( ( ',' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1974:1: ( ',' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1974:1: ( ',' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1975:1: ','
            {
             before(grammarAccess.getActorSectionDeclAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__ActorSectionDecl__Group_3__0__Impl3969); 
             after(grammarAccess.getActorSectionDeclAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group_3__0__Impl"


    // $ANTLR start "rule__ActorSectionDecl__Group_3__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1988:1: rule__ActorSectionDecl__Group_3__1 : rule__ActorSectionDecl__Group_3__1__Impl ;
    public final void rule__ActorSectionDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1992:1: ( rule__ActorSectionDecl__Group_3__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1993:2: rule__ActorSectionDecl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__Group_3__1__Impl_in_rule__ActorSectionDecl__Group_3__14000);
            rule__ActorSectionDecl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group_3__1"


    // $ANTLR start "rule__ActorSectionDecl__Group_3__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:1999:1: rule__ActorSectionDecl__Group_3__1__Impl : ( ( rule__ActorSectionDecl__ActorsAssignment_3_1 ) ) ;
    public final void rule__ActorSectionDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2003:1: ( ( ( rule__ActorSectionDecl__ActorsAssignment_3_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2004:1: ( ( rule__ActorSectionDecl__ActorsAssignment_3_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2004:1: ( ( rule__ActorSectionDecl__ActorsAssignment_3_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2005:1: ( rule__ActorSectionDecl__ActorsAssignment_3_1 )
            {
             before(grammarAccess.getActorSectionDeclAccess().getActorsAssignment_3_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2006:1: ( rule__ActorSectionDecl__ActorsAssignment_3_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2006:2: rule__ActorSectionDecl__ActorsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ActorSectionDecl__ActorsAssignment_3_1_in_rule__ActorSectionDecl__Group_3__1__Impl4027);
            rule__ActorSectionDecl__ActorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActorSectionDeclAccess().getActorsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__Group_3__1__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2020:1: rule__MessageSectionDecl__Group__0 : rule__MessageSectionDecl__Group__0__Impl rule__MessageSectionDecl__Group__1 ;
    public final void rule__MessageSectionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2024:1: ( rule__MessageSectionDecl__Group__0__Impl rule__MessageSectionDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2025:2: rule__MessageSectionDecl__Group__0__Impl rule__MessageSectionDecl__Group__1
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__0__Impl_in_rule__MessageSectionDecl__Group__04061);
            rule__MessageSectionDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__1_in_rule__MessageSectionDecl__Group__04064);
            rule__MessageSectionDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__0"


    // $ANTLR start "rule__MessageSectionDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2032:1: rule__MessageSectionDecl__Group__0__Impl : ( 'messages' ) ;
    public final void rule__MessageSectionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2036:1: ( ( 'messages' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2037:1: ( 'messages' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2037:1: ( 'messages' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2038:1: 'messages'
            {
             before(grammarAccess.getMessageSectionDeclAccess().getMessagesKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__MessageSectionDecl__Group__0__Impl4092); 
             after(grammarAccess.getMessageSectionDeclAccess().getMessagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__0__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2051:1: rule__MessageSectionDecl__Group__1 : rule__MessageSectionDecl__Group__1__Impl rule__MessageSectionDecl__Group__2 ;
    public final void rule__MessageSectionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2055:1: ( rule__MessageSectionDecl__Group__1__Impl rule__MessageSectionDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2056:2: rule__MessageSectionDecl__Group__1__Impl rule__MessageSectionDecl__Group__2
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__1__Impl_in_rule__MessageSectionDecl__Group__14123);
            rule__MessageSectionDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__2_in_rule__MessageSectionDecl__Group__14126);
            rule__MessageSectionDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__1"


    // $ANTLR start "rule__MessageSectionDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2063:1: rule__MessageSectionDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__MessageSectionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2067:1: ( ( ':' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2068:1: ( ':' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2068:1: ( ':' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2069:1: ':'
            {
             before(grammarAccess.getMessageSectionDeclAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MessageSectionDecl__Group__1__Impl4154); 
             after(grammarAccess.getMessageSectionDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__1__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2082:1: rule__MessageSectionDecl__Group__2 : rule__MessageSectionDecl__Group__2__Impl rule__MessageSectionDecl__Group__3 ;
    public final void rule__MessageSectionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2086:1: ( rule__MessageSectionDecl__Group__2__Impl rule__MessageSectionDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2087:2: rule__MessageSectionDecl__Group__2__Impl rule__MessageSectionDecl__Group__3
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__2__Impl_in_rule__MessageSectionDecl__Group__24185);
            rule__MessageSectionDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__3_in_rule__MessageSectionDecl__Group__24188);
            rule__MessageSectionDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__2"


    // $ANTLR start "rule__MessageSectionDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2094:1: rule__MessageSectionDecl__Group__2__Impl : ( ( rule__MessageSectionDecl__MessagesAssignment_2 ) ) ;
    public final void rule__MessageSectionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2098:1: ( ( ( rule__MessageSectionDecl__MessagesAssignment_2 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2099:1: ( ( rule__MessageSectionDecl__MessagesAssignment_2 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2099:1: ( ( rule__MessageSectionDecl__MessagesAssignment_2 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2100:1: ( rule__MessageSectionDecl__MessagesAssignment_2 )
            {
             before(grammarAccess.getMessageSectionDeclAccess().getMessagesAssignment_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2101:1: ( rule__MessageSectionDecl__MessagesAssignment_2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2101:2: rule__MessageSectionDecl__MessagesAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__MessagesAssignment_2_in_rule__MessageSectionDecl__Group__2__Impl4215);
            rule__MessageSectionDecl__MessagesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageSectionDeclAccess().getMessagesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__2__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2111:1: rule__MessageSectionDecl__Group__3 : rule__MessageSectionDecl__Group__3__Impl rule__MessageSectionDecl__Group__4 ;
    public final void rule__MessageSectionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2115:1: ( rule__MessageSectionDecl__Group__3__Impl rule__MessageSectionDecl__Group__4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2116:2: rule__MessageSectionDecl__Group__3__Impl rule__MessageSectionDecl__Group__4
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__3__Impl_in_rule__MessageSectionDecl__Group__34245);
            rule__MessageSectionDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__4_in_rule__MessageSectionDecl__Group__34248);
            rule__MessageSectionDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__3"


    // $ANTLR start "rule__MessageSectionDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2123:1: rule__MessageSectionDecl__Group__3__Impl : ( ( rule__MessageSectionDecl__Group_3__0 )* ) ;
    public final void rule__MessageSectionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2127:1: ( ( ( rule__MessageSectionDecl__Group_3__0 )* ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2128:1: ( ( rule__MessageSectionDecl__Group_3__0 )* )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2128:1: ( ( rule__MessageSectionDecl__Group_3__0 )* )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2129:1: ( rule__MessageSectionDecl__Group_3__0 )*
            {
             before(grammarAccess.getMessageSectionDeclAccess().getGroup_3()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2130:1: ( rule__MessageSectionDecl__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2130:2: rule__MessageSectionDecl__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageSectionDecl__Group_3__0_in_rule__MessageSectionDecl__Group__3__Impl4275);
            	    rule__MessageSectionDecl__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMessageSectionDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__3__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group__4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2140:1: rule__MessageSectionDecl__Group__4 : rule__MessageSectionDecl__Group__4__Impl ;
    public final void rule__MessageSectionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2144:1: ( rule__MessageSectionDecl__Group__4__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2145:2: rule__MessageSectionDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group__4__Impl_in_rule__MessageSectionDecl__Group__44306);
            rule__MessageSectionDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__4"


    // $ANTLR start "rule__MessageSectionDecl__Group__4__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2151:1: rule__MessageSectionDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__MessageSectionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2155:1: ( ( ';' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2156:1: ( ';' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2156:1: ( ';' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2157:1: ';'
            {
             before(grammarAccess.getMessageSectionDeclAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__MessageSectionDecl__Group__4__Impl4334); 
             after(grammarAccess.getMessageSectionDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group__4__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group_3__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2180:1: rule__MessageSectionDecl__Group_3__0 : rule__MessageSectionDecl__Group_3__0__Impl rule__MessageSectionDecl__Group_3__1 ;
    public final void rule__MessageSectionDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2184:1: ( rule__MessageSectionDecl__Group_3__0__Impl rule__MessageSectionDecl__Group_3__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2185:2: rule__MessageSectionDecl__Group_3__0__Impl rule__MessageSectionDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group_3__0__Impl_in_rule__MessageSectionDecl__Group_3__04375);
            rule__MessageSectionDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSectionDecl__Group_3__1_in_rule__MessageSectionDecl__Group_3__04378);
            rule__MessageSectionDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group_3__0"


    // $ANTLR start "rule__MessageSectionDecl__Group_3__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2192:1: rule__MessageSectionDecl__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MessageSectionDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2196:1: ( ( ',' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2197:1: ( ',' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2197:1: ( ',' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2198:1: ','
            {
             before(grammarAccess.getMessageSectionDeclAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__MessageSectionDecl__Group_3__0__Impl4406); 
             after(grammarAccess.getMessageSectionDeclAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group_3__0__Impl"


    // $ANTLR start "rule__MessageSectionDecl__Group_3__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2211:1: rule__MessageSectionDecl__Group_3__1 : rule__MessageSectionDecl__Group_3__1__Impl ;
    public final void rule__MessageSectionDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2215:1: ( rule__MessageSectionDecl__Group_3__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2216:2: rule__MessageSectionDecl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__Group_3__1__Impl_in_rule__MessageSectionDecl__Group_3__14437);
            rule__MessageSectionDecl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group_3__1"


    // $ANTLR start "rule__MessageSectionDecl__Group_3__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2222:1: rule__MessageSectionDecl__Group_3__1__Impl : ( ( rule__MessageSectionDecl__MessagesAssignment_3_1 ) ) ;
    public final void rule__MessageSectionDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2226:1: ( ( ( rule__MessageSectionDecl__MessagesAssignment_3_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2227:1: ( ( rule__MessageSectionDecl__MessagesAssignment_3_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2227:1: ( ( rule__MessageSectionDecl__MessagesAssignment_3_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2228:1: ( rule__MessageSectionDecl__MessagesAssignment_3_1 )
            {
             before(grammarAccess.getMessageSectionDeclAccess().getMessagesAssignment_3_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2229:1: ( rule__MessageSectionDecl__MessagesAssignment_3_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2229:2: rule__MessageSectionDecl__MessagesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MessageSectionDecl__MessagesAssignment_3_1_in_rule__MessageSectionDecl__Group_3__1__Impl4464);
            rule__MessageSectionDecl__MessagesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageSectionDeclAccess().getMessagesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__Group_3__1__Impl"


    // $ANTLR start "rule__ActorDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2243:1: rule__ActorDecl__Group__0 : rule__ActorDecl__Group__0__Impl rule__ActorDecl__Group__1 ;
    public final void rule__ActorDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2247:1: ( rule__ActorDecl__Group__0__Impl rule__ActorDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2248:2: rule__ActorDecl__Group__0__Impl rule__ActorDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ActorDecl__Group__0__Impl_in_rule__ActorDecl__Group__04498);
            rule__ActorDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActorDecl__Group__1_in_rule__ActorDecl__Group__04501);
            rule__ActorDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__Group__0"


    // $ANTLR start "rule__ActorDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2255:1: rule__ActorDecl__Group__0__Impl : ( ( rule__ActorDecl__NameAssignment_0 ) ) ;
    public final void rule__ActorDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2259:1: ( ( ( rule__ActorDecl__NameAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2260:1: ( ( rule__ActorDecl__NameAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2260:1: ( ( rule__ActorDecl__NameAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2261:1: ( rule__ActorDecl__NameAssignment_0 )
            {
             before(grammarAccess.getActorDeclAccess().getNameAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2262:1: ( rule__ActorDecl__NameAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2262:2: rule__ActorDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ActorDecl__NameAssignment_0_in_rule__ActorDecl__Group__0__Impl4528);
            rule__ActorDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActorDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__Group__0__Impl"


    // $ANTLR start "rule__ActorDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2272:1: rule__ActorDecl__Group__1 : rule__ActorDecl__Group__1__Impl ;
    public final void rule__ActorDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2276:1: ( rule__ActorDecl__Group__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2277:2: rule__ActorDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActorDecl__Group__1__Impl_in_rule__ActorDecl__Group__14558);
            rule__ActorDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__Group__1"


    // $ANTLR start "rule__ActorDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2283:1: rule__ActorDecl__Group__1__Impl : ( ( rule__ActorDecl__ClassRefAssignment_1 )? ) ;
    public final void rule__ActorDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2287:1: ( ( ( rule__ActorDecl__ClassRefAssignment_1 )? ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2288:1: ( ( rule__ActorDecl__ClassRefAssignment_1 )? )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2288:1: ( ( rule__ActorDecl__ClassRefAssignment_1 )? )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2289:1: ( rule__ActorDecl__ClassRefAssignment_1 )?
            {
             before(grammarAccess.getActorDeclAccess().getClassRefAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2290:1: ( rule__ActorDecl__ClassRefAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2290:2: rule__ActorDecl__ClassRefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ActorDecl__ClassRefAssignment_1_in_rule__ActorDecl__Group__1__Impl4585);
                    rule__ActorDecl__ClassRefAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorDeclAccess().getClassRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__Group__1__Impl"


    // $ANTLR start "rule__MessageDecl__Group__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2304:1: rule__MessageDecl__Group__0 : rule__MessageDecl__Group__0__Impl rule__MessageDecl__Group__1 ;
    public final void rule__MessageDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2308:1: ( rule__MessageDecl__Group__0__Impl rule__MessageDecl__Group__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2309:2: rule__MessageDecl__Group__0__Impl rule__MessageDecl__Group__1
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__0__Impl_in_rule__MessageDecl__Group__04620);
            rule__MessageDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDecl__Group__1_in_rule__MessageDecl__Group__04623);
            rule__MessageDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__0"


    // $ANTLR start "rule__MessageDecl__Group__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2316:1: rule__MessageDecl__Group__0__Impl : ( ( rule__MessageDecl__NameAssignment_0 ) ) ;
    public final void rule__MessageDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2320:1: ( ( ( rule__MessageDecl__NameAssignment_0 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2321:1: ( ( rule__MessageDecl__NameAssignment_0 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2321:1: ( ( rule__MessageDecl__NameAssignment_0 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2322:1: ( rule__MessageDecl__NameAssignment_0 )
            {
             before(grammarAccess.getMessageDeclAccess().getNameAssignment_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2323:1: ( rule__MessageDecl__NameAssignment_0 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2323:2: rule__MessageDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageDecl__NameAssignment_0_in_rule__MessageDecl__Group__0__Impl4650);
            rule__MessageDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__0__Impl"


    // $ANTLR start "rule__MessageDecl__Group__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2333:1: rule__MessageDecl__Group__1 : rule__MessageDecl__Group__1__Impl rule__MessageDecl__Group__2 ;
    public final void rule__MessageDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2337:1: ( rule__MessageDecl__Group__1__Impl rule__MessageDecl__Group__2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2338:2: rule__MessageDecl__Group__1__Impl rule__MessageDecl__Group__2
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__1__Impl_in_rule__MessageDecl__Group__14680);
            rule__MessageDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDecl__Group__2_in_rule__MessageDecl__Group__14683);
            rule__MessageDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__1"


    // $ANTLR start "rule__MessageDecl__Group__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2345:1: rule__MessageDecl__Group__1__Impl : ( ( rule__MessageDecl__LeftOpAssignment_1 ) ) ;
    public final void rule__MessageDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2349:1: ( ( ( rule__MessageDecl__LeftOpAssignment_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2350:1: ( ( rule__MessageDecl__LeftOpAssignment_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2350:1: ( ( rule__MessageDecl__LeftOpAssignment_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2351:1: ( rule__MessageDecl__LeftOpAssignment_1 )
            {
             before(grammarAccess.getMessageDeclAccess().getLeftOpAssignment_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2352:1: ( rule__MessageDecl__LeftOpAssignment_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2352:2: rule__MessageDecl__LeftOpAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageDecl__LeftOpAssignment_1_in_rule__MessageDecl__Group__1__Impl4710);
            rule__MessageDecl__LeftOpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getLeftOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__1__Impl"


    // $ANTLR start "rule__MessageDecl__Group__2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2362:1: rule__MessageDecl__Group__2 : rule__MessageDecl__Group__2__Impl rule__MessageDecl__Group__3 ;
    public final void rule__MessageDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2366:1: ( rule__MessageDecl__Group__2__Impl rule__MessageDecl__Group__3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2367:2: rule__MessageDecl__Group__2__Impl rule__MessageDecl__Group__3
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__2__Impl_in_rule__MessageDecl__Group__24740);
            rule__MessageDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDecl__Group__3_in_rule__MessageDecl__Group__24743);
            rule__MessageDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__2"


    // $ANTLR start "rule__MessageDecl__Group__2__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2374:1: rule__MessageDecl__Group__2__Impl : ( ( rule__MessageDecl__OperatorAssignment_2 ) ) ;
    public final void rule__MessageDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2378:1: ( ( ( rule__MessageDecl__OperatorAssignment_2 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2379:1: ( ( rule__MessageDecl__OperatorAssignment_2 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2379:1: ( ( rule__MessageDecl__OperatorAssignment_2 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2380:1: ( rule__MessageDecl__OperatorAssignment_2 )
            {
             before(grammarAccess.getMessageDeclAccess().getOperatorAssignment_2()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2381:1: ( rule__MessageDecl__OperatorAssignment_2 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2381:2: rule__MessageDecl__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageDecl__OperatorAssignment_2_in_rule__MessageDecl__Group__2__Impl4770);
            rule__MessageDecl__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__2__Impl"


    // $ANTLR start "rule__MessageDecl__Group__3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2391:1: rule__MessageDecl__Group__3 : rule__MessageDecl__Group__3__Impl rule__MessageDecl__Group__4 ;
    public final void rule__MessageDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2395:1: ( rule__MessageDecl__Group__3__Impl rule__MessageDecl__Group__4 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2396:2: rule__MessageDecl__Group__3__Impl rule__MessageDecl__Group__4
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__3__Impl_in_rule__MessageDecl__Group__34800);
            rule__MessageDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDecl__Group__4_in_rule__MessageDecl__Group__34803);
            rule__MessageDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__3"


    // $ANTLR start "rule__MessageDecl__Group__3__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2403:1: rule__MessageDecl__Group__3__Impl : ( ( rule__MessageDecl__RighOpAssignment_3 ) ) ;
    public final void rule__MessageDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2407:1: ( ( ( rule__MessageDecl__RighOpAssignment_3 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2408:1: ( ( rule__MessageDecl__RighOpAssignment_3 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2408:1: ( ( rule__MessageDecl__RighOpAssignment_3 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2409:1: ( rule__MessageDecl__RighOpAssignment_3 )
            {
             before(grammarAccess.getMessageDeclAccess().getRighOpAssignment_3()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2410:1: ( rule__MessageDecl__RighOpAssignment_3 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2410:2: rule__MessageDecl__RighOpAssignment_3
            {
            pushFollow(FOLLOW_rule__MessageDecl__RighOpAssignment_3_in_rule__MessageDecl__Group__3__Impl4830);
            rule__MessageDecl__RighOpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getRighOpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__3__Impl"


    // $ANTLR start "rule__MessageDecl__Group__4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2420:1: rule__MessageDecl__Group__4 : rule__MessageDecl__Group__4__Impl ;
    public final void rule__MessageDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2424:1: ( rule__MessageDecl__Group__4__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2425:2: rule__MessageDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group__4__Impl_in_rule__MessageDecl__Group__44860);
            rule__MessageDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__4"


    // $ANTLR start "rule__MessageDecl__Group__4__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2431:1: rule__MessageDecl__Group__4__Impl : ( ( rule__MessageDecl__Group_4__0 )? ) ;
    public final void rule__MessageDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2435:1: ( ( ( rule__MessageDecl__Group_4__0 )? ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2436:1: ( ( rule__MessageDecl__Group_4__0 )? )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2436:1: ( ( rule__MessageDecl__Group_4__0 )? )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2437:1: ( rule__MessageDecl__Group_4__0 )?
            {
             before(grammarAccess.getMessageDeclAccess().getGroup_4()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2438:1: ( rule__MessageDecl__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2438:2: rule__MessageDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MessageDecl__Group_4__0_in_rule__MessageDecl__Group__4__Impl4887);
                    rule__MessageDecl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageDeclAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group__4__Impl"


    // $ANTLR start "rule__MessageDecl__Group_4__0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2458:1: rule__MessageDecl__Group_4__0 : rule__MessageDecl__Group_4__0__Impl rule__MessageDecl__Group_4__1 ;
    public final void rule__MessageDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2462:1: ( rule__MessageDecl__Group_4__0__Impl rule__MessageDecl__Group_4__1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2463:2: rule__MessageDecl__Group_4__0__Impl rule__MessageDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group_4__0__Impl_in_rule__MessageDecl__Group_4__04928);
            rule__MessageDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDecl__Group_4__1_in_rule__MessageDecl__Group_4__04931);
            rule__MessageDecl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group_4__0"


    // $ANTLR start "rule__MessageDecl__Group_4__0__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2470:1: rule__MessageDecl__Group_4__0__Impl : ( ':' ) ;
    public final void rule__MessageDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2474:1: ( ( ':' ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2475:1: ( ':' )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2475:1: ( ':' )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2476:1: ':'
            {
             before(grammarAccess.getMessageDeclAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__MessageDecl__Group_4__0__Impl4959); 
             after(grammarAccess.getMessageDeclAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group_4__0__Impl"


    // $ANTLR start "rule__MessageDecl__Group_4__1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2489:1: rule__MessageDecl__Group_4__1 : rule__MessageDecl__Group_4__1__Impl ;
    public final void rule__MessageDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2493:1: ( rule__MessageDecl__Group_4__1__Impl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2494:2: rule__MessageDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageDecl__Group_4__1__Impl_in_rule__MessageDecl__Group_4__14990);
            rule__MessageDecl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group_4__1"


    // $ANTLR start "rule__MessageDecl__Group_4__1__Impl"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2500:1: rule__MessageDecl__Group_4__1__Impl : ( ( rule__MessageDecl__MethodAssignment_4_1 ) ) ;
    public final void rule__MessageDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2504:1: ( ( ( rule__MessageDecl__MethodAssignment_4_1 ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2505:1: ( ( rule__MessageDecl__MethodAssignment_4_1 ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2505:1: ( ( rule__MessageDecl__MethodAssignment_4_1 ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2506:1: ( rule__MessageDecl__MethodAssignment_4_1 )
            {
             before(grammarAccess.getMessageDeclAccess().getMethodAssignment_4_1()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2507:1: ( rule__MessageDecl__MethodAssignment_4_1 )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2507:2: rule__MessageDecl__MethodAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MessageDecl__MethodAssignment_4_1_in_rule__MessageDecl__Group_4__1__Impl5017);
            rule__MessageDecl__MethodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageDeclAccess().getMethodAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__Group_4__1__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2522:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2526:1: ( ( ruleStatement ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2527:1: ( ruleStatement )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2527:1: ( ruleStatement )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2528:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment5056);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__ClassDecl__NameAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2537:1: rule__ClassDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2541:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2542:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2542:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2543:1: RULE_ID
            {
             before(grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassDecl__NameAssignment_15087); 
             after(grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__NameAssignment_1"


    // $ANTLR start "rule__ClassDecl__InheritsAssignment_2_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2552:1: rule__ClassDecl__InheritsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDecl__InheritsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2556:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2557:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2557:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2558:1: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_1_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2559:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2560:1: RULE_ID
            {
             before(grammarAccess.getClassDeclAccess().getInheritsClassDeclIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassDecl__InheritsAssignment_2_15122); 
             after(grammarAccess.getClassDeclAccess().getInheritsClassDeclIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__InheritsAssignment_2_1"


    // $ANTLR start "rule__ClassDecl__InheritsAssignment_2_2_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2571:1: rule__ClassDecl__InheritsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDecl__InheritsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2575:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2576:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2576:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2577:1: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_2_1_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2578:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2579:1: RULE_ID
            {
             before(grammarAccess.getClassDeclAccess().getInheritsClassDeclIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassDecl__InheritsAssignment_2_2_15161); 
             after(grammarAccess.getClassDeclAccess().getInheritsClassDeclIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__InheritsAssignment_2_2_1"


    // $ANTLR start "rule__ClassDecl__SectionsAssignment_4"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2590:1: rule__ClassDecl__SectionsAssignment_4 : ( ruleClassSectionDecl ) ;
    public final void rule__ClassDecl__SectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2594:1: ( ( ruleClassSectionDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2595:1: ( ruleClassSectionDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2595:1: ( ruleClassSectionDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2596:1: ruleClassSectionDecl
            {
             before(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleClassSectionDecl_in_rule__ClassDecl__SectionsAssignment_45196);
            ruleClassSectionDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__SectionsAssignment_4"


    // $ANTLR start "rule__ClassDecl__SectionsAssignment_5"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2605:1: rule__ClassDecl__SectionsAssignment_5 : ( ruleClassSectionDecl ) ;
    public final void rule__ClassDecl__SectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2609:1: ( ( ruleClassSectionDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2610:1: ( ruleClassSectionDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2610:1: ( ruleClassSectionDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2611:1: ruleClassSectionDecl
            {
             before(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleClassSectionDecl_in_rule__ClassDecl__SectionsAssignment_55227);
            ruleClassSectionDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__SectionsAssignment_5"


    // $ANTLR start "rule__ClassSectionDecl__VisibilityAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2620:1: rule__ClassSectionDecl__VisibilityAssignment_0 : ( ruleVisibilityDecl ) ;
    public final void rule__ClassSectionDecl__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2624:1: ( ( ruleVisibilityDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2625:1: ( ruleVisibilityDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2625:1: ( ruleVisibilityDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2626:1: ruleVisibilityDecl
            {
             before(grammarAccess.getClassSectionDeclAccess().getVisibilityVisibilityDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibilityDecl_in_rule__ClassSectionDecl__VisibilityAssignment_05258);
            ruleVisibilityDecl();

            state._fsp--;

             after(grammarAccess.getClassSectionDeclAccess().getVisibilityVisibilityDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__VisibilityAssignment_0"


    // $ANTLR start "rule__ClassSectionDecl__MembersAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2635:1: rule__ClassSectionDecl__MembersAssignment_1 : ( ruleClassMember ) ;
    public final void rule__ClassSectionDecl__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2639:1: ( ( ruleClassMember ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2640:1: ( ruleClassMember )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2640:1: ( ruleClassMember )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2641:1: ruleClassMember
            {
             before(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassMember_in_rule__ClassSectionDecl__MembersAssignment_15289);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__MembersAssignment_1"


    // $ANTLR start "rule__ClassSectionDecl__MembersAssignment_2_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2650:1: rule__ClassSectionDecl__MembersAssignment_2_1 : ( ruleClassMember ) ;
    public final void rule__ClassSectionDecl__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2654:1: ( ( ruleClassMember ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2655:1: ( ruleClassMember )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2655:1: ( ruleClassMember )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2656:1: ruleClassMember
            {
             before(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleClassMember_in_rule__ClassSectionDecl__MembersAssignment_2_15320);
            ruleClassMember();

            state._fsp--;

             after(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSectionDecl__MembersAssignment_2_1"


    // $ANTLR start "rule__VisibilityDecl__VisibilityAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2665:1: rule__VisibilityDecl__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__VisibilityDecl__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2669:1: ( ( ruleVisibility ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2670:1: ( ruleVisibility )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2670:1: ( ruleVisibility )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2671:1: ruleVisibility
            {
             before(grammarAccess.getVisibilityDeclAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__VisibilityDecl__VisibilityAssignment_05351);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getVisibilityDeclAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityDecl__VisibilityAssignment_0"


    // $ANTLR start "rule__MethodDecl__ReturnTypeAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2680:1: rule__MethodDecl__ReturnTypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__MethodDecl__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2684:1: ( ( ruleDataType ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2685:1: ( ruleDataType )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2685:1: ( ruleDataType )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2686:1: ruleDataType
            {
             before(grammarAccess.getMethodDeclAccess().getReturnTypeDataTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__MethodDecl__ReturnTypeAssignment_05382);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getReturnTypeDataTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__ReturnTypeAssignment_0"


    // $ANTLR start "rule__MethodDecl__NameAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2695:1: rule__MethodDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2699:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2700:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2700:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2701:1: RULE_ID
            {
             before(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodDecl__NameAssignment_15413); 
             after(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__NameAssignment_1"


    // $ANTLR start "rule__AttributeDecl__TypeAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2710:1: rule__AttributeDecl__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__AttributeDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2714:1: ( ( ruleDataType ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2715:1: ( ruleDataType )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2715:1: ( ruleDataType )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2716:1: ruleDataType
            {
             before(grammarAccess.getAttributeDeclAccess().getTypeDataTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__AttributeDecl__TypeAssignment_05444);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeDeclAccess().getTypeDataTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__TypeAssignment_0"


    // $ANTLR start "rule__AttributeDecl__NameAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2725:1: rule__AttributeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2729:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2730:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2730:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2731:1: RULE_ID
            {
             before(grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeDecl__NameAssignment_15475); 
             after(grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecl__NameAssignment_1"


    // $ANTLR start "rule__AssociationDecl__TypeAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2740:1: rule__AssociationDecl__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2744:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2745:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2745:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2746:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationDeclAccess().getTypeClassDeclCrossReference_0_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2747:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2748:1: RULE_ID
            {
             before(grammarAccess.getAssociationDeclAccess().getTypeClassDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationDecl__TypeAssignment_05510); 
             after(grammarAccess.getAssociationDeclAccess().getTypeClassDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssociationDeclAccess().getTypeClassDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__TypeAssignment_0"


    // $ANTLR start "rule__AssociationDecl__NameAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2759:1: rule__AssociationDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssociationDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2763:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2764:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2764:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2765:1: RULE_ID
            {
             before(grammarAccess.getAssociationDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationDecl__NameAssignment_15545); 
             after(grammarAccess.getAssociationDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationDecl__NameAssignment_1"


    // $ANTLR start "rule__SequenceDecl__NameAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2774:1: rule__SequenceDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequenceDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2778:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2779:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2779:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2780:1: RULE_ID
            {
             before(grammarAccess.getSequenceDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequenceDecl__NameAssignment_15576); 
             after(grammarAccess.getSequenceDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__NameAssignment_1"


    // $ANTLR start "rule__SequenceDecl__SectionsAssignment_3_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2789:1: rule__SequenceDecl__SectionsAssignment_3_0 : ( ruleSequenceSectionDecl ) ;
    public final void rule__SequenceDecl__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2793:1: ( ( ruleSequenceSectionDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2794:1: ( ruleSequenceSectionDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2794:1: ( ruleSequenceSectionDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2795:1: ruleSequenceSectionDecl
            {
             before(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleSequenceSectionDecl_in_rule__SequenceDecl__SectionsAssignment_3_05607);
            ruleSequenceSectionDecl();

            state._fsp--;

             after(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__SectionsAssignment_3_0"


    // $ANTLR start "rule__SequenceDecl__SectionsAssignment_3_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2804:1: rule__SequenceDecl__SectionsAssignment_3_1 : ( ruleSequenceSectionDecl ) ;
    public final void rule__SequenceDecl__SectionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2808:1: ( ( ruleSequenceSectionDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2809:1: ( ruleSequenceSectionDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2809:1: ( ruleSequenceSectionDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2810:1: ruleSequenceSectionDecl
            {
             before(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSequenceSectionDecl_in_rule__SequenceDecl__SectionsAssignment_3_15638);
            ruleSequenceSectionDecl();

            state._fsp--;

             after(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDecl__SectionsAssignment_3_1"


    // $ANTLR start "rule__ActorSectionDecl__ActorsAssignment_2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2819:1: rule__ActorSectionDecl__ActorsAssignment_2 : ( ruleActorDecl ) ;
    public final void rule__ActorSectionDecl__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2823:1: ( ( ruleActorDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2824:1: ( ruleActorDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2824:1: ( ruleActorDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2825:1: ruleActorDecl
            {
             before(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleActorDecl_in_rule__ActorSectionDecl__ActorsAssignment_25669);
            ruleActorDecl();

            state._fsp--;

             after(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__ActorsAssignment_2"


    // $ANTLR start "rule__ActorSectionDecl__ActorsAssignment_3_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2834:1: rule__ActorSectionDecl__ActorsAssignment_3_1 : ( ruleActorDecl ) ;
    public final void rule__ActorSectionDecl__ActorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2838:1: ( ( ruleActorDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2839:1: ( ruleActorDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2839:1: ( ruleActorDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2840:1: ruleActorDecl
            {
             before(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleActorDecl_in_rule__ActorSectionDecl__ActorsAssignment_3_15700);
            ruleActorDecl();

            state._fsp--;

             after(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSectionDecl__ActorsAssignment_3_1"


    // $ANTLR start "rule__MessageSectionDecl__MessagesAssignment_2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2849:1: rule__MessageSectionDecl__MessagesAssignment_2 : ( ruleMessageDecl ) ;
    public final void rule__MessageSectionDecl__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2853:1: ( ( ruleMessageDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2854:1: ( ruleMessageDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2854:1: ( ruleMessageDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2855:1: ruleMessageDecl
            {
             before(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMessageDecl_in_rule__MessageSectionDecl__MessagesAssignment_25731);
            ruleMessageDecl();

            state._fsp--;

             after(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__MessagesAssignment_2"


    // $ANTLR start "rule__MessageSectionDecl__MessagesAssignment_3_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2864:1: rule__MessageSectionDecl__MessagesAssignment_3_1 : ( ruleMessageDecl ) ;
    public final void rule__MessageSectionDecl__MessagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2868:1: ( ( ruleMessageDecl ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2869:1: ( ruleMessageDecl )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2869:1: ( ruleMessageDecl )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2870:1: ruleMessageDecl
            {
             before(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMessageDecl_in_rule__MessageSectionDecl__MessagesAssignment_3_15762);
            ruleMessageDecl();

            state._fsp--;

             after(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSectionDecl__MessagesAssignment_3_1"


    // $ANTLR start "rule__ActorDecl__NameAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2879:1: rule__ActorDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ActorDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2883:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2884:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2884:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2885:1: RULE_ID
            {
             before(grammarAccess.getActorDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActorDecl__NameAssignment_05793); 
             after(grammarAccess.getActorDeclAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__NameAssignment_0"


    // $ANTLR start "rule__ActorDecl__ClassRefAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2894:1: rule__ActorDecl__ClassRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActorDecl__ClassRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2898:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2899:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2899:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2900:1: ( RULE_ID )
            {
             before(grammarAccess.getActorDeclAccess().getClassRefClassDeclCrossReference_1_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2901:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2902:1: RULE_ID
            {
             before(grammarAccess.getActorDeclAccess().getClassRefClassDeclIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActorDecl__ClassRefAssignment_15828); 
             after(grammarAccess.getActorDeclAccess().getClassRefClassDeclIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActorDeclAccess().getClassRefClassDeclCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorDecl__ClassRefAssignment_1"


    // $ANTLR start "rule__MessageDecl__NameAssignment_0"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2913:1: rule__MessageDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2917:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2918:1: ( RULE_ID )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2918:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2919:1: RULE_ID
            {
             before(grammarAccess.getMessageDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageDecl__NameAssignment_05863); 
             after(grammarAccess.getMessageDeclAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__NameAssignment_0"


    // $ANTLR start "rule__MessageDecl__LeftOpAssignment_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2928:1: rule__MessageDecl__LeftOpAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MessageDecl__LeftOpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2932:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2933:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2933:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2934:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageDeclAccess().getLeftOpActorDeclCrossReference_1_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2935:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2936:1: RULE_ID
            {
             before(grammarAccess.getMessageDeclAccess().getLeftOpActorDeclIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageDecl__LeftOpAssignment_15898); 
             after(grammarAccess.getMessageDeclAccess().getLeftOpActorDeclIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMessageDeclAccess().getLeftOpActorDeclCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__LeftOpAssignment_1"


    // $ANTLR start "rule__MessageDecl__OperatorAssignment_2"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2947:1: rule__MessageDecl__OperatorAssignment_2 : ( ruleMessageOperator ) ;
    public final void rule__MessageDecl__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2951:1: ( ( ruleMessageOperator ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2952:1: ( ruleMessageOperator )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2952:1: ( ruleMessageOperator )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2953:1: ruleMessageOperator
            {
             before(grammarAccess.getMessageDeclAccess().getOperatorMessageOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMessageOperator_in_rule__MessageDecl__OperatorAssignment_25933);
            ruleMessageOperator();

            state._fsp--;

             after(grammarAccess.getMessageDeclAccess().getOperatorMessageOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__OperatorAssignment_2"


    // $ANTLR start "rule__MessageDecl__RighOpAssignment_3"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2962:1: rule__MessageDecl__RighOpAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MessageDecl__RighOpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2966:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2967:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2967:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2968:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageDeclAccess().getRighOpActorDeclCrossReference_3_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2969:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2970:1: RULE_ID
            {
             before(grammarAccess.getMessageDeclAccess().getRighOpActorDeclIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageDecl__RighOpAssignment_35968); 
             after(grammarAccess.getMessageDeclAccess().getRighOpActorDeclIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMessageDeclAccess().getRighOpActorDeclCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__RighOpAssignment_3"


    // $ANTLR start "rule__MessageDecl__MethodAssignment_4_1"
    // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2981:1: rule__MessageDecl__MethodAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MessageDecl__MethodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2985:1: ( ( ( RULE_ID ) ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2986:1: ( ( RULE_ID ) )
            {
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2986:1: ( ( RULE_ID ) )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2987:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageDeclAccess().getMethodMethodDeclCrossReference_4_1_0()); 
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2988:1: ( RULE_ID )
            // ../com.frantz.txtuml.ui/src-gen/com/frantz/txtuml/ui/contentassist/antlr/internal/InternalTxtUML.g:2989:1: RULE_ID
            {
             before(grammarAccess.getMessageDeclAccess().getMethodMethodDeclIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageDecl__MethodAssignment_4_16007); 
             after(grammarAccess.getMessageDeclAccess().getMethodMethodDeclIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMessageDeclAccess().getMethodMethodDeclCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecl__MethodAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000010080002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDecl_in_entryRuleClassDecl182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDecl189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__0_in_ruleClassDecl215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMember_in_entryRuleClassMember242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMember249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMember__Alternatives_in_ruleClassMember275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_entryRuleClassSectionDecl302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSectionDecl309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__0_in_ruleClassSectionDecl335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityDecl_in_entryRuleVisibilityDecl362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityDecl369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityDecl__Group__0_in_ruleVisibilityDecl395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDecl_in_entryRuleMethodDecl422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDecl429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__0_in_ruleMethodDecl455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDecl489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDecl__Group__0_in_ruleAttributeDecl515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationDecl_in_entryRuleAssociationDecl542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationDecl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationDecl__Group__0_in_ruleAssociationDecl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceDecl_in_entryRuleSequenceDecl602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceDecl609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__0_in_ruleSequenceDecl635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_entryRuleSequenceSectionDecl662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceSectionDecl669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceSectionDecl__Alternatives_in_ruleSequenceSectionDecl695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorSectionDecl_in_entryRuleActorSectionDecl722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorSectionDecl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__0_in_ruleActorSectionDecl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSectionDecl_in_entryRuleMessageSectionDecl782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSectionDecl789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__0_in_ruleMessageSectionDecl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDecl_in_entryRuleActorDecl842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorDecl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorDecl__Group__0_in_ruleActorDecl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_entryRuleMessageDecl902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageDecl909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__0_in_ruleMessageDecl935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageOperator__Alternatives_in_ruleMessageOperator972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDecl_in_rule__Statement__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceDecl_in_rule__Statement__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDecl_in_rule__ClassMember__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDecl_in_rule__ClassMember__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationDecl_in_rule__ClassMember__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorSectionDecl_in_rule__SequenceSectionDecl__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSectionDecl_in_rule__SequenceSectionDecl__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MessageOperator__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MessageOperator__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataType__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__0__Impl_in_rule__ClassDecl__Group__01454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__1_in_rule__ClassDecl__Group__01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ClassDecl__Group__0__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__1__Impl_in_rule__ClassDecl__Group__11516 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__2_in_rule__ClassDecl__Group__11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__NameAssignment_1_in_rule__ClassDecl__Group__1__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__2__Impl_in_rule__ClassDecl__Group__21576 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__3_in_rule__ClassDecl__Group__21579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__0_in_rule__ClassDecl__Group__2__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__3__Impl_in_rule__ClassDecl__Group__31637 = new BitSet(new long[]{0x000000000007E010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__4_in_rule__ClassDecl__Group__31640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ClassDecl__Group__3__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__4__Impl_in_rule__ClassDecl__Group__41699 = new BitSet(new long[]{0x000000000027E010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__5_in_rule__ClassDecl__Group__41702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__SectionsAssignment_4_in_rule__ClassDecl__Group__4__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__5__Impl_in_rule__ClassDecl__Group__51759 = new BitSet(new long[]{0x000000000027E010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__6_in_rule__ClassDecl__Group__51762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__SectionsAssignment_5_in_rule__ClassDecl__Group__5__Impl1789 = new BitSet(new long[]{0x000000000007E012L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group__6__Impl_in_rule__ClassDecl__Group__61820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClassDecl__Group__6__Impl1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__0__Impl_in_rule__ClassDecl__Group_2__01893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__1_in_rule__ClassDecl__Group_2__01896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassDecl__Group_2__0__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__1__Impl_in_rule__ClassDecl__Group_2__11955 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__2_in_rule__ClassDecl__Group_2__11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__InheritsAssignment_2_1_in_rule__ClassDecl__Group_2__1__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2__2__Impl_in_rule__ClassDecl__Group_2__22015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2_2__0_in_rule__ClassDecl__Group_2__2__Impl2042 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2_2__0__Impl_in_rule__ClassDecl__Group_2_2__02079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2_2__1_in_rule__ClassDecl__Group_2_2__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassDecl__Group_2_2__0__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__Group_2_2__1__Impl_in_rule__ClassDecl__Group_2_2__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDecl__InheritsAssignment_2_2_1_in_rule__ClassDecl__Group_2_2__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__0__Impl_in_rule__ClassSectionDecl__Group__02202 = new BitSet(new long[]{0x000000000007E010L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__1_in_rule__ClassSectionDecl__Group__02205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__VisibilityAssignment_0_in_rule__ClassSectionDecl__Group__0__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__1__Impl_in_rule__ClassSectionDecl__Group__12263 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__2_in_rule__ClassSectionDecl__Group__12266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__MembersAssignment_1_in_rule__ClassSectionDecl__Group__1__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__2__Impl_in_rule__ClassSectionDecl__Group__22323 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__3_in_rule__ClassSectionDecl__Group__22326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group_2__0_in_rule__ClassSectionDecl__Group__2__Impl2353 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group__3__Impl_in_rule__ClassSectionDecl__Group__32384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassSectionDecl__Group__3__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group_2__0__Impl_in_rule__ClassSectionDecl__Group_2__02451 = new BitSet(new long[]{0x000000000007E010L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group_2__1_in_rule__ClassSectionDecl__Group_2__02454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassSectionDecl__Group_2__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__Group_2__1__Impl_in_rule__ClassSectionDecl__Group_2__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassSectionDecl__MembersAssignment_2_1_in_rule__ClassSectionDecl__Group_2__1__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityDecl__Group__0__Impl_in_rule__VisibilityDecl__Group__02574 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__VisibilityDecl__Group__1_in_rule__VisibilityDecl__Group__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityDecl__VisibilityAssignment_0_in_rule__VisibilityDecl__Group__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibilityDecl__Group__1__Impl_in_rule__VisibilityDecl__Group__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VisibilityDecl__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__0__Impl_in_rule__MethodDecl__Group__02697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__1_in_rule__MethodDecl__Group__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__ReturnTypeAssignment_0_in_rule__MethodDecl__Group__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__1__Impl_in_rule__MethodDecl__Group__12757 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__2_in_rule__MethodDecl__Group__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__NameAssignment_1_in_rule__MethodDecl__Group__1__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__2__Impl_in_rule__MethodDecl__Group__22817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__3_in_rule__MethodDecl__Group__22820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MethodDecl__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDecl__Group__3__Impl_in_rule__MethodDecl__Group__32879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MethodDecl__Group__3__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDecl__Group__0__Impl_in_rule__AttributeDecl__Group__02946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeDecl__Group__1_in_rule__AttributeDecl__Group__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDecl__TypeAssignment_0_in_rule__AttributeDecl__Group__0__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDecl__Group__1__Impl_in_rule__AttributeDecl__Group__13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDecl__NameAssignment_1_in_rule__AttributeDecl__Group__1__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationDecl__Group__0__Impl_in_rule__AssociationDecl__Group__03067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssociationDecl__Group__1_in_rule__AssociationDecl__Group__03070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationDecl__TypeAssignment_0_in_rule__AssociationDecl__Group__0__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationDecl__Group__1__Impl_in_rule__AssociationDecl__Group__13127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationDecl__NameAssignment_1_in_rule__AssociationDecl__Group__1__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__0__Impl_in_rule__SequenceDecl__Group__03188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__1_in_rule__SequenceDecl__Group__03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SequenceDecl__Group__0__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__1__Impl_in_rule__SequenceDecl__Group__13250 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__2_in_rule__SequenceDecl__Group__13253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__NameAssignment_1_in_rule__SequenceDecl__Group__1__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__2__Impl_in_rule__SequenceDecl__Group__23310 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__3_in_rule__SequenceDecl__Group__23313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SequenceDecl__Group__2__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__3__Impl_in_rule__SequenceDecl__Group__33372 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__4_in_rule__SequenceDecl__Group__33375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group_3__0_in_rule__SequenceDecl__Group__3__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group__4__Impl_in_rule__SequenceDecl__Group__43433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SequenceDecl__Group__4__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group_3__0__Impl_in_rule__SequenceDecl__Group_3__03502 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group_3__1_in_rule__SequenceDecl__Group_3__03505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__SectionsAssignment_3_0_in_rule__SequenceDecl__Group_3__0__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__Group_3__1__Impl_in_rule__SequenceDecl__Group_3__13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceDecl__SectionsAssignment_3_1_in_rule__SequenceDecl__Group_3__1__Impl3589 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__0__Impl_in_rule__ActorSectionDecl__Group__03624 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__1_in_rule__ActorSectionDecl__Group__03627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ActorSectionDecl__Group__0__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__1__Impl_in_rule__ActorSectionDecl__Group__13686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__2_in_rule__ActorSectionDecl__Group__13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActorSectionDecl__Group__1__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__2__Impl_in_rule__ActorSectionDecl__Group__23748 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__3_in_rule__ActorSectionDecl__Group__23751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__ActorsAssignment_2_in_rule__ActorSectionDecl__Group__2__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__3__Impl_in_rule__ActorSectionDecl__Group__33808 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__4_in_rule__ActorSectionDecl__Group__33811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group_3__0_in_rule__ActorSectionDecl__Group__3__Impl3838 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group__4__Impl_in_rule__ActorSectionDecl__Group__43869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActorSectionDecl__Group__4__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group_3__0__Impl_in_rule__ActorSectionDecl__Group_3__03938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group_3__1_in_rule__ActorSectionDecl__Group_3__03941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ActorSectionDecl__Group_3__0__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__Group_3__1__Impl_in_rule__ActorSectionDecl__Group_3__14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorSectionDecl__ActorsAssignment_3_1_in_rule__ActorSectionDecl__Group_3__1__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__0__Impl_in_rule__MessageSectionDecl__Group__04061 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__1_in_rule__MessageSectionDecl__Group__04064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageSectionDecl__Group__0__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__1__Impl_in_rule__MessageSectionDecl__Group__14123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__2_in_rule__MessageSectionDecl__Group__14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MessageSectionDecl__Group__1__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__2__Impl_in_rule__MessageSectionDecl__Group__24185 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__3_in_rule__MessageSectionDecl__Group__24188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__MessagesAssignment_2_in_rule__MessageSectionDecl__Group__2__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__3__Impl_in_rule__MessageSectionDecl__Group__34245 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__4_in_rule__MessageSectionDecl__Group__34248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group_3__0_in_rule__MessageSectionDecl__Group__3__Impl4275 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group__4__Impl_in_rule__MessageSectionDecl__Group__44306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MessageSectionDecl__Group__4__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group_3__0__Impl_in_rule__MessageSectionDecl__Group_3__04375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group_3__1_in_rule__MessageSectionDecl__Group_3__04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MessageSectionDecl__Group_3__0__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__Group_3__1__Impl_in_rule__MessageSectionDecl__Group_3__14437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSectionDecl__MessagesAssignment_3_1_in_rule__MessageSectionDecl__Group_3__1__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorDecl__Group__0__Impl_in_rule__ActorDecl__Group__04498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActorDecl__Group__1_in_rule__ActorDecl__Group__04501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorDecl__NameAssignment_0_in_rule__ActorDecl__Group__0__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorDecl__Group__1__Impl_in_rule__ActorDecl__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActorDecl__ClassRefAssignment_1_in_rule__ActorDecl__Group__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__0__Impl_in_rule__MessageDecl__Group__04620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__1_in_rule__MessageDecl__Group__04623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__NameAssignment_0_in_rule__MessageDecl__Group__0__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__1__Impl_in_rule__MessageDecl__Group__14680 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__2_in_rule__MessageDecl__Group__14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__LeftOpAssignment_1_in_rule__MessageDecl__Group__1__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__2__Impl_in_rule__MessageDecl__Group__24740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__3_in_rule__MessageDecl__Group__24743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__OperatorAssignment_2_in_rule__MessageDecl__Group__2__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__3__Impl_in_rule__MessageDecl__Group__34800 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__4_in_rule__MessageDecl__Group__34803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__RighOpAssignment_3_in_rule__MessageDecl__Group__3__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group__4__Impl_in_rule__MessageDecl__Group__44860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group_4__0_in_rule__MessageDecl__Group__4__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group_4__0__Impl_in_rule__MessageDecl__Group_4__04928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group_4__1_in_rule__MessageDecl__Group_4__04931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MessageDecl__Group_4__0__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__Group_4__1__Impl_in_rule__MessageDecl__Group_4__14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDecl__MethodAssignment_4_1_in_rule__MessageDecl__Group_4__1__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassDecl__NameAssignment_15087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassDecl__InheritsAssignment_2_15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassDecl__InheritsAssignment_2_2_15161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_rule__ClassDecl__SectionsAssignment_45196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_rule__ClassDecl__SectionsAssignment_55227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityDecl_in_rule__ClassSectionDecl__VisibilityAssignment_05258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMember_in_rule__ClassSectionDecl__MembersAssignment_15289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMember_in_rule__ClassSectionDecl__MembersAssignment_2_15320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__VisibilityDecl__VisibilityAssignment_05351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__MethodDecl__ReturnTypeAssignment_05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodDecl__NameAssignment_15413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__AttributeDecl__TypeAssignment_05444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeDecl__NameAssignment_15475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationDecl__TypeAssignment_05510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationDecl__NameAssignment_15545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequenceDecl__NameAssignment_15576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_rule__SequenceDecl__SectionsAssignment_3_05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_rule__SequenceDecl__SectionsAssignment_3_15638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDecl_in_rule__ActorSectionDecl__ActorsAssignment_25669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDecl_in_rule__ActorSectionDecl__ActorsAssignment_3_15700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_rule__MessageSectionDecl__MessagesAssignment_25731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_rule__MessageSectionDecl__MessagesAssignment_3_15762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActorDecl__NameAssignment_05793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActorDecl__ClassRefAssignment_15828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageDecl__NameAssignment_05863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageDecl__LeftOpAssignment_15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageOperator_in_rule__MessageDecl__OperatorAssignment_25933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageDecl__RighOpAssignment_35968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageDecl__MethodAssignment_4_16007 = new BitSet(new long[]{0x0000000000000002L});

}