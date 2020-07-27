using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSplineCoef : RjniBaseClass
{


  protected RescueSplineCoef(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueSplineCoef()
  {
    nativeNdx = Create_RescueSplineCoef0();
  }

  public float B()
  {
    float myReturn = B1(nativeNdx);
    return myReturn;
  }

  public float C()
  {
    float myReturn = C2(nativeNdx);
    return myReturn;
  }

  public float D()
  {
    float myReturn = D3(nativeNdx);
    return myReturn;
  }

  public void SetB(float bIn)
  {
    SetB4(nativeNdx
         ,bIn);
  }

  public void SetC(float cIn)
  {
    SetC5(nativeNdx
         ,cIn);
  }

  public void SetD(float dIn)
  {
    SetD6(nativeNdx
         ,dIn);
  }

  public float interpolate(float zmin,
                           float dz)
  {
    float myReturn = interpolate7(nativeNdx
                                 ,zmin
                                 ,dz);
    return myReturn;
  }

  public float derive(float dz)
  {
    float myReturn = derive8(nativeNdx
                            ,dz);
    return myReturn;
  }

}

}