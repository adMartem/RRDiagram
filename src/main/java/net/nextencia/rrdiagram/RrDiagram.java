package net.nextencia.rrdiagram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import net.nextencia.rrdiagram.grammar.model.BNFToGrammar;
import net.nextencia.rrdiagram.grammar.model.Grammar;
import net.nextencia.rrdiagram.grammar.model.GrammarToRRDiagram;
import net.nextencia.rrdiagram.grammar.model.Rule;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRDiagram;
import net.nextencia.rrdiagram.grammar.rrdiagram.RRDiagramToSVG;

public class RrDiagram {
    
    public static final boolean MAC_DOWN = false;

    public static void main(String[] bnfFilePaths) {
        if (bnfFilePaths != null) {
            for (String bnfFilePath : bnfFilePaths) {
                BNFToGrammar bnfToGrammar = new BNFToGrammar();
                FileReader bnfReader;
                try {
                    bnfReader = new FileReader(bnfFilePath);
                } catch (FileNotFoundException e) {
                    System.err.println("file '" + bnfFilePath + "' not found; skipped");
                    continue;
                }
                try {
                    Grammar grammar = bnfToGrammar.convert(bnfReader);
                    GrammarToRRDiagram grammarToRRDiagram = new GrammarToRRDiagram();
                    RRDiagramToSVG rrDiagramToSVG = new RRDiagramToSVG();
                    System.out.println("<ul><!-- begin svg grammar -->");
                    for (Rule rule : grammar.getRules()) {
                        System.out.println("<li><p style=\"font-family:verdana\">");
                        System.out.println("<a id=\"" + rule.getName() + "\">" + rule.getName() + ":" + "</a>");
                        System.out.println("<br/>");
                        RRDiagram diagram = grammarToRRDiagram.convert(rule);
                        String svg = rrDiagramToSVG.convert(diagram);
                        System.out.println(svg);
                        System.out.println("</p></li>");
                    }
                    System.out.println("</ul><!-- end svg grammar -->");
                } catch (IOException e) {
                    System.err.println("error reading file '" + bnfFilePath + "'; aborting");
                    e.printStackTrace();
                    break;
                }
            }
        } else {
            System.err.println("no BNF files specified");
        }
    }
}
