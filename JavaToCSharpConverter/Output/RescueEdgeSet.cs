using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueEdgeSet : RescueObject
{


  protected RescueEdgeSet(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueEdgeSet(RescueWireframeOwner ownerIn)
  {
    nativeNdx = Create_RescueEdgeSet0((ownerIn == null) ? 0 : ownerIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueEdgeSet(nativeNdx);
  }

  public void AddBoundaryLoop(RescueTrimLoop existingLoop)
  {
    AddBoundaryLoop2(nativeNdx
                    ,(existingLoop == null) ? 0 : existingLoop.nativeNdx);
  }

  public void DropBoundaryLoop(RescueTrimLoop existingLoop)
  {
    DropBoundaryLoop3(nativeNdx
                     ,(existingLoop == null) ? 0 : existingLoop.nativeNdx);
  }

  public RescueTrimLoop NthBoundaryLoop(long zeroBasedOrdinal)
  {
    long returnNdx = NthBoundaryLoop4(nativeNdx
                                      ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoop NthBoundaryLoop(int zeroBasedOrdinal)
  {
    long returnNdx = NthBoundaryLoop4(nativeNdx
                                      ,(long) zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public void AddInteriorLoop(RescueTrimLoop existingLoop)
  {
    AddInteriorLoop5(nativeNdx
                    ,(existingLoop == null) ? 0 : existingLoop.nativeNdx);
  }

  public void DropInteriorLoop(RescueTrimLoop existingLoop)
  {
    DropInteriorLoop6(nativeNdx
                     ,(existingLoop == null) ? 0 : existingLoop.nativeNdx);
  }

  public RescueTrimLoop NthInteriorLoop(long zeroBasedOrdinal)
  {
    long returnNdx = NthInteriorLoop7(nativeNdx
                                      ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoop NthInteriorLoop(int zeroBasedOrdinal)
  {
    long returnNdx = NthInteriorLoop7(nativeNdx
                                      ,(long) zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoop TrimLoopIdentifiedBy(long identifier)
  {
    long returnNdx = TrimLoopIdentifiedBy8(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoop TrimLoopIdentifiedBy(int identifier)
  {
    long returnNdx = TrimLoopIdentifiedBy8(nativeNdx
                                           ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueObject RescueBusinessOwner(RescueModel model)
  {
    long returnNdx = RescueBusinessOwner9(nativeNdx
                                          ,(model == null) ? 0 : model.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueObject myReturn = new RescueObject(returnNdx);
      return myReturn;
    }
  }

  public long CountOfBoundaryLoop64()
  {
    long myReturn = CountOfBoundaryLoop10(nativeNdx);
    return myReturn;
  }

  public int CountOfBoundaryLoop()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfBoundaryLoop64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfBoundaryLoop(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfBoundaryLoop64(), throwIfTooBig);
  }

  public long CountOfInteriorLoop64()
  {
    long myReturn = CountOfInteriorLoop11(nativeNdx);
    return myReturn;
  }

  public int CountOfInteriorLoop()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfInteriorLoop64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfInteriorLoop(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfInteriorLoop64(), throwIfTooBig);
  }

  public RescueWireframe Owner()
  {
    long returnNdx = Owner12(nativeNdx);
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}