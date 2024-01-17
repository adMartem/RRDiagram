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
    
    public static final boolean MAC_DOWN = true;

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
                    System.out.println("<!-- begin svg grammar -->");
                    System.out.println("<pre style=\"font-family:verdana\">");
                    for (Rule rule : grammar.getRules()) {
                        System.out.println("<a id=\"" + rule.getName() + "\">" + rule.getName() + ":" + "</a><p>");
                        RRDiagram diagram = grammarToRRDiagram.convert(rule);
                        String svg = rrDiagramToSVG.convert(diagram);
                        System.out.print(svg);
                        System.out.println("</p>");
                    }
                    System.out.println("<!-- end svg grammar -->");
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
