package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLineNode.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLineNode extends RescueObject
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

  public int FaceCount(boolean throwIfTooBig) throws RuntimeException
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

  public boolean SurfaceOnNode(RescueIJSurface surf)
  {
    boolean myReturn = SurfaceOnNode13(nativeNdx
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

  public int TSurfCount(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceNdx(RescueTriangulatedSurface tSurf, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceNdx(tSurf), throwIfTooBig);
  }

  public boolean SurfaceOnNode(RescueTriangulatedSurface surf)
  {
    boolean myReturn = SurfaceOnNode20(nativeNdx
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

  public int LayerCount(boolean throwIfTooBig) throws RuntimeException
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType25(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescuePolyLineNode(long ndx);
  private native long Create_RescuePolyLineNode1(long context,
                                                double x,
                                                double y,
                                                double z);
  private native long Create_RescuePolyLineNode2(long context,
                                                float x,
                                                float y,
                                                float z);
  private native void SetXYZValue3(long refNdx
                                  ,double x
                                  ,double y
                                  ,double z);
  private native void SetXYZValue4(long refNdx
                                  ,float x
                                  ,float y
                                  ,float z);
  private native double X5(long refNdx);
  private native double Y6(long refNdx);
  private native double Z7(long refNdx);
  private native void SetUVValue8(long refNdx
                                 ,long face
                                 ,float u
                                 ,float v);
  private native long FaceCount9(long refNdx);
  private native long NthFace10(long refNdx
                                ,long zeroBasedOrdinal);
  private native float U11(long refNdx
                          ,long face);
  private native float V12(long refNdx
                          ,long face);
  private native boolean SurfaceOnNode13(long refNdx
                                        ,long surf);
  private native void SetUVValue14(long refNdx
                                  ,long surface
                                  ,long faceNdx
                                  ,float u
                                  ,float v);
  private native long TSurfCount15(long refNdx);
  private native long NthTSurf16(long refNdx
                                 ,long model
                                 ,long zeroBasedOrdinal);
  private native float U17(long refNdx
                          ,long tSurf);
  private native float V18(long refNdx
                          ,long tSurf);
  private native long FaceNdx19(long refNdx
                              ,long tSurf);
  private native boolean SurfaceOnNode20(long refNdx
                                        ,long surf);
  private native void SetLayerValue21(long refNdx
                                     ,long geometry
                                     ,int layerType
                                     ,float layerNdxParam);
  private native long LayerCount22(long refNdx);
  private native long NthLayer23(long refNdx
                                 ,long zeroBasedOrdinal);
  private native long ParamOn24(long refNdx
                                ,long geometry
                                ,int layerType);
  private native boolean IsOfType25(long refNdx
                                   ,int thisType);
}
