package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSplitNodesRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueSplitNodesRule extends RescueRule
{


  protected RescueSplitNodesRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueSplitNodesRule(boolean wantSplitsIn)
  {
    nativeNdx = Create_RescueSplitNodesRule0(wantSplitsIn);
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

  public boolean Equals(RescueRule example)
  {
    boolean myReturn = Equals3(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

  private native long Create_RescueSplitNodesRule0(boolean wantSplitsIn);
  private native void print1(long refNdx
                            ,long reporter);
  private native int apply2(long refNdx
                           ,long context);
  private native boolean Equals3(long refNdx
                                ,long example);
}
