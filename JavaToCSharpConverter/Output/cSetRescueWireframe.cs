using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueWireframe : RjniBaseClass
{


  protected cSetRescueWireframe(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueWireframe()
  {
    nativeNdx = Create_cSetRescueWireframe0();
  }

  public void dispose()
  {
    Delete_cSetRescueWireframe(nativeNdx);
  }

  public void AddTo(RescueWireframe newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueWireframe existingObject)
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

  public RescueWireframe NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
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

  public RescueWireframe NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueWireframe ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
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

  public RescueWireframe ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
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

  public RescueWireframe ObjectIdentifiedBy(int identifier)
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

  public void UnloadWireframe()
  {
    UnloadWireframe12(nativeNdx);
  }

  public void CopyWireframeData(string oldPathName)
  {
    CopyWireframeData13(nativeNdx
                      ,oldPathName);
  }

  public void DropWireframeMemory()
  {
    DropWireframeMemory14(nativeNdx);
  }

  public void UpdateWireframeData()
  {
    UpdateWireframeData15(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink16(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated17(nativeNdx);
    return myReturn;
  }

}

}