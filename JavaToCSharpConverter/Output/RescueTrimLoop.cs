using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTrimLoop : RescueObject
{


  protected RescueTrimLoop(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTrimLoop(RescueWireframeOwner wireframeIn,
                        string loopClassIn)
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

  public string LoopClass()
  {
    string myReturn = LoopClass5(nativeNdx);
    return myReturn;
  }

  public void SetLoopClass(string newClass)
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

  public int FaceHint(bool throwIfTooBig) //thro RuntimeException
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

  public int CountOfLoopEdge(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CountOfLoopEdge64(), throwIfTooBig);
  }

  public bool IsLoop(RescueModel model)
  {
    bool myReturn = IsLoop13(nativeNdx
                                 ,(model == null) ? 0 : model.nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType14(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}