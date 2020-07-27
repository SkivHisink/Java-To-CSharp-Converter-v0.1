package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePreV30ValidatorRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescuePreV30ValidatorRule extends RescueVersionRule
{


  protected RescuePreV30ValidatorRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePreV30ValidatorRule()
  {
    nativeNdx = Create_RescuePreV30ValidatorRule0();
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

  public void toleranceFactor(double factor)
  {
    toleranceFactor3(nativeNdx
                    ,factor);
  }

  public double toleranceFactor()
  {
    double myReturn = toleranceFactor4(nativeNdx);
    return myReturn;
  }

  private native long Create_RescuePreV30ValidatorRule0();
  private native void print1(long refNdx
                            ,long reporter);
  private native int apply2(long refNdx
                           ,long context);
  private native void toleranceFactor3(long refNdx
                                      ,double factor);
  private native double toleranceFactor4(long refNdx);
}
