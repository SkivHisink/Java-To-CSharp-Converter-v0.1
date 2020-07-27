package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLogicalOrder.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLogicalOrder extends RescueHistoryObject
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

  public boolean InsertAbove(RescueLogicalOrderEntry existingObject,
                                RescueLogicalOrderEntry unit)
  {
    boolean myReturn = InsertAbove20(nativeNdx
                                      ,(existingObject == null) ? 0 : existingObject.nativeNdx
                                      ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public boolean InsertBelow(RescueLogicalOrderEntry existingObject,
                                RescueLogicalOrderEntry unit)
  {
    boolean myReturn = InsertBelow21(nativeNdx
                                      ,(existingObject == null) ? 0 : existingObject.nativeNdx
                                      ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public boolean Remove(RescueLogicalOrderEntry existingObject)
  {
    boolean myReturn = Remove22(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  private native long Count0(long refNdx);
  private native long NthObject1(long refNdx
                                 ,long zeroBasedOrdinal);
  private native long NdxOf2(long refNdx
                           ,long object);
  private native long NthUnit3(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthHorizon4(long refNdx
                                  ,long zeroBasedOrdinal);
  private native long BottomUnit5(long refNdx);
  private native long TopUnit6(long refNdx);
  private native long BottomHorizon7(long refNdx);
  private native long TopHorizon8(long refNdx);
  private native long HorizonAbove9(long refNdx
                                    ,long existingObject);
  private native long HorizonBelow10(long refNdx
                                     ,long existingObject);
  private native long UnitAbove11(long refNdx
                                  ,long existingObject);
  private native long UnitBelow12(long refNdx
                                  ,long existingObject);
  private native long EventAbove13(long refNdx
                                   ,long existingObject);
  private native long EventBelow14(long refNdx
                                   ,long existingObject);
  private native long UnconformityEventAbove15(long refNdx
                                               ,long existingObject);
  private native long UnconformityEventBelow16(long refNdx
                                               ,long existingObject);
  private native void Delete_RescueLogicalOrder(long ndx);
  private native void InsertAtBase18(long refNdx
                                    ,long unit);
  private native void InsertAtTop19(long refNdx
                                   ,long unit);
  private native boolean InsertAbove20(long refNdx
                                      ,long existingObject
                                      ,long unit);
  private native boolean InsertBelow21(long refNdx
                                      ,long existingObject
                                      ,long unit);
  private native boolean Remove22(long refNdx
                                 ,long existingObject);
}
