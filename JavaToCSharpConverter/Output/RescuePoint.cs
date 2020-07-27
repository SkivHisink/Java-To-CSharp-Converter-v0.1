using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePoint : RjniBaseClass
{


  protected RescuePoint(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePoint(float xIn,
                     float yIn,
                     float zIn)
  {
    nativeNdx = Create_RescuePoint0(xIn,
                                    yIn,
                                    zIn);
  }

  public RescuePoint(RescuePoint in)
  {
    nativeNdx = Create_RescuePoint1((in == null) ? 0 : in.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescuePoint(nativeNdx);
  }

  public float X()
  {
    float myReturn = X4(nativeNdx);
    return myReturn;
  }

  public float Y()
  {
    float myReturn = Y5(nativeNdx);
    return myReturn;
  }

  public float Z()
  {
    float myReturn = Z6(nativeNdx);
    return myReturn;
  }

  public void SetX(float xIn)
  {
    SetX7(nativeNdx
         ,xIn);
  }

  public void SetY(float yIn)
  {
    SetY8(nativeNdx
         ,yIn);
  }

  public void SetZ(float zIn)
  {
    SetZ9(nativeNdx
         ,zIn);
  }

}

}