package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSplitPoint.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSplitPoint extends RjniBaseClass
{


  protected RescueSplitPoint(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueSplitPoint(nativeNdx);
  }

  private native void Delete_RescueSplitPoint(long ndx);
}
