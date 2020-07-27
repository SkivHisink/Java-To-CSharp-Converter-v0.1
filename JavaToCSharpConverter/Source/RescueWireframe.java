package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWireframe.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWireframe extends RescueHistoryObject
{


  protected RescueWireframe(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueWireframe(nativeNdx);
  }

  public long PolyLineCount64()
  {
    long myReturn = PolyLineCount1(nativeNdx);
    return myReturn;
  }

  public int PolyLineCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(PolyLineCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int PolyLineCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(PolyLineCount64(), throwIfTooBig);
  }

  public long VertexCount64()
  {
    long myReturn = VertexCount2(nativeNdx);
    return myReturn;
  }

  public int VertexCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VertexCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VertexCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(VertexCount64(), throwIfTooBig);
  }

  public long EdgeSetCount64()
  {
    long myReturn = EdgeSetCount3(nativeNdx);
    return myReturn;
  }

  public int EdgeSetCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(EdgeSetCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int EdgeSetCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(EdgeSetCount64(), throwIfTooBig);
  }

  public long TrimLoopCount64()
  {
    long myReturn = TrimLoopCount4(nativeNdx);
    return myReturn;
  }

  public int TrimLoopCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TrimLoopCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TrimLoopCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(TrimLoopCount64(), throwIfTooBig);
  }

  public RescueWireframeOwner Owner()
  {
    long returnNdx = Owner5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframeOwner myReturn = new RescueWireframeOwner(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlockUnit:
        myReturn = new RescueBlockUnit(returnNdx);
        break;
      case RescueObject.R_RescueGeobody:
        myReturn = new RescueGeobody(returnNdx);
        break;
      case RescueObject.R_RescueSurface:
        myReturn = new RescueSurface(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public boolean IsWireframeLoaded()
  {
    boolean myReturn = IsWireframeLoaded6(nativeNdx);
    return myReturn;
  }

  public boolean LoadWireframe()
  {
    boolean myReturn = LoadWireframe7(nativeNdx);
    return myReturn;
  }

  public void DeleteWireframe()
  {
    DeleteWireframe8(nativeNdx);
  }

  public boolean IsDeleted()
  {
    boolean myReturn = IsDeleted9(nativeNdx);
    return myReturn;
  }

  public boolean WireframeFileTruncated()
  {
    boolean myReturn = WireframeFileTruncated10(nativeNdx);
    return myReturn;
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel11(nativeNdx);
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

  public long WireframeVersion64(boolean reload)
  {
    long myReturn = WireframeVersion12(nativeNdx
                                    ,reload);
    return myReturn;
  }

  public int WireframeVersion(boolean reload)
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WireframeVersion64(reload), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WireframeVersion(boolean reload, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WireframeVersion(reload), throwIfTooBig);
  }

  public long WireframeFileSize64()
  {
    long myReturn = WireframeFileSize13(nativeNdx);
    return myReturn;
  }

  public int WireframeFileSize()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WireframeFileSize64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WireframeFileSize(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WireframeFileSize64(), throwIfTooBig);
  }

  public RescueTrimVertex TrimVertexLocatedBy(float x,
                                                float y,
                                                float z)
  {
    long returnNdx = TrimVertexLocatedBy14(nativeNdx
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
    long returnNdx = PolyLineBetween15(nativeNdx
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType16(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public RescuePolyLine NthRescuePolyLine(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescuePolyLine17(nativeNdx
                                        ,zeroBasedOrdinal);
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

  public RescueTrimVertex NthRescueTrimVertex(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueTrimVertex18(nativeNdx
                                          ,zeroBasedOrdinal);
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

  public RescueEdgeSet NthRescueEdgeSet(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueEdgeSet19(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public RescueTrimLoop NthRescueTrimLoop(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueTrimLoop20(nativeNdx
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

  public boolean DropRescuePolyLine(RescuePolyLine polyLineToDrop)
  {
    boolean myReturn = DropRescuePolyLine21(nativeNdx
                                             ,(polyLineToDrop == null) ? 0 : polyLineToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueTrimVertex(RescueTrimVertex trimVertexToDrop)
  {
    boolean myReturn = DropRescueTrimVertex22(nativeNdx
                                               ,(trimVertexToDrop == null) ? 0 : trimVertexToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueEdgeSet(RescueEdgeSet edgeSetToDrop)
  {
    boolean myReturn = DropRescueEdgeSet23(nativeNdx
                                            ,(edgeSetToDrop == null) ? 0 : edgeSetToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropRescueTrimLoop(RescueTrimLoop trimLoopToDrop)
  {
    boolean myReturn = DropRescueTrimLoop24(nativeNdx
                                             ,(trimLoopToDrop == null) ? 0 : trimLoopToDrop.nativeNdx);
    return myReturn;
  }

  public RescuePolyLine PolyLineIdentifiedBy(long identifier)
  {
    long returnNdx = PolyLineIdentifiedBy25(nativeNdx
                                           ,identifier);
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

  public RescueTrimVertex TrimVertexIdentifiedBy(long identifier)
  {
    long returnNdx = TrimVertexIdentifiedBy26(nativeNdx
                                             ,identifier);
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

  public RescueEdgeSet EdgeSetIdentifiedBy(long identifier)
  {
    long returnNdx = EdgeSetIdentifiedBy27(nativeNdx
                                          ,identifier);
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

  public RescueTrimLoop TrimLoopIdentifiedBy(long identifier)
  {
    long returnNdx = TrimLoopIdentifiedBy28(nativeNdx
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

  public boolean UnloadWireframe()
  {
    boolean myReturn = UnloadWireframe29(nativeNdx);
    return myReturn;
  }

  public boolean WireframeHasChanged()
  {
    boolean myReturn = WireframeHasChanged30(nativeNdx);
    return myReturn;
  }

  public long LoadNo64()
  {
    long myReturn = LoadNo31(nativeNdx);
    return myReturn;
  }

  public int LoadNo()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(LoadNo64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int LoadNo(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(LoadNo64(), throwIfTooBig);
  }

  public void MarkWireframeChanged()
  {
    MarkWireframeChanged32(nativeNdx);
  }

  public float X1()
  {
    float myReturn = X133(nativeNdx);
    return myReturn;
  }

  public float X2()
  {
    float myReturn = X234(nativeNdx);
    return myReturn;
  }

  public float X3()
  {
    float myReturn = X335(nativeNdx);
    return myReturn;
  }

  public float X4()
  {
    float myReturn = X436(nativeNdx);
    return myReturn;
  }

  public float Y1()
  {
    float myReturn = Y137(nativeNdx);
    return myReturn;
  }

  public float Y2()
  {
    float myReturn = Y238(nativeNdx);
    return myReturn;
  }

  public float Y3()
  {
    float myReturn = Y339(nativeNdx);
    return myReturn;
  }

  public float Y4()
  {
    float myReturn = Y440(nativeNdx);
    return myReturn;
  }

  public float Z1()
  {
    float myReturn = Z141(nativeNdx);
    return myReturn;
  }

  public float Z2()
  {
    float myReturn = Z242(nativeNdx);
    return myReturn;
  }

  private native void Delete_RescueWireframe(long ndx);
  private native long PolyLineCount1(long refNdx);
  private native long VertexCount2(long refNdx);
  private native long EdgeSetCount3(long refNdx);
  private native long TrimLoopCount4(long refNdx);
  private native long Owner5(long refNdx);
  private native boolean IsWireframeLoaded6(long refNdx);
  private native boolean LoadWireframe7(long refNdx);
  private native void DeleteWireframe8(long refNdx);
  private native boolean IsDeleted9(long refNdx);
  private native boolean WireframeFileTruncated10(long refNdx);
  private native long ParentModel11(long refNdx);
  private native long WireframeVersion12(long refNdx
                                       ,boolean reload);
  private native long WireframeFileSize13(long refNdx);
  private native long TrimVertexLocatedBy14(long refNdx
                                            ,float x
                                            ,float y
                                            ,float z);
  private native long PolyLineBetween15(long refNdx
                                        ,long end1
                                        ,long end2);
  private native boolean IsOfType16(long refNdx
                                   ,int thisType);
  private native long NthRescuePolyLine17(long refNdx
                                          ,long zeroBasedOrdinal);
  private native long NthRescueTrimVertex18(long refNdx
                                            ,long zeroBasedOrdinal);
  private native long NthRescueEdgeSet19(long refNdx
                                         ,long zeroBasedOrdinal);
  private native long NthRescueTrimLoop20(long refNdx
                                          ,long zeroBasedOrdinal);
  private native boolean DropRescuePolyLine21(long refNdx
                                             ,long polyLineToDrop);
  private native boolean DropRescueTrimVertex22(long refNdx
                                               ,long trimVertexToDrop);
  private native boolean DropRescueEdgeSet23(long refNdx
                                            ,long edgeSetToDrop);
  private native boolean DropRescueTrimLoop24(long refNdx
                                             ,long trimLoopToDrop);
  private native long PolyLineIdentifiedBy25(long refNdx
                                             ,long identifier);
  private native long TrimVertexIdentifiedBy26(long refNdx
                                               ,long identifier);
  private native long EdgeSetIdentifiedBy27(long refNdx
                                            ,long identifier);
  private native long TrimLoopIdentifiedBy28(long refNdx
                                             ,long identifier);
  private native boolean UnloadWireframe29(long refNdx);
  private native boolean WireframeHasChanged30(long refNdx);
  private native long LoadNo31(long refNdx);
  private native void MarkWireframeChanged32(long refNdx);
  private native float X133(long refNdx);
  private native float X234(long refNdx);
  private native float X335(long refNdx);
  private native float X436(long refNdx);
  private native float Y137(long refNdx);
  private native float Y238(long refNdx);
  private native float Y339(long refNdx);
  private native float Y440(long refNdx);
  private native float Z141(long refNdx);
  private native float Z242(long refNdx);
}
