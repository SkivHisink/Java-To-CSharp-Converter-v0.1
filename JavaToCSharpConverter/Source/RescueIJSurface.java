package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueIJSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueIJSurface extends RescueHistoryObject
{


  protected RescueIJSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueIJSurface(RescueSurface surfaceIn,
                         int orientation,
                         RescueCoordinateSystemAxis i_axis,
                         float i_origin,
                         float i_step,
                         long i_lowbound,
                         long i_count,
                         RescueCoordinateSystemAxis j_axis,
                         float j_origin,
                         float j_step,
                         long j_lowbound,
                         long j_count,
                         float missingValue)
  {
    nativeNdx = Create_RescueIJSurface0((surfaceIn == null) ? 0 : surfaceIn.nativeNdx,
                                        orientation,
                                        (i_axis == null) ? 0 : i_axis.nativeNdx,
                                        i_origin,
                                        i_step,
                                        i_lowbound,
                                        i_count,
                                        (j_axis == null) ? 0 : j_axis.nativeNdx,
                                        j_origin,
                                        j_step,
                                        j_lowbound,
                                        j_count,
                                        missingValue);
  }

  public RescueIJSurface(RescueSurface surfaceIn,
                         int orientation,
                         RescueCoordinateSystemAxis i_axis,
                         float i_origin,
                         float i_step,
                         long i_lowbound,
                         long i_count,
                         RescueCoordinateSystemAxis j_axis,
                         float j_origin,
                         float j_step,
                         long j_lowbound,
                         long j_count,
                         float missingValue,
                         float[] values)
  {
    nativeNdx = Create_RescueIJSurface1((surfaceIn == null) ? 0 : surfaceIn.nativeNdx,
                                        orientation,
                                        (i_axis == null) ? 0 : i_axis.nativeNdx,
                                        i_origin,
                                        i_step,
                                        i_lowbound,
                                        i_count,
                                        (j_axis == null) ? 0 : j_axis.nativeNdx,
                                        j_origin,
                                        j_step,
                                        j_lowbound,
                                        j_count,
                                        missingValue,
                                        values);
  }

  public RescueIJSurface(RescueSurface surfaceIn,
                         int orientation,
                         long i_lowbound,
                         long i_count,
                         long j_lowbound,
                         long j_count,
                         float missingValue)
  {
    nativeNdx = Create_RescueIJSurface2((surfaceIn == null) ? 0 : surfaceIn.nativeNdx,
                                        orientation,
                                        i_lowbound,
                                        i_count,
                                        j_lowbound,
                                        j_count,
                                        missingValue);
  }

  public RescueIJSurface(RescueSurface surfaceIn,
                         int orientation,
                         long i_lowbound,
                         long i_count,
                         long j_lowbound,
                         long j_count,
                         float missingValue,
                         float[] tripletArray)
  {
    nativeNdx = Create_RescueIJSurface3((surfaceIn == null) ? 0 : surfaceIn.nativeNdx,
                                        orientation,
                                        i_lowbound,
                                        i_count,
                                        j_lowbound,
                                        j_count,
                                        missingValue,
                                        tripletArray);
  }

  public RescueGrid Grid()
  {
    long returnNdx = Grid4(nativeNdx);
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

  public RescueTripletArray Geometry()
  {
    long returnNdx = Geometry5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTripletArray myReturn = new RescueTripletArray(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueQuadrupletArray:
        myReturn = new RescueQuadrupletArray(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public long SurfaceCellCount64()
  {
    long myReturn = SurfaceCellCount6(nativeNdx);
    return myReturn;
  }

  public int SurfaceCellCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SurfaceCellCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SurfaceCellCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SurfaceCellCount64(), throwIfTooBig);
  }

  public RescueSurfaceCell NthSurfaceCell(long zeroBasedOrdinal)
  {
    long returnNdx = NthSurfaceCell7(nativeNdx
                                     ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurfaceCell myReturn = new RescueSurfaceCell(returnNdx);
      return myReturn;
    }
  }

  public long SurfaceGridCount64()
  {
    long myReturn = SurfaceGridCount8(nativeNdx);
    return myReturn;
  }

  public int SurfaceGridCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SurfaceGridCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SurfaceGridCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SurfaceGridCount64(), throwIfTooBig);
  }

  public RescueSurfaceToGrid NthSurfaceGrid(long zeroBasedOrdinal)
  {
    long returnNdx = NthSurfaceGrid9(nativeNdx
                                     ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurfaceToGrid myReturn = new RescueSurfaceToGrid(returnNdx);
      return myReturn;
    }
  }

  public long StairSteppedFaultCount64()
  {
    long myReturn = StairSteppedFaultCount10(nativeNdx);
    return myReturn;
  }

  public int StairSteppedFaultCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(StairSteppedFaultCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int StairSteppedFaultCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(StairSteppedFaultCount64(), throwIfTooBig);
  }

  public RescueStairSteppedFault NthStairSteppedFault(long zeroBasedOrdinal)
  {
    long returnNdx = NthStairSteppedFault11(nativeNdx
                                           ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueStairSteppedFault myReturn = new RescueStairSteppedFault(returnNdx);
      return myReturn;
    }
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

  public void dispose()
  {
    Delete_RescueIJSurface(nativeNdx);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel15(nativeNdx);
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

  public RescueSurface ParentSurface()
  {
    long returnNdx = ParentSurface16(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public float ZValueAt(long i,
                        long j)
  {
    float myReturn = ZValueAt17(nativeNdx
                              ,i
                              ,j);
    return myReturn;
  }

  public void SetFaceStatus(long i,
                            long j,
                            int newStatus)
  {
    SetFaceStatus18(nativeNdx
                  ,i
                  ,j
                  ,newStatus);
  }

  public int FaceStatus(long i,
						long j)
  {
    int myReturn = FaceStatus19(nativeNdx
                               ,i
                               ,j);
    return myReturn;
  }

  private native long Create_RescueIJSurface0(long surfaceIn,
                                             int orientation,
                                             long i_axis,
                                             float i_origin,
                                             float i_step,
                                             long i_lowbound,
                                             long i_count,
                                             long j_axis,
                                             float j_origin,
                                             float j_step,
                                             long j_lowbound,
                                             long j_count,
                                             float missingValue);
  private native long Create_RescueIJSurface1(long surfaceIn,
                                             int orientation,
                                             long i_axis,
                                             float i_origin,
                                             float i_step,
                                             long i_lowbound,
                                             long i_count,
                                             long j_axis,
                                             float j_origin,
                                             float j_step,
                                             long j_lowbound,
                                             long j_count,
                                             float missingValue,
                                             float[] values);
  private native long Create_RescueIJSurface2(long surfaceIn,
                                             int orientation,
                                             long i_lowbound,
                                             long i_count,
                                             long j_lowbound,
                                             long j_count,
                                             float missingValue);
  private native long Create_RescueIJSurface3(long surfaceIn,
                                             int orientation,
                                             long i_lowbound,
                                             long i_count,
                                             long j_lowbound,
                                             long j_count,
                                             float missingValue,
                                             float[] tripletArray);
  private native long Grid4(long refNdx);
  private native long Geometry5(long refNdx);
  private native long SurfaceCellCount6(long refNdx);
  private native long NthSurfaceCell7(long refNdx
                                      ,long zeroBasedOrdinal);
  private native long SurfaceGridCount8(long refNdx);
  private native long NthSurfaceGrid9(long refNdx
                                      ,long zeroBasedOrdinal);
  private native long StairSteppedFaultCount10(long refNdx);
  private native long NthStairSteppedFault11(long refNdx
                                             ,long zeroBasedOrdinal);
  private native boolean AnyFileTruncated12(long refNdx);
  private native boolean IsOfType13(long refNdx
                                   ,int thisType);
  private native void Delete_RescueIJSurface(long ndx);
  private native long ParentModel15(long refNdx);
  private native long ParentSurface16(long refNdx);
  private native float ZValueAt17(long refNdx
                                 ,long i
                                 ,long j);
  private native void SetFaceStatus18(long refNdx
                                     ,long i
                                     ,long j
                                     ,int newStatus);
  private native int FaceStatus19(long refNdx
                                 ,long i
                                 ,long j);
}
