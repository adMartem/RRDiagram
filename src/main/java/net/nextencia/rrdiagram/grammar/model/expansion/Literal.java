/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package net.nextencia.rrdiagram.grammar.model.expansion;

import net.nextencia.rrdiagram.RrDiagram;
import net.nextencia.rrdiagram.grammar.model.Expression;
import net.nextencia.rrdiagram.grammar.model.GrammarToBNF;
import net.nextencia.rrdiagram.grammar.model.GrammarToRRDiagram;
import net.nextencia.rrdiagram.grammar.model.GrammarToBNF.LiteralDefinitionSign;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRElement;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRText;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRText.Type;

/**
 * @author Christopher Deckers
 */
public class Literal extends Expression {

  private String text;

  public Literal(String text) {
      if (RrDiagram.MAC_DOWN) {
          this.text = text.replace("\\", "\\\\").replace("_", "\\_");
      } else {
          this.text = text;
      }
  }

  @Override
public RRElement toRRElement(GrammarToRRDiagram grammarToRRDiagram) {
    return new RRText(Type.LITERAL, text, null);
  }

  @Override
public void toBNF(GrammarToBNF grammarToBNF, StringBuilder sb, boolean isNested) {
    char c = grammarToBNF.getLiteralDefinitionSign() == LiteralDefinitionSign.DOUBLE_QUOTE? '"': '\'';
    sb.append(c);
    sb.append(text);
    sb.append(c);
  }

  @Override
  public boolean equals(Object o) {
    if(!(o instanceof Literal)) {
      return false;
    }
    return text.equals(((Literal)o).text);
  }

}
