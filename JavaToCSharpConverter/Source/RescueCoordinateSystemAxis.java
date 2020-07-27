package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueCoordinateSystemAxis.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueCoordinateSystemAxis extends RescueObject
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

  public java.lang.String AxisName()
  {
    java.lang.String myReturn = AxisName2(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType3(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public java.lang.String UnitOfMeasure()
  {
    java.lang.String myReturn = UnitOfMeasure4(nativeNdx);
    return myReturn;
  }

  private native long ParentCoordinateSystem0(long refNdx);
  private native void Delete_RescueCoordinateSystemAxis(long ndx);
  private native java.lang.String AxisName2(long refNdx);
  private native boolean IsOfType3(long refNdx
                                  ,int thisType);
  private native java.lang.String UnitOfMeasure4(long refNdx);
}
