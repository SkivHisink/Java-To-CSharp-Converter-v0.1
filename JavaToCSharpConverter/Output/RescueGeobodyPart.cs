using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGeobodyPart : RescueHistoryObject
{


  protected RescueGeobodyPart(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeobodyPart(RescueGeobody parentBody)
  {
    nativeNdx = Create_RescueGeobodyPart0((parentBody == null) ? 0 : parentBody.nativeNdx);
  }

  public RescueGeobodyPart(int orientation,
                           RescueGeobody parentBody,
                           float i_origin,
                           float i_step,
                           long i_lowbound,
                           long i_count,
                           float j_origin,
                           float j_step,
                           long j_lowbound,
                           long j_count,
                           float k_origin,
                           float k_step,
                           long k_lowbound,
                           long k_count,
                           float missingValue)
  {
    nativeNdx = Create_RescueGeobodyPart1(orientation,
                                          (parentBody == null) ? 0 : parentBody.nativeNdx,
                                          i_origin,
                                          i_step,
                                          i_lowbound,
                                          i_count,
                                          j_origin,
                                          j_step,
                                          j_lowbound,
                                          j_count,
                                          k_origin,
                                          k_step,
                                          k_lowbound,
                                          k_count,
                                          missingValue);
  }

  public RescueGeobodyPart(int orientation,
                           RescueGeobody parentBody,
                           float i_origin,
                           float i_step,
                           long i_lowbound,
                           long i_count,
                           float j_origin,
                           float j_step,
                           long j_lowbound,
                           long j_count,
                           long k_lowbound,
                           long k_count,
                           float missingValue)
  {
    nativeNdx = Create_RescueGeobodyPart2(orientation,
                                          (parentBody == null) ? 0 : parentBody.nativeNdx,
                                          i_origin,
                                          i_step,
                                          i_lowbound,
                                          i_count,
                                          j_origin,
                                          j_step,
                                          j_lowbound,
                                          j_count,
                                          k_lowbound,
                                          k_count,
                                          missingValue);
  }

  public RescueGeobodyPart(int orientation,
                           RescueGeobody parentBody,
                           float i_origin,
                           float i_step,
                           long i_lowbound,
                           long i_count,
                           float j_origin,
                           float j_step,
                           long j_lowbound,
                           long j_count,
                           long k_lowbound,
                           long k_count,
                           float missingValue,
                           RescueReferenceSurface topSurfaceIn,
                           float topOffsetIn,
                           RescueReferenceSurface bottomSurfaceIn,
                           float bottomOffsetIn)
  {
    nativeNdx = Create_RescueGeobodyPart3(orientation,
                                          (parentBody == null) ? 0 : parentBody.nativeNdx,
                                          i_origin,
                                          i_step,
                                          i_lowbound,
                                          i_count,
                                          j_origin,
                                          j_step,
                                          j_lowbound,
                                          j_count,
                                          k_lowbound,
                                          k_count,
                                          missingValue,
                                          (topSurfaceIn == null) ? 0 : topSurfaceIn.nativeNdx,
                                          topOffsetIn,
                                          (bottomSurfaceIn == null) ? 0 : bottomSurfaceIn.nativeNdx,
                                          bottomOffsetIn);
  }

  public RescueGeobodyPart(int orientation,
                           RescueGeobody parentBody,
                           float i_origin,
                           float i_step,
                           long i_lowbound,
                           long i_count,
                           float j_origin,
                           float j_step,
                           long j_lowbound,
                           long j_count,
                           long k_lowbound,
                           long k_count,
                           float missingValue,
                           RescueReferenceSurface referenceSurfaceIn,
                           float referenceOffsetIn,
                           float thicknessIn,
                           int onOffLapIn)
  {
    nativeNdx = Create_RescueGeobodyPart4(orientation,
                                          (parentBody == null) ? 0 : parentBody.nativeNdx,
                                          i_origin,
                                          i_step,
                                          i_lowbound,
                                          i_count,
                                          j_origin,
                                          j_step,
                                          j_lowbound,
                                          j_count,
                                          k_lowbound,
                                          k_count,
                                          missingValue,
                                          (referenceSurfaceIn == null) ? 0 : referenceSurfaceIn.nativeNdx,
                                          referenceOffsetIn,
                                          thicknessIn,
                                          onOffLapIn);
  }

  public void dispose()
  {
    Delete_RescueGeobodyPart(nativeNdx);
  }

  public RescueGeobody Body()
  {
    long returnNdx = Body6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobody myReturn = new RescueGeobody(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyVolume AddGeobodyVolume()
  {
    long returnNdx = AddGeobodyVolume7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyVolume myReturn = new RescueGeobodyVolume(returnNdx);
      return myReturn;
    }
  }

  public void DropGeobodyVolume(RescueGeobodyVolume existingVolume)
  {
    DropGeobodyVolume8(nativeNdx
                      ,(existingVolume == null) ? 0 : existingVolume.nativeNdx);
  }

  public RescueGeobodyVolume NthGeobodyVolume(long zeroBasedOrdinal)
  {
    long returnNdx = NthGeobodyVolume9(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyVolume myReturn = new RescueGeobodyVolume(returnNdx);
      return myReturn;
    }
  }

  public void AddPropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    AddPropertyGroup10(nativeNdx
                     ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
  }

  public bool DeletePropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    bool myReturn = DeletePropertyGroup11(nativeNdx
                                              ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
    return myReturn;
  }

  public RescuePropertyGroup NthPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthPropertyGroup12(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public void AddBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    AddBlockUnit13(nativeNdx
                 ,(existingBlockUnit == null) ? 0 : existingBlockUnit.nativeNdx);
  }

  public bool DropBlockUnit(RescueBlockUnit existingBlockUnit)
  {
    bool myReturn = DropBlockUnit14(nativeNdx
                                        ,(existingBlockUnit == null) ? 0 : existingBlockUnit.nativeNdx);
    return myReturn;
  }

  public long BlockUnitCount64()
  {
    long myReturn = BlockUnitCount15(nativeNdx);
    return myReturn;
  }

  public int BlockUnitCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BlockUnitCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BlockUnitCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(BlockUnitCount64(), throwIfTooBig);
  }

  public RescueBlockUnit NthBlockUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthBlockUnit16(nativeNdx
                                   ,zeroBasedOrdinal);
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

  public RescueGeometry GridGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = GridGeometry17(nativeNdx
                                   ,zeroBasedOrdinal);
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

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy18(nativeNdx
                                           ,identifier);
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

  public long GeometryCount64()
  {
    long myReturn = GeometryCount19(nativeNdx);
    return myReturn;
  }

  public int GeometryCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(GeometryCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int GeometryCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(GeometryCount64(), throwIfTooBig);
  }

  public void AddGeometry(RescueGeometry newGeometry)
  {
    AddGeometry20(nativeNdx
                ,(newGeometry == null) ? 0 : newGeometry.nativeNdx);
  }

  public void DropGeometry(RescueGeometry toDrop)
  {
    DropGeometry21(nativeNdx
                 ,(toDrop == null) ? 0 : toDrop.nativeNdx);
  }

  public long PropertyCount64()
  {
    long myReturn = PropertyCount22(nativeNdx);
    return myReturn;
  }

  public int PropertyCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(PropertyCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int PropertyCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(PropertyCount64(), throwIfTooBig);
  }

  public long CountOfPropertyGroup64()
  {
    long myReturn = CountOfPropertyGroup23(nativeNdx);
    return myReturn;
  }

  public int CountOfPropertyGroup()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfPropertyGroup64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfPropertyGroup(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfPropertyGroup64(), throwIfTooBig);
  }

  public long CountOfVolumes64()
  {
    long myReturn = CountOfVolumes24(nativeNdx);
    return myReturn;
  }

  public int CountOfVolumes()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfVolumes64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfVolumes(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfVolumes64(), throwIfTooBig);
  }

  public void SetColor(RescueColor colorIn)
  {
    SetColor26(nativeNdx
             ,(colorIn == null) ? 0 : colorIn.nativeNdx);
  }

  public RescueColor Color()
  {
    long returnNdx = Color27(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueColor myReturn = new RescueColor(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(long id)
  {
    long returnNdx = PropertyIdentifiedBy28(nativeNdx
                                           ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyVolume GeobodyVolumeIdentifiedBy(long id)
  {
    long returnNdx = GeobodyVolumeIdentifiedBy29(nativeNdx
                                                ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyVolume myReturn = new RescueGeobodyVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodySurface GeobodySurfaceIdentifiedBy(long id)
  {
    long returnNdx = GeobodySurfaceIdentifiedBy30(nativeNdx
                                                 ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodySurface myReturn = new RescueGeobodySurface(returnNdx);
      return myReturn;
    }
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated31(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType32(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}