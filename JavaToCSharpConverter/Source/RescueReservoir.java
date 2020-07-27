package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueReservoir.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueReservoir extends RescueObject
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
                         java.lang.String reservoirName)
  {
    nativeNdx = Create_RescueReservoir1((model == null) ? 0 : model.nativeNdx,
                                        reservoirName);
  }

  public java.lang.String ReservoirName()
  {
    java.lang.String myReturn = ReservoirName2(nativeNdx);
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

  public int UnitCount(boolean throwIfTooBig) throws RuntimeException
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

  public int NthUnitId(int zeroBasedOrdinal, boolean throwIfTooBig) throws RuntimeException
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType8(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueReservoir(long ndx);
  private native long Create_RescueReservoir1(long model,
                                             java.lang.String reservoirName);
  private native java.lang.String ReservoirName2(long refNdx);
  private native void AddUnit3(long refNdx
                              ,long toAdd);
  private native void DeleteUnit4(long refNdx
                                 ,long toDelete);
  private native long UnitCount5(long refNdx);
  private native long NthUnitId6(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthUnit7(long refNdx
                               ,long model
                               ,long zeroBasedOrdinal);
  private native boolean IsOfType8(long refNdx
                                  ,int thisType);
}
