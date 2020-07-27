using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueHorizon : RjniBaseClass
{


  protected cSetRescueHorizon(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueHorizon()
  {
    nativeNdx = Create_cSetRescueHorizon0();
  }

  public void dispose()
  {
    Delete_cSetRescueHorizon(nativeNdx);
  }

  public void AddTo(RescueHorizon newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueHorizon existingObject)
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

  public RescueHorizon NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueHorizon ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHorizon myReturn = new RescueHorizon(returnNdx);
      return myReturn;
    }
  }

  public RescueHorizon ObjectIdentifiedBy(int identifier)
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

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated13(nativeNdx);
    return myReturn;
  }

}

}