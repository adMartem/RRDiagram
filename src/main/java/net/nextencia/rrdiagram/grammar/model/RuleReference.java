/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package net.nextencia.rrdiagram.grammar.model;

import net.nextencia.rrdiagram.RrDiagram;
import net.nextencia.rrdiagram.grammar.model.GrammarToRRDiagram.RuleLinkProvider;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRBreak;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRElement;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRText;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRText.Type;

/**
 * @author Christopher Deckers
 */
public class RuleReference extends Expression {

  private String ruleName;

  public RuleReference(String ruleName) {
    if (RrDiagram.MAC_DOWN) {
        this.ruleName = ruleName.replace("\\", "\\\\").replace("_", "\\_");
    } else {
        this.ruleName = ruleName;
    }
  }

  public String getRuleName() {
    return ruleName;
  }

  @Override
  public RRElement toRRElement(GrammarToRRDiagram grammarToRRDiagram) {
    String ruleConsideredAsLineBreak = grammarToRRDiagram.getRuleConsideredAsLineBreak();
    if(ruleConsideredAsLineBreak != null && ruleConsideredAsLineBreak.equals(ruleName)) {
      return new RRBreak();
    }
    RuleLinkProvider ruleLinkProvider = grammarToRRDiagram.getRuleLinkProvider();
    return new RRText(Type.RULE, ruleName, ruleLinkProvider == null? null: ruleLinkProvider.getLink(ruleName));
  }

  @Override
  public void toBNF(GrammarToBNF grammarToBNF, StringBuilder sb, boolean isNested) {
    sb.append(ruleName);
    String ruleConsideredAsLineBreak = grammarToBNF.getRuleConsideredAsLineBreak();
    if(ruleConsideredAsLineBreak != null && ruleConsideredAsLineBreak.equals(ruleName)) {
      sb.append("\n");
    }
  }

  @Override
  public boolean equals(Object o) {
    if(!(o instanceof RuleReference)) {
      return false;
    }
    return ruleName.equals(((RuleReference)o).ruleName);
  }

}
