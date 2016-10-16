/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.january.geometry.xtext.services.IGESGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class IGESSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IGESGrammarAccess grammarAccess;
	protected AbstractElementAlias match_End_WSTerminalRuleCall_10_q;
	protected AbstractElementAlias match_End_WSTerminalRuleCall_14_q;
	protected AbstractElementAlias match_End_WSTerminalRuleCall_1_q;
	protected AbstractElementAlias match_End_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_End_WSTerminalRuleCall_7_q;
	protected AbstractElementAlias match_Entry_INTTerminalRuleCall_15_q;
	protected AbstractElementAlias match_Entry_INTTerminalRuleCall_35_1_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_10_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_12_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_14_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_16_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_19_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_22_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_24_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_26_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_28_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_2_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_30_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_32_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_36_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_39_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_6_q;
	protected AbstractElementAlias match_Entry_WSTerminalRuleCall_8_q;
	protected AbstractElementAlias match_Entry___INTTerminalRuleCall_33_0_WSTerminalRuleCall_33_1_q__q;
	protected AbstractElementAlias match_Entry___INTTerminalRuleCall_34_0_WSTerminalRuleCall_34_1_q__q;
	protected AbstractElementAlias match_Global_DELIMITERTerminalRuleCall_0_q;
	protected AbstractElementAlias match_Global_DELIMITERTerminalRuleCall_2_q;
	protected AbstractElementAlias match_Global_WSTerminalRuleCall_3_1_q;
	protected AbstractElementAlias match_Global_WSTerminalRuleCall_3_3_q;
	protected AbstractElementAlias match_Global_WSTerminalRuleCall_6_q;
	protected AbstractElementAlias match_Global_WSTerminalRuleCall_8_q;
	protected AbstractElementAlias match_Global___WSTerminalRuleCall_3_1_q_GKeyword_3_2_WSTerminalRuleCall_3_3_q_INTTerminalRuleCall_3_4_ENDLINETerminalRuleCall_3_5__q;
	protected AbstractElementAlias match_HString_DELIMITERTerminalRuleCall_1_q;
	protected AbstractElementAlias match_PEntry_DELIMITERTerminalRuleCall_1_q;
	protected AbstractElementAlias match_PEntry_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_PEntry_WSTerminalRuleCall_7_q;
	protected AbstractElementAlias match_PMultiEntry_DELIMITERTerminalRuleCall_1_q;
	protected AbstractElementAlias match_PMultiEntry_WSTerminalRuleCall_2_1_q;
	protected AbstractElementAlias match_PMultiEntry_WSTerminalRuleCall_2_4_q;
	protected AbstractElementAlias match_PMultiEntry_WSTerminalRuleCall_5_q;
	protected AbstractElementAlias match_PMultiEntry_WSTerminalRuleCall_8_q;
	protected AbstractElementAlias match_Param_DELIMITERTerminalRuleCall_1_q;
	protected AbstractElementAlias match_Pointer_DELIMITERTerminalRuleCall_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IGESGrammarAccess) access;
		match_End_WSTerminalRuleCall_10_q = new TokenAlias(false, true, grammarAccess.getEndAccess().getWSTerminalRuleCall_10());
		match_End_WSTerminalRuleCall_14_q = new TokenAlias(false, true, grammarAccess.getEndAccess().getWSTerminalRuleCall_14());
		match_End_WSTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getEndAccess().getWSTerminalRuleCall_1());
		match_End_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEndAccess().getWSTerminalRuleCall_4());
		match_End_WSTerminalRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getEndAccess().getWSTerminalRuleCall_7());
		match_Entry_INTTerminalRuleCall_15_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getINTTerminalRuleCall_15());
		match_Entry_INTTerminalRuleCall_35_1_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getINTTerminalRuleCall_35_1());
		match_Entry_WSTerminalRuleCall_10_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_10());
		match_Entry_WSTerminalRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_12());
		match_Entry_WSTerminalRuleCall_14_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_14());
		match_Entry_WSTerminalRuleCall_16_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_16());
		match_Entry_WSTerminalRuleCall_19_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_19());
		match_Entry_WSTerminalRuleCall_22_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_22());
		match_Entry_WSTerminalRuleCall_24_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_24());
		match_Entry_WSTerminalRuleCall_26_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_26());
		match_Entry_WSTerminalRuleCall_28_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_28());
		match_Entry_WSTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_2());
		match_Entry_WSTerminalRuleCall_30_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_30());
		match_Entry_WSTerminalRuleCall_32_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_32());
		match_Entry_WSTerminalRuleCall_36_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_36());
		match_Entry_WSTerminalRuleCall_39_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_39());
		match_Entry_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_4());
		match_Entry_WSTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_6());
		match_Entry_WSTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_8());
		match_Entry___INTTerminalRuleCall_33_0_WSTerminalRuleCall_33_1_q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntryAccess().getINTTerminalRuleCall_33_0()), new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_33_1()));
		match_Entry___INTTerminalRuleCall_34_0_WSTerminalRuleCall_34_1_q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntryAccess().getINTTerminalRuleCall_34_0()), new TokenAlias(false, true, grammarAccess.getEntryAccess().getWSTerminalRuleCall_34_1()));
		match_Global_DELIMITERTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_0());
		match_Global_DELIMITERTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_2());
		match_Global_WSTerminalRuleCall_3_1_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_1());
		match_Global_WSTerminalRuleCall_3_3_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_3());
		match_Global_WSTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_6());
		match_Global_WSTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_8());
		match_Global___WSTerminalRuleCall_3_1_q_GKeyword_3_2_WSTerminalRuleCall_3_3_q_INTTerminalRuleCall_3_4_ENDLINETerminalRuleCall_3_5__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getGlobalAccess().getGKeyword_3_2()), new TokenAlias(false, true, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_3()), new TokenAlias(false, false, grammarAccess.getGlobalAccess().getINTTerminalRuleCall_3_4()), new TokenAlias(false, false, grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_3_5()));
		match_HString_DELIMITERTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_1());
		match_PEntry_DELIMITERTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getPEntryAccess().getDELIMITERTerminalRuleCall_1());
		match_PEntry_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_4());
		match_PEntry_WSTerminalRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_7());
		match_PMultiEntry_DELIMITERTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getPMultiEntryAccess().getDELIMITERTerminalRuleCall_1());
		match_PMultiEntry_WSTerminalRuleCall_2_1_q = new TokenAlias(false, true, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_1());
		match_PMultiEntry_WSTerminalRuleCall_2_4_q = new TokenAlias(false, true, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_4());
		match_PMultiEntry_WSTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_5());
		match_PMultiEntry_WSTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_8());
		match_Param_DELIMITERTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_1());
		match_Pointer_DELIMITERTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDELIMITERRule())
			return getDELIMITERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDLINERule())
			return getENDLINEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEPARATORRule())
			return getSEPARATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DELIMITER:
	 * 	.	;
	 */
	protected String getDELIMITERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal ENDLINE:
	 * 	'\r'? '\n';
	 */
	protected String getENDLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal INT returns ecore::EInt:
	 * 	('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SEPARATOR:
	 * . ;
	 */
	protected String getSEPARATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal WS:
	 * 	(' ' | '\t' | '\r')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_End_WSTerminalRuleCall_10_q.equals(syntax))
				emit_End_WSTerminalRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_End_WSTerminalRuleCall_14_q.equals(syntax))
				emit_End_WSTerminalRuleCall_14_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_End_WSTerminalRuleCall_1_q.equals(syntax))
				emit_End_WSTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_End_WSTerminalRuleCall_4_q.equals(syntax))
				emit_End_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_End_WSTerminalRuleCall_7_q.equals(syntax))
				emit_End_WSTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_INTTerminalRuleCall_15_q.equals(syntax))
				emit_Entry_INTTerminalRuleCall_15_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_INTTerminalRuleCall_35_1_q.equals(syntax))
				emit_Entry_INTTerminalRuleCall_35_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_10_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_12_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_14_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_14_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_16_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_16_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_19_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_19_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_22_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_22_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_24_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_24_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_26_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_26_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_28_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_28_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_2_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_30_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_30_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_32_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_32_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_36_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_36_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_39_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_39_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_4_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_6_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_WSTerminalRuleCall_8_q.equals(syntax))
				emit_Entry_WSTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry___INTTerminalRuleCall_33_0_WSTerminalRuleCall_33_1_q__q.equals(syntax))
				emit_Entry___INTTerminalRuleCall_33_0_WSTerminalRuleCall_33_1_q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry___INTTerminalRuleCall_34_0_WSTerminalRuleCall_34_1_q__q.equals(syntax))
				emit_Entry___INTTerminalRuleCall_34_0_WSTerminalRuleCall_34_1_q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_DELIMITERTerminalRuleCall_0_q.equals(syntax))
				emit_Global_DELIMITERTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_DELIMITERTerminalRuleCall_2_q.equals(syntax))
				emit_Global_DELIMITERTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_WSTerminalRuleCall_3_1_q.equals(syntax))
				emit_Global_WSTerminalRuleCall_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_WSTerminalRuleCall_3_3_q.equals(syntax))
				emit_Global_WSTerminalRuleCall_3_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_WSTerminalRuleCall_6_q.equals(syntax))
				emit_Global_WSTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global_WSTerminalRuleCall_8_q.equals(syntax))
				emit_Global_WSTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Global___WSTerminalRuleCall_3_1_q_GKeyword_3_2_WSTerminalRuleCall_3_3_q_INTTerminalRuleCall_3_4_ENDLINETerminalRuleCall_3_5__q.equals(syntax))
				emit_Global___WSTerminalRuleCall_3_1_q_GKeyword_3_2_WSTerminalRuleCall_3_3_q_INTTerminalRuleCall_3_4_ENDLINETerminalRuleCall_3_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HString_DELIMITERTerminalRuleCall_1_q.equals(syntax))
				emit_HString_DELIMITERTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PEntry_DELIMITERTerminalRuleCall_1_q.equals(syntax))
				emit_PEntry_DELIMITERTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PEntry_WSTerminalRuleCall_4_q.equals(syntax))
				emit_PEntry_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PEntry_WSTerminalRuleCall_7_q.equals(syntax))
				emit_PEntry_WSTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PMultiEntry_DELIMITERTerminalRuleCall_1_q.equals(syntax))
				emit_PMultiEntry_DELIMITERTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PMultiEntry_WSTerminalRuleCall_2_1_q.equals(syntax))
				emit_PMultiEntry_WSTerminalRuleCall_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PMultiEntry_WSTerminalRuleCall_2_4_q.equals(syntax))
				emit_PMultiEntry_WSTerminalRuleCall_2_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PMultiEntry_WSTerminalRuleCall_5_q.equals(syntax))
				emit_PMultiEntry_WSTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PMultiEntry_WSTerminalRuleCall_8_q.equals(syntax))
				emit_PMultiEntry_WSTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Param_DELIMITERTerminalRuleCall_1_q.equals(syntax))
				emit_Param_DELIMITERTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pointer_DELIMITERTerminalRuleCall_1_q.equals(syntax))
				emit_Pointer_DELIMITERTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     dval=INT 'P' (ambiguity) pval=INT
	 */
	protected void emit_End_WSTerminalRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     pval=INT WS 'T' (ambiguity) tval=INT
	 */
	protected void emit_End_WSTerminalRuleCall_14_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'S' (ambiguity) sval=INT
	 */
	protected void emit_End_WSTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     sval=INT 'G' (ambiguity) gval=INT
	 */
	protected void emit_End_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     gval=INT 'D' (ambiguity) dval=INT
	 */
	protected void emit_End_WSTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     INT?
	 *
	 * This ambiguous syntax occurs at:
	 *     TransformMatrix=INT WS? (ambiguity) WS? status=INT
	 */
	protected void emit_Entry_INTTerminalRuleCall_15_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     INT?
	 *
	 * This ambiguous syntax occurs at:
	 *     form=INT WS? (INT WS?)? (INT WS?)? (ambiguity) WS? 'D' WS? INT ENDLINE (rule end)
	 *     form=INT WS? (INT WS?)? (INT WS?)? (ambiguity) WS? subNum=INT
	 */
	protected void emit_Entry_INTTerminalRuleCall_35_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     level=INT (ambiguity) view=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     view=INT (ambiguity) TransformMatrix=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     TransformMatrix=INT (ambiguity) INT? WS? status=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_14_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     TransformMatrix=INT WS? INT? (ambiguity) status=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_16_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     status=INT 'D' (ambiguity) index=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_19_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     index=INT ENDLINE (ambiguity) INT WS? lineWeight=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_22_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     index=INT ENDLINE WS? INT (ambiguity) lineWeight=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_24_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     lineWeight=INT (ambiguity) color=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_26_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     color=INT (ambiguity) paramLines=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_28_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=INT (ambiguity) paramData=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     paramLines=INT (ambiguity) form=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_30_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     form=INT (ambiguity) (INT WS?)? (INT WS?)? INT? WS? 'D' WS? INT ENDLINE (rule end)
	 *     form=INT (ambiguity) (INT WS?)? (INT WS?)? INT? WS? subNum=INT
	 *     form=INT (ambiguity) (INT WS?)? (INT WS?)? entityLabel=STRING
	 */
	protected void emit_Entry_WSTerminalRuleCall_32_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     entityLabel=STRING (ambiguity) 'D' WS? INT ENDLINE (rule end)
	 *     entityLabel=STRING (ambiguity) subNum=INT
	 *     form=INT WS? (INT WS?)? (INT WS?)? INT? (ambiguity) 'D' WS? INT ENDLINE (rule end)
	 *     form=INT WS? (INT WS?)? (INT WS?)? INT? (ambiguity) subNum=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_36_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     entityLabel=STRING WS? 'D' (ambiguity) INT ENDLINE (rule end)
	 *     form=INT WS? (INT WS?)? (INT WS?)? INT? WS? 'D' (ambiguity) INT ENDLINE (rule end)
	 *     subNum=INT 'D' (ambiguity) INT ENDLINE (rule end)
	 */
	protected void emit_Entry_WSTerminalRuleCall_39_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     paramData=INT (ambiguity) structure=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     structure=INT (ambiguity) lineFont=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     lineFont=INT (ambiguity) level=INT
	 */
	protected void emit_Entry_WSTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (INT WS?)?
	 *
	 * This ambiguous syntax occurs at:
	 *     form=INT WS? (ambiguity) (INT WS?)? INT? WS? 'D' WS? INT ENDLINE (rule end)
	 *     form=INT WS? (ambiguity) (INT WS?)? INT? WS? subNum=INT
	 *     form=INT WS? (ambiguity) (INT WS?)? entityLabel=STRING
	 */
	protected void emit_Entry___INTTerminalRuleCall_33_0_WSTerminalRuleCall_33_1_q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (INT WS?)?
	 *
	 * This ambiguous syntax occurs at:
	 *     form=INT WS? (INT WS?)? (ambiguity) INT? WS? 'D' WS? INT ENDLINE (rule end)
	 *     form=INT WS? (INT WS?)? (ambiguity) INT? WS? subNum=INT
	 *     form=INT WS? (INT WS?)? (ambiguity) entityLabel=STRING
	 */
	protected void emit_Entry___INTTerminalRuleCall_34_0_WSTerminalRuleCall_34_1_q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) DELIMITER? values+=Value
	 *     (rule start) (ambiguity) val=HOLLERITH
	 */
	protected void emit_Global_DELIMITERTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) DELIMITER? (ambiguity) values+=Value
	 *     val=HOLLERITH DELIMITER? (ambiguity) values+=Value
	 */
	protected void emit_Global_DELIMITERTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value (ambiguity) 'G' WS? INT ENDLINE SEPARATOR WS? 'G' WS? INT ENDLINE (rule end)
	 *     values+=Value (ambiguity) 'G' WS? INT ENDLINE values+=Value
	 */
	protected void emit_Global_WSTerminalRuleCall_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value WS? 'G' (ambiguity) INT ENDLINE SEPARATOR WS? 'G' WS? INT ENDLINE (rule end)
	 *     values+=Value WS? 'G' (ambiguity) INT ENDLINE values+=Value
	 */
	protected void emit_Global_WSTerminalRuleCall_3_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value SEPARATOR (ambiguity) 'G' WS? INT ENDLINE (rule end)
	 *     values+=Value WS? 'G' WS? INT ENDLINE SEPARATOR (ambiguity) 'G' WS? INT ENDLINE (rule end)
	 */
	protected void emit_Global_WSTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value SEPARATOR WS? 'G' (ambiguity) INT ENDLINE (rule end)
	 *     values+=Value WS? 'G' WS? INT ENDLINE SEPARATOR WS? 'G' (ambiguity) INT ENDLINE (rule end)
	 */
	protected void emit_Global_WSTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (WS? 'G' WS? INT ENDLINE)?
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value (ambiguity) values+=Value
	 */
	protected void emit_Global___WSTerminalRuleCall_3_1_q_GKeyword_3_2_WSTerminalRuleCall_3_3_q_INTTerminalRuleCall_3_4_ENDLINETerminalRuleCall_3_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     val=HOLLERITH (ambiguity) (rule end)
	 *     val=HOLLERITH (ambiguity) DELIMITER? values+=Value
	 */
	protected void emit_HString_DELIMITERTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=INT (ambiguity) SEPARATOR WS? dIndex=INT
	 *     type=INT (ambiguity) values+=Value
	 */
	protected void emit_PEntry_DELIMITERTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=INT DELIMITER? SEPARATOR (ambiguity) dIndex=INT
	 *     values+=Value SEPARATOR (ambiguity) dIndex=INT
	 */
	protected void emit_PEntry_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     dIndex=INT 'P' (ambiguity) indicies+=INT
	 */
	protected void emit_PEntry_WSTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=INT (ambiguity) WS? dIndex=INT
	 *     type=INT (ambiguity) values+=Value
	 */
	protected void emit_PMultiEntry_DELIMITERTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     indicies+=INT ENDLINE (ambiguity) dIndex=INT
	 *     type=INT DELIMITER? (ambiguity) dIndex=INT
	 *     values+=Value (ambiguity) dIndex=INT
	 */
	protected void emit_PMultiEntry_WSTerminalRuleCall_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     dIndex=INT 'P' (ambiguity) indicies+=INT
	 */
	protected void emit_PMultiEntry_WSTerminalRuleCall_2_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     indicies+=INT ENDLINE SEPARATOR (ambiguity) INT 'P' WS? INT ENDLINE (rule end)
	 *     values+=Value SEPARATOR (ambiguity) INT 'P' WS? INT ENDLINE (rule end)
	 */
	protected void emit_PMultiEntry_WSTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     indicies+=INT ENDLINE SEPARATOR WS? INT 'P' (ambiguity) INT ENDLINE (rule end)
	 *     values+=Value SEPARATOR WS? INT 'P' (ambiguity) INT ENDLINE (rule end)
	 */
	protected void emit_PMultiEntry_WSTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     val=DOUBLE (ambiguity) (rule end)
	 */
	protected void emit_Param_DELIMITERTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DELIMITER?
	 *
	 * This ambiguous syntax occurs at:
	 *     val=INT (ambiguity) (rule end)
	 */
	protected void emit_Pointer_DELIMITERTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}