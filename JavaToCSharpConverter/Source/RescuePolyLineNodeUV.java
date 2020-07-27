package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLineNodeUV.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLineNodeUV extends RescueObject
{


  protected RescuePolyLineNodeUV(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePolyLineNodeUV(RescueContext context,
                              RescueIJSurface faceIn,
                              float u,
                              float v)
  {
    nativeNdx = Create_RescuePolyLineNodeUV0((context == null) ? 0 : context.nativeNdx,
                                             (faceIn == null) ? 0 : faceIn.nativeNdx,
                                             u,
                                             v);
  }

  public void SetUVValue(float u,
                         float v)
  {
    SetUVValue1(nativeNdx
               ,u
               ,v);
  }

  public float U()
  {
    float myReturn = U2(nativeNdx);
    return myReturn;
  }

  public float V()
  {
    float myReturn = V3(nativeNdx);
    return myReturn;
  }

  public RescueIJSurface Face()
  {
    long returnNdx = Face4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueIJSurface myReturn = new RescueIJSurface(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescuePolyLineNodeUV0(long context,
                                                  long faceIn,
                                                  float u,
                                                  float v);
  private native void SetUVValue1(long refNdx
                                 ,float u
                                 ,float v);
  private native float U2(long refNdx);
  private native float V3(long refNdx);
  private native long Face4(long refNdx);
  private native boolean IsOfType5(long refNdx
                                  ,int thisType);
}
