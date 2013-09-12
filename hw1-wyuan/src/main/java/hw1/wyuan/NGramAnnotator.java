

/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** annotate 1-, 2- and 3-grams of consecutive tokens.
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * XML source: /home/ywq/git/hw1-wyuan/hw1-wyuan/src/main/resources/hw1-wyuan-typesystem.xml
 * @generated */
public class NGramAnnotator extends baseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramAnnotator.class);
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
  protected NGramAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets specify the number of grams
   * @generated */
  public int getN() {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "hw1.wyuan.NGramAnnotator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets specify the number of grams 
   * @generated */
  public void setN(int v) {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "hw1.wyuan.NGramAnnotator");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets consecutive tokens to be annotated
   * @generated */
  public FSArray getTokens() {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.wyuan.NGramAnnotator");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets consecutive tokens to be annotated 
   * @generated */
  public void setTokens(FSArray v) {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.wyuan.NGramAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - consecutive tokens to be annotated
   * @generated */
  public tokenAnnotator getTokens(int i) {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.wyuan.NGramAnnotator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens), i);
    return (tokenAnnotator)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - consecutive tokens to be annotated
   * @generated */
  public void setTokens(int i, tokenAnnotator v) { 
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "hw1.wyuan.NGramAnnotator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    