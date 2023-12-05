/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.expt2.university.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class UniversityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.University");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUniversityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUniversityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cContainKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cContainAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cContainSchoolParserRuleCall_4_2_0 = (RuleCall)cContainAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cContainAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cContainSchoolParserRuleCall_4_3_1_0 = (RuleCall)cContainAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//University returns University:
		//    {University}
		//    'University'
		//    name=EString
		//    '{'
		//        ('contain' '{' contain+=School ( "," contain+=School)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{University}
		//'University'
		//name=EString
		//'{'
		//    ('contain' '{' contain+=School ( "," contain+=School)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{University}
		public Action getUniversityAction_0() { return cUniversityAction_0; }
		
		//'University'
		public Keyword getUniversityKeyword_1() { return cUniversityKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('contain' '{' contain+=School ( "," contain+=School)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'contain'
		public Keyword getContainKeyword_4_0() { return cContainKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//contain+=School
		public Assignment getContainAssignment_4_2() { return cContainAssignment_4_2; }
		
		//School
		public RuleCall getContainSchoolParserRuleCall_4_2_0() { return cContainSchoolParserRuleCall_4_2_0; }
		
		//( "," contain+=School)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//contain+=School
		public Assignment getContainAssignment_4_3_1() { return cContainAssignment_4_3_1; }
		
		//School
		public RuleCall getContainSchoolParserRuleCall_4_3_1_0() { return cContainSchoolParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.Person");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTeacherParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStudentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Person returns Person:
		//    Teacher | Student;
		@Override public ParserRule getRule() { return rule; }
		
		//Teacher | Student
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Teacher
		public RuleCall getTeacherParserRuleCall_0() { return cTeacherParserRuleCall_0; }
		
		//Student
		public RuleCall getStudentParserRuleCall_1() { return cStudentParserRuleCall_1; }
	}
	public class SchoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.School");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSchoolAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSchoolKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSidKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSidAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cSidEIntParserRuleCall_4_1_0 = (RuleCall)cSidAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cContainPersonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cContainPersonAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cContainPersonPersonParserRuleCall_5_2_0 = (RuleCall)cContainPersonAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cContainPersonAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cContainPersonPersonParserRuleCall_5_3_1_0 = (RuleCall)cContainPersonAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//School returns School:
		//    {School}
		//    'School'
		//    name=EString
		//    '{'
		//        ('sid' sid=EInt)?
		//        ('containPerson' '{' containPerson+=Person ( "," containPerson+=Person)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{School}
		//'School'
		//name=EString
		//'{'
		//    ('sid' sid=EInt)?
		//    ('containPerson' '{' containPerson+=Person ( "," containPerson+=Person)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{School}
		public Action getSchoolAction_0() { return cSchoolAction_0; }
		
		//'School'
		public Keyword getSchoolKeyword_1() { return cSchoolKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('sid' sid=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'sid'
		public Keyword getSidKeyword_4_0() { return cSidKeyword_4_0; }
		
		//sid=EInt
		public Assignment getSidAssignment_4_1() { return cSidAssignment_4_1; }
		
		//EInt
		public RuleCall getSidEIntParserRuleCall_4_1_0() { return cSidEIntParserRuleCall_4_1_0; }
		
		//('containPerson' '{' containPerson+=Person ( "," containPerson+=Person)* '}' )?
		public Group getGroup_5() { return cGroup_5; }
		
		//'containPerson'
		public Keyword getContainPersonKeyword_5_0() { return cContainPersonKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//containPerson+=Person
		public Assignment getContainPersonAssignment_5_2() { return cContainPersonAssignment_5_2; }
		
		//Person
		public RuleCall getContainPersonPersonParserRuleCall_5_2_0() { return cContainPersonPersonParserRuleCall_5_2_0; }
		
		//( "," containPerson+=Person)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//containPerson+=Person
		public Assignment getContainPersonAssignment_5_3_1() { return cContainPersonAssignment_5_3_1; }
		
		//Person
		public RuleCall getContainPersonPersonParserRuleCall_5_3_1_0() { return cContainPersonPersonParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class TeacherElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.Teacher");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTeacherAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTeacherKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cIdKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIdAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIdEStringParserRuleCall_4_1_0 = (RuleCall)cIdAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cWorkInKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cWorkInAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final CrossReference cWorkInSchoolCrossReference_5_2_0 = (CrossReference)cWorkInAssignment_5_2.eContents().get(0);
		private final RuleCall cWorkInSchoolEStringParserRuleCall_5_2_0_1 = (RuleCall)cWorkInSchoolCrossReference_5_2_0.eContents().get(1);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cWorkInAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final CrossReference cWorkInSchoolCrossReference_5_3_1_0 = (CrossReference)cWorkInAssignment_5_3_1.eContents().get(0);
		private final RuleCall cWorkInSchoolEStringParserRuleCall_5_3_1_0_1 = (RuleCall)cWorkInSchoolCrossReference_5_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTeachKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cTeachAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cTeachStudentCrossReference_6_2_0 = (CrossReference)cTeachAssignment_6_2.eContents().get(0);
		private final RuleCall cTeachStudentEStringParserRuleCall_6_2_0_1 = (RuleCall)cTeachStudentCrossReference_6_2_0.eContents().get(1);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cTeachAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final CrossReference cTeachStudentCrossReference_6_3_1_0 = (CrossReference)cTeachAssignment_6_3_1.eContents().get(0);
		private final RuleCall cTeachStudentEStringParserRuleCall_6_3_1_0_1 = (RuleCall)cTeachStudentCrossReference_6_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Teacher returns Teacher:
		//    {Teacher}
		//    'Teacher'
		//    name=EString
		//    '{'
		//        ('id' id=EString)?
		//        ('workIn' '(' workIn+=[School|EString] ( "," workIn+=[School|EString])* ')' )?
		//        ('teach' '(' teach+=[Student|EString] ( "," teach+=[Student|EString])* ')' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Teacher}
		//'Teacher'
		//name=EString
		//'{'
		//    ('id' id=EString)?
		//    ('workIn' '(' workIn+=[School|EString] ( "," workIn+=[School|EString])* ')' )?
		//    ('teach' '(' teach+=[Student|EString] ( "," teach+=[Student|EString])* ')' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Teacher}
		public Action getTeacherAction_0() { return cTeacherAction_0; }
		
		//'Teacher'
		public Keyword getTeacherKeyword_1() { return cTeacherKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('id' id=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'id'
		public Keyword getIdKeyword_4_0() { return cIdKeyword_4_0; }
		
		//id=EString
		public Assignment getIdAssignment_4_1() { return cIdAssignment_4_1; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_4_1_0() { return cIdEStringParserRuleCall_4_1_0; }
		
		//('workIn' '(' workIn+=[School|EString] ( "," workIn+=[School|EString])* ')' )?
		public Group getGroup_5() { return cGroup_5; }
		
		//'workIn'
		public Keyword getWorkInKeyword_5_0() { return cWorkInKeyword_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//workIn+=[School|EString]
		public Assignment getWorkInAssignment_5_2() { return cWorkInAssignment_5_2; }
		
		//[School|EString]
		public CrossReference getWorkInSchoolCrossReference_5_2_0() { return cWorkInSchoolCrossReference_5_2_0; }
		
		//EString
		public RuleCall getWorkInSchoolEStringParserRuleCall_5_2_0_1() { return cWorkInSchoolEStringParserRuleCall_5_2_0_1; }
		
		//( "," workIn+=[School|EString])*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//workIn+=[School|EString]
		public Assignment getWorkInAssignment_5_3_1() { return cWorkInAssignment_5_3_1; }
		
		//[School|EString]
		public CrossReference getWorkInSchoolCrossReference_5_3_1_0() { return cWorkInSchoolCrossReference_5_3_1_0; }
		
		//EString
		public RuleCall getWorkInSchoolEStringParserRuleCall_5_3_1_0_1() { return cWorkInSchoolEStringParserRuleCall_5_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_4() { return cRightParenthesisKeyword_5_4; }
		
		//('teach' '(' teach+=[Student|EString] ( "," teach+=[Student|EString])* ')' )?
		public Group getGroup_6() { return cGroup_6; }
		
		//'teach'
		public Keyword getTeachKeyword_6_0() { return cTeachKeyword_6_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_1() { return cLeftParenthesisKeyword_6_1; }
		
		//teach+=[Student|EString]
		public Assignment getTeachAssignment_6_2() { return cTeachAssignment_6_2; }
		
		//[Student|EString]
		public CrossReference getTeachStudentCrossReference_6_2_0() { return cTeachStudentCrossReference_6_2_0; }
		
		//EString
		public RuleCall getTeachStudentEStringParserRuleCall_6_2_0_1() { return cTeachStudentEStringParserRuleCall_6_2_0_1; }
		
		//( "," teach+=[Student|EString])*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//teach+=[Student|EString]
		public Assignment getTeachAssignment_6_3_1() { return cTeachAssignment_6_3_1; }
		
		//[Student|EString]
		public CrossReference getTeachStudentCrossReference_6_3_1_0() { return cTeachStudentCrossReference_6_3_1_0; }
		
		//EString
		public RuleCall getTeachStudentEStringParserRuleCall_6_3_1_0_1() { return cTeachStudentEStringParserRuleCall_6_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_4() { return cRightParenthesisKeyword_6_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class StudentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rm2pt.expt2.university.Dsl.Student");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStudentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIdKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIdAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cIdEStringParserRuleCall_3_1_0 = (RuleCall)cIdAssignment_3_1.eContents().get(0);
		private final Keyword cStudyInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cStudyInAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cStudyInSchoolCrossReference_5_0 = (CrossReference)cStudyInAssignment_5.eContents().get(0);
		private final RuleCall cStudyInSchoolEStringParserRuleCall_5_0_1 = (RuleCall)cStudyInSchoolCrossReference_5_0.eContents().get(1);
		private final Keyword cFollowKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFollowAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cFollowTeacherCrossReference_8_0 = (CrossReference)cFollowAssignment_8.eContents().get(0);
		private final RuleCall cFollowTeacherEStringParserRuleCall_8_0_1 = (RuleCall)cFollowTeacherCrossReference_8_0.eContents().get(1);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cCommaKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cFollowAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cFollowTeacherCrossReference_9_1_0 = (CrossReference)cFollowAssignment_9_1.eContents().get(0);
		private final RuleCall cFollowTeacherEStringParserRuleCall_9_1_0_1 = (RuleCall)cFollowTeacherCrossReference_9_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Student returns Student:
		//    'Student'
		//    name=EString
		//    '{'
		//        ('id' id=EString)?
		//        'studyIn' studyIn=[School|EString]
		//        'follow' '(' follow+=[Teacher|EString] ( "," follow+=[Teacher|EString])* ')'
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Student'
		//name=EString
		//'{'
		//    ('id' id=EString)?
		//    'studyIn' studyIn=[School|EString]
		//    'follow' '(' follow+=[Teacher|EString] ( "," follow+=[Teacher|EString])* ')'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Student'
		public Keyword getStudentKeyword_0() { return cStudentKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('id' id=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'id'
		public Keyword getIdKeyword_3_0() { return cIdKeyword_3_0; }
		
		//id=EString
		public Assignment getIdAssignment_3_1() { return cIdAssignment_3_1; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_3_1_0() { return cIdEStringParserRuleCall_3_1_0; }
		
		//'studyIn'
		public Keyword getStudyInKeyword_4() { return cStudyInKeyword_4; }
		
		//studyIn=[School|EString]
		public Assignment getStudyInAssignment_5() { return cStudyInAssignment_5; }
		
		//[School|EString]
		public CrossReference getStudyInSchoolCrossReference_5_0() { return cStudyInSchoolCrossReference_5_0; }
		
		//EString
		public RuleCall getStudyInSchoolEStringParserRuleCall_5_0_1() { return cStudyInSchoolEStringParserRuleCall_5_0_1; }
		
		//'follow'
		public Keyword getFollowKeyword_6() { return cFollowKeyword_6; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_7() { return cLeftParenthesisKeyword_7; }
		
		//follow+=[Teacher|EString]
		public Assignment getFollowAssignment_8() { return cFollowAssignment_8; }
		
		//[Teacher|EString]
		public CrossReference getFollowTeacherCrossReference_8_0() { return cFollowTeacherCrossReference_8_0; }
		
		//EString
		public RuleCall getFollowTeacherEStringParserRuleCall_8_0_1() { return cFollowTeacherEStringParserRuleCall_8_0_1; }
		
		//( "," follow+=[Teacher|EString])*
		public Group getGroup_9() { return cGroup_9; }
		
		//","
		public Keyword getCommaKeyword_9_0() { return cCommaKeyword_9_0; }
		
		//follow+=[Teacher|EString]
		public Assignment getFollowAssignment_9_1() { return cFollowAssignment_9_1; }
		
		//[Teacher|EString]
		public CrossReference getFollowTeacherCrossReference_9_1_0() { return cFollowTeacherCrossReference_9_1_0; }
		
		//EString
		public RuleCall getFollowTeacherEStringParserRuleCall_9_1_0_1() { return cFollowTeacherEStringParserRuleCall_9_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	
	
	private final UniversityElements pUniversity;
	private final PersonElements pPerson;
	private final SchoolElements pSchool;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final TeacherElements pTeacher;
	private final StudentElements pStudent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pUniversity = new UniversityElements();
		this.pPerson = new PersonElements();
		this.pSchool = new SchoolElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pTeacher = new TeacherElements();
		this.pStudent = new StudentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.rm2pt.expt2.university.Dsl".equals(grammar.getName())) {
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

	
	//University returns University:
	//    {University}
	//    'University'
	//    name=EString
	//    '{'
	//        ('contain' '{' contain+=School ( "," contain+=School)* '}' )?
	//    '}';
	public UniversityElements getUniversityAccess() {
		return pUniversity;
	}
	
	public ParserRule getUniversityRule() {
		return getUniversityAccess().getRule();
	}
	
	//Person returns Person:
	//    Teacher | Student;
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//School returns School:
	//    {School}
	//    'School'
	//    name=EString
	//    '{'
	//        ('sid' sid=EInt)?
	//        ('containPerson' '{' containPerson+=Person ( "," containPerson+=Person)* '}' )?
	//    '}';
	public SchoolElements getSchoolAccess() {
		return pSchool;
	}
	
	public ParserRule getSchoolRule() {
		return getSchoolAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//Teacher returns Teacher:
	//    {Teacher}
	//    'Teacher'
	//    name=EString
	//    '{'
	//        ('id' id=EString)?
	//        ('workIn' '(' workIn+=[School|EString] ( "," workIn+=[School|EString])* ')' )?
	//        ('teach' '(' teach+=[Student|EString] ( "," teach+=[Student|EString])* ')' )?
	//    '}';
	public TeacherElements getTeacherAccess() {
		return pTeacher;
	}
	
	public ParserRule getTeacherRule() {
		return getTeacherAccess().getRule();
	}
	
	//Student returns Student:
	//    'Student'
	//    name=EString
	//    '{'
	//        ('id' id=EString)?
	//        'studyIn' studyIn=[School|EString]
	//        'follow' '(' follow+=[Teacher|EString] ( "," follow+=[Teacher|EString])* ')'
	//    '}';
	public StudentElements getStudentAccess() {
		return pStudent;
	}
	
	public ParserRule getStudentRule() {
		return getStudentAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}