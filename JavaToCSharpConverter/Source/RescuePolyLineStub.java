package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLineStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLineStub extends RescueWireframeStub
{


  protected RescuePolyLineStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescuePolyLineStub(nativeNdx);
  }

  public boolean Equals(RescuePolyLineStub other)
  {
    boolean myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescuePolyLine other)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescuePolyLine PolyLine(RescueModel model,
                                   boolean loadIfNeeded)
  {
    long returnNdx = PolyLine3(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx
                               ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLine myReturn = new RescuePolyLine(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescuePolyLineStub(long ndx);
  private native boolean Equals1(long refNdx
                                ,long other);
  private native boolean Equals2(long refNdx
                                ,long other);
  private native long PolyLine3(long refNdx
                                ,long model
                                ,boolean loadIfNeeded);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
}
