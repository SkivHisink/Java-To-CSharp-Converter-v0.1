package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueAndUpVersionRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueAndUpVersionRule extends RescueVersionRule
{


  protected RescueAndUpVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueAndUpVersionRule(int version)
  {
    nativeNdx = Create_RescueAndUpVersionRule0(version);
  }

  public RescueAndUpVersionRule()
  {
    nativeNdx = Create_RescueAndUpVersionRule1();
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

  private native long Create_RescueAndUpVersionRule0(int version);
  private native long Create_RescueAndUpVersionRule1();
  private native void print2(long refNdx
                            ,long reporter);
  private native int apply3(long refNdx
                           ,long context);
}
