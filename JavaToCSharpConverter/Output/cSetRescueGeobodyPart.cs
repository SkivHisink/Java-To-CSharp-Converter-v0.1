using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueGeobodyPart : RjniBaseClass
{


  protected cSetRescueGeobodyPart(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueGeobodyPart()
  {
    nativeNdx = Create_cSetRescueGeobodyPart0();
  }

  public void dispose()
  {
    Delete_cSetRescueGeobodyPart(nativeNdx);
  }

  public void AddTo(RescueGeobodyPart newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueGeobodyPart existingObject)
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

  public RescueGeobodyPart NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
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

  public RescueGeobodyPart NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueGeobodyPart ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
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

  public RescueGeobodyPart ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
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

  public RescueGeobodyPart ObjectIdentifiedBy(int identifier)
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

  public void DropWireframeMemory()
  {
    DropWireframeMemory14(nativeNdx);
  }

  public void RelinkWireframeData(RescueObject parent)
  {
    RelinkWireframeData16(nativeNdx
                        ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated18(nativeNdx);
    return myReturn;
  }

}

}