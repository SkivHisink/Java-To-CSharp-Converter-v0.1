package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLineNodeUVT.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLineNodeUVT extends RescueObject
{


  protected RescuePolyLineNodeUVT(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePolyLineNodeUVT(RescueContext context,
                               RescueTriangulatedSurface faceIn,
                               long faceNdxIn,
                               float u,
                               float v)
  {
    nativeNdx = Create_RescuePolyLineNodeUVT0((context == null) ? 0 : context.nativeNdx,
                                              (faceIn == null) ? 0 : faceIn.nativeNdx,
                                              faceNdxIn,
                                              u,
                                              v);
  }

  public void SetUVValue(long faceNdxIn,
                         float u,
                         float v)
  {
    SetUVValue1(nativeNdx
               ,faceNdxIn
               ,u
               ,v);
  }

  public float U()
  {
    float myReturn = U2(nativeNdx);
    return myReturn;
  }

  public float V()
  {
    float myReturn = V3(nativeNdx);
    return myReturn;
  }

  public long FaceNdx64()
  {
    long myReturn = FaceNdx4(nativeNdx);
    return myReturn;
  }

  public int FaceNdx()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceNdx64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public boolean CompareFace(RescueTriangulatedSurface toCompare)
  {
    boolean myReturn = CompareFace5(nativeNdx
                                      ,(toCompare == null) ? 0 : toCompare.nativeNdx);
    return myReturn;
  }

  public RescueTriangulatedSurface Face(RescueModel model)
  {
    long returnNdx = Face6(nativeNdx
                           ,(model == null) ? 0 : model.nativeNdx);
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescuePolyLineNodeUVT0(long context,
                                                   long faceIn,
                                                   long faceNdxIn,
                                                   float u,
                                                   float v);
  private native void SetUVValue1(long refNdx
                                 ,long faceNdxIn
                                 ,float u
                                 ,float v);
  private native float U2(long refNdx);
  private native float V3(long refNdx);
  private native long FaceNdx4(long refNdx);
  private native boolean CompareFace5(long refNdx
                                     ,long toCompare);
  private native long Face6(long refNdx
                            ,long model);
  private native boolean IsOfType7(long refNdx
                                  ,int thisType);
}
