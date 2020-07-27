using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLogicalOrderEntry : RescueHistoryObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType1(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}