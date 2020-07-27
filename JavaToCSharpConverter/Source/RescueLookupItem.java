package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLookupItem.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLookupItem extends RescueObject
{


  protected RescueLookupItem(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueLookupItem()
  {
  }

  public void dispose()
  {
    Delete_RescueLookupItem(nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType2(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueLookupItem(long ndx);
  private native boolean IsOfType2(long refNdx
                                  ,int thisType);
}
