using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTriangleFace : RjniBaseClass
{


  protected RescueTriangleFace(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTriangleFace(RescueTriangleVertex v1,
                            RescueTriangleVertex v2,
                            RescueTriangleVertex v3)
  {
    nativeNdx = Create_RescueTriangleFace0((v1 == null) ? 0 : v1.nativeNdx,
                                           (v2 == null) ? 0 : v2.nativeNdx,
                                           (v3 == null) ? 0 : v3.nativeNdx);
  }

  public RescueTriangleFace(RescueTriangleVertex v)
  {
    nativeNdx = Create_RescueTriangleFace1((v == null) ? 0 : v.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueTriangleFace(nativeNdx);
  }

  public RescueTriangleVertex NthVertex(long ordinal)
  {
    long returnNdx = NthVertex3(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangleFace CrossFace(long ordinal)
  {
    long returnNdx = CrossFace4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleFace myReturn = new RescueTriangleFace(returnNdx);
      return myReturn;
    }
  }

}

}