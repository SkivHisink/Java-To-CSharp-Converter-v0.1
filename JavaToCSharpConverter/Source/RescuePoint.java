package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePoint.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePoint extends RjniBaseClass
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

  private native long Create_RescuePoint0(float xIn,
                                         float yIn,
                                         float zIn);
  private native long Create_RescuePoint1(long in);
  private native void Delete_RescuePoint(long ndx);
  private native float X4(long refNdx);
  private native float Y5(long refNdx);
  private native float Z6(long refNdx);
  private native void SetX7(long refNdx
                           ,float xIn);
  private native void SetY8(long refNdx
                           ,float yIn);
  private native void SetZ9(long refNdx
                           ,float zIn);
}
