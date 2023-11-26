/**
 * generated by Xtext 2.32.0
 */
package org.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.services.JenkinsGrammarAccess;
import projectsortie.Agent;
import projectsortie.Build;
import projectsortie.Cloning;
import projectsortie.Deploy;
import projectsortie.Stages;
import projectsortie.Tests;
import projectsortie.config;

@SuppressWarnings("all")
public class JenkinsFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private JenkinsGrammarAccess _jenkinsGrammarAccess;

  protected void _format(final config config, @Extension final IFormattableDocument document) {
    document.<Agent>format(config.getAgent());
    EList<Stages> _stages = config.getStages();
    for (final Stages stages : _stages) {
      document.<Stages>format(stages);
    }
  }

  protected void _format(final Stages stages, @Extension final IFormattableDocument document) {
    document.<Tests>format(stages.getTests());
    document.<Cloning>format(stages.getCloning());
    document.<Build>format(stages.getBuild());
    document.<Deploy>format(stages.getDeploy());
  }

  public void format(final Object stages, final IFormattableDocument document) {
    if (stages instanceof XtextResource) {
      _format((XtextResource)stages, document);
      return;
    } else if (stages instanceof Stages) {
      _format((Stages)stages, document);
      return;
    } else if (stages instanceof config) {
      _format((config)stages, document);
      return;
    } else if (stages instanceof EObject) {
      _format((EObject)stages, document);
      return;
    } else if (stages == null) {
      _format((Void)null, document);
      return;
    } else if (stages != null) {
      _format(stages, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stages, document).toString());
    }
  }
}
