/**
 * generated by Xtext 2.32.0
 */
package org.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.services.JenkinsGrammarAccess;

@SuppressWarnings("all")
public class JenkinsFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private JenkinsGrammarAccess _jenkinsGrammarAccess;

  protected void _format(final /* config */Object config, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nagent cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nstages cannot be resolved"
      + "\nformat cannot be resolved");
  }

  protected void _format(final /* Stages */Object stages, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\ntests cannot be resolved"
      + "\nformat cannot be resolved"
      + "\ncloning cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nbuild cannot be resolved"
      + "\nformat cannot be resolved"
      + "\ndeploy cannot be resolved"
      + "\nformat cannot be resolved");
  }

  public void format(final Object config, final IFormattableDocument document) {
    if (config instanceof XtextResource) {
      _format((XtextResource)config, document);
      return;
    } else if (config instanceof EObject) {
      _format((EObject)config, document);
      return;
    } else if (config == null) {
      _format((Void)null, document);
      return;
    } else if (config != null) {
      _format(config, document);
      return;
    } else if (config != null) {
      _format(config, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(config, document).toString());
    }
  }
}
