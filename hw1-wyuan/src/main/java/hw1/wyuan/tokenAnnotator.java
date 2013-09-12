

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** annotator for each token span in each question and answer
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class tokenAnnotator extends baseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(tokenAnnotator.class);
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
  protected tokenAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public tokenAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public tokenAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public tokenAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: token

  /** getter for token - gets a token extracted from question or answer
   * @generated */
  public String getToken() {
    if (tokenAnnotator_Type.featOkTst && ((tokenAnnotator_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "hw1.wyuan.tokenAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((tokenAnnotator_Type)jcasType).casFeatCode_token);}
    
  /** setter for token - sets a token extracted from question or answer 
   * @generated */
  public void setToken(String v) {
    if (tokenAnnotator_Type.featOkTst && ((tokenAnnotator_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "hw1.wyuan.tokenAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((tokenAnnotator_Type)jcasType).casFeatCode_token, v);}    
  }

    