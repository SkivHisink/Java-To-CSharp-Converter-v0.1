package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueEdgeSet.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueEdgeSet extends RescueObject
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

  public int CountOfBoundaryLoop(boolean throwIfTooBig) throws RuntimeException
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

  public int CountOfInteriorLoop(boolean throwIfTooBig) throws RuntimeException
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueEdgeSet0(long ownerIn);
  private native void Delete_RescueEdgeSet(long ndx);
  private native void AddBoundaryLoop2(long refNdx
                                      ,long existingLoop);
  private native void DropBoundaryLoop3(long refNdx
                                       ,long existingLoop);
  private native long NthBoundaryLoop4(long refNdx
                                       ,long zeroBasedOrdinal);
  private native void AddInteriorLoop5(long refNdx
                                      ,long existingLoop);
  private native void DropInteriorLoop6(long refNdx
                                       ,long existingLoop);
  private native long NthInteriorLoop7(long refNdx
                                       ,long zeroBasedOrdinal);
  private native long TrimLoopIdentifiedBy8(long refNdx
                                            ,long identifier);
  private native long RescueBusinessOwner9(long refNdx
                                           ,long model);
  private native long CountOfBoundaryLoop10(long refNdx);
  private native long CountOfInteriorLoop11(long refNdx);
  private native long Owner12(long refNdx);
  private native boolean IsOfType13(long refNdx
                                   ,int thisType);
}
