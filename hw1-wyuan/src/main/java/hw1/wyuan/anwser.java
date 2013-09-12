

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** one anwser from input file
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class anwser extends baseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(anwser.class);
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
  protected anwser() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public anwser(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public anwser(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public anwser(JCas jcas, int begin, int end) {
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
  //* Feature: correctness

  /** getter for correctness - gets whether the anwser is correct or not
   * @generated */
  public boolean getCorrectness() {
    if (anwser_Type.featOkTst && ((anwser_Type)jcasType).casFeat_correctness == null)
      jcasType.jcas.throwFeatMissing("correctness", "hw1.wyuan.anwser");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((anwser_Type)jcasType).casFeatCode_correctness);}
    
  /** setter for correctness - sets whether the anwser is correct or not 
   * @generated */
  public void setCorrectness(boolean v) {
    if (anwser_Type.featOkTst && ((anwser_Type)jcasType).casFeat_correctness == null)
      jcasType.jcas.throwFeatMissing("correctness", "hw1.wyuan.anwser");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((anwser_Type)jcasType).casFeatCode_correctness, v);}    
  }

    