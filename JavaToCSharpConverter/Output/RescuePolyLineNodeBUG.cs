using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePolyLineNodeBUG : RescueObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}