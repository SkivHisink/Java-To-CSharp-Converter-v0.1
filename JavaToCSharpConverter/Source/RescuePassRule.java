package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePassRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescuePassRule extends RescueRule
{


  protected RescuePassRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePassRule(boolean pass)
  {
    nativeNdx = Create_RescuePassRule0(pass);
  }

  public RescuePassRule()
  {
    nativeNdx = Create_RescuePassRule1();
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

  public boolean Equals(RescueRule example)
  {
    boolean myReturn = Equals4(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

  private native long Create_RescuePassRule0(boolean pass);
  private native long Create_RescuePassRule1();
  private native void print2(long refNdx
                            ,long reporter);
  private native int apply3(long refNdx
                           ,long context);
  private native boolean Equals4(long refNdx
                                ,long example);
}
