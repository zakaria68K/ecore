/*
 * generated by Xtext 2.32.0
 */
grammar InternalJenkins;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleconfig
entryRuleconfig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigRule()); }
	iv_ruleconfig=ruleconfig
	{ $current=$iv_ruleconfig.current; }
	EOF;

// Rule config
ruleconfig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='config'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Jenkins.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='agent'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getAgentKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getAgentAgentParserRuleCall_4_0());
				}
				lv_agent_4_0=ruleAgent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					set(
						$current,
						"agent",
						lv_agent_4_0,
						"org.xtext.Jenkins.Agent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='stages'
		{
			newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getStagesKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigAccess().getStagesStagesParserRuleCall_7_0());
				}
				lv_stages_7_0=ruleStages
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigRule());
					}
					add(
						$current,
						"stages",
						lv_stages_7_0,
						"org.xtext.Jenkins.Stages");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigAccess().getStagesStagesParserRuleCall_8_1_0());
					}
					lv_stages_9_0=ruleStages
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigRule());
						}
						add(
							$current,
							"stages",
							lv_stages_9_0,
							"org.xtext.Jenkins.Stages");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	iv_ruleAgent=ruleAgent
	{ $current=$iv_ruleAgent.current; }
	EOF;

// Rule Agent
ruleAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAgentAccess().getAgentAction_0(),
					$current);
			}
		)
		otherlv_1='Agent'
		{
			newLeafNode(otherlv_1, grammarAccess.getAgentAccess().getAgentKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='type'
			{
				newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getTypeKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAgentAccess().getTypeEStringParserRuleCall_3_1_0());
					}
					lv_type_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAgentRule());
						}
						set(
							$current,
							"type",
							lv_type_4_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleStages
entryRuleStages returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStagesRule()); }
	iv_ruleStages=ruleStages
	{ $current=$iv_ruleStages.current; }
	EOF;

// Rule Stages
ruleStages returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Stages'
		{
			newLeafNode(otherlv_0, grammarAccess.getStagesAccess().getStagesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagesAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagesRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Jenkins.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStagesAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='tests'
		{
			newLeafNode(otherlv_3, grammarAccess.getStagesAccess().getTestsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagesAccess().getTestsTestsParserRuleCall_4_0());
				}
				lv_tests_4_0=ruleTests
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagesRule());
					}
					set(
						$current,
						"tests",
						lv_tests_4_0,
						"org.xtext.Jenkins.Tests");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='cloning'
		{
			newLeafNode(otherlv_5, grammarAccess.getStagesAccess().getCloningKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagesAccess().getCloningCloningParserRuleCall_6_0());
				}
				lv_cloning_6_0=ruleCloning
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagesRule());
					}
					set(
						$current,
						"cloning",
						lv_cloning_6_0,
						"org.xtext.Jenkins.Cloning");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='build'
		{
			newLeafNode(otherlv_7, grammarAccess.getStagesAccess().getBuildKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagesAccess().getBuildBuildParserRuleCall_8_0());
				}
				lv_build_8_0=ruleBuild
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagesRule());
					}
					set(
						$current,
						"build",
						lv_build_8_0,
						"org.xtext.Jenkins.Build");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='deploy'
		{
			newLeafNode(otherlv_9, grammarAccess.getStagesAccess().getDeployKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagesAccess().getDeployDeployParserRuleCall_10_0());
				}
				lv_deploy_10_0=ruleDeploy
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagesRule());
					}
					set(
						$current,
						"deploy",
						lv_deploy_10_0,
						"org.xtext.Jenkins.Deploy");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getStagesAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleTests
entryRuleTests returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestsRule()); }
	iv_ruleTests=ruleTests
	{ $current=$iv_ruleTests.current; }
	EOF;

// Rule Tests
ruleTests returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestsAccess().getTestsAction_0(),
					$current);
			}
		)
		otherlv_1='Tests'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestsAccess().getTestsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTestsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='shell'
			{
				newLeafNode(otherlv_3, grammarAccess.getTestsAccess().getShellKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestsAccess().getShellEStringParserRuleCall_3_1_0());
					}
					lv_shell_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestsRule());
						}
						set(
							$current,
							"shell",
							lv_shell_4_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='classestotest'
			{
				newLeafNode(otherlv_5, grammarAccess.getTestsAccess().getClassestotestKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestsAccess().getClassestotestEStringParserRuleCall_4_1_0());
					}
					lv_classestotest_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestsRule());
						}
						set(
							$current,
							"classestotest",
							lv_classestotest_6_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='agent'
			{
				newLeafNode(otherlv_7, grammarAccess.getTestsAccess().getAgentKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestsAccess().getAgentAgentParserRuleCall_5_1_0());
					}
					lv_agent_8_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestsRule());
						}
						set(
							$current,
							"agent",
							lv_agent_8_0,
							"org.xtext.Jenkins.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='credentials'
			{
				newLeafNode(otherlv_9, grammarAccess.getTestsAccess().getCredentialsKeyword_6_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getTestsAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestsAccess().getCredentialsCredentialsParserRuleCall_6_2_0());
					}
					lv_credentials_11_0=rulecredentials
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestsRule());
						}
						add(
							$current,
							"credentials",
							lv_credentials_11_0,
							"org.xtext.Jenkins.credentials");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getTestsAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTestsAccess().getCredentialsCredentialsParserRuleCall_6_3_1_0());
						}
						lv_credentials_13_0=rulecredentials
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTestsRule());
							}
							add(
								$current,
								"credentials",
								lv_credentials_13_0,
								"org.xtext.Jenkins.credentials");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getTestsAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTestsAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleCloning
entryRuleCloning returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCloningRule()); }
	iv_ruleCloning=ruleCloning
	{ $current=$iv_ruleCloning.current; }
	EOF;

// Rule Cloning
ruleCloning returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCloningAccess().getCloningAction_0(),
					$current);
			}
		)
		otherlv_1='Cloning'
		{
			newLeafNode(otherlv_1, grammarAccess.getCloningAccess().getCloningKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCloningAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='url'
			{
				newLeafNode(otherlv_3, grammarAccess.getCloningAccess().getUrlKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCloningAccess().getUrlEStringParserRuleCall_3_1_0());
					}
					lv_url_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCloningRule());
						}
						set(
							$current,
							"url",
							lv_url_4_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='credentialID'
			{
				newLeafNode(otherlv_5, grammarAccess.getCloningAccess().getCredentialIDKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCloningAccess().getCredentialIDEStringParserRuleCall_4_1_0());
					}
					lv_credentialID_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCloningRule());
						}
						set(
							$current,
							"credentialID",
							lv_credentialID_6_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='branch'
			{
				newLeafNode(otherlv_7, grammarAccess.getCloningAccess().getBranchKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCloningAccess().getBranchEStringParserRuleCall_5_1_0());
					}
					lv_branch_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCloningRule());
						}
						set(
							$current,
							"branch",
							lv_branch_8_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='agent'
			{
				newLeafNode(otherlv_9, grammarAccess.getCloningAccess().getAgentKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCloningAccess().getAgentAgentParserRuleCall_6_1_0());
					}
					lv_agent_10_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCloningRule());
						}
						set(
							$current,
							"agent",
							lv_agent_10_0,
							"org.xtext.Jenkins.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getCloningAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleBuild
entryRuleBuild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBuildRule()); }
	iv_ruleBuild=ruleBuild
	{ $current=$iv_ruleBuild.current; }
	EOF;

// Rule Build
ruleBuild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBuildAccess().getBuildAction_0(),
					$current);
			}
		)
		otherlv_1='Build'
		{
			newLeafNode(otherlv_1, grammarAccess.getBuildAccess().getBuildKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='cmd'
			{
				newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getCmdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBuildAccess().getCmdEStringParserRuleCall_3_1_0());
					}
					lv_cmd_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBuildRule());
						}
						set(
							$current,
							"cmd",
							lv_cmd_4_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='agent'
			{
				newLeafNode(otherlv_5, grammarAccess.getBuildAccess().getAgentKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBuildAccess().getAgentAgentParserRuleCall_4_1_0());
					}
					lv_agent_6_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBuildRule());
						}
						set(
							$current,
							"agent",
							lv_agent_6_0,
							"org.xtext.Jenkins.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='credentials'
			{
				newLeafNode(otherlv_7, grammarAccess.getBuildAccess().getCredentialsKeyword_5_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBuildAccess().getCredentialsCredentialsParserRuleCall_5_2_0());
					}
					lv_credentials_9_0=rulecredentials
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBuildRule());
						}
						add(
							$current,
							"credentials",
							lv_credentials_9_0,
							"org.xtext.Jenkins.credentials");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getBuildAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBuildAccess().getCredentialsCredentialsParserRuleCall_5_3_1_0());
						}
						lv_credentials_11_0=rulecredentials
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBuildRule());
							}
							add(
								$current,
								"credentials",
								lv_credentials_11_0,
								"org.xtext.Jenkins.credentials");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleDeploy
entryRuleDeploy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeployRule()); }
	iv_ruleDeploy=ruleDeploy
	{ $current=$iv_ruleDeploy.current; }
	EOF;

// Rule Deploy
ruleDeploy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeployAccess().getDeployAction_0(),
					$current);
			}
		)
		otherlv_1='Deploy'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeployAccess().getDeployKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='cmd'
			{
				newLeafNode(otherlv_3, grammarAccess.getDeployAccess().getCmdKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeployAccess().getCmdEStringParserRuleCall_3_1_0());
					}
					lv_cmd_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeployRule());
						}
						set(
							$current,
							"cmd",
							lv_cmd_4_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='credentials'
			{
				newLeafNode(otherlv_5, grammarAccess.getDeployAccess().getCredentialsKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeployAccess().getCredentialsCredentialsParserRuleCall_4_2_0());
					}
					lv_credentials_7_0=rulecredentials
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeployRule());
						}
						add(
							$current,
							"credentials",
							lv_credentials_7_0,
							"org.xtext.Jenkins.credentials");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getDeployAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDeployAccess().getCredentialsCredentialsParserRuleCall_4_3_1_0());
						}
						lv_credentials_9_0=rulecredentials
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDeployRule());
							}
							add(
								$current,
								"credentials",
								lv_credentials_9_0,
								"org.xtext.Jenkins.credentials");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulecredentials
entryRulecredentials returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCredentialsRule()); }
	iv_rulecredentials=rulecredentials
	{ $current=$iv_rulecredentials.current; }
	EOF;

// Rule credentials
rulecredentials returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCredentialsAccess().getCredentialsAction_0(),
					$current);
			}
		)
		otherlv_1='credentials'
		{
			newLeafNode(otherlv_1, grammarAccess.getCredentialsAccess().getCredentialsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCredentialsAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCredentialsRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Jenkins.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='variable'
			{
				newLeafNode(otherlv_4, grammarAccess.getCredentialsAccess().getVariableKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCredentialsAccess().getVariableEStringParserRuleCall_4_1_0());
					}
					lv_variable_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCredentialsRule());
						}
						set(
							$current,
							"variable",
							lv_variable_5_0,
							"org.xtext.Jenkins.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
