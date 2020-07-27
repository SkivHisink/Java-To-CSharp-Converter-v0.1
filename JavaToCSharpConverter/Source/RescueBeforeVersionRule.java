package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBeforeVersionRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueBeforeVersionRule extends RescueVersionRule
{


  protected RescueBeforeVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBeforeVersionRule(int version)
  {
    nativeNdx = Create_RescueBeforeVersionRule0(version);
  }

  public RescueBeforeVersionRule()
  {
    nativeNdx = Create_RescueBeforeVersionRule1();
  }

  public void print(RescueReporter reporter)
  {
    print2(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply3(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  private native long Create_RescueBeforeVersionRule0(int version);
  private native long Create_RescueBeforeVersionRule1();
  private native void print2(long refNdx
                            ,long reporter);
  private native int apply3(long refNdx
                           ,long context);
}
