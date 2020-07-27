package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueCoordinateLine.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueCoordinateLine extends RescueGeometryObject
{


  protected RescueCoordinateLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueCoordinateLine(nativeNdx);
  }

  private native void Delete_RescueCoordinateLine(long ndx);
}
