using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSurface : RescueWireframeOwner
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

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated6(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType7(nativeNdx
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

  public int PropertyCount(bool throwIfTooBig) //thro RuntimeException
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

  public RescueProperty PropertyNamed(string name)
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

  public bool DropRescueProperty(RescueProperty unitToDrop)
  {
    bool myReturn = DropRescueProperty17(nativeNdx
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

  public int IJSurfaceCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropIJSurface(RescueIJSurface toDrop)
  {
    bool myReturn = DropIJSurface22(nativeNdx
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

  public int CountOfPropertyGroup(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfPropertyGroup64(), throwIfTooBig);
  }

  public void AddPropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    AddPropertyGroup25(nativeNdx
                     ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
  }

  public bool DeletePropertyGroup(RescuePropertyGroup group)
  {
    bool myReturn = DeletePropertyGroup26(nativeNdx
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

}

}