using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueHorizon : RescueLogicalOrderEntry
{


  protected RescueHorizon(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueHorizon(string horizonNameIn,
                       RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueHorizon0(horizonNameIn,
                                      (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueHorizon(nativeNdx);
  }

  public string HorizonName()
  {
    string myReturn = HorizonName2(nativeNdx);
    return myReturn;
  }

  public void SetHorizonName(string newHorizonName)
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

  public int BlockUnitHorizonSurfaceCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropRescueBlockUnitHorizonSurface(RescueBlockUnitHorizonSurface unitToDrop)
  {
    bool myReturn = DropRescueBlockUnitHorizonSurface11(nativeNdx
                                                            ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated12(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed14(nativeNdx
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

  public int UnitAboveID(bool throwIfTooBig) //thro RuntimeException
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

  public int UnitBelowID(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(UnitBelowID64(), throwIfTooBig);
  }

}

}