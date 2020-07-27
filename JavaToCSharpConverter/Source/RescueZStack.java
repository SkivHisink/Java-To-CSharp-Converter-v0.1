package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueZStack.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueZStack extends RescueGeometryObject
{


  protected RescueZStack(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueZStack(nativeNdx);
  }

  private native void Delete_RescueZStack(long ndx);
}
