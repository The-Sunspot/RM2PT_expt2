package org.rm2pt.expt2.university.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.rm2pt.expt2.university.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'University'", "'{'", "'}'", "'contain'", "','", "'School'", "'sid'", "'containPerson'", "'-'", "'Teacher'", "'id'", "'workIn'", "'('", "')'", "'teach'", "'Student'", "'studyIn'", "'follow'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUniversity"
    // InternalDsl.g:53:1: entryRuleUniversity : ruleUniversity EOF ;
    public final void entryRuleUniversity() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleUniversity EOF )
            // InternalDsl.g:55:1: ruleUniversity EOF
            {
             before(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            ruleUniversity();

            state._fsp--;

             after(grammarAccess.getUniversityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalDsl.g:62:1: ruleUniversity : ( ( rule__University__Group__0 ) ) ;
    public final void ruleUniversity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__University__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__University__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__University__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__University__Group__0 )
            {
             before(grammarAccess.getUniversityAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__University__Group__0 )
            // InternalDsl.g:69:4: rule__University__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getGroup()); 

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
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePerson EOF )
            // InternalDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:87:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Person__Alternatives )
            // InternalDsl.g:94:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleSchool"
    // InternalDsl.g:103:1: entryRuleSchool : ruleSchool EOF ;
    public final void entryRuleSchool() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSchool EOF )
            // InternalDsl.g:105:1: ruleSchool EOF
            {
             before(grammarAccess.getSchoolRule()); 
            pushFollow(FOLLOW_1);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getSchoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // InternalDsl.g:112:1: ruleSchool : ( ( rule__School__Group__0 ) ) ;
    public final void ruleSchool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__School__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__School__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__School__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__School__Group__0 )
            {
             before(grammarAccess.getSchoolAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__School__Group__0 )
            // InternalDsl.g:119:4: rule__School__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__School__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getGroup()); 

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
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleEString EOF )
            // InternalDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleEInt EOF )
            // InternalDsl.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:178:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleTeacher EOF )
            // InternalDsl.g:180:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:187:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Teacher__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Teacher__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Teacher__Group__0 )
            // InternalDsl.g:194:4: rule__Teacher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

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
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:203:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleStudent EOF )
            // InternalDsl.g:205:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:212:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Student__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Student__Group__0 )
            // InternalDsl.g:219:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalDsl.g:227:1: rule__Person__Alternatives : ( ( ruleTeacher ) | ( ruleStudent ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:231:1: ( ( ruleTeacher ) | ( ruleStudent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:232:2: ( ruleTeacher )
                    {
                    // InternalDsl.g:232:2: ( ruleTeacher )
                    // InternalDsl.g:233:3: ruleTeacher
                    {
                     before(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacher();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:238:2: ( ruleStudent )
                    {
                    // InternalDsl.g:238:2: ( ruleStudent )
                    // InternalDsl.g:239:3: ruleStudent
                    {
                     before(grammarAccess.getPersonAccess().getStudentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStudent();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getStudentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:248:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:252:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:253:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:253:2: ( RULE_STRING )
                    // InternalDsl.g:254:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:259:2: ( RULE_ID )
                    {
                    // InternalDsl.g:259:2: ( RULE_ID )
                    // InternalDsl.g:260:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__University__Group__0"
    // InternalDsl.g:269:1: rule__University__Group__0 : rule__University__Group__0__Impl rule__University__Group__1 ;
    public final void rule__University__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:273:1: ( rule__University__Group__0__Impl rule__University__Group__1 )
            // InternalDsl.g:274:2: rule__University__Group__0__Impl rule__University__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__University__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__1();

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
    // $ANTLR end "rule__University__Group__0"


    // $ANTLR start "rule__University__Group__0__Impl"
    // InternalDsl.g:281:1: rule__University__Group__0__Impl : ( () ) ;
    public final void rule__University__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:285:1: ( ( () ) )
            // InternalDsl.g:286:1: ( () )
            {
            // InternalDsl.g:286:1: ( () )
            // InternalDsl.g:287:2: ()
            {
             before(grammarAccess.getUniversityAccess().getUniversityAction_0()); 
            // InternalDsl.g:288:2: ()
            // InternalDsl.g:288:3: 
            {
            }

             after(grammarAccess.getUniversityAccess().getUniversityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__0__Impl"


    // $ANTLR start "rule__University__Group__1"
    // InternalDsl.g:296:1: rule__University__Group__1 : rule__University__Group__1__Impl rule__University__Group__2 ;
    public final void rule__University__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:300:1: ( rule__University__Group__1__Impl rule__University__Group__2 )
            // InternalDsl.g:301:2: rule__University__Group__1__Impl rule__University__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__2();

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
    // $ANTLR end "rule__University__Group__1"


    // $ANTLR start "rule__University__Group__1__Impl"
    // InternalDsl.g:308:1: rule__University__Group__1__Impl : ( 'University' ) ;
    public final void rule__University__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:312:1: ( ( 'University' ) )
            // InternalDsl.g:313:1: ( 'University' )
            {
            // InternalDsl.g:313:1: ( 'University' )
            // InternalDsl.g:314:2: 'University'
            {
             before(grammarAccess.getUniversityAccess().getUniversityKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getUniversityKeyword_1()); 

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
    // $ANTLR end "rule__University__Group__1__Impl"


    // $ANTLR start "rule__University__Group__2"
    // InternalDsl.g:323:1: rule__University__Group__2 : rule__University__Group__2__Impl rule__University__Group__3 ;
    public final void rule__University__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:327:1: ( rule__University__Group__2__Impl rule__University__Group__3 )
            // InternalDsl.g:328:2: rule__University__Group__2__Impl rule__University__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__University__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__3();

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
    // $ANTLR end "rule__University__Group__2"


    // $ANTLR start "rule__University__Group__2__Impl"
    // InternalDsl.g:335:1: rule__University__Group__2__Impl : ( ( rule__University__NameAssignment_2 ) ) ;
    public final void rule__University__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:339:1: ( ( ( rule__University__NameAssignment_2 ) ) )
            // InternalDsl.g:340:1: ( ( rule__University__NameAssignment_2 ) )
            {
            // InternalDsl.g:340:1: ( ( rule__University__NameAssignment_2 ) )
            // InternalDsl.g:341:2: ( rule__University__NameAssignment_2 )
            {
             before(grammarAccess.getUniversityAccess().getNameAssignment_2()); 
            // InternalDsl.g:342:2: ( rule__University__NameAssignment_2 )
            // InternalDsl.g:342:3: rule__University__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__University__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__University__Group__2__Impl"


    // $ANTLR start "rule__University__Group__3"
    // InternalDsl.g:350:1: rule__University__Group__3 : rule__University__Group__3__Impl rule__University__Group__4 ;
    public final void rule__University__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:354:1: ( rule__University__Group__3__Impl rule__University__Group__4 )
            // InternalDsl.g:355:2: rule__University__Group__3__Impl rule__University__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__University__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__4();

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
    // $ANTLR end "rule__University__Group__3"


    // $ANTLR start "rule__University__Group__3__Impl"
    // InternalDsl.g:362:1: rule__University__Group__3__Impl : ( '{' ) ;
    public final void rule__University__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:1: ( ( '{' ) )
            // InternalDsl.g:367:1: ( '{' )
            {
            // InternalDsl.g:367:1: ( '{' )
            // InternalDsl.g:368:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__University__Group__3__Impl"


    // $ANTLR start "rule__University__Group__4"
    // InternalDsl.g:377:1: rule__University__Group__4 : rule__University__Group__4__Impl rule__University__Group__5 ;
    public final void rule__University__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:1: ( rule__University__Group__4__Impl rule__University__Group__5 )
            // InternalDsl.g:382:2: rule__University__Group__4__Impl rule__University__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__University__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__5();

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
    // $ANTLR end "rule__University__Group__4"


    // $ANTLR start "rule__University__Group__4__Impl"
    // InternalDsl.g:389:1: rule__University__Group__4__Impl : ( ( rule__University__Group_4__0 )? ) ;
    public final void rule__University__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:393:1: ( ( ( rule__University__Group_4__0 )? ) )
            // InternalDsl.g:394:1: ( ( rule__University__Group_4__0 )? )
            {
            // InternalDsl.g:394:1: ( ( rule__University__Group_4__0 )? )
            // InternalDsl.g:395:2: ( rule__University__Group_4__0 )?
            {
             before(grammarAccess.getUniversityAccess().getGroup_4()); 
            // InternalDsl.g:396:2: ( rule__University__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:396:3: rule__University__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__University__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniversityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__University__Group__4__Impl"


    // $ANTLR start "rule__University__Group__5"
    // InternalDsl.g:404:1: rule__University__Group__5 : rule__University__Group__5__Impl ;
    public final void rule__University__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:408:1: ( rule__University__Group__5__Impl )
            // InternalDsl.g:409:2: rule__University__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__5__Impl();

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
    // $ANTLR end "rule__University__Group__5"


    // $ANTLR start "rule__University__Group__5__Impl"
    // InternalDsl.g:415:1: rule__University__Group__5__Impl : ( '}' ) ;
    public final void rule__University__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:419:1: ( ( '}' ) )
            // InternalDsl.g:420:1: ( '}' )
            {
            // InternalDsl.g:420:1: ( '}' )
            // InternalDsl.g:421:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__University__Group__5__Impl"


    // $ANTLR start "rule__University__Group_4__0"
    // InternalDsl.g:431:1: rule__University__Group_4__0 : rule__University__Group_4__0__Impl rule__University__Group_4__1 ;
    public final void rule__University__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( rule__University__Group_4__0__Impl rule__University__Group_4__1 )
            // InternalDsl.g:436:2: rule__University__Group_4__0__Impl rule__University__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__University__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_4__1();

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
    // $ANTLR end "rule__University__Group_4__0"


    // $ANTLR start "rule__University__Group_4__0__Impl"
    // InternalDsl.g:443:1: rule__University__Group_4__0__Impl : ( 'contain' ) ;
    public final void rule__University__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:447:1: ( ( 'contain' ) )
            // InternalDsl.g:448:1: ( 'contain' )
            {
            // InternalDsl.g:448:1: ( 'contain' )
            // InternalDsl.g:449:2: 'contain'
            {
             before(grammarAccess.getUniversityAccess().getContainKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getContainKeyword_4_0()); 

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
    // $ANTLR end "rule__University__Group_4__0__Impl"


    // $ANTLR start "rule__University__Group_4__1"
    // InternalDsl.g:458:1: rule__University__Group_4__1 : rule__University__Group_4__1__Impl rule__University__Group_4__2 ;
    public final void rule__University__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:462:1: ( rule__University__Group_4__1__Impl rule__University__Group_4__2 )
            // InternalDsl.g:463:2: rule__University__Group_4__1__Impl rule__University__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__University__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_4__2();

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
    // $ANTLR end "rule__University__Group_4__1"


    // $ANTLR start "rule__University__Group_4__1__Impl"
    // InternalDsl.g:470:1: rule__University__Group_4__1__Impl : ( '{' ) ;
    public final void rule__University__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:474:1: ( ( '{' ) )
            // InternalDsl.g:475:1: ( '{' )
            {
            // InternalDsl.g:475:1: ( '{' )
            // InternalDsl.g:476:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__University__Group_4__1__Impl"


    // $ANTLR start "rule__University__Group_4__2"
    // InternalDsl.g:485:1: rule__University__Group_4__2 : rule__University__Group_4__2__Impl rule__University__Group_4__3 ;
    public final void rule__University__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:489:1: ( rule__University__Group_4__2__Impl rule__University__Group_4__3 )
            // InternalDsl.g:490:2: rule__University__Group_4__2__Impl rule__University__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__University__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_4__3();

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
    // $ANTLR end "rule__University__Group_4__2"


    // $ANTLR start "rule__University__Group_4__2__Impl"
    // InternalDsl.g:497:1: rule__University__Group_4__2__Impl : ( ( rule__University__ContainAssignment_4_2 ) ) ;
    public final void rule__University__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:501:1: ( ( ( rule__University__ContainAssignment_4_2 ) ) )
            // InternalDsl.g:502:1: ( ( rule__University__ContainAssignment_4_2 ) )
            {
            // InternalDsl.g:502:1: ( ( rule__University__ContainAssignment_4_2 ) )
            // InternalDsl.g:503:2: ( rule__University__ContainAssignment_4_2 )
            {
             before(grammarAccess.getUniversityAccess().getContainAssignment_4_2()); 
            // InternalDsl.g:504:2: ( rule__University__ContainAssignment_4_2 )
            // InternalDsl.g:504:3: rule__University__ContainAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__University__ContainAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getContainAssignment_4_2()); 

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
    // $ANTLR end "rule__University__Group_4__2__Impl"


    // $ANTLR start "rule__University__Group_4__3"
    // InternalDsl.g:512:1: rule__University__Group_4__3 : rule__University__Group_4__3__Impl rule__University__Group_4__4 ;
    public final void rule__University__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:1: ( rule__University__Group_4__3__Impl rule__University__Group_4__4 )
            // InternalDsl.g:517:2: rule__University__Group_4__3__Impl rule__University__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__University__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_4__4();

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
    // $ANTLR end "rule__University__Group_4__3"


    // $ANTLR start "rule__University__Group_4__3__Impl"
    // InternalDsl.g:524:1: rule__University__Group_4__3__Impl : ( ( rule__University__Group_4_3__0 )* ) ;
    public final void rule__University__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:528:1: ( ( ( rule__University__Group_4_3__0 )* ) )
            // InternalDsl.g:529:1: ( ( rule__University__Group_4_3__0 )* )
            {
            // InternalDsl.g:529:1: ( ( rule__University__Group_4_3__0 )* )
            // InternalDsl.g:530:2: ( rule__University__Group_4_3__0 )*
            {
             before(grammarAccess.getUniversityAccess().getGroup_4_3()); 
            // InternalDsl.g:531:2: ( rule__University__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:531:3: rule__University__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__University__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUniversityAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__University__Group_4__3__Impl"


    // $ANTLR start "rule__University__Group_4__4"
    // InternalDsl.g:539:1: rule__University__Group_4__4 : rule__University__Group_4__4__Impl ;
    public final void rule__University__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:543:1: ( rule__University__Group_4__4__Impl )
            // InternalDsl.g:544:2: rule__University__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_4__4__Impl();

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
    // $ANTLR end "rule__University__Group_4__4"


    // $ANTLR start "rule__University__Group_4__4__Impl"
    // InternalDsl.g:550:1: rule__University__Group_4__4__Impl : ( '}' ) ;
    public final void rule__University__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:554:1: ( ( '}' ) )
            // InternalDsl.g:555:1: ( '}' )
            {
            // InternalDsl.g:555:1: ( '}' )
            // InternalDsl.g:556:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__University__Group_4__4__Impl"


    // $ANTLR start "rule__University__Group_4_3__0"
    // InternalDsl.g:566:1: rule__University__Group_4_3__0 : rule__University__Group_4_3__0__Impl rule__University__Group_4_3__1 ;
    public final void rule__University__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:570:1: ( rule__University__Group_4_3__0__Impl rule__University__Group_4_3__1 )
            // InternalDsl.g:571:2: rule__University__Group_4_3__0__Impl rule__University__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__University__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_4_3__1();

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
    // $ANTLR end "rule__University__Group_4_3__0"


    // $ANTLR start "rule__University__Group_4_3__0__Impl"
    // InternalDsl.g:578:1: rule__University__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__University__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:582:1: ( ( ',' ) )
            // InternalDsl.g:583:1: ( ',' )
            {
            // InternalDsl.g:583:1: ( ',' )
            // InternalDsl.g:584:2: ','
            {
             before(grammarAccess.getUniversityAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__University__Group_4_3__0__Impl"


    // $ANTLR start "rule__University__Group_4_3__1"
    // InternalDsl.g:593:1: rule__University__Group_4_3__1 : rule__University__Group_4_3__1__Impl ;
    public final void rule__University__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:597:1: ( rule__University__Group_4_3__1__Impl )
            // InternalDsl.g:598:2: rule__University__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__University__Group_4_3__1"


    // $ANTLR start "rule__University__Group_4_3__1__Impl"
    // InternalDsl.g:604:1: rule__University__Group_4_3__1__Impl : ( ( rule__University__ContainAssignment_4_3_1 ) ) ;
    public final void rule__University__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:608:1: ( ( ( rule__University__ContainAssignment_4_3_1 ) ) )
            // InternalDsl.g:609:1: ( ( rule__University__ContainAssignment_4_3_1 ) )
            {
            // InternalDsl.g:609:1: ( ( rule__University__ContainAssignment_4_3_1 ) )
            // InternalDsl.g:610:2: ( rule__University__ContainAssignment_4_3_1 )
            {
             before(grammarAccess.getUniversityAccess().getContainAssignment_4_3_1()); 
            // InternalDsl.g:611:2: ( rule__University__ContainAssignment_4_3_1 )
            // InternalDsl.g:611:3: rule__University__ContainAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__University__ContainAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getContainAssignment_4_3_1()); 

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
    // $ANTLR end "rule__University__Group_4_3__1__Impl"


    // $ANTLR start "rule__School__Group__0"
    // InternalDsl.g:620:1: rule__School__Group__0 : rule__School__Group__0__Impl rule__School__Group__1 ;
    public final void rule__School__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( rule__School__Group__0__Impl rule__School__Group__1 )
            // InternalDsl.g:625:2: rule__School__Group__0__Impl rule__School__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__School__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__1();

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
    // $ANTLR end "rule__School__Group__0"


    // $ANTLR start "rule__School__Group__0__Impl"
    // InternalDsl.g:632:1: rule__School__Group__0__Impl : ( () ) ;
    public final void rule__School__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:636:1: ( ( () ) )
            // InternalDsl.g:637:1: ( () )
            {
            // InternalDsl.g:637:1: ( () )
            // InternalDsl.g:638:2: ()
            {
             before(grammarAccess.getSchoolAccess().getSchoolAction_0()); 
            // InternalDsl.g:639:2: ()
            // InternalDsl.g:639:3: 
            {
            }

             after(grammarAccess.getSchoolAccess().getSchoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__0__Impl"


    // $ANTLR start "rule__School__Group__1"
    // InternalDsl.g:647:1: rule__School__Group__1 : rule__School__Group__1__Impl rule__School__Group__2 ;
    public final void rule__School__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:651:1: ( rule__School__Group__1__Impl rule__School__Group__2 )
            // InternalDsl.g:652:2: rule__School__Group__1__Impl rule__School__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__School__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__2();

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
    // $ANTLR end "rule__School__Group__1"


    // $ANTLR start "rule__School__Group__1__Impl"
    // InternalDsl.g:659:1: rule__School__Group__1__Impl : ( 'School' ) ;
    public final void rule__School__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:663:1: ( ( 'School' ) )
            // InternalDsl.g:664:1: ( 'School' )
            {
            // InternalDsl.g:664:1: ( 'School' )
            // InternalDsl.g:665:2: 'School'
            {
             before(grammarAccess.getSchoolAccess().getSchoolKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getSchoolKeyword_1()); 

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
    // $ANTLR end "rule__School__Group__1__Impl"


    // $ANTLR start "rule__School__Group__2"
    // InternalDsl.g:674:1: rule__School__Group__2 : rule__School__Group__2__Impl rule__School__Group__3 ;
    public final void rule__School__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( rule__School__Group__2__Impl rule__School__Group__3 )
            // InternalDsl.g:679:2: rule__School__Group__2__Impl rule__School__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__School__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__3();

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
    // $ANTLR end "rule__School__Group__2"


    // $ANTLR start "rule__School__Group__2__Impl"
    // InternalDsl.g:686:1: rule__School__Group__2__Impl : ( ( rule__School__NameAssignment_2 ) ) ;
    public final void rule__School__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:690:1: ( ( ( rule__School__NameAssignment_2 ) ) )
            // InternalDsl.g:691:1: ( ( rule__School__NameAssignment_2 ) )
            {
            // InternalDsl.g:691:1: ( ( rule__School__NameAssignment_2 ) )
            // InternalDsl.g:692:2: ( rule__School__NameAssignment_2 )
            {
             before(grammarAccess.getSchoolAccess().getNameAssignment_2()); 
            // InternalDsl.g:693:2: ( rule__School__NameAssignment_2 )
            // InternalDsl.g:693:3: rule__School__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__School__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__School__Group__2__Impl"


    // $ANTLR start "rule__School__Group__3"
    // InternalDsl.g:701:1: rule__School__Group__3 : rule__School__Group__3__Impl rule__School__Group__4 ;
    public final void rule__School__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( rule__School__Group__3__Impl rule__School__Group__4 )
            // InternalDsl.g:706:2: rule__School__Group__3__Impl rule__School__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__School__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__4();

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
    // $ANTLR end "rule__School__Group__3"


    // $ANTLR start "rule__School__Group__3__Impl"
    // InternalDsl.g:713:1: rule__School__Group__3__Impl : ( '{' ) ;
    public final void rule__School__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( ( '{' ) )
            // InternalDsl.g:718:1: ( '{' )
            {
            // InternalDsl.g:718:1: ( '{' )
            // InternalDsl.g:719:2: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__School__Group__3__Impl"


    // $ANTLR start "rule__School__Group__4"
    // InternalDsl.g:728:1: rule__School__Group__4 : rule__School__Group__4__Impl rule__School__Group__5 ;
    public final void rule__School__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( rule__School__Group__4__Impl rule__School__Group__5 )
            // InternalDsl.g:733:2: rule__School__Group__4__Impl rule__School__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__School__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__5();

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
    // $ANTLR end "rule__School__Group__4"


    // $ANTLR start "rule__School__Group__4__Impl"
    // InternalDsl.g:740:1: rule__School__Group__4__Impl : ( ( rule__School__Group_4__0 )? ) ;
    public final void rule__School__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( ( ( rule__School__Group_4__0 )? ) )
            // InternalDsl.g:745:1: ( ( rule__School__Group_4__0 )? )
            {
            // InternalDsl.g:745:1: ( ( rule__School__Group_4__0 )? )
            // InternalDsl.g:746:2: ( rule__School__Group_4__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_4()); 
            // InternalDsl.g:747:2: ( rule__School__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:747:3: rule__School__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__School__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_4()); 

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
    // $ANTLR end "rule__School__Group__4__Impl"


    // $ANTLR start "rule__School__Group__5"
    // InternalDsl.g:755:1: rule__School__Group__5 : rule__School__Group__5__Impl rule__School__Group__6 ;
    public final void rule__School__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__School__Group__5__Impl rule__School__Group__6 )
            // InternalDsl.g:760:2: rule__School__Group__5__Impl rule__School__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__School__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__6();

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
    // $ANTLR end "rule__School__Group__5"


    // $ANTLR start "rule__School__Group__5__Impl"
    // InternalDsl.g:767:1: rule__School__Group__5__Impl : ( ( rule__School__Group_5__0 )? ) ;
    public final void rule__School__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( ( rule__School__Group_5__0 )? ) )
            // InternalDsl.g:772:1: ( ( rule__School__Group_5__0 )? )
            {
            // InternalDsl.g:772:1: ( ( rule__School__Group_5__0 )? )
            // InternalDsl.g:773:2: ( rule__School__Group_5__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_5()); 
            // InternalDsl.g:774:2: ( rule__School__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:774:3: rule__School__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__School__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_5()); 

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
    // $ANTLR end "rule__School__Group__5__Impl"


    // $ANTLR start "rule__School__Group__6"
    // InternalDsl.g:782:1: rule__School__Group__6 : rule__School__Group__6__Impl ;
    public final void rule__School__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__School__Group__6__Impl )
            // InternalDsl.g:787:2: rule__School__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__School__Group__6__Impl();

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
    // $ANTLR end "rule__School__Group__6"


    // $ANTLR start "rule__School__Group__6__Impl"
    // InternalDsl.g:793:1: rule__School__Group__6__Impl : ( '}' ) ;
    public final void rule__School__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:797:1: ( ( '}' ) )
            // InternalDsl.g:798:1: ( '}' )
            {
            // InternalDsl.g:798:1: ( '}' )
            // InternalDsl.g:799:2: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__School__Group__6__Impl"


    // $ANTLR start "rule__School__Group_4__0"
    // InternalDsl.g:809:1: rule__School__Group_4__0 : rule__School__Group_4__0__Impl rule__School__Group_4__1 ;
    public final void rule__School__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__School__Group_4__0__Impl rule__School__Group_4__1 )
            // InternalDsl.g:814:2: rule__School__Group_4__0__Impl rule__School__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__School__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_4__1();

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
    // $ANTLR end "rule__School__Group_4__0"


    // $ANTLR start "rule__School__Group_4__0__Impl"
    // InternalDsl.g:821:1: rule__School__Group_4__0__Impl : ( 'sid' ) ;
    public final void rule__School__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( 'sid' ) )
            // InternalDsl.g:826:1: ( 'sid' )
            {
            // InternalDsl.g:826:1: ( 'sid' )
            // InternalDsl.g:827:2: 'sid'
            {
             before(grammarAccess.getSchoolAccess().getSidKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getSidKeyword_4_0()); 

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
    // $ANTLR end "rule__School__Group_4__0__Impl"


    // $ANTLR start "rule__School__Group_4__1"
    // InternalDsl.g:836:1: rule__School__Group_4__1 : rule__School__Group_4__1__Impl ;
    public final void rule__School__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:840:1: ( rule__School__Group_4__1__Impl )
            // InternalDsl.g:841:2: rule__School__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__School__Group_4__1__Impl();

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
    // $ANTLR end "rule__School__Group_4__1"


    // $ANTLR start "rule__School__Group_4__1__Impl"
    // InternalDsl.g:847:1: rule__School__Group_4__1__Impl : ( ( rule__School__SidAssignment_4_1 ) ) ;
    public final void rule__School__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( ( ( rule__School__SidAssignment_4_1 ) ) )
            // InternalDsl.g:852:1: ( ( rule__School__SidAssignment_4_1 ) )
            {
            // InternalDsl.g:852:1: ( ( rule__School__SidAssignment_4_1 ) )
            // InternalDsl.g:853:2: ( rule__School__SidAssignment_4_1 )
            {
             before(grammarAccess.getSchoolAccess().getSidAssignment_4_1()); 
            // InternalDsl.g:854:2: ( rule__School__SidAssignment_4_1 )
            // InternalDsl.g:854:3: rule__School__SidAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__School__SidAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getSidAssignment_4_1()); 

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
    // $ANTLR end "rule__School__Group_4__1__Impl"


    // $ANTLR start "rule__School__Group_5__0"
    // InternalDsl.g:863:1: rule__School__Group_5__0 : rule__School__Group_5__0__Impl rule__School__Group_5__1 ;
    public final void rule__School__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:867:1: ( rule__School__Group_5__0__Impl rule__School__Group_5__1 )
            // InternalDsl.g:868:2: rule__School__Group_5__0__Impl rule__School__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__School__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_5__1();

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
    // $ANTLR end "rule__School__Group_5__0"


    // $ANTLR start "rule__School__Group_5__0__Impl"
    // InternalDsl.g:875:1: rule__School__Group_5__0__Impl : ( 'containPerson' ) ;
    public final void rule__School__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:879:1: ( ( 'containPerson' ) )
            // InternalDsl.g:880:1: ( 'containPerson' )
            {
            // InternalDsl.g:880:1: ( 'containPerson' )
            // InternalDsl.g:881:2: 'containPerson'
            {
             before(grammarAccess.getSchoolAccess().getContainPersonKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getContainPersonKeyword_5_0()); 

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
    // $ANTLR end "rule__School__Group_5__0__Impl"


    // $ANTLR start "rule__School__Group_5__1"
    // InternalDsl.g:890:1: rule__School__Group_5__1 : rule__School__Group_5__1__Impl rule__School__Group_5__2 ;
    public final void rule__School__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:894:1: ( rule__School__Group_5__1__Impl rule__School__Group_5__2 )
            // InternalDsl.g:895:2: rule__School__Group_5__1__Impl rule__School__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__School__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_5__2();

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
    // $ANTLR end "rule__School__Group_5__1"


    // $ANTLR start "rule__School__Group_5__1__Impl"
    // InternalDsl.g:902:1: rule__School__Group_5__1__Impl : ( '{' ) ;
    public final void rule__School__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:906:1: ( ( '{' ) )
            // InternalDsl.g:907:1: ( '{' )
            {
            // InternalDsl.g:907:1: ( '{' )
            // InternalDsl.g:908:2: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__School__Group_5__1__Impl"


    // $ANTLR start "rule__School__Group_5__2"
    // InternalDsl.g:917:1: rule__School__Group_5__2 : rule__School__Group_5__2__Impl rule__School__Group_5__3 ;
    public final void rule__School__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( rule__School__Group_5__2__Impl rule__School__Group_5__3 )
            // InternalDsl.g:922:2: rule__School__Group_5__2__Impl rule__School__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__School__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_5__3();

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
    // $ANTLR end "rule__School__Group_5__2"


    // $ANTLR start "rule__School__Group_5__2__Impl"
    // InternalDsl.g:929:1: rule__School__Group_5__2__Impl : ( ( rule__School__ContainPersonAssignment_5_2 ) ) ;
    public final void rule__School__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:933:1: ( ( ( rule__School__ContainPersonAssignment_5_2 ) ) )
            // InternalDsl.g:934:1: ( ( rule__School__ContainPersonAssignment_5_2 ) )
            {
            // InternalDsl.g:934:1: ( ( rule__School__ContainPersonAssignment_5_2 ) )
            // InternalDsl.g:935:2: ( rule__School__ContainPersonAssignment_5_2 )
            {
             before(grammarAccess.getSchoolAccess().getContainPersonAssignment_5_2()); 
            // InternalDsl.g:936:2: ( rule__School__ContainPersonAssignment_5_2 )
            // InternalDsl.g:936:3: rule__School__ContainPersonAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__School__ContainPersonAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getContainPersonAssignment_5_2()); 

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
    // $ANTLR end "rule__School__Group_5__2__Impl"


    // $ANTLR start "rule__School__Group_5__3"
    // InternalDsl.g:944:1: rule__School__Group_5__3 : rule__School__Group_5__3__Impl rule__School__Group_5__4 ;
    public final void rule__School__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:948:1: ( rule__School__Group_5__3__Impl rule__School__Group_5__4 )
            // InternalDsl.g:949:2: rule__School__Group_5__3__Impl rule__School__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__School__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_5__4();

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
    // $ANTLR end "rule__School__Group_5__3"


    // $ANTLR start "rule__School__Group_5__3__Impl"
    // InternalDsl.g:956:1: rule__School__Group_5__3__Impl : ( ( rule__School__Group_5_3__0 )* ) ;
    public final void rule__School__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:960:1: ( ( ( rule__School__Group_5_3__0 )* ) )
            // InternalDsl.g:961:1: ( ( rule__School__Group_5_3__0 )* )
            {
            // InternalDsl.g:961:1: ( ( rule__School__Group_5_3__0 )* )
            // InternalDsl.g:962:2: ( rule__School__Group_5_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_5_3()); 
            // InternalDsl.g:963:2: ( rule__School__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:963:3: rule__School__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__School__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__School__Group_5__3__Impl"


    // $ANTLR start "rule__School__Group_5__4"
    // InternalDsl.g:971:1: rule__School__Group_5__4 : rule__School__Group_5__4__Impl ;
    public final void rule__School__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:975:1: ( rule__School__Group_5__4__Impl )
            // InternalDsl.g:976:2: rule__School__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__School__Group_5__4__Impl();

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
    // $ANTLR end "rule__School__Group_5__4"


    // $ANTLR start "rule__School__Group_5__4__Impl"
    // InternalDsl.g:982:1: rule__School__Group_5__4__Impl : ( '}' ) ;
    public final void rule__School__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:986:1: ( ( '}' ) )
            // InternalDsl.g:987:1: ( '}' )
            {
            // InternalDsl.g:987:1: ( '}' )
            // InternalDsl.g:988:2: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__School__Group_5__4__Impl"


    // $ANTLR start "rule__School__Group_5_3__0"
    // InternalDsl.g:998:1: rule__School__Group_5_3__0 : rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1 ;
    public final void rule__School__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1002:1: ( rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1 )
            // InternalDsl.g:1003:2: rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__School__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group_5_3__1();

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
    // $ANTLR end "rule__School__Group_5_3__0"


    // $ANTLR start "rule__School__Group_5_3__0__Impl"
    // InternalDsl.g:1010:1: rule__School__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1014:1: ( ( ',' ) )
            // InternalDsl.g:1015:1: ( ',' )
            {
            // InternalDsl.g:1015:1: ( ',' )
            // InternalDsl.g:1016:2: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__School__Group_5_3__0__Impl"


    // $ANTLR start "rule__School__Group_5_3__1"
    // InternalDsl.g:1025:1: rule__School__Group_5_3__1 : rule__School__Group_5_3__1__Impl ;
    public final void rule__School__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1029:1: ( rule__School__Group_5_3__1__Impl )
            // InternalDsl.g:1030:2: rule__School__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__School__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__School__Group_5_3__1"


    // $ANTLR start "rule__School__Group_5_3__1__Impl"
    // InternalDsl.g:1036:1: rule__School__Group_5_3__1__Impl : ( ( rule__School__ContainPersonAssignment_5_3_1 ) ) ;
    public final void rule__School__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1040:1: ( ( ( rule__School__ContainPersonAssignment_5_3_1 ) ) )
            // InternalDsl.g:1041:1: ( ( rule__School__ContainPersonAssignment_5_3_1 ) )
            {
            // InternalDsl.g:1041:1: ( ( rule__School__ContainPersonAssignment_5_3_1 ) )
            // InternalDsl.g:1042:2: ( rule__School__ContainPersonAssignment_5_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getContainPersonAssignment_5_3_1()); 
            // InternalDsl.g:1043:2: ( rule__School__ContainPersonAssignment_5_3_1 )
            // InternalDsl.g:1043:3: rule__School__ContainPersonAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__School__ContainPersonAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getContainPersonAssignment_5_3_1()); 

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
    // $ANTLR end "rule__School__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:1052:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1056:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:1057:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:1064:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1068:1: ( ( ( '-' )? ) )
            // InternalDsl.g:1069:1: ( ( '-' )? )
            {
            // InternalDsl.g:1069:1: ( ( '-' )? )
            // InternalDsl.g:1070:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:1071:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1071:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:1079:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:1084:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:1090:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1094:1: ( ( RULE_INT ) )
            // InternalDsl.g:1095:1: ( RULE_INT )
            {
            // InternalDsl.g:1095:1: ( RULE_INT )
            // InternalDsl.g:1096:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // InternalDsl.g:1106:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1110:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // InternalDsl.g:1111:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1();

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
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // InternalDsl.g:1118:1: rule__Teacher__Group__0__Impl : ( () ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1122:1: ( ( () ) )
            // InternalDsl.g:1123:1: ( () )
            {
            // InternalDsl.g:1123:1: ( () )
            // InternalDsl.g:1124:2: ()
            {
             before(grammarAccess.getTeacherAccess().getTeacherAction_0()); 
            // InternalDsl.g:1125:2: ()
            // InternalDsl.g:1125:3: 
            {
            }

             after(grammarAccess.getTeacherAccess().getTeacherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // InternalDsl.g:1133:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl rule__Teacher__Group__2 ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1137:1: ( rule__Teacher__Group__1__Impl rule__Teacher__Group__2 )
            // InternalDsl.g:1138:2: rule__Teacher__Group__1__Impl rule__Teacher__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__2();

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
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // InternalDsl.g:1145:1: rule__Teacher__Group__1__Impl : ( 'Teacher' ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1149:1: ( ( 'Teacher' ) )
            // InternalDsl.g:1150:1: ( 'Teacher' )
            {
            // InternalDsl.g:1150:1: ( 'Teacher' )
            // InternalDsl.g:1151:2: 'Teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 

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
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__2"
    // InternalDsl.g:1160:1: rule__Teacher__Group__2 : rule__Teacher__Group__2__Impl rule__Teacher__Group__3 ;
    public final void rule__Teacher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1164:1: ( rule__Teacher__Group__2__Impl rule__Teacher__Group__3 )
            // InternalDsl.g:1165:2: rule__Teacher__Group__2__Impl rule__Teacher__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Teacher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__3();

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
    // $ANTLR end "rule__Teacher__Group__2"


    // $ANTLR start "rule__Teacher__Group__2__Impl"
    // InternalDsl.g:1172:1: rule__Teacher__Group__2__Impl : ( ( rule__Teacher__NameAssignment_2 ) ) ;
    public final void rule__Teacher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1176:1: ( ( ( rule__Teacher__NameAssignment_2 ) ) )
            // InternalDsl.g:1177:1: ( ( rule__Teacher__NameAssignment_2 ) )
            {
            // InternalDsl.g:1177:1: ( ( rule__Teacher__NameAssignment_2 ) )
            // InternalDsl.g:1178:2: ( rule__Teacher__NameAssignment_2 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_2()); 
            // InternalDsl.g:1179:2: ( rule__Teacher__NameAssignment_2 )
            // InternalDsl.g:1179:3: rule__Teacher__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Teacher__Group__2__Impl"


    // $ANTLR start "rule__Teacher__Group__3"
    // InternalDsl.g:1187:1: rule__Teacher__Group__3 : rule__Teacher__Group__3__Impl rule__Teacher__Group__4 ;
    public final void rule__Teacher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:1: ( rule__Teacher__Group__3__Impl rule__Teacher__Group__4 )
            // InternalDsl.g:1192:2: rule__Teacher__Group__3__Impl rule__Teacher__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__4();

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
    // $ANTLR end "rule__Teacher__Group__3"


    // $ANTLR start "rule__Teacher__Group__3__Impl"
    // InternalDsl.g:1199:1: rule__Teacher__Group__3__Impl : ( '{' ) ;
    public final void rule__Teacher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1203:1: ( ( '{' ) )
            // InternalDsl.g:1204:1: ( '{' )
            {
            // InternalDsl.g:1204:1: ( '{' )
            // InternalDsl.g:1205:2: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Teacher__Group__3__Impl"


    // $ANTLR start "rule__Teacher__Group__4"
    // InternalDsl.g:1214:1: rule__Teacher__Group__4 : rule__Teacher__Group__4__Impl rule__Teacher__Group__5 ;
    public final void rule__Teacher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1218:1: ( rule__Teacher__Group__4__Impl rule__Teacher__Group__5 )
            // InternalDsl.g:1219:2: rule__Teacher__Group__4__Impl rule__Teacher__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__5();

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
    // $ANTLR end "rule__Teacher__Group__4"


    // $ANTLR start "rule__Teacher__Group__4__Impl"
    // InternalDsl.g:1226:1: rule__Teacher__Group__4__Impl : ( ( rule__Teacher__Group_4__0 )? ) ;
    public final void rule__Teacher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1230:1: ( ( ( rule__Teacher__Group_4__0 )? ) )
            // InternalDsl.g:1231:1: ( ( rule__Teacher__Group_4__0 )? )
            {
            // InternalDsl.g:1231:1: ( ( rule__Teacher__Group_4__0 )? )
            // InternalDsl.g:1232:2: ( rule__Teacher__Group_4__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_4()); 
            // InternalDsl.g:1233:2: ( rule__Teacher__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1233:3: rule__Teacher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Teacher__Group__4__Impl"


    // $ANTLR start "rule__Teacher__Group__5"
    // InternalDsl.g:1241:1: rule__Teacher__Group__5 : rule__Teacher__Group__5__Impl rule__Teacher__Group__6 ;
    public final void rule__Teacher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1245:1: ( rule__Teacher__Group__5__Impl rule__Teacher__Group__6 )
            // InternalDsl.g:1246:2: rule__Teacher__Group__5__Impl rule__Teacher__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__6();

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
    // $ANTLR end "rule__Teacher__Group__5"


    // $ANTLR start "rule__Teacher__Group__5__Impl"
    // InternalDsl.g:1253:1: rule__Teacher__Group__5__Impl : ( ( rule__Teacher__Group_5__0 )? ) ;
    public final void rule__Teacher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1257:1: ( ( ( rule__Teacher__Group_5__0 )? ) )
            // InternalDsl.g:1258:1: ( ( rule__Teacher__Group_5__0 )? )
            {
            // InternalDsl.g:1258:1: ( ( rule__Teacher__Group_5__0 )? )
            // InternalDsl.g:1259:2: ( rule__Teacher__Group_5__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_5()); 
            // InternalDsl.g:1260:2: ( rule__Teacher__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1260:3: rule__Teacher__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Teacher__Group__5__Impl"


    // $ANTLR start "rule__Teacher__Group__6"
    // InternalDsl.g:1268:1: rule__Teacher__Group__6 : rule__Teacher__Group__6__Impl rule__Teacher__Group__7 ;
    public final void rule__Teacher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1272:1: ( rule__Teacher__Group__6__Impl rule__Teacher__Group__7 )
            // InternalDsl.g:1273:2: rule__Teacher__Group__6__Impl rule__Teacher__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__7();

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
    // $ANTLR end "rule__Teacher__Group__6"


    // $ANTLR start "rule__Teacher__Group__6__Impl"
    // InternalDsl.g:1280:1: rule__Teacher__Group__6__Impl : ( ( rule__Teacher__Group_6__0 )? ) ;
    public final void rule__Teacher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1284:1: ( ( ( rule__Teacher__Group_6__0 )? ) )
            // InternalDsl.g:1285:1: ( ( rule__Teacher__Group_6__0 )? )
            {
            // InternalDsl.g:1285:1: ( ( rule__Teacher__Group_6__0 )? )
            // InternalDsl.g:1286:2: ( rule__Teacher__Group_6__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_6()); 
            // InternalDsl.g:1287:2: ( rule__Teacher__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1287:3: rule__Teacher__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Teacher__Group__6__Impl"


    // $ANTLR start "rule__Teacher__Group__7"
    // InternalDsl.g:1295:1: rule__Teacher__Group__7 : rule__Teacher__Group__7__Impl ;
    public final void rule__Teacher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1299:1: ( rule__Teacher__Group__7__Impl )
            // InternalDsl.g:1300:2: rule__Teacher__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__7__Impl();

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
    // $ANTLR end "rule__Teacher__Group__7"


    // $ANTLR start "rule__Teacher__Group__7__Impl"
    // InternalDsl.g:1306:1: rule__Teacher__Group__7__Impl : ( '}' ) ;
    public final void rule__Teacher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1310:1: ( ( '}' ) )
            // InternalDsl.g:1311:1: ( '}' )
            {
            // InternalDsl.g:1311:1: ( '}' )
            // InternalDsl.g:1312:2: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Teacher__Group__7__Impl"


    // $ANTLR start "rule__Teacher__Group_4__0"
    // InternalDsl.g:1322:1: rule__Teacher__Group_4__0 : rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 ;
    public final void rule__Teacher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1326:1: ( rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 )
            // InternalDsl.g:1327:2: rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__1();

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
    // $ANTLR end "rule__Teacher__Group_4__0"


    // $ANTLR start "rule__Teacher__Group_4__0__Impl"
    // InternalDsl.g:1334:1: rule__Teacher__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__Teacher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( ( 'id' ) )
            // InternalDsl.g:1339:1: ( 'id' )
            {
            // InternalDsl.g:1339:1: ( 'id' )
            // InternalDsl.g:1340:2: 'id'
            {
             before(grammarAccess.getTeacherAccess().getIdKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getIdKeyword_4_0()); 

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
    // $ANTLR end "rule__Teacher__Group_4__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4__1"
    // InternalDsl.g:1349:1: rule__Teacher__Group_4__1 : rule__Teacher__Group_4__1__Impl ;
    public final void rule__Teacher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( rule__Teacher__Group_4__1__Impl )
            // InternalDsl.g:1354:2: rule__Teacher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__1__Impl();

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
    // $ANTLR end "rule__Teacher__Group_4__1"


    // $ANTLR start "rule__Teacher__Group_4__1__Impl"
    // InternalDsl.g:1360:1: rule__Teacher__Group_4__1__Impl : ( ( rule__Teacher__IdAssignment_4_1 ) ) ;
    public final void rule__Teacher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1364:1: ( ( ( rule__Teacher__IdAssignment_4_1 ) ) )
            // InternalDsl.g:1365:1: ( ( rule__Teacher__IdAssignment_4_1 ) )
            {
            // InternalDsl.g:1365:1: ( ( rule__Teacher__IdAssignment_4_1 ) )
            // InternalDsl.g:1366:2: ( rule__Teacher__IdAssignment_4_1 )
            {
             before(grammarAccess.getTeacherAccess().getIdAssignment_4_1()); 
            // InternalDsl.g:1367:2: ( rule__Teacher__IdAssignment_4_1 )
            // InternalDsl.g:1367:3: rule__Teacher__IdAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__IdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getIdAssignment_4_1()); 

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
    // $ANTLR end "rule__Teacher__Group_4__1__Impl"


    // $ANTLR start "rule__Teacher__Group_5__0"
    // InternalDsl.g:1376:1: rule__Teacher__Group_5__0 : rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1 ;
    public final void rule__Teacher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1380:1: ( rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1 )
            // InternalDsl.g:1381:2: rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__1();

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
    // $ANTLR end "rule__Teacher__Group_5__0"


    // $ANTLR start "rule__Teacher__Group_5__0__Impl"
    // InternalDsl.g:1388:1: rule__Teacher__Group_5__0__Impl : ( 'workIn' ) ;
    public final void rule__Teacher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1392:1: ( ( 'workIn' ) )
            // InternalDsl.g:1393:1: ( 'workIn' )
            {
            // InternalDsl.g:1393:1: ( 'workIn' )
            // InternalDsl.g:1394:2: 'workIn'
            {
             before(grammarAccess.getTeacherAccess().getWorkInKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getWorkInKeyword_5_0()); 

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
    // $ANTLR end "rule__Teacher__Group_5__0__Impl"


    // $ANTLR start "rule__Teacher__Group_5__1"
    // InternalDsl.g:1403:1: rule__Teacher__Group_5__1 : rule__Teacher__Group_5__1__Impl rule__Teacher__Group_5__2 ;
    public final void rule__Teacher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( rule__Teacher__Group_5__1__Impl rule__Teacher__Group_5__2 )
            // InternalDsl.g:1408:2: rule__Teacher__Group_5__1__Impl rule__Teacher__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__2();

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
    // $ANTLR end "rule__Teacher__Group_5__1"


    // $ANTLR start "rule__Teacher__Group_5__1__Impl"
    // InternalDsl.g:1415:1: rule__Teacher__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Teacher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( ( '(' ) )
            // InternalDsl.g:1420:1: ( '(' )
            {
            // InternalDsl.g:1420:1: ( '(' )
            // InternalDsl.g:1421:2: '('
            {
             before(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Teacher__Group_5__1__Impl"


    // $ANTLR start "rule__Teacher__Group_5__2"
    // InternalDsl.g:1430:1: rule__Teacher__Group_5__2 : rule__Teacher__Group_5__2__Impl rule__Teacher__Group_5__3 ;
    public final void rule__Teacher__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( rule__Teacher__Group_5__2__Impl rule__Teacher__Group_5__3 )
            // InternalDsl.g:1435:2: rule__Teacher__Group_5__2__Impl rule__Teacher__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__3();

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
    // $ANTLR end "rule__Teacher__Group_5__2"


    // $ANTLR start "rule__Teacher__Group_5__2__Impl"
    // InternalDsl.g:1442:1: rule__Teacher__Group_5__2__Impl : ( ( rule__Teacher__WorkInAssignment_5_2 ) ) ;
    public final void rule__Teacher__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1446:1: ( ( ( rule__Teacher__WorkInAssignment_5_2 ) ) )
            // InternalDsl.g:1447:1: ( ( rule__Teacher__WorkInAssignment_5_2 ) )
            {
            // InternalDsl.g:1447:1: ( ( rule__Teacher__WorkInAssignment_5_2 ) )
            // InternalDsl.g:1448:2: ( rule__Teacher__WorkInAssignment_5_2 )
            {
             before(grammarAccess.getTeacherAccess().getWorkInAssignment_5_2()); 
            // InternalDsl.g:1449:2: ( rule__Teacher__WorkInAssignment_5_2 )
            // InternalDsl.g:1449:3: rule__Teacher__WorkInAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__WorkInAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getWorkInAssignment_5_2()); 

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
    // $ANTLR end "rule__Teacher__Group_5__2__Impl"


    // $ANTLR start "rule__Teacher__Group_5__3"
    // InternalDsl.g:1457:1: rule__Teacher__Group_5__3 : rule__Teacher__Group_5__3__Impl rule__Teacher__Group_5__4 ;
    public final void rule__Teacher__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1461:1: ( rule__Teacher__Group_5__3__Impl rule__Teacher__Group_5__4 )
            // InternalDsl.g:1462:2: rule__Teacher__Group_5__3__Impl rule__Teacher__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__4();

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
    // $ANTLR end "rule__Teacher__Group_5__3"


    // $ANTLR start "rule__Teacher__Group_5__3__Impl"
    // InternalDsl.g:1469:1: rule__Teacher__Group_5__3__Impl : ( ( rule__Teacher__Group_5_3__0 )* ) ;
    public final void rule__Teacher__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( ( ( rule__Teacher__Group_5_3__0 )* ) )
            // InternalDsl.g:1474:1: ( ( rule__Teacher__Group_5_3__0 )* )
            {
            // InternalDsl.g:1474:1: ( ( rule__Teacher__Group_5_3__0 )* )
            // InternalDsl.g:1475:2: ( rule__Teacher__Group_5_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_5_3()); 
            // InternalDsl.g:1476:2: ( rule__Teacher__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1476:3: rule__Teacher__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Teacher__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Teacher__Group_5__3__Impl"


    // $ANTLR start "rule__Teacher__Group_5__4"
    // InternalDsl.g:1484:1: rule__Teacher__Group_5__4 : rule__Teacher__Group_5__4__Impl ;
    public final void rule__Teacher__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( rule__Teacher__Group_5__4__Impl )
            // InternalDsl.g:1489:2: rule__Teacher__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__4__Impl();

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
    // $ANTLR end "rule__Teacher__Group_5__4"


    // $ANTLR start "rule__Teacher__Group_5__4__Impl"
    // InternalDsl.g:1495:1: rule__Teacher__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Teacher__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1499:1: ( ( ')' ) )
            // InternalDsl.g:1500:1: ( ')' )
            {
            // InternalDsl.g:1500:1: ( ')' )
            // InternalDsl.g:1501:2: ')'
            {
             before(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Teacher__Group_5__4__Impl"


    // $ANTLR start "rule__Teacher__Group_5_3__0"
    // InternalDsl.g:1511:1: rule__Teacher__Group_5_3__0 : rule__Teacher__Group_5_3__0__Impl rule__Teacher__Group_5_3__1 ;
    public final void rule__Teacher__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1515:1: ( rule__Teacher__Group_5_3__0__Impl rule__Teacher__Group_5_3__1 )
            // InternalDsl.g:1516:2: rule__Teacher__Group_5_3__0__Impl rule__Teacher__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5_3__1();

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
    // $ANTLR end "rule__Teacher__Group_5_3__0"


    // $ANTLR start "rule__Teacher__Group_5_3__0__Impl"
    // InternalDsl.g:1523:1: rule__Teacher__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1527:1: ( ( ',' ) )
            // InternalDsl.g:1528:1: ( ',' )
            {
            // InternalDsl.g:1528:1: ( ',' )
            // InternalDsl.g:1529:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Teacher__Group_5_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_5_3__1"
    // InternalDsl.g:1538:1: rule__Teacher__Group_5_3__1 : rule__Teacher__Group_5_3__1__Impl ;
    public final void rule__Teacher__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( rule__Teacher__Group_5_3__1__Impl )
            // InternalDsl.g:1543:2: rule__Teacher__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Teacher__Group_5_3__1"


    // $ANTLR start "rule__Teacher__Group_5_3__1__Impl"
    // InternalDsl.g:1549:1: rule__Teacher__Group_5_3__1__Impl : ( ( rule__Teacher__WorkInAssignment_5_3_1 ) ) ;
    public final void rule__Teacher__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1553:1: ( ( ( rule__Teacher__WorkInAssignment_5_3_1 ) ) )
            // InternalDsl.g:1554:1: ( ( rule__Teacher__WorkInAssignment_5_3_1 ) )
            {
            // InternalDsl.g:1554:1: ( ( rule__Teacher__WorkInAssignment_5_3_1 ) )
            // InternalDsl.g:1555:2: ( rule__Teacher__WorkInAssignment_5_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getWorkInAssignment_5_3_1()); 
            // InternalDsl.g:1556:2: ( rule__Teacher__WorkInAssignment_5_3_1 )
            // InternalDsl.g:1556:3: rule__Teacher__WorkInAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__WorkInAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getWorkInAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Teacher__Group_5_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group_6__0"
    // InternalDsl.g:1565:1: rule__Teacher__Group_6__0 : rule__Teacher__Group_6__0__Impl rule__Teacher__Group_6__1 ;
    public final void rule__Teacher__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1569:1: ( rule__Teacher__Group_6__0__Impl rule__Teacher__Group_6__1 )
            // InternalDsl.g:1570:2: rule__Teacher__Group_6__0__Impl rule__Teacher__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6__1();

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
    // $ANTLR end "rule__Teacher__Group_6__0"


    // $ANTLR start "rule__Teacher__Group_6__0__Impl"
    // InternalDsl.g:1577:1: rule__Teacher__Group_6__0__Impl : ( 'teach' ) ;
    public final void rule__Teacher__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1581:1: ( ( 'teach' ) )
            // InternalDsl.g:1582:1: ( 'teach' )
            {
            // InternalDsl.g:1582:1: ( 'teach' )
            // InternalDsl.g:1583:2: 'teach'
            {
             before(grammarAccess.getTeacherAccess().getTeachKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeachKeyword_6_0()); 

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
    // $ANTLR end "rule__Teacher__Group_6__0__Impl"


    // $ANTLR start "rule__Teacher__Group_6__1"
    // InternalDsl.g:1592:1: rule__Teacher__Group_6__1 : rule__Teacher__Group_6__1__Impl rule__Teacher__Group_6__2 ;
    public final void rule__Teacher__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( rule__Teacher__Group_6__1__Impl rule__Teacher__Group_6__2 )
            // InternalDsl.g:1597:2: rule__Teacher__Group_6__1__Impl rule__Teacher__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6__2();

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
    // $ANTLR end "rule__Teacher__Group_6__1"


    // $ANTLR start "rule__Teacher__Group_6__1__Impl"
    // InternalDsl.g:1604:1: rule__Teacher__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Teacher__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1608:1: ( ( '(' ) )
            // InternalDsl.g:1609:1: ( '(' )
            {
            // InternalDsl.g:1609:1: ( '(' )
            // InternalDsl.g:1610:2: '('
            {
             before(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__Teacher__Group_6__1__Impl"


    // $ANTLR start "rule__Teacher__Group_6__2"
    // InternalDsl.g:1619:1: rule__Teacher__Group_6__2 : rule__Teacher__Group_6__2__Impl rule__Teacher__Group_6__3 ;
    public final void rule__Teacher__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1623:1: ( rule__Teacher__Group_6__2__Impl rule__Teacher__Group_6__3 )
            // InternalDsl.g:1624:2: rule__Teacher__Group_6__2__Impl rule__Teacher__Group_6__3
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6__3();

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
    // $ANTLR end "rule__Teacher__Group_6__2"


    // $ANTLR start "rule__Teacher__Group_6__2__Impl"
    // InternalDsl.g:1631:1: rule__Teacher__Group_6__2__Impl : ( ( rule__Teacher__TeachAssignment_6_2 ) ) ;
    public final void rule__Teacher__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1635:1: ( ( ( rule__Teacher__TeachAssignment_6_2 ) ) )
            // InternalDsl.g:1636:1: ( ( rule__Teacher__TeachAssignment_6_2 ) )
            {
            // InternalDsl.g:1636:1: ( ( rule__Teacher__TeachAssignment_6_2 ) )
            // InternalDsl.g:1637:2: ( rule__Teacher__TeachAssignment_6_2 )
            {
             before(grammarAccess.getTeacherAccess().getTeachAssignment_6_2()); 
            // InternalDsl.g:1638:2: ( rule__Teacher__TeachAssignment_6_2 )
            // InternalDsl.g:1638:3: rule__Teacher__TeachAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__TeachAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachAssignment_6_2()); 

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
    // $ANTLR end "rule__Teacher__Group_6__2__Impl"


    // $ANTLR start "rule__Teacher__Group_6__3"
    // InternalDsl.g:1646:1: rule__Teacher__Group_6__3 : rule__Teacher__Group_6__3__Impl rule__Teacher__Group_6__4 ;
    public final void rule__Teacher__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( rule__Teacher__Group_6__3__Impl rule__Teacher__Group_6__4 )
            // InternalDsl.g:1651:2: rule__Teacher__Group_6__3__Impl rule__Teacher__Group_6__4
            {
            pushFollow(FOLLOW_16);
            rule__Teacher__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6__4();

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
    // $ANTLR end "rule__Teacher__Group_6__3"


    // $ANTLR start "rule__Teacher__Group_6__3__Impl"
    // InternalDsl.g:1658:1: rule__Teacher__Group_6__3__Impl : ( ( rule__Teacher__Group_6_3__0 )* ) ;
    public final void rule__Teacher__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1662:1: ( ( ( rule__Teacher__Group_6_3__0 )* ) )
            // InternalDsl.g:1663:1: ( ( rule__Teacher__Group_6_3__0 )* )
            {
            // InternalDsl.g:1663:1: ( ( rule__Teacher__Group_6_3__0 )* )
            // InternalDsl.g:1664:2: ( rule__Teacher__Group_6_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_6_3()); 
            // InternalDsl.g:1665:2: ( rule__Teacher__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1665:3: rule__Teacher__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Teacher__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Teacher__Group_6__3__Impl"


    // $ANTLR start "rule__Teacher__Group_6__4"
    // InternalDsl.g:1673:1: rule__Teacher__Group_6__4 : rule__Teacher__Group_6__4__Impl ;
    public final void rule__Teacher__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1677:1: ( rule__Teacher__Group_6__4__Impl )
            // InternalDsl.g:1678:2: rule__Teacher__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6__4__Impl();

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
    // $ANTLR end "rule__Teacher__Group_6__4"


    // $ANTLR start "rule__Teacher__Group_6__4__Impl"
    // InternalDsl.g:1684:1: rule__Teacher__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Teacher__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1688:1: ( ( ')' ) )
            // InternalDsl.g:1689:1: ( ')' )
            {
            // InternalDsl.g:1689:1: ( ')' )
            // InternalDsl.g:1690:2: ')'
            {
             before(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__Teacher__Group_6__4__Impl"


    // $ANTLR start "rule__Teacher__Group_6_3__0"
    // InternalDsl.g:1700:1: rule__Teacher__Group_6_3__0 : rule__Teacher__Group_6_3__0__Impl rule__Teacher__Group_6_3__1 ;
    public final void rule__Teacher__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( rule__Teacher__Group_6_3__0__Impl rule__Teacher__Group_6_3__1 )
            // InternalDsl.g:1705:2: rule__Teacher__Group_6_3__0__Impl rule__Teacher__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6_3__1();

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
    // $ANTLR end "rule__Teacher__Group_6_3__0"


    // $ANTLR start "rule__Teacher__Group_6_3__0__Impl"
    // InternalDsl.g:1712:1: rule__Teacher__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1716:1: ( ( ',' ) )
            // InternalDsl.g:1717:1: ( ',' )
            {
            // InternalDsl.g:1717:1: ( ',' )
            // InternalDsl.g:1718:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Teacher__Group_6_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_6_3__1"
    // InternalDsl.g:1727:1: rule__Teacher__Group_6_3__1 : rule__Teacher__Group_6_3__1__Impl ;
    public final void rule__Teacher__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1731:1: ( rule__Teacher__Group_6_3__1__Impl )
            // InternalDsl.g:1732:2: rule__Teacher__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Teacher__Group_6_3__1"


    // $ANTLR start "rule__Teacher__Group_6_3__1__Impl"
    // InternalDsl.g:1738:1: rule__Teacher__Group_6_3__1__Impl : ( ( rule__Teacher__TeachAssignment_6_3_1 ) ) ;
    public final void rule__Teacher__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1742:1: ( ( ( rule__Teacher__TeachAssignment_6_3_1 ) ) )
            // InternalDsl.g:1743:1: ( ( rule__Teacher__TeachAssignment_6_3_1 ) )
            {
            // InternalDsl.g:1743:1: ( ( rule__Teacher__TeachAssignment_6_3_1 ) )
            // InternalDsl.g:1744:2: ( rule__Teacher__TeachAssignment_6_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getTeachAssignment_6_3_1()); 
            // InternalDsl.g:1745:2: ( rule__Teacher__TeachAssignment_6_3_1 )
            // InternalDsl.g:1745:3: rule__Teacher__TeachAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__TeachAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Teacher__Group_6_3__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // InternalDsl.g:1754:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalDsl.g:1759:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

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
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalDsl.g:1766:1: rule__Student__Group__0__Impl : ( 'Student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1770:1: ( ( 'Student' ) )
            // InternalDsl.g:1771:1: ( 'Student' )
            {
            // InternalDsl.g:1771:1: ( 'Student' )
            // InternalDsl.g:1772:2: 'Student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

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
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalDsl.g:1781:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1785:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalDsl.g:1786:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

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
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalDsl.g:1793:1: rule__Student__Group__1__Impl : ( ( rule__Student__NameAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( ( ( rule__Student__NameAssignment_1 ) ) )
            // InternalDsl.g:1798:1: ( ( rule__Student__NameAssignment_1 ) )
            {
            // InternalDsl.g:1798:1: ( ( rule__Student__NameAssignment_1 ) )
            // InternalDsl.g:1799:2: ( rule__Student__NameAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_1()); 
            // InternalDsl.g:1800:2: ( rule__Student__NameAssignment_1 )
            // InternalDsl.g:1800:3: rule__Student__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalDsl.g:1808:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1812:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalDsl.g:1813:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

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
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalDsl.g:1820:1: rule__Student__Group__2__Impl : ( '{' ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1824:1: ( ( '{' ) )
            // InternalDsl.g:1825:1: ( '{' )
            {
            // InternalDsl.g:1825:1: ( '{' )
            // InternalDsl.g:1826:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalDsl.g:1835:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1839:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalDsl.g:1840:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

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
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalDsl.g:1847:1: rule__Student__Group__3__Impl : ( ( rule__Student__Group_3__0 )? ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1851:1: ( ( ( rule__Student__Group_3__0 )? ) )
            // InternalDsl.g:1852:1: ( ( rule__Student__Group_3__0 )? )
            {
            // InternalDsl.g:1852:1: ( ( rule__Student__Group_3__0 )? )
            // InternalDsl.g:1853:2: ( rule__Student__Group_3__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_3()); 
            // InternalDsl.g:1854:2: ( rule__Student__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1854:3: rule__Student__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalDsl.g:1862:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1866:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // InternalDsl.g:1867:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__5();

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
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalDsl.g:1874:1: rule__Student__Group__4__Impl : ( 'studyIn' ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1878:1: ( ( 'studyIn' ) )
            // InternalDsl.g:1879:1: ( 'studyIn' )
            {
            // InternalDsl.g:1879:1: ( 'studyIn' )
            // InternalDsl.g:1880:2: 'studyIn'
            {
             before(grammarAccess.getStudentAccess().getStudyInKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudyInKeyword_4()); 

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
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // InternalDsl.g:1889:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1893:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // InternalDsl.g:1894:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__6();

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
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // InternalDsl.g:1901:1: rule__Student__Group__5__Impl : ( ( rule__Student__StudyInAssignment_5 ) ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1905:1: ( ( ( rule__Student__StudyInAssignment_5 ) ) )
            // InternalDsl.g:1906:1: ( ( rule__Student__StudyInAssignment_5 ) )
            {
            // InternalDsl.g:1906:1: ( ( rule__Student__StudyInAssignment_5 ) )
            // InternalDsl.g:1907:2: ( rule__Student__StudyInAssignment_5 )
            {
             before(grammarAccess.getStudentAccess().getStudyInAssignment_5()); 
            // InternalDsl.g:1908:2: ( rule__Student__StudyInAssignment_5 )
            // InternalDsl.g:1908:3: rule__Student__StudyInAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Student__StudyInAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getStudyInAssignment_5()); 

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
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // InternalDsl.g:1916:1: rule__Student__Group__6 : rule__Student__Group__6__Impl rule__Student__Group__7 ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1920:1: ( rule__Student__Group__6__Impl rule__Student__Group__7 )
            // InternalDsl.g:1921:2: rule__Student__Group__6__Impl rule__Student__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Student__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__7();

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
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // InternalDsl.g:1928:1: rule__Student__Group__6__Impl : ( 'follow' ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1932:1: ( ( 'follow' ) )
            // InternalDsl.g:1933:1: ( 'follow' )
            {
            // InternalDsl.g:1933:1: ( 'follow' )
            // InternalDsl.g:1934:2: 'follow'
            {
             before(grammarAccess.getStudentAccess().getFollowKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getFollowKeyword_6()); 

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
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group__7"
    // InternalDsl.g:1943:1: rule__Student__Group__7 : rule__Student__Group__7__Impl rule__Student__Group__8 ;
    public final void rule__Student__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1947:1: ( rule__Student__Group__7__Impl rule__Student__Group__8 )
            // InternalDsl.g:1948:2: rule__Student__Group__7__Impl rule__Student__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__8();

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
    // $ANTLR end "rule__Student__Group__7"


    // $ANTLR start "rule__Student__Group__7__Impl"
    // InternalDsl.g:1955:1: rule__Student__Group__7__Impl : ( '(' ) ;
    public final void rule__Student__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( ( '(' ) )
            // InternalDsl.g:1960:1: ( '(' )
            {
            // InternalDsl.g:1960:1: ( '(' )
            // InternalDsl.g:1961:2: '('
            {
             before(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Student__Group__7__Impl"


    // $ANTLR start "rule__Student__Group__8"
    // InternalDsl.g:1970:1: rule__Student__Group__8 : rule__Student__Group__8__Impl rule__Student__Group__9 ;
    public final void rule__Student__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1974:1: ( rule__Student__Group__8__Impl rule__Student__Group__9 )
            // InternalDsl.g:1975:2: rule__Student__Group__8__Impl rule__Student__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Student__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__9();

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
    // $ANTLR end "rule__Student__Group__8"


    // $ANTLR start "rule__Student__Group__8__Impl"
    // InternalDsl.g:1982:1: rule__Student__Group__8__Impl : ( ( rule__Student__FollowAssignment_8 ) ) ;
    public final void rule__Student__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1986:1: ( ( ( rule__Student__FollowAssignment_8 ) ) )
            // InternalDsl.g:1987:1: ( ( rule__Student__FollowAssignment_8 ) )
            {
            // InternalDsl.g:1987:1: ( ( rule__Student__FollowAssignment_8 ) )
            // InternalDsl.g:1988:2: ( rule__Student__FollowAssignment_8 )
            {
             before(grammarAccess.getStudentAccess().getFollowAssignment_8()); 
            // InternalDsl.g:1989:2: ( rule__Student__FollowAssignment_8 )
            // InternalDsl.g:1989:3: rule__Student__FollowAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Student__FollowAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getFollowAssignment_8()); 

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
    // $ANTLR end "rule__Student__Group__8__Impl"


    // $ANTLR start "rule__Student__Group__9"
    // InternalDsl.g:1997:1: rule__Student__Group__9 : rule__Student__Group__9__Impl rule__Student__Group__10 ;
    public final void rule__Student__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2001:1: ( rule__Student__Group__9__Impl rule__Student__Group__10 )
            // InternalDsl.g:2002:2: rule__Student__Group__9__Impl rule__Student__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Student__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__10();

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
    // $ANTLR end "rule__Student__Group__9"


    // $ANTLR start "rule__Student__Group__9__Impl"
    // InternalDsl.g:2009:1: rule__Student__Group__9__Impl : ( ( rule__Student__Group_9__0 )* ) ;
    public final void rule__Student__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2013:1: ( ( ( rule__Student__Group_9__0 )* ) )
            // InternalDsl.g:2014:1: ( ( rule__Student__Group_9__0 )* )
            {
            // InternalDsl.g:2014:1: ( ( rule__Student__Group_9__0 )* )
            // InternalDsl.g:2015:2: ( rule__Student__Group_9__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_9()); 
            // InternalDsl.g:2016:2: ( rule__Student__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:2016:3: rule__Student__Group_9__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Student__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Student__Group__9__Impl"


    // $ANTLR start "rule__Student__Group__10"
    // InternalDsl.g:2024:1: rule__Student__Group__10 : rule__Student__Group__10__Impl rule__Student__Group__11 ;
    public final void rule__Student__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( rule__Student__Group__10__Impl rule__Student__Group__11 )
            // InternalDsl.g:2029:2: rule__Student__Group__10__Impl rule__Student__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Student__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__11();

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
    // $ANTLR end "rule__Student__Group__10"


    // $ANTLR start "rule__Student__Group__10__Impl"
    // InternalDsl.g:2036:1: rule__Student__Group__10__Impl : ( ')' ) ;
    public final void rule__Student__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2040:1: ( ( ')' ) )
            // InternalDsl.g:2041:1: ( ')' )
            {
            // InternalDsl.g:2041:1: ( ')' )
            // InternalDsl.g:2042:2: ')'
            {
             before(grammarAccess.getStudentAccess().getRightParenthesisKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__Student__Group__10__Impl"


    // $ANTLR start "rule__Student__Group__11"
    // InternalDsl.g:2051:1: rule__Student__Group__11 : rule__Student__Group__11__Impl ;
    public final void rule__Student__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2055:1: ( rule__Student__Group__11__Impl )
            // InternalDsl.g:2056:2: rule__Student__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__11__Impl();

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
    // $ANTLR end "rule__Student__Group__11"


    // $ANTLR start "rule__Student__Group__11__Impl"
    // InternalDsl.g:2062:1: rule__Student__Group__11__Impl : ( '}' ) ;
    public final void rule__Student__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2066:1: ( ( '}' ) )
            // InternalDsl.g:2067:1: ( '}' )
            {
            // InternalDsl.g:2067:1: ( '}' )
            // InternalDsl.g:2068:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Student__Group__11__Impl"


    // $ANTLR start "rule__Student__Group_3__0"
    // InternalDsl.g:2078:1: rule__Student__Group_3__0 : rule__Student__Group_3__0__Impl rule__Student__Group_3__1 ;
    public final void rule__Student__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2082:1: ( rule__Student__Group_3__0__Impl rule__Student__Group_3__1 )
            // InternalDsl.g:2083:2: rule__Student__Group_3__0__Impl rule__Student__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_3__1();

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
    // $ANTLR end "rule__Student__Group_3__0"


    // $ANTLR start "rule__Student__Group_3__0__Impl"
    // InternalDsl.g:2090:1: rule__Student__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Student__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2094:1: ( ( 'id' ) )
            // InternalDsl.g:2095:1: ( 'id' )
            {
            // InternalDsl.g:2095:1: ( 'id' )
            // InternalDsl.g:2096:2: 'id'
            {
             before(grammarAccess.getStudentAccess().getIdKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Student__Group_3__0__Impl"


    // $ANTLR start "rule__Student__Group_3__1"
    // InternalDsl.g:2105:1: rule__Student__Group_3__1 : rule__Student__Group_3__1__Impl ;
    public final void rule__Student__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2109:1: ( rule__Student__Group_3__1__Impl )
            // InternalDsl.g:2110:2: rule__Student__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_3__1__Impl();

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
    // $ANTLR end "rule__Student__Group_3__1"


    // $ANTLR start "rule__Student__Group_3__1__Impl"
    // InternalDsl.g:2116:1: rule__Student__Group_3__1__Impl : ( ( rule__Student__IdAssignment_3_1 ) ) ;
    public final void rule__Student__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2120:1: ( ( ( rule__Student__IdAssignment_3_1 ) ) )
            // InternalDsl.g:2121:1: ( ( rule__Student__IdAssignment_3_1 ) )
            {
            // InternalDsl.g:2121:1: ( ( rule__Student__IdAssignment_3_1 ) )
            // InternalDsl.g:2122:2: ( rule__Student__IdAssignment_3_1 )
            {
             before(grammarAccess.getStudentAccess().getIdAssignment_3_1()); 
            // InternalDsl.g:2123:2: ( rule__Student__IdAssignment_3_1 )
            // InternalDsl.g:2123:3: rule__Student__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__Student__Group_3__1__Impl"


    // $ANTLR start "rule__Student__Group_9__0"
    // InternalDsl.g:2132:1: rule__Student__Group_9__0 : rule__Student__Group_9__0__Impl rule__Student__Group_9__1 ;
    public final void rule__Student__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2136:1: ( rule__Student__Group_9__0__Impl rule__Student__Group_9__1 )
            // InternalDsl.g:2137:2: rule__Student__Group_9__0__Impl rule__Student__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_9__1();

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
    // $ANTLR end "rule__Student__Group_9__0"


    // $ANTLR start "rule__Student__Group_9__0__Impl"
    // InternalDsl.g:2144:1: rule__Student__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2148:1: ( ( ',' ) )
            // InternalDsl.g:2149:1: ( ',' )
            {
            // InternalDsl.g:2149:1: ( ',' )
            // InternalDsl.g:2150:2: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_9_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Student__Group_9__0__Impl"


    // $ANTLR start "rule__Student__Group_9__1"
    // InternalDsl.g:2159:1: rule__Student__Group_9__1 : rule__Student__Group_9__1__Impl ;
    public final void rule__Student__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2163:1: ( rule__Student__Group_9__1__Impl )
            // InternalDsl.g:2164:2: rule__Student__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_9__1__Impl();

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
    // $ANTLR end "rule__Student__Group_9__1"


    // $ANTLR start "rule__Student__Group_9__1__Impl"
    // InternalDsl.g:2170:1: rule__Student__Group_9__1__Impl : ( ( rule__Student__FollowAssignment_9_1 ) ) ;
    public final void rule__Student__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2174:1: ( ( ( rule__Student__FollowAssignment_9_1 ) ) )
            // InternalDsl.g:2175:1: ( ( rule__Student__FollowAssignment_9_1 ) )
            {
            // InternalDsl.g:2175:1: ( ( rule__Student__FollowAssignment_9_1 ) )
            // InternalDsl.g:2176:2: ( rule__Student__FollowAssignment_9_1 )
            {
             before(grammarAccess.getStudentAccess().getFollowAssignment_9_1()); 
            // InternalDsl.g:2177:2: ( rule__Student__FollowAssignment_9_1 )
            // InternalDsl.g:2177:3: rule__Student__FollowAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__FollowAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getFollowAssignment_9_1()); 

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
    // $ANTLR end "rule__Student__Group_9__1__Impl"


    // $ANTLR start "rule__University__NameAssignment_2"
    // InternalDsl.g:2186:1: rule__University__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__University__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2190:1: ( ( ruleEString ) )
            // InternalDsl.g:2191:2: ( ruleEString )
            {
            // InternalDsl.g:2191:2: ( ruleEString )
            // InternalDsl.g:2192:3: ruleEString
            {
             before(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__University__NameAssignment_2"


    // $ANTLR start "rule__University__ContainAssignment_4_2"
    // InternalDsl.g:2201:1: rule__University__ContainAssignment_4_2 : ( ruleSchool ) ;
    public final void rule__University__ContainAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2205:1: ( ( ruleSchool ) )
            // InternalDsl.g:2206:2: ( ruleSchool )
            {
            // InternalDsl.g:2206:2: ( ruleSchool )
            // InternalDsl.g:2207:3: ruleSchool
            {
             before(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__University__ContainAssignment_4_2"


    // $ANTLR start "rule__University__ContainAssignment_4_3_1"
    // InternalDsl.g:2216:1: rule__University__ContainAssignment_4_3_1 : ( ruleSchool ) ;
    public final void rule__University__ContainAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2220:1: ( ( ruleSchool ) )
            // InternalDsl.g:2221:2: ( ruleSchool )
            {
            // InternalDsl.g:2221:2: ( ruleSchool )
            // InternalDsl.g:2222:3: ruleSchool
            {
             before(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getContainSchoolParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__University__ContainAssignment_4_3_1"


    // $ANTLR start "rule__School__NameAssignment_2"
    // InternalDsl.g:2231:1: rule__School__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__School__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2235:1: ( ( ruleEString ) )
            // InternalDsl.g:2236:2: ( ruleEString )
            {
            // InternalDsl.g:2236:2: ( ruleEString )
            // InternalDsl.g:2237:3: ruleEString
            {
             before(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__School__NameAssignment_2"


    // $ANTLR start "rule__School__SidAssignment_4_1"
    // InternalDsl.g:2246:1: rule__School__SidAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__School__SidAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2250:1: ( ( ruleEInt ) )
            // InternalDsl.g:2251:2: ( ruleEInt )
            {
            // InternalDsl.g:2251:2: ( ruleEInt )
            // InternalDsl.g:2252:3: ruleEInt
            {
             before(grammarAccess.getSchoolAccess().getSidEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getSidEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__School__SidAssignment_4_1"


    // $ANTLR start "rule__School__ContainPersonAssignment_5_2"
    // InternalDsl.g:2261:1: rule__School__ContainPersonAssignment_5_2 : ( rulePerson ) ;
    public final void rule__School__ContainPersonAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2265:1: ( ( rulePerson ) )
            // InternalDsl.g:2266:2: ( rulePerson )
            {
            // InternalDsl.g:2266:2: ( rulePerson )
            // InternalDsl.g:2267:3: rulePerson
            {
             before(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__School__ContainPersonAssignment_5_2"


    // $ANTLR start "rule__School__ContainPersonAssignment_5_3_1"
    // InternalDsl.g:2276:1: rule__School__ContainPersonAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__School__ContainPersonAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2280:1: ( ( rulePerson ) )
            // InternalDsl.g:2281:2: ( rulePerson )
            {
            // InternalDsl.g:2281:2: ( rulePerson )
            // InternalDsl.g:2282:3: rulePerson
            {
             before(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getContainPersonPersonParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__School__ContainPersonAssignment_5_3_1"


    // $ANTLR start "rule__Teacher__NameAssignment_2"
    // InternalDsl.g:2291:1: rule__Teacher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Teacher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2295:1: ( ( ruleEString ) )
            // InternalDsl.g:2296:2: ( ruleEString )
            {
            // InternalDsl.g:2296:2: ( ruleEString )
            // InternalDsl.g:2297:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Teacher__NameAssignment_2"


    // $ANTLR start "rule__Teacher__IdAssignment_4_1"
    // InternalDsl.g:2306:1: rule__Teacher__IdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Teacher__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( ( ruleEString ) )
            // InternalDsl.g:2311:2: ( ruleEString )
            {
            // InternalDsl.g:2311:2: ( ruleEString )
            // InternalDsl.g:2312:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getIdEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Teacher__IdAssignment_4_1"


    // $ANTLR start "rule__Teacher__WorkInAssignment_5_2"
    // InternalDsl.g:2321:1: rule__Teacher__WorkInAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__WorkInAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2326:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2326:2: ( ( ruleEString ) )
            // InternalDsl.g:2327:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_2_0()); 
            // InternalDsl.g:2328:3: ( ruleEString )
            // InternalDsl.g:2329:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getWorkInSchoolEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getWorkInSchoolEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Teacher__WorkInAssignment_5_2"


    // $ANTLR start "rule__Teacher__WorkInAssignment_5_3_1"
    // InternalDsl.g:2340:1: rule__Teacher__WorkInAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__WorkInAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2345:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2345:2: ( ( ruleEString ) )
            // InternalDsl.g:2346:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_3_1_0()); 
            // InternalDsl.g:2347:3: ( ruleEString )
            // InternalDsl.g:2348:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getWorkInSchoolEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getWorkInSchoolEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getWorkInSchoolCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Teacher__WorkInAssignment_5_3_1"


    // $ANTLR start "rule__Teacher__TeachAssignment_6_2"
    // InternalDsl.g:2359:1: rule__Teacher__TeachAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__TeachAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2363:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2364:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2364:2: ( ( ruleEString ) )
            // InternalDsl.g:2365:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_2_0()); 
            // InternalDsl.g:2366:3: ( ruleEString )
            // InternalDsl.g:2367:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getTeachStudentEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachStudentEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__Teacher__TeachAssignment_6_2"


    // $ANTLR start "rule__Teacher__TeachAssignment_6_3_1"
    // InternalDsl.g:2378:1: rule__Teacher__TeachAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__TeachAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2383:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2383:2: ( ( ruleEString ) )
            // InternalDsl.g:2384:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_3_1_0()); 
            // InternalDsl.g:2385:3: ( ruleEString )
            // InternalDsl.g:2386:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getTeachStudentEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachStudentEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getTeachStudentCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__Teacher__TeachAssignment_6_3_1"


    // $ANTLR start "rule__Student__NameAssignment_1"
    // InternalDsl.g:2397:1: rule__Student__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Student__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2401:1: ( ( ruleEString ) )
            // InternalDsl.g:2402:2: ( ruleEString )
            {
            // InternalDsl.g:2402:2: ( ruleEString )
            // InternalDsl.g:2403:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Student__NameAssignment_1"


    // $ANTLR start "rule__Student__IdAssignment_3_1"
    // InternalDsl.g:2412:1: rule__Student__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Student__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2416:1: ( ( ruleEString ) )
            // InternalDsl.g:2417:2: ( ruleEString )
            {
            // InternalDsl.g:2417:2: ( ruleEString )
            // InternalDsl.g:2418:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Student__IdAssignment_3_1"


    // $ANTLR start "rule__Student__StudyInAssignment_5"
    // InternalDsl.g:2427:1: rule__Student__StudyInAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Student__StudyInAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2431:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2432:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2432:2: ( ( ruleEString ) )
            // InternalDsl.g:2433:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getStudyInSchoolCrossReference_5_0()); 
            // InternalDsl.g:2434:3: ( ruleEString )
            // InternalDsl.g:2435:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getStudyInSchoolEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getStudyInSchoolEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getStudyInSchoolCrossReference_5_0()); 

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
    // $ANTLR end "rule__Student__StudyInAssignment_5"


    // $ANTLR start "rule__Student__FollowAssignment_8"
    // InternalDsl.g:2446:1: rule__Student__FollowAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Student__FollowAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2450:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2451:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2451:2: ( ( ruleEString ) )
            // InternalDsl.g:2452:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_8_0()); 
            // InternalDsl.g:2453:3: ( ruleEString )
            // InternalDsl.g:2454:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getFollowTeacherEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getFollowTeacherEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_8_0()); 

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
    // $ANTLR end "rule__Student__FollowAssignment_8"


    // $ANTLR start "rule__Student__FollowAssignment_9_1"
    // InternalDsl.g:2465:1: rule__Student__FollowAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__Student__FollowAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2469:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2470:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2470:2: ( ( ruleEString ) )
            // InternalDsl.g:2471:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_9_1_0()); 
            // InternalDsl.g:2472:3: ( ruleEString )
            // InternalDsl.g:2473:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getFollowTeacherEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getFollowTeacherEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getFollowTeacherCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__Student__FollowAssignment_9_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002602000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});

}