using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePillar : RescueGeometryObject
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

  public bool IsSplit()
  {
    bool myReturn = IsSplit13(nativeNdx);
    return myReturn;
  }

  public bool IsVertical()
  {
    bool myReturn = IsVertical14(nativeNdx);
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

  public int getNumCtrlPoints(bool throwIfTooBig) //thro RuntimeException
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

}

}