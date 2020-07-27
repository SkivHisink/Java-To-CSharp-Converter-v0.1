package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueCoordinatePolyLine.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueCoordinatePolyLine extends RescueGeometryObject
{


  protected RescueCoordinatePolyLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueCoordinatePolyLine(nativeNdx);
  }

  private native void Delete_RescueCoordinatePolyLine(long ndx);
}
