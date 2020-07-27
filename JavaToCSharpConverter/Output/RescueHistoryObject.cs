using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueHistoryObject : RescueObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType2(nativeNdx
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

}

}