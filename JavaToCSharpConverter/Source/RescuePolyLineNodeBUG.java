package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLineNodeBUG.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLineNodeBUG extends RescueObject
{


  protected RescuePolyLineNodeBUG(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void SetNdxParam(float paramIn)
  {
    SetNdxParam0(nativeNdx
                ,paramIn);
  }

  public int Type()
  {
    int myReturn = Type1(nativeNdx);
    return myReturn;
  }

  public float NdxParam()
  {
    float myReturn = NdxParam2(nativeNdx);
    return myReturn;
  }

  public RescueGeometry Geometry()
  {
    long returnNdx = Geometry3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void SetNdxParam0(long refNdx
                                  ,float paramIn);
  private native int Type1(long refNdx);
  private native float NdxParam2(long refNdx);
  private native long Geometry3(long refNdx);
  private native boolean IsOfType4(long refNdx
                                  ,int thisType);
}
