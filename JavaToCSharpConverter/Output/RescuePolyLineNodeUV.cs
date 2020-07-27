using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePolyLineNodeUV : RescueObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}