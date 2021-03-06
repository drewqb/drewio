/*
* generated by Xtext
*/
grammar InternalTxtUML;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.frantz.txtuml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
        newCompositeNode(grammarAccess.getStatementAccess().getClassDeclParserRuleCall_0()); 
    }
    this_ClassDecl_0=ruleClassDecl
    { 
        $current = $this_ClassDecl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getSequenceDeclParserRuleCall_1()); 
    }
    this_SequenceDecl_1=ruleSequenceDecl
    { 
        $current = $this_SequenceDecl_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleClassDecl
entryRuleClassDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassDeclRule()); }
	 iv_ruleClassDecl=ruleClassDecl 
	 { $current=$iv_ruleClassDecl.current; } 
	 EOF 
;

// Rule ClassDecl
ruleClassDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='class' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClassDeclAccess().getClassKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='inherits' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClassDeclAccess().getInheritsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassDeclRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_1_0()); 
	}

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClassDeclAccess().getCommaKeyword_2_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassDeclRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getClassDeclAccess().getInheritsClassDeclCrossReference_2_2_1_0()); 
	}

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_4_0()); 
	    }
		lv_sections_7_0=ruleClassSectionDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassDeclRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_7_0, 
        		"ClassSectionDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getClassDeclAccess().getSectionsClassSectionDeclParserRuleCall_5_0()); 
	    }
		lv_sections_8_0=ruleClassSectionDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassDeclRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_8_0, 
        		"ClassSectionDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleClassMember
entryRuleClassMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassMemberRule()); }
	 iv_ruleClassMember=ruleClassMember 
	 { $current=$iv_ruleClassMember.current; } 
	 EOF 
;

// Rule ClassMember
ruleClassMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getClassMemberAccess().getMethodDeclParserRuleCall_0()); 
    }
    this_MethodDecl_0=ruleMethodDecl
    { 
        $current = $this_MethodDecl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getClassMemberAccess().getAttributeDeclParserRuleCall_1()); 
    }
    this_AttributeDecl_1=ruleAttributeDecl
    { 
        $current = $this_AttributeDecl_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getClassMemberAccess().getAssociationDeclParserRuleCall_2()); 
    }
    this_AssociationDecl_2=ruleAssociationDecl
    { 
        $current = $this_AssociationDecl_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleClassSectionDecl
entryRuleClassSectionDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassSectionDeclRule()); }
	 iv_ruleClassSectionDecl=ruleClassSectionDecl 
	 { $current=$iv_ruleClassSectionDecl.current; } 
	 EOF 
;

// Rule ClassSectionDecl
ruleClassSectionDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getVisibilityVisibilityDeclParserRuleCall_0_0()); 
	    }
		lv_visibility_0_0=ruleVisibilityDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
	        }
       		set(
       			$current, 
       			"visibility",
        		lv_visibility_0_0, 
        		"VisibilityDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_1_0()); 
	    }
		lv_members_1_0=ruleClassMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_1_0, 
        		"ClassMember");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClassSectionDeclAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassSectionDeclAccess().getMembersClassMemberParserRuleCall_2_1_0()); 
	    }
		lv_members_3_0=ruleClassMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassSectionDeclRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_3_0, 
        		"ClassMember");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClassSectionDeclAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleVisibilityDecl
entryRuleVisibilityDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVisibilityDeclRule()); }
	 iv_ruleVisibilityDecl=ruleVisibilityDecl 
	 { $current=$iv_ruleVisibilityDecl.current; } 
	 EOF 
;

// Rule VisibilityDecl
ruleVisibilityDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getVisibilityDeclAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
	    }
		lv_visibility_0_0=ruleVisibility		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVisibilityDeclRule());
	        }
       		set(
       			$current, 
       			"visibility",
        		lv_visibility_0_0, 
        		"Visibility");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVisibilityDeclAccess().getColonKeyword_1());
    }
)
;





// Entry rule entryRuleMethodDecl
entryRuleMethodDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodDeclRule()); }
	 iv_ruleMethodDecl=ruleMethodDecl 
	 { $current=$iv_ruleMethodDecl.current; } 
	 EOF 
;

// Rule MethodDecl
ruleMethodDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMethodDeclAccess().getReturnTypeDataTypeEnumRuleCall_0_0()); 
	    }
		lv_returnType_0_0=ruleDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodDeclRule());
	        }
       		set(
       			$current, 
       			"returnType",
        		lv_returnType_0_0, 
        		"DataType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMethodDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_2());
    }
	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleAttributeDecl
entryRuleAttributeDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeDeclRule()); }
	 iv_ruleAttributeDecl=ruleAttributeDecl 
	 { $current=$iv_ruleAttributeDecl.current; } 
	 EOF 
;

// Rule AttributeDecl
ruleAttributeDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeDeclAccess().getTypeDataTypeEnumRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeDeclRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"DataType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleAssociationDecl
entryRuleAssociationDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssociationDeclRule()); }
	 iv_ruleAssociationDecl=ruleAssociationDecl 
	 { $current=$iv_ruleAssociationDecl.current; } 
	 EOF 
;

// Rule AssociationDecl
ruleAssociationDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationDeclRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getAssociationDeclAccess().getTypeClassDeclCrossReference_0_0()); 
	}

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAssociationDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleSequenceDecl
entryRuleSequenceDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceDeclRule()); }
	 iv_ruleSequenceDecl=ruleSequenceDecl 
	 { $current=$iv_ruleSequenceDecl.current; } 
	 EOF 
;

// Rule SequenceDecl
ruleSequenceDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='sequence' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSequenceDeclAccess().getSequenceKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSequenceDeclAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequenceDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSequenceDeclAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_0_0()); 
	    }
		lv_sections_3_0=ruleSequenceSectionDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceDeclRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_3_0, 
        		"SequenceSectionDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceDeclAccess().getSectionsSequenceSectionDeclParserRuleCall_3_1_0()); 
	    }
		lv_sections_4_0=ruleSequenceSectionDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceDeclRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_4_0, 
        		"SequenceSectionDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSequenceDeclAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleSequenceSectionDecl
entryRuleSequenceSectionDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceSectionDeclRule()); }
	 iv_ruleSequenceSectionDecl=ruleSequenceSectionDecl 
	 { $current=$iv_ruleSequenceSectionDecl.current; } 
	 EOF 
;

// Rule SequenceSectionDecl
ruleSequenceSectionDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSequenceSectionDeclAccess().getActorSectionDeclParserRuleCall_0()); 
    }
    this_ActorSectionDecl_0=ruleActorSectionDecl
    { 
        $current = $this_ActorSectionDecl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSequenceSectionDeclAccess().getMessageSectionDeclParserRuleCall_1()); 
    }
    this_MessageSectionDecl_1=ruleMessageSectionDecl
    { 
        $current = $this_MessageSectionDecl_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleActorSectionDecl
entryRuleActorSectionDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActorSectionDeclRule()); }
	 iv_ruleActorSectionDecl=ruleActorSectionDecl 
	 { $current=$iv_ruleActorSectionDecl.current; } 
	 EOF 
;

// Rule ActorSectionDecl
ruleActorSectionDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='actors' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActorSectionDeclAccess().getActorsKeyword_0());
    }
	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActorSectionDeclAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_2_0()); 
	    }
		lv_actors_2_0=ruleActorDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActorSectionDeclRule());
	        }
       		add(
       			$current, 
       			"actors",
        		lv_actors_2_0, 
        		"ActorDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getActorSectionDeclAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActorSectionDeclAccess().getActorsActorDeclParserRuleCall_3_1_0()); 
	    }
		lv_actors_4_0=ruleActorDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActorSectionDeclRule());
	        }
       		add(
       			$current, 
       			"actors",
        		lv_actors_4_0, 
        		"ActorDecl");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getActorSectionDeclAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMessageSectionDecl
entryRuleMessageSectionDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMessageSectionDeclRule()); }
	 iv_ruleMessageSectionDecl=ruleMessageSectionDecl 
	 { $current=$iv_ruleMessageSectionDecl.current; } 
	 EOF 
;

// Rule MessageSectionDecl
ruleMessageSectionDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='messages' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMessageSectionDeclAccess().getMessagesKeyword_0());
    }
	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMessageSectionDeclAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_2_0()); 
	    }
		lv_messages_2_0=ruleMessageDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageSectionDeclRule());
	        }
       		add(
       			$current, 
       			"messages",
        		lv_messages_2_0, 
        		"MessageDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMessageSectionDeclAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageSectionDeclAccess().getMessagesMessageDeclParserRuleCall_3_1_0()); 
	    }
		lv_messages_4_0=ruleMessageDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageSectionDeclRule());
	        }
       		add(
       			$current, 
       			"messages",
        		lv_messages_4_0, 
        		"MessageDecl");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMessageSectionDeclAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleActorDecl
entryRuleActorDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActorDeclRule()); }
	 iv_ruleActorDecl=ruleActorDecl 
	 { $current=$iv_ruleActorDecl.current; } 
	 EOF 
;

// Rule ActorDecl
ruleActorDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getActorDeclAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorDeclRule());
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
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorDeclRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getActorDeclAccess().getClassRefClassDeclCrossReference_1_0()); 
	}

)
)?)
;





// Entry rule entryRuleMessageDecl
entryRuleMessageDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMessageDeclRule()); }
	 iv_ruleMessageDecl=ruleMessageDecl 
	 { $current=$iv_ruleMessageDecl.current; } 
	 EOF 
;

// Rule MessageDecl
ruleMessageDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMessageDeclAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageDeclRule());
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
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageDeclRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMessageDeclAccess().getLeftOpActorDeclCrossReference_1_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageDeclAccess().getOperatorMessageOperatorEnumRuleCall_2_0()); 
	    }
		lv_operator_2_0=ruleMessageOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageDeclRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"MessageOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageDeclRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getMessageDeclAccess().getRighOpActorDeclCrossReference_3_0()); 
	}

)
)(	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMessageDeclAccess().getColonKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageDeclRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getMessageDeclAccess().getMethodMethodDeclCrossReference_4_1_0()); 
	}

)
))?)
;





// Rule MessageOperator
ruleMessageOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='-->' 
	{
        $current = grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMessageOperatorAccess().getRIGHT_MSGEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='<--' 
	{
        $current = grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMessageOperatorAccess().getLEFT_MSGEnumLiteralDeclaration_1()); 
    }
));



// Rule DataType
ruleDataType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='boolean' 
	{
        $current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='string' 
	{
        $current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='integer' 
	{
        $current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='double' 
	{
        $current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_3()); 
    }
));



// Rule Visibility
ruleVisibility returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='public' 
	{
        $current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='private' 
	{
        $current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


