package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGoodVolumeRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueGoodVolumeRule extends RescueRule
{


  protected RescueGoodVolumeRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGoodVolumeRule()
  {
    nativeNdx = Create_RescueGoodVolumeRule0();
  }

  public void print(RescueReporter reporter)
  {
    print1(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply2(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  private native long Create_RescueGoodVolumeRule0();
  private native void print1(long refNdx
                            ,long reporter);
  private native int apply2(long refNdx
                           ,long context);
}
