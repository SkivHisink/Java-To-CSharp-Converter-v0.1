using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueReservoir : RescueObject
{


  protected RescueReservoir(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueReservoir(nativeNdx);
  }

  public RescueReservoir(RescueModel model,
                         string reservoirName)
  {
    nativeNdx = Create_RescueReservoir1((model == null) ? 0 : model.nativeNdx,
                                        reservoirName);
  }

  public string ReservoirName()
  {
    string myReturn = ReservoirName2(nativeNdx);
    return myReturn;
  }

  public void AddUnit(RescueUnit toAdd)
  {
    AddUnit3(nativeNdx
            ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public void DeleteUnit(RescueUnit toDelete)
  {
    DeleteUnit4(nativeNdx
               ,(toDelete == null) ? 0 : toDelete.nativeNdx);
  }

  public long UnitCount64()
  {
    long myReturn = UnitCount5(nativeNdx);
    return myReturn;
  }

  public int UnitCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(UnitCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int UnitCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(UnitCount64(), throwIfTooBig);
  }

  public long NthUnitId64(long zeroBasedOrdinal)
  {
    long myReturn = NthUnitId6(nativeNdx
                             ,zeroBasedOrdinal);
    return myReturn;
  }

  public int NthUnitId(int zeroBasedOrdinal)
  {
    return (int) NthUnitId(zeroBasedOrdinal);
  }

  public int NthUnitId(int zeroBasedOrdinal, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(NthUnitId(zeroBasedOrdinal), throwIfTooBig);
  }

  public RescueUnit NthUnit(RescueModel model,
                              long zeroBasedOrdinal)
  {
    long returnNdx = NthUnit7(nativeNdx
                              ,(model == null) ? 0 : model.nativeNdx
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType8(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}