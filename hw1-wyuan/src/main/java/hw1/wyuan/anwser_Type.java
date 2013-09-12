
/* First created by JCasGen Wed Sep 11 23:12:51 EDT 2013 */
package hw1.wyuan;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** one anwser from input file
 * Updated by JCasGen Wed Sep 11 23:12:51 EDT 2013
 * @generated */
public class anwser_Type extends baseAnnotator_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (anwser_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = anwser_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new anwser(addr, anwser_Type.this);
  			   anwser_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new anwser(addr, anwser_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = anwser.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.wyuan.anwser");
 
  /** @generated */
  final Feature casFeat_correctness;
  /** @generated */
  final int     casFeatCode_correctness;
  /** @generated */ 
  public boolean getCorrectness(int addr) {
        if (featOkTst && casFeat_correctness == null)
      jcas.throwFeatMissing("correctness", "hw1.wyuan.anwser");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correctness);
  }
  /** @generated */    
  public void setCorrectness(int addr, boolean v) {
        if (featOkTst && casFeat_correctness == null)
      jcas.throwFeatMissing("correctness", "hw1.wyuan.anwser");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correctness, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public anwser_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_correctness = jcas.getRequiredFeatureDE(casType, "correctness", "uima.cas.Boolean", featOkTst);
    casFeatCode_correctness  = (null == casFeat_correctness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correctness).getCode();

  }
}



    