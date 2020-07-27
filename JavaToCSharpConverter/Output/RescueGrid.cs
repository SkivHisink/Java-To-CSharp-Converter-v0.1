using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGrid : RescueHistoryObject
{


  protected RescueGrid(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueGrid(nativeNdx);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
                    long i_lowbound,
                    long i_count)
  {
    nativeNdx = Create_RescueGrid1((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
                                   i_lowbound,
                                   i_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
                    float i_origin,
                    float i_step,
                    long i_lowbound,
                    long i_count)
  {
    nativeNdx = Create_RescueGrid2((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
                                   i_origin,
                                   i_step,
                                   i_lowbound,
                                   i_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
                    long i_lowbound,
                    long i_count,
                    long j_lowbound,
                    long j_count)
  {
    nativeNdx = Create_RescueGrid3((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
                                   i_lowbound,
                                   i_count,
                                   j_lowbound,
                                   j_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
                    RescueCoordinateSystemAxis i_axis,
                    float i_origin,
                    float i_step,
                    long i_lowbound,
                    long i_count,
                    RescueCoordinateSystemAxis j_axis,
                    float j_origin,
                    float j_step,
                    long j_lowbound,
                    long j_count)
  {
    nativeNdx = Create_RescueGrid4((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
                                   (i_axis == null) ? 0 : i_axis.nativeNdx,
                                   i_origin,
                                   i_step,
                                   i_lowbound,
                                   i_count,
                                   (j_axis == null) ? 0 : j_axis.nativeNdx,
                                   j_origin,
                                   j_step,
                                   j_lowbound,
                                   j_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
                    long i_lowbound,
                    long i_count,
                    long j_lowbound,
                    long j_count,
                    long k_lowbound,
                    long k_count)
  {
    nativeNdx = Create_RescueGrid5((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
                                   i_lowbound,
                                   i_count,
                                   j_lowbound,
                                   j_count,
                                   k_lowbound,
                                   k_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
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
                    long k_lowbound,
                    long k_count)
  {
    nativeNdx = Create_RescueGrid6((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
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
                                   k_lowbound,
                                   k_count);
  }

  public RescueGrid(RescueContext context,
                    int displayOrientationIn,
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
                    float k_origin,
                    float k_step,
                    long k_lowbound,
                    long k_count)
  {
    nativeNdx = Create_RescueGrid7((context == null) ? 0 : context.nativeNdx,
                                   displayOrientationIn,
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
                                   k_origin,
                                   k_step,
                                   k_lowbound,
                                   k_count);
  }

  public long Dimensions64()
  {
    long myReturn = Dimensions8(nativeNdx);
    return myReturn;
  }

  public int Dimensions()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Dimensions64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Dimensions(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Dimensions64(), throwIfTooBig);
  }

  public long NodeCount(bool cellCentered)
  {
    long myReturn = NodeCount9(nativeNdx
                             ,cellCentered);
    return myReturn;
  }

  public int NodeCount(bool cellCentered, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(NodeCount(cellCentered), throwIfTooBig);
  }

  public long Vertices64()
  {
    long myReturn = Vertices10(nativeNdx);
    return myReturn;
  }

  public int Vertices()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Vertices64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Vertices(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Vertices64(), throwIfTooBig);
  }

  public RescueGridAxis Axis(int zeroBasedOrdinal)
  {
    long returnNdx = Axis11(nativeNdx
                           ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGridAxis myReturn = new RescueGridAxis(returnNdx);
      return myReturn;
    }
  }

  public int DisplayOrientation()
  {
    int myReturn = DisplayOrientation12(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public bool IsRegular(int which)
  {
    bool myReturn = IsRegular14(nativeNdx
                                    ,which);
    return myReturn;
  }

  public RescueGrid(RescueContext context)
  {
    nativeNdx = Create_RescueGrid8((context == null) ? 0 : context.nativeNdx);
  }

  public void AddAxis(RescueGridAxis axis)
  {
    AddAxis15(nativeNdx, axis.nativeNdx);
  }

}

}