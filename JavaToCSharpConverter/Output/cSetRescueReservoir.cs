using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueReservoir : RjniBaseClass
{


  protected cSetRescueReservoir(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueReservoir()
  {
    nativeNdx = Create_cSetRescueReservoir0();
  }

  public void dispose()
  {
    Delete_cSetRescueReservoir(nativeNdx);
  }

  public void AddTo(RescueReservoir newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueReservoir existingObject)
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

  public RescueReservoir NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReservoir myReturn = new RescueReservoir(returnNdx);
      return myReturn;
    }
  }

  public RescueReservoir NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueReservoir ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy6(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReservoir myReturn = new RescueReservoir(returnNdx);
      return myReturn;
    }
  }

  public RescueReservoir ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count7(nativeNdx);
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
    EmptySelf8(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink11(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

}

}