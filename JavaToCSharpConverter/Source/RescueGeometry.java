package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeometry.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueGeometry extends RescueHistoryObject
{

  public static final int R_EQUAL_AXIS = 0;
  public static final int R_UNEQUAL_AXIS = 1;
  public static final int R_COORDINATE_LINE = 2;
  public static final int R_COORDINATE_POLYLINE = 3;
  public static final int R_SPLIT_LINE = 4;
  public static final int R_SPLINE_LINE = 5;
  public static final int R_ONLAP = 0;
  public static final int R_OFFLAP = 1;
  public static final int R_XY_ORTHOGONAL = 0;
  public static final int R_SQUASHED_ORTHOGONAL = 1;
  public static final int R_CONFORMABLE = 2;
  public static final int R_ACTIVE = 0;
  public static final int R_INACTIVE = 1;
  public static final int R_TRUNCATED = 2;
  public static final int R_INACTIVATED_BY_PILLAR = 3;
  public static final int R_NOT_LGR = 0;
  public static final int R_RULE_BASED = 1;
  public static final int R_WEIGHT_BASED = 2;
  public static final int R_UNCONSTRAINED = 3;
  public static final int R_RULE_BASED_NOSPAN = 4;
  public static final int R_WEIGHT_BASED_NOSPAN = 5;
  public static final int R_STRUCTURED_CPG = 0;
  public static final int R_STRUCTURED_RADIAL = 1;
  public static final int R_UNSTRUCTURED_TETRAHEDRAL = 2;
  public static final int R_UNSTRUCTURED_2D_POLYHEDRAL = 3;
  public static final int R_UNSTRUCTURED_3D_POLYHEDRAL = 4;

  protected RescueGeometry(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometry(RescueModel parentModelIn,
                        RescueGrid existingGrid,
                        float missingValueIn)
  {
    nativeNdx = Create_RescueGeometry0((parentModelIn == null) ? 0 : parentModelIn.nativeNdx,
                                       (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                       missingValueIn);
  }

  public RescueGeometry(RescueModel parentModelIn,
                        RescueGrid existingGrid,
                        float missingValueIn,
                        RescueReferenceSurface topSurfaceIn,
                        float topOffsetIn,
                        RescueReferenceSurface bottomSurfaceIn,
                        float bottomOffsetIn)
  {
    nativeNdx = Create_RescueGeometry1((parentModelIn == null) ? 0 : parentModelIn.nativeNdx,
                                       (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                       missingValueIn,
                                       (topSurfaceIn == null) ? 0 : topSurfaceIn.nativeNdx,
                                       topOffsetIn,
                                       (bottomSurfaceIn == null) ? 0 : bottomSurfaceIn.nativeNdx,
                                       bottomOffsetIn);
  }

  public RescueGeometry(RescueModel parentModelIn,
                        RescueGrid existingGrid,
                        float missingValueIn,
                        RescueReferenceSurface referenceSurfaceIn,
                        float referenceOffsetIn,
                        float thicknessIn,
                        int onOffLapIn)
  {
    nativeNdx = Create_RescueGeometry2((parentModelIn == null) ? 0 : parentModelIn.nativeNdx,
                                       (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                       missingValueIn,
                                       (referenceSurfaceIn == null) ? 0 : referenceSurfaceIn.nativeNdx,
                                       referenceOffsetIn,
                                       thicknessIn,
                                       onOffLapIn);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        long parentILowBound,
                        long parentICount,
                        long refinedILowBound,
                        long refinedICount,
                        long parentJLowBound,
                        long parentJCount,
                        long refinedJLowBound,
                        long refinedJCount,
                        long parentKLowBound,
                        long parentKCount,
                        long refinedKLowBound,
                        long refinedKCount)
  {
    nativeNdx = Create_RescueGeometry3((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       parentILowBound,
                                       parentICount,
                                       refinedILowBound,
                                       refinedICount,
                                       parentJLowBound,
                                       parentJCount,
                                       refinedJLowBound,
                                       refinedJCount,
                                       parentKLowBound,
                                       parentKCount,
                                       refinedKLowBound,
                                       refinedKCount);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        long parentILowBound,
                        long parentICount,
                        long[] refinedICountArray,
                        long parentJLowBound,
                        long parentJCount,
                        long[] refinedJCountArray,
                        long parentKLowBound,
                        long parentKCount,
                        long[] refinedKCountArray)
  {
    nativeNdx = Create_RescueGeometry4((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       parentILowBound,
                                       parentICount,
                                       refinedICountArray,
                                       parentJLowBound,
                                       parentJCount,
                                       refinedJCountArray,
                                       parentKLowBound,
                                       parentKCount,
                                       refinedKCountArray);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        int referenceID,
                        int parentILowBound,
                        int parentICount,
                        int[] refinedICountArray,
                        int parentJLowBound,
                        int parentJCount,
                        int[] refinedJCountArray,
                        int parentKLowBound,
                        int parentKCount,
                        int[] refinedKCountArray)
  {
    nativeNdx = Create_RescueGeometry4((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       (long) parentILowBound,
                                       (long) parentICount,
                                       RescueContext.Array32To64(refinedICountArray),
                                       (long) parentJLowBound,
                                       (long) parentJCount,
                                       RescueContext.Array32To64(refinedJCountArray),
                                       (long) parentKLowBound,
                                       (long) parentKCount,
                                       RescueContext.Array32To64(refinedKCountArray));
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        long xLowBoundin,
                        double[] xWeights,
                        long xWeightLength,
                        long yLowBoundin,
                        double[] yWeights,
                        long yWeightLength,
                        long zLowBoundin,
                        double[] zWeights,
                        long zWeightLength)
  {
    nativeNdx = Create_RescueGeometry5((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       xLowBoundin,
                                       xWeights,
                                       xWeightLength,
                                       yLowBoundin,
                                       yWeights,
                                       yWeightLength,
                                       zLowBoundin,
                                       zWeights,
                                       zWeightLength);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        long parentILowBound,
                        long parentICount,
                        long[] xWeightLength,
                        double[][] xWeights,
                        long parentJLowBound,
                        long parentJCount,
                        long[] yWeightLength,
                        double[][] yWeights,
                        long parentKLowBound,
                        long parentKCount,
                        long[] zWeightLength,
                        double[][] zWeights)
  {
    nativeNdx = Create_RescueGeometry6((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       parentILowBound,
                                       parentICount,
                                       xWeightLength,
                                       xWeights,
                                       parentJLowBound,
                                       parentJCount,
                                       yWeightLength,
                                       yWeights,
                                       parentKLowBound,
                                       parentKCount,
                                       zWeightLength,
                                       zWeights);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        int referenceID,
                        int parentILowBound,
                        int parentICount,
                        int[] xWeightLength,
                        double[][] xWeights,
                        int parentJLowBound,
                        int parentJCount,
                        int[] yWeightLength,
                        double[][] yWeights,
                        int parentKLowBound,
                        int parentKCount,
                        int[] zWeightLength,
                        double[][] zWeights)
  {
    nativeNdx = Create_RescueGeometry6((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       (long) referenceID,
                                       (long) parentILowBound,
                                       (long) parentICount,
                                       RescueContext.Array32To64(xWeightLength),
                                       xWeights,
                                       (long) parentJLowBound,
                                       (long) parentJCount,
                                       RescueContext.Array32To64(yWeightLength),
                                       yWeights,
                                       (long) parentKLowBound,
                                       (long) parentKCount,
                                       RescueContext.Array32To64(zWeightLength),
                                       zWeights);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        RescueGrid existingGrid,
                        float missingValueIn)
  {
    nativeNdx = Create_RescueGeometry7((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                       missingValueIn);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID,
                        int gridType,
                        long expectedVertexCount,
                        long expectedFaceCount,
                        long expectedFaceVertexTuples,
                        long expectedCellCount,
                        long expectedCellFaceTuples,
                        long expectedVertexRealloc,
                        long expectedFaceRealloc,
                        long expectedFaceVertexRealloc,
                        long expectedCellRealloc,
                        long expectedCellFaceRealloc)
  {
    nativeNdx = Create_RescueGeometry8((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID,
                                       gridType,
                                       expectedVertexCount,
                                       expectedFaceCount,
                                       expectedFaceVertexTuples,
                                       expectedCellCount,
                                       expectedCellFaceTuples,
                                       expectedVertexRealloc,
                                       expectedFaceRealloc,
                                       expectedFaceVertexRealloc,
                                       expectedCellRealloc,
                                       expectedCellFaceRealloc);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long parentILowBound,
                        long parentICount,
                        long parentJLowBound,
                        long parentJCount,
                        long parentKLowBound,
                        long parentKCount,
                        long referenceID,
                        int gridType,
                        long expectedVertexCount,
                        long expectedFaceCount,
                        long expectedFaceVertexTuples,
                        long expectedCellCount,
                        long expectedCellFaceTuples,
                        long expectedVertexRealloc,
                        long expectedFaceRealloc,
                        long expectedFaceVertexRealloc,
                        long expectedCellRealloc,
                        long expectedCellFaceRealloc)
  {
    nativeNdx = Create_RescueGeometry8b((parentGrid == null) ? 0 : parentGrid.nativeNdx,
										parentILowBound,
										parentICount,
										parentJLowBound,
										parentJCount,
										parentKLowBound,
										parentKCount,
                                        referenceID,
                                        gridType,
                                        expectedVertexCount,
                                        expectedFaceCount,
                                        expectedFaceVertexTuples,
                                        expectedCellCount,
                                        expectedCellFaceTuples,
                                        expectedVertexRealloc,
                                        expectedFaceRealloc,
                                        expectedFaceVertexRealloc,
                                        expectedCellRealloc,
                                        expectedCellFaceRealloc);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long referenceID)
  {
    nativeNdx = Create_RescueGeometry9((parentGrid == null) ? 0 : parentGrid.nativeNdx,
                                       referenceID);
  }

  public RescueGeometry(RescueGeometry parentGrid,
                        long parentILowBound,
                        long parentICount,
                        long parentJLowBound,
                        long parentJCount,
                        long parentKLowBound,
                        long parentKCount,
                        long referenceID)
  {
    nativeNdx = Create_RescueGeometry9b((parentGrid == null) ? 0 : parentGrid.nativeNdx,
										parentILowBound,
										parentICount,
										parentJLowBound,
										parentJCount,
										parentKLowBound,
										parentKCount,
                                        referenceID);
  }

  public void SetReferenceID(long newId)
  {
    SetReferenceID10(nativeNdx
                   ,newId);
  }

  public long ReferenceID64()
  {
    long myReturn = ReferenceID11(nativeNdx);
    return myReturn;
  }

  public int ReferenceID()
  {
    int myReturn = 0;
    try
	{
      myReturn = RescueContext.Return32For64(ReferenceID64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ReferenceID(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ReferenceID64(), throwIfTooBig);
  }

  public void SetReferenceName(java.lang.String newName)
  {
    SetReferenceName12(nativeNdx
                     ,newName);
  }

  public java.lang.String ReferenceName()
  {
    java.lang.String myReturn = ReferenceName13(nativeNdx);
    return myReturn;
  }

  public void SetLGRGroupName(java.lang.String newName)
  {
    SetLGRGroupName12(nativeNdx
                     ,newName);
  }

  public java.lang.String LGRGroupName()
  {
    java.lang.String myReturn = LGRGroupName13(nativeNdx);
    return myReturn;
  }

  public void SetLGRStartTime(java.lang.String newName)
  {
    SetLGRStartTime12(nativeNdx
                     ,newName);
  }

  public java.lang.String LGRStartTime()
  {
    java.lang.String myReturn = LGRStartTime13(nativeNdx);
    return myReturn;
  }

  public void SetLGREndTime(java.lang.String newName)
  {
    SetLGREndTime12(nativeNdx
                     ,newName);
  }

  public java.lang.String LGREndTime()
  {
    java.lang.String myReturn = LGREndTime13(nativeNdx);
    return myReturn;
  }

  public RescueGeometry ProgenyHavingID(long referenceID)
  {
    long returnNdx = ProgenyHavingID14(nativeNdx
                                      ,referenceID);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public boolean DropGeometry(RescueGeometry toDrop)
  {
    boolean myReturn = DropGeometry15(nativeNdx
                                       ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public RescueGeometry ParentGeometry()
  {
    long returnNdx = ParentGeometry16(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometry ParentBUG()
  {
    long returnNdx = ParentBUG17(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public long LGRCount64()
  {
    long myReturn = LGRCount18(nativeNdx);
    return myReturn;
  }

  public int LGRCount()
  {
    int myReturn = 0;
    try
	{
      myReturn = RescueContext.Return32For64(LGRCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int LGRCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(LGRCount64(), throwIfTooBig);
  }

  public RescueGeometry NthLGR(long zeroBasedOrdinal)
  {
    long returnNdx = NthLGR19(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public int LGRType()
  {
    int myReturn = LGRType20(nativeNdx);
    return myReturn;
  }

  public int LGRGridType()
  {
    int myReturn = LGRGridType21(nativeNdx);
    return myReturn;
  }

  public long ParentLowBound64(int ndx)
  {
    long myReturn = ParentLowBound22(nativeNdx
                                  ,ndx);
    return myReturn;
  }

  public int ParentLowBound(int ndx)
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentLowBound64(ndx), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentLowBound(int ndx, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentLowBound64(ndx), throwIfTooBig);
  }

  public long ParentCount64(int ndx)
  {
    long myReturn = ParentCount23(nativeNdx
                               ,ndx);
    return myReturn;
  }

  public int ParentCount(int ndx)
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentCount64(ndx), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentCount(int ndx, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentCount64(ndx), throwIfTooBig);
  }

  public long ParentILowBound64()
  {
    long myReturn = ParentILowBound24(nativeNdx);
    return myReturn;
  }

  public int ParentILowBound()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentILowBound64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentILowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentILowBound64(), throwIfTooBig);
  }

  public long ParentICount64()
  {
    long myReturn = ParentICount25(nativeNdx);
    return myReturn;
  }

  public int ParentICount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentICount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentICount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentICount64(), throwIfTooBig);
  }

  public long ParentJLowBound64()
  {
    long myReturn = ParentJLowBound26(nativeNdx);
    return myReturn;
  }

  public int ParentJLowBound()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentJLowBound64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentJLowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentJLowBound64(), throwIfTooBig);
  }

  public long ParentJCount64()
  {
    long myReturn = ParentJCount27(nativeNdx);
    return myReturn;
  }

  public int ParentJCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentJCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentJCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentJCount64(), throwIfTooBig);
  }

  public long ParentKLowBound64()
  {
    long myReturn = ParentKLowBound28(nativeNdx);
    return myReturn;
  }

  public int ParentKLowBound()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentKLowBound64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentKLowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentKLowBound64(), throwIfTooBig);
  }

  public long ParentKCount64()
  {
    long myReturn = ParentKCount29(nativeNdx);
    return myReturn;
  }

  public int ParentKCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ParentKCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ParentKCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ParentKCount64(), throwIfTooBig);
  }

  public long WeightLength64(int ndx)
  {
    long myReturn = WeightLength30(nativeNdx
                                ,ndx);
    return myReturn;
  }

  public int WeightLength(int ndx)
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(WeightLength64(ndx), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int WeightLength(int ndx, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WeightLength64(ndx), throwIfTooBig);
  }

  public long XWeightLength64()
  {
    long myReturn = XWeightLength33(nativeNdx);
    return myReturn;
  }

  public int XWeightLength()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(XWeightLength64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int XWeightLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(XWeightLength64(), throwIfTooBig);
  }

  public void XWeight(double[] buffer,
                      long offset,
                      long bufferLength)
  {
    XWeight34(nativeNdx
            ,buffer
            ,offset
            ,bufferLength);
  }

  public double[] XWeight()
  {
    double[] myReturn = XWeight35(nativeNdx);
    return myReturn;
  }

  public long YWeightLength64()
  {
    long myReturn = YWeightLength36(nativeNdx);
    return myReturn;
  }

  public int YWeightLength()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(YWeightLength64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int YWeightLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(YWeightLength64(), throwIfTooBig);
  }

  public void YWeight(double[] buffer,
                      long offset,
                      long bufferLength)
  {
    YWeight37(nativeNdx
            ,buffer
            ,offset
            ,bufferLength);
  }

  public double[] YWeight()
  {
    double[] myReturn = YWeight38(nativeNdx);
    return myReturn;
  }

  public long ZWeightLength64()
  {
    long myReturn = ZWeightLength39(nativeNdx);
    return myReturn;
  }

  public int ZWeightLength()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(ZWeightLength64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int ZWeightLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ZWeightLength64(), throwIfTooBig);
  }

  public void ZWeight(double[] buffer,
                      long offset,
                      long bufferLength)
  {
    ZWeight40(nativeNdx
            ,buffer
            ,offset
            ,bufferLength);
  }

  public double[] ZWeight()
  {
    double[] myReturn = ZWeight41(nativeNdx);
    return myReturn;
  }

  public void RefinedCountArray(int ndx,
                                int[] buffer,
                                int offset,
                                int bufferLen)
  {
    RefinedCountArray42(nativeNdx
                      ,ndx
                      ,buffer
                      ,offset
                      ,bufferLen);
  }

  public void RefinedCountArray(int ndx,
                                long[] buffer,
                                long offset,
                                long bufferLen)
  {
    RefinedCountArray42l(nativeNdx
                      ,ndx
                      ,buffer
                      ,offset
                      ,bufferLen);
  }

  public int WeightBasedNodesFor(int ndx,
                                 long iNdx)
  {
    int myReturn = WeightBasedNodesFor43(nativeNdx
                                       ,ndx
                                       ,iNdx);
    return myReturn;
  }

  public void WeightFor(int ndx,
                        long iNdx,
                        double[] buffer,
                        long offset,
                        long bufferLen)
  {
    WeightFor44(nativeNdx
              ,ndx
              ,iNdx
              ,buffer
              ,offset
              ,bufferLen);
  }

  public RescueParametricLGRMap ParametricMap()
  {
    long returnNdx = ParametricMap45(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueParametricLGRMap myReturn = new RescueParametricLGRMap(returnNdx);
      return myReturn;
    }
  }

  public RescueInterfaceSurfaceDesc InterfaceSurfaceDesc(long zeroBasedNdx)
  {
    long returnNdx = InterfaceSurfaceDesc46(nativeNdx
                                           ,zeroBasedNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueInterfaceSurfaceDesc myReturn = new RescueInterfaceSurfaceDesc(returnNdx);
      return myReturn;
    }
  }

  public long InterfaceSurfaceDescCount64()
  {
    long myReturn = InterfaceSurfaceDescCount47(nativeNdx);
    return myReturn;
  }

  public int InterfaceSurfaceDescCount()
  {
    int myReturn = 0;
	try
	{
      myReturn = RescueContext.Return32For64(InterfaceSurfaceDescCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int InterfaceSurfaceDescCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(InterfaceSurfaceDescCount64(), throwIfTooBig);
  }

  public boolean DropInterfaceSurfaceDesc(RescueInterfaceSurfaceDesc toDrop)
  {
    boolean myReturn = DropInterfaceSurfaceDesc48(nativeNdx
                                                   ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public RescueUnstructuredGrid UnstructuredGrid()
  {
    long returnNdx = UnstructuredGrid49(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnstructuredGrid myReturn = new RescueUnstructuredGrid(returnNdx);
      return myReturn;
    }
  }

  public RescueRadialGrid RadialGrid()
  {
    long returnNdx = RadialGrid50(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueRadialGrid myReturn = new RescueRadialGrid(returnNdx);
      return myReturn;
    }
  }

  public void dispose()
  {
    Delete_RescueGeometry(nativeNdx);
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated52(nativeNdx);
    return myReturn;
  }

  public RescueGrid Grid()
  {
    long returnNdx = Grid53(nativeNdx);
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

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel54(nativeNdx);
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

  public float MissingValue()
  {
    float myReturn = MissingValue55(nativeNdx);
    return myReturn;
  }

  public void SetZValue(float[] valueArray)
  {
    SetZValue56(nativeNdx
              ,valueArray);
  }

  public void SetZValue(long i,
                        long j,
                        float[] valueArray)
  {
    SetZValue57(nativeNdx
              ,i
              ,j
              ,valueArray);
  }

  public void SetZValue(long i,
                        long j,
                        long k,
                        float value)
  {
    SetZValue58(nativeNdx
              ,i
              ,j
              ,k
              ,value);
  }

  public void SetCoordinateLine(long i,
                                long j,
                                float xTop,
                                float yTop,
                                float zTop,
                                float xBottom,
                                float yBottom,
                                float zBottom,
                                float[] middleZvalues)
  {
    SetCoordinateLine59(nativeNdx
                      ,i
                      ,j
                      ,xTop
                      ,yTop
                      ,zTop
                      ,xBottom
                      ,yBottom
                      ,zBottom
                      ,middleZvalues);
  }

  public void SetCoordinatePolyLine(long i,
                                    long j,
                                    float[] values)
  {
    SetCoordinatePolyLine60(nativeNdx
                          ,i
                          ,j
                          ,values);
  }

  public void SetCornerNode(long i,
                            long j,
                            long k,
                            int corner,
                            float x,
                            float y,
                            float z)
  {
    SetCornerNode61(nativeNdx
                  ,i
                  ,j
                  ,k
                  ,corner
                  ,x
                  ,y
                  ,z);
  }

  public void SetXValue(long i,
                        long j,
                        long k,
                        int corner,
                        float value)
  {
    SetXValue62(nativeNdx
              ,i
              ,j
              ,k
              ,corner
              ,value);
  }

  public void SetYValue(long i,
                        long j,
                        long k,
                        int corner,
                        float value)
  {
    SetYValue63(nativeNdx
              ,i
              ,j
              ,k
              ,corner
              ,value);
  }

  public void SetZValue(long i,
                        long j,
                        long k,
                        int corner,
                        float value)
  {
    SetZValue64(nativeNdx
              ,i
              ,j
              ,k
              ,corner
              ,value);
  }

  public int VertexIs()
  {
    int myReturn = VertexIs65(nativeNdx);
    return myReturn;
  }

  public int VertexIs(long i, long j)
  {
    int myReturn = VertexIs66(nativeNdx
                                         ,i
                                         ,j);
    return myReturn;
  }

  public int GeometryType()
  {
    int myReturn = GeometryType67(nativeNdx);
    return myReturn;
  }

  public RescuePillar DemandPillar(long i,
                                     long j)
  {
    long returnNdx = DemandPillar73(nativeNdx
                                   ,i
                                   ,j);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePillar myReturn = new RescuePillar(returnNdx);
      return myReturn;
    }
  }

  public float[] CornerValues(long i,
                              long j,
                              long k,
                              int corner)
  {
    float[] myReturn = CornerValues76(nativeNdx
                                    ,i
                                    ,j
                                    ,k
                                    ,corner);
    return myReturn;
  }

  public int CornerValuesLength()
  {
    int myReturn = CornerValuesLength77(nativeNdx);
    return myReturn;
  }

  public float[] NodeValues(long i,
                            long j,
                            long k)
  {
    float[] myReturn = NodeValues78(nativeNdx
                                  ,i
                                  ,j
                                  ,k);
    return myReturn;
  }

  public int NodeValuesLength()
  {
    int myReturn = NodeValuesLength79(nativeNdx);
    return myReturn;
  }

  public float[] UVWNodeValues(long i,
                               long j,
                               long k)
  {
    float[] myReturn = UVWNodeValues80(nativeNdx
                                     ,i
                                     ,j
                                     ,k);
    return myReturn;
  }

  public int UVWNodeValuesLength()
  {
    int myReturn = UVWNodeValuesLength81(nativeNdx);
    return myReturn;
  }

  public float[] UVWNodeValues2(double i,
                                double j,
                                double k)
  {
    float[] myReturn = UVWNodeValues282(nativeNdx
                                      ,i
                                      ,j
                                      ,k);
    return myReturn;
  }

  public int UVWNodeValues2Length64()
  {
    int myReturn = UVWNodeValues2Length83(nativeNdx);
    return myReturn;
  }

  public float ZValue(long i,
                      long j,
                      long k)
  {
    float myReturn = ZValue84(nativeNdx
                            ,i
                            ,j
                            ,k);
    return myReturn;
  }

  public void AllCornerValues(float[] buffer,
                              long offset,
                              long bufferLength)
  {
    AllCornerValues85(nativeNdx
                    ,buffer
                    ,offset
                    ,bufferLength);
  }

  public long AllCornerValuesLength64()
  {
    long myReturn = AllCornerValuesLength86(nativeNdx);
    return myReturn;
  }

  public int AllCornerValuesLength()
  {
    int myReturn = 0;
	try
	{
	  return RescueContext.Return32For64(AllCornerValuesLength64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int AllCornerValuesLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(AllCornerValuesLength64(), throwIfTooBig);
  }

  public void LayerCornerValues(long k,
                                float[] buffer,
                                long offset,
                                long bufferLength)
  {
    LayerCornerValues87(nativeNdx
                      ,k
                      ,buffer
                      ,offset
                      ,bufferLength);
  }

  public long LayerCornerValuesLength64()
  {
    long myReturn = LayerCornerValuesLength88(nativeNdx);
    return myReturn;
  }

  public int LayerCornerValuesLength()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(LayerCornerValuesLength64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int LayerCornerValuesLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(LayerCornerValuesLength64(), throwIfTooBig);
  }

  public void SetStairSteppedSurface(RescueIJSurface surface,
                                     RescueIJKCellPair[] cellPairs,
                                     long arrayLength)
  {
    SetStairSteppedSurface89(nativeNdx
                           ,(surface == null) ? 0 : surface.nativeNdx
                           ,cellPairs
                           ,arrayLength);
  }

  public RescueStairSteppedFault StairStepsFor(RescueIJSurface surface)
  {
    long returnNdx = StairStepsFor90(nativeNdx
                                    ,(surface == null) ? 0 : surface.nativeNdx);
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

  public long StairStepCount64()
  {
    long myReturn = StairStepCount91(nativeNdx);
    return myReturn;
  }

  public int StairStepCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(StairStepCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int StairStepCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(StairStepCount64(), throwIfTooBig);
  }

  public RescueStairSteppedFault NthStairSteppedFault(long zeroBasedOrdinal)
  {
    long returnNdx = NthStairSteppedFault92(nativeNdx
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

  public void SetSurfaceIntersection(RescueIJSurface surface,
                                     long[] iList,
                                     long[] jList,
                                     long listLength)
  {
    SetSurfaceIntersection93(nativeNdx
                           ,(surface == null) ? 0 : surface.nativeNdx
                           ,iList
                           ,jList
                           ,listLength);
  }

  public void SetSurfaceIntersection(RescueIJSurface surface,
                                     int[] iList,
                                     int[] jList,
                                     int listLength)
  {
    SetSurfaceIntersection93i(nativeNdx
                           ,(surface == null) ? 0 : surface.nativeNdx
                           ,iList
                           ,jList
                           ,listLength);
  }

  public RescueSurfaceToGrid IntersectionFor(RescueIJSurface surface)
  {
    long returnNdx = IntersectionFor94(nativeNdx
                                      ,(surface == null) ? 0 : surface.nativeNdx);
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

  public RescueSurfaceToGrid NthSurfaceToGrid(long zeroBasedOrdinal)
  {
    long returnNdx = NthSurfaceToGrid95(nativeNdx
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

  public void SetSurfaceIntersection(RescueIJSurface surface,
                                     int side,
                                     long i,
                                     long j,
                                     long k,
                                     int cellFaceNumber,
                                     float[] uvs)
  {
    SetSurfaceIntersection96(nativeNdx
                           ,(surface == null) ? 0 : surface.nativeNdx
                           ,side
                           ,i
                           ,j
                           ,k
                           ,cellFaceNumber
                           ,uvs);
  }

  public boolean DropRescueSurfaceCell(RescueSurfaceCell cellToDrop)
  {
    boolean myReturn = DropRescueSurfaceCell97(nativeNdx
                                                ,(cellToDrop == null) ? 0 : cellToDrop.nativeNdx);
    return myReturn;
  }

  public RescueSurfaceCell NthSurfaceCell(long zeroBasedOrdinal)
  {
    long returnNdx = NthSurfaceCell98(nativeNdx
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

  public long GeometryUnitCount64()
  {
    long myReturn = GeometryUnitCount99(nativeNdx);
    return myReturn;
  }

  public int GeometryUnitCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(GeometryUnitCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int GeometryUnitCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(GeometryUnitCount64(), throwIfTooBig);
  }

  public RescueGeometryUnit NthGeometryUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthGeometryUnit100(nativeNdx
                                      ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometryUnit myReturn = new RescueGeometryUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometryUnit UnitIntersect(RescueUnit unit)
  {
    long returnNdx = UnitIntersect101(nativeNdx
                                    ,(unit == null) ? 0 : unit.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometryUnit myReturn = new RescueGeometryUnit(returnNdx);
      return myReturn;
    }
  }

  public boolean DropUnitIntersect(RescueUnit unit)
  {
    boolean myReturn = DropUnitIntersect102(nativeNdx
                                            ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public boolean DropUnitIntersect(RescueGeometryUnit unit)
  {
    boolean myReturn = DropUnitIntersect103(nativeNdx
                                            ,(unit == null) ? 0 : unit.nativeNdx);
    return myReturn;
  }

  public void SetWellboreIntersection(RescueWellbore wellbore,
                                      long i,
                                      long j,
                                      long k)
  {
    SetWellboreIntersection104(nativeNdx
                            ,(wellbore == null) ? 0 : wellbore.nativeNdx
                            ,i
                            ,j
                            ,k);
  }

  public boolean DropRescueWellboreCell(RescueWellboreCell cellToDrop)
  {
    boolean myReturn = DropRescueWellboreCell105(nativeNdx
                                                 ,(cellToDrop == null) ? 0 : cellToDrop.nativeNdx);
    return myReturn;
  }

  public RescueWellboreCell NthWellboreCell(long zeroBasedOrdinal)
  {
    long returnNdx = NthWellboreCell106(nativeNdx
                                      ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreCell myReturn = new RescueWellboreCell(returnNdx);
      return myReturn;
    }
  }

  public void CalculateMinMax()
  {
    CalculateMinMax107(nativeNdx);
  }

  public boolean MinMaxDirty()
  {
    boolean myReturn = MinMaxDirty108(nativeNdx);
    return myReturn;
  }

  public float MinX()
  {
    float myReturn = MinX109(nativeNdx);
    return myReturn;
  }

  public float MaxX()
  {
    float myReturn = MaxX110(nativeNdx);
    return myReturn;
  }

  public float MinY()
  {
    float myReturn = MinY111(nativeNdx);
    return myReturn;
  }

  public float MaxY()
  {
    float myReturn = MaxY112(nativeNdx);
    return myReturn;
  }

  public float MinZ()
  {
    float myReturn = MinZ113(nativeNdx);
    return myReturn;
  }

  public float MaxZ()
  {
    float myReturn = MaxZ114(nativeNdx);
    return myReturn;
  }

  public long PropertyCount64()
  {
    long myReturn = PropertyCount115(nativeNdx);
    return myReturn;
  }

  public int PropertyCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(PropertyCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int PropertyCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(PropertyCount64(), throwIfTooBig);
  }

  public RescueProperty NthRescueProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueProperty116(nativeNdx
                                        ,zeroBasedOrdinal);
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

  public RescueProperty PropertyIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyIdentifiedBy117(nativeNdx
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

  public RescueProperty PropertyNamed(java.lang.String name)
  {
    long returnNdx = PropertyNamed118(nativeNdx
                                    ,name);
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

  public boolean DropRescueProperty(RescueProperty unitToDrop)
  {
    boolean myReturn = DropRescueProperty119(nativeNdx
                                             ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public boolean SetKLayerID(long zeroBasedNdx,
                                long globalID)
  {
    boolean myReturn = SetKLayerID120(nativeNdx
                                      ,zeroBasedNdx
                                      ,globalID);
    return myReturn;
  }

  public int KLayerID(long zeroBasedNdx)
  {
    int myReturn = KLayerID121(nativeNdx
                            ,zeroBasedNdx);
    return myReturn;
  }

  public RescueBlockUnit ParentBlockUnit()
  {
    long returnNdx = ParentBlockUnit122(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnit myReturn = new RescueBlockUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyPart ParentGeobodyPart()
  {
    long returnNdx = ParentGeobodyPart123(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyPart myReturn = new RescueGeobodyPart(returnNdx);
      return myReturn;
    }
  }

  public boolean IsProportional()
  {
    boolean myReturn = IsProportional124(nativeNdx);
    return myReturn;
  }

  public RescueReferenceSurface TopReferenceSurface()
  {
    long returnNdx = TopReferenceSurface125(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReferenceSurface myReturn = new RescueReferenceSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnitHorizonSurface:
        myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueReferenceSurface BottomReferenceSurface()
  {
    long returnNdx = BottomReferenceSurface126(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReferenceSurface myReturn = new RescueReferenceSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnitHorizonSurface:
        myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public float TopOffset()
  {
    float myReturn = TopOffset127(nativeNdx);
    return myReturn;
  }

  public float BottomOffset()
  {
    float myReturn = BottomOffset128(nativeNdx);
    return myReturn;
  }

  public boolean IsReferenced()
  {
    boolean myReturn = IsReferenced129(nativeNdx);
    return myReturn;
  }

  public RescueReferenceSurface ReferenceSurface()
  {
    long returnNdx = ReferenceSurface130(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReferenceSurface myReturn = new RescueReferenceSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnitHorizonSurface:
        myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public float SurfaceOffset()
  {
    float myReturn = SurfaceOffset131(nativeNdx);
    return myReturn;
  }

  public float KLayerThickness()
  {
    float myReturn = KLayerThickness132(nativeNdx);
    return myReturn;
  }

  public int LapType()
  {
    int myReturn = LapType133(nativeNdx);
    return myReturn;
  }

  public int Version(boolean reload)
  {
    int myReturn = Version134(nativeNdx
                           ,reload);
    return myReturn;
  }

  public void SetCellStatus(long i,
                            long j,
                            long k,
                            int newStatus)
  {
    SetCellStatus135(nativeNdx
                  ,i
                  ,j
                  ,k
                  ,newStatus);
  }

  public int CellStatus(long i,
                                     long j,
                                     long k)
  {
    int myReturn = CellStatus136(nativeNdx
                                           ,i
                                           ,j
                                           ,k);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType137(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded138(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated139(nativeNdx);
    return myReturn;
  }

  public boolean Load()
  {
    boolean myReturn = Load140(nativeNdx);
    return myReturn;
  }

  public boolean Unload()
  {
    boolean myReturn = Unload141(nativeNdx);
    return myReturn;
  }

  public boolean HasChanged()
  {
    boolean myReturn = HasChanged142(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged143(nativeNdx);
  }

  public static void LoadRefSurface(RescueReferenceSurface surface)
  {
    LoadRefSurface144(
(surface == null) ? 0 : surface.nativeNdx);
  }

  public RescueWireframe WireFrame()
  {
    long returnNdx = WireFrame145(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public long[] ObjectCounts()
  {
    long[] myReturn = ObjectCounts146(nativeNdx);
    return myReturn;
  }

  public int ObjectCountsLength()
  {
    int myReturn = ObjectCountsLength147(nativeNdx);
    return myReturn;
  }

  public long SurfaceToGridCount64()
  {
    long myReturn = SurfaceToGridCount148(nativeNdx);
    return myReturn;
  }

  public int SurfaceToGridCount()
  {
    int myReturn = 0;
	try
	{
	  myReturn = RescueContext.Return32For64(SurfaceToGridCount64(), false);
	}
	catch (Exception e)
	{
	}
	return myReturn;
  }

  public int SurfaceToGridCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SurfaceToGridCount64(), throwIfTooBig);
  }

  public RescueColor GetColor()
  {
    long returnNdx = GetColor149(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueColor myReturn = new RescueColor(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers150(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueDataContainer DemandDataContainers()
  {
    long returnNdx = DemandDataContainers151(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public void EnsureLoaded()
  {
    EnsureLoadedNative(nativeNdx);
  }

  private native void EnsureLoadedNative(long refNdx);
  private native long Create_RescueGeometry0(long parentModelIn,
                                            long existingGrid,
                                            float missingValueIn);
  private native long Create_RescueGeometry1(long parentModelIn,
                                            long existingGrid,
                                            float missingValueIn,
                                            long topSurfaceIn,
                                            float topOffsetIn,
                                            long bottomSurfaceIn,
                                            float bottomOffsetIn);
  private native long Create_RescueGeometry2(long parentModelIn,
                                            long existingGrid,
                                            float missingValueIn,
                                            long referenceSurfaceIn,
                                            float referenceOffsetIn,
                                            float thicknessIn,
                                            int onOffLapIn);
  private native long Create_RescueGeometry3(long parentGrid,
                                            long referenceID,
                                            long parentILowBound,
                                            long parentICount,
                                            long refinedILowBound,
                                            long refinedICount,
                                            long parentJLowBound,
                                            long parentJCount,
                                            long refinedJLowBound,
                                            long refinedJCount,
                                            long parentKLowBound,
                                            long parentKCount,
                                            long refinedKLowBound,
                                            long refinedKCount);
  private native long Create_RescueGeometry4(long parentGrid,
                                            long referenceID,
                                            long parentILowBound,
                                            long parentICount,
                                            long[] refinedICountArray,
                                            long parentJLowBound,
                                            long parentJCount,
                                            long[] refinedJCountArray,
                                            long parentKLowBound,
                                            long parentKCount,
                                            long[] refinedKCountArray);
  private native long Create_RescueGeometry5(long parentGrid,
                                            long referenceID,
                                            long xLowBoundin,
                                            double[] xWeights,
                                            long xWeightLength,
                                            long yLowBoundin,
                                            double[] yWeights,
                                            long yWeightLength,
                                            long zLowBoundin,
                                            double[] zWeights,
                                            long zWeightLength);
  private native long Create_RescueGeometry6(long parentGrid,
                                            long referenceID,
                                            long parentILowBound,
                                            long parentICount,
                                            long[] xWeightLength,
                                            double[][] xWeights,
                                            long parentJLowBound,
                                            long parentJCount,
                                            long[] yWeightLength,
                                            double[][] yWeights,
                                            long parentKLowBound,
                                            long parentKCount,
                                            long[] zWeightLength,
                                            double[][] zWeights);
  private native long Create_RescueGeometry7(long parentGrid,
                                            long referenceID,
                                            long existingGrid,
                                            float missingValueIn);
  private native long Create_RescueGeometry8(long parentGrid,
                                            long referenceID,
                                            int gridType,
                                            long expectedVertexCount,
                                            long expectedFaceCount,
                                            long expectedFaceVertexTuples,
                                            long expectedCellCount,
                                            long expectedCellFaceTuples,
                                            long expectedVertexRealloc,
                                            long expectedFaceRealloc,
                                            long expectedFaceVertexRealloc,
                                            long expectedCellRealloc,
                                            long expectedCellFaceRealloc);
  private native long Create_RescueGeometry8b(long parentGrid,
                                            long parentILowBound,
                                            long parentICount,
                                            long parentJLowBound,
                                            long parentJCount,
                                            long parentKLowBound,
                                            long parentKCount,
                                            long referenceID,
                                            int gridType,
                                            long expectedVertexCount,
                                            long expectedFaceCount,
                                            long expectedFaceVertexTuples,
                                            long expectedCellCount,
                                            long expectedCellFaceTuples,
                                            long expectedVertexRealloc,
                                            long expectedFaceRealloc,
                                            long expectedFaceVertexRealloc,
                                            long expectedCellRealloc,
                                            long expectedCellFaceRealloc);
  private native long Create_RescueGeometry9(long parentGrid,
                                            long referenceID);
  private native long Create_RescueGeometry9b(long parentGrid,
                                            long parentILowBound,
                                            long parentICount,
                                            long parentJLowBound,
                                            long parentJCount,
                                            long parentKLowBound,
                                            long parentKCount,
                                            long referenceID);
  private native void SetReferenceID10(long refNdx
                                      ,long newId);
  private native long ReferenceID11(long refNdx);
  private native void SetReferenceName12(long refNdx
                                        ,java.lang.String newName);
  private native java.lang.String ReferenceName13(long refNdx);
  private native void SetLGRGroupName12(long refNdx
                                        ,java.lang.String newName);
  private native java.lang.String LGRGroupName13(long refNdx);
  private native void SetLGRStartTime12(long refNdx
                                        ,java.lang.String newName);
  private native java.lang.String LGRStartTime13(long refNdx);
  private native void SetLGREndTime12(long refNdx
                                        ,java.lang.String newName);
  private native java.lang.String LGREndTime13(long refNdx);
  private native long ProgenyHavingID14(long refNdx
                                        ,long referenceID);
  private native boolean DropGeometry15(long refNdx
                                       ,long toDrop);
  private native long ParentGeometry16(long refNdx);
  private native long ParentBUG17(long refNdx);
  private native long LGRCount18(long refNdx);
  private native long NthLGR19(long refNdx
                               ,long zeroBasedOrdinal);
  private native int LGRType20(long refNdx);
  private native int LGRGridType21(long refNdx);
  private native long ParentLowBound22(long refNdx
                                     ,int ndx);
  private native long ParentCount23(long refNdx
                                  ,int ndx);
  private native long ParentILowBound24(long refNdx);
  private native long ParentICount25(long refNdx);
  private native long ParentJLowBound26(long refNdx);
  private native long ParentJCount27(long refNdx);
  private native long ParentKLowBound28(long refNdx);
  private native long ParentKCount29(long refNdx);
  private native long WeightLength30(long refNdx
                                   ,int ndx);
  private native long XWeightLength33(long refNdx);
  private native void XWeight34(long refNdx
                               ,double[] buffer
                               ,long offset
                               ,long bufferLength);
  private native double[] XWeight35(long refNdx);
  private native long YWeightLength36(long refNdx);
  private native void YWeight37(long refNdx
                               ,double[] buffer
                               ,long offset
                               ,long bufferLength);
  private native double[] YWeight38(long refNdx);
  private native long ZWeightLength39(long refNdx);
  private native void ZWeight40(long refNdx
                               ,double[] buffer
                               ,long offset
                               ,long bufferLength);
  private native double[] ZWeight41(long refNdx);
  private native void RefinedCountArray42(long refNdx
                                         ,int ndx
                                         ,int[] buffer
                                         ,int offset
                                         ,int bufferLen);
  private native void RefinedCountArray42l(long refNdx
                                         ,int ndx
                                         ,long[] buffer
                                         ,long offset
                                         ,long bufferLen);
  private native int WeightBasedNodesFor43(long refNdx
                                          ,int ndx
                                          ,long iNdx);
  private native void WeightFor44(long refNdx
                                 ,int ndx
                                 ,long iNdx
                                 ,double[] buffer
                                 ,long offset
                                 ,long bufferLen);
  private native long ParametricMap45(long refNdx);
  private native long InterfaceSurfaceDesc46(long refNdx
                                             ,long zeroBasedNdx);
  private native long InterfaceSurfaceDescCount47(long refNdx);
  private native boolean DropInterfaceSurfaceDesc48(long refNdx
                                                   ,long toDrop);
  private native long UnstructuredGrid49(long refNdx);
  private native long RadialGrid50(long refNdx);
  private native void Delete_RescueGeometry(long ndx);
  private native boolean AnyFileTruncated52(long refNdx);
  private native long Grid53(long refNdx);
  private native long ParentModel54(long refNdx);
  private native float MissingValue55(long refNdx);
  private native void SetZValue56(long refNdx
                                 ,float[] valueArray);
  private native void SetZValue57(long refNdx
                                 ,long i
                                 ,long j
                                 ,float[] valueArray);
  private native void SetZValue58(long refNdx
                                 ,long i
                                 ,long j
                                 ,long k
                                 ,float value);
  private native void SetCoordinateLine59(long refNdx
                                         ,long i
                                         ,long j
                                         ,float xTop
                                         ,float yTop
                                         ,float zTop
                                         ,float xBottom
                                         ,float yBottom
                                         ,float zBottom
                                         ,float[] middleZvalues);
  private native void SetCoordinatePolyLine60(long refNdx
                                             ,long i
                                             ,long j
                                             ,float[] values);
  private native void SetCornerNode61(long refNdx
                                     ,long i
                                     ,long j
                                     ,long k
                                     ,int corner
                                     ,float x
                                     ,float y
                                     ,float z);
  private native void SetXValue62(long refNdx
                                 ,long i
                                 ,long j
                                 ,long k
                                 ,int corner
                                 ,float value);
  private native void SetYValue63(long refNdx
                                 ,long i
                                 ,long j
                                 ,long k
                                 ,int corner
                                 ,float value);
  private native void SetZValue64(long refNdx
                                 ,long i
                                 ,long j
                                 ,long k
                                 ,int corner
                                 ,float value);
  private native int VertexIs65(long refNdx);
  private native int VertexIs66(long refNdx
                               ,long i
                               ,long j);
  private native int GeometryType67(long refNdx);
  private native long DemandPillar73(long refNdx
                                     ,long i
                                     ,long j);
  private native float[] CornerValues76(long refNdx
                                       ,long i
                                       ,long j
                                       ,long k
                                       ,int corner);
  private native int CornerValuesLength77(long refNdx);
  private native float[] NodeValues78(long refNdx
                                     ,long i
                                     ,long j
                                     ,long k);
  private native int NodeValuesLength79(long refNdx);
  private native float[] UVWNodeValues80(long refNdx
                                        ,long i
                                        ,long j
                                        ,long k);
  private native int UVWNodeValuesLength81(long refNdx);
  private native float[] UVWNodeValues282(long refNdx
                                         ,double i
                                         ,double j
                                         ,double k);
  private native int UVWNodeValues2Length83(long refNdx);
  private native float ZValue84(long refNdx
                               ,long i
                               ,long j
                               ,long k);
  private native void AllCornerValues85(long refNdx
                                       ,float[] buffer
                                       ,long offset
                                       ,long bufferLength);
  private native long AllCornerValuesLength86(long refNdx);
  private native void LayerCornerValues87(long refNdx
                                         ,long k
                                         ,float[] buffer
                                         ,long offset
                                         ,long bufferLength);
  private native long LayerCornerValuesLength88(long refNdx);
  private native void SetStairSteppedSurface89(long refNdx
                                              ,long surface
                                              ,RescueIJKCellPair[] cellPairs
                                              ,long arrayLength);
  private native long StairStepsFor90(long refNdx
                                      ,long surface);
  private native int StairStepCount91(long refNdx);
  private native long NthStairSteppedFault92(long refNdx
                                             ,long zeroBasedOrdinal);
  private native void SetSurfaceIntersection93(long refNdx
                                              ,long surface
                                              ,long[] iList
                                              ,long[] jList
                                              ,long listLength);
  private native void SetSurfaceIntersection93i(long refNdx
                                              ,long surface
                                              ,int[] iList
                                              ,int[] jList
                                              ,int listLength);
  private native long IntersectionFor94(long refNdx
                                        ,long surface);
  private native long NthSurfaceToGrid95(long refNdx
                                         ,long zeroBasedOrdinal);
  private native void SetSurfaceIntersection96(long refNdx
                                              ,long surface
                                              ,int side
                                              ,long i
                                              ,long j
                                              ,long k
                                              ,int cellFaceNumber
                                              ,float[] uvs);
  private native boolean DropRescueSurfaceCell97(long refNdx
                                                ,long cellToDrop);
  private native long NthSurfaceCell98(long refNdx
                                       ,long zeroBasedOrdinal);
  private native long GeometryUnitCount99(long refNdx);
  private native long NthGeometryUnit100(long refNdx
                                        ,long zeroBasedOrdinal);
  private native long UnitIntersect101(long refNdx
                                      ,long unit);
  private native boolean DropUnitIntersect102(long refNdx
                                            ,long unit);
  private native boolean DropUnitIntersect103(long refNdx
                                            ,long unit);
  private native void SetWellboreIntersection104(long refNdx
                                               ,long wellbore
                                               ,long i
                                               ,long j
                                               ,long k);
  private native boolean DropRescueWellboreCell105(long refNdx
                                                 ,long cellToDrop);
  private native long NthWellboreCell106(long refNdx
                                        ,long zeroBasedOrdinal);
  private native void CalculateMinMax107(long refNdx);
  private native boolean MinMaxDirty108(long refNdx);
  private native float MinX109(long refNdx);
  private native float MaxX110(long refNdx);
  private native float MinY111(long refNdx);
  private native float MaxY112(long refNdx);
  private native float MinZ113(long refNdx);
  private native float MaxZ114(long refNdx);
  private native long PropertyCount115(long refNdx);
  private native long NthRescueProperty116(long refNdx
                                          ,long zeroBasedOrdinal);
  private native long PropertyIdentifiedBy117(long refNdx
                                             ,long identifier);
  private native long PropertyNamed118(long refNdx
                                      ,java.lang.String name);
  private native boolean DropRescueProperty119(long refNdx
                                             ,long unitToDrop);
  private native boolean SetKLayerID120(long refNdx
                                      ,long zeroBasedNdx
                                      ,long globalID);
  private native int KLayerID121(long refNdx
                               ,long zeroBasedNdx);
  private native long ParentBlockUnit122(long refNdx);
  private native long ParentGeobodyPart123(long refNdx);
  private native boolean IsProportional124(long refNdx);
  private native long TopReferenceSurface125(long refNdx);
  private native long BottomReferenceSurface126(long refNdx);
  private native float TopOffset127(long refNdx);
  private native float BottomOffset128(long refNdx);
  private native boolean IsReferenced129(long refNdx);
  private native long ReferenceSurface130(long refNdx);
  private native float SurfaceOffset131(long refNdx);
  private native float KLayerThickness132(long refNdx);
  private native int LapType133(long refNdx);
  private native int Version134(long refNdx
                              ,boolean reload);
  private native void SetCellStatus135(long refNdx
                                     ,long i
                                     ,long j
                                     ,long k
                                     ,int newStatus);
  private native int CellStatus136(long refNdx
                                 ,long i
                                 ,long j
                                 ,long k);
  private native boolean IsOfType137(long refNdx
                                   ,int thisType);
  private native boolean IsLoaded138(long refNdx);
  private native boolean FileTruncated139(long refNdx);
  private native boolean Load140(long refNdx);
  private native boolean Unload141(long refNdx);
  private native boolean HasChanged142(long refNdx);
  private native void MarkChanged143(long refNdx);
  private static native void LoadRefSurface144(
                                      long surface);
  private native long WireFrame145(long refNdx);
  private native long[] ObjectCounts146(long refNdx);
  private native int ObjectCountsLength147(long refNdx);
  private native long SurfaceToGridCount148(long refNdx);
  private native long GetColor149(long refNdx);
  private native long DataContainers150(long refNdx);
  private native long DemandDataContainers151(long refNdx);
}
