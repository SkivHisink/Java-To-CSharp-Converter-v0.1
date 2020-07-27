package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueEdgeSetStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueEdgeSetStub extends RescueWireframeStub
{


  protected RescueEdgeSetStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueEdgeSetStub(nativeNdx);
  }

  public boolean Equals(RescueEdgeSetStub other)
  {
    boolean myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescueEdgeSet other)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSet EdgeSet(RescueModel model,
                                 boolean loadIfNeeded)
  {
    long returnNdx = EdgeSet3(nativeNdx
                              ,(model == null) ? 0 : model.nativeNdx
                              ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueEdgeSetStub(long ndx);
  private native boolean Equals1(long refNdx
                                ,long other);
  private native boolean Equals2(long refNdx
                                ,long other);
  private native long EdgeSet3(long refNdx
                               ,long model
                               ,boolean loadIfNeeded);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
}
