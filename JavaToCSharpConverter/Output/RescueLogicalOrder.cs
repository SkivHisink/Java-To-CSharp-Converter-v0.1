using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLogicalOrder : RescueHistoryObject
{


  protected RescueLogicalOrder(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public long Count64()
  {
    long myReturn = Count0(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public RescueLogicalOrderEntry NthObject(long zeroBasedOrdinal)
  {
    long returnNdx = NthObject1(nativeNdx
                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLogicalOrderEntry myReturn = new RescueLogicalOrderEntry(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueEventDescr:
        myReturn = new RescueEventDescr(returnNdx);
        break;
      case RescueObject.R_RescueHorizon:
        myReturn = new RescueHorizon(returnNdx);
        break;
      case RescueObject.R_RescueUnit:
        myReturn = new RescueUnit(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public long NdxOf(RescueLogicalOrderEntry object)
  {
    long myReturn = NdxOf2(nativeNdx
                         ,(object == null) ? 0 : object.nativeNdx);
    return myReturn;
  }

  public RescueUnit NthUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthUnit3(nativeNdx
                              ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon NthHorizon(long zeroBasedOrdinal)
  {
    long returnNdx = NthHorizon4(nativeNdx
                                 ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueUnit BottomUnit()
  {
    long returnNdx = BottomUnit5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueUnit TopUnit()
  {
    long returnNdx = TopUnit6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon BottomHorizon()
  {
    long returnNdx = BottomHorizon7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon TopHorizon()
  {
    long returnNdx = TopHorizon8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon HorizonAbove(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = HorizonAbove9(nativeNdx
                                   ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon HorizonBelow(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = HorizonBelow10(nativeNdx
                                   ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueUnit UnitAbove(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = UnitAbove11(nativeNdx
                                ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueUnit UnitBelow(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = UnitBelow12(nativeNdx
                                ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueEventDescr EventAbove(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = EventAbove13(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueEventDescr EventBelow(RescueLogicalOrderEntry existingObject)
  {
    long returnNdx = EventBelow14(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueLogicalOrderEntry UnconformityEventAbove(RescueEventDescr existingObject)
  {
    long returnNdx = UnconformityEventAbove15(nativeNdx
                                             ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLogicalOrderEntry myReturn = new RescueLogicalOrderEntry(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueEventDescr:
        myReturn = new RescueEventDescr(returnNdx);
        break;
      case RescueObject.R_RescueHorizon:
        myReturn = new RescueHorizon(returnNdx);
        break;
      case RescueObject.R_RescueUnit:
        myReturn = new RescueUnit(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueLogicalOrderEntry UnconformityEventBelow(RescueEventDescr existingObject)
  {
    long returnNdx = UnconformityEventBelow16(nativeNdx
                                             ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLogicalOrderEntry myReturn = new RescueLogicalOrderEntry(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueEventDescr:
        myReturn = new RescueEventDescr(returnNdx);
        break;
      case RescueObject.R_RescueHorizon:
        myReturn = new RescueHorizon(returnNdx);
        break;
      case RescueObject.R_RescueUnit:
        myReturn = new RescueUnit(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public void dispose()
  {
    Delete_RescueLogicalOrder(nativeNdx);
  }

  public void InsertAtBase(RescueLogicalOrderEntry unit)
  {
    InsertAtBase18(nativeNdx
                 ,(unit == null) ? 0 : unit.nativeNdx);
  }

  public void InsertAtTop(RescueLogicalOrderEntry unit)
  {
    InsertAtTop19(nativeNdx
                ,(unit == null) ? 0 : unit.nativeNdx);
  }

  public bool InsertAbove(RescueLogicalOrderEntry existingObject,
                                RescueLogicalOrderEntry unit)
  {
    bool myReturn = InsertAbove20(nativeNdx
                                      ,(existingObject == null) ? 0 : existingObject.nativeNdx
                                      ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public bool InsertBelow(RescueLogicalOrderEntry existingObject,
                                RescueLogicalOrderEntry unit)
  {
    bool myReturn = InsertBelow21(nativeNdx
                                      ,(existingObject == null) ? 0 : existingObject.nativeNdx
                                      ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public bool Remove(RescueLogicalOrderEntry existingObject)
  {
    bool myReturn = Remove22(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

}

}