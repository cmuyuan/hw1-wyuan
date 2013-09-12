

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** All other types then inherit from this base annotation type
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class baseAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(baseAnnotator.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected baseAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public baseAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public baseAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public baseAnnotator(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets keep track of where an annotation was originally made by
   * @generated */
  public String getSource() {
    if (baseAnnotator_Type.featOkTst && ((baseAnnotator_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1.wyuan.baseAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((baseAnnotator_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets keep track of where an annotation was originally made by 
   * @generated */
  public void setSource(String v) {
    if (baseAnnotator_Type.featOkTst && ((baseAnnotator_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "hw1.wyuan.baseAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((baseAnnotator_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets how confidence the annotation was
   * @generated */
  public float getConfidence() {
    if (baseAnnotator_Type.featOkTst && ((baseAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.wyuan.baseAnnotator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((baseAnnotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets how confidence the annotation was 
   * @generated */
  public void setConfidence(float v) {
    if (baseAnnotator_Type.featOkTst && ((baseAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.wyuan.baseAnnotator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((baseAnnotator_Type)jcasType).casFeatCode_confidence, v);}    
  }

    