using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueModel : RescueHistoryObject
{
  public RescueModel(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void RegisterWireframeCallBack(java.lang.Class callBackClass)
  {
    RegisterWireframeCallBack0(nativeNdx, callBackClass.getName());
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated1(nativeNdx);
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
                                      string pathName)
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

  public bool ArchiveModel(string pathName,
                                 bool binary,
                                 int version,
								 bool write32)
  {
    bool myReturn = ArchiveModel5(nativeNdx
                                       ,pathName
                                       ,binary
                                       ,version
									   ,write32);
    return myReturn;
  }

  public bool ArchiveModel()
  {
    bool myReturn = ArchiveModel6(nativeNdx);
    return myReturn;
  }

  public bool ExistingModel()
  {
    bool myReturn = ExistingModel7(nativeNdx);
    return myReturn;
  }

  public RescueModel(RescueContext context,
                     string modelNameIn)
  {
    nativeNdx = Create_RescueModel8((context == null) ? 0 : context.nativeNdx,
                                    modelNameIn);
  }

  public RescueModel(string modelNameIn,
                     RescueCoordinateSystem coordinateSystemIn)
  {
    nativeNdx = Create_RescueModel9(modelNameIn,
                                    (coordinateSystemIn == null) ? 0 : coordinateSystemIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueModel(nativeNdx);
  }

  public string ModelName()
  {
    string myReturn = ModelName11(nativeNdx);
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

  public int UnitCount(bool throwIfTooBig) //thro RuntimeException
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

  public int BlockCount(bool throwIfTooBig) //thro RuntimeException
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

  public int HorizonCount(bool throwIfTooBig) //thro RuntimeException
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

  public int WellboreCount(bool throwIfTooBig) //thro RuntimeException
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

  public int SectionCount(bool throwIfTooBig) //thro RuntimeException
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

  public int PropertyGroupCount(bool throwIfTooBig) //thro RuntimeException
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

  public int HistoryCount(bool throwIfTooBig) //thro RuntimeException
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

  public int GeobodyCount(bool throwIfTooBig) //thro RuntimeException
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

  public int ReferenceSurfaceCount(bool throwIfTooBig) //thro RuntimeException
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

  public int LookupCount(bool throwIfTooBig) //thro RuntimeException
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

  public int EventDescrCount(bool throwIfTooBig) //thro RuntimeException
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

  public int FaultIntersectionCount(bool throwIfTooBig) //thro RuntimeException
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

  public int ReservoirCount(bool throwIfTooBig) //thro RuntimeException
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

  public int WireframeCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(WireframeCount64(), throwIfTooBig);
  }

  public RescueEventDescr MakeUnconformity(string name)
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

  public RescueEventDescr MakeDiapir(string name)
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

  public bool DropRescueUnit(RescueUnit unitToDrop)
  {
    bool myReturn = DropRescueUnit42(nativeNdx
                                         ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueBlock(RescueBlock blockToDrop)
  {
    bool myReturn = DropRescueBlock43(nativeNdx
                                          ,(blockToDrop == null) ? 0 : blockToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueHorizon(RescueHorizon horizonToDrop)
  {
    bool myReturn = DropRescueHorizon44(nativeNdx
                                            ,(horizonToDrop == null) ? 0 : horizonToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueWellbore(RescueWellbore wellboreToDrop)
  {
    bool myReturn = DropRescueWellbore45(nativeNdx
                                             ,(wellboreToDrop == null) ? 0 : wellboreToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueSection(RescueSection sectionToDrop)
  {
    bool myReturn = DropRescueSection46(nativeNdx
                                            ,(sectionToDrop == null) ? 0 : sectionToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueReferenceSurface(RescueReferenceSurface surfaceToDrop)
  {
    bool myReturn = DropRescueReferenceSurface47(nativeNdx
                                                     ,(surfaceToDrop == null) ? 0 : surfaceToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueLookup(RescueLookup lookupToDrop)
  {
    bool myReturn = DropRescueLookup48(nativeNdx
                                           ,(lookupToDrop == null) ? 0 : lookupToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueModelPropertyGroup(RescueModelPropertyGroup groupToDrop)
  {
    bool myReturn = DropRescueModelPropertyGroup49(nativeNdx
                                                       ,(groupToDrop == null) ? 0 : groupToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueHistory(RescueHistory historyToDrop)
  {
    bool myReturn = DropRescueHistory50(nativeNdx
                                            ,(historyToDrop == null) ? 0 : historyToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueGeobody(RescueGeobody bodyToDrop)
  {
    bool myReturn = DropRescueGeobody51(nativeNdx
                                            ,(bodyToDrop == null) ? 0 : bodyToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueEventDescr(RescueEventDescr eventDescrToDrop)
  {
    bool myReturn = DropRescueEventDescr52(nativeNdx
                                               ,(eventDescrToDrop == null) ? 0 : eventDescrToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueFaultIntersection(RescueFaultIntersection intersectionToDrop)
  {
    bool myReturn = DropRescueFaultIntersection53(nativeNdx
                                                      ,(intersectionToDrop == null) ? 0 : intersectionToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueReservoir(RescueReservoir reservoirToDrop)
  {
    bool myReturn = DropRescueReservoir54(nativeNdx
                                              ,(reservoirToDrop == null) ? 0 : reservoirToDrop.nativeNdx);
    return myReturn;
  }

  public bool DropRescueWireframe(RescueWireframe wireframeToDrop)
  {
    bool myReturn = DropRescueWireframe55(nativeNdx
                                              ,(wireframeToDrop == null) ? 0 : wireframeToDrop.nativeNdx);
    return myReturn;
  }


  public RescueUnit UnitNamed(string horizonName)
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

  public RescueBlock BlockNamed(string horizonName)
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

  public RescueHorizon HorizonNamed(string horizonName)
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

  public RescueSection SectionNamed(string sectionName)
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

  public RescueGeobody GeobodyNamed(string bodyName)
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

  public RescueLookup LookupNamed(string name)
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

  public RescueModelPropertyGroup PropertyGroupNamed(string name)
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

  public bool IsWireframeLoaded()
  {
    bool myReturn = IsWireframeLoaded96(nativeNdx);
    return myReturn;
  }

  public bool LoadWireframe()
  {
    bool myReturn = LoadWireframe97(nativeNdx);
    return myReturn;
  }

  public bool UnloadWireframe()
  {
    bool myReturn = UnloadWireframe98(nativeNdx);
    return myReturn;
  }

  public bool WireframeHasChanged()
  {
    bool myReturn = WireframeHasChanged99(nativeNdx);
    return myReturn;
  }

  public void MarkWireframeChanged()
  {
    MarkWireframeChanged100(nativeNdx);
  }

  public bool WireframeFileTruncated()
  {
    bool myReturn = WireframeFileTruncated101(nativeNdx);
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

  public long Version(bool reload)
  {
    long myReturn = Version105(nativeNdx
                           ,reload);
    return myReturn;
  }

  public int Version(bool reload, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Version(reload), throwIfTooBig);
  }

  public long WireframeVersion(bool reload)
  {
    long myReturn = WireframeVersion106(nativeNdx
                                    ,reload);
    return myReturn;
  }

  public int WireframeVersion(bool reload, bool throwIfTooBig) //thro RuntimeException
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

  public int GeometryCount(bool throwIfTooBig) //thro RuntimeException
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

  public int RescuePropertyGroupCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    bool myReturn = DropRescuePropertyGroup116(nativeNdx
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType118(nativeNdx
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

  public string IJKPreference()
  {
    return IJKPreference129(nativeNdx);
  }

  public int IJKPreferenceEnum()
  {
    return IJKPreferenceEnum130(nativeNdx);
  }

  public void SetWriter(string vendorName, string vendorVersion, 
					    string modelDate, string userName)
  {
    SetWriter121(nativeNdx, vendorName, vendorVersion, modelDate, userName);
  }

  public string VendorName()
  {
    return VendorName122(nativeNdx);
  }

  public string VendorVersion()
  {
    return VendorVersion123(nativeNdx);
  }

  public string ModelDate()
  {
    return ModelDate124(nativeNdx);
  }

  public string UserName()
  {
    return UserName125(nativeNdx);
  }

  public static int SetOrientation(RescueContext context, 
                                   string modelFileName, 
                                   int orientation)
  {
    int myReturn = SetOrientation126((context == null) ? 0 : context.nativeNdx
                                     ,modelFileName, orientation);
    return myReturn;
  }

  public string[] UniquePropertyNames()
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

  public bool WriteWITSML(string pathName)
  {
    return WriteWITSML132(nativeNdx, pathName);
  }

  public bool ReadWITSML(string pathName, java.lang.Class reporterClass)
  {
    string reporterClassName = null;
	if (reporterClass != null)
	{
	  reporterClassName = reporterClass.getName();
	}
    return ReadWITSML133(nativeNdx, pathName, reporterClassName);
  }

}

}