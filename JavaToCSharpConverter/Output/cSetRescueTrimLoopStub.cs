using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueTrimLoopStub : RjniBaseClass
{


  protected cSetRescueTrimLoopStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueTrimLoopStub()
  {
    nativeNdx = Create_cSetRescueTrimLoopStub0();
  }

  public void dispose()
  {
    Delete_cSetRescueTrimLoopStub(nativeNdx);
  }

  public void AddTo(RescueTrimLoopStub newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueTrimLoopStub existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public bool RemoveFrom(long ndx)
  {
    bool myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public bool RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueTrimLoopStub NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoopStub myReturn = new RescueTrimLoopStub(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoopStub NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueTrimLoopStub ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoopStub myReturn = new RescueTrimLoopStub(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoopStub ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoopStub myReturn = new RescueTrimLoopStub(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoopStub ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count8(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void EmptySelf()
  {
    EmptySelf9(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink12(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

}

}