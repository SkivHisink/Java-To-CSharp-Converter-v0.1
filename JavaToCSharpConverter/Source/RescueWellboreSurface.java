package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWellboreSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWellboreSurface extends RescueObject
{


  protected RescueWellboreSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueWellboreSurface(RescueWellbore wellboreIn,
                               RescueIJSurface surfaceIn,
                               float uIn,
                               float vIn,
                               float mdIn)
  {
    nativeNdx = Create_RescueWellboreSurface0((wellboreIn == null) ? 0 : wellboreIn.nativeNdx,
                                              (surfaceIn == null) ? 0 : surfaceIn.nativeNdx,
                                              uIn,
                                              vIn,
                                              mdIn);
  }

  public RescueWellbore Wellbore()
  {
    long returnNdx = Wellbore1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public RescueIJSurface Surface()
  {
    long returnNdx = Surface2(nativeNdx);
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

  public float U()
  {
    float myReturn = U3(nativeNdx);
    return myReturn;
  }

  public float V()
  {
    float myReturn = V4(nativeNdx);
    return myReturn;
  }

  public float MD()
  {
    float myReturn = MD5(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType6(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueWellboreSurface(nativeNdx);
  }

  private native long Create_RescueWellboreSurface0(long wellboreIn,
                                                   long surfaceIn,
                                                   float uIn,
                                                   float vIn,
                                                   float mdIn);
  private native long Wellbore1(long refNdx);
  private native long Surface2(long refNdx);
  private native float U3(long refNdx);
  private native float V4(long refNdx);
  private native float MD5(long refNdx);
  private native boolean IsOfType6(long refNdx
                                  ,int thisType);
  private native void Delete_RescueWellboreSurface(long ndx);
}
