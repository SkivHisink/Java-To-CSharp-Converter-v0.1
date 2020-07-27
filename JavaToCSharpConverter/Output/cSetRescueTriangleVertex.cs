using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueTriangleVertex : RjniBaseClass
{


  protected cSetRescueTriangleVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueTriangleVertex()
  {
    nativeNdx = Create_cSetRescueTriangleVertex0();
  }

  public void dispose()
  {
    Delete_cSetRescueTriangleVertex(nativeNdx);
  }

  public void AddTo(RescueTriangleVertex newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueTriangleVertex existingObject)
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

  public RescueTriangleVertex NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangleVertex NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
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
    EmptySelf7(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink10(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public long IndexOf(RescueTriangleVertex existingObject)
  {
    long myReturn = IndexOf11(nativeNdx
                           ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

}

}