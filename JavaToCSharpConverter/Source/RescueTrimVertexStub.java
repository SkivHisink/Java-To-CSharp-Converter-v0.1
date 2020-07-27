package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTrimVertexStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTrimVertexStub extends RescueWireframeStub
{


  protected RescueTrimVertexStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTrimVertexStub(nativeNdx);
  }

  public boolean Equals(RescueTrimVertexStub other)
  {
    boolean myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescueTrimVertex other)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueTrimVertex TrimVertex(RescueModel model,
                                       boolean loadIfNeeded)
  {
    long returnNdx = TrimVertex3(nativeNdx
                                 ,(model == null) ? 0 : model.nativeNdx
                                 ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimVertex myReturn = new RescueTrimVertex(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueTrimVertexStub(long ndx);
  private native boolean Equals1(long refNdx
                                ,long other);
  private native boolean Equals2(long refNdx
                                ,long other);
  private native long TrimVertex3(long refNdx
                                  ,long model
                                  ,boolean loadIfNeeded);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
}
