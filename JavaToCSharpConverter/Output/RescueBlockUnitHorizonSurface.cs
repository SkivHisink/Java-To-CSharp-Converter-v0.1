using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlockUnitHorizonSurface : RescueReferenceSurface
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType10(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}