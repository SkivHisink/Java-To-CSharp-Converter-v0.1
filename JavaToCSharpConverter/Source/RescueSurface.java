package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSurface extends RescueWireframeOwner
{

  public static final int AUXILLIARY = 0;
  public static final int FAULT = 1;
  public static final int UNCONFORMITY = 2;
  public static final int LEASE_BOUNDARY = 3;
  public static final int HORIZON = 4;
  public static final int OIL_CONTACT = 5;
  public static final int GAS_CONTACT = 6;
  public static final int WATER_CONTACT = 7;
  public static final int SALT_DOME = 8;

  protected RescueSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueSurface()
  {
  }

  public RescueSurface(RescueModel modelIn,
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
                       int type)
  {
    nativeNdx = Create_RescueSurface0((modelIn == null) ? 0 : modelIn.nativeNdx,
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
                                      type);
  }

  public RescueSurface(RescueModel modelIn,
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
                       float[] values,
                       int type)
  {
    nativeNdx = Create_RescueSurface1((modelIn == null) ? 0 : modelIn.nativeNdx,
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
                                      values,
                                      type);
  }

  public RescueSurface(RescueModel modelIn,
                       int orientation,
                       long i_lowbound,
                       long i_count,
                       long j_lowbound,
                       long j_count,
                       float missingValue,
                       int type)
  {
    nativeNdx = Create_RescueSurface2((modelIn == null) ? 0 : modelIn.nativeNdx,
                                      orientation,
                                      i_lowbound,
                                      i_count,
                                      j_lowbound,
                                      j_count,
                                      missingValue,
                                      type);
  }

  public RescueSurface(RescueModel modelIn,
                       int orientation,
                       long i_lowbound,
                       long i_count,
                       long j_lowbound,
                       long j_count,
                       float missingValue,
                       float[] tripletArray,
                       int type)
  {
    nativeNdx = Create_RescueSurface3((modelIn == null) ? 0 : modelIn.nativeNdx,
                                      orientation,
                                      i_lowbound,
                                      i_count,
                                      j_lowbound,
                                      j_count,
                                      missingValue,
                                      tripletArray,
                                      type);
  }

  public RescueEdgeSetStub EdgesObj()
  {
    long returnNdx = EdgesObj4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet Edges()
  {
    long returnNdx = Edges5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated6(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueSurface(nativeNdx);
  }

  public int Type()
  {
    int myReturn = Type9(nativeNdx);
    return myReturn;
  }

  public void SetColor(RescueColor colorIn)
  {
    SetColor11(nativeNdx
             ,(colorIn == null) ? 0 : colorIn.nativeNdx);
  }

  public RescueColor Color()
  {
    long returnNdx = Color12(nativeNdx);
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

  public long PropertyCount64()
  {
    long myReturn = PropertyCount13(nativeNdx);
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
    long returnNdx = NthRescueProperty14(nativeNdx
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
    long returnNdx = PropertyIdentifiedBy15(nativeNdx
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
    long returnNdx = PropertyNamed16(nativeNdx
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
    boolean myReturn = DropRescueProperty17(nativeNdx
                                             ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public long IJSurfaceCount64()
  {
    long myReturn = IJSurfaceCount18(nativeNdx);
    return myReturn;
  }

  public int IJSurfaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(IJSurfaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int IJSurfaceCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(IJSurfaceCount64(), throwIfTooBig);
  }

  public RescueIJSurface NthIJSurface(long zeroBasedOrdinal)
  {
    long returnNdx = NthIJSurface19(nativeNdx
                                   ,zeroBasedOrdinal);
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

  public RescueIJSurface SurfaceIJIdentifiedBy(long identifier)
  {
    long returnNdx = SurfaceIJIdentifiedBy20(nativeNdx
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
    long returnNdx = SurfaceTriangulatedIdentifiedBy21(nativeNdx
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

  public boolean DropIJSurface(RescueIJSurface toDrop)
  {
    boolean myReturn = DropIJSurface22(nativeNdx
                                        ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel23(nativeNdx);
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

  public long CountOfPropertyGroup64()
  {
    long myReturn = CountOfPropertyGroup24(nativeNdx);
    return myReturn;
  }

  public int CountOfPropertyGroup()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfPropertyGroup64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfPropertyGroup(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CountOfPropertyGroup64(), throwIfTooBig);
  }

  public void AddPropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    AddPropertyGroup25(nativeNdx
                     ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
  }

  public boolean DeletePropertyGroup(RescuePropertyGroup group)
  {
    boolean myReturn = DeletePropertyGroup26(nativeNdx
                                              ,(group == null) ? 0 : group.nativeNdx);
    return myReturn;
  }

  public RescuePropertyGroup NthPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthPropertyGroup27(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangulatedSurface CreateTriangulatedSurface(cSetRescueTriangleVertex verticesIn,
                                                               cSetRescueTriangleFace facesIn)
  {
    long returnNdx = CreateTriangulatedSurface28(nativeNdx
                                                ,(verticesIn == null) ? 0 : verticesIn.nativeNdx
                                                ,(facesIn == null) ? 0 : facesIn.nativeNdx);
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

  public RescueTriangulatedSurface CreateTriangulatedSurface(long vertexCount,
                                                               float[][] coordinates,
                                                               long faceCount,
                                                               long[][] faces)
  {
    long returnNdx = CreateTriangulatedSurface29(nativeNdx
                                                ,vertexCount
                                                ,coordinates
                                                ,faceCount
                                                ,faces);
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

  public RescueTriangulatedSurface CreateTriangulatedSurface(int vertexCount,
                                                               float[][] coordinates,
                                                               int faceCount,
                                                               int[][] faces)
  {
    long returnNdx = CreateTriangulatedSurface29i(nativeNdx
                                                ,vertexCount
                                                ,coordinates
                                                ,faceCount
                                                ,faces);
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

  public RescueTriangulatedSurface CreateTriangulatedSurface(long vertexCount,
                                                               float[] coordinates,
                                                               long faceCount,
                                                               long[] faces)
  {
    long returnNdx = CreateTriangulatedSurface30(nativeNdx
                                                ,vertexCount
                                                ,coordinates
                                                ,faceCount
                                                ,faces);
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

  public RescueTriangulatedSurface CreateTriangulatedSurface(int vertexCount,
                                                               float[] coordinates,
                                                               int faceCount,
                                                               int[] faces)
  {
    long returnNdx = CreateTriangulatedSurface30i(nativeNdx
                                                ,vertexCount
                                                ,coordinates
                                                ,faceCount
                                                ,faces);
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

  public RescueTriangulatedSurface TriangulatedSurface()
  {
    long returnNdx = TriangulatedSurface31(nativeNdx);
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

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers32(nativeNdx);
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
    long returnNdx = DemandDataContainers33(nativeNdx);
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

  private native long Create_RescueSurface0(long modelIn,
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
                                           int type);
  private native long Create_RescueSurface1(long modelIn,
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
                                           float[] values,
                                           int type);
  private native long Create_RescueSurface2(long modelIn,
                                           int orientation,
                                           long i_lowbound,
                                           long i_count,
                                           long j_lowbound,
                                           long j_count,
                                           float missingValue,
                                           int type);
  private native long Create_RescueSurface3(long modelIn,
                                           int orientation,
                                           long i_lowbound,
                                           long i_count,
                                           long j_lowbound,
                                           long j_count,
                                           float missingValue,
                                           float[] tripletArray,
                                           int type);
  private native long EdgesObj4(long refNdx);
  private native long Edges5(long refNdx);
  private native boolean AnyFileTruncated6(long refNdx);
  private native boolean IsOfType7(long refNdx
                                  ,int thisType);
  private native void Delete_RescueSurface(long ndx);
  private native int Type9(long refNdx);
  private native void SetColor11(long refNdx
                                ,long colorIn);
  private native long Color12(long refNdx);
  private native long PropertyCount13(long refNdx);
  private native long NthRescueProperty14(long refNdx
                                          ,long zeroBasedOrdinal);
  private native long PropertyIdentifiedBy15(long refNdx
                                             ,long identifier);
  private native long PropertyNamed16(long refNdx
                                      ,java.lang.String name);
  private native boolean DropRescueProperty17(long refNdx
                                             ,long unitToDrop);
  private native long IJSurfaceCount18(long refNdx);
  private native long NthIJSurface19(long refNdx
                                     ,long zeroBasedOrdinal);
  private native long SurfaceIJIdentifiedBy20(long refNdx
                                              ,long identifier);
  private native long SurfaceTriangulatedIdentifiedBy21(long refNdx
                                                        ,long identifier);
  private native boolean DropIJSurface22(long refNdx
                                        ,long toDrop);
  private native long ParentModel23(long refNdx);
  private native long CountOfPropertyGroup24(long refNdx);
  private native void AddPropertyGroup25(long refNdx
                                        ,long existingPropertyGroup);
  private native boolean DeletePropertyGroup26(long refNdx
                                              ,long group);
  private native long NthPropertyGroup27(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long CreateTriangulatedSurface28(long refNdx
                                                  ,long verticesIn
                                                  ,long facesIn);
  private native long CreateTriangulatedSurface29(long refNdx
                                                  ,long vertexCount
                                                  ,float[][] coordinates
                                                  ,long faceCount
                                                  ,long[][] faces);
  private native long CreateTriangulatedSurface29i(long refNdx
                                                  ,int vertexCount
                                                  ,float[][] coordinates
                                                  ,int faceCount
                                                  ,int[][] faces);
  private native long CreateTriangulatedSurface30(long refNdx
                                                  ,long vertexCount
                                                  ,float[] coordinates
                                                  ,long faceCount
                                                  ,long[] faces);
  private native long CreateTriangulatedSurface30i(long refNdx
                                                  ,int vertexCount
                                                  ,float[] coordinates
                                                  ,int faceCount
                                                  ,int[] faces);
  private native long TriangulatedSurface31(long refNdx);
  private native long DataContainers32(long refNdx);
  private native long DemandDataContainers33(long refNdx);
}
