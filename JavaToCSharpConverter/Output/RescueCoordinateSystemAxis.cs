using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueCoordinateSystemAxis : RescueObject
{


  protected RescueCoordinateSystemAxis(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueCoordinateSystem ParentCoordinateSystem()
  {
    long returnNdx = ParentCoordinateSystem0(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystem myReturn = new RescueCoordinateSystem(returnNdx);
      return myReturn;
    }
  }

  public void dispose()
  {
    Delete_RescueCoordinateSystemAxis(nativeNdx);
  }

  public string AxisName()
  {
    string myReturn = AxisName2(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType3(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public string UnitOfMeasure()
  {
    string myReturn = UnitOfMeasure4(nativeNdx);
    return myReturn;
  }

}

}