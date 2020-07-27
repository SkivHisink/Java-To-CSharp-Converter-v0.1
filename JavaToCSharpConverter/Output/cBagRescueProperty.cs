using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueProperty : RjniBaseClass
{
  protected cBagRescueProperty(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueProperty()
  {
    nativeNdx = Create_cBagRescueProperty0();
  }

  public void dispose()
  {
    Delete_cBagRescueProperty(nativeNdx);
  }

  public void AddTo(RescueProperty newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueProperty existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueProperty NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
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

  public RescueProperty NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueProperty PropertyNamed(string name)
  {
    long returnNdx = PropertyNamed6(nativeNdx
                                    ,name);
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

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}