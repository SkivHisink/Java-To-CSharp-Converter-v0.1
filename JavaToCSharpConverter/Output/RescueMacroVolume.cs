using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueMacroVolume : RescueHistoryObject
{


  protected RescueMacroVolume(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockUnit ParentBlockUnit()
  {
    long returnNdx = ParentBlockUnit0(nativeNdx);
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

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel1(nativeNdx);
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

  public void AddBlockUnitSide(RescueBlockUnitSide existingSide)
  {
    AddBlockUnitSide2(nativeNdx
                     ,(existingSide == null) ? 0 : existingSide.nativeNdx);
  }

  public void DropBlockUnitSide(RescueBlockUnitSide existingSide)
  {
    DropBlockUnitSide3(nativeNdx
                      ,(existingSide == null) ? 0 : existingSide.nativeNdx);
  }

  public RescueBlockUnitSide NthBlockUnitSide(long zeroBasedOrdinal)
  {
    long returnNdx = NthBlockUnitSide4(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public RescueBlockUnitSide BlockUnitSideIdentifiedBy(long id)
  {
    long returnNdx = BlockUnitSideIdentifiedBy5(nativeNdx
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

  public void AddInteriorSection(RescueSection existingSection)
  {
    AddInteriorSection6(nativeNdx
                       ,(existingSection == null) ? 0 : existingSection.nativeNdx);
  }

  public void DropInteriorSection(RescueSection existingSection)
  {
    DropInteriorSection7(nativeNdx
                        ,(existingSection == null) ? 0 : existingSection.nativeNdx);
  }

  public RescueSection NthInteriorSection(long zeroBasedOrdinal)
  {
    long returnNdx = NthInteriorSection8(nativeNdx
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

  public void AddKLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    AddKLayerEdge9(nativeNdx
                  ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
  }

  public bool DeleteKLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    bool myReturn = DeleteKLayerEdge10(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public bool DeleteKLayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    bool myReturn = DeleteKLayerEdge11(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSetStub NthKLayerEdge(long zeroBasedOrdinal)
  {
    long returnNdx = NthKLayerEdge12(nativeNdx
                                    ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public void AddILayerEdge(RescueEdgeSet existingEdgeSet)
  {
    AddILayerEdge13(nativeNdx
                  ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
  }

  public bool DeleteILayerEdge(RescueEdgeSet existingEdgeSet)
  {
    bool myReturn = DeleteILayerEdge14(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public bool DeleteILayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    bool myReturn = DeleteILayerEdge15(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSetStub NthILayerEdge(long zeroBasedOrdinal)
  {
    long returnNdx = NthILayerEdge16(nativeNdx
                                    ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public void AddJLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    AddJLayerEdge17(nativeNdx
                  ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
  }

  public bool DeleteJLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    bool myReturn = DeleteJLayerEdge18(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public bool DeleteJLayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    bool myReturn = DeleteJLayerEdge19(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSetStub NthJLayerEdge(long zeroBasedOrdinal)
  {
    long returnNdx = NthJLayerEdge20(nativeNdx
                                    ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public void SetTopEdge(RescueEdgeSet topEdge)
  {
    SetTopEdge21(nativeNdx
               ,(topEdge == null) ? 0 : topEdge.nativeNdx);
  }

  public void SetBottomEdge(RescueEdgeSet bottomEdge)
  {
    SetBottomEdge22(nativeNdx
                  ,(bottomEdge == null) ? 0 : bottomEdge.nativeNdx);
  }

  public RescueEdgeSetStub TopEdgesObj()
  {
    long returnNdx = TopEdgesObj23(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSetStub BottomEdgesObj()
  {
    long returnNdx = BottomEdgesObj24(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet TopEdges()
  {
    long returnNdx = TopEdges25(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet BottomEdges()
  {
    long returnNdx = BottomEdges26(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public long CountOfSides64()
  {
    long myReturn = CountOfSides27(nativeNdx);
    return myReturn;
  }

  public int CountOfSides()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfSides64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfSides(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfSides64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RescueMacroVolume(nativeNdx);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType29(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}