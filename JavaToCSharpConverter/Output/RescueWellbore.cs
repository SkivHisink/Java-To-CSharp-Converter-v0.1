using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWellbore : RescueHistoryObject
{


  protected RescueWellbore(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueWellbore(nativeNdx);
  }

  public RescueWellbore(int orientation,
                        RescueModel parentModel,
                        string wellboreName,
                        float missingValue,
                        long i_lowbound,
                        long i_count)
  {
    nativeNdx = Create_RescueWellbore1(orientation,
                                       (parentModel == null) ? 0 : parentModel.nativeNdx,
                                       wellboreName,
                                       missingValue,
                                       i_lowbound,
                                       i_count);
  }

  public RescueWellbore(int orientation,
                        RescueModel parentModel,
                        string wellboreName,
                        float missingValue,
                        float[] quadrupletArray,
                        long i_lowbound,
                        long i_count)
  {
    nativeNdx = Create_RescueWellbore2(orientation,
                                       (parentModel == null) ? 0 : parentModel.nativeNdx,
                                       wellboreName,
                                       missingValue,
                                       quadrupletArray,
                                       i_lowbound,
                                       i_count);
  }

  public string WellboreName()
  {
    string myReturn = WellboreName3(nativeNdx);
    return myReturn;
  }

  public void SetWellboreName(string newName)
  {
    SetWellboreName4(nativeNdx
                    ,newName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel5(nativeNdx);
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

  public RescueGrid WellboreGrid()
  {
    long returnNdx = WellboreGrid6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public RescueQuadrupletArray WellboreGeometry()
  {
    long returnNdx = WellboreGeometry7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueQuadrupletArray myReturn = new RescueQuadrupletArray(returnNdx);
      return myReturn;
    }
  }

  public long WellboreSamplingCount64()
  {
    long myReturn = WellboreSamplingCount8(nativeNdx);
    return myReturn;
  }

  public int WellboreSamplingCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WellboreSamplingCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WellboreSamplingCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(WellboreSamplingCount64(), throwIfTooBig);
  }

  public RescueWellboreSampling NthRescueWellboreSampling(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWellboreSampling9(nativeNdx
                                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreSampling myReturn = new RescueWellboreSampling(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreSampling WellboreSamplingIdentifiedBy(long identifier)
  {
    long returnNdx = WellboreSamplingIdentifiedBy17(nativeNdx
                                                ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreSampling myReturn = new RescueWellboreSampling(returnNdx);
      return myReturn;
    }
  }

  public bool DropRescueWellboreSampling(RescueWellboreSampling unitToDrop)
  {
    bool myReturn = DropRescueWellboreSampling10(nativeNdx
                                                     ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public long WellboreSurfaceCount64()
  {
    long myReturn = WellboreSurfaceCount11(nativeNdx);
    return myReturn;
  }

  public int WellboreSurfaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WellboreSurfaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public RescueWellboreSurface NthRescueWellboreSurface(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWellboreSurface12(nativeNdx
                                               ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreSurface myReturn = new RescueWellboreSurface(returnNdx);
      return myReturn;
    }
  }

  public bool DropRescueWellboreSurface(RescueWellboreSurface surfaceToDrop)
  {
    bool myReturn = DropRescueWellboreSurface13(nativeNdx
                                                    ,(surfaceToDrop == null) ? 0 : surfaceToDrop.nativeNdx);
    return myReturn;
  }

  public cBagRescueWellboreCell CellIntersections()
  {
    long returnNdx = CellIntersections14(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cBagRescueWellboreCell myReturn = new cBagRescueWellboreCell(returnNdx);
      return myReturn;
    }
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated15(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType16(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}