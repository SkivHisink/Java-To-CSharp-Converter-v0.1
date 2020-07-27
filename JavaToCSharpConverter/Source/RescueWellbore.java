package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWellbore.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWellbore extends RescueHistoryObject
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
                        java.lang.String wellboreName,
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
                        java.lang.String wellboreName,
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

  public java.lang.String WellboreName()
  {
    java.lang.String myReturn = WellboreName3(nativeNdx);
    return myReturn;
  }

  public void SetWellboreName(java.lang.String newName)
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

  public int WellboreSamplingCount(boolean throwIfTooBig) throws RuntimeException
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

  public boolean DropRescueWellboreSampling(RescueWellboreSampling unitToDrop)
  {
    boolean myReturn = DropRescueWellboreSampling10(nativeNdx
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

  public boolean DropRescueWellboreSurface(RescueWellboreSurface surfaceToDrop)
  {
    boolean myReturn = DropRescueWellboreSurface13(nativeNdx
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

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated15(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType16(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueWellbore(long ndx);
  private native long Create_RescueWellbore1(int orientation,
                                            long parentModel,
                                            java.lang.String wellboreName,
                                            float missingValue,
                                            long i_lowbound,
                                            long i_count);
  private native long Create_RescueWellbore2(int orientation,
                                            long parentModel,
                                            java.lang.String wellboreName,
                                            float missingValue,
                                            float[] quadrupletArray,
                                            long i_lowbound,
                                            long i_count);
  private native java.lang.String WellboreName3(long refNdx);
  private native void SetWellboreName4(long refNdx
                                      ,java.lang.String newName);
  private native long ParentModel5(long refNdx);
  private native long WellboreGrid6(long refNdx);
  private native long WellboreGeometry7(long refNdx);
  private native long WellboreSamplingCount8(long refNdx);
  private native long NthRescueWellboreSampling9(long refNdx
                                                 ,long zeroBasedOrdinal);
  private native boolean DropRescueWellboreSampling10(long refNdx
                                                     ,long unitToDrop);
  private native long WellboreSurfaceCount11(long refNdx);
  private native long NthRescueWellboreSurface12(long refNdx
                                                 ,long zeroBasedOrdinal);
  private native boolean DropRescueWellboreSurface13(long refNdx
                                                    ,long surfaceToDrop);
  private native long CellIntersections14(long refNdx);
  private native boolean AnyFileTruncated15(long refNdx);
  private native boolean IsOfType16(long refNdx
                                   ,int thisType);
  private native long WellboreSamplingIdentifiedBy17(long refNdx
                                                    ,long identifier);
}
