package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBlockUnitHorizonSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueBlockUnitHorizonSurface extends RescueReferenceSurface
{


  protected RescueBlockUnitHorizonSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       float i_origin,
                                       float i_step,
                                       long i_lowbound,
                                       long i_count,
                                       float j_origin,
                                       float j_step,
                                       long j_lowbound,
                                       long j_count,
                                       float missingValue,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface0(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_origin,
                                                      i_step,
                                                      i_lowbound,
                                                      i_count,
                                                      j_origin,
                                                      j_step,
                                                      j_lowbound,
                                                      j_count,
                                                      missingValue,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       float i_origin,
                                       float i_step,
                                       int i_lowbound,
                                       int i_count,
                                       float j_origin,
                                       float j_step,
                                       int j_lowbound,
                                       int j_count,
                                       float missingValue,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface0(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_origin,
                                                      i_step,
                                                      (long) i_lowbound,
                                                      (long) i_count,
                                                      j_origin,
                                                      j_step,
                                                      (long) j_lowbound,
                                                      (long) j_count,
                                                      missingValue,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       float i_origin,
                                       float i_step,
                                       long i_lowbound,
                                       long i_count,
                                       float j_origin,
                                       float j_step,
                                       long j_lowbound,
                                       long j_count,
                                       float missingValue,
                                       float[] valueTriplets,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface1(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_origin,
                                                      i_step,
                                                      i_lowbound,
                                                      i_count,
                                                      j_origin,
                                                      j_step,
                                                      j_lowbound,
                                                      j_count,
                                                      missingValue,
                                                      valueTriplets,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       float i_origin,
                                       float i_step,
                                       int i_lowbound,
                                       int i_count,
                                       float j_origin,
                                       float j_step,
                                       int j_lowbound,
                                       int j_count,
                                       float missingValue,
                                       float[] valueTriplets,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface1(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_origin,
                                                      i_step,
                                                      (long) i_lowbound,
                                                      (long) i_count,
                                                      j_origin,
                                                      j_step,
                                                      (long) j_lowbound,
                                                      (long) j_count,
                                                      missingValue,
                                                      valueTriplets,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       long i_lowbound,
                                       long i_count,
                                       long j_lowbound,
                                       long j_count,
                                       float missingValue,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface2(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_lowbound,
                                                      i_count,
                                                      j_lowbound,
                                                      j_count,
                                                      missingValue,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       int i_lowbound,
                                       int i_count,
                                       int j_lowbound,
                                       int j_count,
                                       float missingValue,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface2(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      (long) i_lowbound,
                                                      (long) i_count,
                                                      (long) j_lowbound,
                                                      (long) j_count,
                                                      missingValue,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       float missingValue,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface3(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      missingValue,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       long i_lowbound,
                                       long i_count,
                                       long j_lowbound,
                                       long j_count,
                                       float missingValue,
                                       float[] valueTriplets,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface4(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      i_lowbound,
                                                      i_count,
                                                      j_lowbound,
                                                      j_count,
                                                      missingValue,
                                                      valueTriplets,
                                                      typeIn);
  }

  public RescueBlockUnitHorizonSurface(int orientation,
                                       RescueHorizon parentHorizon,
                                       int i_lowbound,
                                       int i_count,
                                       int j_lowbound,
                                       int j_count,
                                       float missingValue,
                                       float[] valueTriplets,
                                       int typeIn)
  {
    nativeNdx = Create_RescueBlockUnitHorizonSurface4(orientation,
                                                      (parentHorizon == null) ? 0 : parentHorizon.nativeNdx,
                                                      (long) i_lowbound,
                                                      (long) i_count,
                                                      (long) j_lowbound,
                                                      (long) j_count,
                                                      missingValue,
                                                      valueTriplets,
                                                      typeIn);
  }

  public RescueHorizon ParentHorizon()
  {
    long returnNdx = ParentHorizon5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnit BlockUnitAboveMe()
  {
    long returnNdx = BlockUnitAboveMe6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnit myReturn = new RescueBlockUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnit BlockUnitBelowMe()
  {
    long returnNdx = BlockUnitBelowMe7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnit myReturn = new RescueBlockUnit(returnNdx);
      return myReturn;
    }
  }

  public void SetBlockUnitAboveMe(RescueBlockUnit existingUnit)
  {
    SetBlockUnitAboveMe8(nativeNdx
                        ,(existingUnit == null) ? 0 : existingUnit.nativeNdx);
  }

  public void SetBlockUnitBelowMe(RescueBlockUnit existingUnit)
  {
    SetBlockUnitBelowMe9(nativeNdx
                        ,(existingUnit == null) ? 0 : existingUnit.nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType10(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueBlockUnitHorizonSurface0(int orientation,
                                                           long parentHorizon,
                                                           float i_origin,
                                                           float i_step,
                                                           long i_lowbound,
                                                           long i_count,
                                                           float j_origin,
                                                           float j_step,
                                                           long j_lowbound,
                                                           long j_count,
                                                           float missingValue,
                                                           int typeIn);
  private native long Create_RescueBlockUnitHorizonSurface1(int orientation,
                                                           long parentHorizon,
                                                           float i_origin,
                                                           float i_step,
                                                           long i_lowbound,
                                                           long i_count,
                                                           float j_origin,
                                                           float j_step,
                                                           long j_lowbound,
                                                           long j_count,
                                                           float missingValue,
                                                           float[] valueTriplets,
                                                           int typeIn);
  private native long Create_RescueBlockUnitHorizonSurface2(int orientation,
                                                           long parentHorizon,
                                                           long i_lowbound,
                                                           long i_count,
                                                           long j_lowbound,
                                                           long j_count,
                                                           float missingValue,
                                                           int typeIn);
  private native long Create_RescueBlockUnitHorizonSurface3(int orientation,
                                                           long parentHorizon,
                                                           float missingValue,
                                                           int typeIn);
  private native long Create_RescueBlockUnitHorizonSurface4(int orientation,
                                                           long parentHorizon,
                                                           long i_lowbound,
                                                           long i_count,
                                                           long j_lowbound,
                                                           long j_count,
                                                           float missingValue,
                                                           float[] valueTriplets,
                                                           int typeIn);
  private native long ParentHorizon5(long refNdx);
  private native long BlockUnitAboveMe6(long refNdx);
  private native long BlockUnitBelowMe7(long refNdx);
  private native void SetBlockUnitAboveMe8(long refNdx
                                          ,long existingUnit);
  private native void SetBlockUnitBelowMe9(long refNdx
                                          ,long existingUnit);
  private native boolean IsOfType10(long refNdx
                                   ,int thisType);
}
