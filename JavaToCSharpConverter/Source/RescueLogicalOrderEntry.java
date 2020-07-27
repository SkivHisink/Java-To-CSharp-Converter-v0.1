package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLogicalOrderEntry.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLogicalOrderEntry extends RescueHistoryObject
{


  protected RescueLogicalOrderEntry(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueLogicalOrderEntry()
  {
  }

  public RescueLogicalOrderEntry(RescueContext context)
  {
    nativeNdx = Create_RescueLogicalOrderEntry0((context == null) ? 0 : context.nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType1(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueLogicalOrderEntry0(long context);
  private native boolean IsOfType1(long refNdx
                                  ,int thisType);
}
