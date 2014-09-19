package com.frantz.txtuml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.frantz.txtuml.services.TxtUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTxtUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'inherits'", "','", "'{'", "'}'", "';'", "':'", "'('", "')'", "'sequence'", "'actors'", "'messages'", "'-->'", "'<--'", "'boolean'", "'string'", "'integer'", "'double'", "'public'", "'private'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTxtUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTxtUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTxtUMLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g"; }



     	private TxtUMLGrammarAccess grammarAccess;
     	
        public InternalTxtUMLParser(TokenStream input, TxtUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected TxtUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:77:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:80:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:81:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:81:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:82:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:82:1: (lv_statements_0_0= ruleStatement )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:83:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:107:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:108:2: (iv_ruleStatement= ruleStatement EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:109:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:116:1: ruleStatement returns [EObject current=null] : (this_ClassDecl_0= ruleClassDecl | this_SequenceDecl_1= ruleSequenceDecl ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;

        EObject this_SequenceDecl_1 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:119:28: ( (this_ClassDecl_0= ruleClassDecl | this_SequenceDecl_1= ruleSequenceDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:120:1: (this_ClassDecl_0= ruleClassDecl | this_SequenceDecl_1= ruleSequenceDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:120:1: (this_ClassDecl_0= ruleClassDecl | this_SequenceDecl_1= ruleSequenceDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:121:5: this_ClassDecl_0= ruleClassDecl
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getClassDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassDecl_in_ruleStatement223);
                    this_ClassDecl_0=ruleClassDecl();

                    state._fsp--;

                     
                            current = this_ClassDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:131:5: this_SequenceDecl_1= ruleSequenceDecl
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSequenceDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSequenceDecl_in_ruleStatement250);
                    this_SequenceDecl_1=ruleSequenceDecl();

                    state._fsp--;

                     
                            current = this_SequenceDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClassDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:147:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:148:2: (iv_ruleClassDecl= ruleClassDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:149:2: iv_ruleClassDecl= ruleClassDecl EOF
            {
             newCompositeNode(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_ruleClassDecl_in_entryRuleClassDecl285);
            iv_ruleClassDecl=ruleClassDecl();

            state._fsp--;

             current =iv_ruleClassDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDecl295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:156:1: ruleClassDecl returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_sections_7_0= ruleClassSectionDecl ) ) ( (lv_sections_8_0= ruleClassSectionDecl ) )* otherlv_9= '}' ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_sections_7_0 = null;

        EObject lv_sections_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:159:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_sections_7_0= ruleClassSectionDecl ) ) ( (lv_sections_8_0= ruleClassSectionDecl ) )* otherlv_9= '}' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:160:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_sections_7_0= ruleClassSectionDecl ) ) ( (lv_sections_8_0= ruleClassSectionDecl ) )* otherlv_9= '}' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:160:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_sections_7_0= ruleClassSectionDecl ) ) ( (lv_sections_8_0= ruleClassSectionDecl ) )* otherlv_9= '}' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:160:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_sections_7_0= ruleClassSectionDecl ) ) ( (lv_sections_8_0= ruleClassSectionDecl ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClassDecl332); 

                	newLeafNode(otherlv_0, grammarAccess.getClassDeclAccess().getClassKeyword_0());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:165:1: (lv_name_1_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDecl349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:182:2: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:182:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClassDecl367); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassDeclAccess().getInheritsKeyword_2_0());
                        
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:186:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:187:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:187:1: (otherlv_3= RULE_ID )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:188:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassDeclRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDecl387); 

                    		newLeafNode(otherlv_3, grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:199:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:199:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClassDecl400); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getClassDeclAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:203:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:204:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:204:1: (otherlv_5= RULE_ID )
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:205:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClassDeclRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDecl420); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClassDecl436); 

                	newLeafNode(otherlv_6, grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:220:1: ( (lv_sections_7_0= ruleClassSectionDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:221:1: (lv_sections_7_0= ruleClassSectionDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:221:1: (lv_sections_7_0= ruleClassSectionDecl )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:222:3: lv_sections_7_0= ruleClassSectionDecl
            {
             
            	        newCompositeNode(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleClassSectionDecl_in_ruleClassDecl457);
            lv_sections_7_0=ruleClassSectionDecl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDeclRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_7_0, 
                    		"ClassSectionDecl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:238:2: ( (lv_sections_8_0= ruleClassSectionDecl ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=25 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:239:1: (lv_sections_8_0= ruleClassSectionDecl )
            	    {
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:239:1: (lv_sections_8_0= ruleClassSectionDecl )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:240:3: lv_sections_8_0= ruleClassSectionDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassSectionDecl_in_ruleClassDecl478);
            	    lv_sections_8_0=ruleClassSectionDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_8_0, 
            	            		"ClassSectionDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleClassDecl491); 

                	newLeafNode(otherlv_9, grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleClassMember"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:268:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:269:2: (iv_ruleClassMember= ruleClassMember EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:270:2: iv_ruleClassMember= ruleClassMember EOF
            {
             newCompositeNode(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_ruleClassMember_in_entryRuleClassMember527);
            iv_ruleClassMember=ruleClassMember();

            state._fsp--;

             current =iv_ruleClassMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMember537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:277:1: ruleClassMember returns [EObject current=null] : (this_MethodDecl_0= ruleMethodDecl | this_AttributeDecl_1= ruleAttributeDecl | this_AssociationDecl_2= ruleAssociationDecl ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_MethodDecl_0 = null;

        EObject this_AttributeDecl_1 = null;

        EObject this_AssociationDecl_2 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:280:28: ( (this_MethodDecl_0= ruleMethodDecl | this_AttributeDecl_1= ruleAttributeDecl | this_AssociationDecl_2= ruleAssociationDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:281:1: (this_MethodDecl_0= ruleMethodDecl | this_AttributeDecl_1= ruleAttributeDecl | this_AssociationDecl_2= ruleAssociationDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:281:1: (this_MethodDecl_0= ruleMethodDecl | this_AttributeDecl_1= ruleAttributeDecl | this_AssociationDecl_2= ruleAssociationDecl )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||LA6_6==13||LA6_6==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||LA6_6==13||LA6_6==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==RULE_ID) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||LA6_6==13||LA6_6==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==RULE_ID) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||LA6_6==13||LA6_6==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:282:5: this_MethodDecl_0= ruleMethodDecl
                    {
                     
                            newCompositeNode(grammarAccess.getClassMemberAccess().getMethodDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMethodDecl_in_ruleClassMember584);
                    this_MethodDecl_0=ruleMethodDecl();

                    state._fsp--;

                     
                            current = this_MethodDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:292:5: this_AttributeDecl_1= ruleAttributeDecl
                    {
                     
                            newCompositeNode(grammarAccess.getClassMemberAccess().getAttributeDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeDecl_in_ruleClassMember611);
                    this_AttributeDecl_1=ruleAttributeDecl();

                    state._fsp--;

                     
                            current = this_AttributeDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:302:5: this_AssociationDecl_2= ruleAssociationDecl
                    {
                     
                            newCompositeNode(grammarAccess.getClassMemberAccess().getAssociationDeclParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssociationDecl_in_ruleClassMember638);
                    this_AssociationDecl_2=ruleAssociationDecl();

                    state._fsp--;

                     
                            current = this_AssociationDecl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleClassSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:318:1: entryRuleClassSectionDecl returns [EObject current=null] : iv_ruleClassSectionDecl= ruleClassSectionDecl EOF ;
    public final EObject entryRuleClassSectionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSectionDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:319:2: (iv_ruleClassSectionDecl= ruleClassSectionDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:320:2: iv_ruleClassSectionDecl= ruleClassSectionDecl EOF
            {
             newCompositeNode(grammarAccess.getClassSectionDeclRule()); 
            pushFollow(FOLLOW_ruleClassSectionDecl_in_entryRuleClassSectionDecl673);
            iv_ruleClassSectionDecl=ruleClassSectionDecl();

            state._fsp--;

             current =iv_ruleClassSectionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSectionDecl683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSectionDecl"


    // $ANTLR start "ruleClassSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:327:1: ruleClassSectionDecl returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityDecl ) )? ( (lv_members_1_0= ruleClassMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleClassSectionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_visibility_0_0 = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:330:28: ( ( ( (lv_visibility_0_0= ruleVisibilityDecl ) )? ( (lv_members_1_0= ruleClassMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )* otherlv_4= ';' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:331:1: ( ( (lv_visibility_0_0= ruleVisibilityDecl ) )? ( (lv_members_1_0= ruleClassMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )* otherlv_4= ';' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:331:1: ( ( (lv_visibility_0_0= ruleVisibilityDecl ) )? ( (lv_members_1_0= ruleClassMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )* otherlv_4= ';' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:331:2: ( (lv_visibility_0_0= ruleVisibilityDecl ) )? ( (lv_members_1_0= ruleClassMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )* otherlv_4= ';'
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:331:2: ( (lv_visibility_0_0= ruleVisibilityDecl ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=29 && LA7_0<=30)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:332:1: (lv_visibility_0_0= ruleVisibilityDecl )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:332:1: (lv_visibility_0_0= ruleVisibilityDecl )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:333:3: lv_visibility_0_0= ruleVisibilityDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getVisibilityVisibilityDeclParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibilityDecl_in_ruleClassSectionDecl729);
                    lv_visibility_0_0=ruleVisibilityDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"VisibilityDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:349:3: ( (lv_members_1_0= ruleClassMember ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:350:1: (lv_members_1_0= ruleClassMember )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:350:1: (lv_members_1_0= ruleClassMember )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:351:3: lv_members_1_0= ruleClassMember
            {
             
            	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassMember_in_ruleClassSectionDecl751);
            lv_members_1_0=ruleClassMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"ClassMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:367:2: (otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:367:4: otherlv_2= ',' ( (lv_members_3_0= ruleClassMember ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleClassSectionDecl764); 

            	        	newLeafNode(otherlv_2, grammarAccess.getClassSectionDeclAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:371:1: ( (lv_members_3_0= ruleClassMember ) )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:372:1: (lv_members_3_0= ruleClassMember )
            	    {
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:372:1: (lv_members_3_0= ruleClassMember )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:373:3: lv_members_3_0= ruleClassMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassMember_in_ruleClassSectionDecl785);
            	    lv_members_3_0=ruleClassMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"ClassMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleClassSectionDecl799); 

                	newLeafNode(otherlv_4, grammarAccess.getClassSectionDeclAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSectionDecl"


    // $ANTLR start "entryRuleVisibilityDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:401:1: entryRuleVisibilityDecl returns [EObject current=null] : iv_ruleVisibilityDecl= ruleVisibilityDecl EOF ;
    public final EObject entryRuleVisibilityDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:402:2: (iv_ruleVisibilityDecl= ruleVisibilityDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:403:2: iv_ruleVisibilityDecl= ruleVisibilityDecl EOF
            {
             newCompositeNode(grammarAccess.getVisibilityDeclRule()); 
            pushFollow(FOLLOW_ruleVisibilityDecl_in_entryRuleVisibilityDecl835);
            iv_ruleVisibilityDecl=ruleVisibilityDecl();

            state._fsp--;

             current =iv_ruleVisibilityDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibilityDecl845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityDecl"


    // $ANTLR start "ruleVisibilityDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:410:1: ruleVisibilityDecl returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= ':' ) ;
    public final EObject ruleVisibilityDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_visibility_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:413:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= ':' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:414:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= ':' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:414:1: ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= ':' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:414:2: ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= ':'
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:414:2: ( (lv_visibility_0_0= ruleVisibility ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:415:1: (lv_visibility_0_0= ruleVisibility )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:415:1: (lv_visibility_0_0= ruleVisibility )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:416:3: lv_visibility_0_0= ruleVisibility
            {
             
            	        newCompositeNode(grammarAccess.getVisibilityDeclAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVisibility_in_ruleVisibilityDecl891);
            lv_visibility_0_0=ruleVisibility();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisibilityDeclRule());
            	        }
                   		set(
                   			current, 
                   			"visibility",
                    		lv_visibility_0_0, 
                    		"Visibility");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVisibilityDecl903); 

                	newLeafNode(otherlv_1, grammarAccess.getVisibilityDeclAccess().getColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityDecl"


    // $ANTLR start "entryRuleMethodDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:444:1: entryRuleMethodDecl returns [EObject current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final EObject entryRuleMethodDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:445:2: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:446:2: iv_ruleMethodDecl= ruleMethodDecl EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclRule()); 
            pushFollow(FOLLOW_ruleMethodDecl_in_entryRuleMethodDecl939);
            iv_ruleMethodDecl=ruleMethodDecl();

            state._fsp--;

             current =iv_ruleMethodDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDecl949); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:453:1: ruleMethodDecl returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleMethodDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_returnType_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:456:28: ( ( ( (lv_returnType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:457:1: ( ( (lv_returnType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:457:1: ( ( (lv_returnType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:457:2: ( (lv_returnType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')'
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:457:2: ( (lv_returnType_0_0= ruleDataType ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:458:1: (lv_returnType_0_0= ruleDataType )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:458:1: (lv_returnType_0_0= ruleDataType )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:459:3: lv_returnType_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getMethodDeclAccess().getReturnTypeDataTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleMethodDecl995);
            lv_returnType_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:475:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:476:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:476:1: (lv_name_1_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:477:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodDecl1012); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMethodDecl1029); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMethodDecl1041); 

                	newLeafNode(otherlv_3, grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleAttributeDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:509:1: entryRuleAttributeDecl returns [EObject current=null] : iv_ruleAttributeDecl= ruleAttributeDecl EOF ;
    public final EObject entryRuleAttributeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:510:2: (iv_ruleAttributeDecl= ruleAttributeDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:511:2: iv_ruleAttributeDecl= ruleAttributeDecl EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclRule()); 
            pushFollow(FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl1077);
            iv_ruleAttributeDecl=ruleAttributeDecl();

            state._fsp--;

             current =iv_ruleAttributeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDecl1087); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDecl"


    // $ANTLR start "ruleAttributeDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:518:1: ruleAttributeDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributeDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:521:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:522:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:522:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:522:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:522:2: ( (lv_type_0_0= ruleDataType ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:523:1: (lv_type_0_0= ruleDataType )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:523:1: (lv_type_0_0= ruleDataType )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:524:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeDeclAccess().getTypeDataTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttributeDecl1133);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:540:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:541:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:541:1: (lv_name_1_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:542:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDecl1150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDecl"


    // $ANTLR start "entryRuleAssociationDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:566:1: entryRuleAssociationDecl returns [EObject current=null] : iv_ruleAssociationDecl= ruleAssociationDecl EOF ;
    public final EObject entryRuleAssociationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:567:2: (iv_ruleAssociationDecl= ruleAssociationDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:568:2: iv_ruleAssociationDecl= ruleAssociationDecl EOF
            {
             newCompositeNode(grammarAccess.getAssociationDeclRule()); 
            pushFollow(FOLLOW_ruleAssociationDecl_in_entryRuleAssociationDecl1191);
            iv_ruleAssociationDecl=ruleAssociationDecl();

            state._fsp--;

             current =iv_ruleAssociationDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationDecl1201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDecl"


    // $ANTLR start "ruleAssociationDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:575:1: ruleAssociationDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAssociationDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:578:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:579:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:579:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:579:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:579:2: ( (otherlv_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:580:1: (otherlv_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:580:1: (otherlv_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:581:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationDeclRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationDecl1246); 

            		newLeafNode(otherlv_0, grammarAccess.getAssociationDeclAccess().getTypeClassDeclCrossReference_0_0()); 
            	

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:592:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:593:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:593:1: (lv_name_1_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:594:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationDecl1263); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAssociationDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDecl"


    // $ANTLR start "entryRuleSequenceDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:618:1: entryRuleSequenceDecl returns [EObject current=null] : iv_ruleSequenceDecl= ruleSequenceDecl EOF ;
    public final EObject entryRuleSequenceDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:619:2: (iv_ruleSequenceDecl= ruleSequenceDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:620:2: iv_ruleSequenceDecl= ruleSequenceDecl EOF
            {
             newCompositeNode(grammarAccess.getSequenceDeclRule()); 
            pushFollow(FOLLOW_ruleSequenceDecl_in_entryRuleSequenceDecl1304);
            iv_ruleSequenceDecl=ruleSequenceDecl();

            state._fsp--;

             current =iv_ruleSequenceDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceDecl1314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceDecl"


    // $ANTLR start "ruleSequenceDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:627:1: ruleSequenceDecl returns [EObject current=null] : (otherlv_0= 'sequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_sections_3_0 = null;

        EObject lv_sections_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:630:28: ( (otherlv_0= 'sequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )? otherlv_5= '}' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:631:1: (otherlv_0= 'sequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )? otherlv_5= '}' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:631:1: (otherlv_0= 'sequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )? otherlv_5= '}' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:631:3: otherlv_0= 'sequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSequenceDecl1351); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceDeclAccess().getSequenceKeyword_0());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:635:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:636:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:636:1: (lv_name_1_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:637:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequenceDecl1368); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSequenceDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSequenceDecl1385); 

                	newLeafNode(otherlv_2, grammarAccess.getSequenceDeclAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:657:1: ( ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:657:2: ( (lv_sections_3_0= ruleSequenceSectionDecl ) ) ( (lv_sections_4_0= ruleSequenceSectionDecl ) )*
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:657:2: ( (lv_sections_3_0= ruleSequenceSectionDecl ) )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:658:1: (lv_sections_3_0= ruleSequenceSectionDecl )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:658:1: (lv_sections_3_0= ruleSequenceSectionDecl )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:659:3: lv_sections_3_0= ruleSequenceSectionDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceSectionDecl_in_ruleSequenceDecl1407);
                    lv_sections_3_0=ruleSequenceSectionDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceDeclRule());
                    	        }
                           		add(
                           			current, 
                           			"sections",
                            		lv_sections_3_0, 
                            		"SequenceSectionDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:675:2: ( (lv_sections_4_0= ruleSequenceSectionDecl ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:676:1: (lv_sections_4_0= ruleSequenceSectionDecl )
                    	    {
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:676:1: (lv_sections_4_0= ruleSequenceSectionDecl )
                    	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:677:3: lv_sections_4_0= ruleSequenceSectionDecl
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSequenceSectionDecl_in_ruleSequenceDecl1428);
                    	    lv_sections_4_0=ruleSequenceSectionDecl();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceDeclRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sections",
                    	            		lv_sections_4_0, 
                    	            		"SequenceSectionDecl");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSequenceDecl1443); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceDeclAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceDecl"


    // $ANTLR start "entryRuleSequenceSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:705:1: entryRuleSequenceSectionDecl returns [EObject current=null] : iv_ruleSequenceSectionDecl= ruleSequenceSectionDecl EOF ;
    public final EObject entryRuleSequenceSectionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceSectionDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:706:2: (iv_ruleSequenceSectionDecl= ruleSequenceSectionDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:707:2: iv_ruleSequenceSectionDecl= ruleSequenceSectionDecl EOF
            {
             newCompositeNode(grammarAccess.getSequenceSectionDeclRule()); 
            pushFollow(FOLLOW_ruleSequenceSectionDecl_in_entryRuleSequenceSectionDecl1479);
            iv_ruleSequenceSectionDecl=ruleSequenceSectionDecl();

            state._fsp--;

             current =iv_ruleSequenceSectionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceSectionDecl1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceSectionDecl"


    // $ANTLR start "ruleSequenceSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:714:1: ruleSequenceSectionDecl returns [EObject current=null] : (this_ActorSectionDecl_0= ruleActorSectionDecl | this_MessageSectionDecl_1= ruleMessageSectionDecl ) ;
    public final EObject ruleSequenceSectionDecl() throws RecognitionException {
        EObject current = null;

        EObject this_ActorSectionDecl_0 = null;

        EObject this_MessageSectionDecl_1 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:717:28: ( (this_ActorSectionDecl_0= ruleActorSectionDecl | this_MessageSectionDecl_1= ruleMessageSectionDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:718:1: (this_ActorSectionDecl_0= ruleActorSectionDecl | this_MessageSectionDecl_1= ruleMessageSectionDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:718:1: (this_ActorSectionDecl_0= ruleActorSectionDecl | this_MessageSectionDecl_1= ruleMessageSectionDecl )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:719:5: this_ActorSectionDecl_0= ruleActorSectionDecl
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceSectionDeclAccess().getActorSectionDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActorSectionDecl_in_ruleSequenceSectionDecl1536);
                    this_ActorSectionDecl_0=ruleActorSectionDecl();

                    state._fsp--;

                     
                            current = this_ActorSectionDecl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:729:5: this_MessageSectionDecl_1= ruleMessageSectionDecl
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceSectionDeclAccess().getMessageSectionDeclParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMessageSectionDecl_in_ruleSequenceSectionDecl1563);
                    this_MessageSectionDecl_1=ruleMessageSectionDecl();

                    state._fsp--;

                     
                            current = this_MessageSectionDecl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceSectionDecl"


    // $ANTLR start "entryRuleActorSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:745:1: entryRuleActorSectionDecl returns [EObject current=null] : iv_ruleActorSectionDecl= ruleActorSectionDecl EOF ;
    public final EObject entryRuleActorSectionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorSectionDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:746:2: (iv_ruleActorSectionDecl= ruleActorSectionDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:747:2: iv_ruleActorSectionDecl= ruleActorSectionDecl EOF
            {
             newCompositeNode(grammarAccess.getActorSectionDeclRule()); 
            pushFollow(FOLLOW_ruleActorSectionDecl_in_entryRuleActorSectionDecl1598);
            iv_ruleActorSectionDecl=ruleActorSectionDecl();

            state._fsp--;

             current =iv_ruleActorSectionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorSectionDecl1608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorSectionDecl"


    // $ANTLR start "ruleActorSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:754:1: ruleActorSectionDecl returns [EObject current=null] : (otherlv_0= 'actors' otherlv_1= ':' ( (lv_actors_2_0= ruleActorDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleActorSectionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actors_2_0 = null;

        EObject lv_actors_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:757:28: ( (otherlv_0= 'actors' otherlv_1= ':' ( (lv_actors_2_0= ruleActorDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )* otherlv_5= ';' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:758:1: (otherlv_0= 'actors' otherlv_1= ':' ( (lv_actors_2_0= ruleActorDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )* otherlv_5= ';' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:758:1: (otherlv_0= 'actors' otherlv_1= ':' ( (lv_actors_2_0= ruleActorDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )* otherlv_5= ';' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:758:3: otherlv_0= 'actors' otherlv_1= ':' ( (lv_actors_2_0= ruleActorDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleActorSectionDecl1645); 

                	newLeafNode(otherlv_0, grammarAccess.getActorSectionDeclAccess().getActorsKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleActorSectionDecl1657); 

                	newLeafNode(otherlv_1, grammarAccess.getActorSectionDeclAccess().getColonKeyword_1());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:766:1: ( (lv_actors_2_0= ruleActorDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:767:1: (lv_actors_2_0= ruleActorDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:767:1: (lv_actors_2_0= ruleActorDecl )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:768:3: lv_actors_2_0= ruleActorDecl
            {
             
            	        newCompositeNode(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleActorDecl_in_ruleActorSectionDecl1678);
            lv_actors_2_0=ruleActorDecl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActorSectionDeclRule());
            	        }
                   		add(
                   			current, 
                   			"actors",
                    		lv_actors_2_0, 
                    		"ActorDecl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:784:2: (otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:784:4: otherlv_3= ',' ( (lv_actors_4_0= ruleActorDecl ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActorSectionDecl1691); 

            	        	newLeafNode(otherlv_3, grammarAccess.getActorSectionDeclAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:788:1: ( (lv_actors_4_0= ruleActorDecl ) )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:789:1: (lv_actors_4_0= ruleActorDecl )
            	    {
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:789:1: (lv_actors_4_0= ruleActorDecl )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:790:3: lv_actors_4_0= ruleActorDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActorDecl_in_ruleActorSectionDecl1712);
            	    lv_actors_4_0=ruleActorDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorSectionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_4_0, 
            	            		"ActorDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleActorSectionDecl1726); 

                	newLeafNode(otherlv_5, grammarAccess.getActorSectionDeclAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorSectionDecl"


    // $ANTLR start "entryRuleMessageSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:818:1: entryRuleMessageSectionDecl returns [EObject current=null] : iv_ruleMessageSectionDecl= ruleMessageSectionDecl EOF ;
    public final EObject entryRuleMessageSectionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageSectionDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:819:2: (iv_ruleMessageSectionDecl= ruleMessageSectionDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:820:2: iv_ruleMessageSectionDecl= ruleMessageSectionDecl EOF
            {
             newCompositeNode(grammarAccess.getMessageSectionDeclRule()); 
            pushFollow(FOLLOW_ruleMessageSectionDecl_in_entryRuleMessageSectionDecl1762);
            iv_ruleMessageSectionDecl=ruleMessageSectionDecl();

            state._fsp--;

             current =iv_ruleMessageSectionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSectionDecl1772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageSectionDecl"


    // $ANTLR start "ruleMessageSectionDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:827:1: ruleMessageSectionDecl returns [EObject current=null] : (otherlv_0= 'messages' otherlv_1= ':' ( (lv_messages_2_0= ruleMessageDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleMessageSectionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_messages_2_0 = null;

        EObject lv_actors_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:830:28: ( (otherlv_0= 'messages' otherlv_1= ':' ( (lv_messages_2_0= ruleMessageDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )* otherlv_5= ';' ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:831:1: (otherlv_0= 'messages' otherlv_1= ':' ( (lv_messages_2_0= ruleMessageDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )* otherlv_5= ';' )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:831:1: (otherlv_0= 'messages' otherlv_1= ':' ( (lv_messages_2_0= ruleMessageDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )* otherlv_5= ';' )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:831:3: otherlv_0= 'messages' otherlv_1= ':' ( (lv_messages_2_0= ruleMessageDecl ) ) (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleMessageSectionDecl1809); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageSectionDeclAccess().getMessagesKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMessageSectionDecl1821); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageSectionDeclAccess().getColonKeyword_1());
                
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:839:1: ( (lv_messages_2_0= ruleMessageDecl ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:840:1: (lv_messages_2_0= ruleMessageDecl )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:840:1: (lv_messages_2_0= ruleMessageDecl )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:841:3: lv_messages_2_0= ruleMessageDecl
            {
             
            	        newCompositeNode(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageDecl_in_ruleMessageSectionDecl1842);
            lv_messages_2_0=ruleMessageDecl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageSectionDeclRule());
            	        }
                   		add(
                   			current, 
                   			"messages",
                    		lv_messages_2_0, 
                    		"MessageDecl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:857:2: (otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:857:4: otherlv_3= ',' ( (lv_actors_4_0= ruleMessageDecl ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMessageSectionDecl1855); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMessageSectionDeclAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:861:1: ( (lv_actors_4_0= ruleMessageDecl ) )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:862:1: (lv_actors_4_0= ruleMessageDecl )
            	    {
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:862:1: (lv_actors_4_0= ruleMessageDecl )
            	    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:863:3: lv_actors_4_0= ruleMessageDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageSectionDeclAccess().getActorsMessageDeclParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageDecl_in_ruleMessageSectionDecl1876);
            	    lv_actors_4_0=ruleMessageDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageSectionDeclRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_4_0, 
            	            		"MessageDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMessageSectionDecl1890); 

                	newLeafNode(otherlv_5, grammarAccess.getMessageSectionDeclAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageSectionDecl"


    // $ANTLR start "entryRuleActorDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:891:1: entryRuleActorDecl returns [EObject current=null] : iv_ruleActorDecl= ruleActorDecl EOF ;
    public final EObject entryRuleActorDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:892:2: (iv_ruleActorDecl= ruleActorDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:893:2: iv_ruleActorDecl= ruleActorDecl EOF
            {
             newCompositeNode(grammarAccess.getActorDeclRule()); 
            pushFollow(FOLLOW_ruleActorDecl_in_entryRuleActorDecl1926);
            iv_ruleActorDecl=ruleActorDecl();

            state._fsp--;

             current =iv_ruleActorDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorDecl1936); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorDecl"


    // $ANTLR start "ruleActorDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:900:1: ruleActorDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleActorDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:903:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:904:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:904:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:904:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:904:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:905:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:905:1: (lv_name_0_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:906:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorDecl1978); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActorDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:922:2: ( (otherlv_1= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:923:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:923:1: (otherlv_1= RULE_ID )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:924:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorDecl2003); 

                    		newLeafNode(otherlv_1, grammarAccess.getActorDeclAccess().getClassRefClassDeclCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorDecl"


    // $ANTLR start "entryRuleMessageDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:943:1: entryRuleMessageDecl returns [EObject current=null] : iv_ruleMessageDecl= ruleMessageDecl EOF ;
    public final EObject entryRuleMessageDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDecl = null;


        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:944:2: (iv_ruleMessageDecl= ruleMessageDecl EOF )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:945:2: iv_ruleMessageDecl= ruleMessageDecl EOF
            {
             newCompositeNode(grammarAccess.getMessageDeclRule()); 
            pushFollow(FOLLOW_ruleMessageDecl_in_entryRuleMessageDecl2040);
            iv_ruleMessageDecl=ruleMessageDecl();

            state._fsp--;

             current =iv_ruleMessageDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageDecl2050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageDecl"


    // $ANTLR start "ruleMessageDecl"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:952:1: ruleMessageDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= ruleMessageOperator ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleMessageDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_operator_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:955:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= ruleMessageOperator ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:956:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= ruleMessageOperator ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:956:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= ruleMessageOperator ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:956:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_operator_2_0= ruleMessageOperator ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:956:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:957:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:957:1: (lv_name_0_0= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:958:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageDecl2092); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMessageDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:974:2: ( (otherlv_1= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:975:1: (otherlv_1= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:975:1: (otherlv_1= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:976:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageDeclRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageDecl2117); 

            		newLeafNode(otherlv_1, grammarAccess.getMessageDeclAccess().getLeftOpActorDeclCrossReference_1_0()); 
            	

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:987:2: ( (lv_operator_2_0= ruleMessageOperator ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:988:1: (lv_operator_2_0= ruleMessageOperator )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:988:1: (lv_operator_2_0= ruleMessageOperator )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:989:3: lv_operator_2_0= ruleMessageOperator
            {
             
            	        newCompositeNode(grammarAccess.getMessageDeclAccess().getOperatorMessageOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageOperator_in_ruleMessageDecl2138);
            lv_operator_2_0=ruleMessageOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageDeclRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"MessageOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1005:2: ( (otherlv_3= RULE_ID ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1006:1: (otherlv_3= RULE_ID )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1006:1: (otherlv_3= RULE_ID )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1007:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageDeclRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageDecl2158); 

            		newLeafNode(otherlv_3, grammarAccess.getMessageDeclAccess().getRighOpActorDeclCrossReference_3_0()); 
            	

            }


            }

            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1018:2: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1018:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMessageDecl2171); 

                        	newLeafNode(otherlv_4, grammarAccess.getMessageDeclAccess().getColonKeyword_4_0());
                        
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1022:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1023:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1023:1: (otherlv_5= RULE_ID )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1024:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageDeclRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageDecl2191); 

                    		newLeafNode(otherlv_5, grammarAccess.getMessageDeclAccess().getMethodMethodDeclCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageDecl"


    // $ANTLR start "ruleMessageOperator"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1043:1: ruleMessageOperator returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<--' ) ) ;
    public final Enumerator ruleMessageOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1045:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<--' ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1046:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<--' ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1046:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<--' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1046:2: (enumLiteral_0= '-->' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1046:2: (enumLiteral_0= '-->' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1046:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleMessageOperator2243); 

                            current = grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1052:6: (enumLiteral_1= '<--' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1052:6: (enumLiteral_1= '<--' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1052:8: enumLiteral_1= '<--'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleMessageOperator2260); 

                            current = grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageOperator"


    // $ANTLR start "ruleDataType"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1062:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1064:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1065:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1065:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'double' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1065:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1065:2: (enumLiteral_0= 'boolean' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1065:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleDataType2305); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1071:6: (enumLiteral_1= 'string' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1071:6: (enumLiteral_1= 'string' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1071:8: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleDataType2322); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1077:6: (enumLiteral_2= 'integer' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1077:6: (enumLiteral_2= 'integer' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1077:8: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleDataType2339); 

                            current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1083:6: (enumLiteral_3= 'double' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1083:6: (enumLiteral_3= 'double' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1083:8: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleDataType2356); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleVisibility"
    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1093:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1095:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1096:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1096:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1096:2: (enumLiteral_0= 'public' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1096:2: (enumLiteral_0= 'public' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1096:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleVisibility2401); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1102:6: (enumLiteral_1= 'private' )
                    {
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1102:6: (enumLiteral_1= 'private' )
                    // ../com.frantz.txtuml/src-gen/com/frantz/txtuml/parser/antlr/internal/InternalTxtUML.g:1102:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleVisibility2418); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel130 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDecl_in_ruleStatement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceDecl_in_ruleStatement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDecl_in_entryRuleClassDecl285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDecl295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClassDecl332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDecl349 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleClassDecl367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDecl387 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleClassDecl400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDecl420 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleClassDecl436 = new BitSet(new long[]{0x000000007E000010L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_ruleClassDecl457 = new BitSet(new long[]{0x000000007E008010L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_ruleClassDecl478 = new BitSet(new long[]{0x000000007E008010L});
    public static final BitSet FOLLOW_15_in_ruleClassDecl491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMember_in_entryRuleClassMember527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMember537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDecl_in_ruleClassMember584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDecl_in_ruleClassMember611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationDecl_in_ruleClassMember638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSectionDecl_in_entryRuleClassSectionDecl673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSectionDecl683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityDecl_in_ruleClassSectionDecl729 = new BitSet(new long[]{0x000000007E000010L});
    public static final BitSet FOLLOW_ruleClassMember_in_ruleClassSectionDecl751 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleClassSectionDecl764 = new BitSet(new long[]{0x000000007E000010L});
    public static final BitSet FOLLOW_ruleClassMember_in_ruleClassSectionDecl785 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleClassSectionDecl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityDecl_in_entryRuleVisibilityDecl835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityDecl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleVisibilityDecl891 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVisibilityDecl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDecl_in_entryRuleMethodDecl939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDecl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMethodDecl995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDecl1012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMethodDecl1029 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethodDecl1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDecl_in_entryRuleAttributeDecl1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDecl1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttributeDecl1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDecl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationDecl_in_entryRuleAssociationDecl1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationDecl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationDecl1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationDecl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceDecl_in_entryRuleSequenceDecl1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceDecl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSequenceDecl1351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequenceDecl1368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSequenceDecl1385 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_ruleSequenceDecl1407 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_ruleSequenceDecl1428 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_15_in_ruleSequenceDecl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceSectionDecl_in_entryRuleSequenceSectionDecl1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceSectionDecl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorSectionDecl_in_ruleSequenceSectionDecl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSectionDecl_in_ruleSequenceSectionDecl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorSectionDecl_in_entryRuleActorSectionDecl1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorSectionDecl1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActorSectionDecl1645 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActorSectionDecl1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorDecl_in_ruleActorSectionDecl1678 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleActorSectionDecl1691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorDecl_in_ruleActorSectionDecl1712 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleActorSectionDecl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSectionDecl_in_entryRuleMessageSectionDecl1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSectionDecl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMessageSectionDecl1809 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMessageSectionDecl1821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_ruleMessageSectionDecl1842 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleMessageSectionDecl1855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_ruleMessageSectionDecl1876 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleMessageSectionDecl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDecl_in_entryRuleActorDecl1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorDecl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorDecl1978 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorDecl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDecl_in_entryRuleMessageDecl2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageDecl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageDecl2092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageDecl2117 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleMessageOperator_in_ruleMessageDecl2138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageDecl2158 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleMessageDecl2171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageDecl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMessageOperator2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMessageOperator2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataType2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataType2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVisibility2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVisibility2418 = new BitSet(new long[]{0x0000000000000002L});

}