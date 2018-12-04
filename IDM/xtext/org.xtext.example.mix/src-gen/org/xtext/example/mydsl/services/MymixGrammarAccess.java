/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MymixGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Device");
		private final Assignment cProceduresAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProceduresProcedureParserRuleCall_0 = (RuleCall)cProceduresAssignment.eContents().get(0);
		
		//Device:
		//	procedures+=Procedure*;
		@Override public ParserRule getRule() { return rule; }
		
		//procedures+=Procedure*
		public Assignment getProceduresAssignment() { return cProceduresAssignment; }
		
		//Procedure
		public RuleCall getProceduresProcedureParserRuleCall_0() { return cProceduresProcedureParserRuleCall_0; }
	}
	public class ProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Procedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcedureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyOperationParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Assignment cResultAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResultResultParserRuleCall_3_0 = (RuleCall)cResultAssignment_3.eContents().get(0);
		
		//Procedure:
		//	'procedure' name=ID
		//	body+=Operation+
		//	result=Result;
		@Override public ParserRule getRule() { return rule; }
		
		//'procedure' name=ID body+=Operation+ result=Result
		public Group getGroup() { return cGroup; }
		
		//'procedure'
		public Keyword getProcedureKeyword_0() { return cProcedureKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//body+=Operation+
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//Operation
		public RuleCall getBodyOperationParserRuleCall_2_0() { return cBodyOperationParserRuleCall_2_0; }
		
		//result=Result
		public Assignment getResultAssignment_3() { return cResultAssignment_3; }
		
		//Result
		public RuleCall getResultResultParserRuleCall_3_0() { return cResultResultParserRuleCall_3_0; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCheckParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWaitParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTakeStuffParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Operation:
		//	Check
		//	| Wait
		//	| TakeStuff;
		@Override public ParserRule getRule() { return rule; }
		
		//Check | Wait | TakeStuff
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Check
		public RuleCall getCheckParserRuleCall_0() { return cCheckParserRuleCall_0; }
		
		//Wait
		public RuleCall getWaitParserRuleCall_1() { return cWaitParserRuleCall_1; }
		
		//TakeStuff
		public RuleCall getTakeStuffParserRuleCall_2() { return cTakeStuffParserRuleCall_2; }
	}
	public class TakeStuffElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.TakeStuff");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpTakeParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cBodyPutSomeParserRuleCall_1_0_0 = (RuleCall)cBodyAssignment_1_0.eContents().get(0);
		private final Assignment cBodyAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cBodyPutAllParserRuleCall_1_1_0 = (RuleCall)cBodyAssignment_1_1.eContents().get(0);
		
		//TakeStuff:
		//	op=Take (body=PutSome
		//	| body=PutAll);
		@Override public ParserRule getRule() { return rule; }
		
		//op=Take (body=PutSome | body=PutAll)
		public Group getGroup() { return cGroup; }
		
		//op=Take
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//Take
		public RuleCall getOpTakeParserRuleCall_0_0() { return cOpTakeParserRuleCall_0_0; }
		
		//(body=PutSome | body=PutAll)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//body=PutSome
		public Assignment getBodyAssignment_1_0() { return cBodyAssignment_1_0; }
		
		//PutSome
		public RuleCall getBodyPutSomeParserRuleCall_1_0_0() { return cBodyPutSomeParserRuleCall_1_0_0; }
		
		//body=PutAll
		public Assignment getBodyAssignment_1_1() { return cBodyAssignment_1_1; }
		
		//PutAll
		public RuleCall getBodyPutAllParserRuleCall_1_1_0() { return cBodyPutAllParserRuleCall_1_1_0; }
	}
	public class TakeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Take");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTakeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQuantityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQuantityQuantityParserRuleCall_1_0 = (RuleCall)cQuantityAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCupAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCupCupParserRuleCall_3_0 = (RuleCall)cCupAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFilterKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFilterAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFilterFilterParserRuleCall_4_1_0 = (RuleCall)cFilterAssignment_4_1.eContents().get(0);
		
		//Take:
		//	'take' quantity=Quantity 'from' cup=Cup ('filter' filter=Filter)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'take' quantity=Quantity 'from' cup=Cup ('filter' filter=Filter)?
		public Group getGroup() { return cGroup; }
		
		//'take'
		public Keyword getTakeKeyword_0() { return cTakeKeyword_0; }
		
		//quantity=Quantity
		public Assignment getQuantityAssignment_1() { return cQuantityAssignment_1; }
		
		//Quantity
		public RuleCall getQuantityQuantityParserRuleCall_1_0() { return cQuantityQuantityParserRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//cup=Cup
		public Assignment getCupAssignment_3() { return cCupAssignment_3; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_3_0() { return cCupCupParserRuleCall_3_0; }
		
		//('filter' filter=Filter)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'filter'
		public Keyword getFilterKeyword_4_0() { return cFilterKeyword_4_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_4_1() { return cFilterAssignment_4_1; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_4_1_0() { return cFilterFilterParserRuleCall_4_1_0; }
	}
	public class PutSomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.PutSome");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWaitAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWaitWaitParserRuleCall_0_0 = (RuleCall)cWaitAssignment_0.eContents().get(0);
		private final Assignment cPutAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPutPutParserRuleCall_1_0 = (RuleCall)cPutAssignment_1.eContents().get(0);
		
		//PutSome:
		//	(wait+=Wait? put+=Put)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(wait+=Wait? put+=Put)+
		public Group getGroup() { return cGroup; }
		
		//wait+=Wait?
		public Assignment getWaitAssignment_0() { return cWaitAssignment_0; }
		
		//Wait
		public RuleCall getWaitWaitParserRuleCall_0_0() { return cWaitWaitParserRuleCall_0_0; }
		
		//put+=Put
		public Assignment getPutAssignment_1() { return cPutAssignment_1; }
		
		//Put
		public RuleCall getPutPutParserRuleCall_1_0() { return cPutPutParserRuleCall_1_0; }
	}
	public class PutAllElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.PutAll");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cToKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCupCupParserRuleCall_1_0 = (RuleCall)cCupAssignment_1.eContents().get(0);
		
		//PutAll:
		//	'to' cup=Cup;
		@Override public ParserRule getRule() { return rule; }
		
		//'to' cup=Cup
		public Group getGroup() { return cGroup; }
		
		//'to'
		public Keyword getToKeyword_0() { return cToKeyword_0; }
		
		//cup=Cup
		public Assignment getCupAssignment_1() { return cCupAssignment_1; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_1_0() { return cCupCupParserRuleCall_1_0; }
	}
	public class PutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Put");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQuantityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQuantityQuantityParserRuleCall_1_0 = (RuleCall)cQuantityAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCupAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCupCupParserRuleCall_3_0 = (RuleCall)cCupAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFilterKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFilterAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFilterFilterParserRuleCall_4_1_0 = (RuleCall)cFilterAssignment_4_1.eContents().get(0);
		
		//Put:
		//	'put' quantity=Quantity 'to' cup=Cup ('filter' filter=Filter)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'put' quantity=Quantity 'to' cup=Cup ('filter' filter=Filter)?
		public Group getGroup() { return cGroup; }
		
		//'put'
		public Keyword getPutKeyword_0() { return cPutKeyword_0; }
		
		//quantity=Quantity
		public Assignment getQuantityAssignment_1() { return cQuantityAssignment_1; }
		
		//Quantity
		public RuleCall getQuantityQuantityParserRuleCall_1_0() { return cQuantityQuantityParserRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//cup=Cup
		public Assignment getCupAssignment_3() { return cCupAssignment_3; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_3_0() { return cCupCupParserRuleCall_3_0; }
		
		//('filter' filter=Filter)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'filter'
		public Keyword getFilterKeyword_4_0() { return cFilterKeyword_4_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_4_1() { return cFilterAssignment_4_1; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_4_1_0() { return cFilterFilterParserRuleCall_4_1_0; }
	}
	public class CheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Check");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCheckKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCupCupParserRuleCall_1_0 = (RuleCall)cCupAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cForQuantityKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cQuantityAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cQuantityQuantityParserRuleCall_2_1_0 = (RuleCall)cQuantityAssignment_2_1.eContents().get(0);
		
		//Check:
		//	'check' cup=Cup ('forQuantity' quantity=Quantity)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'check' cup=Cup ('forQuantity' quantity=Quantity)?
		public Group getGroup() { return cGroup; }
		
		//'check'
		public Keyword getCheckKeyword_0() { return cCheckKeyword_0; }
		
		//cup=Cup
		public Assignment getCupAssignment_1() { return cCupAssignment_1; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_1_0() { return cCupCupParserRuleCall_1_0; }
		
		//('forQuantity' quantity=Quantity)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'forQuantity'
		public Keyword getForQuantityKeyword_2_0() { return cForQuantityKeyword_2_0; }
		
		//quantity=Quantity
		public Assignment getQuantityAssignment_2_1() { return cQuantityAssignment_2_1; }
		
		//Quantity
		public RuleCall getQuantityQuantityParserRuleCall_2_1_0() { return cQuantityQuantityParserRuleCall_2_1_0; }
	}
	public class WaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Wait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWaitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeTimeParserRuleCall_1_0 = (RuleCall)cTimeAssignment_1.eContents().get(0);
		
		//Wait:
		//	'wait' time=Time;
		@Override public ParserRule getRule() { return rule; }
		
		//'wait' time=Time
		public Group getGroup() { return cGroup; }
		
		//'wait'
		public Keyword getWaitKeyword_0() { return cWaitKeyword_0; }
		
		//time=Time
		public Assignment getTimeAssignment_1() { return cTimeAssignment_1; }
		
		//Time
		public RuleCall getTimeTimeParserRuleCall_1_0() { return cTimeTimeParserRuleCall_1_0; }
	}
	public class ResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Result");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResultKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCupCupParserRuleCall_1_0 = (RuleCall)cCupAssignment_1.eContents().get(0);
		
		//Result:
		//	'result' cup=Cup;
		@Override public ParserRule getRule() { return rule; }
		
		//'result' cup=Cup
		public Group getGroup() { return cGroup; }
		
		//'result'
		public Keyword getResultKeyword_0() { return cResultKeyword_0; }
		
		//cup=Cup
		public Assignment getCupAssignment_1() { return cCupAssignment_1; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_1_0() { return cCupCupParserRuleCall_1_0; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Filter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFilterAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cFilterAKeyword_0_0 = (Keyword)cFilterAssignment_0.eContents().get(0);
		private final Assignment cFilterAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cFilterBKeyword_1_0 = (Keyword)cFilterAssignment_1.eContents().get(0);
		
		//Filter:
		//	filter='A' | filter='B';
		@Override public ParserRule getRule() { return rule; }
		
		//filter='A' | filter='B'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//filter='A'
		public Assignment getFilterAssignment_0() { return cFilterAssignment_0; }
		
		//'A'
		public Keyword getFilterAKeyword_0_0() { return cFilterAKeyword_0_0; }
		
		//filter='B'
		public Assignment getFilterAssignment_1() { return cFilterAssignment_1; }
		
		//'B'
		public Keyword getFilterBKeyword_1_0() { return cFilterBKeyword_1_0; }
	}
	public class CupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Cup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCupINTTerminalRuleCall_1_0 = (RuleCall)cCupAssignment_1.eContents().get(0);
		
		//Cup:
		//	'cup'? cup=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'cup'? cup=INT
		public Group getGroup() { return cGroup; }
		
		//'cup'?
		public Keyword getCupKeyword_0() { return cCupKeyword_0; }
		
		//cup=INT
		public Assignment getCupAssignment_1() { return cCupAssignment_1; }
		
		//INT
		public RuleCall getCupINTTerminalRuleCall_1_0() { return cCupINTTerminalRuleCall_1_0; }
	}
	public class QuantityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Quantity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQuantityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQuantityINTTerminalRuleCall_0_0 = (RuleCall)cQuantityAssignment_0.eContents().get(0);
		private final Keyword cMLKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Quantity:
		//	quantity=INT 'mL'?;
		@Override public ParserRule getRule() { return rule; }
		
		//quantity=INT 'mL'?
		public Group getGroup() { return cGroup; }
		
		//quantity=INT
		public Assignment getQuantityAssignment_0() { return cQuantityAssignment_0; }
		
		//INT
		public RuleCall getQuantityINTTerminalRuleCall_0_0() { return cQuantityINTTerminalRuleCall_0_0; }
		
		//'mL'?
		public Keyword getMLKeyword_1() { return cMLKeyword_1; }
	}
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Time");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTimeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTimeINTTerminalRuleCall_0_0 = (RuleCall)cTimeAssignment_0.eContents().get(0);
		private final Keyword cSecKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Time:
		//	time=INT 'sec'?;
		@Override public ParserRule getRule() { return rule; }
		
		//time=INT 'sec'?
		public Group getGroup() { return cGroup; }
		
		//time=INT
		public Assignment getTimeAssignment_0() { return cTimeAssignment_0; }
		
		//INT
		public RuleCall getTimeINTTerminalRuleCall_0_0() { return cTimeINTTerminalRuleCall_0_0; }
		
		//'sec'?
		public Keyword getSecKeyword_1() { return cSecKeyword_1; }
	}
	
	
	private final DeviceElements pDevice;
	private final ProcedureElements pProcedure;
	private final OperationElements pOperation;
	private final TakeStuffElements pTakeStuff;
	private final TakeElements pTake;
	private final PutSomeElements pPutSome;
	private final PutAllElements pPutAll;
	private final PutElements pPut;
	private final CheckElements pCheck;
	private final WaitElements pWait;
	private final ResultElements pResult;
	private final FilterElements pFilter;
	private final CupElements pCup;
	private final QuantityElements pQuantity;
	private final TimeElements pTime;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MymixGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDevice = new DeviceElements();
		this.pProcedure = new ProcedureElements();
		this.pOperation = new OperationElements();
		this.pTakeStuff = new TakeStuffElements();
		this.pTake = new TakeElements();
		this.pPutSome = new PutSomeElements();
		this.pPutAll = new PutAllElements();
		this.pPut = new PutElements();
		this.pCheck = new CheckElements();
		this.pWait = new WaitElements();
		this.pResult = new ResultElements();
		this.pFilter = new FilterElements();
		this.pCup = new CupElements();
		this.pQuantity = new QuantityElements();
		this.pTime = new TimeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Mymix".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Device:
	//	procedures+=Procedure*;
	public DeviceElements getDeviceAccess() {
		return pDevice;
	}
	
	public ParserRule getDeviceRule() {
		return getDeviceAccess().getRule();
	}
	
	//Procedure:
	//	'procedure' name=ID
	//	body+=Operation+
	//	result=Result;
	public ProcedureElements getProcedureAccess() {
		return pProcedure;
	}
	
	public ParserRule getProcedureRule() {
		return getProcedureAccess().getRule();
	}
	
	//Operation:
	//	Check
	//	| Wait
	//	| TakeStuff;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//TakeStuff:
	//	op=Take (body=PutSome
	//	| body=PutAll);
	public TakeStuffElements getTakeStuffAccess() {
		return pTakeStuff;
	}
	
	public ParserRule getTakeStuffRule() {
		return getTakeStuffAccess().getRule();
	}
	
	//Take:
	//	'take' quantity=Quantity 'from' cup=Cup ('filter' filter=Filter)?;
	public TakeElements getTakeAccess() {
		return pTake;
	}
	
	public ParserRule getTakeRule() {
		return getTakeAccess().getRule();
	}
	
	//PutSome:
	//	(wait+=Wait? put+=Put)+;
	public PutSomeElements getPutSomeAccess() {
		return pPutSome;
	}
	
	public ParserRule getPutSomeRule() {
		return getPutSomeAccess().getRule();
	}
	
	//PutAll:
	//	'to' cup=Cup;
	public PutAllElements getPutAllAccess() {
		return pPutAll;
	}
	
	public ParserRule getPutAllRule() {
		return getPutAllAccess().getRule();
	}
	
	//Put:
	//	'put' quantity=Quantity 'to' cup=Cup ('filter' filter=Filter)?;
	public PutElements getPutAccess() {
		return pPut;
	}
	
	public ParserRule getPutRule() {
		return getPutAccess().getRule();
	}
	
	//Check:
	//	'check' cup=Cup ('forQuantity' quantity=Quantity)?;
	public CheckElements getCheckAccess() {
		return pCheck;
	}
	
	public ParserRule getCheckRule() {
		return getCheckAccess().getRule();
	}
	
	//Wait:
	//	'wait' time=Time;
	public WaitElements getWaitAccess() {
		return pWait;
	}
	
	public ParserRule getWaitRule() {
		return getWaitAccess().getRule();
	}
	
	//Result:
	//	'result' cup=Cup;
	public ResultElements getResultAccess() {
		return pResult;
	}
	
	public ParserRule getResultRule() {
		return getResultAccess().getRule();
	}
	
	//Filter:
	//	filter='A' | filter='B';
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//Cup:
	//	'cup'? cup=INT;
	public CupElements getCupAccess() {
		return pCup;
	}
	
	public ParserRule getCupRule() {
		return getCupAccess().getRule();
	}
	
	//Quantity:
	//	quantity=INT 'mL'?;
	public QuantityElements getQuantityAccess() {
		return pQuantity;
	}
	
	public ParserRule getQuantityRule() {
		return getQuantityAccess().getRule();
	}
	
	//Time:
	//	time=INT 'sec'?;
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
