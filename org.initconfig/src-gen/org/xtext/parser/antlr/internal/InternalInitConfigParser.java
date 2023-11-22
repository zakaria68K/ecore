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
import org.xtext.services.InitConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInitConfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Projet'", "'{'", "'url'", "'branch'", "'dependancesprojet'", "','", "'}'", "'configuration'", "'etapespersl'", "'DependancesProjet'", "'nom'", "'version'", "'Testing'", "'target'", "'cmdtest'", "'Etapespersl'", "'cmd'", "'description'"
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


        public InternalInitConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInitConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInitConfigParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInitConfig.g"; }



     	private InitConfigGrammarAccess grammarAccess;

        public InternalInitConfigParser(TokenStream input, InitConfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Projet";
       	}

       	@Override
       	protected InitConfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjet"
    // InternalInitConfig.g:64:1: entryRuleProjet returns [EObject current=null] : iv_ruleProjet= ruleProjet EOF ;
    public final EObject entryRuleProjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjet = null;


        try {
            // InternalInitConfig.g:64:47: (iv_ruleProjet= ruleProjet EOF )
            // InternalInitConfig.g:65:2: iv_ruleProjet= ruleProjet EOF
            {
             newCompositeNode(grammarAccess.getProjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjet=ruleProjet();

            state._fsp--;

             current =iv_ruleProjet; 
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
    // $ANTLR end "entryRuleProjet"


    // $ANTLR start "ruleProjet"
    // InternalInitConfig.g:71:1: ruleProjet returns [EObject current=null] : (otherlv_0= 'Projet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )? otherlv_7= 'dependancesprojet' otherlv_8= '{' ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) ) (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )* otherlv_12= '}' otherlv_13= 'configuration' ( (lv_configuration_14_0= ruleTesting ) ) (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleProjet() throws RecognitionException {
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_4_0 = null;

        AntlrDatatypeRuleToken lv_branch_6_0 = null;

        EObject lv_dependancesprojet_9_0 = null;

        EObject lv_dependancesprojet_11_0 = null;

        EObject lv_configuration_14_0 = null;

        EObject lv_etapespersl_17_0 = null;

        EObject lv_etapespersl_19_0 = null;



        	enterRule();

        try {
            // InternalInitConfig.g:77:2: ( (otherlv_0= 'Projet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )? otherlv_7= 'dependancesprojet' otherlv_8= '{' ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) ) (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )* otherlv_12= '}' otherlv_13= 'configuration' ( (lv_configuration_14_0= ruleTesting ) ) (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalInitConfig.g:78:2: (otherlv_0= 'Projet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )? otherlv_7= 'dependancesprojet' otherlv_8= '{' ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) ) (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )* otherlv_12= '}' otherlv_13= 'configuration' ( (lv_configuration_14_0= ruleTesting ) ) (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalInitConfig.g:78:2: (otherlv_0= 'Projet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )? otherlv_7= 'dependancesprojet' otherlv_8= '{' ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) ) (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )* otherlv_12= '}' otherlv_13= 'configuration' ( (lv_configuration_14_0= ruleTesting ) ) (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalInitConfig.g:79:3: otherlv_0= 'Projet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )? otherlv_7= 'dependancesprojet' otherlv_8= '{' ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) ) (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )* otherlv_12= '}' otherlv_13= 'configuration' ( (lv_configuration_14_0= ruleTesting ) ) (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjetAccess().getProjetKeyword_0());
            		
            // InternalInitConfig.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInitConfig.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalInitConfig.g:84:4: (lv_name_1_0= ruleEString )
            // InternalInitConfig.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.InitConfig.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInitConfig.g:106:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalInitConfig.g:107:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProjetAccess().getUrlKeyword_3_0());
                    			
                    // InternalInitConfig.g:111:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalInitConfig.g:112:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalInitConfig.g:112:5: (lv_url_4_0= ruleEString )
                    // InternalInitConfig.g:113:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProjetAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjetRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInitConfig.g:131:3: (otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalInitConfig.g:132:4: otherlv_5= 'branch' ( (lv_branch_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getProjetAccess().getBranchKeyword_4_0());
                    			
                    // InternalInitConfig.g:136:4: ( (lv_branch_6_0= ruleEString ) )
                    // InternalInitConfig.g:137:5: (lv_branch_6_0= ruleEString )
                    {
                    // InternalInitConfig.g:137:5: (lv_branch_6_0= ruleEString )
                    // InternalInitConfig.g:138:6: lv_branch_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProjetAccess().getBranchEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_branch_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjetRule());
                    						}
                    						set(
                    							current,
                    							"branch",
                    							lv_branch_6_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getProjetAccess().getDependancesprojetKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getProjetAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalInitConfig.g:164:3: ( (lv_dependancesprojet_9_0= ruleDependancesProjet ) )
            // InternalInitConfig.g:165:4: (lv_dependancesprojet_9_0= ruleDependancesProjet )
            {
            // InternalInitConfig.g:165:4: (lv_dependancesprojet_9_0= ruleDependancesProjet )
            // InternalInitConfig.g:166:5: lv_dependancesprojet_9_0= ruleDependancesProjet
            {

            					newCompositeNode(grammarAccess.getProjetAccess().getDependancesprojetDependancesProjetParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_dependancesprojet_9_0=ruleDependancesProjet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjetRule());
            					}
            					add(
            						current,
            						"dependancesprojet",
            						lv_dependancesprojet_9_0,
            						"org.xtext.InitConfig.DependancesProjet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInitConfig.g:183:3: (otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalInitConfig.g:184:4: otherlv_10= ',' ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_10, grammarAccess.getProjetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalInitConfig.g:188:4: ( (lv_dependancesprojet_11_0= ruleDependancesProjet ) )
            	    // InternalInitConfig.g:189:5: (lv_dependancesprojet_11_0= ruleDependancesProjet )
            	    {
            	    // InternalInitConfig.g:189:5: (lv_dependancesprojet_11_0= ruleDependancesProjet )
            	    // InternalInitConfig.g:190:6: lv_dependancesprojet_11_0= ruleDependancesProjet
            	    {

            	    						newCompositeNode(grammarAccess.getProjetAccess().getDependancesprojetDependancesProjetParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dependancesprojet_11_0=ruleDependancesProjet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dependancesprojet",
            	    							lv_dependancesprojet_11_0,
            	    							"org.xtext.InitConfig.DependancesProjet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getProjetAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getProjetAccess().getConfigurationKeyword_10());
            		
            // InternalInitConfig.g:216:3: ( (lv_configuration_14_0= ruleTesting ) )
            // InternalInitConfig.g:217:4: (lv_configuration_14_0= ruleTesting )
            {
            // InternalInitConfig.g:217:4: (lv_configuration_14_0= ruleTesting )
            // InternalInitConfig.g:218:5: lv_configuration_14_0= ruleTesting
            {

            					newCompositeNode(grammarAccess.getProjetAccess().getConfigurationTestingParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_configuration_14_0=ruleTesting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjetRule());
            					}
            					set(
            						current,
            						"configuration",
            						lv_configuration_14_0,
            						"org.xtext.InitConfig.Testing");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInitConfig.g:235:3: (otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInitConfig.g:236:4: otherlv_15= 'etapespersl' otherlv_16= '{' ( (lv_etapespersl_17_0= ruleEtapespersl ) ) (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjetAccess().getEtapesperslKeyword_12_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjetAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalInitConfig.g:244:4: ( (lv_etapespersl_17_0= ruleEtapespersl ) )
                    // InternalInitConfig.g:245:5: (lv_etapespersl_17_0= ruleEtapespersl )
                    {
                    // InternalInitConfig.g:245:5: (lv_etapespersl_17_0= ruleEtapespersl )
                    // InternalInitConfig.g:246:6: lv_etapespersl_17_0= ruleEtapespersl
                    {

                    						newCompositeNode(grammarAccess.getProjetAccess().getEtapesperslEtapesperslParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_etapespersl_17_0=ruleEtapespersl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjetRule());
                    						}
                    						add(
                    							current,
                    							"etapespersl",
                    							lv_etapespersl_17_0,
                    							"org.xtext.InitConfig.Etapespersl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInitConfig.g:263:4: (otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalInitConfig.g:264:5: otherlv_18= ',' ( (lv_etapespersl_19_0= ruleEtapespersl ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getProjetAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalInitConfig.g:268:5: ( (lv_etapespersl_19_0= ruleEtapespersl ) )
                    	    // InternalInitConfig.g:269:6: (lv_etapespersl_19_0= ruleEtapespersl )
                    	    {
                    	    // InternalInitConfig.g:269:6: (lv_etapespersl_19_0= ruleEtapespersl )
                    	    // InternalInitConfig.g:270:7: lv_etapespersl_19_0= ruleEtapespersl
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjetAccess().getEtapesperslEtapesperslParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_etapespersl_19_0=ruleEtapespersl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"etapespersl",
                    	    								lv_etapespersl_19_0,
                    	    								"org.xtext.InitConfig.Etapespersl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getProjetAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getProjetAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleProjet"


    // $ANTLR start "entryRuleEString"
    // InternalInitConfig.g:301:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInitConfig.g:301:47: (iv_ruleEString= ruleEString EOF )
            // InternalInitConfig.g:302:2: iv_ruleEString= ruleEString EOF
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
    // InternalInitConfig.g:308:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInitConfig.g:314:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInitConfig.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInitConfig.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalInitConfig.g:316:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInitConfig.g:324:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDependancesProjet"
    // InternalInitConfig.g:335:1: entryRuleDependancesProjet returns [EObject current=null] : iv_ruleDependancesProjet= ruleDependancesProjet EOF ;
    public final EObject entryRuleDependancesProjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependancesProjet = null;


        try {
            // InternalInitConfig.g:335:58: (iv_ruleDependancesProjet= ruleDependancesProjet EOF )
            // InternalInitConfig.g:336:2: iv_ruleDependancesProjet= ruleDependancesProjet EOF
            {
             newCompositeNode(grammarAccess.getDependancesProjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependancesProjet=ruleDependancesProjet();

            state._fsp--;

             current =iv_ruleDependancesProjet; 
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
    // $ANTLR end "entryRuleDependancesProjet"


    // $ANTLR start "ruleDependancesProjet"
    // InternalInitConfig.g:342:1: ruleDependancesProjet returns [EObject current=null] : ( () otherlv_1= 'DependancesProjet' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleDependancesProjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        AntlrDatatypeRuleToken lv_configuration_8_0 = null;



        	enterRule();

        try {
            // InternalInitConfig.g:348:2: ( ( () otherlv_1= 'DependancesProjet' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalInitConfig.g:349:2: ( () otherlv_1= 'DependancesProjet' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalInitConfig.g:349:2: ( () otherlv_1= 'DependancesProjet' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalInitConfig.g:350:3: () otherlv_1= 'DependancesProjet' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalInitConfig.g:350:3: ()
            // InternalInitConfig.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependancesProjetAccess().getDependancesProjetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDependancesProjetAccess().getDependancesProjetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDependancesProjetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInitConfig.g:365:3: (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalInitConfig.g:366:4: otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDependancesProjetAccess().getNomKeyword_3_0());
                    			
                    // InternalInitConfig.g:370:4: ( (lv_nom_4_0= ruleEString ) )
                    // InternalInitConfig.g:371:5: (lv_nom_4_0= ruleEString )
                    {
                    // InternalInitConfig.g:371:5: (lv_nom_4_0= ruleEString )
                    // InternalInitConfig.g:372:6: lv_nom_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDependancesProjetAccess().getNomEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_nom_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependancesProjetRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_4_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInitConfig.g:390:3: (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInitConfig.g:391:4: otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDependancesProjetAccess().getVersionKeyword_4_0());
                    			
                    // InternalInitConfig.g:395:4: ( (lv_version_6_0= ruleEString ) )
                    // InternalInitConfig.g:396:5: (lv_version_6_0= ruleEString )
                    {
                    // InternalInitConfig.g:396:5: (lv_version_6_0= ruleEString )
                    // InternalInitConfig.g:397:6: lv_version_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDependancesProjetAccess().getVersionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_version_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependancesProjetRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInitConfig.g:415:3: (otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInitConfig.g:416:4: otherlv_7= 'configuration' ( (lv_configuration_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDependancesProjetAccess().getConfigurationKeyword_5_0());
                    			
                    // InternalInitConfig.g:420:4: ( (lv_configuration_8_0= ruleEString ) )
                    // InternalInitConfig.g:421:5: (lv_configuration_8_0= ruleEString )
                    {
                    // InternalInitConfig.g:421:5: (lv_configuration_8_0= ruleEString )
                    // InternalInitConfig.g:422:6: lv_configuration_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDependancesProjetAccess().getConfigurationEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_configuration_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependancesProjetRule());
                    						}
                    						set(
                    							current,
                    							"configuration",
                    							lv_configuration_8_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDependancesProjetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDependancesProjet"


    // $ANTLR start "entryRuleTesting"
    // InternalInitConfig.g:448:1: entryRuleTesting returns [EObject current=null] : iv_ruleTesting= ruleTesting EOF ;
    public final EObject entryRuleTesting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTesting = null;


        try {
            // InternalInitConfig.g:448:48: (iv_ruleTesting= ruleTesting EOF )
            // InternalInitConfig.g:449:2: iv_ruleTesting= ruleTesting EOF
            {
             newCompositeNode(grammarAccess.getTestingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTesting=ruleTesting();

            state._fsp--;

             current =iv_ruleTesting; 
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
    // $ANTLR end "entryRuleTesting"


    // $ANTLR start "ruleTesting"
    // InternalInitConfig.g:455:1: ruleTesting returns [EObject current=null] : ( () otherlv_1= 'Testing' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )? (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleTesting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_target_5_0 = null;

        AntlrDatatypeRuleToken lv_cmdtest_7_0 = null;



        	enterRule();

        try {
            // InternalInitConfig.g:461:2: ( ( () otherlv_1= 'Testing' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )? (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalInitConfig.g:462:2: ( () otherlv_1= 'Testing' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )? (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalInitConfig.g:462:2: ( () otherlv_1= 'Testing' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )? (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalInitConfig.g:463:3: () otherlv_1= 'Testing' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )? (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalInitConfig.g:463:3: ()
            // InternalInitConfig.g:464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestingAccess().getTestingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTestingAccess().getTestingKeyword_1());
            		
            // InternalInitConfig.g:474:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInitConfig.g:475:4: (lv_name_2_0= ruleEString )
            {
            // InternalInitConfig.g:475:4: (lv_name_2_0= ruleEString )
            // InternalInitConfig.g:476:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestingAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.InitConfig.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getTestingAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInitConfig.g:497:3: (otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalInitConfig.g:498:4: otherlv_4= 'target' ( (lv_target_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTestingAccess().getTargetKeyword_4_0());
                    			
                    // InternalInitConfig.g:502:4: ( (lv_target_5_0= ruleEString ) )
                    // InternalInitConfig.g:503:5: (lv_target_5_0= ruleEString )
                    {
                    // InternalInitConfig.g:503:5: (lv_target_5_0= ruleEString )
                    // InternalInitConfig.g:504:6: lv_target_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestingAccess().getTargetEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_target_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestingRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInitConfig.g:522:3: (otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalInitConfig.g:523:4: otherlv_6= 'cmdtest' ( (lv_cmdtest_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTestingAccess().getCmdtestKeyword_5_0());
                    			
                    // InternalInitConfig.g:527:4: ( (lv_cmdtest_7_0= ruleEString ) )
                    // InternalInitConfig.g:528:5: (lv_cmdtest_7_0= ruleEString )
                    {
                    // InternalInitConfig.g:528:5: (lv_cmdtest_7_0= ruleEString )
                    // InternalInitConfig.g:529:6: lv_cmdtest_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestingAccess().getCmdtestEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_cmdtest_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestingRule());
                    						}
                    						set(
                    							current,
                    							"cmdtest",
                    							lv_cmdtest_7_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTestingAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTesting"


    // $ANTLR start "entryRuleEtapespersl"
    // InternalInitConfig.g:555:1: entryRuleEtapespersl returns [EObject current=null] : iv_ruleEtapespersl= ruleEtapespersl EOF ;
    public final EObject entryRuleEtapespersl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtapespersl = null;


        try {
            // InternalInitConfig.g:555:52: (iv_ruleEtapespersl= ruleEtapespersl EOF )
            // InternalInitConfig.g:556:2: iv_ruleEtapespersl= ruleEtapespersl EOF
            {
             newCompositeNode(grammarAccess.getEtapesperslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEtapespersl=ruleEtapespersl();

            state._fsp--;

             current =iv_ruleEtapespersl; 
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
    // $ANTLR end "entryRuleEtapespersl"


    // $ANTLR start "ruleEtapespersl"
    // InternalInitConfig.g:562:1: ruleEtapespersl returns [EObject current=null] : ( () otherlv_1= 'Etapespersl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEtapespersl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_cmd_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalInitConfig.g:568:2: ( ( () otherlv_1= 'Etapespersl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalInitConfig.g:569:2: ( () otherlv_1= 'Etapespersl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalInitConfig.g:569:2: ( () otherlv_1= 'Etapespersl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalInitConfig.g:570:3: () otherlv_1= 'Etapespersl' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalInitConfig.g:570:3: ()
            // InternalInitConfig.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEtapesperslAccess().getEtapesperslAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEtapesperslAccess().getEtapesperslKeyword_1());
            		
            // InternalInitConfig.g:581:3: ( (lv_name_2_0= ruleEString ) )
            // InternalInitConfig.g:582:4: (lv_name_2_0= ruleEString )
            {
            // InternalInitConfig.g:582:4: (lv_name_2_0= ruleEString )
            // InternalInitConfig.g:583:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEtapesperslAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEtapesperslRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.InitConfig.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getEtapesperslAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInitConfig.g:604:3: (otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalInitConfig.g:605:4: otherlv_4= 'cmd' ( (lv_cmd_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEtapesperslAccess().getCmdKeyword_4_0());
                    			
                    // InternalInitConfig.g:609:4: ( (lv_cmd_5_0= ruleEString ) )
                    // InternalInitConfig.g:610:5: (lv_cmd_5_0= ruleEString )
                    {
                    // InternalInitConfig.g:610:5: (lv_cmd_5_0= ruleEString )
                    // InternalInitConfig.g:611:6: lv_cmd_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEtapesperslAccess().getCmdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_cmd_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEtapesperslRule());
                    						}
                    						set(
                    							current,
                    							"cmd",
                    							lv_cmd_5_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalInitConfig.g:629:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInitConfig.g:630:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEtapesperslAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalInitConfig.g:634:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalInitConfig.g:635:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalInitConfig.g:635:5: (lv_description_7_0= ruleEString )
                    // InternalInitConfig.g:636:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEtapesperslAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEtapesperslRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.xtext.InitConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEtapesperslAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEtapespersl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000660000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010020000L});

}