package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSurfaceCell.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSurfaceCell extends RescueObject
{

  public static final int FRONT = 0;
  public static final int BACK = 1;

  protected RescueSurfaceCell(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometry Geometry()
  {
    long returnNdx = Geometry0(nativeNdx);
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

  public RescueIJSurface Surface()
  {
    long returnNdx = Surface1(nativeNdx);
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

  public int Side()
  {
    int myReturn = Side2(nativeNdx);
    return myReturn;
  }

  public long CellFaceNumber64()
  {
    long myReturn = CellFaceNumber3(nativeNdx);
    return myReturn;
  }

  public int CellFaceNumber()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellFaceNumber64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellFaceNumber(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CellFaceNumber64(), throwIfTooBig);
  }

  public float[] UVArray()
  {
    float[] myReturn = UVArray4(nativeNdx);
    return myReturn;
  }

  public int UVArrayLength64()
  {
    int myReturn = UVArrayLength5(nativeNdx);
    return myReturn;
  }

  public void CellIndex(RescueGeometry geometry,
                        long[] returnArray,
                        long returnArraySize)
  {
    CellIndex7(nativeNdx
              ,(geometry == null) ? 0 : geometry.nativeNdx
              ,returnArray
              ,returnArraySize);
  }

  public void CellIndex(RescueGeometry geometry,
                        int[] returnArray,
                        int returnArraySize)
  {
    CellIndex7i(nativeNdx
              ,(geometry == null) ? 0 : geometry.nativeNdx
              ,returnArray
              ,returnArraySize);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType8(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueSurfaceCell(nativeNdx);
  }

  private native long Geometry0(long refNdx);
  private native long Surface1(long refNdx);
  private native int Side2(long refNdx);
  private native long CellFaceNumber3(long refNdx);
  private native float[] UVArray4(long refNdx);
  private native int UVArrayLength5(long refNdx);
  private native void CellIndex7(long refNdx
                                ,long geometry
                                ,long[] returnArray
                                ,long returnArraySize);
  private native void CellIndex7i(long refNdx
                                ,long geometry
                                ,int[] returnArray
                                ,int returnArraySize);
  private native boolean IsOfType8(long refNdx
                                  ,int thisType);
  private native void Delete_RescueSurfaceCell(long ndx);
}
