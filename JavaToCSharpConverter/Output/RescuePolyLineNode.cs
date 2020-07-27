using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePolyLineNode : RescueObject
{

  public static final int I_SECTION = 0;
  public static final int J_SECTION = 1;
  public static final int K_SLICE = 2;

  protected RescuePolyLineNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescuePolyLineNode()
  {
  }

  public void dispose()
  {
    Delete_RescuePolyLineNode(nativeNdx);
  }

  public RescuePolyLineNode(RescueContext context,
                            double x,
                            double y,
                            double z)
  {
    nativeNdx = Create_RescuePolyLineNode1((context == null) ? 0 : context.nativeNdx,
                                           x,
                                           y,
                                           z);
  }

  public RescuePolyLineNode(RescueContext context,
                            float x,
                            float y,
                            float z)
  {
    nativeNdx = Create_RescuePolyLineNode2((context == null) ? 0 : context.nativeNdx,
                                           x,
                                           y,
                                           z);
  }

  public void SetXYZValue(double x,
                          double y,
                          double z)
  {
    SetXYZValue3(nativeNdx
                ,x
                ,y
                ,z);
  }

  public void SetXYZValue(float x,
                          float y,
                          float z)
  {
    SetXYZValue4(nativeNdx
                ,x
                ,y
                ,z);
  }

  public double X()
  {
    double myReturn = X5(nativeNdx);
    return myReturn;
  }

  public double Y()
  {
    double myReturn = Y6(nativeNdx);
    return myReturn;
  }

  public double Z()
  {
    double myReturn = Z7(nativeNdx);
    return myReturn;
  }

  public void SetUVValue(RescueIJSurface face,
                         float u,
                         float v)
  {
    SetUVValue8(nativeNdx
               ,(face == null) ? 0 : face.nativeNdx
               ,u
               ,v);
  }

  public long FaceCount64()
  {
    long myReturn = FaceCount9(nativeNdx);
    return myReturn;
  }

  public int FaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceCount64(), throwIfTooBig);
  }

  public RescueIJSurface NthFace(long zeroBasedOrdinal)
  {
    long returnNdx = NthFace10(nativeNdx
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

  public float U(RescueIJSurface face)
  {
    float myReturn = U11(nativeNdx
                       ,(face == null) ? 0 : face.nativeNdx);
    return myReturn;
  }

  public float V(RescueIJSurface face)
  {
    float myReturn = V12(nativeNdx
                       ,(face == null) ? 0 : face.nativeNdx);
    return myReturn;
  }

  public bool SurfaceOnNode(RescueIJSurface surf)
  {
    bool myReturn = SurfaceOnNode13(nativeNdx
                                        ,(surf == null) ? 0 : surf.nativeNdx);
    return myReturn;
  }

  public void SetUVValue(RescueTriangulatedSurface surface,
                         long faceNdx,
                         float u,
                         float v)
  {
    SetUVValue14(nativeNdx
               ,(surface == null) ? 0 : surface.nativeNdx
               ,faceNdx
               ,u
               ,v);
  }

  public long TSurfCount64()
  {
    long myReturn = TSurfCount15(nativeNdx);
    return myReturn;
  }

  public int TSurfCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TSurfCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TSurfCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(TSurfCount64(), throwIfTooBig);
  }

  public RescueTriangulatedSurface NthTSurf(RescueModel model,
                                              long zeroBasedOrdinal)
  {
    long returnNdx = NthTSurf16(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx
                               ,zeroBasedOrdinal);
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

  public float U(RescueTriangulatedSurface tSurf)
  {
    float myReturn = U17(nativeNdx
                       ,(tSurf == null) ? 0 : tSurf.nativeNdx);
    return myReturn;
  }

  public float V(RescueTriangulatedSurface tSurf)
  {
    float myReturn = V18(nativeNdx
                       ,(tSurf == null) ? 0 : tSurf.nativeNdx);
    return myReturn;
  }

  public long FaceNdx64(RescueTriangulatedSurface tSurf)
  {
    long myReturn = FaceNdx19(nativeNdx
                           ,(tSurf == null) ? 0 : tSurf.nativeNdx);
    return myReturn;
  }

  public int FaceNdx(RescueTriangulatedSurface tSurf)
  {
    return (int) FaceNdx64(tSurf);
  }

  public int FaceNdx(RescueTriangulatedSurface tSurf, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceNdx(tSurf), throwIfTooBig);
  }

  public bool SurfaceOnNode(RescueTriangulatedSurface surf)
  {
    bool myReturn = SurfaceOnNode20(nativeNdx
                                        ,(surf == null) ? 0 : surf.nativeNdx);
    return myReturn;
  }

  public void SetLayerValue(RescueGeometry geometry,
                            int layerType,
                            float layerNdxParam)
  {
    SetLayerValue21(nativeNdx
                  ,(geometry == null) ? 0 : geometry.nativeNdx
                  ,layerType
                  ,layerNdxParam);
  }

  public long LayerCount64()
  {
    long myReturn = LayerCount22(nativeNdx);
    return myReturn;
  }

  public int LayerCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(LayerCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int LayerCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(LayerCount64(), throwIfTooBig);
  }

  public RescuePolyLineNodeBUG NthLayer(long zeroBasedOrdinal)
  {
    long returnNdx = NthLayer23(nativeNdx
                               ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNodeBUG myReturn = new RescuePolyLineNodeBUG(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLineNodeBUG ParamOn(RescueGeometry geometry,
                                         int layerType)
  {
    long returnNdx = ParamOn24(nativeNdx
                              ,(geometry == null) ? 0 : geometry.nativeNdx
                              ,layerType);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNodeBUG myReturn = new RescuePolyLineNodeBUG(returnNdx);
      return myReturn;
    }
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType25(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}