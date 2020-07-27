package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSplineCoef.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSplineCoef extends RjniBaseClass
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

  private native long Create_RescueSplineCoef0();
  private native float B1(long refNdx);
  private native float C2(long refNdx);
  private native float D3(long refNdx);
  private native void SetB4(long refNdx
                           ,float bIn);
  private native void SetC5(long refNdx
                           ,float cIn);
  private native void SetD6(long refNdx
                           ,float dIn);
  private native float interpolate7(long refNdx
                                   ,float zmin
                                   ,float dz);
  private native float derive8(long refNdx
                              ,float dz);
}
