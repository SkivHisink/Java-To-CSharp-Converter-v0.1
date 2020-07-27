package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueClassificationResult.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueClassificationResult extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassificationResult(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassificationResult(RescueRule rule,
                                    int result)
  {
    nativeNdx = Create_RescueClassificationResult0((rule == null) ? 0 : rule.nativeNdx,
                                                   result);
  }

  private native long Create_RescueClassificationResult0(long rule,
                                                        int result);
}
