package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueHorizon.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueHorizon extends RescueLogicalOrderEntry
{


  protected RescueHorizon(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueHorizon(java.lang.String horizonNameIn,
                       RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueHorizon0(horizonNameIn,
                                      (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueHorizon(nativeNdx);
  }

  public java.lang.String HorizonName()
  {
    java.lang.String myReturn = HorizonName2(nativeNdx);
    return myReturn;
  }

  public void SetHorizonName(java.lang.String newHorizonName)
  {
    SetHorizonName3(nativeNdx
                   ,newHorizonName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public long BlockUnitHorizonSurfaceCount64()
  {
    long myReturn = BlockUnitHorizonSurfaceCount5(nativeNdx);
    return myReturn;
  }

  public int BlockUnitHorizonSurfaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BlockUnitHorizonSurfaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BlockUnitHorizonSurfaceCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(BlockUnitHorizonSurfaceCount64(), throwIfTooBig);
  }

  public RescueBlockUnitHorizonSurface NthRescueBlockUnitHorizonSurface(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueBlockUnitHorizonSurface6(nativeNdx
                                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitHorizonSurface myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitHorizonSurface HorizonSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = HorizonSurfaceIdentifiedBy7(nativeNdx
                                                 ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitHorizonSurface myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueIJSurface SurfaceIJIdentifiedBy(long identifier)
  {
    long returnNdx = SurfaceIJIdentifiedBy8(nativeNdx
                                            ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueIJSurface myReturn = new RescueIJSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangulatedSurface SurfaceTriangulatedIdentifiedBy(long identifier)
  {
    long returnNdx = SurfaceTriangulatedIdentifiedBy9(nativeNdx
                                                      ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangulatedSurface myReturn = new RescueTriangulatedSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyIdentifiedBy10(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public boolean DropRescueBlockUnitHorizonSurface(RescueBlockUnitHorizonSurface unitToDrop)
  {
    boolean myReturn = DropRescueBlockUnitHorizonSurface11(nativeNdx
                                                            ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated12(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed14(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public long UnitAboveID64()
  {
    long myReturn = UnitAboveID15(nativeNdx);
    return myReturn;
  }

  public int UnitAboveID()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(UnitAboveID64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int UnitAboveID(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(UnitAboveID64(), throwIfTooBig);
  }

  public long UnitBelowID64()
  {
    long myReturn = UnitBelowID16(nativeNdx);
    return myReturn;
  }

  public int UnitBelowID()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(UnitBelowID64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int UnitBelowID(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(UnitBelowID64(), throwIfTooBig);
  }

  private native long Create_RescueHorizon0(java.lang.String horizonNameIn,
                                           long parentModelIn);
  private native void Delete_RescueHorizon(long ndx);
  private native java.lang.String HorizonName2(long refNdx);
  private native void SetHorizonName3(long refNdx
                                     ,java.lang.String newHorizonName);
  private native long ParentModel4(long refNdx);
  private native long BlockUnitHorizonSurfaceCount5(long refNdx);
  private native long NthRescueBlockUnitHorizonSurface6(long refNdx
                                                        ,long zeroBasedOrdinal);
  private native long HorizonSurfaceIdentifiedBy7(long refNdx
                                                  ,long identifier);
  private native long SurfaceIJIdentifiedBy8(long refNdx
                                             ,long identifier);
  private native long SurfaceTriangulatedIdentifiedBy9(long refNdx
                                                       ,long identifier);
  private native long PropertyIdentifiedBy10(long refNdx
                                             ,long identifier);
  private native boolean DropRescueBlockUnitHorizonSurface11(long refNdx
                                                            ,long unitToDrop);
  private native boolean AnyFileTruncated12(long refNdx);
  private native boolean IsOfType13(long refNdx
                                   ,int thisType);
  private native boolean IsNamed14(long refNdx
                                  ,java.lang.String possibleName);
  private native long UnitAboveID15(long refNdx);
  private native long UnitBelowID16(long refNdx);
}
