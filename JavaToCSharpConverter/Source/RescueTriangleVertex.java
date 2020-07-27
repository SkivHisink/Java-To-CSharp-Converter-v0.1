package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTriangleVertex.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTriangleVertex extends RescueObject
{


  protected RescueTriangleVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTriangleVertex(RescueContext context,
                              float xIn,
                              float yIn,
                              float zIn)
  {
    nativeNdx = Create_RescueTriangleVertex0((context == null) ? 0 : context.nativeNdx,
                                             xIn,
                                             yIn,
                                             zIn);
  }

  public RescueTriangleVertex(RescueContext context,
                              float xIn,
                              float yIn,
                              float zIn,
                              float uIn,
                              float vIn)
  {
    nativeNdx = Create_RescueTriangleVertex1((context == null) ? 0 : context.nativeNdx,
                                             xIn,
                                             yIn,
                                             zIn,
                                             uIn,
                                             vIn);
  }

  public void dispose()
  {
    Delete_RescueTriangleVertex(nativeNdx);
  }

  public float X()
  {
    float myReturn = X3(nativeNdx);
    return myReturn;
  }

  public float Y()
  {
    float myReturn = Y4(nativeNdx);
    return myReturn;
  }

  public float Z()
  {
    float myReturn = Z5(nativeNdx);
    return myReturn;
  }

  public float U()
  {
    float myReturn = U6(nativeNdx);
    return myReturn;
  }

  public float V()
  {
    float myReturn = V7(nativeNdx);
    return myReturn;
  }

  public void SetUV(float uIn,
                    float vIn)
  {
    SetUV8(nativeNdx
          ,uIn
          ,vIn);
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

  public RescueTriangleFace NthFace(long zeroBasedOrdinal)
  {
    long returnNdx = NthFace10(nativeNdx
                              ,zeroBasedOrdinal);
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

  private native long Create_RescueTriangleVertex0(long context,
                                                  float xIn,
                                                  float yIn,
                                                  float zIn);
  private native long Create_RescueTriangleVertex1(long context,
                                                  float xIn,
                                                  float yIn,
                                                  float zIn,
                                                  float uIn,
                                                  float vIn);
  private native void Delete_RescueTriangleVertex(long ndx);
  private native float X3(long refNdx);
  private native float Y4(long refNdx);
  private native float Z5(long refNdx);
  private native float U6(long refNdx);
  private native float V7(long refNdx);
  private native void SetUV8(long refNdx
                            ,float uIn
                            ,float vIn);
  private native long FaceCount9(long refNdx);
  private native long NthFace10(long refNdx
                                ,long zeroBasedOrdinal);
}
