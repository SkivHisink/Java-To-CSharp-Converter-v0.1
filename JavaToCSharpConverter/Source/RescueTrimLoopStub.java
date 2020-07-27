package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTrimLoopStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTrimLoopStub extends RescueWireframeStub
{


  protected RescueTrimLoopStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTrimLoopStub(nativeNdx);
  }

  public boolean Equals(RescueTrimLoopStub other)
  {
    boolean myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescueTrimLoop other)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueTrimLoop TrimLoop(RescueModel model,
                                   boolean loadIfNeeded)
  {
    long returnNdx = TrimLoop3(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx
                               ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueTrimLoopStub(long ndx);
  private native boolean Equals1(long refNdx
                                ,long other);
  private native boolean Equals2(long refNdx
                                ,long other);
  private native long TrimLoop3(long refNdx
                                ,long model
                                ,boolean loadIfNeeded);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
}
