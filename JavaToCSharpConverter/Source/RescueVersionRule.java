package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueVersionRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueVersionRule extends RescueRule
{


  protected RescueVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueVersionRule()
  {
  }

  public void dispose()
  {
    Delete_RescueVersionRule(nativeNdx);
  }

  public void print(RescueReporter reporter)
  {
    print3(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply4(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  public int version()
  {
    int myReturn = version5(nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescueRule example)
  {
    boolean myReturn = Equals6(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

  private native void Delete_RescueVersionRule(long ndx);
  private native void print3(long refNdx
                            ,long reporter);
  private native int apply4(long refNdx
                           ,long context);
  private native int version5(long refNdx);
  private native boolean Equals6(long refNdx
                                ,long example);
}
