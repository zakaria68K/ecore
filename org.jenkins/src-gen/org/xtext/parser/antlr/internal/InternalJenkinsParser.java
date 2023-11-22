package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.JenkinsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJenkinsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'agent'", "'stages'", "','", "'}'", "'Agent'", "'type'", "'Stages'", "'tests'", "'cloning'", "'build'", "'deploy'", "'Tests'", "'shell'", "'classestotest'", "'credentials'", "'Cloning'", "'url'", "'credentialID'", "'branch'", "'Build'", "'cmd'", "'Deploy'", "'variable'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJenkinsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJenkinsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJenkinsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJenkins.g"; }



     	private JenkinsGrammarAccess grammarAccess;

        public InternalJenkinsParser(TokenStream input, JenkinsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "config";
       	}

       	@Override
       	protected JenkinsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleconfig"
    // InternalJenkins.g:64:1: entryRuleconfig returns [EObject current=null] : iv_ruleconfig= ruleconfig EOF ;
    public final EObject entryRuleconfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconfig = null;


        try {
            // InternalJenkins.g:64:47: (iv_ruleconfig= ruleconfig EOF )
            // InternalJenkins.g:65:2: iv_ruleconfig= ruleconfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconfig=ruleconfig();

            state._fsp--;

             current =iv_ruleconfig; 
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
    // $ANTLR end "entryRuleconfig"


    // $ANTLR start "ruleconfig"
    // InternalJenkins.g:71:1: ruleconfig returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'agent' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= 'stages' otherlv_6= '{' ( (lv_stages_7_0= ruleStages ) ) (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleconfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_agent_4_0 = null;

        EObject lv_stages_7_0 = null;

        EObject lv_stages_9_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:77:2: ( (otherlv_0= 'config' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'agent' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= 'stages' otherlv_6= '{' ( (lv_stages_7_0= ruleStages ) ) (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalJenkins.g:78:2: (otherlv_0= 'config' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'agent' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= 'stages' otherlv_6= '{' ( (lv_stages_7_0= ruleStages ) ) (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalJenkins.g:78:2: (otherlv_0= 'config' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'agent' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= 'stages' otherlv_6= '{' ( (lv_stages_7_0= ruleStages ) ) (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalJenkins.g:79:3: otherlv_0= 'config' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'agent' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= 'stages' otherlv_6= '{' ( (lv_stages_7_0= ruleStages ) ) (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            // InternalJenkins.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalJenkins.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalJenkins.g:84:4: (lv_name_1_0= ruleEString )
            // InternalJenkins.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Jenkins.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getAgentKeyword_3());
            		
            // InternalJenkins.g:110:3: ( (lv_agent_4_0= ruleAgent ) )
            // InternalJenkins.g:111:4: (lv_agent_4_0= ruleAgent )
            {
            // InternalJenkins.g:111:4: (lv_agent_4_0= ruleAgent )
            // InternalJenkins.g:112:5: lv_agent_4_0= ruleAgent
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getAgentAgentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_agent_4_0=ruleAgent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					set(
            						current,
            						"agent",
            						lv_agent_4_0,
            						"org.xtext.Jenkins.Agent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getStagesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalJenkins.g:137:3: ( (lv_stages_7_0= ruleStages ) )
            // InternalJenkins.g:138:4: (lv_stages_7_0= ruleStages )
            {
            // InternalJenkins.g:138:4: (lv_stages_7_0= ruleStages )
            // InternalJenkins.g:139:5: lv_stages_7_0= ruleStages
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getStagesStagesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_stages_7_0=ruleStages();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"stages",
            						lv_stages_7_0,
            						"org.xtext.Jenkins.Stages");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJenkins.g:156:3: (otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJenkins.g:157:4: otherlv_8= ',' ( (lv_stages_9_0= ruleStages ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalJenkins.g:161:4: ( (lv_stages_9_0= ruleStages ) )
            	    // InternalJenkins.g:162:5: (lv_stages_9_0= ruleStages )
            	    {
            	    // InternalJenkins.g:162:5: (lv_stages_9_0= ruleStages )
            	    // InternalJenkins.g:163:6: lv_stages_9_0= ruleStages
            	    {

            	    						newCompositeNode(grammarAccess.getConfigAccess().getStagesStagesParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_stages_9_0=ruleStages();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stages",
            	    							lv_stages_9_0,
            	    							"org.xtext.Jenkins.Stages");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleconfig"


    // $ANTLR start "entryRuleEString"
    // InternalJenkins.g:193:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJenkins.g:193:47: (iv_ruleEString= ruleEString EOF )
            // InternalJenkins.g:194:2: iv_ruleEString= ruleEString EOF
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
    // InternalJenkins.g:200:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJenkins.g:206:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJenkins.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJenkins.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalJenkins.g:208:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkins.g:216:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAgent"
    // InternalJenkins.g:227:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalJenkins.g:227:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalJenkins.g:228:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalJenkins.g:234:1: ruleAgent returns [EObject current=null] : ( () otherlv_1= 'Agent' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:240:2: ( ( () otherlv_1= 'Agent' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalJenkins.g:241:2: ( () otherlv_1= 'Agent' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalJenkins.g:241:2: ( () otherlv_1= 'Agent' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalJenkins.g:242:3: () otherlv_1= 'Agent' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalJenkins.g:242:3: ()
            // InternalJenkins.g:243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentAccess().getAgentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAgentAccess().getAgentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJenkins.g:257:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJenkins.g:258:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getTypeKeyword_3_0());
                    			
                    // InternalJenkins.g:262:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalJenkins.g:263:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalJenkins.g:263:5: (lv_type_4_0= ruleEString )
                    // InternalJenkins.g:264:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAgentAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleStages"
    // InternalJenkins.g:290:1: entryRuleStages returns [EObject current=null] : iv_ruleStages= ruleStages EOF ;
    public final EObject entryRuleStages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStages = null;


        try {
            // InternalJenkins.g:290:47: (iv_ruleStages= ruleStages EOF )
            // InternalJenkins.g:291:2: iv_ruleStages= ruleStages EOF
            {
             newCompositeNode(grammarAccess.getStagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStages=ruleStages();

            state._fsp--;

             current =iv_ruleStages; 
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
    // $ANTLR end "entryRuleStages"


    // $ANTLR start "ruleStages"
    // InternalJenkins.g:297:1: ruleStages returns [EObject current=null] : (otherlv_0= 'Stages' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tests' ( (lv_tests_4_0= ruleTests ) ) otherlv_5= 'cloning' ( (lv_cloning_6_0= ruleCloning ) ) otherlv_7= 'build' ( (lv_build_8_0= ruleBuild ) ) otherlv_9= 'deploy' ( (lv_deploy_10_0= ruleDeploy ) ) otherlv_11= '}' ) ;
    public final EObject ruleStages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tests_4_0 = null;

        EObject lv_cloning_6_0 = null;

        EObject lv_build_8_0 = null;

        EObject lv_deploy_10_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:303:2: ( (otherlv_0= 'Stages' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tests' ( (lv_tests_4_0= ruleTests ) ) otherlv_5= 'cloning' ( (lv_cloning_6_0= ruleCloning ) ) otherlv_7= 'build' ( (lv_build_8_0= ruleBuild ) ) otherlv_9= 'deploy' ( (lv_deploy_10_0= ruleDeploy ) ) otherlv_11= '}' ) )
            // InternalJenkins.g:304:2: (otherlv_0= 'Stages' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tests' ( (lv_tests_4_0= ruleTests ) ) otherlv_5= 'cloning' ( (lv_cloning_6_0= ruleCloning ) ) otherlv_7= 'build' ( (lv_build_8_0= ruleBuild ) ) otherlv_9= 'deploy' ( (lv_deploy_10_0= ruleDeploy ) ) otherlv_11= '}' )
            {
            // InternalJenkins.g:304:2: (otherlv_0= 'Stages' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tests' ( (lv_tests_4_0= ruleTests ) ) otherlv_5= 'cloning' ( (lv_cloning_6_0= ruleCloning ) ) otherlv_7= 'build' ( (lv_build_8_0= ruleBuild ) ) otherlv_9= 'deploy' ( (lv_deploy_10_0= ruleDeploy ) ) otherlv_11= '}' )
            // InternalJenkins.g:305:3: otherlv_0= 'Stages' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tests' ( (lv_tests_4_0= ruleTests ) ) otherlv_5= 'cloning' ( (lv_cloning_6_0= ruleCloning ) ) otherlv_7= 'build' ( (lv_build_8_0= ruleBuild ) ) otherlv_9= 'deploy' ( (lv_deploy_10_0= ruleDeploy ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStagesAccess().getStagesKeyword_0());
            		
            // InternalJenkins.g:309:3: ( (lv_name_1_0= ruleEString ) )
            // InternalJenkins.g:310:4: (lv_name_1_0= ruleEString )
            {
            // InternalJenkins.g:310:4: (lv_name_1_0= ruleEString )
            // InternalJenkins.g:311:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStagesAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStagesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Jenkins.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStagesAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStagesAccess().getTestsKeyword_3());
            		
            // InternalJenkins.g:336:3: ( (lv_tests_4_0= ruleTests ) )
            // InternalJenkins.g:337:4: (lv_tests_4_0= ruleTests )
            {
            // InternalJenkins.g:337:4: (lv_tests_4_0= ruleTests )
            // InternalJenkins.g:338:5: lv_tests_4_0= ruleTests
            {

            					newCompositeNode(grammarAccess.getStagesAccess().getTestsTestsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_tests_4_0=ruleTests();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStagesRule());
            					}
            					set(
            						current,
            						"tests",
            						lv_tests_4_0,
            						"org.xtext.Jenkins.Tests");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getStagesAccess().getCloningKeyword_5());
            		
            // InternalJenkins.g:359:3: ( (lv_cloning_6_0= ruleCloning ) )
            // InternalJenkins.g:360:4: (lv_cloning_6_0= ruleCloning )
            {
            // InternalJenkins.g:360:4: (lv_cloning_6_0= ruleCloning )
            // InternalJenkins.g:361:5: lv_cloning_6_0= ruleCloning
            {

            					newCompositeNode(grammarAccess.getStagesAccess().getCloningCloningParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_cloning_6_0=ruleCloning();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStagesRule());
            					}
            					set(
            						current,
            						"cloning",
            						lv_cloning_6_0,
            						"org.xtext.Jenkins.Cloning");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getStagesAccess().getBuildKeyword_7());
            		
            // InternalJenkins.g:382:3: ( (lv_build_8_0= ruleBuild ) )
            // InternalJenkins.g:383:4: (lv_build_8_0= ruleBuild )
            {
            // InternalJenkins.g:383:4: (lv_build_8_0= ruleBuild )
            // InternalJenkins.g:384:5: lv_build_8_0= ruleBuild
            {

            					newCompositeNode(grammarAccess.getStagesAccess().getBuildBuildParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_build_8_0=ruleBuild();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStagesRule());
            					}
            					set(
            						current,
            						"build",
            						lv_build_8_0,
            						"org.xtext.Jenkins.Build");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getStagesAccess().getDeployKeyword_9());
            		
            // InternalJenkins.g:405:3: ( (lv_deploy_10_0= ruleDeploy ) )
            // InternalJenkins.g:406:4: (lv_deploy_10_0= ruleDeploy )
            {
            // InternalJenkins.g:406:4: (lv_deploy_10_0= ruleDeploy )
            // InternalJenkins.g:407:5: lv_deploy_10_0= ruleDeploy
            {

            					newCompositeNode(grammarAccess.getStagesAccess().getDeployDeployParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_deploy_10_0=ruleDeploy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStagesRule());
            					}
            					set(
            						current,
            						"deploy",
            						lv_deploy_10_0,
            						"org.xtext.Jenkins.Deploy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getStagesAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleStages"


    // $ANTLR start "entryRuleTests"
    // InternalJenkins.g:432:1: entryRuleTests returns [EObject current=null] : iv_ruleTests= ruleTests EOF ;
    public final EObject entryRuleTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTests = null;


        try {
            // InternalJenkins.g:432:46: (iv_ruleTests= ruleTests EOF )
            // InternalJenkins.g:433:2: iv_ruleTests= ruleTests EOF
            {
             newCompositeNode(grammarAccess.getTestsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTests=ruleTests();

            state._fsp--;

             current =iv_ruleTests; 
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
    // $ANTLR end "entryRuleTests"


    // $ANTLR start "ruleTests"
    // InternalJenkins.g:439:1: ruleTests returns [EObject current=null] : ( () otherlv_1= 'Tests' otherlv_2= '{' (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )? (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )? (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )? (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleTests() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_shell_4_0 = null;

        AntlrDatatypeRuleToken lv_classestotest_6_0 = null;

        EObject lv_agent_8_0 = null;

        EObject lv_credentials_11_0 = null;

        EObject lv_credentials_13_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:445:2: ( ( () otherlv_1= 'Tests' otherlv_2= '{' (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )? (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )? (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )? (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalJenkins.g:446:2: ( () otherlv_1= 'Tests' otherlv_2= '{' (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )? (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )? (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )? (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalJenkins.g:446:2: ( () otherlv_1= 'Tests' otherlv_2= '{' (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )? (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )? (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )? (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalJenkins.g:447:3: () otherlv_1= 'Tests' otherlv_2= '{' (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )? (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )? (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )? (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalJenkins.g:447:3: ()
            // InternalJenkins.g:448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestsAccess().getTestsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestsAccess().getTestsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTestsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJenkins.g:462:3: (otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJenkins.g:463:4: otherlv_3= 'shell' ( (lv_shell_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTestsAccess().getShellKeyword_3_0());
                    			
                    // InternalJenkins.g:467:4: ( (lv_shell_4_0= ruleEString ) )
                    // InternalJenkins.g:468:5: (lv_shell_4_0= ruleEString )
                    {
                    // InternalJenkins.g:468:5: (lv_shell_4_0= ruleEString )
                    // InternalJenkins.g:469:6: lv_shell_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestsAccess().getShellEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_shell_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestsRule());
                    						}
                    						set(
                    							current,
                    							"shell",
                    							lv_shell_4_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:487:3: (otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJenkins.g:488:4: otherlv_5= 'classestotest' ( (lv_classestotest_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestsAccess().getClassestotestKeyword_4_0());
                    			
                    // InternalJenkins.g:492:4: ( (lv_classestotest_6_0= ruleEString ) )
                    // InternalJenkins.g:493:5: (lv_classestotest_6_0= ruleEString )
                    {
                    // InternalJenkins.g:493:5: (lv_classestotest_6_0= ruleEString )
                    // InternalJenkins.g:494:6: lv_classestotest_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestsAccess().getClassestotestEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_classestotest_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestsRule());
                    						}
                    						set(
                    							current,
                    							"classestotest",
                    							lv_classestotest_6_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:512:3: (otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJenkins.g:513:4: otherlv_7= 'agent' ( (lv_agent_8_0= ruleAgent ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestsAccess().getAgentKeyword_5_0());
                    			
                    // InternalJenkins.g:517:4: ( (lv_agent_8_0= ruleAgent ) )
                    // InternalJenkins.g:518:5: (lv_agent_8_0= ruleAgent )
                    {
                    // InternalJenkins.g:518:5: (lv_agent_8_0= ruleAgent )
                    // InternalJenkins.g:519:6: lv_agent_8_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getTestsAccess().getAgentAgentParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_agent_8_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestsRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_8_0,
                    							"org.xtext.Jenkins.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:537:3: (otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJenkins.g:538:4: otherlv_9= 'credentials' otherlv_10= '{' ( (lv_credentials_11_0= rulecredentials ) ) (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTestsAccess().getCredentialsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getTestsAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalJenkins.g:546:4: ( (lv_credentials_11_0= rulecredentials ) )
                    // InternalJenkins.g:547:5: (lv_credentials_11_0= rulecredentials )
                    {
                    // InternalJenkins.g:547:5: (lv_credentials_11_0= rulecredentials )
                    // InternalJenkins.g:548:6: lv_credentials_11_0= rulecredentials
                    {

                    						newCompositeNode(grammarAccess.getTestsAccess().getCredentialsCredentialsParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_credentials_11_0=rulecredentials();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestsRule());
                    						}
                    						add(
                    							current,
                    							"credentials",
                    							lv_credentials_11_0,
                    							"org.xtext.Jenkins.credentials");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJenkins.g:565:4: (otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJenkins.g:566:5: otherlv_12= ',' ( (lv_credentials_13_0= rulecredentials ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTestsAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalJenkins.g:570:5: ( (lv_credentials_13_0= rulecredentials ) )
                    	    // InternalJenkins.g:571:6: (lv_credentials_13_0= rulecredentials )
                    	    {
                    	    // InternalJenkins.g:571:6: (lv_credentials_13_0= rulecredentials )
                    	    // InternalJenkins.g:572:7: lv_credentials_13_0= rulecredentials
                    	    {

                    	    							newCompositeNode(grammarAccess.getTestsAccess().getCredentialsCredentialsParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_credentials_13_0=rulecredentials();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTestsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"credentials",
                    	    								lv_credentials_13_0,
                    	    								"org.xtext.Jenkins.credentials");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getTestsAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTestsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTests"


    // $ANTLR start "entryRuleCloning"
    // InternalJenkins.g:603:1: entryRuleCloning returns [EObject current=null] : iv_ruleCloning= ruleCloning EOF ;
    public final EObject entryRuleCloning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloning = null;


        try {
            // InternalJenkins.g:603:48: (iv_ruleCloning= ruleCloning EOF )
            // InternalJenkins.g:604:2: iv_ruleCloning= ruleCloning EOF
            {
             newCompositeNode(grammarAccess.getCloningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloning=ruleCloning();

            state._fsp--;

             current =iv_ruleCloning; 
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
    // $ANTLR end "entryRuleCloning"


    // $ANTLR start "ruleCloning"
    // InternalJenkins.g:610:1: ruleCloning returns [EObject current=null] : ( () otherlv_1= 'Cloning' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )? (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )? (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCloning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;

        AntlrDatatypeRuleToken lv_credentialID_6_0 = null;

        AntlrDatatypeRuleToken lv_branch_8_0 = null;

        EObject lv_agent_10_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:616:2: ( ( () otherlv_1= 'Cloning' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )? (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )? (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )? otherlv_11= '}' ) )
            // InternalJenkins.g:617:2: ( () otherlv_1= 'Cloning' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )? (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )? (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )? otherlv_11= '}' )
            {
            // InternalJenkins.g:617:2: ( () otherlv_1= 'Cloning' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )? (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )? (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )? otherlv_11= '}' )
            // InternalJenkins.g:618:3: () otherlv_1= 'Cloning' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )? (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )? (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )? otherlv_11= '}'
            {
            // InternalJenkins.g:618:3: ()
            // InternalJenkins.g:619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloningAccess().getCloningAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCloningAccess().getCloningKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getCloningAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJenkins.g:633:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJenkins.g:634:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCloningAccess().getUrlKeyword_3_0());
                    			
                    // InternalJenkins.g:638:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalJenkins.g:639:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalJenkins.g:639:5: (lv_url_4_0= ruleEString )
                    // InternalJenkins.g:640:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCloningAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCloningRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:658:3: (otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJenkins.g:659:4: otherlv_5= 'credentialID' ( (lv_credentialID_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCloningAccess().getCredentialIDKeyword_4_0());
                    			
                    // InternalJenkins.g:663:4: ( (lv_credentialID_6_0= ruleEString ) )
                    // InternalJenkins.g:664:5: (lv_credentialID_6_0= ruleEString )
                    {
                    // InternalJenkins.g:664:5: (lv_credentialID_6_0= ruleEString )
                    // InternalJenkins.g:665:6: lv_credentialID_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCloningAccess().getCredentialIDEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_credentialID_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCloningRule());
                    						}
                    						set(
                    							current,
                    							"credentialID",
                    							lv_credentialID_6_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:683:3: (otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJenkins.g:684:4: otherlv_7= 'branch' ( (lv_branch_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCloningAccess().getBranchKeyword_5_0());
                    			
                    // InternalJenkins.g:688:4: ( (lv_branch_8_0= ruleEString ) )
                    // InternalJenkins.g:689:5: (lv_branch_8_0= ruleEString )
                    {
                    // InternalJenkins.g:689:5: (lv_branch_8_0= ruleEString )
                    // InternalJenkins.g:690:6: lv_branch_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCloningAccess().getBranchEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_branch_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCloningRule());
                    						}
                    						set(
                    							current,
                    							"branch",
                    							lv_branch_8_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:708:3: (otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJenkins.g:709:4: otherlv_9= 'agent' ( (lv_agent_10_0= ruleAgent ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getCloningAccess().getAgentKeyword_6_0());
                    			
                    // InternalJenkins.g:713:4: ( (lv_agent_10_0= ruleAgent ) )
                    // InternalJenkins.g:714:5: (lv_agent_10_0= ruleAgent )
                    {
                    // InternalJenkins.g:714:5: (lv_agent_10_0= ruleAgent )
                    // InternalJenkins.g:715:6: lv_agent_10_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getCloningAccess().getAgentAgentParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_agent_10_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCloningRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_10_0,
                    							"org.xtext.Jenkins.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCloningAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCloning"


    // $ANTLR start "entryRuleBuild"
    // InternalJenkins.g:741:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalJenkins.g:741:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalJenkins.g:742:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalJenkins.g:748:1: ruleBuild returns [EObject current=null] : ( () otherlv_1= 'Build' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )? (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_cmd_4_0 = null;

        EObject lv_agent_6_0 = null;

        EObject lv_credentials_9_0 = null;

        EObject lv_credentials_11_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:754:2: ( ( () otherlv_1= 'Build' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )? (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalJenkins.g:755:2: ( () otherlv_1= 'Build' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )? (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalJenkins.g:755:2: ( () otherlv_1= 'Build' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )? (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalJenkins.g:756:3: () otherlv_1= 'Build' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )? (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalJenkins.g:756:3: ()
            // InternalJenkins.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildAccess().getBuildAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildAccess().getBuildKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJenkins.g:771:3: (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJenkins.g:772:4: otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getCmdKeyword_3_0());
                    			
                    // InternalJenkins.g:776:4: ( (lv_cmd_4_0= ruleEString ) )
                    // InternalJenkins.g:777:5: (lv_cmd_4_0= ruleEString )
                    {
                    // InternalJenkins.g:777:5: (lv_cmd_4_0= ruleEString )
                    // InternalJenkins.g:778:6: lv_cmd_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBuildAccess().getCmdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_cmd_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRule());
                    						}
                    						set(
                    							current,
                    							"cmd",
                    							lv_cmd_4_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:796:3: (otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJenkins.g:797:4: otherlv_5= 'agent' ( (lv_agent_6_0= ruleAgent ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getBuildAccess().getAgentKeyword_4_0());
                    			
                    // InternalJenkins.g:801:4: ( (lv_agent_6_0= ruleAgent ) )
                    // InternalJenkins.g:802:5: (lv_agent_6_0= ruleAgent )
                    {
                    // InternalJenkins.g:802:5: (lv_agent_6_0= ruleAgent )
                    // InternalJenkins.g:803:6: lv_agent_6_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getBuildAccess().getAgentAgentParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_agent_6_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_6_0,
                    							"org.xtext.Jenkins.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:821:3: (otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJenkins.g:822:4: otherlv_7= 'credentials' otherlv_8= '{' ( (lv_credentials_9_0= rulecredentials ) ) (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getBuildAccess().getCredentialsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJenkins.g:830:4: ( (lv_credentials_9_0= rulecredentials ) )
                    // InternalJenkins.g:831:5: (lv_credentials_9_0= rulecredentials )
                    {
                    // InternalJenkins.g:831:5: (lv_credentials_9_0= rulecredentials )
                    // InternalJenkins.g:832:6: lv_credentials_9_0= rulecredentials
                    {

                    						newCompositeNode(grammarAccess.getBuildAccess().getCredentialsCredentialsParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_credentials_9_0=rulecredentials();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRule());
                    						}
                    						add(
                    							current,
                    							"credentials",
                    							lv_credentials_9_0,
                    							"org.xtext.Jenkins.credentials");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJenkins.g:849:4: (otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalJenkins.g:850:5: otherlv_10= ',' ( (lv_credentials_11_0= rulecredentials ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBuildAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalJenkins.g:854:5: ( (lv_credentials_11_0= rulecredentials ) )
                    	    // InternalJenkins.g:855:6: (lv_credentials_11_0= rulecredentials )
                    	    {
                    	    // InternalJenkins.g:855:6: (lv_credentials_11_0= rulecredentials )
                    	    // InternalJenkins.g:856:7: lv_credentials_11_0= rulecredentials
                    	    {

                    	    							newCompositeNode(grammarAccess.getBuildAccess().getCredentialsCredentialsParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_credentials_11_0=rulecredentials();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBuildRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"credentials",
                    	    								lv_credentials_11_0,
                    	    								"org.xtext.Jenkins.credentials");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleDeploy"
    // InternalJenkins.g:887:1: entryRuleDeploy returns [EObject current=null] : iv_ruleDeploy= ruleDeploy EOF ;
    public final EObject entryRuleDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploy = null;


        try {
            // InternalJenkins.g:887:47: (iv_ruleDeploy= ruleDeploy EOF )
            // InternalJenkins.g:888:2: iv_ruleDeploy= ruleDeploy EOF
            {
             newCompositeNode(grammarAccess.getDeployRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploy=ruleDeploy();

            state._fsp--;

             current =iv_ruleDeploy; 
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
    // $ANTLR end "entryRuleDeploy"


    // $ANTLR start "ruleDeploy"
    // InternalJenkins.g:894:1: ruleDeploy returns [EObject current=null] : ( () otherlv_1= 'Deploy' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleDeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_cmd_4_0 = null;

        EObject lv_credentials_7_0 = null;

        EObject lv_credentials_9_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:900:2: ( ( () otherlv_1= 'Deploy' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalJenkins.g:901:2: ( () otherlv_1= 'Deploy' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalJenkins.g:901:2: ( () otherlv_1= 'Deploy' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalJenkins.g:902:3: () otherlv_1= 'Deploy' otherlv_2= '{' (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )? (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalJenkins.g:902:3: ()
            // InternalJenkins.g:903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeployAccess().getDeployAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeployAccess().getDeployKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJenkins.g:917:3: (otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJenkins.g:918:4: otherlv_3= 'cmd' ( (lv_cmd_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeployAccess().getCmdKeyword_3_0());
                    			
                    // InternalJenkins.g:922:4: ( (lv_cmd_4_0= ruleEString ) )
                    // InternalJenkins.g:923:5: (lv_cmd_4_0= ruleEString )
                    {
                    // InternalJenkins.g:923:5: (lv_cmd_4_0= ruleEString )
                    // InternalJenkins.g:924:6: lv_cmd_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeployAccess().getCmdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_cmd_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeployRule());
                    						}
                    						set(
                    							current,
                    							"cmd",
                    							lv_cmd_4_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJenkins.g:942:3: (otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJenkins.g:943:4: otherlv_5= 'credentials' otherlv_6= '{' ( (lv_credentials_7_0= rulecredentials ) ) (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeployAccess().getCredentialsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalJenkins.g:951:4: ( (lv_credentials_7_0= rulecredentials ) )
                    // InternalJenkins.g:952:5: (lv_credentials_7_0= rulecredentials )
                    {
                    // InternalJenkins.g:952:5: (lv_credentials_7_0= rulecredentials )
                    // InternalJenkins.g:953:6: lv_credentials_7_0= rulecredentials
                    {

                    						newCompositeNode(grammarAccess.getDeployAccess().getCredentialsCredentialsParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_credentials_7_0=rulecredentials();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeployRule());
                    						}
                    						add(
                    							current,
                    							"credentials",
                    							lv_credentials_7_0,
                    							"org.xtext.Jenkins.credentials");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJenkins.g:970:4: (otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalJenkins.g:971:5: otherlv_8= ',' ( (lv_credentials_9_0= rulecredentials ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_24); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDeployAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalJenkins.g:975:5: ( (lv_credentials_9_0= rulecredentials ) )
                    	    // InternalJenkins.g:976:6: (lv_credentials_9_0= rulecredentials )
                    	    {
                    	    // InternalJenkins.g:976:6: (lv_credentials_9_0= rulecredentials )
                    	    // InternalJenkins.g:977:7: lv_credentials_9_0= rulecredentials
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeployAccess().getCredentialsCredentialsParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_credentials_9_0=rulecredentials();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeployRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"credentials",
                    	    								lv_credentials_9_0,
                    	    								"org.xtext.Jenkins.credentials");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDeploy"


    // $ANTLR start "entryRulecredentials"
    // InternalJenkins.g:1008:1: entryRulecredentials returns [EObject current=null] : iv_rulecredentials= rulecredentials EOF ;
    public final EObject entryRulecredentials() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecredentials = null;


        try {
            // InternalJenkins.g:1008:52: (iv_rulecredentials= rulecredentials EOF )
            // InternalJenkins.g:1009:2: iv_rulecredentials= rulecredentials EOF
            {
             newCompositeNode(grammarAccess.getCredentialsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecredentials=rulecredentials();

            state._fsp--;

             current =iv_rulecredentials; 
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
    // $ANTLR end "entryRulecredentials"


    // $ANTLR start "rulecredentials"
    // InternalJenkins.g:1015:1: rulecredentials returns [EObject current=null] : ( () otherlv_1= 'credentials' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject rulecredentials() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_variable_5_0 = null;



        	enterRule();

        try {
            // InternalJenkins.g:1021:2: ( ( () otherlv_1= 'credentials' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalJenkins.g:1022:2: ( () otherlv_1= 'credentials' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalJenkins.g:1022:2: ( () otherlv_1= 'credentials' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalJenkins.g:1023:3: () otherlv_1= 'credentials' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalJenkins.g:1023:3: ()
            // InternalJenkins.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCredentialsAccess().getCredentialsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCredentialsAccess().getCredentialsKeyword_1());
            		
            // InternalJenkins.g:1034:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJenkins.g:1035:4: (lv_name_2_0= ruleEString )
            {
            // InternalJenkins.g:1035:4: (lv_name_2_0= ruleEString )
            // InternalJenkins.g:1036:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCredentialsAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCredentialsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Jenkins.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJenkins.g:1057:3: (otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJenkins.g:1058:4: otherlv_4= 'variable' ( (lv_variable_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCredentialsAccess().getVariableKeyword_4_0());
                    			
                    // InternalJenkins.g:1062:4: ( (lv_variable_5_0= ruleEString ) )
                    // InternalJenkins.g:1063:5: (lv_variable_5_0= ruleEString )
                    {
                    // InternalJenkins.g:1063:5: (lv_variable_5_0= ruleEString )
                    // InternalJenkins.g:1064:6: lv_variable_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCredentialsAccess().getVariableEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_variable_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCredentialsRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_5_0,
                    							"org.xtext.Jenkins.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulecredentials"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000E012000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C012000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008012000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0012000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0012000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080012000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000208012000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000208010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800010000L});

}