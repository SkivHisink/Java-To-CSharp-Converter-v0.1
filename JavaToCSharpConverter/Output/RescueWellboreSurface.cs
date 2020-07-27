using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWellboreSurface : RescueObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType6(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueWellboreSurface(nativeNdx);
  }

}

}