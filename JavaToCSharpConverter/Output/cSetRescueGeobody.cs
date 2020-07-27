using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueGeobody : RjniBaseClass
{


  protected cSetRescueGeobody(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueGeobody()
  {
    nativeNdx = Create_cSetRescueGeobody0();
  }

  public void dispose()
  {
    Delete_cSetRescueGeobody(nativeNdx);
  }

  public void AddTo(RescueGeobody newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueGeobody existingObject)
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

  public RescueGeobody NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
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

  public RescueGeobody NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueGeobody ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
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

  public RescueGeobody ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
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

  public RescueGeobody ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy8(nativeNdx
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

  public RescueGeometry GeometryIdentifiedBy(int identifier)
  {
    return GeometryIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count9(nativeNdx);
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
    EmptySelf10(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink13(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated14(nativeNdx);
    return myReturn;
  }

}

}