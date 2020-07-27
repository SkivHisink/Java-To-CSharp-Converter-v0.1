using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlockUnit : RescueWireframeOwner
{


  protected RescueBlockUnit(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockUnit(RescueBlock parentBlock,
                         RescueUnit parentUnit)
  {
    nativeNdx = Create_RescueBlockUnit0((parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx);
  }

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
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
    nativeNdx = Create_RescueBlockUnit1(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
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

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
                         float i_origin,
                         float i_step,
                         int i_lowbound,
                         int i_count,
                         float j_origin,
                         float j_step,
                         int j_lowbound,
                         int j_count,
                         float k_origin,
                         float k_step,
                         int k_lowbound,
                         int k_count,
                         float missingValue)
  {
    nativeNdx = Create_RescueBlockUnit1(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
                                        i_origin,
                                        i_step,
                                        (long) i_lowbound,
                                        (long) i_count,
                                        j_origin,
                                        j_step,
                                        (long) j_lowbound,
                                        (long) j_count,
                                        k_origin,
                                        k_step,
                                        (long) k_lowbound,
                                        (long) k_count,
                                        missingValue);
  }

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
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
    nativeNdx = Create_RescueBlockUnit2(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
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

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
                         float i_origin,
                         float i_step,
                         int i_lowbound,
                         int i_count,
                         float j_origin,
                         float j_step,
                         int j_lowbound,
                         int j_count,
                         int k_lowbound,
                         int k_count,
                         float missingValue)
  {
    nativeNdx = Create_RescueBlockUnit2(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
                                        i_origin,
                                        i_step,
                                        (long) i_lowbound,
                                        (long) i_count,
                                        j_origin,
                                        j_step,
                                        (long) j_lowbound,
                                        (long) j_count,
                                        (long) k_lowbound,
                                        (long) k_count,
                                        missingValue);
  }

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
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
    nativeNdx = Create_RescueBlockUnit3(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
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

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
                         float i_origin,
                         float i_step,
                         int i_lowbound,
                         int i_count,
                         float j_origin,
                         float j_step,
                         int j_lowbound,
                         int j_count,
                         int k_lowbound,
                         int k_count,
                         float missingValue,
                         RescueReferenceSurface topSurfaceIn,
                         float topOffsetIn,
                         RescueReferenceSurface bottomSurfaceIn,
                         float bottomOffsetIn)
  {
    nativeNdx = Create_RescueBlockUnit3(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
                                        i_origin,
                                        i_step,
                                        (long) i_lowbound,
                                        (long) i_count,
                                        j_origin,
                                        j_step,
                                        (long) j_lowbound,
                                        (long) j_count,
                                        (long) k_lowbound,
                                        (long) k_count,
                                        missingValue,
                                        (topSurfaceIn == null) ? 0 : topSurfaceIn.nativeNdx,
                                        topOffsetIn,
                                        (bottomSurfaceIn == null) ? 0 : bottomSurfaceIn.nativeNdx,
                                        bottomOffsetIn);
  }

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
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
    nativeNdx = Create_RescueBlockUnit4(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
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

  public RescueBlockUnit(int orientation,
                         RescueBlock parentBlock,
                         RescueUnit parentUnit,
                         float i_origin,
                         float i_step,
                         int i_lowbound,
                         int i_count,
                         float j_origin,
                         float j_step,
                         int j_lowbound,
                         int j_count,
                         int k_lowbound,
                         int k_count,
                         float missingValue,
                         RescueReferenceSurface referenceSurfaceIn,
                         float referenceOffsetIn,
                         float thicknessIn,
                         int onOffLapIn)
  {
    nativeNdx = Create_RescueBlockUnit4(orientation,
                                        (parentBlock == null) ? 0 : parentBlock.nativeNdx,
                                        (parentUnit == null) ? 0 : parentUnit.nativeNdx,
                                        i_origin,
                                        i_step,
                                        (long) i_lowbound,
                                        (long) i_count,
                                        j_origin,
                                        j_step,
                                        (long) j_lowbound,
                                        (long) j_count,
                                        (long) k_lowbound,
                                        (long) k_count,
                                        missingValue,
                                        (referenceSurfaceIn == null) ? 0 : referenceSurfaceIn.nativeNdx,
                                        referenceOffsetIn,
                                        thicknessIn,
                                        onOffLapIn);
  }

  public void dispose()
  {
    Delete_RescueBlockUnit(nativeNdx);
  }

  public RescueUnit Unit()
  {
    long returnNdx = Unit6(nativeNdx);
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

  public RescueBlock Block()
  {
    long returnNdx = Block7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlock myReturn = new RescueBlock(returnNdx);
      return myReturn;
    }
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitHorizonSurface SurfaceAboveMe()
  {
    long returnNdx = SurfaceAboveMe9(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitHorizonSurface myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitHorizonSurface SurfaceBelowMe()
  {
    long returnNdx = SurfaceBelowMe10(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitHorizonSurface myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
      return myReturn;
    }
  }

  public void SetSurfaceAboveMe(RescueBlockUnitHorizonSurface existingSurface)
  {
    SetSurfaceAboveMe11(nativeNdx
                      ,(existingSurface == null) ? 0 : existingSurface.nativeNdx);
  }

  public void SetSurfaceBelowMe(RescueBlockUnitHorizonSurface existingSurface)
  {
    SetSurfaceBelowMe12(nativeNdx
                      ,(existingSurface == null) ? 0 : existingSurface.nativeNdx);
  }

  public RescueMacroVolume AddMacroVolume()
  {
    long returnNdx = AddMacroVolume13(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueMacroVolume myReturn = new RescueMacroVolume(returnNdx);
      return myReturn;
    }
  }

  public void DropMacroVolume(RescueMacroVolume existingVolume)
  {
    DropMacroVolume14(nativeNdx
                    ,(existingVolume == null) ? 0 : existingVolume.nativeNdx);
  }

  public RescueMacroVolume NthMacroVolume(long zeroBasedOrdinal)
  {
    long returnNdx = NthMacroVolume15(nativeNdx
                                     ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueMacroVolume myReturn = new RescueMacroVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueMacroVolume MacroVolumeIdentifiedBy(long id)
  {
    long returnNdx = MacroVolumeIdentifiedBy16(nativeNdx
                                              ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueMacroVolume myReturn = new RescueMacroVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueMacroVolume MacroVolumeIdentifiedBy(int id)
  {
    return MacroVolumeIdentifiedBy((long) id);
  }

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(long id)
  {
    long returnNdx = BlockUnitSideIdentifiedBy17(nativeNdx
                                                ,id);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnitSide myReturn = new RescueBlockUnitSide(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(int id)
  {
    return BlockUnitSideIdentifiedBy((long) id);
  }

  public void AddPropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    AddPropertyGroup18(nativeNdx
                     ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
  }

  public bool DeletePropertyGroup(RescuePropertyGroup existingPropertyGroup)
  {
    bool myReturn = DeletePropertyGroup19(nativeNdx
                                              ,(existingPropertyGroup == null) ? 0 : existingPropertyGroup.nativeNdx);
    return myReturn;
  }

  public RescuePropertyGroup NthPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthPropertyGroup20(nativeNdx
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

  public RescuePropertyGroup NthRescuePropertyGroup(int zeroBasedOrdinal)
  {
    return NthPropertyGroup((long) zeroBasedOrdinal);
  }

  public RescueGrid BlockUnitGrid(long zeroBasedOrdinal)
  {
    long returnNdx = BlockUnitGrid21(nativeNdx
                                    ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public RescueGrid BlockUnitGrid(int zeroBasedOrdinal)
  {
    return BlockUnitGrid((long) zeroBasedOrdinal);
  }

  public RescueGeometry GridGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = GridGeometry22(nativeNdx
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

  public RescueGeometry GridGeometry(int zeroBasedOrdinal)
  {
    return GridGeometry((long) zeroBasedOrdinal);
  }

  public long GeometryCount64()
  {
    long myReturn = GeometryCount23(nativeNdx);
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
    AddGeometry24(nativeNdx
                ,(newGeometry == null) ? 0 : newGeometry.nativeNdx);
  }

  public void DropGeometry(RescueGeometry toDrop)
  {
    DropGeometry25(nativeNdx
                 ,(toDrop == null) ? 0 : toDrop.nativeNdx);
  }

  public long PropertyCount64()
  {
    long myReturn = PropertyCount26(nativeNdx);
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
    long myReturn = CountOfPropertyGroup27(nativeNdx);
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
    long myReturn = CountOfVolumes28(nativeNdx);
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

  public long CountOfGeobodies64()
  {
    long myReturn = CountOfGeobodies29(nativeNdx);
    return myReturn;
  }

  public int CountOfGeobodies()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfGeobodies64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfGeobodies(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfGeobodies64(), throwIfTooBig);
  }

  public RescueGeobodyPart NthPart(long zeroBasedOrdinal)
  {
    long returnNdx = NthPart30(nativeNdx
                              ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyPart myReturn = new RescueGeobodyPart(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyPart NthPart(int zeroBasedIdentifier)
  {
    return NthPart((long) zeroBasedIdentifier);
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy31(nativeNdx
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

  public RescueGeometry GeometryIdentifiedBy(int identifier)
  {
    return GeometryIdentifiedBy((long) identifier);
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated32(nativeNdx);
    return myReturn;
  }

  public void SetColor(RescueColor colorIn)
  {
    SetColor34(nativeNdx
             ,(colorIn == null) ? 0 : colorIn.nativeNdx);
  }

  public RescueColor Color()
  {
    long returnNdx = Color35(nativeNdx);
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
    long returnNdx = PropertyIdentifiedBy36(nativeNdx
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

  public RescueProperty PropertyIdentifiedBy(int id)
  {
    return PropertyIdentifiedBy((long) id);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType37(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}