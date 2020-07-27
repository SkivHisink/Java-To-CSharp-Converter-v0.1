package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSplitLine.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSplitLine extends RescueGeometryObject
{


  protected RescueSplitLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueSplitLine(nativeNdx);
  }

  private native void Delete_RescueSplitLine(long ndx);
}
