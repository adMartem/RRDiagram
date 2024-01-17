/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package net.nextencia.rrdiagram.grammar.rrdiagram;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

/**
 * @author Christopher Deckers
 */
public class RRDiagramToSVG {

  public String convert(RRDiagram rrDiagram) {
    return rrDiagram.toSVG(this);
  }

  private Color connectorColor = new Color(34, 34, 34);

  public void setConnectorColor(Color connectorColor) {
    this.connectorColor = connectorColor;
  }

  public Color getConnectorColor() {
    return connectorColor;
  }

  private Font loopFont = new Font("Verdana", Font.PLAIN, 10);

  public void setLoopFont(Font loopFont) {
    this.loopFont = loopFont;
  }

  public Font getLoopFont() {
    return loopFont;
  }

  private Color loopTextColor = Color.BLACK;

  public void setLoopTextColor(Color loopTextColor) {
    this.loopTextColor = loopTextColor;
  }

  public Color getLoopTextColor() {
    return loopTextColor;
  }

  public static enum BoxShape {
    RECTANGLE,
    ROUNDED_RECTANGLE,
    HEXAGON
  }

  private Insets ruleInsets = new Insets(5, 10, 5, 10);

  public void setRuleInsets(Insets ruleInsets) {
    this.ruleInsets = ruleInsets;
  }

   public Insets getRuleInsets() {
    return ruleInsets;
  }

  private Font ruleFont = new Font("Verdana", Font.PLAIN, 12);

  public void setRuleFont(Font ruleFont) {
    this.ruleFont = ruleFont;
  }

  public Font getRuleFont() {
    return ruleFont;
  }

  private Color ruleTextColor = Color.BLACK;

  public void setRuleTextColor(Color ruleTextColor) {
    this.ruleTextColor = ruleTextColor;
  }

  public Color getRuleTextColor() {
    return ruleTextColor;
  }

  private BoxShape ruleShape = BoxShape.RECTANGLE;

  public void setRuleShape(BoxShape ruleShape) {
    this.ruleShape = ruleShape;
  }

  public BoxShape getRuleShape() {
    return ruleShape;
  }

  private Color ruleBorderColor = connectorColor;

  public void setRuleBorderColor(Color ruleBorderColor) {
    this.ruleBorderColor = ruleBorderColor;
  }

  public Color getRuleBorderColor() {
    return ruleBorderColor;
  }

  private Color ruleFillColor = new Color(211, 240, 255);

  public void setRuleFillColor(Color ruleFillColor) {
    this.ruleFillColor = ruleFillColor;
  }

  public Color getRuleFillColor() {
    return ruleFillColor;
  }

  private Insets literalInsets = new Insets(5, 10, 5, 10);

  public void setLiteralInsets(Insets literalInsets) {
    this.literalInsets = literalInsets;
  }

   public Insets getLiteralInsets() {
    return literalInsets;
  }

  private Font literalFont = new Font("Verdana", Font.PLAIN, 12);

  public void setLiteralFont(Font literalFont) {
    this.literalFont = literalFont;
  }

  public Font getLiteralFont() {
    return literalFont;
  }

  private Color literalTextColor = Color.BLACK;

  public void setLiteralTextColor(Color literalTextColor) {
    this.literalTextColor = literalTextColor;
  }

  public Color getLiteralTextColor() {
    return literalTextColor;
  }

  private BoxShape literalShape = BoxShape.ROUNDED_RECTANGLE;

  public void setLiteralShape(BoxShape literalShape) {
    this.literalShape = literalShape;
  }

  public BoxShape getLiteralShape() {
    return literalShape;
  }

  private Color literalBorderColor = connectorColor;

  public void setLiteralBorderColor(Color literalBorderColor) {
    this.literalBorderColor = literalBorderColor;
  }

  public Color getLiteralBorderColor() {
    return literalBorderColor;
  }

  private Color literalFillColor = new Color(144, 217, 255);

  public void setLiteralFillColor(Color literalFillColor) {
    this.literalFillColor = literalFillColor;
  }

  public Color getLiteralFillColor() {
    return literalFillColor;
  }

  private Insets specialSequenceInsets = new Insets(5, 10, 5, 10);

  public void setSpecialSequenceInsets(Insets specialSequenceInsets) {
    this.specialSequenceInsets = specialSequenceInsets;
  }

   public Insets getSpecialSequenceInsets() {
    return specialSequenceInsets;
  }

  private Font specialSequenceFont = new Font("Verdana", Font.PLAIN, 12);

  public void setSpecialSequenceFont(Font specialSequenceFont) {
    this.specialSequenceFont = specialSequenceFont;
  }

  public Font getSpecialSequenceFont() {
    return specialSequenceFont;
  }

  private Color specialSequenceTextColor = Color.BLACK;

  public void setSpecialSequenceTextColor(Color specialSequenceTextColor) {
    this.specialSequenceTextColor = specialSequenceTextColor;
  }

  public Color getSpecialSequenceTextColor() {
    return specialSequenceTextColor;
  }

  private BoxShape specialSequenceShape = BoxShape.HEXAGON;

  public void setSpecialSequenceShape(BoxShape specialSequenceShape) {
    this.specialSequenceShape = specialSequenceShape;
  }

  public BoxShape getSpecialSequenceShape() {
    return specialSequenceShape;
  }

  private Color specialSequenceBorderColor = connectorColor;

  public void setSpecialSequenceBorderColor(Color specialSequenceBorderColor) {
    this.specialSequenceBorderColor = specialSequenceBorderColor;
  }

  public Color getSpecialSequenceBorderColor() {
    return specialSequenceBorderColor;
  }

  private Color specialSequenceFillColor = new Color(228, 244, 255);

  public void setSpecialSequenceFillColor(Color specialSequenceFillColor) {
    this.specialSequenceFillColor = specialSequenceFillColor;
  }

  public Color getSpecialSequenceFillColor() {
    return specialSequenceFillColor;
  }
  
/*
    <marker 
       id="arrow"
       refX="0" 
       refY="3"         
       orient="auto" 
       markerWidth="6" 
       markerHeight="6"  
       markerUnits="strokeWidth">
       <path d="M0,0 L0,6 L6,3 z" fill="#000" />
    </marker>
    <marker 
       id="bow_tie"
       refX="0" 
       refY="3"         
        orient="auto" 
       markerWidth="12" 
       markerHeight="6"  
       markerUnits="strokeWidth">
       <path d="M0,0 L0,6 L6,3 z" fill="#000" />
       <path d="M12,0 L12,6 L6,3 z" fill="#000" />
    </marker>
    <marker 
       id="double-arrow"
       refX="0"         
       refY="3" 
       orient="auto" 
       markerWidth="12" 
       markerHeight="6"  
       markerUnits="strokeWidth">
        <path d="M0,0 L0,6 L6,3 z" fill="#000" />
        <path d="M6,0 L6,6 L12,3 z" fill="#000" />
    </marker>
    <marker
       id="circle"
       viewBox="0 0 12 12"
       refX="0"
       refY="6"         
       orient="auto" 
       markerWidth="6"
       markerHeight="6">
       markerUnits="strokeWidth"
       <circle cx="6" cy="6" r="6" fill="#000" />
    </marker>
    <marker
       id="cross"
       viewBox="0 0 12 12"
       refX="0"
       refY="6"         
       orient="auto" 
       markerWidth="6"
       markerHeight="6">
       markerUnits="strokeWidth"
      <line x1="0" y1="0" x2="0" y2="12" stroke="black" stroke-width="4" />
    </marker>
    <marker
       id="double-cross"
       viewBox="0 0 12 12"
       refX="0"
       refY="6"         
       orient="auto" 
       markerWidth="6"
       markerHeight="6">
       markerUnits="strokeWidth"
       <line x1="0" y1="0" x2="0" y2="12" stroke="black" stroke-width="4" />
       <line x1="0" y1="6" x2="6" y2="6" stroke="black" stroke-width="2" />
       <line x1="6" y1="0" x2="6" y2="12" stroke="black" stroke-width="2" />
    </marker>
    <marker
      id="none"
      viewBox="0 0 12 12"
      refX="0"
      refY="6"
      markerWidth="6"
      markerHeight="6">
      markerUnits="strokeWidth"
    </marker>
*/
  
  public record ShapeSet (MarkerShape start, MarkerShape mid, MarkerShape breakStop, MarkerShape stop) {

    public String toDefs(ShapeSet markerSet) {
        return start.getMarkerDef() + mid.getMarkerDef() + breakStop.getMarkerDef() + stop.getMarkerDef();
    }
      
  }

  public static enum MarkerShape {
    PLAIN        (
                     "plain", 
                     "<marker\n"
                   + "   id=\"none\"\n"
                   + "   viewBox=\"0 0 12 12\"\n"
                   + "   refX=\"0\"\n"
                   + "   refY=\"6\"\n"
                   + "   markerWidth=\"6\"\n"
                   + "   markerHeight=\"6\">\n"
                   + "   markerUnits=\"strokeWidth\"\n"
                   + "</marker>\n"
                 ),
    CIRCLE       (
                     "circle", 
                     "<marker\n"
                   + "   id=\"circle\"\n"
                   + "   viewBox=\"0 0 12 12\"\n"
                   + "   refX=\"6\"\n"
                   + "   refY=\"6\"\n"
                   + "   markerWidth=\"6\"\n"
                   + "   markerHeight=\"6\">\n"
                   + "   <circle cx=\"6\" cy=\"6\" r=\"5\" fill=\"#fff\" stroke=\"#000\" />\n"
                   + "</marker>\n"),
    CROSS        (
                     "cross", 
                     "<marker\n"
                   + "   id=\"cross\"\n"
                   + "   viewBox=\"0 0 12 12\"\n"
                   + "   refX=\"0\"\n"
                   + "   refY=\"6\"\n"
                   + "   orient=\"auto\"\n"
                   + "   markerWidth=\"6\"\n"
                   + "   markerHeight=\"6\">\n"
                   + "   markerUnits=\"strokeWidth\"\n"
                   + "   <line x1=\"0\" y1=\"0\" x2=\"0\" y2=\"12\" stroke=\"black\" stroke-width=\"4\" />\n"
                   + "</marker>\n"
                 ),
    DOUBLE_CROSS (
                     "double-cross", 
                     "<marker\n"
                   + "   id=\"double-cross\"\n"
                   + "   viewBox=\"0 0 12 12\"\n"
                   + "   refX=\"0\"\n"
                   + "   refY=\"6\"\n"
                   + "   orient=\"auto\" \n"
                   + "   markerWidth=\"6\"\n"
                   + "   markerHeight=\"6\">\n"
                   + "   markerUnits=\"strokeWidth\"\n"
                   + "   <line x1=\"0\" y1=\"0\" x2=\"0\" y2=\"12\" stroke=\"black\" stroke-width=\"4\" />\n"
                   + "   <line x1=\"0\" y1=\"6\" x2=\"6\" y2=\"6\" stroke=\"black\" stroke-width=\"2\" />\n"
                   + "   <line x1=\"6\" y1=\"0\" x2=\"6\" y2=\"12\" stroke=\"black\" stroke-width=\"2\" />\n"
                   + "</marker>\n"
                 ),
    BOWTIE       (
                     "bowtie", 
                     "<marker \n"
                   + "   id=\"bow_tie\"\n"
                   + "   refX=\"0\" \n"
                   + "   refY=\"3\"\n"
                   + "   orient=\"auto\" \n"
                   + "   markerWidth=\"12 \n"
                   + "   markerHeight=\"6\"\n"
                   + "   markerUnits=\"strokeWidth\">\n"
                   + "   <path d=\"M0,0 L0,6 L6,3 z\" fill=\"#000\"/>\n"
                   + "   <path d=\"M12,0 L12,6 L6,3 z\" fill=\"#000\"/>\n"
                   + "</marker>\n"
                 ),
    ARROW        (
                     "arrow",
                     "<marker\n"
                   + "   id=\"arrow\"\n"
                   + "   refX=\"0\"\n"
                   + "   refY=\"3\"\n"
                   + "   orient=\"auto\"\n"
                   + "   markerWidth=\"6\"\n"
                   + "   markerHeight=\"6\"\n"
                   + "   markerUnits=\"strokeWidth\">\n"
                   + "   <path d=\"M0,0 L0,6 L6,3 z\" fill=\"#000\" />\n"
                   + "</marker>\n"
                 ),
    DOUBLE_ARROW (
                     "double-arrow",
                     "<marker \n"
                   + "   id=\"double-arrow\"\n"
                   + "   refX=\"0\"\n"
                   + "   refY=\"3\" \n"
                   + "   orient=\"auto\"\n"
                   + "   markerWidth=\"12\"\n"
                   + "   markerHeight=\"6\"\n"
                   + "   markerUnits=\"strokeWidth\">\n"
                   + "   <path d=\"M0,0 L0,6 L6,3 z\" fill=\"#000\" />\n"
                   + "   <path d=\"M6,0 L6,6 L12,3 z\" fill=\"#000\" />\n"
                   + "</marker>\n"
                 );
      
    final String markerId;
    final String markerDef;
    
    private MarkerShape(String defId, String defText) {
        this.markerId = defId;
        this.markerDef = defText;
    }
    
    public String getId() {
        return markerId;
    }
    
    public String getMarkerDef() {
        return markerDef;
    }
      
  }
  
  public enum MarkerPos {
      START,
      MIDDLE,
      CONTINUATION,
      END
  }
  
  private ShapeSet markerSet = ballsySet;
  
  public ShapeSet getMarkerSet() {
      return markerSet;
  }
  
  public void setMarkerSet(ShapeSet markerSet) {
      this.markerSet = markerSet;
  }
  
  static ShapeSet ibmSet = new ShapeSet(MarkerShape.DOUBLE_ARROW, MarkerShape.ARROW, MarkerShape.ARROW, MarkerShape.BOWTIE);
  private static ShapeSet minimalIbmSet = new ShapeSet(MarkerShape.DOUBLE_ARROW, MarkerShape.PLAIN, MarkerShape.ARROW, MarkerShape.BOWTIE);
  static ShapeSet plainJaneSet = new ShapeSet(MarkerShape.PLAIN, MarkerShape.PLAIN, MarkerShape.PLAIN, MarkerShape.PLAIN);
  private static ShapeSet ballsySet = new ShapeSet(MarkerShape.CIRCLE, MarkerShape.PLAIN, MarkerShape.PLAIN, MarkerShape.CIRCLE);
  private static ShapeSet mohicanSet = new ShapeSet(MarkerShape.ARROW, MarkerShape.ARROW, MarkerShape.ARROW, MarkerShape.ARROW);
  private static ShapeSet teaTotallerSet = new ShapeSet(MarkerShape.CROSS, MarkerShape.PLAIN, MarkerShape.CROSS, MarkerShape.CROSS);
  private static ShapeSet malteseSet = new ShapeSet(MarkerShape.DOUBLE_CROSS, MarkerShape.PLAIN, MarkerShape.PLAIN, MarkerShape.DOUBLE_CROSS);
  private static ShapeSet teaserSet = new ShapeSet(MarkerShape.DOUBLE_CROSS, MarkerShape.PLAIN, MarkerShape.CROSS, MarkerShape.DOUBLE_CROSS);
  
  
}
