package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueMacroVolume.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueMacroVolume extends RescueHistoryObject
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

  public boolean DeleteKLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    boolean myReturn = DeleteKLayerEdge10(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public boolean DeleteKLayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    boolean myReturn = DeleteKLayerEdge11(nativeNdx
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

  public boolean DeleteILayerEdge(RescueEdgeSet existingEdgeSet)
  {
    boolean myReturn = DeleteILayerEdge14(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public boolean DeleteILayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    boolean myReturn = DeleteILayerEdge15(nativeNdx
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

  public boolean DeleteJLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    boolean myReturn = DeleteJLayerEdge18(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public boolean DeleteJLayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    boolean myReturn = DeleteJLayerEdge19(nativeNdx
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

  public int CountOfSides(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CountOfSides64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RescueMacroVolume(nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType29(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long ParentBlockUnit0(long refNdx);
  private native long ParentModel1(long refNdx);
  private native void AddBlockUnitSide2(long refNdx
                                       ,long existingSide);
  private native void DropBlockUnitSide3(long refNdx
                                        ,long existingSide);
  private native long NthBlockUnitSide4(long refNdx
                                        ,long zeroBasedOrdinal);
  private native long BlockUnitSideIdentifiedBy5(long refNdx
                                                 ,long id);
  private native void AddInteriorSection6(long refNdx
                                         ,long existingSection);
  private native void DropInteriorSection7(long refNdx
                                          ,long existingSection);
  private native long NthInteriorSection8(long refNdx
                                          ,long zeroBasedOrdinal);
  private native void AddKLayerEdge9(long refNdx
                                    ,long existingEdgeSet);
  private native boolean DeleteKLayerEdge10(long refNdx
                                           ,long existingEdgeSet);
  private native boolean DeleteKLayerEdge11(long refNdx
                                           ,long existingEdgeSet);
  private native long NthKLayerEdge12(long refNdx
                                      ,long zeroBasedOrdinal);
  private native void AddILayerEdge13(long refNdx
                                     ,long existingEdgeSet);
  private native boolean DeleteILayerEdge14(long refNdx
                                           ,long existingEdgeSet);
  private native boolean DeleteILayerEdge15(long refNdx
                                           ,long existingEdgeSet);
  private native long NthILayerEdge16(long refNdx
                                      ,long zeroBasedOrdinal);
  private native void AddJLayerEdge17(long refNdx
                                     ,long existingEdgeSet);
  private native boolean DeleteJLayerEdge18(long refNdx
                                           ,long existingEdgeSet);
  private native boolean DeleteJLayerEdge19(long refNdx
                                           ,long existingEdgeSet);
  private native long NthJLayerEdge20(long refNdx
                                      ,long zeroBasedOrdinal);
  private native void SetTopEdge21(long refNdx
                                  ,long topEdge);
  private native void SetBottomEdge22(long refNdx
                                     ,long bottomEdge);
  private native long TopEdgesObj23(long refNdx);
  private native long BottomEdgesObj24(long refNdx);
  private native long TopEdges25(long refNdx);
  private native long BottomEdges26(long refNdx);
  private native long CountOfSides27(long refNdx);
  private native void Delete_RescueMacroVolume(long ndx);
  private native boolean IsOfType29(long refNdx
                                   ,int thisType);
}
