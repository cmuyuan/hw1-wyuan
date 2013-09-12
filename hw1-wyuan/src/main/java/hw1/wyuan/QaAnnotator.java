

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** annotate input file and extract question and answers
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class QaAnnotator extends baseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QaAnnotator.class);
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
  protected QaAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QaAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QaAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QaAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets text of question, extracted from input file
   * @generated */
  public String getQuestion() {
    if (QaAnnotator_Type.featOkTst && ((QaAnnotator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.wyuan.QaAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QaAnnotator_Type)jcasType).casFeatCode_question);}
    
  /** setter for question - sets text of question, extracted from input file 
   * @generated */
  public void setQuestion(String v) {
    if (QaAnnotator_Type.featOkTst && ((QaAnnotator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.wyuan.QaAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((QaAnnotator_Type)jcasType).casFeatCode_question, v);}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets array list of answers extracted from input file
   * @generated */
  public StringList getAnswers() {
    if (QaAnnotator_Type.featOkTst && ((QaAnnotator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.wyuan.QaAnnotator");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QaAnnotator_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets array list of answers extracted from input file 
   * @generated */
  public void setAnswers(StringList v) {
    if (QaAnnotator_Type.featOkTst && ((QaAnnotator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.wyuan.QaAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((QaAnnotator_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    