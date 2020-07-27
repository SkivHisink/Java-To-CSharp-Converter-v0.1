using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGeobodyVolume : RescueHistoryObject
{


  protected RescueGeobodyVolume(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void AddGeobodySurface(RescueSurface existingSurface,
                                int role)
  {
    AddGeobodySurface0(nativeNdx
                      ,(existingSurface == null) ? 0 : existingSurface.nativeNdx
                      ,role);
  }

  public void DropGeobodySurface(RescueSurface existingSurface)
  {
    DropGeobodySurface1(nativeNdx
                       ,(existingSurface == null) ? 0 : existingSurface.nativeNdx);
  }

  public void DropGeobodySurface(RescueGeobodySurface existingSurface)
  {
    DropGeobodySurface2(nativeNdx
                       ,(existingSurface == null) ? 0 : existingSurface.nativeNdx);
  }

  public long SurfaceCount64()
  {
    long myReturn = SurfaceCount3(nativeNdx);
    return myReturn;
  }

  public int SurfaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SurfaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SurfaceCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(SurfaceCount64(), throwIfTooBig);
  }

  public RescueGeobodySurface NthGeobodySurface(long zeroBasedOrdinal)
  {
    long returnNdx = NthGeobodySurface4(nativeNdx
                                        ,zeroBasedOrdinal);
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

  public RescueGeobodySurface GeobodySurfaceIdentifiedBy(long id)
  {
    long returnNdx = GeobodySurfaceIdentifiedBy5(nativeNdx
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

  public RescueGeobodyPart ParentPart()
  {
    long returnNdx = ParentPart6(nativeNdx);
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

  public void AddKLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    AddKLayerEdge7(nativeNdx
                  ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
  }

  public bool DeleteKLayerEdge(RescueEdgeSet existingEdgeSet)
  {
    bool myReturn = DeleteKLayerEdge8(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public bool DeleteKLayerEdge(RescueEdgeSetStub existingEdgeSet)
  {
    bool myReturn = DeleteKLayerEdge9(nativeNdx
                                           ,(existingEdgeSet == null) ? 0 : existingEdgeSet.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSetStub NthKLayerEdge(long zeroBasedOrdinal)
  {
    long returnNdx = NthKLayerEdge10(nativeNdx
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

  public long KLayerEdgeCount64()
  {
    long myReturn = KLayerEdgeCount11(nativeNdx);
    return myReturn;
  }

  public int KLayerEdgeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(KLayerEdgeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int KLayerEdgeCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(KLayerEdgeCount64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RescueGeobodyVolume(nativeNdx);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}