package org.rm2pt.expt2.university.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.rm2pt.expt2.university.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'University'", "'{'", "'contain'", "','", "'}'", "'School'", "'sid'", "'containPerson'", "'-'", "'Teacher'", "'id'", "'workIn'", "'('", "')'", "'teach'", "'Student'", "'studyIn'", "'follow'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "University";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUniversity"
    // InternalDsl.g:64:1: entryRuleUniversity returns [EObject current=null] : iv_ruleUniversity= ruleUniversity EOF ;
    public final EObject entryRuleUniversity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversity = null;


        try {
            // InternalDsl.g:64:51: (iv_ruleUniversity= ruleUniversity EOF )
            // InternalDsl.g:65:2: iv_ruleUniversity= ruleUniversity EOF
            {
             newCompositeNode(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversity=ruleUniversity();

            state._fsp--;

             current =iv_ruleUniversity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalDsl.g:71:1: ruleUniversity returns [EObject current=null] : ( () otherlv_1= 'University' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleUniversity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_contain_6_0 = null;

        EObject lv_contain_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'University' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'University' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'University' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'University' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUniversityAccess().getUniversityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUniversityAccess().getUniversityKeyword_1());
            		
            // InternalDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.expt2.university.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:113:3: (otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:114:4: otherlv_4= 'contain' otherlv_5= '{' ( (lv_contain_6_0= ruleSchool ) ) (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getUniversityAccess().getContainKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:122:4: ( (lv_contain_6_0= ruleSchool ) )
                    // InternalDsl.g:123:5: (lv_contain_6_0= ruleSchool )
                    {
                    // InternalDsl.g:123:5: (lv_contain_6_0= ruleSchool )
                    // InternalDsl.g:124:6: lv_contain_6_0= ruleSchool
                    {

                    						newCompositeNode(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_contain_6_0=ruleSchool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUniversityRule());
                    						}
                    						add(
                    							current,
                    							"contain",
                    							lv_contain_6_0,
                    							"org.rm2pt.expt2.university.Dsl.School");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:141:4: (otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:142:5: otherlv_7= ',' ( (lv_contain_8_0= ruleSchool ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUniversityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:146:5: ( (lv_contain_8_0= ruleSchool ) )
                    	    // InternalDsl.g:147:6: (lv_contain_8_0= ruleSchool )
                    	    {
                    	    // InternalDsl.g:147:6: (lv_contain_8_0= ruleSchool )
                    	    // InternalDsl.g:148:7: lv_contain_8_0= ruleSchool
                    	    {

                    	    							newCompositeNode(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_contain_8_0=ruleSchool();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUniversityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contain",
                    	    								lv_contain_8_0,
                    	    								"org.rm2pt.expt2.university.Dsl.School");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:179:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:179:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:180:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:186:1: rulePerson returns [EObject current=null] : (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Teacher_0 = null;

        EObject this_Student_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:192:2: ( (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent ) )
            // InternalDsl.g:193:2: (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent )
            {
            // InternalDsl.g:193:2: (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:194:3: this_Teacher_0= ruleTeacher
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teacher_0=ruleTeacher();

                    state._fsp--;


                    			current = this_Teacher_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:203:3: this_Student_1= ruleStudent
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getStudentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Student_1=ruleStudent();

                    state._fsp--;


                    			current = this_Student_1;
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleSchool"
    // InternalDsl.g:215:1: entryRuleSchool returns [EObject current=null] : iv_ruleSchool= ruleSchool EOF ;
    public final EObject entryRuleSchool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchool = null;


        try {
            // InternalDsl.g:215:47: (iv_ruleSchool= ruleSchool EOF )
            // InternalDsl.g:216:2: iv_ruleSchool= ruleSchool EOF
            {
             newCompositeNode(grammarAccess.getSchoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchool=ruleSchool();

            state._fsp--;

             current =iv_ruleSchool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // InternalDsl.g:222:1: ruleSchool returns [EObject current=null] : ( () otherlv_1= 'School' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )? (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleSchool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_sid_5_0 = null;

        EObject lv_containPerson_8_0 = null;

        EObject lv_containPerson_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:228:2: ( ( () otherlv_1= 'School' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )? (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalDsl.g:229:2: ( () otherlv_1= 'School' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )? (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalDsl.g:229:2: ( () otherlv_1= 'School' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )? (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalDsl.g:230:3: () otherlv_1= 'School' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )? (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalDsl.g:230:3: ()
            // InternalDsl.g:231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchoolAccess().getSchoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSchoolAccess().getSchoolKeyword_1());
            		
            // InternalDsl.g:241:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:242:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:242:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:243:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchoolRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.expt2.university.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:264:3: (otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:265:4: otherlv_4= 'sid' ( (lv_sid_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSchoolAccess().getSidKeyword_4_0());
                    			
                    // InternalDsl.g:269:4: ( (lv_sid_5_0= ruleEInt ) )
                    // InternalDsl.g:270:5: (lv_sid_5_0= ruleEInt )
                    {
                    // InternalDsl.g:270:5: (lv_sid_5_0= ruleEInt )
                    // InternalDsl.g:271:6: lv_sid_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSchoolAccess().getSidEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_sid_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchoolRule());
                    						}
                    						set(
                    							current,
                    							"sid",
                    							lv_sid_5_0,
                    							"org.rm2pt.expt2.university.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:289:3: (otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:290:4: otherlv_6= 'containPerson' otherlv_7= '{' ( (lv_containPerson_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSchoolAccess().getContainPersonKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:298:4: ( (lv_containPerson_8_0= rulePerson ) )
                    // InternalDsl.g:299:5: (lv_containPerson_8_0= rulePerson )
                    {
                    // InternalDsl.g:299:5: (lv_containPerson_8_0= rulePerson )
                    // InternalDsl.g:300:6: lv_containPerson_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containPerson_8_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchoolRule());
                    						}
                    						add(
                    							current,
                    							"containPerson",
                    							lv_containPerson_8_0,
                    							"org.rm2pt.expt2.university.Dsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:317:4: (otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:318:5: otherlv_9= ',' ( (lv_containPerson_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:322:5: ( (lv_containPerson_10_0= rulePerson ) )
                    	    // InternalDsl.g:323:6: (lv_containPerson_10_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:323:6: (lv_containPerson_10_0= rulePerson )
                    	    // InternalDsl.g:324:7: lv_containPerson_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containPerson_10_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containPerson",
                    	    								lv_containPerson_10_0,
                    	    								"org.rm2pt.expt2.university.Dsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:355:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:355:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:356:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:362:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:368:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:369:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:369:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:370:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:378:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:389:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:389:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:390:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:396:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:402:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:403:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:403:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:404:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:404:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:405:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:422:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalDsl.g:422:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalDsl.g:423:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:429:1: ruleTeacher returns [EObject current=null] : ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:435:2: ( ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalDsl.g:436:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalDsl.g:436:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalDsl.g:437:3: () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalDsl.g:437:3: ()
            // InternalDsl.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTeacherAccess().getTeacherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTeacherAccess().getTeacherKeyword_1());
            		
            // InternalDsl.g:448:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:449:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:449:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:450:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeacherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.expt2.university.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:471:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:472:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTeacherAccess().getIdKeyword_4_0());
                    			
                    // InternalDsl.g:476:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalDsl.g:477:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalDsl.g:477:5: (lv_id_5_0= ruleEString )
                    // InternalDsl.g:478:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeacherRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.rm2pt.expt2.university.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:496:3: (otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:497:4: otherlv_6= 'workIn' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTeacherAccess().getWorkInKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:505:4: ( ( ruleEString ) )
                    // InternalDsl.g:506:5: ( ruleEString )
                    {
                    // InternalDsl.g:506:5: ( ruleEString )
                    // InternalDsl.g:507:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:521:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:522:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTeacherAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:526:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:527:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:527:6: ( ruleEString )
                    	    // InternalDsl.g:528:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeacherRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:548:3: (otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:549:4: otherlv_12= 'teach' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getTeacherAccess().getTeachKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDsl.g:557:4: ( ( ruleEString ) )
                    // InternalDsl.g:558:5: ( ruleEString )
                    {
                    // InternalDsl.g:558:5: ( ruleEString )
                    // InternalDsl.g:559:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:573:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:574:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTeacherAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:578:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:579:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:579:6: ( ruleEString )
                    	    // InternalDsl.g:580:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeacherRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:608:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalDsl.g:608:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalDsl.g:609:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:615:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= 'studyIn' ( ( ruleEString ) ) otherlv_7= 'follow' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:621:2: ( (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= 'studyIn' ( ( ruleEString ) ) otherlv_7= 'follow' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalDsl.g:622:2: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= 'studyIn' ( ( ruleEString ) ) otherlv_7= 'follow' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalDsl.g:622:2: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= 'studyIn' ( ( ruleEString ) ) otherlv_7= 'follow' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalDsl.g:623:3: otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= 'studyIn' ( ( ruleEString ) ) otherlv_7= 'follow' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalDsl.g:627:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:628:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:628:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:629:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStudentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.rm2pt.expt2.university.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:650:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:651:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getIdKeyword_3_0());
                    			
                    // InternalDsl.g:655:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalDsl.g:656:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalDsl.g:656:5: (lv_id_4_0= ruleEString )
                    // InternalDsl.g:657:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStudentRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.rm2pt.expt2.university.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getStudyInKeyword_4());
            		
            // InternalDsl.g:679:3: ( ( ruleEString ) )
            // InternalDsl.g:680:4: ( ruleEString )
            {
            // InternalDsl.g:680:4: ( ruleEString )
            // InternalDsl.g:681:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStudentAccess().getStudyInSchoolCrossReference_5_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getFollowKeyword_6());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_7());
            		
            // InternalDsl.g:703:3: ( ( ruleEString ) )
            // InternalDsl.g:704:4: ( ruleEString )
            {
            // InternalDsl.g:704:4: ( ruleEString )
            // InternalDsl.g:705:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_8_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:719:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:720:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalDsl.g:724:4: ( ( ruleEString ) )
            	    // InternalDsl.g:725:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:725:5: ( ruleEString )
            	    // InternalDsl.g:726:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStudentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getStudentAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleStudent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002608000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}