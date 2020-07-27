package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeometryUnit.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueGeometryUnit extends RescueObject
{


  protected RescueGeometryUnit(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometryUnit(RescueGeometry parentGeometry,
                            RescueUnit relatedUnit,
                            int topLayerNdx,
                            int bottomLayerNdx)
  {
    nativeNdx = Create_RescueGeometryUnit0((parentGeometry == null) ? 0 : parentGeometry.nativeNdx,
                                           (relatedUnit == null) ? 0 : relatedUnit.nativeNdx,
                                           topLayerNdx,
                                           bottomLayerNdx);
  }

  public RescueUnit RelatedUnit()
  {
    long returnNdx = RelatedUnit1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueUnit myReturn = new RescueUnit(returnNdx);
      return myReturn;
    }
  }

  public void SetRelatedUnit(RescueUnit unitIn)
  {
    SetRelatedUnit2(nativeNdx
                   ,(unitIn == null) ? 0 : unitIn.nativeNdx);
  }

  public long TopLayerNdx64()
  {
    long myReturn = TopLayerNdx3(nativeNdx);
    return myReturn;
  }

  public int TopLayerNdx()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TopLayerNdx64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TopLayerNdx(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(TopLayerNdx64(), throwIfTooBig);
  }

  public void SetTopLayerNdx(long ndxIn)
  {
    SetTopLayerNdx4(nativeNdx
                   ,ndxIn);
  }

  public long BottomLayerNdx64()
  {
    long myReturn = BottomLayerNdx5(nativeNdx);
    return myReturn;
  }

  public int BottomLayerNdx()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BottomLayerNdx64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BottomLayerNdx(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(BottomLayerNdx64(), throwIfTooBig);
  }

  public void SetBottomLayerNdx(long ndxIn)
  {
    SetBottomLayerNdx6(nativeNdx
                      ,ndxIn);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueGeometryUnit0(long parentGeometry,
                                                long relatedUnit,
                                                int topLayerNdx,
                                                int bottomLayerNdx);
  private native long RelatedUnit1(long refNdx);
  private native void SetRelatedUnit2(long refNdx
                                     ,long unitIn);
  private native long TopLayerNdx3(long refNdx);
  private native void SetTopLayerNdx4(long refNdx
                                     ,long ndxIn);
  private native long BottomLayerNdx5(long refNdx);
  private native void SetBottomLayerNdx6(long refNdx
                                        ,long ndxIn);
  private native boolean IsOfType7(long refNdx
                                  ,int thisType);
}
