package com.frantz.txtuml.serializer;

import com.frantz.txtuml.services.TxtUMLGrammarAccess;
import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.ActorSectionDecl;
import com.frantz.txtuml.txtUML.AssociationDecl;
import com.frantz.txtuml.txtUML.AttributeDecl;
import com.frantz.txtuml.txtUML.ClassDecl;
import com.frantz.txtuml.txtUML.ClassSectionDecl;
import com.frantz.txtuml.txtUML.MessageDecl;
import com.frantz.txtuml.txtUML.MessageSectionDecl;
import com.frantz.txtuml.txtUML.MethodDecl;
import com.frantz.txtuml.txtUML.Model;
import com.frantz.txtuml.txtUML.SequenceDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;
import com.frantz.txtuml.txtUML.VisibilityDecl;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TxtUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TxtUMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TxtUMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TxtUMLPackage.ACTOR_DECL:
				if(context == grammarAccess.getActorDeclRule()) {
					sequence_ActorDecl(context, (ActorDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.ACTOR_SECTION_DECL:
				if(context == grammarAccess.getActorSectionDeclRule() ||
				   context == grammarAccess.getSequenceSectionDeclRule()) {
					sequence_ActorSectionDecl(context, (ActorSectionDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.ASSOCIATION_DECL:
				if(context == grammarAccess.getAssociationDeclRule() ||
				   context == grammarAccess.getClassMemberRule()) {
					sequence_AssociationDecl(context, (AssociationDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.ATTRIBUTE_DECL:
				if(context == grammarAccess.getAttributeDeclRule() ||
				   context == grammarAccess.getClassMemberRule()) {
					sequence_AttributeDecl(context, (AttributeDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.CLASS_DECL:
				if(context == grammarAccess.getClassDeclRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ClassDecl(context, (ClassDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.CLASS_SECTION_DECL:
				if(context == grammarAccess.getClassSectionDeclRule()) {
					sequence_ClassSectionDecl(context, (ClassSectionDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.MESSAGE_DECL:
				if(context == grammarAccess.getMessageDeclRule()) {
					sequence_MessageDecl(context, (MessageDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.MESSAGE_SECTION_DECL:
				if(context == grammarAccess.getMessageSectionDeclRule() ||
				   context == grammarAccess.getSequenceSectionDeclRule()) {
					sequence_MessageSectionDecl(context, (MessageSectionDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.METHOD_DECL:
				if(context == grammarAccess.getClassMemberRule() ||
				   context == grammarAccess.getMethodDeclRule()) {
					sequence_MethodDecl(context, (MethodDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.SEQUENCE_DECL:
				if(context == grammarAccess.getSequenceDeclRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SequenceDecl(context, (SequenceDecl) semanticObject); 
					return; 
				}
				else break;
			case TxtUMLPackage.VISIBILITY_DECL:
				if(context == grammarAccess.getVisibilityDeclRule()) {
					sequence_VisibilityDecl(context, (VisibilityDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID classRef=[ClassDecl|ID]?)
	 */
	protected void sequence_ActorDecl(EObject context, ActorDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actors+=ActorDecl actors+=ActorDecl*)
	 */
	protected void sequence_ActorSectionDecl(EObject context, ActorSectionDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[ClassDecl|ID] name=ID)
	 */
	protected void sequence_AssociationDecl(EObject context, AssociationDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME));
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.ASSOCIATION_DECL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.ASSOCIATION_DECL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssociationDeclAccess().getTypeClassDeclIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getAssociationDeclAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID)
	 */
	protected void sequence_AttributeDecl(EObject context, AttributeDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME));
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.ATTRIBUTE_DECL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.ATTRIBUTE_DECL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclAccess().getTypeDataTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeDeclAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (inherits+=[ClassDecl|ID] inherits+=[ClassDecl|ID]*)? sections+=ClassSectionDecl sections+=ClassSectionDecl*)
	 */
	protected void sequence_ClassDecl(EObject context, ClassDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=VisibilityDecl? members+=ClassMember members+=ClassMember*)
	 */
	protected void sequence_ClassSectionDecl(EObject context, ClassSectionDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID leftOp=[ActorDecl|ID] operator=MessageOperator righOp=[ActorDecl|ID] method=[MethodDecl|ID]?)
	 */
	protected void sequence_MessageDecl(EObject context, MessageDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (messages+=MessageDecl actors+=MessageDecl*)
	 */
	protected void sequence_MessageSectionDecl(EObject context, MessageSectionDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnType=DataType name=ID)
	 */
	protected void sequence_MethodDecl(EObject context, MethodDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.CLASS_MEMBER__NAME));
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.METHOD_DECL__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.METHOD_DECL__RETURN_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodDeclAccess().getReturnTypeDataTypeEnumRuleCall_0_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (sections+=SequenceSectionDecl sections+=SequenceSectionDecl*)?)
	 */
	protected void sequence_SequenceDecl(EObject context, SequenceDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     visibility=Visibility
	 */
	protected void sequence_VisibilityDecl(EObject context, VisibilityDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TxtUMLPackage.Literals.VISIBILITY_DECL__VISIBILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TxtUMLPackage.Literals.VISIBILITY_DECL__VISIBILITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVisibilityDeclAccess().getVisibilityVisibilityEnumRuleCall_0_0(), semanticObject.getVisibility());
		feeder.finish();
	}
}
