package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTrimLoop.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTrimLoop extends RescueObject
{


  protected RescueTrimLoop(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTrimLoop(RescueWireframeOwner wireframeIn,
                        java.lang.String loopClassIn)
  {
    nativeNdx = Create_RescueTrimLoop0((wireframeIn == null) ? 0 : wireframeIn.nativeNdx,
                                       loopClassIn);
  }

  public void dispose()
  {
    Delete_RescueTrimLoop(nativeNdx);
  }

  public RescueWireframe Owner()
  {
    long returnNdx = Owner2(nativeNdx);
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

  public RescueEdgeSet OwnerSet()
  {
    long returnNdx = OwnerSet3(nativeNdx);
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

  public RescueProperty OwnerProperty(RescueModel model)
  {
    long returnNdx = OwnerProperty4(nativeNdx
                                    ,(model == null) ? 0 : model.nativeNdx);
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

  public java.lang.String LoopClass()
  {
    java.lang.String myReturn = LoopClass5(nativeNdx);
    return myReturn;
  }

  public void SetLoopClass(java.lang.String newClass)
  {
    SetLoopClass6(nativeNdx
                 ,newClass);
  }

  public long FaceHint64()
  {
    long myReturn = FaceHint7(nativeNdx);
    return myReturn;
  }

  public int FaceHint()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceHint64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceHint(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceHint64(), throwIfTooBig);
  }

  public void SetFaceHint(long hint)
  {
    SetFaceHint8(nativeNdx
                ,hint);
  }

  public void AddLoopEdge(RescueTrimEdge existingEdge)
  {
    AddLoopEdge9(nativeNdx
                ,(existingEdge == null) ? 0 : existingEdge.nativeNdx);
  }

  public void DropLoopEdge(RescueTrimEdge existingEdge)
  {
    DropLoopEdge10(nativeNdx
                 ,(existingEdge == null) ? 0 : existingEdge.nativeNdx);
  }

  public RescueTrimEdge NthLoopEdge(long zeroBasedOrdinal)
  {
    long returnNdx = NthLoopEdge11(nativeNdx
                                  ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimEdge myReturn = new RescueTrimEdge(returnNdx);
      return myReturn;
    }
  }

  public long CountOfLoopEdge64()
  {
    long myReturn = CountOfLoopEdge12(nativeNdx);
    return myReturn;
  }

  public int CountOfLoopEdge()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CountOfLoopEdge64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CountOfLoopEdge(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CountOfLoopEdge64(), throwIfTooBig);
  }

  public boolean IsLoop(RescueModel model)
  {
    boolean myReturn = IsLoop13(nativeNdx
                                 ,(model == null) ? 0 : model.nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType14(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueTrimLoop0(long wireframeIn,
                                            java.lang.String loopClassIn);
  private native void Delete_RescueTrimLoop(long ndx);
  private native long Owner2(long refNdx);
  private native long OwnerSet3(long refNdx);
  private native long OwnerProperty4(long refNdx
                                     ,long model);
  private native java.lang.String LoopClass5(long refNdx);
  private native void SetLoopClass6(long refNdx
                                   ,java.lang.String newClass);
  private native long FaceHint7(long refNdx);
  private native void SetFaceHint8(long refNdx
                                  ,long hint);
  private native void AddLoopEdge9(long refNdx
                                  ,long existingEdge);
  private native void DropLoopEdge10(long refNdx
                                    ,long existingEdge);
  private native long NthLoopEdge11(long refNdx
                                    ,long zeroBasedOrdinal);
  private native long CountOfLoopEdge12(long refNdx);
  private native boolean IsLoop13(long refNdx
                                 ,long model);
  private native boolean IsOfType14(long refNdx
                                   ,int thisType);
}
