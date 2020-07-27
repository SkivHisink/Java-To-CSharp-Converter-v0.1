using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueGeobodyPart : RjniBaseClass
{


  protected cBagRescueGeobodyPart(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueGeobodyPart()
  {
    nativeNdx = Create_cBagRescueGeobodyPart0();
  }

  public void dispose()
  {
    Delete_cBagRescueGeobodyPart(nativeNdx);
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

  public RescueGeobodyPart NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
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

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
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

  public int Count(bool throwIfTooBig) //thro Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}