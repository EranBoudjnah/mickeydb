package com.justeat.mickeydb.serializer;

import com.google.inject.Inject;
import com.justeat.mickeydb.services.MickeyLangGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MickeyLangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MickeyLangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActionStatement___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q;
	protected AbstractElementAlias match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1;
	protected AbstractElementAlias match_NullExpression_NotNullKeyword_1_1_0_or_NotnullKeyword_1_1_1;
	protected AbstractElementAlias match_SelectStatement_CommaKeyword_2_2_0_1_or_OffsetKeyword_2_2_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MickeyLangGrammarAccess) access;
		match_ActionStatement___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getLeftCurlyBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getRightCurlyBracketKeyword_6_2()));
		match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1()));
		match_NullExpression_NotNullKeyword_1_1_0_or_NotnullKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getNullExpressionAccess().getNotnullKeyword_1_1_1()));
		match_SelectStatement_CommaKeyword_2_2_0_1_or_OffsetKeyword_2_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1()), new TokenAlias(false, false, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ActionStatement___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_ActionStatement___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1.equals(syntax))
				emit_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NullExpression_NotNullKeyword_1_1_0_or_NotnullKeyword_1_1_1.equals(syntax))
				emit_NullExpression_NotNullKeyword_1_1_0_or_NotnullKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SelectStatement_CommaKeyword_2_2_0_1_or_OffsetKeyword_2_2_0_0.equals(syntax))
				emit_SelectStatement_CommaKeyword_2_2_0_1_or_OffsetKeyword_2_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ActionStatement___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'insert' | 'replace'
	 */
	protected void emit_InsertStatement_InsertKeyword_0_0_0_or_ReplaceKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not null' | 'notnull'
	 */
	protected void emit_NullExpression_NotNullKeyword_1_1_0_or_NotnullKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'offset' | ','
	 */
	protected void emit_SelectStatement_CommaKeyword_2_2_0_1_or_OffsetKeyword_2_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
