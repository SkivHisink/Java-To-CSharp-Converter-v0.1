package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueHaveFaultRelationshipsRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueHaveFaultRelationshipsRule extends RescueRule
{


  protected RescueHaveFaultRelationshipsRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueHaveFaultRelationshipsRule()
  {
    nativeNdx = Create_RescueHaveFaultRelationshipsRule0();
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

  private native long Create_RescueHaveFaultRelationshipsRule0();
  private native void print1(long refNdx
                            ,long reporter);
  private native int apply2(long refNdx
                           ,long context);
}
