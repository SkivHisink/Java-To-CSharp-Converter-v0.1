package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePillar.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePillar extends RescueGeometryObject
{


  public RescuePillar(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePillar()
  {
    nativeNdx = Create_RescuePillar0();
  }

  public void dispose()
  {
    Delete_RescuePillar(nativeNdx);
  }

  public int VertexIs()
  {
    int myReturn = VertexIs2(nativeNdx);
    return myReturn;
  }

  public float[] NodeValues(long i,
                            long j,
                            long k)
  {
    float[] myReturn = NodeValues7(nativeNdx
                                  ,i
                                  ,j
                                  ,k);
    return myReturn;
  }

  public int NodeValuesLength()
  {
    int myReturn = NodeValuesLength8(nativeNdx);
    return myReturn;
  }

  public float KValue(long k)
  {
    float myReturn = KValue9(nativeNdx
                            ,k);
    return myReturn;
  }

  public float KValue(long k, long dir)
  {
    float myReturn = KValueR9(nativeNdx
                            ,k, dir);
    return myReturn;
  }

  public void ZValue(long k,
                     float newZValues)
  {
    ZValue10(nativeNdx
           ,k
           ,newZValues);
  }

  public void ZStack(RescueGeometry geometry,
                     float[] newZValues)
  {
    ZStack11(nativeNdx
           ,(geometry == null) ? 0 : geometry.nativeNdx
           ,newZValues);
  }

  public void ZStack(RescueGeometry geometry,
                     long direction,
                     float[] newZValues)
  {
    ZStack12(nativeNdx
           ,(geometry == null) ? 0 : geometry.nativeNdx
           ,direction
           ,newZValues);
  }

  public boolean IsSplit()
  {
    boolean myReturn = IsSplit13(nativeNdx);
    return myReturn;
  }

  public boolean IsVertical()
  {
    boolean myReturn = IsVertical14(nativeNdx);
    return myReturn;
  }

  public RescueTruncation TopTruncation()
  {
    long returnNdx = TopTruncation15(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTruncation myReturn = new RescueTruncation(returnNdx);
      return myReturn;
    }
  }

  public RescueTruncation BaseTruncation()
  {
    long returnNdx = BaseTruncation16(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTruncation myReturn = new RescueTruncation(returnNdx);
      return myReturn;
    }
  }

  public void SetTopTruncation(RescueTruncation newTop)
  {
    SetTopTruncation17(nativeNdx
                     ,(newTop == null) ? 0 : newTop.nativeNdx);
  }

  public void SetBaseTruncation(RescueTruncation newBase)
  {
    SetBaseTruncation18(nativeNdx
                      ,(newBase == null) ? 0 : newBase.nativeNdx);
  }

  public void AddControlPoint(float x,
                              float y,
                              float z)
  {
    AddControlPoint19(nativeNdx
                    ,x
                    ,y
                    ,z);
  }

  public void rebuildSplineCoeffs()
  {
    rebuildSplineCoeffs20(nativeNdx);
  }

  public void AddControlPoint(float x,
                              float y,
                              float z,
                              float xb,
                              float xc,
                              float xd,
                              float yb,
                              float yc,
                              float yd)
  {
    AddControlPoint21(nativeNdx
                    ,x
                    ,y
                    ,z
                    ,xb
                    ,xc
                    ,xd
                    ,yb
                    ,yc
                    ,yd);
  }

  public RescuePoint getByZ(float z)
  {
    long returnNdx = getByZ22(nativeNdx
                             ,z);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescuePoint getMinTangent()
  {
    long returnNdx = getMinTangent23(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescuePoint getMaxTangent()
  {
    long returnNdx = getMaxTangent24(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public long getNumCtrlPoints64()
  {
    long myReturn = getNumCtrlPoints25(nativeNdx);
    return myReturn;
  }

  public int getNumCtrlPoints()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(getNumCtrlPoints64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int getNumCtrlPoints(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(getNumCtrlPoints64(), throwIfTooBig);
  }

  public RescuePoint getMinCtrlPoint()
  {
    long returnNdx = getMinCtrlPoint26(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescuePoint getMaxCtrlPoint()
  {
    long returnNdx = getMaxCtrlPoint27(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescuePoint getCtrlPointAt(long ndx)
  {
    long returnNdx = getCtrlPointAt28(nativeNdx
                                     ,ndx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescueSplineCoef getXSplineCoefAt(long ndx)
  {
    long returnNdx = getXSplineCoefAt29(nativeNdx
                                       ,ndx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSplineCoef myReturn = new RescueSplineCoef(returnNdx);
      return myReturn;
    }
  }

  public RescueSplineCoef getYSplineCoefAt(long ndx)
  {
    long returnNdx = getYSplineCoefAt30(nativeNdx
                                       ,ndx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSplineCoef myReturn = new RescueSplineCoef(returnNdx);
      return myReturn;
    }
  }

  private native long Create_RescuePillar0();
  private native void Delete_RescuePillar(long ndx);
  private native int VertexIs2(long refNdx);
  private native float[] NodeValues7(long refNdx
                                    ,long i
                                    ,long j
                                    ,long k);
  private native int NodeValuesLength8(long refNdx);
  private native float KValue9(long refNdx
                              ,long k);
  private native float KValueR9(long refNdx
                              ,long k, long dir);
  private native void ZValue10(long refNdx
                              ,long k
                              ,float newZValues);
  private native void ZStack11(long refNdx
                              ,long geometry
                              ,float[] newZValues);
  private native void ZStack12(long refNdx
                              ,long geometry
                              ,long direction
                              ,float[] newZValues);
  private native boolean IsSplit13(long refNdx);
  private native boolean IsVertical14(long refNdx);
  private native long TopTruncation15(long refNdx);
  private native long BaseTruncation16(long refNdx);
  private native void SetTopTruncation17(long refNdx
                                        ,long newTop);
  private native void SetBaseTruncation18(long refNdx
                                         ,long newBase);
  private native void AddControlPoint19(long refNdx
                                       ,float x
                                       ,float y
                                       ,float z);
  private native void rebuildSplineCoeffs20(long refNdx);
  private native void AddControlPoint21(long refNdx
                                       ,float x
                                       ,float y
                                       ,float z
                                       ,float xb
                                       ,float xc
                                       ,float xd
                                       ,float yb
                                       ,float yc
                                       ,float yd);
  private native long getByZ22(long refNdx
                               ,float z);
  private native long getMinTangent23(long refNdx);
  private native long getMaxTangent24(long refNdx);
  private native long getNumCtrlPoints25(long refNdx);
  private native long getMinCtrlPoint26(long refNdx);
  private native long getMaxCtrlPoint27(long refNdx);
  private native long getCtrlPointAt28(long refNdx
                                       ,long ndx);
  private native long getXSplineCoefAt29(long refNdx
                                         ,long ndx);
  private native long getYSplineCoefAt30(long refNdx
                                         ,long ndx);
}
