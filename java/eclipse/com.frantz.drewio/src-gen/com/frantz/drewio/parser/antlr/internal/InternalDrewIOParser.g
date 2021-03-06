/*
* generated by Xtext
*/
parser grammar InternalDrewIOParser;

options {
	tokenVocab=InternalDrewIOLexer;
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@header {
package com.frantz.drewio.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.frantz.drewio.services.DrewIOGrammarAccess;

}

@members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 

	private DrewIOGrammarAccess grammarAccess;
	 	
	public InternalDrewIOParser(TokenStream input, DrewIOGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}
	
	@Override
	protected String getFirstRuleName() {
		return "Model";	
	} 
	   	   	
	@Override
	protected DrewIOGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
	    }
		lv_statements_0_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_0_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getInputStatementParserRuleCall_0()); 
    }
    this_InputStatement_0=ruleInputStatement
    {
        $current = $this_InputStatement_0.current;
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getOutputStatementParserRuleCall_1()); 
    }
    this_OutputStatement_1=ruleOutputStatement
    {
        $current = $this_OutputStatement_1.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleInputStatement
entryRuleInputStatement returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getInputStatementRule()); }
	 iv_ruleInputStatement=ruleInputStatement 
	 { $current=$iv_ruleInputStatement.current; } 
	 EOF 
;

// Rule InputStatement
ruleInputStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=KEYWORD_10
    {
    	newLeafNode(otherlv_0, grammarAccess.getInputStatementAccess().getInputKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getInputStatementAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputStatementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)
	otherlv_2=KEYWORD_5
    {
    	newLeafNode(otherlv_2, grammarAccess.getInputStatementAccess().getLeftCurlyBracketKeyword_2());
    }
(
	otherlv_3=KEYWORD_8
    {
    	newLeafNode(otherlv_3, grammarAccess.getInputStatementAccess().getTypeKeyword_3_0());
    }

	otherlv_4=KEYWORD_1
    {
    	newLeafNode(otherlv_4, grammarAccess.getInputStatementAccess().getLeftParenthesisKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputStatementAccess().getColumnsColumnParserRuleCall_3_2_0()); 
	    }
		lv_columns_5_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputStatementRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_5_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_6=KEYWORD_3
    {
    	newLeafNode(otherlv_6, grammarAccess.getInputStatementAccess().getCommaKeyword_3_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputStatementAccess().getColumnsColumnParserRuleCall_3_3_1_0()); 
	    }
		lv_columns_7_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputStatementRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_7_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_8=KEYWORD_2
    {
    	newLeafNode(otherlv_8, grammarAccess.getInputStatementAccess().getRightParenthesisKeyword_3_4());
    }
)?
	otherlv_9=KEYWORD_4
    {
    	newLeafNode(otherlv_9, grammarAccess.getInputStatementAccess().getSemicolonKeyword_4());
    }

	otherlv_10=KEYWORD_6
    {
    	newLeafNode(otherlv_10, grammarAccess.getInputStatementAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleOutputStatement
entryRuleOutputStatement returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOutputStatementRule()); }
	 iv_ruleOutputStatement=ruleOutputStatement 
	 { $current=$iv_ruleOutputStatement.current; } 
	 EOF 
;

// Rule OutputStatement
ruleOutputStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=KEYWORD_11
    {
    	newLeafNode(otherlv_0, grammarAccess.getOutputStatementAccess().getOutputKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOutputStatementAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputStatementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)
	otherlv_2=KEYWORD_15
    {
    	newLeafNode(otherlv_2, grammarAccess.getOutputStatementAccess().getReceivesKeyword_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputStatementRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getOutputStatementAccess().getInputsStatementCrossReference_3_0()); 
	}

)
)(
	otherlv_4=KEYWORD_3
    {
    	newLeafNode(otherlv_4, grammarAccess.getOutputStatementAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputStatementRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getOutputStatementAccess().getInputsStatementCrossReference_4_1_0()); 
	}

)
))*
	otherlv_6=KEYWORD_5
    {
    	newLeafNode(otherlv_6, grammarAccess.getOutputStatementAccess().getLeftCurlyBracketKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getOutputStatementAccess().getMethodsOnRecievedParserRuleCall_6_0_0()); 
	    }
		lv_methods_7_0=ruleOnRecieved		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOutputStatementRule());
	        }
       		add(
       			$current, 
       			"methods",
        		lv_methods_7_0, 
        		"OnRecieved");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_8=KEYWORD_3
    {
    	newLeafNode(otherlv_8, grammarAccess.getOutputStatementAccess().getCommaKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOutputStatementAccess().getMethodsOnRecievedParserRuleCall_6_1_1_0()); 
	    }
		lv_methods_9_0=ruleOnRecieved		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOutputStatementRule());
	        }
       		add(
       			$current, 
       			"methods",
        		lv_methods_9_0, 
        		"OnRecieved");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?
	otherlv_10=KEYWORD_6
    {
    	newLeafNode(otherlv_10, grammarAccess.getOutputStatementAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleOnRecieved
entryRuleOnRecieved returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOnRecievedRule()); }
	 iv_ruleOnRecieved=ruleOnRecieved 
	 { $current=$iv_ruleOnRecieved.current; } 
	 EOF 
;

// Rule OnRecieved
ruleOnRecieved returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=KEYWORD_7
    {
    	newLeafNode(otherlv_0, grammarAccess.getOnRecievedAccess().getOnKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOnRecievedRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getOnRecievedAccess().getNameStatementCrossReference_1_0()); 
	}

)
)
	otherlv_2=KEYWORD_5
    {
    	newLeafNode(otherlv_2, grammarAccess.getOnRecievedAccess().getLeftCurlyBracketKeyword_2());
    }

	otherlv_3=KEYWORD_6
    {
    	newLeafNode(otherlv_3, grammarAccess.getOnRecievedAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	 iv_ruleColumn=ruleColumn 
	 { $current=$iv_ruleColumn.current; } 
	 EOF 
;

// Rule Column
ruleColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getColumnAccess().getTypeDataTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColumnRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"DataType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDataType
entryRuleDataType returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); } 
	 iv_ruleDataType=ruleDataType 
	 { $current=$iv_ruleDataType.current.getText(); }  
	 EOF 
;

// Rule DataType
ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
	kw=KEYWORD_13 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_0()); 
    }

    |
	kw=KEYWORD_12 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_1()); 
    }

    |
	kw=KEYWORD_14 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_2()); 
    }

    |
	kw=KEYWORD_9 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDataTypeAccess().getFloatKeyword_3()); 
    }
)
    ;





