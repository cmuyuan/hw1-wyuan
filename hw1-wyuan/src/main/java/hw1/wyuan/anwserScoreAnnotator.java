

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** assign and record an answer score to each answer.
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class anwserScoreAnnotator extends anwser {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(anwserScoreAnnotator.class);
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
  protected anwserScoreAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public anwserScoreAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public anwserScoreAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public anwserScoreAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets score of each anwser
   * @generated */
  public float getScore() {
    if (anwserScoreAnnotator_Type.featOkTst && ((anwserScoreAnnotator_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.wyuan.anwserScoreAnnotator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((anwserScoreAnnotator_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets score of each anwser 
   * @generated */
  public void setScore(float v) {
    if (anwserScoreAnnotator_Type.featOkTst && ((anwserScoreAnnotator_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.wyuan.anwserScoreAnnotator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((anwserScoreAnnotator_Type)jcasType).casFeatCode_score, v);}    
  }

    