package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueModel.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueModel extends RescueHistoryObject
{
  public RescueModel(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void RegisterWireframeCallBack(java.lang.Class callBackClass)
  {
    RegisterWireframeCallBack0(nativeNdx, callBackClass.getName());
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated1(nativeNdx);
    return myReturn;
  }

  public void Commit()
  {
    Commit2(nativeNdx);
  }

  public void Rollback()
  {
    Rollback3(nativeNdx);
  }

  public static RescueModel UnarchiveModel(RescueContext context,
                                      java.lang.String pathName)
  {
    long returnNdx = UnarchiveModel4(
(context == null) ? 0 : context.nativeNdx
                                     ,pathName);
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

  public boolean ArchiveModel(java.lang.String pathName,
                                 boolean binary,
                                 int version,
								 boolean write32)
  {
    boolean myReturn = ArchiveModel5(nativeNdx
                                       ,pathName
                                       ,binary
                                       ,version
									   ,write32);
    return myReturn;
  }

  public boolean ArchiveModel()
  {
    boolean myReturn = ArchiveModel6(nativeNdx);
    return myReturn;
  }

  public boolean ExistingModel()
  {
    boolean myReturn = ExistingModel7(nativeNdx);
    return myReturn;
  }

  public RescueModel(RescueContext context,
                     java.lang.String modelNameIn)
  {
    nativeNdx = Create_RescueModel8((context == null) ? 0 : context.nativeNdx,
                                    modelNameIn);
  }

  public RescueModel(java.lang.String modelNameIn,
                     RescueCoordinateSystem coordinateSystemIn)
  {
    nativeNdx = Create_RescueModel9(modelNameIn,
                                    (coordinateSystemIn == null) ? 0 : coordinateSystemIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueModel(nativeNdx);
  }

  public java.lang.String ModelName()
  {
    java.lang.String myReturn = ModelName11(nativeNdx);
    return myReturn;
  }

  public long UnitCount64()
  {
    long myReturn = UnitCount12(nativeNdx);
    return myReturn;
  }

  public int UnitCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(UnitCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int UnitCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(UnitCount64(), throwIfTooBig);
  }

  public long BlockCount64()
  {
    long myReturn = BlockCount13(nativeNdx);
    return myReturn;
  }

  public int BlockCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BlockCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BlockCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(BlockCount64(), throwIfTooBig);
  }

  public long HorizonCount64()
  {
    long myReturn = HorizonCount14(nativeNdx);
    return myReturn;
  }

  public int HorizonCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(HorizonCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int HorizonCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(HorizonCount64(), throwIfTooBig);
  }

  public long WellboreCount64()
  {
    long myReturn = WellboreCount15(nativeNdx);
    return myReturn;
  }

  public int WellboreCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WellboreCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WellboreCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WellboreCount64(), throwIfTooBig);
  }

  public long SectionCount64()
  {
    long myReturn = SectionCount16(nativeNdx);
    return myReturn;
  }

  public int SectionCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SectionCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SectionCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SectionCount64(), throwIfTooBig);
  }

  public long PropertyGroupCount64()
  {
    long myReturn = PropertyGroupCount17(nativeNdx);
    return myReturn;
  }

  public int PropertyGroupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(PropertyGroupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int PropertyGroupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(PropertyGroupCount64(), throwIfTooBig);
  }

  public long HistoryCount64()
  {
    long myReturn = HistoryCount18(nativeNdx);
    return myReturn;
  }

  public int HistoryCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(HistoryCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int HistoryCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(HistoryCount64(), throwIfTooBig);
  }

  public long GeobodyCount64()
  {
    long myReturn = GeobodyCount19(nativeNdx);
    return myReturn;
  }

  public int GeobodyCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(GeobodyCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int GeobodyCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(GeobodyCount64(), throwIfTooBig);
  }

  public long ReferenceSurfaceCount64()
  {
    long myReturn = ReferenceSurfaceCount20(nativeNdx);
    return myReturn;
  }

  public int ReferenceSurfaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ReferenceSurfaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ReferenceSurfaceCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ReferenceSurfaceCount64(), throwIfTooBig);
  }

  public long LookupCount64()
  {
    long myReturn = LookupCount21(nativeNdx);
    return myReturn;
  }

  public int LookupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(LookupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int LookupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(LookupCount64(), throwIfTooBig);
  }

  public long EventDescrCount64()
  {
    long myReturn = EventDescrCount22(nativeNdx);
    return myReturn;
  }

  public int EventDescrCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(EventDescrCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int EventDescrCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(EventDescrCount64(), throwIfTooBig);
  }

  public long FaultIntersectionCount64()
  {
    long myReturn = FaultIntersectionCount23(nativeNdx);
    return myReturn;
  }

  public int FaultIntersectionCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaultIntersectionCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaultIntersectionCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaultIntersectionCount64(), throwIfTooBig);
  }

  public long ReservoirCount64()
  {
    long myReturn = ReservoirCount24(nativeNdx);
    return myReturn;
  }

  public int ReservoirCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ReservoirCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ReservoirCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ReservoirCount64(), throwIfTooBig);
  }

  public long WireframeCount64()
  {
    long myReturn = WireframeCount25(nativeNdx);
    return myReturn;
  }

  public int WireframeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WireframeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WireframeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WireframeCount64(), throwIfTooBig);
  }

  public RescueEventDescr MakeUnconformity(java.lang.String name)
  {
    long returnNdx = MakeUnconformity26(nativeNdx
                                       ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueEventDescr MakeDiapir(java.lang.String name)
  {
    long returnNdx = MakeDiapir27(nativeNdx
                                 ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueUnit NthRescueUnit(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueUnit28(nativeNdx
                                    ,zeroBasedOrdinal);
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

  public RescueBlock NthRescueBlock(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueBlock29(nativeNdx
                                     ,zeroBasedOrdinal);
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

  public RescueHorizon NthRescueHorizon(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueHorizon30(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public RescueWellbore NthRescueWellbore(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWellbore31(nativeNdx
                                        ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public RescueSection NthRescueSection(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueSection32(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueReferenceSurface NthRescueReferenceSurface(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueReferenceSurface33(nativeNdx
                                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReferenceSurface myReturn = new RescueReferenceSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnitHorizonSurface:
        myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueModelPropertyGroup NthRescueModelPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueModelPropertyGroup34(nativeNdx
                                                  ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModelPropertyGroup myReturn = new RescueModelPropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescueHistory NthRescueHistory(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueHistory35(nativeNdx
                                       ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobody NthRescueGeobody(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueGeobody36(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public RescueLookup NthRescueLookup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueLookup37(nativeNdx
                                      ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLookup myReturn = new RescueLookup(returnNdx);
      return myReturn;
    }
  }

  public RescueEventDescr NthRescueEventDescr(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueEventDescr38(nativeNdx
                                          ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueFaultIntersection NthRescueFaultIntersection(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueFaultIntersection39(nativeNdx
                                                 ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueFaultIntersection myReturn = new RescueFaultIntersection(returnNdx);
      return myReturn;
    }
  }

  public RescueReservoir NthRescueReservoir(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueReservoir40(nativeNdx
                                         ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReservoir myReturn = new RescueReservoir(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe NthRescueWireframe(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWireframe41(nativeNdx
                                         ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public boolean DropRescueUnit(RescueUnit unitToDrop)
  {
    boolean myReturn = DropRescueUnit42(nativeNdx
                                         ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueBlock(RescueBlock blockToDrop)
  {
    boolean myReturn = DropRescueBlock43(nativeNdx
                                          ,(blockToDrop == null) ? 0 : blockToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueHorizon(RescueHorizon horizonToDrop)
  {
    boolean myReturn = DropRescueHorizon44(nativeNdx
                                            ,(horizonToDrop == null) ? 0 : horizonToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueWellbore(RescueWellbore wellboreToDrop)
  {
    boolean myReturn = DropRescueWellbore45(nativeNdx
                                             ,(wellboreToDrop == null) ? 0 : wellboreToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueSection(RescueSection sectionToDrop)
  {
    boolean myReturn = DropRescueSection46(nativeNdx
                                            ,(sectionToDrop == null) ? 0 : sectionToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueReferenceSurface(RescueReferenceSurface surfaceToDrop)
  {
    boolean myReturn = DropRescueReferenceSurface47(nativeNdx
                                                     ,(surfaceToDrop == null) ? 0 : surfaceToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueLookup(RescueLookup lookupToDrop)
  {
    boolean myReturn = DropRescueLookup48(nativeNdx
                                           ,(lookupToDrop == null) ? 0 : lookupToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueModelPropertyGroup(RescueModelPropertyGroup groupToDrop)
  {
    boolean myReturn = DropRescueModelPropertyGroup49(nativeNdx
                                                       ,(groupToDrop == null) ? 0 : groupToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueHistory(RescueHistory historyToDrop)
  {
    boolean myReturn = DropRescueHistory50(nativeNdx
                                            ,(historyToDrop == null) ? 0 : historyToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueGeobody(RescueGeobody bodyToDrop)
  {
    boolean myReturn = DropRescueGeobody51(nativeNdx
                                            ,(bodyToDrop == null) ? 0 : bodyToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueEventDescr(RescueEventDescr eventDescrToDrop)
  {
    boolean myReturn = DropRescueEventDescr52(nativeNdx
                                               ,(eventDescrToDrop == null) ? 0 : eventDescrToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueFaultIntersection(RescueFaultIntersection intersectionToDrop)
  {
    boolean myReturn = DropRescueFaultIntersection53(nativeNdx
                                                      ,(intersectionToDrop == null) ? 0 : intersectionToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueReservoir(RescueReservoir reservoirToDrop)
  {
    boolean myReturn = DropRescueReservoir54(nativeNdx
                                              ,(reservoirToDrop == null) ? 0 : reservoirToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueWireframe(RescueWireframe wireframeToDrop)
  {
    boolean myReturn = DropRescueWireframe55(nativeNdx
                                              ,(wireframeToDrop == null) ? 0 : wireframeToDrop.nativeNdx);
    return myReturn;
  }


  public RescueUnit UnitNamed(java.lang.String horizonName)
  {
    long returnNdx = UnitNamedU56(nativeNdx
                                   ,horizonName);
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

  public RescueBlock BlockNamed(java.lang.String horizonName)
  {
    long returnNdx = BlockNamedU56(nativeNdx
                                   ,horizonName);
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

  public RescueHorizon HorizonNamed(java.lang.String horizonName)
  {
    long returnNdx = HorizonNamed56(nativeNdx
                                   ,horizonName);
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

  public RescueSection SectionNamed(java.lang.String sectionName)
  {
    long returnNdx = SectionNamed57(nativeNdx
                                   ,sectionName);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobody GeobodyNamed(java.lang.String bodyName)
  {
    long returnNdx = GeobodyNamed58(nativeNdx
                                   ,bodyName);
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

  public RescueUnit UnitIdentifiedBy(long identifier)
  {
    long returnNdx = UnitIdentifiedBy59(nativeNdx
                                       ,identifier);
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

  public RescueBlock BlockIdentifiedBy(long identifier)
  {
    long returnNdx = BlockIdentifiedBy60(nativeNdx
                                        ,identifier);
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

  public RescueHorizon HorizonIdentifiedBy(long identifier)
  {
    long returnNdx = HorizonIdentifiedBy61(nativeNdx
                                          ,identifier);
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

  public RescueWellbore WellboreIdentifiedBy(long identifier)
  {
    long returnNdx = WellboreIdentifiedBy62(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public RescueSection SectionIdentifiedBy(long identifier)
  {
    long returnNdx = SectionIdentifiedBy63(nativeNdx
                                          ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueBlockUnitHorizonSurface HorizonSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = HorizonSurfaceIdentifiedBy64(nativeNdx
                                                 ,identifier);
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

  public RescueBlockUnit BlockUnitIdentifiedBy(long identifier)
  {
    long returnNdx = BlockUnitIdentifiedBy65(nativeNdx
                                            ,identifier);
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

  public RescueReferenceSurface ReferenceSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = ReferenceSurfaceIdentifiedBy66(nativeNdx
                                                   ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReferenceSurface myReturn = new RescueReferenceSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnitHorizonSurface:
        myReturn = new RescueBlockUnitHorizonSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueLookup LookupIdentifiedBy(long identifier)
  {
    long returnNdx = LookupIdentifiedBy67(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLookup myReturn = new RescueLookup(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobody GeobodyIdentifiedBy(long identifier)
  {
    long returnNdx = GeobodyIdentifiedBy68(nativeNdx
                                          ,identifier);
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

  public RescueSurface SurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = SurfaceIdentifiedBy69(nativeNdx
                                          ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueIJSurface IJSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = IJSurfaceIdentifiedBy70(nativeNdx
                                            ,identifier);
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

  public RescueIJSurface HorizonIJSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = HorizonIJSurfaceIdentifiedBy71(nativeNdx
                                                   ,identifier);
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

  public RescueIJSurface SectionIJSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = SectionIJSurfaceIdentifiedBy72(nativeNdx
                                                   ,identifier);
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

  public RescueTriangulatedSurface TriangulatedSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = TriangulatedSurfaceIdentifiedBy73(nativeNdx
                                                      ,identifier);
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

  public RescueTriangulatedSurface HorizonTriangulatedSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = HorizonTriangulatedSurfaceIdentifiedBy74(nativeNdx
                                                             ,identifier);
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

  public RescueTriangulatedSurface SectionTriangulatedSurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = SectionTriangulatedSurfaceIdentifiedBy75(nativeNdx
                                                             ,identifier);
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

  public RescueGeobodyVolume GeobodyVolumeIdentifiedBy(long identifier)
  {
    long returnNdx = GeobodyVolumeIdentifiedBy76(nativeNdx
                                                ,identifier);
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

  public RescueMacroVolume MacroVolumeIdentifiedBy(long identifier)
  {
    long returnNdx = MacroVolumeIdentifiedBy77(nativeNdx
                                              ,identifier);
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

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(long identifier)
  {
    long returnNdx = BlockUnitSideIdentifiedBy78(nativeNdx
                                                ,identifier);
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

  public RescueGeobodySurface GeobodySurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = GeobodySurfaceIdentifiedBy79(nativeNdx
                                                 ,identifier);
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

  public RescueProperty GlobalPropertyIdentifiedBy(long identifer)
  {
    long returnNdx = GlobalPropertyIdentifiedBy80(nativeNdx
                                                 ,identifer);
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

  public RescueWireframe WireframeIdentifiedBy(long identifier)
  {
    long returnNdx = WireframeIdentifiedBy81(nativeNdx
                                            ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public RescueHistory HistoryIdentifiedBy(long identifier)
  {
    long returnNdx = HistoryIdentifiedBy82(nativeNdx
                                          ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy83(nativeNdx
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

  public RescueCoordinateSystem CoordinateSystemIdentifiedBy(long identifier)
  {
    long returnNdx = CoordinateSystemIdentifiedBy84(nativeNdx
                                                   ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystem myReturn = new RescueCoordinateSystem(returnNdx);
      return myReturn;
    }
  }

  public RescueEventDescr EventDescrIdentifiedBy(long identifier)
  {
    long returnNdx = EventDescrIdentifiedBy85(nativeNdx
                                             ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEventDescr myReturn = new RescueEventDescr(returnNdx);
      return myReturn;
    }
  }

  public RescueFaultIntersection FaultIntersectionIdentifiedBy(long identifier)
  {
    long returnNdx = FaultIntersectionIdentifiedBy86(nativeNdx
                                                    ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueFaultIntersection myReturn = new RescueFaultIntersection(returnNdx);
      return myReturn;
    }
  }

  public RescueReservoir ReservoirIdentifiedBy(long identifier)
  {
    long returnNdx = ReservoirIdentifiedBy87(nativeNdx
                                            ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReservoir myReturn = new RescueReservoir(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimVertex TrimVertexLocatedBy(float x,
                                                float y,
                                                float z)
  {
    long returnNdx = TrimVertexLocatedBy88(nativeNdx
                                          ,x
                                          ,y
                                          ,z);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimVertex myReturn = new RescueTrimVertex(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLine PolyLineBetween(RescueTrimVertex end1,
                                          RescueTrimVertex end2)
  {
    long returnNdx = PolyLineBetween89(nativeNdx
                                      ,(end1 == null) ? 0 : end1.nativeNdx
                                      ,(end2 == null) ? 0 : end2.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLine myReturn = new RescuePolyLine(returnNdx);
      return myReturn;
    }
  }

  public RescueLookup LookupNamed(java.lang.String name)
  {
    long returnNdx = LookupNamed90(nativeNdx
                                  ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLookup myReturn = new RescueLookup(returnNdx);
      return myReturn;
    }
  }

  public RescueModelPropertyGroup PropertyGroupNamed(java.lang.String name)
  {
    long returnNdx = PropertyGroupNamed91(nativeNdx
                                         ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModelPropertyGroup myReturn = new RescueModelPropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescueLogicalOrder LogicalOrder()
  {
    long returnNdx = LogicalOrder92(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLogicalOrder myReturn = new RescueLogicalOrder(returnNdx);
      return myReturn;
    }
  }

  public RescueColorTableList ColorTableList()
  {
    long returnNdx = ColorTableList93(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueColorTableList myReturn = new RescueColorTableList(returnNdx);
      return myReturn;
    }
  }

  public float Rotation()
  {
    float myReturn = Rotation94(nativeNdx);
    return myReturn;
  }

  public void SetRotation(float rotationIn)
  {
    SetRotation95(nativeNdx
                ,rotationIn);
  }

  public boolean IsWireframeLoaded()
  {
    boolean myReturn = IsWireframeLoaded96(nativeNdx);
    return myReturn;
  }

  public boolean LoadWireframe()
  {
    boolean myReturn = LoadWireframe97(nativeNdx);
    return myReturn;
  }

  public boolean UnloadWireframe()
  {
    boolean myReturn = UnloadWireframe98(nativeNdx);
    return myReturn;
  }

  public boolean WireframeHasChanged()
  {
    boolean myReturn = WireframeHasChanged99(nativeNdx);
    return myReturn;
  }

  public void MarkWireframeChanged()
  {
    MarkWireframeChanged100(nativeNdx);
  }

  public boolean WireframeFileTruncated()
  {
    boolean myReturn = WireframeFileTruncated101(nativeNdx);
    return myReturn;
  }

  public RescueCoordinateSystem CoordinateSystem()
  {
    long returnNdx = CoordinateSystem102(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystem myReturn = new RescueCoordinateSystem(returnNdx);
      return myReturn;
    }
  }

  public void SetCoordinateSystem(RescueCoordinateSystem newCoordinateSystem)
  {
    SetCoordinateSystem103(nativeNdx
                        ,(newCoordinateSystem == null) ? 0 : newCoordinateSystem.nativeNdx);
  }

  public cNameValuePair NameValuePairs()
  {
    long returnNdx = NameValuePairs104(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cNameValuePair myReturn = new cNameValuePair(returnNdx);
      return myReturn;
    }
  }

  public long Version(boolean reload)
  {
    long myReturn = Version105(nativeNdx
                           ,reload);
    return myReturn;
  }

  public int Version(boolean reload, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Version(reload), throwIfTooBig);
  }

  public long WireframeVersion(boolean reload)
  {
    long myReturn = WireframeVersion106(nativeNdx
                                    ,reload);
    return myReturn;
  }

  public int WireframeVersion(boolean reload, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WireframeVersion(reload), throwIfTooBig);
  }

  public RescueGeometry GridGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = GridGeometry107(nativeNdx
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

  public RescueGeometry GridGeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GridGeometryIdentifiedBy108(nativeNdx
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
    long myReturn = GeometryCount109(nativeNdx);
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

  public int GeometryCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(GeometryCount64(), throwIfTooBig);
  }

  public void AddGeometry(RescueGeometry newGeometry)
  {
    AddGeometry110(nativeNdx
                ,(newGeometry == null) ? 0 : newGeometry.nativeNdx);
  }

  public void DropGeometry(RescueGeometry toDrop)
  {
    DropGeometry111(nativeNdx
                 ,(toDrop == null) ? 0 : toDrop.nativeNdx);
  }

  public RescueProperty PropertyIdentifiedBy(long id)
  {
    long returnNdx = PropertyIdentifiedBy112(nativeNdx
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

  public long RescuePropertyGroupCount64()
  {
    long myReturn = RescuePropertyGroupCount113(nativeNdx);
    return myReturn;
  }

  public int RescuePropertyGroupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescuePropertyGroupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescuePropertyGroupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescuePropertyGroupCount64(), throwIfTooBig);
  }

  public RescuePropertyGroup NthRescuePropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescuePropertyGroup114(nativeNdx
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

  public RescuePropertyGroup PropertyGroupIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyGroupIdentifiedBy115(nativeNdx
                                                ,identifier);
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

  public boolean DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    boolean myReturn = DropRescuePropertyGroup116(nativeNdx
                                                  ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public RescueContext Context()
  {
    long returnNdx = Context117(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueContext myReturn = new RescueContext(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType118(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers119(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueDataContainer DemandDataContainers()
  {
    long returnNdx = DemandDataContainers120(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public void SetIJKPreference(int preferredOrientation)
  {
    SetIJKPreference128(nativeNdx, preferredOrientation);
  }

  public java.lang.String IJKPreference()
  {
    return IJKPreference129(nativeNdx);
  }

  public int IJKPreferenceEnum()
  {
    return IJKPreferenceEnum130(nativeNdx);
  }

  public void SetWriter(java.lang.String vendorName, java.lang.String vendorVersion, 
					    java.lang.String modelDate, java.lang.String userName)
  {
    SetWriter121(nativeNdx, vendorName, vendorVersion, modelDate, userName);
  }

  public java.lang.String VendorName()
  {
    return VendorName122(nativeNdx);
  }

  public java.lang.String VendorVersion()
  {
    return VendorVersion123(nativeNdx);
  }

  public java.lang.String ModelDate()
  {
    return ModelDate124(nativeNdx);
  }

  public java.lang.String UserName()
  {
    return UserName125(nativeNdx);
  }

  public static int SetOrientation(RescueContext context, 
                                   java.lang.String modelFileName, 
                                   int orientation)
  {
    int myReturn = SetOrientation126((context == null) ? 0 : context.nativeNdx
                                     ,modelFileName, orientation);
    return myReturn;
  }

  public java.lang.String[] UniquePropertyNames()
  {
    return UniquePropertyNames127(nativeNdx);
  }

  public RescueDocumentList Documents()
  {
    long returnNdx = Documents131(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDocumentList myReturn = new RescueDocumentList(returnNdx);
      return myReturn;
    }
  }

  public boolean WriteWITSML(java.lang.String pathName)
  {
    return WriteWITSML132(nativeNdx, pathName);
  }

  public boolean ReadWITSML(java.lang.String pathName, java.lang.Class reporterClass)
  {
    java.lang.String reporterClassName = null;
	if (reporterClass != null)
	{
	  reporterClassName = reporterClass.getName();
	}
    return ReadWITSML133(nativeNdx, pathName, reporterClassName);
  }

  private native void RegisterWireframeCallBack0(long refNdx, java.lang.String className);
  private native boolean AnyFileTruncated1(long refNdx);
  private native void Commit2(long refNdx);
  private native void Rollback3(long refNdx);
  private static native long UnarchiveModel4(
                                      long context
                                      ,java.lang.String pathName);
  private native boolean ArchiveModel5(long refNdx
                                      ,java.lang.String pathName
                                      ,boolean binary
                                      ,int version
									  ,boolean write32);
  private native boolean ArchiveModel6(long refNdx);
  private native boolean ExistingModel7(long refNdx);
  private native long Create_RescueModel8(long context,
                                         java.lang.String modelNameIn);
  private native long Create_RescueModel9(java.lang.String modelNameIn,
                                         long coordinateSystemIn);
  private native void Delete_RescueModel(long ndx);
  private native java.lang.String ModelName11(long refNdx);
  private native long UnitCount12(long refNdx);
  private native long BlockCount13(long refNdx);
  private native long HorizonCount14(long refNdx);
  private native long WellboreCount15(long refNdx);
  private native long SectionCount16(long refNdx);
  private native long PropertyGroupCount17(long refNdx);
  private native long HistoryCount18(long refNdx);
  private native long GeobodyCount19(long refNdx);
  private native long ReferenceSurfaceCount20(long refNdx);
  private native long LookupCount21(long refNdx);
  private native long EventDescrCount22(long refNdx);
  private native long FaultIntersectionCount23(long refNdx);
  private native long ReservoirCount24(long refNdx);
  private native long WireframeCount25(long refNdx);
  private native long MakeUnconformity26(long refNdx
                                         ,java.lang.String name);
  private native long MakeDiapir27(long refNdx
                                   ,java.lang.String name);
  private native long NthRescueUnit28(long refNdx
                                      ,long zeroBasedOrdinal);
  private native long NthRescueBlock29(long refNdx
                                       ,long zeroBasedOrdinal);
  private native long NthRescueHorizon30(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long NthRescueWellbore31(long refNdx
                                          ,long zeroBasedOrdinal);
  private native long NthRescueSection32(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long NthRescueReferenceSurface33(long refNdx
                                                  ,long zeroBasedOrdinal);
  private native long NthRescueModelPropertyGroup34(long refNdx
                                                    ,long zeroBasedOrdinal);
  private native long NthRescueHistory35(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long NthRescueGeobody36(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long NthRescueLookup37(long refNdx
                                        ,long zeroBasedOrdinal);
  private native long NthRescueEventDescr38(long refNdx
                                            ,long zeroBasedOrdinal);
  private native long NthRescueFaultIntersection39(long refNdx
                                                   ,long zeroBasedOrdinal);
  private native long NthRescueReservoir40(long refNdx
                                           ,long zeroBasedOrdinal);
  private native long NthRescueWireframe41(long refNdx
                                           ,long zeroBasedOrdinal);
  private native boolean DropRescueUnit42(long refNdx
                                         ,long unitToDrop);
  private native boolean DropRescueBlock43(long refNdx
                                          ,long blockToDrop);
  private native boolean DropRescueHorizon44(long refNdx
                                            ,long horizonToDrop);
  private native boolean DropRescueWellbore45(long refNdx
                                             ,long wellboreToDrop);
  private native boolean DropRescueSection46(long refNdx
                                            ,long sectionToDrop);
  private native boolean DropRescueReferenceSurface47(long refNdx
                                                     ,long surfaceToDrop);
  private native boolean DropRescueLookup48(long refNdx
                                           ,long lookupToDrop);
  private native boolean DropRescueModelPropertyGroup49(long refNdx
                                                       ,long groupToDrop);
  private native boolean DropRescueHistory50(long refNdx
                                            ,long historyToDrop);
  private native boolean DropRescueGeobody51(long refNdx
                                            ,long bodyToDrop);
  private native boolean DropRescueEventDescr52(long refNdx
                                               ,long eventDescrToDrop);
  private native boolean DropRescueFaultIntersection53(long refNdx
                                                      ,long intersectionToDrop);
  private native boolean DropRescueReservoir54(long refNdx
                                              ,long reservoirToDrop);
  private native boolean DropRescueWireframe55(long refNdx
                                              ,long wireframeToDrop);
  private native long BlockNamedU56(long refNdx
                                     ,java.lang.String blockName);
  private native long UnitNamedU56(long refNdx
                                     ,java.lang.String unitName);
  private native long HorizonNamed56(long refNdx
                                     ,java.lang.String horizonName);
  private native long SectionNamed57(long refNdx
                                     ,java.lang.String sectionName);
  private native long GeobodyNamed58(long refNdx
                                     ,java.lang.String bodyName);
  private native long UnitIdentifiedBy59(long refNdx
                                         ,long identifier);
  private native long BlockIdentifiedBy60(long refNdx
                                          ,long identifier);
  private native long HorizonIdentifiedBy61(long refNdx
                                            ,long identifier);
  private native long WellboreIdentifiedBy62(long refNdx
                                             ,long identifier);
  private native long SectionIdentifiedBy63(long refNdx
                                            ,long identifier);
  private native long HorizonSurfaceIdentifiedBy64(long refNdx
                                                   ,long identifier);
  private native long BlockUnitIdentifiedBy65(long refNdx
                                              ,long identifier);
  private native long ReferenceSurfaceIdentifiedBy66(long refNdx
                                                     ,long identifier);
  private native long LookupIdentifiedBy67(long refNdx
                                           ,long identifier);
  private native long GeobodyIdentifiedBy68(long refNdx
                                            ,long identifier);
  private native long SurfaceIdentifiedBy69(long refNdx
                                            ,long identifier);
  private native long IJSurfaceIdentifiedBy70(long refNdx
                                              ,long identifier);
  private native long HorizonIJSurfaceIdentifiedBy71(long refNdx
                                                     ,long identifier);
  private native long SectionIJSurfaceIdentifiedBy72(long refNdx
                                                     ,long identifier);
  private native long TriangulatedSurfaceIdentifiedBy73(long refNdx
                                                        ,long identifier);
  private native long HorizonTriangulatedSurfaceIdentifiedBy74(long refNdx
                                                               ,long identifier);
  private native long SectionTriangulatedSurfaceIdentifiedBy75(long refNdx
                                                               ,long identifier);
  private native long GeobodyVolumeIdentifiedBy76(long refNdx
                                                  ,long identifier);
  private native long MacroVolumeIdentifiedBy77(long refNdx
                                                ,long identifier);
  private native long BlockUnitSideIdentifiedBy78(long refNdx
                                                  ,long identifier);
  private native long GeobodySurfaceIdentifiedBy79(long refNdx
                                                   ,long identifier);
  private native long GlobalPropertyIdentifiedBy80(long refNdx
                                                   ,long identifer);
  private native long WireframeIdentifiedBy81(long refNdx
                                              ,long identifier);
  private native long HistoryIdentifiedBy82(long refNdx
                                            ,long identifier);
  private native long GeometryIdentifiedBy83(long refNdx
                                             ,long identifier);
  private native long CoordinateSystemIdentifiedBy84(long refNdx
                                                     ,long identifier);
  private native long EventDescrIdentifiedBy85(long refNdx
                                               ,long identifier);
  private native long FaultIntersectionIdentifiedBy86(long refNdx
                                                      ,long identifier);
  private native long ReservoirIdentifiedBy87(long refNdx
                                              ,long identifier);
  private native long TrimVertexLocatedBy88(long refNdx
                                            ,float x
                                            ,float y
                                            ,float z);
  private native long PolyLineBetween89(long refNdx
                                        ,long end1
                                        ,long end2);
  private native long LookupNamed90(long refNdx
                                    ,java.lang.String name);
  private native long PropertyGroupNamed91(long refNdx
                                           ,java.lang.String name);
  private native long LogicalOrder92(long refNdx);
  private native long ColorTableList93(long refNdx);
  private native float Rotation94(long refNdx);
  private native void SetRotation95(long refNdx
                                   ,float rotationIn);
  private native boolean IsWireframeLoaded96(long refNdx);
  private native boolean LoadWireframe97(long refNdx);
  private native boolean UnloadWireframe98(long refNdx);
  private native boolean WireframeHasChanged99(long refNdx);
  private native void MarkWireframeChanged100(long refNdx);
  private native boolean WireframeFileTruncated101(long refNdx);
  private native long CoordinateSystem102(long refNdx);
  private native void SetCoordinateSystem103(long refNdx
                                           ,long newCoordinateSystem);
  private native long NameValuePairs104(long refNdx);
  private native long Version105(long refNdx
                              ,boolean reload);
  private native long WireframeVersion106(long refNdx
                                       ,boolean reload);
  private native long GridGeometry107(long refNdx
                                     ,long zeroBasedOrdinal);
  private native long GridGeometryIdentifiedBy108(long refNdx
                                                 ,long identifier);
  private native long GeometryCount109(long refNdx);
  private native void AddGeometry110(long refNdx
                                   ,long newGeometry);
  private native void DropGeometry111(long refNdx
                                    ,long toDrop);
  private native long PropertyIdentifiedBy112(long refNdx
                                             ,long id);
  private native long RescuePropertyGroupCount113(long refNdx);
  private native long NthRescuePropertyGroup114(long refNdx
                                               ,long zeroBasedOrdinal);
  private native long PropertyGroupIdentifiedBy115(long refNdx
                                                  ,long identifier);
  private native boolean DropRescuePropertyGroup116(long refNdx
                                                  ,long unitToDrop);
  private native long Context117(long refNdx);
  private native boolean IsOfType118(long refNdx
                                   ,int thisType);
  private native long DataContainers119(long refNdx);
  private native long DemandDataContainers120(long refNdx);
  private native void SetWriter121(long refNdx,
                                   java.lang.String vendorName, java.lang.String vendorVersion, 
					               java.lang.String modelDate, java.lang.String userName);
  private native java.lang.String VendorName122(long refNdx);
  private native java.lang.String VendorVersion123(long refNdx);
  private native java.lang.String ModelDate124(long refNdx);
  private native java.lang.String UserName125(long refNdx);
  private static native int SetOrientation126(long context
                                             ,java.lang.String pathName
                                             ,int orientation);
  private native java.lang.String[] UniquePropertyNames127(long refNdx);
  private native void SetIJKPreference128(long refNdx, int orientation);
  private native java.lang.String IJKPreference129(long refNdx);
  private native int IJKPreferenceEnum130(long refNdx);
  private native long Documents131(long refNdx);
  private native boolean WriteWITSML132(long refNdx, java.lang.String pathName);
  private native boolean ReadWITSML133(long refNdx, java.lang.String pathName, java.lang.String reporterClassName);
}
