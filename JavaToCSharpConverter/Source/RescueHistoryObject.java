package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueHistoryObject.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueHistoryObject extends RescueObject
{


  protected RescueHistoryObject(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueHistoryObject()
  {
  }

  public RescueHistoryObject(RescueContext context)
  {
    nativeNdx = Create_RescueHistoryObject0((context == null) ? 0 : context.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueHistoryObject(nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType2(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public RescueHistory NthObjectChanges(long zeroBasedOrdinal)
  {
    long returnNdx = NthObjectChanges3(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  public RescueHistory NthRelatedChanges(long zeroBasedOrdinal)
  {
    long returnNdx = NthRelatedChanges4(nativeNdx
                                        ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  private native long Create_RescueHistoryObject0(long context);
  private native void Delete_RescueHistoryObject(long ndx);
  private native boolean IsOfType2(long refNdx
                                  ,int thisType);
  private native long NthObjectChanges3(long refNdx
                                        ,long zeroBasedOrdinal);
  private native long NthRelatedChanges4(long refNdx
                                         ,long zeroBasedOrdinal);
}
