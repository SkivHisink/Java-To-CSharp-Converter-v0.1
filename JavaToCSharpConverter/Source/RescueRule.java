package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueRule.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueRule extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueRule()
  {
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply0(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  public void print(RescueReporter reporter)
  {
    print1(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public boolean Equals(RescueRule example)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

  public java.lang.String ClassName()
  {
    java.lang.String myReturn = ClassName3(nativeNdx);
    return myReturn;
  }

  private native int apply0(long refNdx
                           ,long context);
  private native void print1(long refNdx
                            ,long reporter);
  private native boolean Equals2(long refNdx
                                ,long example);
  private native java.lang.String ClassName3(long refNdx);
}
