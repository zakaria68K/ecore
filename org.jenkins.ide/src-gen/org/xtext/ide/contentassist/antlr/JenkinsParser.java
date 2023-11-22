/*
 * generated by Xtext 2.32.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalJenkinsParser;
import org.xtext.services.JenkinsGrammarAccess;

public class JenkinsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JenkinsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JenkinsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
			builder.put(grammarAccess.getConfigAccess().getGroup_8(), "rule__Config__Group_8__0");
			builder.put(grammarAccess.getAgentAccess().getGroup(), "rule__Agent__Group__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3(), "rule__Agent__Group_3__0");
			builder.put(grammarAccess.getStagesAccess().getGroup(), "rule__Stages__Group__0");
			builder.put(grammarAccess.getTestsAccess().getGroup(), "rule__Tests__Group__0");
			builder.put(grammarAccess.getTestsAccess().getGroup_3(), "rule__Tests__Group_3__0");
			builder.put(grammarAccess.getTestsAccess().getGroup_4(), "rule__Tests__Group_4__0");
			builder.put(grammarAccess.getTestsAccess().getGroup_5(), "rule__Tests__Group_5__0");
			builder.put(grammarAccess.getTestsAccess().getGroup_6(), "rule__Tests__Group_6__0");
			builder.put(grammarAccess.getTestsAccess().getGroup_6_3(), "rule__Tests__Group_6_3__0");
			builder.put(grammarAccess.getCloningAccess().getGroup(), "rule__Cloning__Group__0");
			builder.put(grammarAccess.getCloningAccess().getGroup_3(), "rule__Cloning__Group_3__0");
			builder.put(grammarAccess.getCloningAccess().getGroup_4(), "rule__Cloning__Group_4__0");
			builder.put(grammarAccess.getCloningAccess().getGroup_5(), "rule__Cloning__Group_5__0");
			builder.put(grammarAccess.getCloningAccess().getGroup_6(), "rule__Cloning__Group_6__0");
			builder.put(grammarAccess.getBuildAccess().getGroup(), "rule__Build__Group__0");
			builder.put(grammarAccess.getBuildAccess().getGroup_3(), "rule__Build__Group_3__0");
			builder.put(grammarAccess.getBuildAccess().getGroup_4(), "rule__Build__Group_4__0");
			builder.put(grammarAccess.getBuildAccess().getGroup_5(), "rule__Build__Group_5__0");
			builder.put(grammarAccess.getBuildAccess().getGroup_5_3(), "rule__Build__Group_5_3__0");
			builder.put(grammarAccess.getDeployAccess().getGroup(), "rule__Deploy__Group__0");
			builder.put(grammarAccess.getDeployAccess().getGroup_3(), "rule__Deploy__Group_3__0");
			builder.put(grammarAccess.getDeployAccess().getGroup_4(), "rule__Deploy__Group_4__0");
			builder.put(grammarAccess.getDeployAccess().getGroup_4_3(), "rule__Deploy__Group_4_3__0");
			builder.put(grammarAccess.getCredentialsAccess().getGroup(), "rule__Credentials__Group__0");
			builder.put(grammarAccess.getCredentialsAccess().getGroup_4(), "rule__Credentials__Group_4__0");
			builder.put(grammarAccess.getConfigAccess().getNameAssignment_1(), "rule__Config__NameAssignment_1");
			builder.put(grammarAccess.getConfigAccess().getAgentAssignment_4(), "rule__Config__AgentAssignment_4");
			builder.put(grammarAccess.getConfigAccess().getStagesAssignment_7(), "rule__Config__StagesAssignment_7");
			builder.put(grammarAccess.getConfigAccess().getStagesAssignment_8_1(), "rule__Config__StagesAssignment_8_1");
			builder.put(grammarAccess.getAgentAccess().getTypeAssignment_3_1(), "rule__Agent__TypeAssignment_3_1");
			builder.put(grammarAccess.getStagesAccess().getNameAssignment_1(), "rule__Stages__NameAssignment_1");
			builder.put(grammarAccess.getStagesAccess().getTestsAssignment_4(), "rule__Stages__TestsAssignment_4");
			builder.put(grammarAccess.getStagesAccess().getCloningAssignment_6(), "rule__Stages__CloningAssignment_6");
			builder.put(grammarAccess.getStagesAccess().getBuildAssignment_8(), "rule__Stages__BuildAssignment_8");
			builder.put(grammarAccess.getStagesAccess().getDeployAssignment_10(), "rule__Stages__DeployAssignment_10");
			builder.put(grammarAccess.getTestsAccess().getShellAssignment_3_1(), "rule__Tests__ShellAssignment_3_1");
			builder.put(grammarAccess.getTestsAccess().getClassestotestAssignment_4_1(), "rule__Tests__ClassestotestAssignment_4_1");
			builder.put(grammarAccess.getTestsAccess().getAgentAssignment_5_1(), "rule__Tests__AgentAssignment_5_1");
			builder.put(grammarAccess.getTestsAccess().getCredentialsAssignment_6_2(), "rule__Tests__CredentialsAssignment_6_2");
			builder.put(grammarAccess.getTestsAccess().getCredentialsAssignment_6_3_1(), "rule__Tests__CredentialsAssignment_6_3_1");
			builder.put(grammarAccess.getCloningAccess().getUrlAssignment_3_1(), "rule__Cloning__UrlAssignment_3_1");
			builder.put(grammarAccess.getCloningAccess().getCredentialIDAssignment_4_1(), "rule__Cloning__CredentialIDAssignment_4_1");
			builder.put(grammarAccess.getCloningAccess().getBranchAssignment_5_1(), "rule__Cloning__BranchAssignment_5_1");
			builder.put(grammarAccess.getCloningAccess().getAgentAssignment_6_1(), "rule__Cloning__AgentAssignment_6_1");
			builder.put(grammarAccess.getBuildAccess().getCmdAssignment_3_1(), "rule__Build__CmdAssignment_3_1");
			builder.put(grammarAccess.getBuildAccess().getAgentAssignment_4_1(), "rule__Build__AgentAssignment_4_1");
			builder.put(grammarAccess.getBuildAccess().getCredentialsAssignment_5_2(), "rule__Build__CredentialsAssignment_5_2");
			builder.put(grammarAccess.getBuildAccess().getCredentialsAssignment_5_3_1(), "rule__Build__CredentialsAssignment_5_3_1");
			builder.put(grammarAccess.getDeployAccess().getCmdAssignment_3_1(), "rule__Deploy__CmdAssignment_3_1");
			builder.put(grammarAccess.getDeployAccess().getCredentialsAssignment_4_2(), "rule__Deploy__CredentialsAssignment_4_2");
			builder.put(grammarAccess.getDeployAccess().getCredentialsAssignment_4_3_1(), "rule__Deploy__CredentialsAssignment_4_3_1");
			builder.put(grammarAccess.getCredentialsAccess().getNameAssignment_2(), "rule__Credentials__NameAssignment_2");
			builder.put(grammarAccess.getCredentialsAccess().getVariableAssignment_4_1(), "rule__Credentials__VariableAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JenkinsGrammarAccess grammarAccess;

	@Override
	protected InternalJenkinsParser createParser() {
		InternalJenkinsParser result = new InternalJenkinsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JenkinsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JenkinsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
